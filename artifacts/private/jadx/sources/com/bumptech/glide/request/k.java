package com.bumptech.glide.request;

import androidx.annotation.b0;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
public class k implements e, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private final e f97358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f97359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile d f97360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile d f97361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @b0("requestLock")
    private e.a f97362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @b0("requestLock")
    private e.a f97363f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @b0("requestLock")
    private boolean f97364g;

    public k(Object obj, @p0 e eVar) {
        e.a aVar = e.a.CLEARED;
        this.f97362e = aVar;
        this.f97363f = aVar;
        this.f97359b = obj;
        this.f97358a = eVar;
    }

    @b0("requestLock")
    private boolean i() {
        e eVar = this.f97358a;
        return eVar == null || eVar.h(this);
    }

    @b0("requestLock")
    private boolean j() {
        e eVar = this.f97358a;
        if (eVar != null && !eVar.c(this)) {
            return false;
        }
        return true;
    }

    @b0("requestLock")
    private boolean k() {
        e eVar = this.f97358a;
        return eVar == null || eVar.d(this);
    }

    @Override // com.bumptech.glide.request.e, com.bumptech.glide.request.d
    public boolean a() {
        boolean z10;
        synchronized (this.f97359b) {
            try {
                z10 = this.f97361d.a() || this.f97360c.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.e
    public void b(d dVar) {
        synchronized (this.f97359b) {
            try {
                if (dVar.equals(this.f97361d)) {
                    this.f97363f = e.a.SUCCESS;
                    return;
                }
                this.f97362e = e.a.SUCCESS;
                e eVar = this.f97358a;
                if (eVar != null) {
                    eVar.b(this);
                }
                if (!this.f97363f.k()) {
                    this.f97361d.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public boolean c(d dVar) {
        boolean z10;
        synchronized (this.f97359b) {
            try {
                z10 = j() && dVar.equals(this.f97360c) && !a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.d
    public void clear() {
        synchronized (this.f97359b) {
            try {
                this.f97364g = false;
                e.a aVar = e.a.CLEARED;
                this.f97362e = aVar;
                this.f97363f = aVar;
                this.f97361d.clear();
                this.f97360c.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public boolean d(d dVar) {
        boolean z10;
        synchronized (this.f97359b) {
            try {
                z10 = k() && (dVar.equals(this.f97360c) || this.f97362e != e.a.SUCCESS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.e
    public void e(d dVar) {
        synchronized (this.f97359b) {
            try {
                if (!dVar.equals(this.f97360c)) {
                    this.f97363f = e.a.FAILED;
                    return;
                }
                this.f97362e = e.a.FAILED;
                e eVar = this.f97358a;
                if (eVar != null) {
                    eVar.e(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.d
    public boolean f() {
        boolean z10;
        synchronized (this.f97359b) {
            z10 = this.f97362e == e.a.CLEARED;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.d
    public boolean g(d dVar) {
        if (dVar instanceof k) {
            k kVar = (k) dVar;
            if (this.f97360c == null) {
                if (kVar.f97360c == null) {
                    if (this.f97361d == null ? this.f97361d.g(kVar.f97361d) : kVar.f97361d == null) {
                    }
                }
            } else if (this.f97360c.g(kVar.f97360c)) {
                return this.f97361d == null ? true : true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.bumptech.glide.request.e] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // com.bumptech.glide.request.e
    public e getRoot() {
        ?? root;
        synchronized (this.f97359b) {
            try {
                e eVar = this.f97358a;
                this = this;
                if (eVar != null) {
                    root = eVar.getRoot();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return root;
    }

    @Override // com.bumptech.glide.request.e
    public boolean h(d dVar) {
        boolean z10;
        synchronized (this.f97359b) {
            try {
                if (i() && dVar.equals(this.f97360c) && this.f97362e != e.a.PAUSED) {
                    z10 = true;
                    int i10 = 6 | 1;
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.d
    public boolean isComplete() {
        boolean z10;
        synchronized (this.f97359b) {
            z10 = this.f97362e == e.a.SUCCESS;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.d
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f97359b) {
            try {
                z10 = this.f97362e == e.a.RUNNING;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public void l(d dVar, d dVar2) {
        this.f97360c = dVar;
        this.f97361d = dVar2;
    }

    @Override // com.bumptech.glide.request.d
    public void pause() {
        synchronized (this.f97359b) {
            try {
                if (!this.f97363f.k()) {
                    this.f97363f = e.a.PAUSED;
                    this.f97361d.pause();
                }
                if (!this.f97362e.k()) {
                    this.f97362e = e.a.PAUSED;
                    this.f97360c.pause();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.d
    public void s() {
        synchronized (this.f97359b) {
            try {
                this.f97364g = true;
                try {
                    if (this.f97362e != e.a.SUCCESS) {
                        e.a aVar = this.f97363f;
                        e.a aVar2 = e.a.RUNNING;
                        if (aVar != aVar2) {
                            this.f97363f = aVar2;
                            this.f97361d.s();
                        }
                    }
                    if (this.f97364g) {
                        e.a aVar3 = this.f97362e;
                        e.a aVar4 = e.a.RUNNING;
                        if (aVar3 != aVar4) {
                            this.f97362e = aVar4;
                            this.f97360c.s();
                        }
                    }
                    this.f97364g = false;
                } catch (Throwable th2) {
                    this.f97364g = false;
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
