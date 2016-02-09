package pl.dawidstepien.maven.elementary;

import java.net.URL;
import java.net.URLClassLoader;

public class Main {

  public static void main(String[] args) {
    showClasspath();
  }

  public static void showClasspath() {
    ClassLoader classLoader = ClassLoader.getSystemClassLoader();

    URL[] urls = ((URLClassLoader) classLoader).getURLs();

    for(URL url : urls) {
      System.out.println(url.getFile());
    }
  }
}
