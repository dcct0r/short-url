## 🔗Web service short url

|Original link| Shortened url|
|-----------|--------|
 ![](https://github.com/dcct0r/short-url/assets/111187206/f11522ab-cbbe-4b51-bca1-a5179cbf8c78) | ![image](https://github.com/dcct0r/short-url/assets/111187206/2fa26ce9-3e53-4e64-98e0-c5fb6a1a843c)


### 👉 Endpoints
- Copy the generated link and paste it to go to the original link
```
/{shortUrl}
```

## Required dependecies
```gradle
dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-web'
    implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
    implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'
    implementation 'org.springframework.boot:spring-boot-starter-tomcat:3.1.3'
    implementation 'org.springframework.boot:spring-boot-starter-jdbc:3.1.3'
    implementation 'org.postgresql:postgresql:42.5.4'
    implementation 'org.apache.commons:commons-lang3:3.12.0'
    implementation 'com.google.guava:guava:32.1.2-jre'
    compileOnly 'org.projectlombok:lombok'
    runtimeOnly 'org.postgresql:postgresql'
    annotationProcessor 'org.projectlombok:lombok'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
}
```
