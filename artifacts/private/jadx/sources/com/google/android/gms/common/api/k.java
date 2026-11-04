package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.m1;
import androidx.annotation.p0;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.internal.u1;
import com.google.android.gms.common.api.internal.x2;
import com.google.android.gms.common.api.internal.z1;
import com.google.android.gms.tasks.Task;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k<O extends com.google.android.gms.common.api.a.d> implements m<O> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f106295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private final String f106296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private final com.google.android.gms.common.wrappers.a f106297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.common.api.a f106298f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.common.api.a.d f106299g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.common.api.internal.c f106300h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Looper f106301i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f106302j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final l f106303k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.google.android.gms.common.api.internal.z f106304l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    protected final com.google.android.gms.common.api.internal.i f106305m;

    @g6.a
    public static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        @g6.a
        public static final a f106306c = new C0970a().a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final com.google.android.gms.common.api.internal.z f106307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public final Looper f106308b;

        /* JADX INFO: renamed from: com.google.android.gms.common.api.k$a$a, reason: collision with other inner class name */
        @g6.a
        public static class C0970a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private com.google.android.gms.common.api.internal.z f106309a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Looper f106310b;

            @g6.a
            public C0970a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @NonNull
            @g6.a
            public a a() {
                if (this.f106309a == null) {
                    this.f106309a = new com.google.android.gms.common.api.internal.b();
                }
                if (this.f106310b == null) {
                    this.f106310b = Looper.getMainLooper();
                }
                return new a(this.f106309a, this.f106310b);
            }

            @NonNull
            @g6.a
            public C0970a b(@NonNull Looper looper) {
                com.google.android.gms.common.internal.w.s(looper, "Looper must not be null.");
                this.f106310b = looper;
                return this;
            }

            @NonNull
            @g6.a
            public C0970a c(@NonNull com.google.android.gms.common.api.internal.z zVar) {
                com.google.android.gms.common.internal.w.s(zVar, "StatusExceptionMapper must not be null.");
                this.f106309a = zVar;
                return this;
            }
        }

        @g6.a
        private a(com.google.android.gms.common.api.internal.z zVar, Account account, Looper looper) {
            this.f106307a = zVar;
            this.f106308b = looper;
        }
    }

    @androidx.annotation.l0
    @g6.a
    public k(@NonNull Activity activity, @NonNull com.google.android.gms.common.api.a<O> aVar, @NonNull O o10, @NonNull a aVar2) {
        this(activity, activity, aVar, o10, aVar2);
    }

    private final com.google.android.gms.common.api.internal.e.a I0(int i10, @NonNull com.google.android.gms.common.api.internal.e.a aVar) {
        aVar.s();
        this.f106305m.H(this, i10, aVar);
        return aVar;
    }

    private final Task J0(int i10, @NonNull com.google.android.gms.common.api.internal.b0 b0Var) {
        com.google.android.gms.tasks.l lVar = new com.google.android.gms.tasks.l();
        this.f106305m.I(this, i10, b0Var, lVar, this.f106304l);
        return lVar.a();
    }

    @NonNull
    @g6.a
    public Context A0() {
        return this.f106295c;
    }

    @p0
    @g6.a
    protected String B0() {
        return this.f106296d;
    }

    @p0
    @g6.a
    @Deprecated
    protected String C0() {
        return this.f106296d;
    }

    @NonNull
    @g6.a
    public Looper D0() {
        return this.f106301i;
    }

    @NonNull
    @g6.a
    public <L> com.google.android.gms.common.api.internal.o<L> E0(@NonNull L l10, @NonNull String str) {
        return com.google.android.gms.common.api.internal.p.a(l10, this.f106301i, str);
    }

    public final int F0() {
        return this.f106302j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m1
    public final com.google.android.gms.common.api.a.f G0(Looper looper, u1 u1Var) {
        com.google.android.gms.common.internal.h hVarA = m0().a();
        com.google.android.gms.common.api.a.f fVarC = ((com.google.android.gms.common.api.a.AbstractC0967a) com.google.android.gms.common.internal.w.r(this.f106298f.a())).c(this.f106295c, looper, hVarA, this.f106299g, u1Var, u1Var);
        com.google.android.gms.common.wrappers.a aVar = this.f106297e;
        if (aVar != null && (fVarC instanceof com.google.android.gms.common.internal.f)) {
            ((com.google.android.gms.common.internal.f) fVarC).X(aVar);
            return fVarC;
        }
        if (aVar != null && (fVarC instanceof com.google.android.gms.common.api.internal.q)) {
            ((com.google.android.gms.common.api.internal.q) fVarC).A(aVar);
            return fVarC;
        }
        String strB0 = B0();
        if (strB0 != null && (fVarC instanceof com.google.android.gms.common.internal.f)) {
            ((com.google.android.gms.common.internal.f) fVarC).Y(strB0);
        }
        if (strB0 != null && (fVarC instanceof com.google.android.gms.common.api.internal.q)) {
            ((com.google.android.gms.common.api.internal.q) fVarC).B(strB0);
        }
        return fVarC;
    }

    public final x2 H0(Context context, Handler handler) {
        return new x2(context, handler, m0().a());
    }

    @Override // com.google.android.gms.common.api.m
    @NonNull
    public final com.google.android.gms.common.api.internal.c<O> k0() {
        return this.f106300h;
    }

    @NonNull
    @g6.a
    public l l0() {
        return this.f106303k;
    }

    @NonNull
    @g6.a
    protected com.google.android.gms.common.internal.h.a m0() {
        Account accountR;
        GoogleSignInAccount googleSignInAccountB1;
        GoogleSignInAccount googleSignInAccountB2;
        com.google.android.gms.common.internal.h.a aVar = new com.google.android.gms.common.internal.h.a();
        com.google.android.gms.common.api.a.d dVar = this.f106299g;
        if (!(dVar instanceof com.google.android.gms.common.api.a.d.b) || (googleSignInAccountB2 = ((com.google.android.gms.common.api.a.d.b) dVar).B1()) == null) {
            com.google.android.gms.common.api.a.d dVar2 = this.f106299g;
            accountR = dVar2 instanceof com.google.android.gms.common.api.a.d.InterfaceC0968a ? ((com.google.android.gms.common.api.a.d.InterfaceC0968a) dVar2).r() : null;
        } else {
            accountR = googleSignInAccountB2.r();
        }
        aVar.d(accountR);
        com.google.android.gms.common.api.a.d dVar3 = this.f106299g;
        Set<Scope> setZ2 = (!(dVar3 instanceof com.google.android.gms.common.api.a.d.b) || (googleSignInAccountB1 = ((com.google.android.gms.common.api.a.d.b) dVar3).B1()) == null) ? Collections.EMPTY_SET : googleSignInAccountB1.z2();
        aVar.c(setZ2);
        aVar.e(this.f106295c.getClass().getName());
        aVar.b(this.f106295c.getPackageName());
        return aVar;
    }

    @NonNull
    @g6.a
    protected Task<Boolean> n0() {
        return this.f106305m.A(this);
    }

    @NonNull
    @g6.a
    public <A extends com.google.android.gms.common.api.a.b, T extends com.google.android.gms.common.api.internal.e.a<? extends v, A>> T o0(@NonNull T t10) {
        I0(2, t10);
        return t10;
    }

    @NonNull
    @g6.a
    public <TResult, A extends com.google.android.gms.common.api.a.b> Task<TResult> p0(@NonNull com.google.android.gms.common.api.internal.b0<A, TResult> b0Var) {
        return J0(2, b0Var);
    }

    @NonNull
    @g6.a
    public <A extends com.google.android.gms.common.api.a.b, T extends com.google.android.gms.common.api.internal.e.a<? extends v, A>> T q0(@NonNull T t10) {
        I0(0, t10);
        return t10;
    }

    @NonNull
    @g6.a
    public <TResult, A extends com.google.android.gms.common.api.a.b> Task<TResult> r0(@NonNull com.google.android.gms.common.api.internal.b0<A, TResult> b0Var) {
        return J0(0, b0Var);
    }

    @NonNull
    @g6.a
    @Deprecated
    public <A extends com.google.android.gms.common.api.a.b, T extends com.google.android.gms.common.api.internal.u<A, ?>, U extends com.google.android.gms.common.api.internal.d0<A, ?>> Task<Void> s0(@NonNull T t10, @NonNull U u10) {
        com.google.android.gms.common.internal.w.r(t10);
        com.google.android.gms.common.internal.w.r(u10);
        com.google.android.gms.common.internal.w.s(t10.b(), "Listener has already been released.");
        com.google.android.gms.common.internal.w.s(u10.a(), "Listener has already been released.");
        com.google.android.gms.common.internal.w.b(com.google.android.gms.common.internal.u.b(t10.b(), u10.a()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.f106305m.B(this, t10, u10, new Runnable() { // from class: com.google.android.gms.common.api.e0
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }

    @NonNull
    @g6.a
    public <A extends com.google.android.gms.common.api.a.b> Task<Void> t0(@NonNull com.google.android.gms.common.api.internal.v<A, ?> vVar) {
        com.google.android.gms.common.internal.w.r(vVar);
        com.google.android.gms.common.internal.w.s(vVar.f106230a.b(), "Listener has already been released.");
        com.google.android.gms.common.internal.w.s(vVar.f106231b.a(), "Listener has already been released.");
        return this.f106305m.B(this, vVar.f106230a, vVar.f106231b, vVar.f106232c);
    }

    @NonNull
    @g6.a
    public Task<Boolean> u0(@NonNull com.google.android.gms.common.api.internal.o.a<?> aVar) {
        return v0(aVar, 0);
    }

    @NonNull
    @g6.a
    public Task<Boolean> v0(@NonNull com.google.android.gms.common.api.internal.o.a<?> aVar, int i10) {
        com.google.android.gms.common.internal.w.s(aVar, "Listener key cannot be null.");
        return this.f106305m.C(this, aVar, i10);
    }

    @NonNull
    @g6.a
    public <A extends com.google.android.gms.common.api.a.b, T extends com.google.android.gms.common.api.internal.e.a<? extends v, A>> T w0(@NonNull T t10) {
        I0(1, t10);
        return t10;
    }

    @NonNull
    @g6.a
    public <TResult, A extends com.google.android.gms.common.api.a.b> Task<TResult> x0(@NonNull com.google.android.gms.common.api.internal.b0<A, TResult> b0Var) {
        return J0(1, b0Var);
    }

    @p0
    protected String y0(@NonNull Context context) {
        return null;
    }

    @NonNull
    @g6.a
    public O z0() {
        return (O) this.f106299g;
    }

    @g6.a
    @Deprecated
    public k(@NonNull Activity activity, @NonNull com.google.android.gms.common.api.a<O> aVar, @NonNull O o10, @NonNull com.google.android.gms.common.api.internal.z zVar) {
        a.C0970a c0970a = new a.C0970a();
        c0970a.c(zVar);
        c0970a.b(activity.getMainLooper());
        this(activity, (com.google.android.gms.common.api.a) aVar, (com.google.android.gms.common.api.a.d) o10, c0970a.a());
    }

    private k(@NonNull Context context, @p0 Activity activity, com.google.android.gms.common.api.a aVar, com.google.android.gms.common.api.a.d dVar, a aVar2) {
        String strY0;
        com.google.android.gms.common.internal.w.s(context, "Null context is not permitted.");
        com.google.android.gms.common.internal.w.s(aVar, "Api must not be null.");
        com.google.android.gms.common.internal.w.s(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context2 = (Context) com.google.android.gms.common.internal.w.s(context.getApplicationContext(), "The provided context did not have an application context.");
        this.f106295c = context2;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            strY0 = androidx.core.content.d.e(context);
        } else {
            strY0 = y0(context);
        }
        this.f106296d = strY0;
        this.f106297e = i10 >= 31 ? new com.google.android.gms.common.wrappers.a(context.getAttributionSource()) : null;
        this.f106298f = aVar;
        this.f106299g = dVar;
        this.f106301i = aVar2.f106308b;
        com.google.android.gms.common.api.internal.c cVarA = com.google.android.gms.common.api.internal.c.a(aVar, dVar, strY0);
        this.f106300h = cVarA;
        this.f106303k = new z1(this);
        com.google.android.gms.common.api.internal.i iVarX = com.google.android.gms.common.api.internal.i.x(context2);
        this.f106305m = iVarX;
        this.f106302j = iVarX.n();
        this.f106304l = aVar2.f106307a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            com.google.android.gms.common.api.internal.i0.v(activity, iVarX, cVarA);
        }
        iVarX.M(this);
    }

    @g6.a
    public k(@NonNull Context context, @NonNull com.google.android.gms.common.api.a<O> aVar, @NonNull O o10, @NonNull a aVar2) {
        this(context, null, aVar, o10, aVar2);
    }

    @g6.a
    @Deprecated
    public k(@NonNull Context context, @NonNull com.google.android.gms.common.api.a<O> aVar, @NonNull O o10, @NonNull com.google.android.gms.common.api.internal.z zVar) {
        a.C0970a c0970a = new a.C0970a();
        c0970a.c(zVar);
        this(context, aVar, o10, c0970a.a());
    }
}
