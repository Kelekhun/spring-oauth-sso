package com.kelekhun.springoauthsso.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class SpringOauth2ssoController {
    @RequestMapping(name = "/login", method = RequestMethod.GET)
    public String getGitUserName(Principal principal){
        return "Hello, " + principal.getName()+ ", OAuth2 Successful...";
    }
}
