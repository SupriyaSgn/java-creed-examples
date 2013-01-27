package com.javacreed.examples.di.part4;

public class SmsService implements MessageService {

  public void sendMessage(final String subject, final String message) {
    System.out.printf("SMS: %s, %s%n", subject, message);
  }

}
