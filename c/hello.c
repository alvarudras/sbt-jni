#include "Hello.h"
#include <stdio.h>

JNIEXPORT void JNICALL Java_Hello_sayHello
  (JNIEnv *e, jobject j) {
  printf("Hello\n");
}
