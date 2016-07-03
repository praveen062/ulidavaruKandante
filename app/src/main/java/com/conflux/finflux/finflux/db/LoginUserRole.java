package com.conflux.finflux.finflux.db;

import io.realm.RealmObject;

/**
 * Created by Praveen J U on 7/2/2016.
 */
public class LoginUserRole extends RealmObject {
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
