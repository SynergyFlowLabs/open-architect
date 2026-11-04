package com.google.android.gms.common.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    private Object f106654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f106655b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ f f106656c;

    public u1(f fVar, Object obj) {
        this.f106656c = fVar;
        this.f106654a = obj;
    }

    protected abstract void a(Object obj);

    protected abstract void b();

    public final void c() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.f106654a;
                if (this.f106655b) {
                    toString();
                }
            } finally {
            }
        }
        if (obj != null) {
            a(obj);
        }
        synchronized (this) {
            this.f106655b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            try {
                this.f106654a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        d();
        synchronized (this.f106656c.f106540v) {
            this.f106656c.f106540v.remove(this);
        }
    }
}
