package com.blz.sdp;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        AboutPage aboutPage = new AboutPage();
        BillingPage billingPage = new BillingPage();
        LoginPage loginPage = new LoginPage();
        RegistrationPage registrationPage = new RegistrationPage();
        DashboardPage dashboardPage = new DashboardPage();

        subject.register(aboutPage);
        subject.register(billingPage);
        subject.register(loginPage);
        subject.register(registrationPage);
        subject.register(dashboardPage);

        subject.update("data");

        subject.unRegister(dashboardPage);
        subject.unRegister(registrationPage);

        subject.update("New Data");

    }
}
