package com.google.api.client.auth.oauth2;

import com.google.api.client.util.h0;
import com.google.api.client.util.v;

/* JADX INFO: loaded from: classes4.dex */
public class c extends com.google.api.client.http.j {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @v
    private String f115184j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @v
    private String f115185k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @v
    private String f115186l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @v("error_description")
    private String f115187m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @v(net.openid.appauth.e.f332899i)
    private String f115188n;

    public c(String str) {
        super(str);
        h0.a((this.f115184j == null) != (this.f115186l == null));
    }

    @Override // com.google.api.client.http.j
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public c clone() {
        return (c) super.clone();
    }

    public final String Q() {
        return this.f115184j;
    }

    public final String S() {
        return this.f115186l;
    }

    public final String U() {
        return this.f115187m;
    }

    public final String V() {
        return this.f115188n;
    }

    public final String W() {
        return this.f115185k;
    }

    @Override // com.google.api.client.http.j, com.google.api.client.util.s
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public c p(String str, Object obj) {
        return (c) super.p(str, obj);
    }

    public c Z(String str) {
        this.f115184j = str;
        return this;
    }

    public c a0(String str) {
        this.f115186l = str;
        return this;
    }

    public c b0(String str) {
        this.f115187m = str;
        return this;
    }

    public c c0(String str) {
        this.f115188n = str;
        return this;
    }

    public c d0(String str) {
        this.f115185k = str;
        return this;
    }
}
