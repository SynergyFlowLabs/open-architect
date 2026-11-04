package com.google.api.client.googleapis.notifications;

import com.google.api.client.util.f0;
import com.google.api.client.util.h0;
import java.io.IOException;
import java.io.Serializable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes4.dex */
@com.google.api.client.util.f
public final class d implements Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f115471g = "d";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f115472h = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lock f115473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f115474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f115475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f115476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f115477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f115478f;

    public d(h hVar) {
        this(hVar, b.a());
    }

    public static com.google.api.client.util.store.d<d> b(com.google.api.client.util.store.e eVar) throws IOException {
        return eVar.a(f115471g);
    }

    public String a() {
        this.f115473a.lock();
        try {
            String str = this.f115475c;
            this.f115473a.unlock();
            return str;
        } catch (Throwable th2) {
            this.f115473a.unlock();
            throw th2;
        }
    }

    public Long c() {
        this.f115473a.lock();
        try {
            Long l10 = this.f115476d;
            this.f115473a.unlock();
            return l10;
        } catch (Throwable th2) {
            this.f115473a.unlock();
            throw th2;
        }
    }

    public String d() {
        this.f115473a.lock();
        try {
            String str = this.f115477e;
            this.f115473a.unlock();
            return str;
        } catch (Throwable th2) {
            this.f115473a.unlock();
            throw th2;
        }
    }

    public h e() {
        this.f115473a.lock();
        try {
            return this.f115474b;
        } finally {
            this.f115473a.unlock();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return d().equals(((d) obj).d());
        }
        return false;
    }

    public String f() {
        this.f115473a.lock();
        try {
            String str = this.f115478f;
            Lock lock = this.f115473a;
            return str;
        } finally {
            this.f115473a.unlock();
        }
    }

    public d g(String str) {
        this.f115473a.lock();
        try {
            this.f115475c = str;
            this.f115473a.unlock();
            return this;
        } catch (Throwable th2) {
            this.f115473a.unlock();
            throw th2;
        }
    }

    public d h(Long l10) {
        this.f115473a.lock();
        try {
            this.f115476d = l10;
            Lock lock = this.f115473a;
            return this;
        } finally {
            this.f115473a.unlock();
        }
    }

    public int hashCode() {
        return d().hashCode();
    }

    public d i(String str) {
        this.f115473a.lock();
        try {
            this.f115478f = str;
            this.f115473a.unlock();
            return this;
        } catch (Throwable th2) {
            this.f115473a.unlock();
            throw th2;
        }
    }

    public d j(com.google.api.client.util.store.d<d> dVar) throws IOException {
        this.f115473a.lock();
        try {
            dVar.b(d(), this);
            this.f115473a.unlock();
            return this;
        } catch (Throwable th2) {
            this.f115473a.unlock();
            throw th2;
        }
    }

    public d k(com.google.api.client.util.store.e eVar) throws IOException {
        return j(b(eVar));
    }

    public String toString() {
        return f0.b(d.class).a("notificationCallback", e()).a("clientToken", a()).a("expiration", c()).a("id", d()).a("topicId", f()).toString();
    }

    public d(h hVar, String str) {
        this.f115473a = new ReentrantLock();
        this.f115474b = (h) h0.d(hVar);
        this.f115477e = (String) h0.d(str);
    }
}
