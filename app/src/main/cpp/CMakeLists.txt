cmake_minimum_required(VERSION 3.18.1)
project("ggpo_native")

add_library(ggpo_native SHARED native-lib.cpp)

find_library(log-lib log)

target_link_libraries(ggpo_native ${log-lib})
