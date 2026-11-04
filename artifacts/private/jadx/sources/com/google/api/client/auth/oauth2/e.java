package com.google.api.client.auth.oauth2;

import com.facebook.internal.z0;
import com.google.api.client.util.h0;
import com.google.api.client.util.v;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public class e extends com.google.api.client.http.j {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @v(z0.f100293x)
    private String f115191j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @v(z0.f100292w)
    private String f115192k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @v("scope")
    private String f115193l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @v("client_id")
    private String f115194m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @v
    private String f115195n;

    public e(String str, String str2, Collection<String> collection) {
        super(str);
        h0.a(s() == null);
        Z(str2);
        b0(collection);
    }

    @Override // com.google.api.client.http.j
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public e clone() {
        return (e) super.clone();
    }

    public final String Q() {
        return this.f115194m;
    }

    public final String S() {
        return this.f115192k;
    }

    public final String U() {
        return this.f115191j;
    }

    public final String V() {
        return this.f115193l;
    }

    public final String W() {
        return this.f115195n;
    }

    @Override // com.google.api.client.http.j, com.google.api.client.util.s
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public e p(String str, Object obj) {
        return (e) super.p(str, obj);
    }

    public e Z(String str) {
        this.f115194m = (String) h0.d(str);
        return this;
    }

    public e a0(String str) {
        this.f115192k = str;
        return this;
    }

    public e b0(Collection<String> collection) {
        this.f115191j = com.google.api.client.util.u.b(' ').a(collection);
        return this;
    }

    public e c0(Collection<String> collection) {
        this.f115193l = (collection == null || !collection.iterator().hasNext()) ? null : com.google.api.client.util.u.b(' ').a(collection);
        return this;
    }

    public e d0(String str) {
        this.f115195n = str;
        return this;
    }
}
