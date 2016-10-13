public class Hello {
  static {
      System.load("/home/alvar/devel/jni/c/hello.so");
  }
  public static native void sayHello();
}
