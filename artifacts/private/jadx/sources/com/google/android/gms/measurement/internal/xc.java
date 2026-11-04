package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class xc extends b5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final rc f110692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d5 f110693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Boolean f110694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w f110695f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ScheduledExecutorService f110696g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final td f110697h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f110698i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final w f110699j;

    protected xc(h7 h7Var) {
        super(h7Var);
        this.f110698i = new ArrayList();
        this.f110697h = new td(h7Var.e());
        this.f110692c = new rc(this);
        this.f110695f = new xb(this, h7Var);
        this.f110699j = new bc(this, h7Var);
    }

    private final boolean R() {
        this.f110184a.c();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.m1
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final void J() {
        h();
        this.f110697h.a();
        this.f110184a.w();
        this.f110695f.b(((Long) z4.Z.b(null)).longValue());
    }

    @androidx.annotation.m1
    private final void T(Runnable runnable) throws IllegalStateException {
        h();
        if (W()) {
            runnable.run();
            return;
        }
        List list = this.f110698i;
        long size = list.size();
        h7 h7Var = this.f110184a;
        h7Var.w();
        if (size >= 1000) {
            h7Var.a().o().a("Discarding data. Max runnable queue size reached");
            return;
        }
        list.add(runnable);
        this.f110699j.b(60000L);
        w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.m1
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public final void L() {
        h();
        u5 u5VarW = this.f110184a.a().w();
        List list = this.f110698i;
        u5VarW.b("Processing queued up service tasks", Integer.valueOf(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e10) {
                this.f110184a.a().o().b("Task exception while flushing queue", e10);
            }
        }
        this.f110698i.clear();
        this.f110699j.d();
    }

    @androidx.annotation.m1
    private final zzr V(boolean z10) {
        Pair pairB;
        h7 h7Var = this.f110184a;
        h7Var.c();
        k5 k5VarL = this.f110184a.L();
        String string = null;
        if (z10) {
            h7 h7Var2 = h7Var.a().f110184a;
            if (h7Var2.x().f110160e != null && (pairB = h7Var2.x().f110160e.b()) != null && pairB != k6.A) {
                String strValueOf = String.valueOf(pairB.second);
                String str = (String) pairB.first;
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + String.valueOf(str).length());
                sb2.append(strValueOf);
                sb2.append(":");
                sb2.append(str);
                string = sb2.toString();
            }
        }
        return k5VarL.o(string);
    }

    @androidx.annotation.m1
    public final void A() {
        h();
        j();
        rc rcVar = this.f110692c;
        rcVar.b();
        try {
            com.google.android.gms.common.stats.a.b().c(this.f110184a.d(), rcVar);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f110693d = null;
    }

    @androidx.annotation.m1
    public final void B(com.google.android.gms.internal.measurement.x1 x1Var, zzbg zzbgVar, String str) {
        h();
        j();
        h7 h7Var = this.f110184a;
        if (h7Var.C().X(12451000) == 0) {
            T(new ac(this, zzbgVar, str, x1Var));
        } else {
            h7Var.a().r().a("Not bundling data. Service unavailable or out of date");
            h7Var.C().d0(x1Var, new byte[0]);
        }
    }

    @androidx.annotation.m1
    final boolean C() {
        h();
        j();
        return !y() || this.f110184a.C().W() >= ((Integer) z4.K0.b(null)).intValue();
    }

    @androidx.annotation.m1
    final boolean D() {
        h();
        j();
        return !y() || this.f110184a.C().W() >= 241200;
    }

    final /* synthetic */ void E() {
        d5 d5Var = this.f110693d;
        if (d5Var == null) {
            this.f110184a.a().o().a("Failed to send storage consent settings to service");
            return;
        }
        try {
            zzr zzrVarV = V(false);
            com.google.android.gms.common.internal.w.r(zzrVarV);
            d5Var.ba(zzrVarV);
            J();
        } catch (RemoteException e10) {
            this.f110184a.a().o().b("Failed to send storage consent settings to the service", e10);
        }
    }

    final /* synthetic */ void F() {
        d5 d5Var = this.f110693d;
        if (d5Var == null) {
            this.f110184a.a().o().a("Failed to send Dma consent settings to service");
            return;
        }
        try {
            zzr zzrVarV = V(false);
            com.google.android.gms.common.internal.w.r(zzrVarV);
            d5Var.wa(zzrVarV);
            J();
        } catch (RemoteException e10) {
            this.f110184a.a().o().b("Failed to send Dma consent settings to the service", e10);
        }
    }

    final /* synthetic */ void G(AtomicReference atomicReference, zzr zzrVar, Bundle bundle) {
        synchronized (atomicReference) {
            try {
                try {
                    d5 d5Var = this.f110693d;
                    if (d5Var == null) {
                        this.f110184a.a().o().a("Failed to request trigger URIs; not connected to service");
                        return;
                    }
                    com.google.android.gms.common.internal.w.r(zzrVar);
                    d5Var.xd(zzrVar, bundle, new pb(this, atomicReference));
                    J();
                } catch (RemoteException e10) {
                    this.f110184a.a().o().b("Failed to request trigger URIs; remote exception", e10);
                    atomicReference.notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final /* synthetic */ void H(AtomicReference atomicReference, zzr zzrVar, zzoo zzooVar) {
        synchronized (atomicReference) {
            try {
                try {
                    d5 d5Var = this.f110693d;
                    if (d5Var == null) {
                        this.f110184a.a().o().a("[sgtm] Failed to get upload batches; not connected to service");
                        return;
                    }
                    com.google.android.gms.common.internal.w.r(zzrVar);
                    d5Var.N8(zzrVar, zzooVar, new qb(this, atomicReference));
                    J();
                } catch (RemoteException e10) {
                    this.f110184a.a().o().b("[sgtm] Failed to get upload batches; remote exception", e10);
                    atomicReference.notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final /* synthetic */ void I(zzr zzrVar, zzaf zzafVar) {
        d5 d5Var = this.f110693d;
        if (d5Var == null) {
            this.f110184a.a().o().a("[sgtm] Discarding data. Failed to update batch upload status.");
            return;
        }
        try {
            d5Var.m7(zzrVar, zzafVar);
            J();
        } catch (RemoteException e10) {
            this.f110184a.a().o().c("[sgtm] Failed to update batch upload status, rowId, exception", Long.valueOf(zzafVar.f110842a), e10);
        }
    }

    final /* synthetic */ void K(ComponentName componentName) {
        h();
        if (this.f110693d != null) {
            this.f110693d = null;
            this.f110184a.a().w().b("Disconnected from device MeasurementService", componentName);
            h();
            w();
        }
    }

    final /* synthetic */ rc M() {
        return this.f110692c;
    }

    final /* synthetic */ d5 N() {
        return this.f110693d;
    }

    final /* synthetic */ void O(d5 d5Var) {
        this.f110693d = null;
    }

    final /* synthetic */ ScheduledExecutorService P() {
        return this.f110696g;
    }

    final /* synthetic */ void Q(ScheduledExecutorService scheduledExecutorService) {
        this.f110696g = scheduledExecutorService;
    }

    @androidx.annotation.m1
    public final boolean W() {
        h();
        j();
        return this.f110693d != null;
    }

    @androidx.annotation.m1
    protected final void X() {
        h();
        j();
        T(new cc(this, V(true)));
    }

    @androidx.annotation.m1
    protected final void Y(boolean z10) {
        h();
        j();
        if (C()) {
            T(new dc(this, V(false)));
        }
    }

    @androidx.annotation.m1
    protected final void Z(boolean z10) {
        h();
        j();
        T(new Runnable() { // from class: com.google.android.gms.measurement.internal.wc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f110648a.E();
            }
        });
    }

    @androidx.annotation.m1
    protected final void a0() {
        h();
        j();
        T(new Runnable() { // from class: com.google.android.gms.measurement.internal.sc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f110486a.F();
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:20:0x010d  */
    @androidx.annotation.m1
    final void b0(d5 d5Var, AbstractSafeParcelable abstractSafeParcelable, zzr zzrVar) {
        zzr zzrVar2;
        String str;
        long jB;
        long j10;
        h();
        j();
        R();
        h7 h7Var = this.f110184a;
        h7Var.w();
        zzr zzrVar3 = zzrVar;
        int size = 100;
        int i10 = 0;
        for (int i11 = 100; i10 < 1001 && size == i11; i11 = 100) {
            h7 h7Var2 = this.f110184a;
            ArrayList arrayList = new ArrayList();
            List listT = h7Var2.E().t(i11);
            if (listT != null) {
                arrayList.addAll(listT);
                size = listT.size();
            } else {
                size = 0;
            }
            if (abstractSafeParcelable != 0 && size < i11) {
                arrayList.add(new m5(abstractSafeParcelable, zzrVar3.f110883c, zzrVar3.f110893j));
            }
            String str2 = null;
            boolean zH = h7Var.w().H(null, z4.P0);
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                m5 m5Var = (m5) arrayList.get(i12);
                AbstractSafeParcelable abstractSafeParcelable2 = m5Var.f110245a;
                k kVarW = h7Var.w();
                y4 y4Var = z4.f110753c1;
                if (kVarW.H(str2, y4Var)) {
                    String str3 = m5Var.f110246b;
                    if (TextUtils.isEmpty(str3)) {
                        zzrVar2 = zzrVar3;
                    } else {
                        zzrVar2 = new zzr(zzrVar3.f110881a, zzrVar3.f110882b, str3, m5Var.f110247c, zzrVar3.f110884d, zzrVar3.f110885e, zzrVar3.f110886f, zzrVar3.f110887g, zzrVar3.f110889h, zzrVar3.f110891i, zzrVar3.f110895k, zzrVar3.f110897l, zzrVar3.f110898m, zzrVar3.f110899n, zzrVar3.f110900o, zzrVar3.f110904s, zzrVar3.f110905t, zzrVar3.f110906v, zzrVar3.f110907w, zzrVar3.X, zzrVar3.Y, zzrVar3.Z, zzrVar3.f110901p0, zzrVar3.f110902p1, zzrVar3.H1, zzrVar3.f110903p2, zzrVar3.f110888g3, zzrVar3.f110890h3, zzrVar3.f110892i3, zzrVar3.f110894j3, zzrVar3.f110896k3);
                    }
                } else {
                    zzrVar2 = zzrVar3;
                }
                if (abstractSafeParcelable2 instanceof zzbg) {
                    if (zH) {
                        try {
                            h7 h7Var3 = this.f110184a;
                            long jCurrentTimeMillis = h7Var3.e().currentTimeMillis();
                            try {
                                j10 = jCurrentTimeMillis;
                                jB = h7Var3.e().b();
                            } catch (RemoteException e10) {
                                e = e10;
                                j10 = jCurrentTimeMillis;
                                jB = 0;
                                this.f110184a.a().o().b("Failed to send event to the service", e);
                                if (zH && j10 != 0) {
                                    h7 h7Var4 = this.f110184a;
                                    s5.a(h7Var4).b(36301, 13, j10, h7Var4.e().currentTimeMillis(), (int) (h7Var4.e().b() - jB));
                                }
                                str = null;
                                i12++;
                                zzrVar3 = zzrVar2;
                                str2 = str;
                                h7Var = h7Var;
                            }
                        } catch (RemoteException e11) {
                            e = e11;
                            jB = 0;
                            j10 = 0;
                        }
                    } else {
                        jB = 0;
                        j10 = 0;
                    }
                    try {
                        d5Var.x3((zzbg) abstractSafeParcelable2, zzrVar2);
                        if (zH) {
                            h7Var.a().w().a("Logging telemetry for logEvent from database");
                            h7 h7Var5 = this.f110184a;
                            s5.a(h7Var5).b(36301, 0, j10, h7Var5.e().currentTimeMillis(), (int) (h7Var5.e().b() - jB));
                        }
                    } catch (RemoteException e12) {
                        e = e12;
                        this.f110184a.a().o().b("Failed to send event to the service", e);
                        if (zH) {
                            h7 h7Var6 = this.f110184a;
                            s5.a(h7Var6).b(36301, 13, j10, h7Var6.e().currentTimeMillis(), (int) (h7Var6.e().b() - jB));
                        }
                    }
                } else if (abstractSafeParcelable2 instanceof zzpl) {
                    try {
                        d5Var.V3((zzpl) abstractSafeParcelable2, zzrVar2);
                    } catch (RemoteException e13) {
                        this.f110184a.a().o().b("Failed to send user property to the service", e13);
                    }
                } else {
                    if (abstractSafeParcelable2 instanceof zzah) {
                        try {
                            d5Var.u1((zzah) abstractSafeParcelable2, zzrVar2);
                        } catch (RemoteException e14) {
                            this.f110184a.a().o().b("Failed to send conditional user property to the service", e14);
                        }
                    } else {
                        h7 h7Var7 = this.f110184a;
                        str = null;
                        if (h7Var7.w().H(null, y4Var) && (abstractSafeParcelable2 instanceof zzbe)) {
                            try {
                                d5Var.z7(((zzbe) abstractSafeParcelable2).n2(), zzrVar2);
                            } catch (RemoteException e15) {
                                this.f110184a.a().o().b("Failed to send default event parameters to the service", e15);
                            }
                        } else {
                            h7Var7.a().o().a("Discarding data. Unrecognized parcel type.");
                        }
                    }
                    i12++;
                    zzrVar3 = zzrVar2;
                    str2 = str;
                    h7Var = h7Var;
                }
                str = null;
                i12++;
                zzrVar3 = zzrVar2;
                str2 = str;
                h7Var = h7Var;
            }
            i10++;
        }
    }

    @androidx.annotation.m1
    protected final void c0(zzbg zzbgVar, String str) {
        com.google.android.gms.common.internal.w.r(zzbgVar);
        h();
        j();
        R();
        T(new ec(this, true, V(true), this.f110184a.E().p(zzbgVar), zzbgVar, str));
    }

    @androidx.annotation.m1
    protected final void d0(zzah zzahVar) {
        com.google.android.gms.common.internal.w.r(zzahVar);
        h();
        j();
        this.f110184a.c();
        T(new fc(this, true, V(true), this.f110184a.E().r(zzahVar), new zzah(zzahVar), zzahVar));
    }

    @androidx.annotation.m1
    protected final void e0(AtomicReference atomicReference, String str, String str2, String str3) {
        h();
        j();
        T(new gc(this, atomicReference, null, str2, str3, V(false)));
    }

    @androidx.annotation.m1
    protected final void f0(com.google.android.gms.internal.measurement.x1 x1Var, String str, String str2) {
        h();
        j();
        T(new hc(this, str, str2, V(false), x1Var));
    }

    @androidx.annotation.m1
    protected final void g0(AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        h();
        j();
        T(new ic(this, atomicReference, null, str2, str3, V(false), z10));
    }

    @androidx.annotation.m1
    protected final void h0(com.google.android.gms.internal.measurement.x1 x1Var, String str, String str2, boolean z10) {
        h();
        j();
        T(new nb(this, str, str2, V(false), z10, x1Var));
    }

    @androidx.annotation.m1
    protected final void i0(AtomicReference atomicReference, boolean z10) {
        h();
        j();
        T(new ob(this, atomicReference, V(false), z10));
    }

    @androidx.annotation.m1
    protected final void j0(final AtomicReference atomicReference, final Bundle bundle) {
        h();
        j();
        final zzr zzrVarV = V(false);
        T(new Runnable() { // from class: com.google.android.gms.measurement.internal.tc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f110556a.G(atomicReference, zzrVarV, bundle);
            }
        });
    }

    @androidx.annotation.m1
    protected final void k0(final AtomicReference atomicReference, final zzoo zzooVar) {
        h();
        j();
        final zzr zzrVarV = V(false);
        T(new Runnable() { // from class: com.google.android.gms.measurement.internal.uc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f110589a.H(atomicReference, zzrVarV, zzooVar);
            }
        });
    }

    @androidx.annotation.m1
    protected final void l0(final zzaf zzafVar) {
        h();
        j();
        final zzr zzrVarV = V(true);
        com.google.android.gms.common.internal.w.r(zzrVarV);
        T(new Runnable() { // from class: com.google.android.gms.measurement.internal.vc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f110609a.I(zzrVarV, zzafVar);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.b5
    protected final boolean m() {
        return false;
    }

    @androidx.annotation.m1
    protected final zzao m0() {
        h();
        j();
        d5 d5Var = this.f110693d;
        if (d5Var == null) {
            w();
            this.f110184a.a().v().a("Failed to get consents; not connected to service yet.");
            return null;
        }
        zzr zzrVarV = V(false);
        com.google.android.gms.common.internal.w.r(zzrVarV);
        try {
            zzao zzaoVarX7 = d5Var.x7(zzrVarV);
            J();
            return zzaoVarX7;
        } catch (RemoteException e10) {
            this.f110184a.a().o().b("Failed to get consents; remote exception", e10);
            return null;
        }
    }

    @androidx.annotation.m1
    protected final void o(zzpl zzplVar) {
        h();
        j();
        R();
        T(new rb(this, V(true), this.f110184a.E().q(zzplVar), zzplVar));
    }

    @androidx.annotation.m1
    protected final void p() {
        h();
        j();
        zzr zzrVarV = V(false);
        R();
        this.f110184a.E().o();
        T(new sb(this, zzrVarV));
    }

    @androidx.annotation.m1
    public final void q(AtomicReference atomicReference) {
        h();
        j();
        T(new tb(this, atomicReference, V(false)));
    }

    @androidx.annotation.m1
    public final void r(com.google.android.gms.internal.measurement.x1 x1Var) {
        h();
        j();
        T(new ub(this, V(false), x1Var));
    }

    @androidx.annotation.m1
    protected final void s() {
        h();
        j();
        zzr zzrVarV = V(true);
        R();
        this.f110184a.w().H(null, z4.f110753c1);
        this.f110184a.E().u();
        T(new vb(this, zzrVarV, true));
    }

    @androidx.annotation.m1
    protected final void t() {
        h();
        j();
        T(new wb(this, V(true)));
    }

    @androidx.annotation.m1
    protected final void u(eb ebVar) {
        h();
        j();
        T(new yb(this, ebVar));
    }

    @androidx.annotation.m1
    public final void v(Bundle bundle) {
        boolean z10;
        h();
        j();
        zzbe zzbeVar = new zzbe(bundle);
        R();
        if (this.f110184a.w().H(null, z4.f110753c1) && this.f110184a.E().s(zzbeVar)) {
            int i10 = 4 << 1;
            z10 = true;
        } else {
            z10 = false;
        }
        T(new zb(this, true, V(false), z10, zzbeVar, bundle));
    }

    @androidx.annotation.m1
    final void w() {
        h();
        j();
        if (W()) {
            return;
        }
        if (y()) {
            this.f110692c.c();
            return;
        }
        h7 h7Var = this.f110184a;
        if (h7Var.w().m()) {
            return;
        }
        h7Var.c();
        List<ResolveInfo> listQueryIntentServices = h7Var.d().getPackageManager().queryIntentServices(new Intent().setClassName(h7Var.d(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            h7Var.a().o().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        Context contextD = h7Var.d();
        h7Var.c();
        intent.setComponent(new ComponentName(contextD, "com.google.android.gms.measurement.AppMeasurementService"));
        this.f110692c.a(intent);
    }

    final Boolean x() {
        return this.f110694e;
    }

    @androidx.annotation.m1
    final boolean y() {
        h();
        j();
        if (this.f110694e == null) {
            h();
            j();
            h7 h7Var = this.f110184a;
            k6 k6VarX = h7Var.x();
            k6VarX.h();
            boolean z10 = false;
            Boolean boolValueOf = !k6VarX.p().contains("use_service") ? null : Boolean.valueOf(k6VarX.p().getBoolean("use_service", false));
            boolean z11 = true;
            if (boolValueOf == null || !boolValueOf.booleanValue()) {
                h7Var.c();
                if (this.f110184a.L().v() == 1) {
                    z10 = true;
                } else {
                    h7Var.a().w().a("Checking service availability");
                    int iX = h7Var.C().X(12451000);
                    if (iX == 0) {
                        h7Var.a().w().a("Service available");
                    } else if (iX == 1) {
                        h7Var.a().w().a("Service missing");
                    } else if (iX != 2) {
                        if (iX == 3) {
                            h7Var.a().r().a("Service disabled");
                        } else if (iX == 9) {
                            h7Var.a().r().a("Service invalid");
                        } else if (iX != 18) {
                            h7Var.a().r().b("Unexpected service status", Integer.valueOf(iX));
                        } else {
                            h7Var.a().r().a("Service updating");
                        }
                        z11 = false;
                    } else {
                        h7Var.a().v().a("Service container out of date");
                        if (h7Var.C().W() >= 17443) {
                            z10 = boolValueOf == null;
                            z11 = false;
                        }
                    }
                    z10 = true;
                }
                if (!z10 && h7Var.w().m()) {
                    h7Var.a().o().a("No way to upload. Consider using the full version of Analytics");
                } else if (z11) {
                    k6 k6VarX2 = h7Var.x();
                    k6VarX2.h();
                    SharedPreferences.Editor editorEdit = k6VarX2.p().edit();
                    editorEdit.putBoolean("use_service", z10);
                    editorEdit.apply();
                }
                z11 = z10;
            }
            this.f110694e = Boolean.valueOf(z11);
        }
        return this.f110694e.booleanValue();
    }

    @androidx.annotation.m1
    protected final void z(d5 d5Var) {
        h();
        com.google.android.gms.common.internal.w.r(d5Var);
        this.f110693d = d5Var;
        J();
        L();
    }
}
