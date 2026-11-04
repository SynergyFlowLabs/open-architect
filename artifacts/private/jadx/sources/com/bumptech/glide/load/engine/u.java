package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
final class u<Z> implements v<Z>, com.bumptech.glide.util.pool.a.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final androidx.core.util.s.a<u<?>> f96746e = com.bumptech.glide.util.pool.a.e(20, new a());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.util.pool.c f96747a = com.bumptech.glide.util.pool.c.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private v<Z> f96748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f96749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f96750d;

    class a implements com.bumptech.glide.util.pool.a.d<u<?>> {
        a() {
        }

        @Override // com.bumptech.glide.util.pool.a.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public u<?> k() {
            return new u<>();
        }
    }

    u() {
    }

    private void c(v<Z> vVar) {
        this.f96750d = false;
        this.f96749c = true;
        this.f96748b = vVar;
    }

    @NonNull
    static <Z> u<Z> d(v<Z> vVar) {
        u<Z> uVar = (u) com.bumptech.glide.util.k.d(f96746e.acquire());
        uVar.c(vVar);
        return uVar;
    }

    private void e() {
        this.f96748b = null;
        f96746e.a(this);
    }

    @Override // com.bumptech.glide.load.engine.v
    public synchronized void a() {
        this.f96747a.c();
        this.f96750d = true;
        if (!this.f96749c) {
            this.f96748b.a();
            e();
        }
    }

    @Override // com.bumptech.glide.load.engine.v
    @NonNull
    public Class<Z> b() {
        return this.f96748b.b();
    }

    synchronized void f() {
        try {
            this.f96747a.c();
            if (!this.f96749c) {
                throw new IllegalStateException("Already unlocked");
            }
            this.f96749c = false;
            if (this.f96750d) {
                a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.bumptech.glide.load.engine.v
    @NonNull
    public Z get() {
        return this.f96748b.get();
    }

    @Override // com.bumptech.glide.load.engine.v
    public int getSize() {
        return this.f96748b.getSize();
    }

    @Override // com.bumptech.glide.util.pool.a.f
    @NonNull
    public com.bumptech.glide.util.pool.c k() {
        return this.f96747a;
    }
}
