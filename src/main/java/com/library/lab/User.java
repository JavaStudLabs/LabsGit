package com.library.lab;

import java.util.List;
import java.util.Objects;

public class User {
    private String userName;
    private List<Catalog> userSubscribedCatalogs;

    public User(String userName) {
        this.userName = userName;
    }

    public User(String userName, List<Catalog> userSubscribedCatalogs) {
        this.userName = userName;
        this.userSubscribedCatalogs = userSubscribedCatalogs;
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
