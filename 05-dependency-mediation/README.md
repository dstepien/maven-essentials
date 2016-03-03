# Dependency Mediation and Management

Let's look for dependency tree:

```
$ mvn dependency:tree
[INFO] Scanning for projects...
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building maven-dependency-mediation 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-dependency-plugin:2.1:tree (default-cli) @ maven-dependency-mediation ---
[INFO] pl.dawidstepien.maven:maven-dependency-mediation:jar:1.0-SNAPSHOT
[INFO] +- pl.dawidstepien.maven.dependency:A:jar:1.0.0:compile
[INFO] +- pl.dawidstepien.maven.dependency:B:jar:2.0.0:compile
[INFO] |  \- pl.dawidstepien.maven.dependency:E:jar:2.5.0:compile
[INFO] |     \- pl.dawidstepien.maven.dependency:H:jar:2.8.0:compile
[INFO] +- pl.dawidstepien.maven.dependency:C:jar:3.0.0:compile
[INFO] \- pl.dawidstepien.maven.dependency:D:jar:4.0.0:compile
[INFO]    +- pl.dawidstepien.maven.dependency:F:jar:3.2.0:compile
[INFO]    |  \- pl.dawidstepien.maven.dependency:I:jar:3.8.1:compile
[INFO]    \- pl.dawidstepien.maven.dependency:G:jar:1.5.0:compile
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 0.761s
[INFO] Finished at: Thu Mar 03 12:46:49 CET 2016
[INFO] Final Memory: 8M/173M
[INFO] ------------------------------------------------------------------------
```

In this example we force to use F:4.9.0 and H:5.2.1 transitive dependencies.