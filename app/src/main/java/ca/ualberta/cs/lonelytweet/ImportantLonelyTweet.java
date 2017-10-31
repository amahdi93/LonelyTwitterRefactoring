package ca.ualberta.cs.lonelytweet;

import java.util.Date;

public class ImportantLonelyTweet extends LonelyTweet {

	public ImportantLonelyTweet() {
	}

	public ImportantLonelyTweet(String text, Date date) {
		this.tweetDate = date;
		this.tweetBody = text;
	}

	@Override
	public boolean isValid() {
		//simplified statement, since we are jsut returning false no need for if statement
		return !(tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 20);
	}

	@Override
	public String getTweetBody() {
        return tweetBody.toUpperCase();
    }
}