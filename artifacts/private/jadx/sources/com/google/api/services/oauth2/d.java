package com.google.api.services.oauth2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f116318a = "https://www.googleapis.com/auth/plus.me";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f116319b = "https://www.googleapis.com/auth/userinfo.email";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f116320c = "https://www.googleapis.com/auth/userinfo.profile";

    private d() {
    }

    public static Set<String> a() {
        HashSet hashSet = new HashSet();
        hashSet.add("https://www.googleapis.com/auth/plus.me");
        hashSet.add("https://www.googleapis.com/auth/userinfo.email");
        hashSet.add("https://www.googleapis.com/auth/userinfo.profile");
        return Collections.unmodifiableSet(hashSet);
    }
}
