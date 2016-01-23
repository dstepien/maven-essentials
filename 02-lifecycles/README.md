# Phases

In this example I modified a maven default lifecycle. I bound the `clean:clean` goal to the `validate` phase. When you type:

```
$ mvn install
```

You will see `maven-clean-plugin` execution at the beginning of the output. It's because the `validate` phase is the first phase
executed in the default lifecycle.

```
[INFO] Scanning for projects...
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building maven-phases 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:3.0.0:clean (default) @ maven-lifecycles ---
[INFO] 
[INFO] --- maven-resources-plugin:2.5:resources (default-resources) @ maven-lifecycles---
[debug] execute contextualize
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 0 resource
[INFO] 
[INFO] --- maven-compiler-plugin:2.3.2:compile (default-compile) @ maven-lifecycles ---
[INFO] Nothing to compile - all classes are up to date
...
```