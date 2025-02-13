# Kotlin `removeIf` on Immutable List

This example demonstrates a common Kotlin error when using the `removeIf` function with immutable lists.  The `removeIf` function modifies the list in place, which is only possible with mutable lists. Attempting to use `removeIf` on an immutable `listOf` will result in a compilation error.

The `bug.kt` file shows this error, while `bugSolution.kt` offers a solution using a mutable list or an alternative approach for immutable lists.