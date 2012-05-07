public class BadSubstring {

	private static final int A = 0;
	private static final int B = 1;
	private static final int C = 2;
	
	public long howMany(int length) {
		if (length == 0) return 1L;
		
		long[][] dp = new long[length + 1][3];
		dp[1][A] = dp[1][B] = dp[1][C] = 1;
		
		for (int len = 2; len <= length; len++) {
			dp[len][A] = dp[len - 1][A] + dp[len - 1][B] + dp[len - 1][C];
			dp[len][B] = dp[len - 1][B] + dp[len - 1][C];
			dp[len][C] = dp[len - 1][A] + dp[len - 1][B] + dp[len - 1][C];
		}
		
		return dp[length][A] + dp[length][B] + dp[length][C];
	}

}
