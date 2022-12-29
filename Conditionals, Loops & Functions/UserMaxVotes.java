class Source {
	public static void main(String args[]) {
		int[] votes = {1,2,34,5,6,7,8,9,10,11,12,13,14,15};
		int userWithMostVotes = mostVotes(votes); 
		System.out.println("User with the most votes is User: " + userWithMostVotes);  
	}
	public static int mostVotes(int[] votesPerUser) {
		int userWithMostVotes = 0; 
		for(int i=0; i < votesPerUser.length; i++) {
		if(votesPerUser[i] > votesPerUser[userWithMostVotes]) {
			userWithMostVotes = i;
		}
		}
		return userWithMostVotes;
	}
}
  