# Spring Boot Profiles Example

This project demonstrates how to use **Spring Boot Profiles** to manage environment-specific configurations (e.g., development, testing, and production).

**=> Profiles <=**

- They allows us to seperate parts of application configuration and make it only available in  certain environments
- It's like having different settings for our application depending upon the situation.
- For ex, we might need one set of settings for dev, one for testing and yet another for production.
- It's like having different playlists in our music app- one for working out, one for relaxing etc.
- Each playlist sets a different mood just like each profile sets up a different environment.

## 🚀 Features

- Environment-specific configuration using profiles
- Dynamic port assignment per environment
- RESTful controller to expose environment info
- Easy profile switching via `application.properties`

## 📁 Project Structure

src/ └── main/ └── java/ 
   └── com.sree.SpringprofilesExample/ 
src/ └── main/ └── java/ └── controller/
└── ProfilesController.java 
src/ └── main/└── resources/ 
├── application.properties 
├── application-dev.properties 
└── application-test.properties

**=> Define Default Configuration**
In application.properties:
```java
server.port=8080
spring.application.name=SpringProfileExample
my.prop=Default Value
```
**=> Create Controller**
In _ProfilesController.java_:
```java
@RestController
@RequestMapping("/")
public class ProfilesController {

    @Value("${spring.application.name}")
    private String myWebsiteName;

    @GetMapping("get")
    public String welcome() {
        return "Welcome to " + myWebsiteName;
    }
}
```
**=> Create Profile-Specific Configs:**
_application-dev.properties_
```java
server.port=8081
spring.application.name=SpringProfileExample for Dev env
my.prop=Dev Value
```
_application-test.properties_
```java
server.port=8082
spring.application.name=SpringProfileExample for Test env
my.prop=Test Value

```
**=> Activate a Profile in application.properties file**
```java
spring.profiles.active=dev
```
**Run the Application**
Access the app at _http://localhost:8081/_ (if dev is active)

Switch between profiles by changing spring.profiles.active

**🧪 Testing**
Change the active profile to test and access http://localhost:8082/ to verify behavior.

**📌 Notes**
If no profile is specified, Spring Boot uses the default configuration.
Each profile config file overrides the default properties for its specific environment.
