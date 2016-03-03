# Pom Profiles

Running without profile:

```
$ mvn clean
[INFO] Scanning for projects...
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building maven-pom-profile 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.4.1:clean (default-clean) @ maven-pom-profile ---
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 0.219s
[INFO] Finished at: Thu Mar 03 12:37:02 CET 2016
[INFO] Final Memory: 5M/143M
[INFO] ------------------------------------------------------------------------
```

```
$ mvn dependency:tree
[INFO] Scanning for projects...
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building maven-pom-profile 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-dependency-plugin:2.1:tree (default-cli) @ maven-pom-profile ---
[INFO] pl.dawidstepien.maven:maven-pom-profile:jar:1.0-SNAPSHOT
[INFO] \- junit:junit:jar:4.12:compile
[INFO]    \- org.hamcrest:hamcrest-core:jar:1.3:compile
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 1.873s
[INFO] Finished at: Thu Mar 03 12:38:39 CET 2016
[INFO] Final Memory: 8M/173M
[INFO] ------------------------------------------------------------------------
```

Running with myProfile1:

```
$ mvn clean -PmyProfile1
[INFO] Scanning for projects...
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building maven-pom-profile 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:3.0.0:clean (default-clean) @ maven-pom-profile ---
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 1.046s
[INFO] Finished at: Thu Mar 03 12:41:48 CET 2016
[INFO] Final Memory: 5M/154M
[INFO] ------------------------------------------------------------------------
```

```
$ mvn dependency:tree -PmyProfile1
[INFO] Scanning for projects...
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building maven-pom-profile 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-dependency-plugin:2.1:tree (default-cli) @ maven-pom-profile ---
[INFO] pl.dawidstepien.maven:maven-pom-profile:jar:1.0-SNAPSHOT
[INFO] \- junit:junit:jar:4.10:compile
[INFO]    \- org.hamcrest:hamcrest-core:jar:1.1:compile
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 0.739s
[INFO] Finished at: Thu Mar 03 12:40:04 CET 2016
[INFO] Final Memory: 8M/173M
[INFO] ------------------------------------------------------------------------
```

Running with myProfile2:

```
$ mvn dependency:tree -PmyProfile2
[INFO] Scanning for projects...
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building maven-pom-profile 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-dependency-plugin:2.1:tree (default-cli) @ maven-pom-profile ---
[INFO] pl.dawidstepien.maven:maven-pom-profile:jar:1.0-SNAPSHOT
[INFO] \- junit:junit:jar:3.8.2:compile
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 0.648s
[INFO] Finished at: Thu Mar 03 12:42:41 CET 2016
[INFO] Final Memory: 8M/173M
[INFO] ------------------------------------------------------------------------
```

Running with both profiles:

```
$ mvn dependency:tree -PmyProfile1,myProfile2
[INFO] Scanning for projects...
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building maven-pom-profile 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-dependency-plugin:2.1:tree (default-cli) @ maven-pom-profile ---
[INFO] pl.dawidstepien.maven:maven-pom-profile:jar:1.0-SNAPSHOT
[INFO] \- junit:junit:jar:3.8.2:compile
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 0.625s
[INFO] Finished at: Thu Mar 03 12:43:05 CET 2016
[INFO] Final Memory: 8M/173M
[INFO] ------------------------------------------------------------------------
```

```
$ mvn clean -PmyProfile1,myProfile2
[INFO] Scanning for projects...
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building maven-pom-profile 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:3.0.0:clean (default-clean) @ maven-pom-profile ---
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 0.282s
[INFO] Finished at: Thu Mar 03 12:44:14 CET 2016
[INFO] Final Memory: 5M/155M
[INFO] ------------------------------------------------------------------------
```