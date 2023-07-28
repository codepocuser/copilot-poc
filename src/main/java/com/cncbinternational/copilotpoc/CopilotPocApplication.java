package com.cncbinternational.copilotpoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={
        "com.cncbinternational.copilotpoc.*"})
public class CopilotPocApplication {

    public static void main(String[] args) {
        SpringApplication.run(CopilotPocApplication.class, args);
    }

}
