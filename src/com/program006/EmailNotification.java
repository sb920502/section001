package com.program006;

class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.print("Sending EMAIL notification....");
    }
}
