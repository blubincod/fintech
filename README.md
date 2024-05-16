[ERROR] com.mysql.cj.jdbc.Driver 해결

상태: Docker 위의 Mysql DB `fintech-mysql`과 연결 불가능.

1. `build.gradle.kts (fintech)` - `dependencies`에 아래 구문 추가

```kotlin
        implementation("org.springframework.boot:spring-boot-starter")
        runtimeOnly("com.mysql:mysql-connector-j")
        testImplementation("org.springframework.boot:spring-boot-starter-test")
```

2. `application.yml`에 아래 구문 추가

spring.mvc.pathmatch.matching-strategy=ant_path_matcher

> SpringBoot V2.6 이상에서 변경된 path_pattern_parser를 ant_path_matcher로 변경.  