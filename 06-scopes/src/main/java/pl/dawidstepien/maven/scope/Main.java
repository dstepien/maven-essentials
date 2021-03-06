package pl.dawidstepien.maven.scope;

import java.net.URL;
import java.net.URLClassLoader;

public class Main {

  public static void main(String[] args) {
    
    showClasspath();
  }

  public static void showClasspath() {
    ClassLoader classLoader = ClassLoader.getSystemClassLoader();
    for(URL url : ((URLClassLoader) classLoader).getURLs()) {
      System.out.println(url.getFile());
    }
  }
}
