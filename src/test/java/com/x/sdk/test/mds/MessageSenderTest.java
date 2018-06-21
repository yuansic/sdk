package com.x.sdk.test.mds;

import com.x.sdk.mds.MessageSender;

public class MessageSenderTest {

	public static void main(String[] args) {
		String topic = "topic-dvp-adp-par";
		String msg = "{\"checkNum\":100,\"filePath\":\"E:/ftp3/data\",\"fileactNum\":100,\"filename\":\"test_user.AVL\",\"filetype\":0}";
		MessageSender.send(topic,"k1", msg);
		msg = "mayt-test-message2225";
//		MessageSender.send(topic,"k1", msg);
		msg = "mayt-test-message2226";
//		MessageSender.send(topic,"k1", msg);
	}

}
