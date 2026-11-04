package com.bumptech.glide.request;

import androidx.annotation.b0;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements e, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f97301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final e f97302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile d f97303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile d f97304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @b0("requestLock")
    private e.a f97305e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @b0("requestLock")
    private e.a f97306f;

    public b(Object obj, @p0 e eVar) {
        e.a aVar = e.a.CLEARED;
        this.f97305e = aVar;
        this.f97306f = aVar;
        this.f97301a = obj;
        this.f97302b = eVar;
    }

    @b0("requestLock")
    private boolean i(d dVar) {
        if (dVar.equals(this.f97303c)) {
            return true;
        }
        return this.f97305e == e.a.FAILED && dVar.equals(this.f97304d);
    }

    @b0("requestLock")
    private boolean j() {
        e eVar = this.f97302b;
        return eVar == null || eVar.h(this);
    }

    @b0("requestLock")
    private boolean k() {
        e eVar = this.f97302b;
        return eVar == null || eVar.c(this);
    }

    @b0("requestLock")
    private boolean l() {
        e eVar = this.f97302b;
        return eVar == null || eVar.d(this);
    }

    @Override // com.bumptech.glide.request.e, com.bumptech.glide.request.d
    public boolean a() {
        boolean z10;
        synchronized (this.f97301a) {
            try {
                z10 = this.f97303c.a() || this.f97304d.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.e
    public void b(d dVar) {
        synchronized (this.f97301a) {
            try {
                if (dVar.equals(this.f97303c)) {
                    this.f97305e = e.a.SUCCESS;
                } else if (dVar.equals(this.f97304d)) {
                    this.f97306f = e.a.SUCCESS;
                }
                e eVar = this.f97302b;
                if (eVar != null) {
                    eVar.b(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public boolean c(d dVar) {
        boolean z10;
        synchronized (this.f97301a) {
            try {
                z10 = k() && i(dVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.d
    public void clear() {
        synchronized (this.f97301a) {
            try {
                e.a aVar = e.a.CLEARED;
                this.f97305e = aVar;
                this.f97303c.clear();
                if (this.f97306f != aVar) {
                    this.f97306f = aVar;
                    this.f97304d.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public boolean d(d dVar) {
        boolean z10;
        synchronized (this.f97301a) {
            try {
                z10 = l() && i(dVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.e
    public void e(d dVar) {
        synchronized (this.f97301a) {
            try {
                if (dVar.equals(this.f97304d)) {
                    this.f97306f = e.a.FAILED;
                    e eVar = this.f97302b;
                    if (eVar != null) {
                        eVar.e(this);
                    }
                    return;
                }
                this.f97305e = e.a.FAILED;
                e.a aVar = this.f97306f;
                e.a aVar2 = e.a.RUNNING;
                if (aVar != aVar2) {
                    this.f97306f = aVar2;
                    this.f97304d.s();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.d
    public boolean f() {
        boolean z10;
        synchronized (this.f97301a) {
            try {
                e.a aVar = this.f97305e;
                e.a aVar2 = e.a.CLEARED;
                z10 = aVar == aVar2 && this.f97306f == aVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.d
    public boolean g(d dVar) {
        if (dVar instanceof b) {
            b bVar = (b) dVar;
            if (this.f97303c.g(bVar.f97303c) && this.f97304d.g(bVar.f97304d)) {
                return true;
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
        synchronized (this.f97301a) {
            try {
                e eVar = this.f97302b;
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
        synchronized (this.f97301a) {
            try {
                z10 = j() && i(dVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.d
    public boolean isComplete() {
        boolean z10;
        synchronized (this.f97301a) {
            try {
                e.a aVar = this.f97305e;
                e.a aVar2 = e.a.SUCCESS;
                z10 = aVar == aVar2 || this.f97306f == aVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.d
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f97301a) {
            try {
                e.a aVar = this.f97305e;
                e.a aVar2 = e.a.RUNNING;
                z10 = aVar == aVar2 || this.f97306f == aVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public void m(d dVar, d dVar2) {
        this.f97303c = dVar;
        this.f97304d = dVar2;
    }

    @Override // com.bumptech.glide.request.d
    public void pause() {
        synchronized (this.f97301a) {
            try {
                e.a aVar = this.f97305e;
                e.a aVar2 = e.a.RUNNING;
                if (aVar == aVar2) {
                    this.f97305e = e.a.PAUSED;
                    this.f97303c.pause();
                }
                if (this.f97306f == aVar2) {
                    this.f97306f = e.a.PAUSED;
                    this.f97304d.pause();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.d
    public void s() {
        synchronized (this.f97301a) {
            try {
                e.a aVar = this.f97305e;
                e.a aVar2 = e.a.RUNNING;
                if (aVar != aVar2) {
                    this.f97305e = aVar2;
                    this.f97303c.s();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
