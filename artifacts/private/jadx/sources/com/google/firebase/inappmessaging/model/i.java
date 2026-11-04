package com.google.firebase.inappmessaging.model;

import androidx.annotation.p0;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    n f123085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    n f123086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    String f123087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    g f123088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    d f123089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    String f123090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    String f123091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    String f123092h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    Boolean f123093i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    MessageType f123094j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    e f123095k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private Map<String, String> f123096l;

    @Deprecated
    public i(n nVar, n nVar2, String str, g gVar, d dVar, a aVar, String str2, String str3, String str4, Boolean bool, MessageType messageType, Map<String, String> map) {
        this.f123085a = nVar;
        this.f123086b = nVar2;
        this.f123087c = str;
        this.f123088d = gVar;
        this.f123089e = dVar;
        this.f123090f = str2;
        this.f123091g = str3;
        this.f123092h = str4;
        this.f123093i = bool;
        this.f123094j = messageType;
        this.f123095k = new e(str3, str4, bool.booleanValue());
        this.f123096l = map;
    }

    @p0
    @Deprecated
    public abstract a a();

    @p0
    @Deprecated
    public d b() {
        return a() != null ? a().c() : this.f123089e;
    }

    @p0
    @Deprecated
    public String c() {
        return this.f123090f;
    }

    @p0
    @Deprecated
    public n d() {
        return this.f123086b;
    }

    @p0
    @Deprecated
    public String e() {
        return this.f123095k.a();
    }

    @p0
    public e f() {
        return this.f123095k;
    }

    @p0
    @Deprecated
    public String g() {
        return this.f123095k.b();
    }

    @p0
    public Map<String, String> h() {
        return this.f123096l;
    }

    @p0
    @Deprecated
    public g i() {
        return this.f123088d;
    }

    @p0
    @Deprecated
    public String j() {
        return this.f123087c;
    }

    @p0
    @Deprecated
    public Boolean k() {
        return Boolean.valueOf(this.f123095k.c());
    }

    @p0
    public MessageType l() {
        return this.f123094j;
    }

    @p0
    @Deprecated
    public n m() {
        return this.f123085a;
    }

    public i(e eVar, MessageType messageType, Map<String, String> map) {
        this.f123095k = eVar;
        this.f123094j = messageType;
        this.f123096l = map;
    }
}
