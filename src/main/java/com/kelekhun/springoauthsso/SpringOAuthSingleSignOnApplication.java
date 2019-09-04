package com.kelekhun.springoauthsso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@EnableOAuth2Sso
@SpringBootApplication
public class SpringOAuthSingleSignOnApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringOAuthSingleSignOnApplication.class, args);
    }

}
