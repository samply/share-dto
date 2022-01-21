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

## License
       
Copyright 2020 - 2021 The Samply Community
       
Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
       
http://www.apache.org/licenses/LICENSE-2.0
       
Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
