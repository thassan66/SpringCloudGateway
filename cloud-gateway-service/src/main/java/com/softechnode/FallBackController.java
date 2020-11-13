package com.softechnode;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*

 * author: Taimoor Hassan
 * 11/3/2020 9:54 PM
 * com.softechnode
 */
@RestController
//@RequestMapping("/fallback")
public class FallBackController {
    @GetMapping("/adaptorFallBack")
    @HystrixCommand(fallbackMethod = "adaptorFallBack")
    public String adaptorServiceFallback() {
        return "Adaptor Service is not responding! Please try after some time.";
    }

    @GetMapping("/ruleFallBack")
    public String ruleServiceFallback() {
        return "Rule Service overloaded! Please try after some time.";
    }

    @GetMapping("/rmsFallBack")
    public String rmsServiceFallback() {
        return "RMS Service overloaded! Please try after some time.";
    }

}
