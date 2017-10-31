package ca.ualberta.cs.lonelytweet;

import java.util.Date;

public class NormalLonelyTweet extends LonelyTweet {

	public NormalLonelyTweet() {
	}

	public NormalLonelyTweet(String text, Date date) {
		this.tweetDate = date;
		this.tweetBody = text;
	}

	@Override
	public boolean isValid() {
		//simplified statement, since we are jsut returning false no need for if statement
		return !(tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 10);
	}

	@Override
	public String getTweetBody() {
        return tweetBody;
    }
}