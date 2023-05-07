package com.BankSystem.demo.Controller;

import com.BankSystem.demo.Slack.SlackClient;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value="general")
@RestController
public class GeneralController {

    SlackClient slackClient;

    @GetMapping(value = "test")
    @PreAuthorize("hasRole('USER')")
    public String test(){
        return "${spring.profiles.active}";
    }
//    @@ -21,4 +23,10 @@ public String test(){
//        public void message(@RequestParam String text){
//            slackClient.sendMessage(text);
//        }

        @GetMapping("/admin")
        @PreAuthorize("hasRole('ADMIN')")
        public String adminOnly() {
            return "You are an admin!";
        }
}
