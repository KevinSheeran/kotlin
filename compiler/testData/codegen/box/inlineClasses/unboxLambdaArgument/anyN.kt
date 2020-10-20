// !LANGUAGE: +InlineClasses

fun <T> foo(a: IC): T = bar(a) {
    it.value as T
}

fun <T, R> bar(value: T, f: (T) -> R): R {
    return f(value)
}

inline class IC(val value: Any?)

fun box(): String {
    val res = foo<Int>(IC(40)) + 2
    return if (res != 42) "FAIL $res" else "OK"
}