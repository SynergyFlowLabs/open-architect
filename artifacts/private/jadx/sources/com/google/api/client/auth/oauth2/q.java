package com.google.api.client.auth.oauth2;

import com.google.api.client.util.f0;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes4.dex */
@com.google.api.client.util.f
public final class q implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f115229e = "q";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f115230f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lock f115231a = new ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f115232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Long f115233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f115234d;

    public q() {
    }

    public static com.google.api.client.util.store.d<q> b(com.google.api.client.util.store.e eVar) throws IOException {
        return eVar.a(f115229e);
    }

    public String a() {
        this.f115231a.lock();
        try {
            String str = this.f115232b;
            this.f115231a.unlock();
            return str;
        } catch (Throwable th2) {
            this.f115231a.unlock();
            throw th2;
        }
    }

    public Long c() {
        this.f115231a.lock();
        try {
            Long l10 = this.f115233c;
            Lock lock = this.f115231a;
            return l10;
        } finally {
            this.f115231a.unlock();
        }
    }

    public String d() {
        this.f115231a.lock();
        try {
            String str = this.f115234d;
            Lock lock = this.f115231a;
            return str;
        } finally {
            this.f115231a.unlock();
        }
    }

    public q e(String str) {
        this.f115231a.lock();
        try {
            this.f115232b = str;
            Lock lock = this.f115231a;
            return this;
        } finally {
            this.f115231a.unlock();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return f0.a(a(), qVar.a()) && f0.a(d(), qVar.d()) && f0.a(c(), qVar.c());
    }

    public q f(Long l10) {
        this.f115231a.lock();
        try {
            this.f115233c = l10;
            this.f115231a.unlock();
            return this;
        } catch (Throwable th2) {
            this.f115231a.unlock();
            throw th2;
        }
    }

    public q g(String str) {
        this.f115231a.lock();
        try {
            this.f115234d = str;
            this.f115231a.unlock();
            return this;
        } catch (Throwable th2) {
            this.f115231a.unlock();
            throw th2;
        }
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{a(), d(), c()});
    }

    public String toString() {
        return f0.b(q.class).a("accessToken", a()).a("refreshToken", d()).a("expirationTimeMilliseconds", c()).toString();
    }

    public q(j jVar) {
        e(jVar.e());
        g(jVar.m());
        f(jVar.h());
    }
}
