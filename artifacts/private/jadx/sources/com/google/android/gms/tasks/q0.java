package com.google.android.gms.tasks;

import android.app.Activity;
import androidx.annotation.NonNull;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class q0<TResult> extends Task<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f111011a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l0 f111012b = new l0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f111013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f111014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private Object f111015e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Exception f111016f;

    q0() {
    }

    private final void C() {
        com.google.android.gms.common.internal.w.y(this.f111013c, "Task is not yet complete");
    }

    private final void D() {
        if (this.f111014d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void E() {
        if (this.f111013c) {
            throw d.a(this);
        }
    }

    private final void F() {
        synchronized (this.f111011a) {
            try {
                if (this.f111013c) {
                    this.f111012b.b(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean A(@NonNull Exception exc) {
        com.google.android.gms.common.internal.w.s(exc, "Exception must not be null");
        synchronized (this.f111011a) {
            try {
                if (this.f111013c) {
                    return false;
                }
                this.f111013c = true;
                this.f111016f = exc;
                this.f111012b.b(this);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean B(@androidx.annotation.p0 Object obj) {
        synchronized (this.f111011a) {
            try {
                if (this.f111013c) {
                    return false;
                }
                this.f111013c = true;
                this.f111015e = obj;
                this.f111012b.b(this);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> a(@NonNull Activity activity, @NonNull e eVar) {
        b0 b0Var = new b0(m.f111003a, eVar);
        this.f111012b.a(b0Var);
        p0.m(activity).n(b0Var);
        F();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnCompleteListener(@NonNull OnCompleteListener<TResult> onCompleteListener) {
        this.f111012b.a(new d0(m.f111003a, onCompleteListener));
        F();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> b(@NonNull e eVar) {
        c(m.f111003a, eVar);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> c(@NonNull Executor executor, @NonNull e eVar) {
        this.f111012b.a(new b0(executor, eVar));
        F();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> d(@NonNull Activity activity, @NonNull OnCompleteListener<TResult> onCompleteListener) {
        d0 d0Var = new d0(m.f111003a, onCompleteListener);
        this.f111012b.a(d0Var);
        p0.m(activity).n(d0Var);
        F();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> e(@NonNull Executor executor, @NonNull OnCompleteListener<TResult> onCompleteListener) {
        this.f111012b.a(new d0(executor, onCompleteListener));
        F();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> f(@NonNull Activity activity, @NonNull f fVar) {
        f0 f0Var = new f0(m.f111003a, fVar);
        this.f111012b.a(f0Var);
        p0.m(activity).n(f0Var);
        F();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> g(@NonNull f fVar) {
        h(m.f111003a, fVar);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> h(@NonNull Executor executor, @NonNull f fVar) {
        this.f111012b.a(new f0(executor, fVar));
        F();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> i(@NonNull Activity activity, @NonNull g<? super TResult> gVar) {
        h0 h0Var = new h0(m.f111003a, gVar);
        this.f111012b.a(h0Var);
        p0.m(activity).n(h0Var);
        F();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> j(@NonNull g<? super TResult> gVar) {
        k(m.f111003a, gVar);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> k(@NonNull Executor executor, @NonNull g<? super TResult> gVar) {
        this.f111012b.a(new h0(executor, gVar));
        F();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final <TContinuationResult> Task<TContinuationResult> l(@NonNull c<TResult, TContinuationResult> cVar) {
        return m(m.f111003a, cVar);
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final <TContinuationResult> Task<TContinuationResult> m(@NonNull Executor executor, @NonNull c<TResult, TContinuationResult> cVar) {
        q0 q0Var = new q0();
        this.f111012b.a(new x(executor, cVar, q0Var));
        F();
        return q0Var;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final <TContinuationResult> Task<TContinuationResult> n(@NonNull c<TResult, Task<TContinuationResult>> cVar) {
        return o(m.f111003a, cVar);
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final <TContinuationResult> Task<TContinuationResult> o(@NonNull Executor executor, @NonNull c<TResult, Task<TContinuationResult>> cVar) {
        q0 q0Var = new q0();
        this.f111012b.a(new z(executor, cVar, q0Var));
        F();
        return q0Var;
    }

    @Override // com.google.android.gms.tasks.Task
    @androidx.annotation.p0
    public final Exception p() {
        Exception exc;
        synchronized (this.f111011a) {
            try {
                exc = this.f111016f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final TResult q() {
        TResult tresult;
        synchronized (this.f111011a) {
            try {
                C();
                D();
                Exception exc = this.f111016f;
                if (exc != null) {
                    throw new j(exc);
                }
                tresult = (TResult) this.f111015e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.Task
    public final <X extends Throwable> TResult r(@NonNull Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.f111011a) {
            try {
                C();
                D();
                if (cls.isInstance(this.f111016f)) {
                    throw cls.cast(this.f111016f);
                }
                Exception exc = this.f111016f;
                if (exc != null) {
                    throw new j(exc);
                }
                tresult = (TResult) this.f111015e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean s() {
        return this.f111014d;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean t() {
        boolean z10;
        synchronized (this.f111011a) {
            try {
                z10 = this.f111013c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean u() {
        boolean z10;
        synchronized (this.f111011a) {
            try {
                z10 = false;
                if (this.f111013c && !this.f111014d && this.f111016f == null) {
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final <TContinuationResult> Task<TContinuationResult> v(@NonNull k<TResult, TContinuationResult> kVar) {
        Executor executor = m.f111003a;
        q0 q0Var = new q0();
        this.f111012b.a(new j0(executor, kVar, q0Var));
        F();
        return q0Var;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final <TContinuationResult> Task<TContinuationResult> w(Executor executor, k<TResult, TContinuationResult> kVar) {
        q0 q0Var = new q0();
        this.f111012b.a(new j0(executor, kVar, q0Var));
        F();
        return q0Var;
    }

    public final void x(@NonNull Exception exc) {
        com.google.android.gms.common.internal.w.s(exc, "Exception must not be null");
        synchronized (this.f111011a) {
            try {
                E();
                this.f111013c = true;
                this.f111016f = exc;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f111012b.b(this);
    }

    public final void y(@androidx.annotation.p0 Object obj) {
        synchronized (this.f111011a) {
            E();
            this.f111013c = true;
            this.f111015e = obj;
        }
        this.f111012b.b(this);
    }

    public final boolean z() {
        synchronized (this.f111011a) {
            try {
                if (this.f111013c) {
                    return false;
                }
                this.f111013c = true;
                this.f111014d = true;
                this.f111012b.b(this);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
