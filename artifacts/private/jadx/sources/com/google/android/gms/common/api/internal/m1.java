package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes4.dex */
public final class m1 implements e2, y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lock f106123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Condition f106124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f106125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.common.g f106126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l1 f106127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Map f106128f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    final com.google.android.gms.common.internal.h f106130h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final Map f106131i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.p0
    final com.google.android.gms.common.api.a.AbstractC0967a f106132j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile j1 f106133k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f106135m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final i1 f106136n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final d2 f106137o;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Map f106129g = new HashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.p0
    private ConnectionResult f106134l = null;

    public m1(Context context, i1 i1Var, Lock lock, Looper looper, com.google.android.gms.common.g gVar, Map map, @androidx.annotation.p0 com.google.android.gms.common.internal.h hVar, Map map2, @androidx.annotation.p0 com.google.android.gms.common.api.a.AbstractC0967a abstractC0967a, ArrayList arrayList, d2 d2Var) {
        this.f106125c = context;
        this.f106123a = lock;
        this.f106126d = gVar;
        this.f106128f = map;
        this.f106130h = hVar;
        this.f106131i = map2;
        this.f106132j = abstractC0967a;
        this.f106136n = i1Var;
        this.f106137o = d2Var;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((x3) arrayList.get(i10)).a(this);
        }
        this.f106127e = new l1(this, looper);
        this.f106124b = lock.newCondition();
        this.f106133k = new a1(this);
    }

    @Override // com.google.android.gms.common.api.internal.y3
    public final void L(@NonNull ConnectionResult connectionResult, @NonNull com.google.android.gms.common.api.a aVar, boolean z10) {
        this.f106123a.lock();
        try {
            this.f106133k.h(connectionResult, aVar, z10);
            Lock lock = this.f106123a;
        } finally {
            this.f106123a.unlock();
        }
    }

    final void c() {
        this.f106123a.lock();
        try {
            this.f106136n.R();
            this.f106133k = new n0(this);
            this.f106133k.a();
            this.f106124b.signalAll();
            this.f106123a.unlock();
        } catch (Throwable th2) {
            this.f106123a.unlock();
            throw th2;
        }
    }

    final void d() throws Throwable {
        m1 m1Var;
        this.f106123a.lock();
        try {
            m1Var = this;
            try {
                m1Var.f106133k = new z0(m1Var, this.f106130h, this.f106131i, this.f106126d, this.f106132j, this.f106123a, this.f106125c);
                m1Var.f106133k.a();
                m1Var.f106124b.signalAll();
                m1Var.f106123a.unlock();
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                m1Var.f106123a.unlock();
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
            m1Var = this;
        }
    }

    final void e(@androidx.annotation.p0 ConnectionResult connectionResult) {
        this.f106123a.lock();
        try {
            this.f106134l = connectionResult;
            this.f106133k = new a1(this);
            this.f106133k.a();
            this.f106124b.signalAll();
        } finally {
            this.f106123a.unlock();
        }
    }

    final void f(k1 k1Var) {
        l1 l1Var = this.f106127e;
        l1Var.sendMessage(l1Var.obtainMessage(1, k1Var));
    }

    final void g(RuntimeException runtimeException) {
        l1 l1Var = this.f106127e;
        l1Var.sendMessage(l1Var.obtainMessage(2, runtimeException));
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void i(@androidx.annotation.p0 Bundle bundle) {
        this.f106123a.lock();
        try {
            this.f106133k.g(bundle);
            this.f106123a.unlock();
        } catch (Throwable th2) {
            this.f106123a.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void k(int i10) {
        this.f106123a.lock();
        try {
            this.f106133k.c(i10);
            this.f106123a.unlock();
        } catch (Throwable th2) {
            this.f106123a.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.internal.e2
    public final ConnectionResult l() {
        p();
        while (this.f106133k instanceof z0) {
            try {
                this.f106124b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        if (this.f106133k instanceof n0) {
            return ConnectionResult.f105824i3;
        }
        ConnectionResult connectionResult = this.f106134l;
        return connectionResult != null ? connectionResult : new ConnectionResult(13, null);
    }

    @Override // com.google.android.gms.common.api.internal.e2
    public final boolean m(x xVar) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.e2
    public final e.a n(@NonNull e.a aVar) {
        aVar.s();
        this.f106133k.d(aVar);
        return aVar;
    }

    @Override // com.google.android.gms.common.api.internal.e2
    public final e.a o(@NonNull e.a aVar) {
        aVar.s();
        return this.f106133k.f(aVar);
    }

    @Override // com.google.android.gms.common.api.internal.e2
    public final void p() {
        this.f106133k.b();
    }

    @Override // com.google.android.gms.common.api.internal.e2
    public final void q() {
        if (this.f106133k instanceof n0) {
            ((n0) this.f106133k).j();
        }
    }

    @Override // com.google.android.gms.common.api.internal.e2
    public final void r() {
    }

    @Override // com.google.android.gms.common.api.internal.e2
    public final void s() {
        if (this.f106133k.e()) {
            this.f106129g.clear();
        }
    }

    @Override // com.google.android.gms.common.api.internal.e2
    public final void t(String str, @androidx.annotation.p0 FileDescriptor fileDescriptor, PrintWriter printWriter, @androidx.annotation.p0 String[] strArr) {
        printWriter.append((CharSequence) str).append("mState=").println(this.f106133k);
        for (com.google.android.gms.common.api.a aVar : this.f106131i.keySet()) {
            String strValueOf = String.valueOf(str);
            printWriter.append((CharSequence) str).append((CharSequence) aVar.d()).println(":");
            ((com.google.android.gms.common.api.a.f) com.google.android.gms.common.internal.w.r((com.google.android.gms.common.api.a.f) this.f106128f.get(aVar.b()))).m(strValueOf.concat("  "), fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.e2
    @androidx.annotation.p0
    public final ConnectionResult u(@NonNull com.google.android.gms.common.api.a aVar) {
        Map map = this.f106128f;
        com.google.android.gms.common.api.a.c cVarB = aVar.b();
        if (map.containsKey(cVarB)) {
            if (((com.google.android.gms.common.api.a.f) this.f106128f.get(cVarB)).isConnected()) {
                return ConnectionResult.f105824i3;
            }
            if (this.f106129g.containsKey(cVarB)) {
                return (ConnectionResult) this.f106129g.get(cVarB);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.common.api.internal.e2
    public final boolean v() {
        return this.f106133k instanceof z0;
    }

    @Override // com.google.android.gms.common.api.internal.e2
    public final ConnectionResult w(long j10, TimeUnit timeUnit) {
        p();
        long nanos = timeUnit.toNanos(j10);
        while (this.f106133k instanceof z0) {
            if (nanos <= 0) {
                s();
                return new ConnectionResult(14, null);
            }
            try {
                nanos = this.f106124b.awaitNanos(nanos);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
            Thread.currentThread().interrupt();
            return new ConnectionResult(15, null);
        }
        if (this.f106133k instanceof n0) {
            return ConnectionResult.f105824i3;
        }
        ConnectionResult connectionResult = this.f106134l;
        return connectionResult != null ? connectionResult : new ConnectionResult(13, null);
    }

    @Override // com.google.android.gms.common.api.internal.e2
    public final boolean x() {
        return this.f106133k instanceof n0;
    }
}
