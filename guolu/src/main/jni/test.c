#include "com_lhd_guolu_JNI.h"
#include "stdlib.h"
int pressure = 50; //当前压力值,初始为50
JNIEXPORT jint JNICALL Java_com_lhd_guolu_JNI_getPressure
        (JNIEnv *env, jobject obj){
    int increase = rand()%20;
    pressure += increase;
    return pressure;
}

