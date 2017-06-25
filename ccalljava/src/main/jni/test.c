#include "com_lhd_ccalljava_JNIS.h"
//1. 加载类得到jclass对象:
//jclass (*FindClass)(JNIEnv*, const char*);
//2. 得到对应方法的Method对象 : GetMethodId()
//jmethodID (*GetMethodID)(JNIEnv*, jclass, const char*, const char*)
//3. 创建类对象
//jobject (*AllocObject)(JNIEnv*, jclass);
//4. 调用方法(无返回值)
//void (*CallVoidMethod)(JNIEnv*, jobject, jmethodID, ...)

void  Java_com_lhd_ccalljava_JNIS_callbackHelloFromJava
(JNIEnv * env, jobject obj)
{
    //1. 加载类得到jclass对象:
//jclass (*FindClass)(JNIEnv*, const char*);
   jclass class= (*env)->FindClass(env,"com/lhd/ccalljava/JNIS");
//2. 得到对应方法的Method对象 : GetMethodId()
//jmethodID (*GetMethodID)(JNIEnv*, jclass, const char*, const char*)
   jmethodID methodId = (*env)->GetMethodID(env,class,"helloFromJava","()V");
//3. 创建类对象
//jobject (*AllocObject)(JNIEnv*, jclass);
//   jobject object = (*env)->AllocObject(env, class);
//4. 调用方法(无返回值)
//void (*CallVoidMethod)(JNIEnv*, jobject, jmethodID, ...)
   (*env)->CallVoidMethod(env,obj,methodId);
}

JNIEXPORT void JNICALL Java_com_lhd_ccalljava_JNIS_callbackAdd
        (JNIEnv *env, jobject obj){
   //1. 加载类得到jclass对象:
//jclass (*FindClass)(JNIEnv*, const char*);
   jclass class= (*env)->FindClass(env,"com/lhd/ccalljava/JNIS");
//2. 得到对应方法的Method对象 : GetMethodId()
//jmethodID (*GetMethodID)(JNIEnv*, jclass, const char*, const char*)
   jmethodID methodId = (*env)->GetMethodID(env,class,"add","(II)I");
//3. 创建类对象
//jobject (*AllocObject)(JNIEnv*, jclass);
//   jobject object = (*env)->AllocObject(env, class);
//4. 调用方法(无返回值)
//void (*CallVoidMethod)(JNIEnv*, jobject, jmethodID, ...)
   (*env)->CallIntMethod(env,obj,methodId,3,4);
}

JNIEXPORT void JNICALL Java_com_lhd_ccalljava_JNIS_callbackPrintString
        (JNIEnv *env, jobject obj)
{
   //1. 加载类得到jclass对象:
//jclass (*FindClass)(JNIEnv*, const char*);
   jclass class= (*env)->FindClass(env,"com/lhd/ccalljava/JNIS");
//2. 得到对应方法的Method对象 : GetMethodId()
//jmethodID (*GetMethodID)(JNIEnv*, jclass, const char*, const char*)
   jmethodID methodId = (*env)->GetMethodID(env,class,"printString","(Ljava/lang/String;)V");
//3. 创建类对象
//jobject (*AllocObject)(JNIEnv*, jclass);
//   jobject object = (*env)->AllocObject(env, class);
//4. 调用方法(无返回值)
//void (*CallVoidMethod)(JNIEnv*, jobject, jmethodID, ...)
    jstring string = (*env)->NewStringUTF(env, "I am a good boy");
   (*env)->CallVoidMethod(env,obj,methodId,string);
}

JNIEXPORT void JNICALL Java_com_lhd_ccalljava_JNIS_callbackSayHello
        (JNIEnv *env, jobject obj){
    //1. 加载类得到jclass对象:
//jclass (*FindClass)(JNIEnv*, const char*);
    jclass class= (*env)->FindClass(env,"com/lhd/ccalljava/JNIS");
//2. 得到对应方法的Method对象 : GetMethodId()
//jmethodID (*GetMethodID)(JNIEnv*, jclass, const char*, const char*)
    jmethodID methodId = (*env)->GetStaticMethodID(env,class,"sayHello","(Ljava/lang/String;)V");
//3. 创建类对象
//jobject (*AllocObject)(JNIEnv*, jclass);
//   jobject object = (*env)->AllocObject(env, class);
//4. 调用方法(无返回值)
//void (*CallVoidMethod)(JNIEnv*, jobject, jmethodID, ...)
    jstring string = (*env)->NewStringUTF(env,"hello java");
    (*env)->CallStaticVoidMethod(env,class,methodId,string);
}

JNIEXPORT void JNICALL
Java_com_lhd_ccalljava_MainActivity_callbackShowToast(JNIEnv *env, jobject instance) {

    //1. 加载类得到jclass对象:
//jclass (*FindClass)(JNIEnv*, const char*);
    jclass class= (*env)->FindClass(env,"com/lhd/ccalljava/MainActivity");
//2. 得到对应方法的Method对象 : GetMethodId()
//jmethodID (*GetMethodID)(JNIEnv*, jclass, const char*, const char*)
    jmethodID methodId = (*env)->GetMethodID(env,class,"showToast","()V");
//3. 创建类对象
//jobject (*AllocObject)(JNIEnv*, jclass);
//   jobject object = (*env)->AllocObject(env, class);
//4. 调用方法(无返回值)
//void (*CallVoidMethod)(JNIEnv*, jobject, jmethodID, ...)
    (*env)->CallVoidMethod(env,instance,methodId);
}