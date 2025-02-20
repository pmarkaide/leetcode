class Solution {
    // 20/02/2025
    fun maximumWealth(accounts: Array<IntArray>): Int {
        val result = MutableList(accounts.size) { 0 }
        for (i in accounts.indices) {
            result [i] = accounts[i].sum()
        }

        return result.maxOrNull() ?: 0
    }
}

fun main() {
    val solution = Solution()
    val data =arrayOf(
        intArrayOf(1,2,3),
        intArrayOf(3,2,4)
    )
    solution.maximumWealth(data)
}
