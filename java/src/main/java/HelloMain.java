import java.net.URLClassLoader;
import java.net.URL;
import java.lang.reflect.Method;

public class HelloMain {
  public static void withClassLoader() {
    try {
      URL url = new URL("file:///home/alvar/devel/jni/java/target/scala-2.10/classes/");
      URL[] urlArray = {url};
      URLClassLoader classLoader = new URLClassLoader(urlArray);
      Class helloClass = classLoader.loadClass("Hello");
      Method helloMethod = helloClass.getMethod("sayHello");
      helloMethod.invoke(null);
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void withoutClassLoader() {
    Hello.sayHello();
  }
  public static void main(String[] args) {
    //withClassLoader();
    withoutClassLoader();
    System.gc();
  }
}
