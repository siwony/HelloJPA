# HelloJPA
[자바 ORM 표준 JPA 프로그래밍 - 기본편](https://www.inflearn.com/course/ORM-JPA-Basic) 강의 중에서 실습파트를 올린 repo입니다.  
siwony/TIL 과 연관이 있는 repo 입니다. [링크](https://github.com/siwony/TIL/tree/main/BE/Spring/JPA)

### Using Stack
- IntelliJ IDEA Ultimate
- Java11/Maven
- hibernate 5.3.10.Final
- h2database 1.4.199
- lombok 1.18.12

### java11 hibernate error fix
`pom.xml`에 다음과 같이 추가한다.
```xml
<dependency>
    <groupId>javax.xml.bind</groupId>
    <artifactId>jaxb-api</artifactId>
    <version>2.3.0</version>
</dependency>
```

### 목차
1. [요구사항 분석과 기본 매핑 (DB 주도설계 의 문제점)](https://github.com/siwony/HelloJPA/tree/dbDrivenDesign_01)
2. [연관관계 매핑 시작](https://github.com/siwony/HelloJPA/tree/basicMapping_02)
3. [다양한 연관관계 매핑](https://github.com/siwony/HelloJPA/tree/variousRelationshipMapping_03)
4. [상속관계 매핑](https://github.com/siwony/HelloJPA/tree/inheritMapping_04)
5. [연관관계 관리]()
6. [값 타입 매핑]()