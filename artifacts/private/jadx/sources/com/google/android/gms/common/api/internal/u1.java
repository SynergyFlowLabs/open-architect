package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class u1 implements com.google.android.gms.common.api.l.b, com.google.android.gms.common.api.l.c, y3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.common.api.a.f f106217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f106218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h0 f106219d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f106222g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    private final x2 f106223h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f106224i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ i f106228m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Queue f106216a = new LinkedList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f106220e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f106221f = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f106225j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.p0
    private ConnectionResult f106226k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f106227l = 0;

    @androidx.annotation.m1
    public u1(i iVar, com.google.android.gms.common.api.k kVar) {
        this.f106228m = iVar;
        com.google.android.gms.common.api.a.f fVarG0 = kVar.G0(iVar.f106064n.getLooper(), this);
        this.f106217b = fVarG0;
        this.f106218c = kVar.k0();
        this.f106219d = new h0();
        this.f106222g = kVar.F0();
        if (fVarG0.h()) {
            this.f106223h = kVar.H0(iVar.f106055e, iVar.f106064n);
        } else {
            this.f106223h = null;
        }
    }

    static /* bridge */ /* synthetic */ void C(u1 u1Var, v1 v1Var) {
        if (u1Var.f106225j.contains(v1Var) && !u1Var.f106224i) {
            if (u1Var.f106217b.isConnected()) {
                u1Var.g();
            } else {
                u1Var.F();
            }
        }
    }

    static /* bridge */ /* synthetic */ void D(u1 u1Var, v1 v1Var) {
        Feature[] featureArrG;
        if (u1Var.f106225j.remove(v1Var)) {
            u1Var.f106228m.f106064n.removeMessages(15, v1Var);
            u1Var.f106228m.f106064n.removeMessages(16, v1Var);
            Feature feature = v1Var.f106242b;
            ArrayList arrayList = new ArrayList(u1Var.f106216a.size());
            for (m3 m3Var : u1Var.f106216a) {
                if ((m3Var instanceof g2) && (featureArrG = ((g2) m3Var).g(u1Var)) != null && com.google.android.gms.common.util.b.d(featureArrG, feature)) {
                    arrayList.add(m3Var);
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                m3 m3Var2 = (m3) arrayList.get(i10);
                u1Var.f106216a.remove(m3Var2);
                m3Var2.b(new com.google.android.gms.common.api.a0(feature));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @androidx.annotation.m1
    @androidx.annotation.p0
    private final Feature c(@androidx.annotation.p0 Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            Feature[] featureArrV = this.f106217b.v();
            if (featureArrV == null) {
                featureArrV = new Feature[0];
            }
            androidx.collection.a aVar = new androidx.collection.a(featureArrV.length);
            for (Feature feature : featureArrV) {
                aVar.put(feature.O1(), Long.valueOf(feature.T1()));
            }
            for (Feature feature2 : featureArr) {
                Long l10 = (Long) aVar.get(feature2.O1());
                if (l10 == null || l10.longValue() < feature2.T1()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    @androidx.annotation.m1
    private final void d(ConnectionResult connectionResult) {
        Iterator it = this.f106220e.iterator();
        while (it.hasNext()) {
            ((p3) it.next()).c(this.f106218c, connectionResult, com.google.android.gms.common.internal.u.b(connectionResult, ConnectionResult.f105824i3) ? this.f106217b.q() : null);
        }
        this.f106220e.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.m1
    public final void e(Status status) {
        com.google.android.gms.common.internal.w.h(this.f106228m.f106064n);
        f(status, null, false);
    }

    @androidx.annotation.m1
    private final void f(@androidx.annotation.p0 Status status, @androidx.annotation.p0 Exception exc, boolean z10) {
        com.google.android.gms.common.internal.w.h(this.f106228m.f106064n);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f106216a.iterator();
        while (it.hasNext()) {
            m3 m3Var = (m3) it.next();
            if (!z10 || m3Var.f106141a == 2) {
                if (status != null) {
                    m3Var.a(status);
                } else {
                    m3Var.b(exc);
                }
                it.remove();
            }
        }
    }

    @androidx.annotation.m1
    private final void g() {
        ArrayList arrayList = new ArrayList(this.f106216a);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            m3 m3Var = (m3) arrayList.get(i10);
            if (!this.f106217b.isConnected()) {
                return;
            }
            if (p(m3Var)) {
                this.f106216a.remove(m3Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.m1
    public final void h() {
        E();
        d(ConnectionResult.f105824i3);
        o();
        Iterator it = this.f106221f.values().iterator();
        while (it.hasNext()) {
            n2 n2Var = (n2) it.next();
            if (c(n2Var.f106145a.c()) != null) {
                it.remove();
            } else {
                try {
                    n2Var.f106145a.d(this.f106217b, new com.google.android.gms.tasks.l<>());
                } catch (DeadObjectException unused) {
                    k(3);
                    this.f106217b.e("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException | RuntimeException unused2) {
                    it.remove();
                }
            }
        }
        g();
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.m1
    public final void j(int i10) {
        E();
        this.f106224i = true;
        this.f106219d.e(i10, this.f106217b.w());
        c cVar = this.f106218c;
        i iVar = this.f106228m;
        iVar.f106064n.sendMessageDelayed(Message.obtain(iVar.f106064n, 9, cVar), 5000L);
        c cVar2 = this.f106218c;
        i iVar2 = this.f106228m;
        iVar2.f106064n.sendMessageDelayed(Message.obtain(iVar2.f106064n, 11, cVar2), 120000L);
        this.f106228m.f106057g.c();
        Iterator it = this.f106221f.values().iterator();
        while (it.hasNext()) {
            ((n2) it.next()).f106147c.run();
        }
    }

    private final void l() {
        this.f106228m.f106064n.removeMessages(12, this.f106218c);
        c cVar = this.f106218c;
        i iVar = this.f106228m;
        iVar.f106064n.sendMessageDelayed(iVar.f106064n.obtainMessage(12, cVar), this.f106228m.f106051a);
    }

    @androidx.annotation.m1
    private final void m(m3 m3Var) {
        m3Var.d(this.f106219d, a());
        try {
            m3Var.c(this);
        } catch (DeadObjectException unused) {
            k(1);
            this.f106217b.e("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    @androidx.annotation.m1
    private final void o() {
        if (this.f106224i) {
            i iVar = this.f106228m;
            iVar.f106064n.removeMessages(11, this.f106218c);
            i iVar2 = this.f106228m;
            iVar2.f106064n.removeMessages(9, this.f106218c);
            int i10 = 4 | 0;
            this.f106224i = false;
        }
    }

    @androidx.annotation.m1
    private final boolean p(m3 m3Var) {
        if (!(m3Var instanceof g2)) {
            m(m3Var);
            return true;
        }
        g2 g2Var = (g2) m3Var;
        Feature featureC = c(g2Var.g(this));
        if (featureC == null) {
            m(m3Var);
            return true;
        }
        this.f106217b.getClass();
        featureC.O1();
        featureC.T1();
        if (!this.f106228m.f106065o || !g2Var.f(this)) {
            g2Var.b(new com.google.android.gms.common.api.a0(featureC));
            return true;
        }
        v1 v1Var = new v1(this.f106218c, featureC, null);
        int iIndexOf = this.f106225j.indexOf(v1Var);
        if (iIndexOf >= 0) {
            v1 v1Var2 = (v1) this.f106225j.get(iIndexOf);
            this.f106228m.f106064n.removeMessages(15, v1Var2);
            i iVar = this.f106228m;
            iVar.f106064n.sendMessageDelayed(Message.obtain(iVar.f106064n, 15, v1Var2), 5000L);
        } else {
            this.f106225j.add(v1Var);
            i iVar2 = this.f106228m;
            iVar2.f106064n.sendMessageDelayed(Message.obtain(iVar2.f106064n, 15, v1Var), 5000L);
            i iVar3 = this.f106228m;
            iVar3.f106064n.sendMessageDelayed(Message.obtain(iVar3.f106064n, 16, v1Var), 120000L);
            ConnectionResult connectionResult = new ConnectionResult(2, null);
            if (!q(connectionResult)) {
                this.f106228m.h(connectionResult, this.f106222g);
            }
        }
        return false;
    }

    @androidx.annotation.m1
    private final boolean q(@NonNull ConnectionResult connectionResult) {
        synchronized (i.f106049v) {
            try {
                i iVar = this.f106228m;
                if (iVar.f106061k == null || !iVar.f106062l.contains(this.f106218c)) {
                    return false;
                }
                this.f106228m.f106061k.t(connectionResult, this.f106222g);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.m1
    public final boolean r(boolean z10) {
        com.google.android.gms.common.internal.w.h(this.f106228m.f106064n);
        if (!this.f106217b.isConnected() || !this.f106221f.isEmpty()) {
            return false;
        }
        if (!this.f106219d.g()) {
            this.f106217b.e("Timing out service connection.");
            return true;
        }
        if (!z10) {
            return false;
        }
        l();
        return false;
    }

    @androidx.annotation.m1
    public final void E() {
        com.google.android.gms.common.internal.w.h(this.f106228m.f106064n);
        this.f106226k = null;
    }

    @androidx.annotation.m1
    public final void F() {
        com.google.android.gms.common.internal.w.h(this.f106228m.f106064n);
        if (!this.f106217b.isConnected() && !this.f106217b.f()) {
            try {
                i iVar = this.f106228m;
                int iB = iVar.f106057g.b(iVar.f106055e, this.f106217b);
                if (iB != 0) {
                    ConnectionResult connectionResult = new ConnectionResult(iB, null);
                    this.f106217b.getClass();
                    connectionResult.toString();
                    I(connectionResult, null);
                    return;
                }
                i iVar2 = this.f106228m;
                com.google.android.gms.common.api.a.f fVar = this.f106217b;
                x1 x1Var = new x1(iVar2, fVar, this.f106218c);
                if (fVar.h()) {
                    ((x2) com.google.android.gms.common.internal.w.r(this.f106223h)).v(x1Var);
                }
                try {
                    this.f106217b.g(x1Var);
                } catch (SecurityException e10) {
                    I(new ConnectionResult(10), e10);
                }
            } catch (IllegalStateException e11) {
                I(new ConnectionResult(10), e11);
            }
        }
    }

    @androidx.annotation.m1
    public final void G(m3 m3Var) {
        com.google.android.gms.common.internal.w.h(this.f106228m.f106064n);
        if (this.f106217b.isConnected()) {
            if (p(m3Var)) {
                l();
                return;
            } else {
                this.f106216a.add(m3Var);
                return;
            }
        }
        this.f106216a.add(m3Var);
        ConnectionResult connectionResult = this.f106226k;
        if (connectionResult == null || !connectionResult.e2()) {
            F();
        } else {
            I(this.f106226k, null);
        }
    }

    @androidx.annotation.m1
    final void H() {
        this.f106227l++;
    }

    @androidx.annotation.m1
    public final void I(@NonNull ConnectionResult connectionResult, @androidx.annotation.p0 Exception exc) {
        com.google.android.gms.common.internal.w.h(this.f106228m.f106064n);
        x2 x2Var = this.f106223h;
        if (x2Var != null) {
            x2Var.w();
        }
        E();
        this.f106228m.f106057g.c();
        d(connectionResult);
        if ((this.f106217b instanceof com.google.android.gms.common.internal.service.q) && connectionResult.O1() != 24) {
            this.f106228m.f106052b = true;
            i iVar = this.f106228m;
            iVar.f106064n.sendMessageDelayed(iVar.f106064n.obtainMessage(19), 300000L);
        }
        if (connectionResult.O1() == 4) {
            e(i.f106048t);
            return;
        }
        if (connectionResult.O1() == 25) {
            e(i.i(this.f106218c, connectionResult));
            return;
        }
        if (this.f106216a.isEmpty()) {
            this.f106226k = connectionResult;
            return;
        }
        if (exc != null) {
            com.google.android.gms.common.internal.w.h(this.f106228m.f106064n);
            f(null, exc, false);
            return;
        }
        if (!this.f106228m.f106065o) {
            e(i.i(this.f106218c, connectionResult));
            return;
        }
        f(i.i(this.f106218c, connectionResult), null, true);
        if (this.f106216a.isEmpty() || q(connectionResult) || this.f106228m.h(connectionResult, this.f106222g)) {
            return;
        }
        if (connectionResult.O1() == 18) {
            this.f106224i = true;
        }
        if (!this.f106224i) {
            e(i.i(this.f106218c, connectionResult));
            return;
        }
        i iVar2 = this.f106228m;
        iVar2.f106064n.sendMessageDelayed(Message.obtain(iVar2.f106064n, 9, this.f106218c), 5000L);
    }

    @androidx.annotation.m1
    public final void J(@NonNull ConnectionResult connectionResult) {
        com.google.android.gms.common.internal.w.h(this.f106228m.f106064n);
        com.google.android.gms.common.api.a.f fVar = this.f106217b;
        fVar.e("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(connectionResult));
        I(connectionResult, null);
    }

    @androidx.annotation.m1
    public final void K(p3 p3Var) {
        com.google.android.gms.common.internal.w.h(this.f106228m.f106064n);
        this.f106220e.add(p3Var);
    }

    @Override // com.google.android.gms.common.api.internal.y3
    public final void L(ConnectionResult connectionResult, com.google.android.gms.common.api.a aVar, boolean z10) {
        throw null;
    }

    @androidx.annotation.m1
    public final void M() {
        com.google.android.gms.common.internal.w.h(this.f106228m.f106064n);
        if (this.f106224i) {
            F();
        }
    }

    @androidx.annotation.m1
    public final void N() {
        com.google.android.gms.common.internal.w.h(this.f106228m.f106064n);
        e(i.f106047s);
        this.f106219d.f();
        for (o.a aVar : (o.a[]) this.f106221f.keySet().toArray(new o.a[0])) {
            G(new l3(aVar, new com.google.android.gms.tasks.l()));
        }
        d(new ConnectionResult(4));
        if (this.f106217b.isConnected()) {
            this.f106217b.t(new t1(this));
        }
    }

    @androidx.annotation.m1
    public final void O() {
        com.google.android.gms.common.internal.w.h(this.f106228m.f106064n);
        if (this.f106224i) {
            o();
            i iVar = this.f106228m;
            e(iVar.f106056f.j(iVar.f106055e) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f106217b.e("Timing out connection while resuming.");
        }
    }

    final boolean R() {
        return this.f106217b.isConnected();
    }

    public final boolean a() {
        return this.f106217b.h();
    }

    @androidx.annotation.m1
    public final boolean b() {
        return r(true);
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void i(@androidx.annotation.p0 Bundle bundle) {
        if (Looper.myLooper() == this.f106228m.f106064n.getLooper()) {
            h();
        } else {
            this.f106228m.f106064n.post(new q1(this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void k(int i10) {
        if (Looper.myLooper() == this.f106228m.f106064n.getLooper()) {
            j(i10);
        } else {
            this.f106228m.f106064n.post(new r1(this, i10));
        }
    }

    @Override // com.google.android.gms.common.api.internal.r
    @androidx.annotation.m1
    public final void n(@NonNull ConnectionResult connectionResult) {
        I(connectionResult, null);
    }

    public final int s() {
        return this.f106222g;
    }

    @androidx.annotation.m1
    final int t() {
        return this.f106227l;
    }

    @androidx.annotation.m1
    @androidx.annotation.p0
    public final ConnectionResult u() {
        com.google.android.gms.common.internal.w.h(this.f106228m.f106064n);
        return this.f106226k;
    }

    public final com.google.android.gms.common.api.a.f w() {
        return this.f106217b;
    }

    public final Map y() {
        return this.f106221f;
    }
}
