// !LANGUAGE: +InlineClasses
// WITH_RUNTIME
// TODO: After fixing KT-32450, it requires stdlib recompilation to unignore the test.
// IGNORE_BACKEND: JVM_IR
// IGNORE_LIGHT_ANALYSIS
// IGNORE_BACKEND: JVM

fun <T> foo(a: Result<T>): T = bar(a) {
    it.getOrThrow()
}

fun <T, R> bar(value: T, f: (T) -> R): R {
    return f(value)
}

fun box(): String {
    val res = foo<Int>(Result.success(40)) + 2
    return if (res != 42) "FAIL $res" else "OK"
}