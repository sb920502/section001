package com.program006;

import java.util.Scanner;

class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("channel = ");
        String channel = scanner.next();
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification(channel);
        notification.notifyUser();
    }
}
