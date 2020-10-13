/*
 * KOTLIN PSI SPEC TEST (POSITIVE)
 *
 * SPEC VERSION: 0.1-draft
 * MAIN LINK: expressions, constant-literals, boolean-literals -> paragraph 1 -> sentence 2
 * NUMBER: 17
 * DESCRIPTION: The use of Boolean literals as the identifier (with backtick) in the callableReference.
 * NOTE: this test data is generated by FeatureInteractionTestDataGenerator. DO NOT MODIFY CODE MANUALLY!
 */

fun case_1() {
    Boolean::`true`

    Boolean???::`false`::`true`::`false`

    org.jetbrains.Boolean?::`true`::`false`
}
