// IGNORE_BACKEND: JS_IR
// EXPECTED_REACHABLE_NODES: 1112
fun box(): String {
    val cl = 39
    return if (sum(200, { val ff = { cl }; ff() }) == 239) "OK" else "FAIL"
}

fun sum(arg: Int, f: () -> Int): Int {
    return arg + f()
}