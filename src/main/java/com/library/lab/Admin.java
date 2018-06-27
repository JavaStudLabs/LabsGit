package com.library.lab;

import java.util.List;
import java.util.Objects;

public class Admin {
    private String adminName;
    private List<Catalog> catalogList;

    public Admin(String adminName) {
        this.adminName = adminName;
    }

    public Admin(String adminName, List<Catalog> catalogList) {
        this.adminName = adminName;
        this.catalogList = catalogList;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public List<Catalog> getCatalogList() {
        return catalogList;
    }

    public void setCatalogList(List<Catalog> catalogList) {
        this.catalogList = catalogList;
    }

    public void printAllCatalogs() {
        System.out.println("Админ: " + adminName + " управляет каталогами" );
        for (Catalog catalog: catalogList) {
            System.out.println("Админ: " + adminName + " управляет каталогами" );
            System.out.println(catalog.getCatalogTitle() + " цена за подписку: " + catalog.getCatalogSubscriptionPrice());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Admin admin = (Admin) o;
        return Objects.equals(adminName, admin.adminName) &&
                Objects.equals(catalogList, admin.catalogList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminName, catalogList);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminName='" + adminName + '\'' +
                ", catalogList=" + catalogList +
                '}';
    }
}
