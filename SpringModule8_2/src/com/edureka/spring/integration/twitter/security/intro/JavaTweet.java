package com.edureka.spring.integration.twitter.security.intro;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class JavaTweet {

	static String consumerKeyStr = "jnI72JBZ98yE2OmlOBQA3lr2n";
	static String consumerSecretStr = "tY54PKzSgSGHDn5dQJ0MbLvtwG7Ts9rPB8LWmwSmfAGZ2Tuh2O";
	static String accessTokenStr = "2883142525-hfsm9BjN0F37HBvLfgmuO6v1WNyA3aMm5xfjJAb";
	static String accessTokenSecretStr = "0KHREQFDpPULUzrxrz8ucAz2DT3fMKAQFEI4CuDbW6R4e";
	
	/*
	 * 
	 * consumer-key=FrU2jqApRXHtokx91RhIfRECZ
consumer-secret=Gdq9l9GekQlwGIoEaP47cL97ZRVK6nOzue9wKKPSAcrVCn3R89
access-token=1922553320-vfibyxmZBkxjx4A7oekw403vBJB1IsYGVTwZO3o
access-token-secret=rZsAALhcLrfgWA69TZNsRdjjPEelJrtRynxuDUMlVClVn


	 */

	public static void main(String[] args) {

		try {
			Twitter twitter = new TwitterFactory().getInstance();

			twitter.setOAuthConsumer(consumerKeyStr, consumerSecretStr);
			AccessToken accessToken = new AccessToken(accessTokenStr,
					accessTokenSecretStr);

			twitter.setOAuthAccessToken(accessToken);

			twitter.updateStatus("Tweet made using SaumenD");

			System.out.println("Successfully updated the status in Twitter.");
		} catch (TwitterException te) {
			te.printStackTrace();
		}
	}

}