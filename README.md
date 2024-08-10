# spring-boot-observability


## Actuator:



## Helpful documents

- Spring official guide to implement Actuator for production : https://docs.spring.io/spring-boot/reference/actuator/index.html
-


## Part 1 : Project Setup

1. Spring Initializer : https://start.spring.io/
2. Dependency: `web`, `actuator`, `lombok`

   <details>
       <summary>  gradle  </summary>

   ```properties
   implementation 'org.springframework.boot:spring-boot-starter-actuator'
   implementation 'org.springframework.boot:spring-boot-starter-web'
   compileOnly 'org.projectlombok:lombok'
   annotationProcessor 'org.projectlombok:lombok'
   ```
   </details>

   <details>
       <summary>  maven  </summary>

   ```properties
     <dependencies>
       <dependency>
         <groupId>org.springframework.boot</groupId>
         <artifactId>spring-boot-starter-actuator</artifactId>
       </dependency>
       <dependency>
         <groupId>org.springframework.boot</groupId>
         <artifactId>spring-boot-starter-web</artifactId>
       </dependency>
   
       <dependency>
         <groupId>org.projectlombok</groupId>
         <artifactId>lombok</artifactId>
         <optional>true</optional>
       </dependency>
       <dependency>
         <groupId>org.springframework.boot</groupId>
         <artifactId>spring-boot-starter-test</artifactId>
         <scope>test</scope>
       </dependency>
     </dependencies>
   ```
   </details>

## Part 2: Actuator Rest API

Document: https://docs.spring.io/spring-boot/api/rest/actuator/index.html
1. Start the Application :

    + By default **/actuator** endpoint is exposed
      ![defaultActuatorEndpoint.png](src/main/resources/static/defaultActuatorEndpoint.png)

    + Default Endpoint, but it will not give us detailed information
      ![defaultEndpoint.png](src/main/resources/static/defaultEndpoint.png)

2. **Expose** the actuator endpoints

    + Expose Specific endpoints
   ```properties
   management:
     endpoints:
       web:
         exposure:
           include: health, info
   ```
    + Expose All the available endpoints
   ```properties
      management:
        endpoints:
          web:
            exposure:
              include: * 
   ```

3. Show details about the endpoint

    + health endpoint
      ![beforeEnablingHealth.png](src/main/resources/static/beforeEnablingHealth.png)

      Now as the endpoints are exposed, we will have to configure to show the details
   ```properties
   management:
     endpoints:
       web:
         exposure:
           # Enable all the endpoints
           include: '*'
           # Enable specific endpoints
           #include: health
           
     endpoint:
       health:
         show-details: always
   ```
   ![AfterEnableOfHealth.png](src/main/resources/static/AfterEnableOfHealth.png)

    + **bean** endpoint

   Let's add some dummy controller and service file
   ```java
   @RestController
   @RequestMapping("/api")
   @RequiredArgsConstructor
   public class DummyController {

    private final DummyService dummyService;
    @GetMapping("/base")
    public ResponseEntity<String> getBase() {
        return ResponseEntity.ok(dummyService.sayHello());
    }
   }
   ```

   ```java
   @Service
   public class DummyService {
   
       public String sayHello() {return "Hello World!";}
   }
   ```
   Now let's start the application and go to : "http://localhost:8080/actuator/beans"
   ![dummyControllerBean.png](src/main/resources/static/dummyControllerBean.png)

## Add custom Endpoint for Actuator

Sometimes, you may need some specific informaiton like version of specific file, configuraiton of the application, in those scenerios you can use it.
Steps
+ Create a controller class**
+
## Interview Questions

1. <details>
    <summary>  What is Actuator ?  </summary>

    + Actuator endpoints let us **monitor and interact** with the application.
    + Base bath : `/actuator/{id}` e.g. /actuator/health
   </details>

2. <details>
       <summary> Can we have custom base path for actuator? If so how?  </summary>

      ```properties
      management.endpoints.web.base-path=/manage
      ```
       Using the above will change the base path to `/manage/{id}`
      </details>

3. <details>
    <summary>  How Actuator Endpoints are made available ?  </summary>

   We need to **enable and expose** them(to make them remotely accessible) over HTTP or JMX.

   ```properties
         management:
           endpoints:
             web:
               exposure:
                 # Expose all the endpoints
                 include: *
                # Expose only specific 
                # include: health 
   ```
   </details>


2.


````