// !LANGUAGE: +InlineClasses
// IGNORE_BACKEND: JVM_IR

fun <T> foo(a: IC): T = bar(a) {
    it.value as T
}

fun <T, R> bar(value: T, f: (T) -> R): R {
    return f(value)
}

inline class IC(val value: String)

fun box(): String {
    return foo<String>(IC("O")) + "K"
}