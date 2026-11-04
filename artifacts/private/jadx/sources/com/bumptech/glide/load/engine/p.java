package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
class p<Z> implements v<Z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f96689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f96690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v<Z> f96691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f96692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.g f96693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f96694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f96695g;

    interface a {
        void c(com.bumptech.glide.load.g gVar, p<?> pVar);
    }

    p(v<Z> vVar, boolean z10, boolean z11, com.bumptech.glide.load.g gVar, a aVar) {
        this.f96691c = (v) com.bumptech.glide.util.k.d(vVar);
        this.f96689a = z10;
        this.f96690b = z11;
        this.f96693e = gVar;
        this.f96692d = (a) com.bumptech.glide.util.k.d(aVar);
    }

    @Override // com.bumptech.glide.load.engine.v
    public synchronized void a() {
        if (this.f96694f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f96695g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f96695g = true;
        if (this.f96690b) {
            this.f96691c.a();
        }
    }

    @Override // com.bumptech.glide.load.engine.v
    @NonNull
    public Class<Z> b() {
        return this.f96691c.b();
    }

    synchronized void c() {
        if (this.f96695g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f96694f++;
    }

    v<Z> d() {
        return this.f96691c;
    }

    boolean e() {
        return this.f96689a;
    }

    void f() {
        boolean z10;
        synchronized (this) {
            try {
                int i10 = this.f96694f;
                if (i10 <= 0) {
                    throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
                }
                z10 = true;
                int i11 = i10 - 1;
                this.f96694f = i11;
                if (i11 != 0) {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            this.f96692d.c(this.f96693e, this);
        }
    }

    @Override // com.bumptech.glide.load.engine.v
    @NonNull
    public Z get() {
        return this.f96691c.get();
    }

    @Override // com.bumptech.glide.load.engine.v
    public int getSize() {
        return this.f96691c.getSize();
    }

    public synchronized String toString() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return "EngineResource{isMemoryCacheable=" + this.f96689a + ", listener=" + this.f96692d + ", key=" + this.f96693e + ", acquired=" + this.f96694f + ", isRecycled=" + this.f96695g + ", resource=" + this.f96691c + AbstractJsonLexerKt.END_OBJ;
    }
}
