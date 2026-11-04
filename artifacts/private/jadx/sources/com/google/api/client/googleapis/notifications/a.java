package com.google.api.client.googleapis.notifications;

import com.google.api.client.util.f0;
import com.google.api.client.util.h0;

/* JADX INFO: loaded from: classes4.dex */
@com.google.api.client.util.f
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f115460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f115461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f115462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f115463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f115464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f115465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f115466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f115467h;

    protected a(long j10, String str, String str2, String str3, String str4) {
        m(j10);
        o(str);
        n(str2);
        p(str3);
        k(str4);
    }

    public final String a() {
        return this.f115467h;
    }

    public final String b() {
        return this.f115465f;
    }

    public final String c() {
        return this.f115464e;
    }

    public final String d() {
        return this.f115466g;
    }

    public final long e() {
        return this.f115460a;
    }

    public final String f() {
        return this.f115462c;
    }

    public final String g() {
        return this.f115461b;
    }

    public final String h() {
        return this.f115463d;
    }

    public a i(String str) {
        this.f115467h = str;
        return this;
    }

    public a j(String str) {
        this.f115465f = str;
        return this;
    }

    public a k(String str) {
        this.f115464e = (String) h0.d(str);
        return this;
    }

    public a l(String str) {
        this.f115466g = str;
        return this;
    }

    public a m(long j10) {
        h0.a(j10 >= 1);
        this.f115460a = j10;
        return this;
    }

    public a n(String str) {
        this.f115462c = (String) h0.d(str);
        return this;
    }

    public a o(String str) {
        this.f115461b = (String) h0.d(str);
        return this;
    }

    public a p(String str) {
        this.f115463d = (String) h0.d(str);
        return this;
    }

    protected f0.b q() {
        return f0.b(this).a("messageNumber", Long.valueOf(this.f115460a)).a("resourceState", this.f115461b).a("resourceId", this.f115462c).a("resourceUri", this.f115463d).a("channelId", this.f115464e).a("channelExpiration", this.f115465f).a("channelToken", this.f115466g).a("changed", this.f115467h);
    }

    public String toString() {
        return q().toString();
    }

    protected a(a aVar) {
        this(aVar.e(), aVar.g(), aVar.f(), aVar.h(), aVar.c());
        j(aVar.b());
        l(aVar.d());
        i(aVar.a());
    }
}
