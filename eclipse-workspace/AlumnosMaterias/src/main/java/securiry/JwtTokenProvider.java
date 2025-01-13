package securiry;

import java.util.Date;

@Component

public class JwtTokenProvider {
	
	@Value("${jwt.secret}")
	
	private String jwtSecret;
	
	@Value("${jwt.expiration}")
	
	private long jwtExpirationMs;
	
	
	public String generateToken(Authentication authentication) {
		String username = authentication.getName();
		Date now = new Date ();
		Date expiryDate = new Date (now.getTime() + jwtExpirationMs);
		
		return Jwts.builder()
				.setSubject(username)
				.setIssuedAt(now)
				.setExpiration(expiryDate)
				.signWith(SignatureAlgorithm.HS512, jwtSecret)
				.compact();
		
	}
	
	public String getUsernameFromToken(String token) {
		return Jwts.parser()
				.setSigningKey(jwtSecret)
				.parseClaimsJws(token)
				.getBody()
				.getSubject();
		
	}
	
	public boolean validateToken(String token) {
		try {
			Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token);
			return true;
		} catch (MalformedJwtException | ExpiredJwtException | UnsupportedJwtException | IllegalArgumentException ex) {
			System.out.print("JWT invalido: " + ex.getMessage());
			return false;
		}
	}

}
