-----------
JsonUtil
-----------
* mvn archetype:generate -DgroupId=com.mk -DartifactId=JsonUtil -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
* https://github.com/FasterXML/jackson-databind
* http://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core
* http://wiki.fasterxml.com/JacksonInFiveMinutes
```xml
  <properties>
	<!-- Use the latest version whenever possible. -->
	<jackson.version>2.7.0</jackson.version>
  </properties>

 <dependencies>
        <dependency>
    		<groupId>com.fasterxml.jackson.core</groupId>
    		<artifactId>jackson-annotations</artifactId>
    		<version>${jackson.version}</version>
    	</dependency>
    	
    	<dependency>
    	    <groupId>com.fasterxml.jackson.core</groupId>
    	    <artifactId>jackson-databind</artifactId>
    	    <version>${jackson.version}</version>
      	</dependency>
        
    	<dependency>
    		<groupId>com.fasterxml.jackson.core</groupId>
    	    <artifactId>jackson-core</artifactId>
    	    <version>${jackson.version}</version>
    	</dependency>
 </dependencies>
```

