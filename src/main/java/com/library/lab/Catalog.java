package com.library.lab;

import java.util.Objects;

public class Catalog {
    private String catalogTitle;
    private int catalogSubscriptionPrice;

    public Catalog(String catalogTitle, int catalogSubscriptionPrice) {
        this.catalogTitle = catalogTitle;
        this.catalogSubscriptionPrice = catalogSubscriptionPrice;
    }

    public String getCatalogTitle() {
        return catalogTitle;
    }

    public void setCatalogTitle(String catalogTitle) {
        this.catalogTitle = catalogTitle;
    }

    public int getCatalogSubscriptionPrice() {
        return catalogSubscriptionPrice;
    }

    public void setCatalogSubscriptionPrice(int catalogSubscriptionPrice) {
        this.catalogSubscriptionPrice = catalogSubscriptionPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Catalog catalog = (Catalog) o;
        return Objects.equals(catalogTitle, catalog.catalogTitle) &&
                Objects.equals(catalogSubscriptionPrice, catalog.catalogSubscriptionPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catalogTitle, catalogSubscriptionPrice);
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "catalogTitle='" + catalogTitle + '\'' +
                ", catalogSubscriptionPrice='" + catalogSubscriptionPrice + '\'' +
                '}';
    }
}
