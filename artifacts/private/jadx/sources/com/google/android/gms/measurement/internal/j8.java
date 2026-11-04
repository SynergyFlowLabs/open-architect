package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.devtodev.analytics.internal.storage.sqlite.ExperimentsEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
public final class j8 extends c5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qe f110109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f110110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f110111c;

    public j8(qe qeVar, String str) {
        com.google.android.gms.common.internal.w.r(qeVar);
        this.f110109a = qeVar;
        this.f110111c = null;
    }

    private final void M(zzbg zzbgVar, zzr zzrVar) {
        qe qeVar = this.f110109a;
        qeVar.E();
        qeVar.k(zzbgVar, zzrVar);
    }

    @androidx.annotation.g
    private final void O(zzr zzrVar, boolean z10) {
        com.google.android.gms.common.internal.w.r(zzrVar);
        String str = zzrVar.f110881a;
        com.google.android.gms.common.internal.w.l(str);
        int i10 = 2 ^ 0;
        Q(str, false);
        this.f110109a.N0().o(zzrVar.f110882b);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0053 A[Catch: SecurityException -> 0x0042, TryCatch #0 {SecurityException -> 0x0042, blocks: (B:6:0x000a, B:8:0x000f, B:10:0x001b, B:12:0x002c, B:18:0x0044, B:19:0x004a, B:21:0x0053, B:23:0x0057, B:25:0x0068, B:26:0x006b, B:30:0x0077, B:31:0x0088), top: B:36:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0077 A[Catch: SecurityException -> 0x0042, TryCatch #0 {SecurityException -> 0x0042, blocks: (B:6:0x000a, B:8:0x000f, B:10:0x001b, B:12:0x002c, B:18:0x0044, B:19:0x004a, B:21:0x0053, B:23:0x0057, B:25:0x0068, B:26:0x006b, B:30:0x0077, B:31:0x0088), top: B:36:0x000a }] */
    @androidx.annotation.g
    private final void Q(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            this.f110109a.a().o().a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z10) {
            try {
                if (this.f110110b == null) {
                    boolean z11 = true;
                    if (!"com.google.android.gms".equals(this.f110111c)) {
                        qe qeVar = this.f110109a;
                        if (!com.google.android.gms.common.util.c0.a(qeVar.d(), Binder.getCallingUid()) && !com.google.android.gms.common.l.a(qeVar.d()).d(Binder.getCallingUid())) {
                            z11 = false;
                        }
                    }
                    this.f110110b = Boolean.valueOf(z11);
                }
                if (!this.f110110b.booleanValue()) {
                    if (this.f110111c == null && com.google.android.gms.common.k.t(this.f110109a.d(), Binder.getCallingUid(), str)) {
                        this.f110111c = str;
                    }
                    if (!str.equals(this.f110111c)) {
                        throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
                    }
                }
            } catch (SecurityException e10) {
                this.f110109a.a().o().b("Measurement Service called with invalid calling package. appId", w5.x(str));
                throw e10;
            }
        } else {
            if (this.f110111c == null) {
                this.f110111c = str;
            }
            if (!str.equals(this.f110111c)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.d5
    @androidx.annotation.g
    public final void Fe(zzr zzrVar) {
        O(zzrVar, false);
        V(new k7(this, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.d5
    @androidx.annotation.g
    public final byte[] G3(zzbg zzbgVar, String str) {
        com.google.android.gms.common.internal.w.l(str);
        com.google.android.gms.common.internal.w.r(zzbgVar);
        Q(str, true);
        qe qeVar = this.f110109a;
        u5 u5VarV = qeVar.a().v();
        p5 p5VarM0 = qeVar.M0();
        String str2 = zzbgVar.f110858a;
        u5VarV.b("Log and bundle. event", p5VarM0.a(str2));
        long jA = qeVar.e().a() / 1000000;
        try {
            byte[] bArr = (byte[]) qeVar.b().s(new y7(this, zzbgVar, str)).get();
            if (bArr == null) {
                qeVar.a().o().b("Log and bundle returned null. appId", w5.x(str));
                bArr = new byte[0];
            }
            qeVar.a().v().d("Log and bundle processed. event, size, time_ms", qeVar.M0().a(str2), Integer.valueOf(bArr.length), Long.valueOf((qeVar.e().a() / 1000000) - jA));
            return bArr;
        } catch (InterruptedException | ExecutionException e10) {
            qe qeVar2 = this.f110109a;
            qeVar2.a().o().d("Failed to log and bundle. appId, event, error", w5.x(str), qeVar2.M0().a(zzbgVar.f110858a), e10);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.d5
    @androidx.annotation.g
    public final void I8(zzr zzrVar) {
        com.google.android.gms.common.internal.w.l(zzrVar.f110881a);
        com.google.android.gms.common.internal.w.r(zzrVar.f110907w);
        k(new u7(this, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.d5
    @androidx.annotation.g
    public final List I9(String str, String str2, String str3) {
        Q(str, true);
        try {
            return (List) this.f110109a.b().r(new r7(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f110109a.a().o().b("Failed to get conditional user properties as", e10);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.d5
    @androidx.annotation.g
    public final void Ka(zzah zzahVar) {
        com.google.android.gms.common.internal.w.r(zzahVar);
        com.google.android.gms.common.internal.w.r(zzahVar.f110847c);
        com.google.android.gms.common.internal.w.l(zzahVar.f110845a);
        Q(zzahVar.f110845a, true);
        V(new n7(this, new zzah(zzahVar)));
    }

    final /* synthetic */ qe L() {
        return this.f110109a;
    }

    @Override // com.google.android.gms.measurement.internal.d5
    @androidx.annotation.g
    public final void N8(zzr zzrVar, final zzoo zzooVar, final j5 j5Var) {
        O(zzrVar, false);
        final String str = (String) com.google.android.gms.common.internal.w.r(zzrVar.f110881a);
        this.f110109a.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.e8
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f109911a.u(str, zzooVar, j5Var);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.d5
    @androidx.annotation.g
    public final void R5(zzbg zzbgVar, String str, String str2) {
        com.google.android.gms.common.internal.w.r(zzbgVar);
        com.google.android.gms.common.internal.w.l(str);
        Q(str, true);
        V(new x7(this, zzbgVar, str));
    }

    final void S(zzbg zzbgVar, zzr zzrVar) {
        qe qeVar = this.f110109a;
        x6 x6VarD0 = qeVar.D0();
        String str = zzrVar.f110881a;
        com.google.android.gms.internal.measurement.c1 c1Var = TextUtils.isEmpty(str) ? null : (com.google.android.gms.internal.measurement.c1) x6VarD0.f110674j.f(str);
        if (c1Var == null) {
            this.f110109a.a().w().b("EES not loaded for", zzrVar.f110881a);
            M(zzbgVar, zzrVar);
            return;
        }
        try {
            Map mapZ = qeVar.K0().Z(zzbgVar.f110859b.n2(), true);
            String str2 = zzbgVar.f110858a;
            String strA = s8.a(str2);
            if (strA != null) {
                str2 = strA;
            }
            if (c1Var.b(new com.google.android.gms.internal.measurement.b(str2, zzbgVar.f110861d, mapZ))) {
                if (c1Var.c()) {
                    qe qeVar2 = this.f110109a;
                    qeVar2.a().w().b("EES edited event", zzbgVar.f110858a);
                    M(qeVar2.K0().m(c1Var.e().c()), zzrVar);
                } else {
                    M(zzbgVar, zzrVar);
                }
                if (c1Var.d()) {
                    for (com.google.android.gms.internal.measurement.b bVar : c1Var.e().f()) {
                        qe qeVar3 = this.f110109a;
                        qeVar3.a().w().b("EES logging created event", bVar.b());
                        M(qeVar3.K0().m(bVar), zzrVar);
                    }
                    return;
                }
                return;
            }
        } catch (com.google.android.gms.internal.measurement.d2 unused) {
            this.f110109a.a().o().c("EES error. appId, eventName", zzrVar.f110882b, zzbgVar.f110858a);
        }
        this.f110109a.a().w().b("EES was not applied to event", zzbgVar.f110858a);
        M(zzbgVar, zzrVar);
    }

    @Override // com.google.android.gms.measurement.internal.d5
    @androidx.annotation.g
    public final List S8(String str, String str2, String str3, boolean z10) {
        Q(str, true);
        try {
            List<xe> list = (List) this.f110109a.b().r(new p7(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (xe xeVar : list) {
                if (z10 || !ze.N(xeVar.f110703c)) {
                    arrayList.add(new zzpl(xeVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f110109a.a().o().c("Failed to get user properties as. appId", w5.x(str), e10);
            return Collections.EMPTY_LIST;
        }
    }

    @androidx.annotation.l1
    final zzbg U(zzbg zzbgVar, zzr zzrVar) {
        zzbe zzbeVar;
        if (com.google.firebase.messaging.e.f.f123542l.equals(zzbgVar.f110858a) && (zzbeVar = zzbgVar.f110859b) != null && zzbeVar.f2() != 0) {
            String strE2 = zzbeVar.e2("_cis");
            if ("referrer broadcast".equals(strE2) || "referrer API".equals(strE2)) {
                this.f110109a.a().u().b("Event has been filtered ", zzbgVar.toString());
                return new zzbg("_cmpx", zzbeVar, zzbgVar.f110860c, zzbgVar.f110861d);
            }
        }
        return zzbgVar;
    }

    @androidx.annotation.l1
    final void V(Runnable runnable) {
        com.google.android.gms.common.internal.w.r(runnable);
        qe qeVar = this.f110109a;
        if (qeVar.b().p()) {
            runnable.run();
        } else {
            qeVar.b().t(runnable);
        }
    }

    @Override // com.google.android.gms.measurement.internal.d5
    @androidx.annotation.g
    public final void V3(zzpl zzplVar, zzr zzrVar) {
        com.google.android.gms.common.internal.w.r(zzplVar);
        O(zzrVar, false);
        V(new z7(this, zzplVar, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.d5
    @androidx.annotation.g
    public final String Z4(zzr zzrVar) {
        O(zzrVar, false);
        return this.f110109a.p0(zzrVar);
    }

    @Override // com.google.android.gms.measurement.internal.d5
    @androidx.annotation.g
    public final void b6(long j10, String str, String str2, String str3) {
        V(new l7(this, str2, str3, str, j10));
    }

    @Override // com.google.android.gms.measurement.internal.d5
    @androidx.annotation.g
    public final void ba(final zzr zzrVar) {
        com.google.android.gms.common.internal.w.l(zzrVar.f110881a);
        com.google.android.gms.common.internal.w.r(zzrVar.f110907w);
        k(new Runnable() { // from class: com.google.android.gms.measurement.internal.i8
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f110082a.n(zzrVar);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.d5
    @androidx.annotation.g
    public final void e6(zzr zzrVar) {
        String str = zzrVar.f110881a;
        com.google.android.gms.common.internal.w.l(str);
        Q(str, false);
        V(new t7(this, zzrVar));
    }

    @androidx.annotation.l1
    final void k(Runnable runnable) {
        com.google.android.gms.common.internal.w.r(runnable);
        qe qeVar = this.f110109a;
        if (qeVar.b().p()) {
            runnable.run();
        } else {
            qeVar.b().v(runnable);
        }
    }

    @Override // com.google.android.gms.measurement.internal.d5
    @androidx.annotation.g
    public final List k8(String str, String str2, boolean z10, zzr zzrVar) {
        O(zzrVar, false);
        String str3 = zzrVar.f110881a;
        com.google.android.gms.common.internal.w.r(str3);
        try {
            List<xe> list = (List) this.f110109a.b().r(new o7(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (xe xeVar : list) {
                if (z10 || !ze.N(xeVar.f110703c)) {
                    arrayList.add(new zzpl(xeVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f110109a.a().o().c("Failed to query user properties. appId", w5.x(zzrVar.f110881a), e10);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.d5
    @androidx.annotation.g
    public final void ke(zzr zzrVar) {
        O(zzrVar, false);
        V(new j7(this, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.d5
    @androidx.annotation.g
    public final List m5(zzr zzrVar, boolean z10) {
        O(zzrVar, false);
        String str = zzrVar.f110881a;
        com.google.android.gms.common.internal.w.r(str);
        try {
            List<xe> list = (List) this.f110109a.b().r(new i7(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (xe xeVar : list) {
                if (z10 || !ze.N(xeVar.f110703c)) {
                    arrayList.add(new zzpl(xeVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f110109a.a().o().c("Failed to get user properties. appId", w5.x(zzrVar.f110881a), e10);
            int i10 = 5 | 0;
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.d5
    @androidx.annotation.g
    public final void m7(final zzr zzrVar, final zzaf zzafVar) {
        O(zzrVar, false);
        V(new Runnable() { // from class: com.google.android.gms.measurement.internal.g8
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f109981a.v(zzrVar, zzafVar);
            }
        });
    }

    final /* synthetic */ void n(zzr zzrVar) {
        qe qeVar = this.f110109a;
        qeVar.E();
        qeVar.P0(zzrVar);
    }

    final /* synthetic */ void p(zzr zzrVar) {
        qe qeVar = this.f110109a;
        qeVar.E();
        qeVar.Q0(zzrVar);
    }

    @Override // com.google.android.gms.measurement.internal.d5
    @androidx.annotation.g
    public final List qa(zzr zzrVar, Bundle bundle) {
        O(zzrVar, false);
        com.google.android.gms.common.internal.w.r(zzrVar.f110881a);
        qe qeVar = this.f110109a;
        if (!qeVar.B0().H(null, z4.Z0)) {
            try {
                return (List) this.f110109a.b().r(new b8(this, zzrVar, bundle)).get();
            } catch (InterruptedException | ExecutionException e10) {
                this.f110109a.a().o().c("Failed to get trigger URIs. appId", w5.x(zzrVar.f110881a), e10);
                return Collections.EMPTY_LIST;
            }
        }
        try {
            return (List) qeVar.b().s(new a8(this, zzrVar, bundle)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e11) {
            this.f110109a.a().o().c("Failed to get trigger URIs. appId", w5.x(zzrVar.f110881a), e11);
            return Collections.EMPTY_LIST;
        }
    }

    final /* synthetic */ void s(zzr zzrVar, Bundle bundle, g5 g5Var, String str) {
        qe qeVar = this.f110109a;
        qeVar.E();
        try {
            g5Var.Ib(qeVar.q0(zzrVar, bundle));
        } catch (RemoteException e10) {
            this.f110109a.a().o().c("Failed to return trigger URIs for app", str, e10);
        }
    }

    final /* synthetic */ void u(String str, zzoo zzooVar, j5 j5Var) {
        qe qeVar = this.f110109a;
        qeVar.E();
        qeVar.b().h();
        qeVar.O0();
        List<te> listO = qeVar.F0().o(str, zzooVar, ((Integer) z4.B.b(null)).intValue());
        ArrayList arrayList = new ArrayList();
        for (te teVar : listO) {
            if (qeVar.t(str, teVar.e())) {
                int i10 = teVar.i();
                if (i10 > 0) {
                    if (i10 <= ((Integer) z4.f110807z.b(null)).intValue()) {
                        if (qeVar.e().currentTimeMillis() >= teVar.h() + Math.min(((Long) z4.f110803x.b(null)).longValue() * (1 << (i10 - 1)), ((Long) z4.f110805y.b(null)).longValue())) {
                        }
                    }
                    qeVar.a().w().d("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str, Long.valueOf(teVar.c()), Long.valueOf(teVar.h()));
                }
                zzom zzomVarB = teVar.b();
                try {
                    com.google.android.gms.internal.measurement.f7 f7Var = (com.google.android.gms.internal.measurement.f7) ve.W(com.google.android.gms.internal.measurement.i7.L(), zzomVarB.f110866b);
                    for (int i11 = 0; i11 < f7Var.v(); i11++) {
                        com.google.android.gms.internal.measurement.j7 j7Var = (com.google.android.gms.internal.measurement.j7) f7Var.w(i11).q();
                        j7Var.f1(qeVar.e().currentTimeMillis());
                        f7Var.x(i11, j7Var);
                    }
                    zzomVarB.f110866b = ((com.google.android.gms.internal.measurement.i7) f7Var.r()).g();
                    if (Log.isLoggable(qeVar.a().z(), 2)) {
                        zzomVarB.f110871g = qeVar.K0().K((com.google.android.gms.internal.measurement.i7) f7Var.r());
                    }
                    arrayList.add(zzomVarB);
                } catch (com.google.android.gms.internal.measurement.cc unused) {
                    qeVar.a().r().b("Failed to parse queued batch. appId", str);
                }
            } else {
                qeVar.a().w().d("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str, Long.valueOf(teVar.c()), teVar.e());
            }
        }
        zzoq zzoqVar = new zzoq(arrayList);
        try {
            j5Var.qe(zzoqVar);
            this.f110109a.a().w().c("[sgtm] Sending queued upload batches to client. appId, count", str, Integer.valueOf(zzoqVar.f110873a.size()));
        } catch (RemoteException e10) {
            this.f110109a.a().o().c("[sgtm] Failed to return upload batches for app", str, e10);
        }
    }

    @Override // com.google.android.gms.measurement.internal.d5
    @androidx.annotation.g
    public final void u1(zzah zzahVar, zzr zzrVar) {
        com.google.android.gms.common.internal.w.r(zzahVar);
        com.google.android.gms.common.internal.w.r(zzahVar.f110847c);
        O(zzrVar, false);
        zzah zzahVar2 = new zzah(zzahVar);
        zzahVar2.f110845a = zzrVar.f110881a;
        V(new m7(this, zzahVar2, zzrVar));
    }

    final /* synthetic */ void v(zzr zzrVar, zzaf zzafVar) {
        qe qeVar = this.f110109a;
        qeVar.E();
        qeVar.r0((String) com.google.android.gms.common.internal.w.r(zzrVar.f110881a), zzafVar);
    }

    @Override // com.google.android.gms.measurement.internal.d5
    @androidx.annotation.g
    public final List v8(String str, String str2, zzr zzrVar) {
        O(zzrVar, false);
        String str3 = zzrVar.f110881a;
        com.google.android.gms.common.internal.w.r(str3);
        try {
            return (List) this.f110109a.b().r(new q7(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f110109a.a().o().b("Failed to get conditional user properties", e10);
            return Collections.EMPTY_LIST;
        }
    }

    final /* synthetic */ void w(Bundle bundle, String str, zzr zzrVar) {
        qe qeVar = this.f110109a;
        boolean zH = qeVar.B0().H(null, z4.W0);
        if (bundle.isEmpty() && zH) {
            t tVarF0 = this.f110109a.F0();
            tVarF0.h();
            tVarF0.j();
            try {
                tVarF0.u0().execSQL("delete from default_event_params where app_id=?", new String[]{str});
                return;
            } catch (SQLiteException e10) {
                tVarF0.f110184a.a().o().b("Error clearing default event params", e10);
                return;
            }
        }
        t tVarF1 = qeVar.F0();
        tVarF1.h();
        tVarF1.j();
        byte[] bArrG = tVarF1.f110700b.K0().J(new a0(tVarF1.f110184a, "", str, "dep", 0L, 0L, bundle)).g();
        h7 h7Var = tVarF1.f110184a;
        h7Var.a().w().c("Saving default event parameters, appId, data size", str, Integer.valueOf(bArrG.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put(ExperimentsEntry.parameters, bArrG);
        try {
            if (tVarF1.u0().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                h7Var.a().o().b("Failed to insert default event parameters (got -1). appId", w5.x(str));
            }
        } catch (SQLiteException e11) {
            tVarF1.f110184a.a().o().c("Error storing default event parameters. appId", w5.x(str), e11);
        }
        qe qeVar2 = this.f110109a;
        t tVarF2 = qeVar2.F0();
        long j10 = zzrVar.f110894j3;
        if (tVarF2.H(str, j10)) {
            qeVar2.F0().I(str, Long.valueOf(j10), null, bundle);
        }
    }

    @Override // com.google.android.gms.measurement.internal.d5
    @androidx.annotation.g
    public final void wa(final zzr zzrVar) {
        com.google.android.gms.common.internal.w.l(zzrVar.f110881a);
        com.google.android.gms.common.internal.w.r(zzrVar.f110907w);
        k(new Runnable() { // from class: com.google.android.gms.measurement.internal.c8
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f109842a.p(zzrVar);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.d5
    @androidx.annotation.g
    public final void x3(zzbg zzbgVar, zzr zzrVar) {
        com.google.android.gms.common.internal.w.r(zzbgVar);
        O(zzrVar, false);
        V(new w7(this, zzbgVar, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.d5
    @androidx.annotation.g
    public final zzao x7(zzr zzrVar) {
        O(zzrVar, false);
        com.google.android.gms.common.internal.w.l(zzrVar.f110881a);
        try {
            return (zzao) this.f110109a.b().s(new v7(this, zzrVar)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            this.f110109a.a().o().c("Failed to get consent. appId", w5.x(zzrVar.f110881a), e10);
            return new zzao(null);
        }
    }

    @Override // com.google.android.gms.measurement.internal.d5
    @androidx.annotation.g
    public final void xd(final zzr zzrVar, final Bundle bundle, final g5 g5Var) {
        O(zzrVar, false);
        final String str = (String) com.google.android.gms.common.internal.w.r(zzrVar.f110881a);
        this.f110109a.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.d8
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f109886a.s(zzrVar, bundle, g5Var, str);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.d5
    @androidx.annotation.g
    public final void y3(zzr zzrVar) {
        O(zzrVar, false);
        V(new s7(this, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.d5
    @androidx.annotation.g
    public final void z7(final Bundle bundle, final zzr zzrVar) {
        O(zzrVar, false);
        final String str = zzrVar.f110881a;
        com.google.android.gms.common.internal.w.r(str);
        V(new Runnable() { // from class: com.google.android.gms.measurement.internal.h8
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f110044a.w(bundle, str, zzrVar);
            }
        });
    }
}
