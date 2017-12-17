cmake_minimum_required(VERSION 3.4.1)


include_directories(${CMAKE_SOURCE_DIR}/include)

set(LIBS ${CMAKE_SOURCE_DIR}/../jniLibs/${ANDROID_ABI})

link_directories(${LIBS})


add_library(xgn_pda SHARED main.cpp)


MESSAGE("libraryPathIs ${LIBS}")

add_library(opencv_java3 SHARED IMPORTED)
set_target_properties(opencv_java3 PROPERTIES IMPORTED_LOCATION ${LIBS}/libopencv_java3.so)

add_library(mixed_sample SHARED jni_part.cpp)
target_link_libraries(mixed_sample log dl opencv_java3)