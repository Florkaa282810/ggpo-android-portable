#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_ggpo_portable_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "GGPO Portable Native Core Active";
    return env->NewStringUTF(hello.c_str());
}
