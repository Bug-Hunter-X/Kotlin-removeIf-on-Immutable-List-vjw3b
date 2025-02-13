fun main() {
    // Solution 1: Use a mutable list
    val mutableList = mutableListOf(1, 2, 3, 4, 5)
    mutableList.removeIf { it > 2 }
    println(mutableList) // Output: [1, 2]

    // Solution 2: Create a new list using filter
    val immutableList = listOf(1, 2, 3, 4, 5)
    val filteredList = immutableList.filter { it <= 2 }
    println(filteredList) // Output: [1, 2]
} 