# Elementary example

If you never use maven before, the good starting point is to resolve dependencies:

```
$ mvn dependency:resolve
```

This goal uses `maven-dependency-plugin` to download all dependencies needed by our project.

```
$ mvn clean
```

Here we start the phase `clean` in lifecycle with the same name. The phase is bound to the goal `clean:clean`. Maven's output is very simple because
we don't have anything to clean.

```
[INFO] Scanning for projects...
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building maven-elementary 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ maven-elementary ---
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 0.195 s
[INFO] Finished at: 2016-01-20T16:30:02+01:00
[INFO] Final Memory: 6M/119M
[INFO] ------------------------------------------------------------------------
```

Let's build the project with default lifecycle:

```
$ mvn install
```

Maven walk through all default lifecycle phases and execute all bounded goals:

| process-resources      | resources:resources     |
|------------------------|-------------------------|
| compile                | compiler:compile        |
| process-test-resources | resources:testResources |
| test-compile           | compiler:testCompile    |
| test                   | surefire:test           |
| package                | jar:jar                 |
| install                | install:install         |

The output represents all steps Maven took up to the phase we pointed to:

```
[INFO] Scanning for projects...
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building maven-elementary 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ maven-elementary ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/dstepien/projects/maven-essentials/01-elementary/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ maven-elementary ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /home/dstepien/projects/maven-essentials/01-elementary/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ maven-elementary ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/dstepien/projects/maven-essentials/01-elementary/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ maven-elementary ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /home/dstepien/projects/maven-essentials/01-elementary/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ maven-elementary ---
[INFO] Surefire report directory: /home/dstepien/projects/maven-essentials/01-elementary/target/surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running pl.dawidstepien.maven.elementary.CalculatorTest
Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.057 sec

Results :

Tests run: 4, Failures: 0, Errors: 0, Skipped: 0

[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ maven-elementary ---
[INFO] Building jar: /home/dstepien/projects/maven-essentials/01-elementary/target/maven-elementary-1.0-SNAPSHOT.jar
[INFO] 
[INFO] --- maven-install-plugin:2.4:install (default-install) @ maven-elementary ---
[INFO] Installing /home/dstepien/projects/maven-essentials/01-elementary/target/maven-elementary-1.0-SNAPSHOT.jar to /home/dstepien/.m2/repository/pl/dawidstepien/maven/maven-elementary/1.0-SNAPSHOT/maven-elementary-1.0-SNAPSHOT.jar
[INFO] Installing /home/dstepien/projects/maven-essentials/01-elementary/pom.xml to /home/dstepien/.m2/repository/pl/dawidstepien/maven/maven-elementary/1.0-SNAPSHOT/maven-elementary-1.0-SNAPSHOT.pom
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 1.831 s
[INFO] Finished at: 2016-01-20T17:00:51+01:00
[INFO] Final Memory: 16M/158M
[INFO] ------------------------------------------------------------------------
```

To show dependency tree we can use `maven-dependency-plugin`:

```
$ mvn dependency:tree 
[INFO] Scanning for projects...
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building maven-elementary 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-dependency-plugin:2.8:tree (default-cli) @ maven-elementary ---
[INFO] pl.dawidstepien.maven:maven-elementary:jar:1.0-SNAPSHOT
[INFO] \- junit:junit:jar:4.12:compile
[INFO]    \- org.hamcrest:hamcrest-core:jar:1.3:compile
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 0.758 s
[INFO] Finished at: 2016-01-20T16:49:24+01:00
[INFO] Final Memory: 12M/150M
[INFO] ------------------------------------------------------------------------
```