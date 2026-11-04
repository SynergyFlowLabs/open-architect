package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.v;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class e3<R extends com.google.android.gms.common.api.v> extends com.google.android.gms.common.api.z<R> implements com.google.android.gms.common.api.w<R> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final WeakReference f106014g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d3 f106015h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    private com.google.android.gms.common.api.y f106008a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private e3 f106009b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private volatile com.google.android.gms.common.api.x f106010c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    private com.google.android.gms.common.api.p f106011d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f106012e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private Status f106013f = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f106016i = false;

    public e3(WeakReference weakReference) {
        com.google.android.gms.common.internal.w.s(weakReference, "GoogleApiClient reference must not be null");
        this.f106014g = weakReference;
        com.google.android.gms.common.api.l lVar = (com.google.android.gms.common.api.l) weakReference.get();
        this.f106015h = new d3(this, lVar != null ? lVar.r() : Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(Status status) {
        synchronized (this.f106012e) {
            try {
                this.f106013f = status;
                o(status);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void n() {
        if (this.f106008a == null && this.f106010c == null) {
            return;
        }
        com.google.android.gms.common.api.l lVar = (com.google.android.gms.common.api.l) this.f106014g.get();
        if (!this.f106016i && this.f106008a != null && lVar != null) {
            lVar.H(this);
            this.f106016i = true;
        }
        Status status = this.f106013f;
        if (status != null) {
            o(status);
            return;
        }
        com.google.android.gms.common.api.p pVar = this.f106011d;
        if (pVar != null) {
            pVar.h(this);
        }
    }

    private final void o(Status status) {
        synchronized (this.f106012e) {
            try {
                com.google.android.gms.common.api.y yVar = this.f106008a;
                if (yVar != null) {
                    ((e3) com.google.android.gms.common.internal.w.r(this.f106009b)).m((Status) com.google.android.gms.common.internal.w.s(yVar.b(status), "onFailure must not return null"));
                } else if (p()) {
                    ((com.google.android.gms.common.api.x) com.google.android.gms.common.internal.w.r(this.f106010c)).b(status);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final boolean p() {
        return (this.f106010c == null || ((com.google.android.gms.common.api.l) this.f106014g.get()) == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(com.google.android.gms.common.api.v vVar) {
        if (vVar instanceof com.google.android.gms.common.api.r) {
            try {
                ((com.google.android.gms.common.api.r) vVar).release();
            } catch (RuntimeException unused) {
                "Unable to release ".concat(String.valueOf(vVar));
            }
        }
    }

    @Override // com.google.android.gms.common.api.w
    public final void a(com.google.android.gms.common.api.v vVar) {
        synchronized (this.f106012e) {
            try {
                if (!vVar.t().q2()) {
                    m(vVar.t());
                    q(vVar);
                } else if (this.f106008a != null) {
                    s2.a().submit(new c3(this, vVar));
                } else if (p()) {
                    ((com.google.android.gms.common.api.x) com.google.android.gms.common.internal.w.r(this.f106010c)).c(vVar);
                }
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.common.api.z
    public final void b(@NonNull com.google.android.gms.common.api.x<? super R> xVar) {
        synchronized (this.f106012e) {
            try {
                com.google.android.gms.common.internal.w.y(this.f106010c == null, "Cannot call andFinally() twice.");
                com.google.android.gms.common.internal.w.y(this.f106008a == null, "Cannot call then() and andFinally() on the same TransformedResult.");
                this.f106010c = xVar;
                n();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.api.z
    @NonNull
    public final <S extends com.google.android.gms.common.api.v> com.google.android.gms.common.api.z<S> c(@NonNull com.google.android.gms.common.api.y<? super R, ? extends S> yVar) {
        e3 e3Var;
        synchronized (this.f106012e) {
            try {
                com.google.android.gms.common.internal.w.y(this.f106008a == null, "Cannot call then() twice.");
                com.google.android.gms.common.internal.w.y(this.f106010c == null, "Cannot call then() and andFinally() on the same TransformedResult.");
                this.f106008a = yVar;
                e3Var = new e3(this.f106014g);
                this.f106009b = e3Var;
                n();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return e3Var;
    }

    final void k() {
        this.f106010c = null;
    }

    public final void l(com.google.android.gms.common.api.p pVar) {
        synchronized (this.f106012e) {
            try {
                this.f106011d = pVar;
                n();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
