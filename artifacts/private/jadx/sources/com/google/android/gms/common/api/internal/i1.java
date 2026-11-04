package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes4.dex */
public final class i1 extends com.google.android.gms.common.api.l implements d2 {
    final g3 A;
    private final com.google.android.gms.common.internal.s0 B;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lock f106068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.common.internal.t0 f106069f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f106071h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Context f106072i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Looper f106073j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile boolean f106075l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f106076m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f106077n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final g1 f106078o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final com.google.android.gms.common.f f106079p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.l1
    @androidx.annotation.p0
    b2 f106080q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final Map f106081r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    Set f106082s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final com.google.android.gms.common.internal.h f106083t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final Map f106084u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final com.google.android.gms.common.api.a.AbstractC0967a f106085v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final p f106086w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final ArrayList f106087x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Integer f106088y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.p0
    Set f106089z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private e2 f106070g = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.l1
    final Queue f106074k = new LinkedList();

    public i1(Context context, Lock lock, Looper looper, com.google.android.gms.common.internal.h hVar, com.google.android.gms.common.f fVar, com.google.android.gms.common.api.a.AbstractC0967a abstractC0967a, Map map, List list, List list2, Map map2, int i10, int i11, ArrayList arrayList) {
        this.f106076m = true != com.google.android.gms.common.util.e.c() ? 120000L : 10000L;
        this.f106077n = 5000L;
        this.f106082s = new HashSet();
        this.f106086w = new p();
        this.f106088y = null;
        this.f106089z = null;
        b1 b1Var = new b1(this);
        this.B = b1Var;
        this.f106072i = context;
        this.f106068e = lock;
        this.f106069f = new com.google.android.gms.common.internal.t0(looper, b1Var);
        this.f106073j = looper;
        this.f106078o = new g1(this, looper);
        this.f106079p = fVar;
        this.f106071h = i10;
        if (i10 >= 0) {
            this.f106088y = Integer.valueOf(i11);
        }
        this.f106084u = map;
        this.f106081r = map2;
        this.f106087x = arrayList;
        this.A = new g3();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f106069f.f((com.google.android.gms.common.api.l.b) it.next());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            this.f106069f.g((com.google.android.gms.common.api.l.c) it2.next());
        }
        this.f106083t = hVar;
        this.f106085v = abstractC0967a;
    }

    public static int K(Iterable iterable, boolean z10) {
        Iterator it = iterable.iterator();
        boolean zH = false;
        boolean zB = false;
        while (it.hasNext()) {
            com.google.android.gms.common.api.a.f fVar = (com.google.android.gms.common.api.a.f) it.next();
            zH |= fVar.h();
            zB |= fVar.b();
        }
        if (zH) {
            return (zB && z10) ? 2 : 1;
        }
        return 3;
    }

    static String N(int i10) {
        if (i10 == 1) {
            return "SIGN_IN_MODE_REQUIRED";
        }
        if (i10 != 2) {
            return i10 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE";
        }
        return "SIGN_IN_MODE_OPTIONAL";
    }

    static /* bridge */ /* synthetic */ void P(i1 i1Var) {
        i1Var.f106068e.lock();
        try {
            if (i1Var.f106075l) {
                i1Var.U();
            }
        } finally {
            i1Var.f106068e.unlock();
        }
    }

    static /* bridge */ /* synthetic */ void Q(i1 i1Var) {
        i1Var.f106068e.lock();
        try {
            if (i1Var.R()) {
                i1Var.U();
            }
        } finally {
            i1Var.f106068e.unlock();
        }
    }

    private final void S(int i10) {
        Integer num = this.f106088y;
        if (num == null) {
            this.f106088y = Integer.valueOf(i10);
        } else if (num.intValue() != i10) {
            throw new IllegalStateException("Cannot use sign-in mode: " + N(i10) + ". Mode was already set to " + N(this.f106088y.intValue()));
        }
        if (this.f106070g != null) {
            return;
        }
        boolean zH = false;
        boolean zB = false;
        for (com.google.android.gms.common.api.a.f fVar : this.f106081r.values()) {
            zH |= fVar.h();
            zB |= fVar.b();
        }
        int iIntValue = this.f106088y.intValue();
        if (iIntValue != 1) {
            if (iIntValue == 2 && zH) {
                this.f106070g = d4.g(this.f106072i, this, this.f106068e, this.f106073j, this.f106079p, this.f106081r, this.f106083t, this.f106084u, this.f106085v, this.f106087x);
                return;
            }
        } else {
            if (!zH) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            }
            if (zB) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
        }
        this.f106070g = new m1(this.f106072i, this, this.f106068e, this.f106073j, this.f106079p, this.f106081r, this.f106083t, this.f106084u, this.f106085v, this.f106087x, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(com.google.android.gms.common.api.l lVar, a0 a0Var, boolean z10) {
        com.google.android.gms.common.internal.service.a.f106629d.a(lVar).h(new e1(this, a0Var, z10, lVar));
    }

    private final void U() {
        this.f106069f.b();
        ((e2) com.google.android.gms.common.internal.w.r(this.f106070g)).p();
    }

    @Override // com.google.android.gms.common.api.l
    public final void A() {
        i();
        g();
    }

    @Override // com.google.android.gms.common.api.l
    public final void B(@NonNull com.google.android.gms.common.api.l.b bVar) {
        this.f106069f.f(bVar);
    }

    @Override // com.google.android.gms.common.api.l
    public final void C(@NonNull com.google.android.gms.common.api.l.c cVar) {
        this.f106069f.g(cVar);
    }

    @Override // com.google.android.gms.common.api.l
    public final <L> o<L> D(@NonNull L l10) {
        this.f106068e.lock();
        try {
            o<L> oVarD = this.f106086w.d(l10, this.f106073j, "NO_TYPE");
            this.f106068e.unlock();
            return oVarD;
        } catch (Throwable th2) {
            this.f106068e.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.l
    public final void E(@NonNull androidx.fragment.app.s sVar) {
        l lVar = new l((Activity) sVar);
        if (this.f106071h < 0) {
            throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
        }
        o3.u(lVar).w(this.f106071h);
    }

    @Override // com.google.android.gms.common.api.l
    public final void F(@NonNull com.google.android.gms.common.api.l.b bVar) {
        this.f106069f.h(bVar);
    }

    @Override // com.google.android.gms.common.api.l
    public final void G(@NonNull com.google.android.gms.common.api.l.c cVar) {
        this.f106069f.i(cVar);
    }

    @Override // com.google.android.gms.common.api.l
    public final void H(e3 e3Var) {
        this.f106068e.lock();
        try {
            if (this.f106089z == null) {
                this.f106089z = new HashSet();
            }
            this.f106089z.add(e3Var);
        } finally {
            this.f106068e.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.l
    public final void I(e3 e3Var) {
        this.f106068e.lock();
        try {
            Set set = this.f106089z;
            if (set == null) {
                Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", new Exception());
            } else if (set.remove(e3Var)) {
                this.f106068e.lock();
                try {
                    Set set2 = this.f106089z;
                    if (set2 == null) {
                        this.f106068e.unlock();
                    } else {
                        boolean zIsEmpty = set2.isEmpty();
                        this.f106068e.unlock();
                        if (zIsEmpty) {
                        }
                    }
                    e2 e2Var = this.f106070g;
                    if (e2Var != null) {
                        e2Var.q();
                    }
                } finally {
                    this.f106068e.unlock();
                }
            } else {
                Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", new Exception());
            }
        } catch (Throwable th2) {
            this.f106068e.unlock();
            throw th2;
        }
    }

    final String M() {
        StringWriter stringWriter = new StringWriter();
        j("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    final boolean R() {
        if (!this.f106075l) {
            return false;
        }
        this.f106075l = false;
        this.f106078o.removeMessages(2);
        this.f106078o.removeMessages(1);
        b2 b2Var = this.f106080q;
        if (b2Var != null) {
            b2Var.b();
            this.f106080q = null;
        }
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.d2
    public final void a(int i10, boolean z10) {
        if (i10 == 1) {
            if (!z10 && !this.f106075l) {
                this.f106075l = true;
                if (this.f106080q == null && !com.google.android.gms.common.util.e.c()) {
                    try {
                        this.f106080q = this.f106079p.H(this.f106072i.getApplicationContext(), new h1(this));
                    } catch (SecurityException unused) {
                    }
                }
                g1 g1Var = this.f106078o;
                g1Var.sendMessageDelayed(g1Var.obtainMessage(1), this.f106076m);
                g1 g1Var2 = this.f106078o;
                g1Var2.sendMessageDelayed(g1Var2.obtainMessage(2), this.f106077n);
            }
            i10 = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.A.f106033a.toArray(new BasePendingResult[0])) {
            basePendingResult.l(g3.f106032c);
        }
        this.f106069f.e(i10);
        this.f106069f.a();
        if (i10 == 2) {
            U();
        }
    }

    @Override // com.google.android.gms.common.api.internal.d2
    public final void b(@androidx.annotation.p0 Bundle bundle) {
        while (!this.f106074k.isEmpty()) {
            m((e.a) this.f106074k.remove());
        }
        this.f106069f.d(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.d2
    public final void c(ConnectionResult connectionResult) {
        if (!this.f106079p.l(this.f106072i, connectionResult.O1())) {
            R();
        }
        if (this.f106075l) {
            return;
        }
        this.f106069f.c(connectionResult);
        this.f106069f.a();
    }

    @Override // com.google.android.gms.common.api.l
    public final ConnectionResult d() {
        boolean z10 = true;
        com.google.android.gms.common.internal.w.y(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        this.f106068e.lock();
        try {
            if (this.f106071h >= 0) {
                if (this.f106088y == null) {
                    z10 = false;
                }
                com.google.android.gms.common.internal.w.y(z10, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f106088y;
                if (num == null) {
                    this.f106088y = Integer.valueOf(K(this.f106081r.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            S(((Integer) com.google.android.gms.common.internal.w.r(this.f106088y)).intValue());
            this.f106069f.b();
            ConnectionResult connectionResultL = ((e2) com.google.android.gms.common.internal.w.r(this.f106070g)).l();
            this.f106068e.unlock();
            return connectionResultL;
        } catch (Throwable th2) {
            this.f106068e.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.l
    public final ConnectionResult e(long j10, @NonNull TimeUnit timeUnit) {
        com.google.android.gms.common.internal.w.y(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        com.google.android.gms.common.internal.w.s(timeUnit, "TimeUnit must not be null");
        this.f106068e.lock();
        try {
            Integer num = this.f106088y;
            if (num == null) {
                this.f106088y = Integer.valueOf(K(this.f106081r.values(), false));
            } else if (num.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            S(((Integer) com.google.android.gms.common.internal.w.r(this.f106088y)).intValue());
            this.f106069f.b();
            ConnectionResult connectionResultW = ((e2) com.google.android.gms.common.internal.w.r(this.f106070g)).w(j10, timeUnit);
            this.f106068e.unlock();
            return connectionResultW;
        } catch (Throwable th2) {
            this.f106068e.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.l
    public final com.google.android.gms.common.api.p<Status> f() {
        com.google.android.gms.common.internal.w.y(u(), "GoogleApiClient is not connected yet.");
        Integer num = this.f106088y;
        boolean z10 = true;
        if (num != null && num.intValue() == 2) {
            z10 = false;
        }
        com.google.android.gms.common.internal.w.y(z10, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        a0 a0Var = new a0(this);
        if (this.f106081r.containsKey(com.google.android.gms.common.internal.service.a.f106626a)) {
            T(this, a0Var, false);
            return a0Var;
        }
        AtomicReference atomicReference = new AtomicReference();
        c1 c1Var = new c1(this, atomicReference, a0Var);
        d1 d1Var = new d1(this, a0Var);
        com.google.android.gms.common.api.l.a aVar = new com.google.android.gms.common.api.l.a(this.f106072i);
        aVar.a(com.google.android.gms.common.internal.service.a.f106627b);
        aVar.e(c1Var);
        aVar.f(d1Var);
        aVar.m(this.f106078o);
        com.google.android.gms.common.api.l lVarH = aVar.h();
        atomicReference.set(lVarH);
        lVarH.g();
        return a0Var;
    }

    @Override // com.google.android.gms.common.api.l
    public final void g() {
        this.f106068e.lock();
        try {
            int i10 = 2;
            boolean z10 = false;
            if (this.f106071h >= 0) {
                com.google.android.gms.common.internal.w.y(this.f106088y != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f106088y;
                if (num == null) {
                    this.f106088y = Integer.valueOf(K(this.f106081r.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            int iIntValue = ((Integer) com.google.android.gms.common.internal.w.r(this.f106088y)).intValue();
            this.f106068e.lock();
            try {
                if (iIntValue != 3 && iIntValue != 1) {
                    if (iIntValue != 2) {
                        i10 = iIntValue;
                    }
                    com.google.android.gms.common.internal.w.b(z10, "Illegal sign-in mode: " + i10);
                    S(i10);
                    U();
                    this.f106068e.unlock();
                    this.f106068e.unlock();
                    return;
                }
                i10 = iIntValue;
                com.google.android.gms.common.internal.w.b(z10, "Illegal sign-in mode: " + i10);
                S(i10);
                U();
                this.f106068e.unlock();
                this.f106068e.unlock();
                return;
            } catch (Throwable th2) {
                this.f106068e.unlock();
                throw th2;
            }
            z10 = true;
        } catch (Throwable th3) {
            this.f106068e.unlock();
            throw th3;
        }
    }

    @Override // com.google.android.gms.common.api.l
    public final void h(int i10) {
        this.f106068e.lock();
        boolean z10 = true;
        if (i10 != 3 && i10 != 1) {
            if (i10 == 2) {
                i10 = 2;
            } else {
                z10 = false;
            }
        }
        try {
            com.google.android.gms.common.internal.w.b(z10, "Illegal sign-in mode: " + i10);
            S(i10);
            U();
        } finally {
            this.f106068e.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.l
    public final void i() {
        this.f106068e.lock();
        try {
            this.A.b();
            e2 e2Var = this.f106070g;
            if (e2Var != null) {
                e2Var.s();
            }
            this.f106086w.e();
            for (e.a aVar : this.f106074k) {
                aVar.v(null);
                aVar.f();
            }
            this.f106074k.clear();
            if (this.f106070g != null) {
                R();
                this.f106069f.a();
            }
        } finally {
            this.f106068e.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.l
    public final void j(String str, @androidx.annotation.p0 FileDescriptor fileDescriptor, PrintWriter printWriter, @androidx.annotation.p0 String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.f106072i);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.f106075l);
        printWriter.append(" mWorkQueue.size()=").print(this.f106074k.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.A.f106033a.size());
        e2 e2Var = this.f106070g;
        if (e2Var != null) {
            e2Var.t(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.l
    public final <A extends com.google.android.gms.common.api.a.b, R extends com.google.android.gms.common.api.v, T extends e.a<R, A>> T l(@NonNull T t10) {
        com.google.android.gms.common.api.a<?> aVarX = t10.x();
        com.google.android.gms.common.internal.w.b(this.f106081r.containsKey(t10.y()), "GoogleApiClient is not configured to use " + (aVarX != null ? aVarX.d() : "the API") + " required for this call.");
        this.f106068e.lock();
        try {
            e2 e2Var = this.f106070g;
            if (e2Var == null) {
                this.f106074k.add(t10);
            } else {
                t10 = (T) e2Var.n(t10);
            }
            return t10;
        } finally {
            this.f106068e.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.l
    public final <A extends com.google.android.gms.common.api.a.b, T extends e.a<? extends com.google.android.gms.common.api.v, A>> T m(@NonNull T t10) {
        Map map = this.f106081r;
        com.google.android.gms.common.api.a<?> aVarX = t10.x();
        com.google.android.gms.common.internal.w.b(map.containsKey(t10.y()), "GoogleApiClient is not configured to use " + (aVarX != null ? aVarX.d() : "the API") + " required for this call.");
        this.f106068e.lock();
        try {
            e2 e2Var = this.f106070g;
            if (e2Var == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (this.f106075l) {
                this.f106074k.add(t10);
                while (!this.f106074k.isEmpty()) {
                    e.a aVar = (e.a) this.f106074k.remove();
                    this.A.a(aVar);
                    aVar.b(Status.f105888h);
                }
            } else {
                t10 = (T) e2Var.o(t10);
            }
            this.f106068e.unlock();
            return t10;
        } catch (Throwable th2) {
            this.f106068e.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.l
    @NonNull
    public final <C extends com.google.android.gms.common.api.a.f> C o(@NonNull com.google.android.gms.common.api.a.c<C> cVar) {
        C c10 = (C) this.f106081r.get(cVar);
        com.google.android.gms.common.internal.w.s(c10, "Appropriate Api was not requested.");
        return c10;
    }

    @Override // com.google.android.gms.common.api.l
    @NonNull
    public final ConnectionResult p(@NonNull com.google.android.gms.common.api.a<?> aVar) {
        ConnectionResult connectionResult;
        this.f106068e.lock();
        try {
            if (!u() && !this.f106075l) {
                throw new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
            }
            if (!this.f106081r.containsKey(aVar.b())) {
                throw new IllegalArgumentException(aVar.d() + " was never registered with GoogleApiClient");
            }
            ConnectionResult connectionResultU = ((e2) com.google.android.gms.common.internal.w.r(this.f106070g)).u(aVar);
            if (connectionResultU != null) {
                this.f106068e.unlock();
                return connectionResultU;
            }
            if (this.f106075l) {
                connectionResult = ConnectionResult.f105824i3;
            } else {
                M();
                Log.wtf("GoogleApiClientImpl", aVar.d() + " requested in getConnectionResult is not connected but is not present in the failed  connections map", new Exception());
                connectionResult = new ConnectionResult(8, null);
            }
            this.f106068e.unlock();
            return connectionResult;
        } catch (Throwable th2) {
            this.f106068e.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.l
    public final Context q() {
        return this.f106072i;
    }

    @Override // com.google.android.gms.common.api.l
    public final Looper r() {
        return this.f106073j;
    }

    @Override // com.google.android.gms.common.api.l
    public final boolean s(@NonNull com.google.android.gms.common.api.a<?> aVar) {
        return this.f106081r.containsKey(aVar.b());
    }

    @Override // com.google.android.gms.common.api.l
    public final boolean t(@NonNull com.google.android.gms.common.api.a<?> aVar) {
        if (!u()) {
            return false;
        }
        com.google.android.gms.common.api.a.f fVar = (com.google.android.gms.common.api.a.f) this.f106081r.get(aVar.b());
        return fVar != null && fVar.isConnected();
    }

    @Override // com.google.android.gms.common.api.l
    public final boolean u() {
        e2 e2Var = this.f106070g;
        return e2Var != null && e2Var.x();
    }

    @Override // com.google.android.gms.common.api.l
    public final boolean v() {
        e2 e2Var = this.f106070g;
        return e2Var != null && e2Var.v();
    }

    @Override // com.google.android.gms.common.api.l
    public final boolean w(@NonNull com.google.android.gms.common.api.l.b bVar) {
        return this.f106069f.j(bVar);
    }

    @Override // com.google.android.gms.common.api.l
    public final boolean x(@NonNull com.google.android.gms.common.api.l.c cVar) {
        return this.f106069f.k(cVar);
    }

    @Override // com.google.android.gms.common.api.l
    public final boolean y(x xVar) {
        e2 e2Var = this.f106070g;
        return e2Var != null && e2Var.m(xVar);
    }

    @Override // com.google.android.gms.common.api.l
    public final void z() {
        e2 e2Var = this.f106070g;
        if (e2Var != null) {
            e2Var.r();
        }
    }
}
