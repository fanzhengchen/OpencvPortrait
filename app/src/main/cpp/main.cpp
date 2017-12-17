//
// Created by fanzhengchen on 12/17/17.
//
#include <android/log.h>
#include <jni.h>
#include <assert.h>

extern "C"
JNIEXPORT jint JNICALL JNI_OnLoad(JavaVM* vm, void* reserved)
{
	JNIEnv* env = NULL;
	jint result = -1;

	if (vm->GetEnv((void**) &env, JNI_VERSION_1_6) != JNI_OK) {
		return -1;
	}
	assert(env != NULL);

//	if (!registerNatives(env)) {//注册
//		return -1;
//	}
	/* success -- return valid version number */
	result = JNI_VERSION_1_6;

	return result;
}
