/*
 * KOTLIN PSI SPEC TEST (POSITIVE)
 *
 * SPEC VERSION: 0.1-draft
 * MAIN LINK: expressions, constant-literals, boolean-literals -> paragraph 1 -> sentence 2
 * NUMBER: 3
 * DESCRIPTION: The use of Boolean literals as the identifier (with backtick) in the class.
 * NOTE: this test data is generated by FeatureInteractionTestDataGenerator. DO NOT MODIFY CODE MANUALLY!
 */

class `true` {}

internal class A: `false` {}

interface `true` {}

interface A: @`false` B {}

interface A: B, C, `true` {}
