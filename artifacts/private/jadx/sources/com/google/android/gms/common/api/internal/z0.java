package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes4.dex */
public final class z0 implements j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m1 f106269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lock f106270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f106271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.common.g f106272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private ConnectionResult f106273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f106274f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f106276h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.p0
    private com.google.android.gms.signin.f f106279k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f106280l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f106281m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f106282n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.p0
    private com.google.android.gms.common.internal.o f106283o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f106284p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f106285q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.p0
    private final com.google.android.gms.common.internal.h f106286r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Map f106287s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.p0
    private final com.google.android.gms.common.api.a.AbstractC0967a f106288t;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f106275g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Bundle f106277i = new Bundle();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Set f106278j = new HashSet();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final ArrayList f106289u = new ArrayList();

    public z0(m1 m1Var, @androidx.annotation.p0 com.google.android.gms.common.internal.h hVar, Map map, com.google.android.gms.common.g gVar, @androidx.annotation.p0 com.google.android.gms.common.api.a.AbstractC0967a abstractC0967a, Lock lock, Context context) {
        this.f106269a = m1Var;
        this.f106286r = hVar;
        this.f106287s = map;
        this.f106272d = gVar;
        this.f106288t = abstractC0967a;
        this.f106270b = lock;
        this.f106271c = context;
    }

    static /* bridge */ /* synthetic */ void B(z0 z0Var, zak zakVar) {
        if (z0Var.o(0)) {
            ConnectionResult connectionResultO1 = zakVar.O1();
            if (!connectionResultO1.f2()) {
                if (!z0Var.q(connectionResultO1)) {
                    z0Var.l(connectionResultO1);
                    return;
                } else {
                    z0Var.i();
                    z0Var.n();
                    return;
                }
            }
            zav zavVar = (zav) com.google.android.gms.common.internal.w.r(zakVar.T1());
            ConnectionResult connectionResultO2 = zavVar.O1();
            if (!connectionResultO2.f2()) {
                String strValueOf = String.valueOf(connectionResultO2);
                Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(strValueOf), new Exception());
                z0Var.l(connectionResultO2);
                return;
            }
            z0Var.f106282n = true;
            z0Var.f106283o = (com.google.android.gms.common.internal.o) com.google.android.gms.common.internal.w.r(zavVar.T1());
            z0Var.f106284p = zavVar.b2();
            z0Var.f106285q = zavVar.e2();
            z0Var.n();
        }
    }

    private final void J() {
        ArrayList arrayList = this.f106289u;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((Future) arrayList.get(i10)).cancel(true);
        }
        this.f106289u.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        this.f106281m = false;
        this.f106269a.f106136n.f106082s = Collections.EMPTY_SET;
        for (com.google.android.gms.common.api.a.c cVar : this.f106278j) {
            if (!this.f106269a.f106129g.containsKey(cVar)) {
                m1 m1Var = this.f106269a;
                m1Var.f106129g.put(cVar, new ConnectionResult(17, null));
            }
        }
    }

    private final void j(boolean z10) {
        com.google.android.gms.signin.f fVar = this.f106279k;
        if (fVar != null) {
            if (fVar.isConnected() && z10) {
                fVar.c();
            }
            fVar.d();
            this.f106283o = null;
        }
    }

    private final void k() {
        Bundle bundle;
        this.f106269a.c();
        n1.a().execute(new o0(this));
        com.google.android.gms.signin.f fVar = this.f106279k;
        if (fVar != null) {
            if (this.f106284p) {
                fVar.o((com.google.android.gms.common.internal.o) com.google.android.gms.common.internal.w.r(this.f106283o), this.f106285q);
            }
            j(false);
        }
        Iterator it = this.f106269a.f106129g.keySet().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.a.f) com.google.android.gms.common.internal.w.r((com.google.android.gms.common.api.a.f) this.f106269a.f106128f.get((com.google.android.gms.common.api.a.c) it.next()))).d();
        }
        if (this.f106277i.isEmpty()) {
            bundle = null;
            int i10 = 4 & 0;
        } else {
            bundle = this.f106277i;
        }
        this.f106269a.f106137o.b(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(ConnectionResult connectionResult) {
        J();
        j(!connectionResult.e2());
        this.f106269a.e(connectionResult);
        this.f106269a.f106137o.c(connectionResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(ConnectionResult connectionResult, com.google.android.gms.common.api.a aVar, boolean z10) {
        int iB = aVar.c().b();
        if ((!z10 || connectionResult.e2() || this.f106272d.d(connectionResult.O1()) != null) && (this.f106273e == null || iB < this.f106274f)) {
            this.f106273e = connectionResult;
            this.f106274f = iB;
        }
        m1 m1Var = this.f106269a;
        m1Var.f106129g.put(aVar.b(), connectionResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        if (this.f106276h != 0) {
            return;
        }
        if (!this.f106281m || this.f106282n) {
            ArrayList arrayList = new ArrayList();
            this.f106275g = 1;
            this.f106276h = this.f106269a.f106128f.size();
            for (com.google.android.gms.common.api.a.c cVar : this.f106269a.f106128f.keySet()) {
                if (!this.f106269a.f106129g.containsKey(cVar)) {
                    arrayList.add((com.google.android.gms.common.api.a.f) this.f106269a.f106128f.get(cVar));
                } else if (p()) {
                    k();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.f106289u.add(n1.a().submit(new t0(this, arrayList)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean o(int i10) {
        if (this.f106275g == i10) {
            return true;
        }
        this.f106269a.f106136n.M();
        "Unexpected callback in ".concat(toString());
        r(this.f106275g);
        r(i10);
        new Exception();
        l(new ConnectionResult(8, null));
        int i11 = 3 | 0;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean p() {
        int i10 = this.f106276h - 1;
        this.f106276h = i10;
        if (i10 > 0) {
            return false;
        }
        if (i10 < 0) {
            this.f106269a.f106136n.M();
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            int i11 = 0 >> 0;
            l(new ConnectionResult(8, null));
            return false;
        }
        ConnectionResult connectionResult = this.f106273e;
        if (connectionResult == null) {
            return true;
        }
        this.f106269a.f106135m = this.f106274f;
        l(connectionResult);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean q(ConnectionResult connectionResult) {
        return this.f106280l && !connectionResult.e2();
    }

    private static final String r(int i10) {
        return i10 != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    static /* bridge */ /* synthetic */ Set y(z0 z0Var) {
        com.google.android.gms.common.internal.h hVar = z0Var.f106286r;
        if (hVar == null) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(hVar.i());
        Map mapN = z0Var.f106286r.n();
        for (com.google.android.gms.common.api.a aVar : mapN.keySet()) {
            m1 m1Var = z0Var.f106269a;
            if (!m1Var.f106129g.containsKey(aVar.b())) {
                hashSet.addAll(((com.google.android.gms.common.internal.k0) mapN.get(aVar)).f106594a);
            }
        }
        return hashSet;
    }

    @Override // com.google.android.gms.common.api.internal.j1
    public final void a() {
        this.f106269a.f106129g.clear();
        this.f106281m = false;
        y0 y0Var = null;
        this.f106273e = null;
        this.f106275g = 0;
        this.f106280l = true;
        this.f106282n = false;
        this.f106284p = false;
        HashMap map = new HashMap();
        boolean z10 = false;
        for (com.google.android.gms.common.api.a aVar : this.f106287s.keySet()) {
            com.google.android.gms.common.api.a.f fVar = (com.google.android.gms.common.api.a.f) com.google.android.gms.common.internal.w.r((com.google.android.gms.common.api.a.f) this.f106269a.f106128f.get(aVar.b()));
            z10 |= aVar.c().b() == 1;
            boolean zBooleanValue = ((Boolean) this.f106287s.get(aVar)).booleanValue();
            if (fVar.h()) {
                this.f106281m = true;
                if (zBooleanValue) {
                    this.f106278j.add(aVar.b());
                } else {
                    this.f106280l = false;
                }
            }
            map.put(fVar, new p0(this, aVar, zBooleanValue));
        }
        if (z10) {
            this.f106281m = false;
        }
        if (this.f106281m) {
            com.google.android.gms.common.internal.w.r(this.f106286r);
            com.google.android.gms.common.internal.w.r(this.f106288t);
            this.f106286r.o(Integer.valueOf(System.identityHashCode(this.f106269a.f106136n)));
            w0 w0Var = new w0(this, y0Var);
            com.google.android.gms.common.api.a.AbstractC0967a abstractC0967a = this.f106288t;
            Context context = this.f106271c;
            m1 m1Var = this.f106269a;
            com.google.android.gms.common.internal.h hVar = this.f106286r;
            this.f106279k = (com.google.android.gms.signin.f) abstractC0967a.c(context, m1Var.f106136n.r(), hVar, hVar.k(), w0Var, w0Var);
        }
        this.f106276h = this.f106269a.f106128f.size();
        this.f106289u.add(n1.a().submit(new s0(this, map)));
    }

    @Override // com.google.android.gms.common.api.internal.j1
    public final void b() {
    }

    @Override // com.google.android.gms.common.api.internal.j1
    public final void c(int i10) {
        l(new ConnectionResult(8, null));
    }

    @Override // com.google.android.gms.common.api.internal.j1
    public final e.a d(e.a aVar) {
        this.f106269a.f106136n.f106074k.add(aVar);
        return aVar;
    }

    @Override // com.google.android.gms.common.api.internal.j1
    public final boolean e() {
        J();
        int i10 = 6 | 1;
        j(true);
        this.f106269a.e(null);
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.j1
    public final e.a f(e.a aVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.common.api.internal.j1
    public final void g(@androidx.annotation.p0 Bundle bundle) {
        if (o(1)) {
            if (bundle != null) {
                this.f106277i.putAll(bundle);
            }
            if (p()) {
                k();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.j1
    public final void h(ConnectionResult connectionResult, com.google.android.gms.common.api.a aVar, boolean z10) {
        if (o(1)) {
            m(connectionResult, aVar, z10);
            if (p()) {
                k();
            }
        }
    }
}
