package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes4.dex */
final class d4 implements e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f105987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i1 f105988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Looper f105989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m1 f105990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m1 f105991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f105992f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    private final com.google.android.gms.common.api.a.f f105994h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    private Bundle f105995i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Lock f105999m;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f105993g = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.p0
    private ConnectionResult f105996j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.p0
    private ConnectionResult f105997k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f105998l = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f106000n = 0;

    private d4(Context context, i1 i1Var, Lock lock, Looper looper, com.google.android.gms.common.g gVar, Map map, Map map2, com.google.android.gms.common.internal.h hVar, com.google.android.gms.common.api.a.AbstractC0967a abstractC0967a, @androidx.annotation.p0 com.google.android.gms.common.api.a.f fVar, ArrayList arrayList, ArrayList arrayList2, Map map3, Map map4) {
        c4 c4Var = null;
        this.f105987a = context;
        this.f105988b = i1Var;
        this.f105999m = lock;
        this.f105989c = looper;
        this.f105994h = fVar;
        this.f105990d = new m1(context, i1Var, lock, looper, gVar, map2, null, map4, null, arrayList2, new a4(this, c4Var));
        this.f105991e = new m1(context, i1Var, lock, looper, gVar, map, hVar, map3, abstractC0967a, arrayList, new b4(this, c4Var));
        androidx.collection.a aVar = new androidx.collection.a();
        Iterator it = map2.keySet().iterator();
        while (it.hasNext()) {
            aVar.put((com.google.android.gms.common.api.a.c) it.next(), this.f105990d);
        }
        Iterator it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            aVar.put((com.google.android.gms.common.api.a.c) it2.next(), this.f105991e);
        }
        this.f105992f = Collections.unmodifiableMap(aVar);
    }

    static /* bridge */ /* synthetic */ void A(d4 d4Var, int i10, boolean z10) {
        d4Var.f105988b.a(i10, z10);
        d4Var.f105997k = null;
        d4Var.f105996j = null;
    }

    static /* bridge */ /* synthetic */ void B(d4 d4Var, Bundle bundle) {
        Bundle bundle2 = d4Var.f105995i;
        if (bundle2 == null) {
            d4Var.f105995i = bundle;
        } else {
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
        }
    }

    static /* bridge */ /* synthetic */ void C(d4 d4Var) {
        ConnectionResult connectionResult;
        if (!e(d4Var.f105996j)) {
            if (d4Var.f105996j != null && e(d4Var.f105997k)) {
                d4Var.f105991e.s();
                d4Var.a((ConnectionResult) com.google.android.gms.common.internal.w.r(d4Var.f105996j));
                return;
            }
            ConnectionResult connectionResult2 = d4Var.f105996j;
            if (connectionResult2 == null || (connectionResult = d4Var.f105997k) == null) {
                return;
            }
            if (d4Var.f105991e.f106135m < d4Var.f105990d.f106135m) {
                connectionResult2 = connectionResult;
            }
            d4Var.a(connectionResult2);
            return;
        }
        if (e(d4Var.f105997k) || d4Var.c()) {
            int i10 = d4Var.f106000n;
            if (i10 == 1) {
                d4Var.b();
            } else if (i10 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
            } else {
                ((i1) com.google.android.gms.common.internal.w.r(d4Var.f105988b)).b(d4Var.f105995i);
                d4Var.b();
            }
            d4Var.f106000n = 0;
            return;
        }
        ConnectionResult connectionResult3 = d4Var.f105997k;
        if (connectionResult3 != null) {
            if (d4Var.f106000n == 1) {
                d4Var.b();
            } else {
                d4Var.a(connectionResult3);
                d4Var.f105990d.s();
            }
        }
    }

    @androidx.annotation.p0
    private final PendingIntent E() {
        com.google.android.gms.common.api.a.f fVar = this.f105994h;
        if (fVar == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f105987a, System.identityHashCode(this.f105988b), fVar.p(), com.google.android.gms.internal.base.l.f107948a | androidx.media3.common.j.W0);
    }

    private final void a(ConnectionResult connectionResult) {
        int i10 = this.f106000n;
        if (i10 == 1) {
            b();
        } else if (i10 != 2) {
            Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
        } else {
            this.f105988b.c(connectionResult);
            b();
        }
        this.f106000n = 0;
    }

    private final void b() {
        Iterator it = this.f105993g.iterator();
        while (it.hasNext()) {
            ((x) it.next()).onComplete();
        }
        this.f105993g.clear();
    }

    private final boolean c() {
        ConnectionResult connectionResult = this.f105997k;
        return connectionResult != null && connectionResult.O1() == 4;
    }

    private final boolean d(e.a aVar) {
        m1 m1Var = (m1) this.f105992f.get(aVar.y());
        com.google.android.gms.common.internal.w.s(m1Var, "GoogleApiClient is not configured to use the API required for this call.");
        return m1Var.equals(this.f105991e);
    }

    private static boolean e(@androidx.annotation.p0 ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.f2();
    }

    public static d4 g(Context context, i1 i1Var, Lock lock, Looper looper, com.google.android.gms.common.g gVar, Map map, com.google.android.gms.common.internal.h hVar, Map map2, com.google.android.gms.common.api.a.AbstractC0967a abstractC0967a, ArrayList arrayList) {
        androidx.collection.a aVar = new androidx.collection.a();
        androidx.collection.a aVar2 = new androidx.collection.a();
        com.google.android.gms.common.api.a.f fVar = null;
        for (Map.Entry entry : map.entrySet()) {
            com.google.android.gms.common.api.a.f fVar2 = (com.google.android.gms.common.api.a.f) entry.getValue();
            if (true == fVar2.b()) {
                fVar = fVar2;
            }
            if (fVar2.h()) {
                aVar.put((com.google.android.gms.common.api.a.c) entry.getKey(), fVar2);
            } else {
                aVar2.put((com.google.android.gms.common.api.a.c) entry.getKey(), fVar2);
            }
        }
        com.google.android.gms.common.internal.w.y(!aVar.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        androidx.collection.a aVar3 = new androidx.collection.a();
        androidx.collection.a aVar4 = new androidx.collection.a();
        for (com.google.android.gms.common.api.a aVar5 : map2.keySet()) {
            com.google.android.gms.common.api.a.c cVarB = aVar5.b();
            if (aVar.containsKey(cVarB)) {
                aVar3.put(aVar5, (Boolean) map2.get(aVar5));
            } else {
                if (!aVar2.containsKey(cVarB)) {
                    throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                }
                aVar4.put(aVar5, (Boolean) map2.get(aVar5));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            x3 x3Var = (x3) arrayList.get(i10);
            if (aVar3.containsKey(x3Var.f106264a)) {
                arrayList2.add(x3Var);
            } else {
                if (!aVar4.containsKey(x3Var.f106264a)) {
                    throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                }
                arrayList3.add(x3Var);
            }
        }
        return new d4(context, i1Var, lock, looper, gVar, aVar, aVar2, hVar, abstractC0967a, fVar, arrayList2, arrayList3, aVar3, aVar4);
    }

    @Override // com.google.android.gms.common.api.internal.e2
    public final ConnectionResult l() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.api.internal.e2
    public final boolean m(x xVar) {
        this.f105999m.lock();
        try {
            boolean z10 = false;
            if (v() || x()) {
                if (!this.f105991e.x()) {
                    this.f105993g.add(xVar);
                    z10 = true;
                    if (this.f106000n == 0) {
                        this.f106000n = 1;
                    }
                    this.f105997k = null;
                    this.f105991e.p();
                }
            }
            return z10;
        } finally {
            this.f105999m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.e2
    public final e.a n(@NonNull e.a aVar) {
        if (!d(aVar)) {
            this.f105990d.n(aVar);
            return aVar;
        }
        if (c()) {
            aVar.b(new Status(4, (String) null, E()));
            return aVar;
        }
        this.f105991e.n(aVar);
        return aVar;
    }

    @Override // com.google.android.gms.common.api.internal.e2
    public final e.a o(@NonNull e.a aVar) {
        if (!d(aVar)) {
            return this.f105990d.o(aVar);
        }
        if (!c()) {
            return this.f105991e.o(aVar);
        }
        aVar.b(new Status(4, (String) null, E()));
        return aVar;
    }

    @Override // com.google.android.gms.common.api.internal.e2
    public final void p() {
        this.f106000n = 2;
        this.f105998l = false;
        this.f105997k = null;
        this.f105996j = null;
        this.f105990d.p();
        this.f105991e.p();
    }

    @Override // com.google.android.gms.common.api.internal.e2
    public final void q() {
        this.f105990d.q();
        this.f105991e.q();
    }

    @Override // com.google.android.gms.common.api.internal.e2
    public final void r() {
        this.f105999m.lock();
        try {
            boolean zV = v();
            this.f105991e.s();
            this.f105997k = new ConnectionResult(4);
            if (zV) {
                new com.google.android.gms.internal.base.q(this.f105989c).post(new z3(this));
            } else {
                b();
            }
            this.f105999m.unlock();
        } catch (Throwable th2) {
            this.f105999m.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.internal.e2
    public final void s() {
        this.f105997k = null;
        this.f105996j = null;
        this.f106000n = 0;
        this.f105990d.s();
        this.f105991e.s();
        b();
    }

    @Override // com.google.android.gms.common.api.internal.e2
    public final void t(String str, @androidx.annotation.p0 FileDescriptor fileDescriptor, PrintWriter printWriter, @androidx.annotation.p0 String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.f105991e.t(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.f105990d.t(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    @Override // com.google.android.gms.common.api.internal.e2
    @androidx.annotation.p0
    public final ConnectionResult u(@NonNull com.google.android.gms.common.api.a aVar) {
        if (com.google.android.gms.common.internal.u.b(this.f105992f.get(aVar.b()), this.f105991e)) {
            return c() ? new ConnectionResult(4, E()) : this.f105991e.u(aVar);
        }
        return this.f105990d.u(aVar);
    }

    @Override // com.google.android.gms.common.api.internal.e2
    public final boolean v() {
        this.f105999m.lock();
        try {
            return this.f106000n == 2;
        } finally {
            this.f105999m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.e2
    public final ConnectionResult w(long j10, @NonNull TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.api.internal.e2
    public final boolean x() {
        this.f105999m.lock();
        try {
            boolean z10 = false;
            if (this.f105990d.x() && (this.f105991e.x() || c() || this.f106000n == 1)) {
                z10 = true;
            }
            Lock lock = this.f105999m;
            return z10;
        } finally {
            this.f105999m.unlock();
        }
    }
}
