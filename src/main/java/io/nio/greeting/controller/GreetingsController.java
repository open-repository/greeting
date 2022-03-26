package io.nio.greeting.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api" , produces="application/json")

public class GreetingsController {

    @GetMapping(value = "/" ,produces="application/json")
    public String genericGreeting() {
        return "Hello dear visitor !!! Good Day";

    }

    @GetMapping(value ="/{userName}" , produces="application/json")

    public String targettedGreeting(@PathVariable String userName) {
        return "Hello dear "+userName+" !!! Good Day";
    }

}
