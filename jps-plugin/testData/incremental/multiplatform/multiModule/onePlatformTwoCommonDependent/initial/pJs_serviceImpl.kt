//
// DON'T EDIT! This file is GENERATED by `MppJpsIncTestsGenerator` (runs by generateTests)
// from `incremental/multiplatform/multiModule/onePlatformTwoCommonDependent/dependencies.txt`
//

actual fun c2_platformDependentC2(): String = "pJs"
fun pJs_platformOnly() = "pJs"

fun pJsTest() {
  c2_platformIndependentC2()
  c2_platformDependentC2()
  pJs_platformOnly()
}
