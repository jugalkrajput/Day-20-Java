📘 Day 20 – Spring Boot Introduction
=========================================

✅ What I learned today

1. What is Spring Boot?
   ---------------------

- Framework that makes Spring configuration automatic
 
- Has Embedded Tomcat – run without external server

- Uses Starter Dependencies – no manual version management


2. Main Annotations
   -----------------

@SpringBootApplication – Main entry point (Combines @Configuration, @EnableAutoConfiguration, @ComponentScan)

code
-----

@SpringBootApplication

public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);

    }

}

- @RestController – Marks class as REST API controller

- @GetMapping("/path") – Maps GET request to method

code
----

@RestController

public class HelloController {

    @GetMapping("/hello")

    public String sayHello() { return "Hello"; }

}


3. Returning JSON
   ---------------
@RestController automatically converts object to JSON using Jackson.

code
-----

@GetMapping("/user")

public User getUser() { return new User("Rahul", 28); }

// Returns: {"name":"Rahul","age":28}


4. Reading URL Data
   -------------------

- Path Variable: @GetMapping("/greet/{name}") → @PathVariable String name

- Query Param: @GetMapping("/welcome") → @RequestParam String name


5. Practice Task: Time API
   -----------------------

code
-----

@GetMapping("/time")

public String time() { return LocalDateTime.now().toString(); }
