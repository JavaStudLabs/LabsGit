package com.library.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
    private String userName;
    private List<Catalog> userSubscribedCatalogs;
    private double balance;

    public User(String userName) {
        this.userName = userName;
        userSubscribedCatalogs = new ArrayList<>();
    }

    public User(String userName, List<Catalog> userSubscribedCatalogs, int balance) {
        this.userName = userName;
        this.userSubscribedCatalogs = userSubscribedCatalogs;
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Catalog> getUserSubscribedCatalogs() {
        return userSubscribedCatalogs;
    }

    public void setUserSubscribedCatalogs(List<Catalog> userSubscribedCatalogs) {
        this.userSubscribedCatalogs = userSubscribedCatalogs;
    }

    public void registerSubscription(Catalog catalog) {
        if(balance > catalog.getCatalogSubscriptionPrice()) {
            balance = balance - catalog.getCatalogSubscriptionPrice();
            userSubscribedCatalogs.add(catalog);
            System.out.println("Подписка прошла успешно!");
        } else {
            System.out.println("Не достаточно средств на счету! Пожалуйста пополните баланс");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userName, user.userName) &&
                Objects.equals(userSubscribedCatalogs, user.userSubscribedCatalogs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, userSubscribedCatalogs);
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userSubscribedCatalogs=" + userSubscribedCatalogs +
                '}';
    }
}
