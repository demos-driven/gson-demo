load("@rules_java//java:defs.bzl", "java_binary", "java_library", "java_test")

package(default_visibility = ["//visibility:public"])


java_binary(
    name = "gson-demo",
    main_class = "com.example.myproject.Application",
    runtime_deps = [":gson-lib"],
)

java_library(
    name = "gson-lib",
    srcs = glob([
        "src/main/java/com/example/myproject/**/*.java",
    ]),
    deps = [
        "@maven//:com_google_code_gson_gson",

        "@maven//:org_apache_commons_commons_lang3",
    ]
)

java_test(
    name = "tests",
    srcs = glob([
        "src/test/java/com/example/myproject/**/*.java"
    ]),
    test_class = "com.example.myproject.ApplicationTest",
    deps = [
        ":gson-lib",
        "@maven//:junit_junit",
    ],
)