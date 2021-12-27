package com.program006;

class SmsNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.print("Sending SMS notification....");
    }
}
