package com.chhai.springsecuritybasic.controller;

import com.chhai.springsecuritybasic.service.MailingService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class MailingRestController {
    private final MailingService mailingService;
    MailingRestController(MailingService mailingService){
        this.mailingService = mailingService;
    }

    @PostMapping("/sendingmail")
    public String sendMail(){
        try {
            mailingService.sendMail("vichhai212803@gmail.com","This is me","Hello");
            return "Successfully to send mail";
        }catch (Exception ex){
            return "Fail to send mail";
        }
    }
}
