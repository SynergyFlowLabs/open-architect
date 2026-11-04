package com.android.volley;

/* JADX INFO: loaded from: classes3.dex */
public class a0 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f89366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f89367b;

    public a0() {
        this.f89366a = null;
    }

    public long a() {
        return this.f89367b;
    }

    void b(long j10) {
        this.f89367b = j10;
    }

    public a0(o oVar) {
        this.f89366a = oVar;
    }

    public a0(String str) {
        super(str);
        this.f89366a = null;
    }

    public a0(String str, Throwable th2) {
        super(str, th2);
        this.f89366a = null;
    }

    public a0(Throwable th2) {
        super(th2);
        this.f89366a = null;
    }
}
