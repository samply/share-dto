# Samply Share DTO

This library offers data transfer objects for Samply Share Broker/Client and
Samply Store REST.


## Build

Use maven to build the jar:

```
mvn clean package
```

Use maven to generate the Java classes:

```
mvn jaxb2:generate
```

Use it as a dependency:

```xml
<dependency>
    <groupId>de.samply</groupId>
    <artifactId>share-dto</artifactId>
    <version>VERSION</version>
</dependency>
```
