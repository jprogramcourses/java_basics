package JavaSEEnumerations;

public enum Rating {
	
	NOT_RATED("\u2686\u2686\u2686\u2686\u2686"),
	ONE_STAR("\u2685\u2686\u2686\u2686\u2686"),
	TWO_STAR("\u2685\u2685\u2686\u2686\u2686"),
	THREE_STAR("\u2685\u2685\u2685\u2686\u2686"),
	FOUR_STAR("\u2685\u2685\u2685\u2685\u2686"),
	FIVE_STAR("\u2685\u2685\u2685\u2685\u2685");
	
	private String stars;
	
	private Rating(String stars) {
		this.stars = stars;
	}

	public String getStars() {
		return stars;
	}

}
