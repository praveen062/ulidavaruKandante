package com.conflux.finflux.db;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Praveen J U on 7/2/2016.
 */
public class LoginUser extends RealmObject {
    public static final String AUTHENTICATION_KEY = "authenticationKey";
    @PrimaryKey
    private long id;
    private String username;
    private long userId;
    private String base64EncodedAuthenticationKey;
    private boolean authenticated;
    private long officeId;
    private Long staffid;

    public Long getStaffid() {
        return staffid;
    }

    public void setStaffid(Long staffid) {
        this.staffid = staffid;
    }

    private String officeName;
    private RealmList<LoginUserRole> roles;
    private RealmList<LoginUserPermission> permissions;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public static String getAuthenticationKey() {
        return AUTHENTICATION_KEY;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getBase64EncodedAuthenticationKey() {
        return base64EncodedAuthenticationKey;
    }

    public void setBase64EncodedAuthenticationKey(String base64EncodedAuthenticationKey) {
        this.base64EncodedAuthenticationKey = base64EncodedAuthenticationKey;
    }

    public boolean isAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(boolean authenticated) {
        this.authenticated = authenticated;
    }

    public long getOfficeId() {
        return officeId;
    }

    public void setOfficeId(long officeId) {
        this.officeId = officeId;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public RealmList<LoginUserRole> getRoles() {
        return roles;
    }

    public void setRoles(RealmList<LoginUserRole> roles) {
        this.roles = roles;
    }

    public RealmList<LoginUserPermission> getPermissions() {
        return permissions;
    }

    public void setPermissions(RealmList<LoginUserPermission> permissions) {
        this.permissions = permissions;
    }
}
