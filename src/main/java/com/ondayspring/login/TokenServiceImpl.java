package com.ondayspring.login;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.ondayspring.common.workinglist.Constants;
import org.springframework.stereotype.Service;
import java.util.Date;

@Service("TokenService")
public class TokenServiceImpl implements TokenService{

    @Override
    public String createToken(UserBasicVO uservo) {
        String token;

        System.out.println("TokenServiceImpl ------------");

        String issure = Constants.Token.ISSURE;
        String subject = Constants.Token.SUBJECT;
        Date expireDate = new Date(System.currentTimeMillis()+(60*1000*60));

        Algorithm algorithm = Algorithm.HMAC256(Constants.Token.SECRET_KEY);
        token = JWT.create().withIssuer(issure).withSubject(subject).withAudience(uservo.getUserId()).withClaim("userName", uservo.getUserName()).withExpiresAt(expireDate).sign(algorithm);

        return token;
    }
}
