package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class nb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f110289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f110290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ zzr f110291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f110292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.x1 f110293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ xc f110294f;

    nb(xc xcVar, String str, String str2, zzr zzrVar, boolean z10, com.google.android.gms.internal.measurement.x1 x1Var) {
        this.f110289a = str;
        this.f110290b = str2;
        this.f110291c = zzrVar;
        this.f110292d = z10;
        this.f110293e = x1Var;
        Objects.requireNonNull(xcVar);
        this.f110294f = xcVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Bundle bundle;
        RemoteException e10;
        Bundle bundle2 = new Bundle();
        try {
            xc xcVar = this.f110294f;
            d5 d5VarN = xcVar.N();
            if (d5VarN == null) {
                h7 h7Var = xcVar.f110184a;
                h7Var.a().o().c("Failed to get user properties; not connected to service", this.f110289a, this.f110290b);
                h7Var.C().f0(this.f110293e, bundle2);
                return;
            }
            zzr zzrVar = this.f110291c;
            com.google.android.gms.common.internal.w.r(zzrVar);
            List<zzpl> listK8 = d5VarN.k8(this.f110289a, this.f110290b, this.f110292d, zzrVar);
            int i10 = ze.f110835k;
            bundle = new Bundle();
            if (listK8 != null) {
                for (zzpl zzplVar : listK8) {
                    String str = zzplVar.f110878e;
                    if (str != null) {
                        bundle.putString(zzplVar.f110875b, str);
                    } else {
                        Long l10 = zzplVar.f110877d;
                        if (l10 != null) {
                            bundle.putLong(zzplVar.f110875b, l10.longValue());
                        } else {
                            Double d10 = zzplVar.f110880g;
                            if (d10 != null) {
                                bundle.putDouble(zzplVar.f110875b, d10.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    xcVar.J();
                    h7 h7Var2 = xcVar.f110184a;
                    h7Var2.C().f0(this.f110293e, bundle);
                } catch (RemoteException e11) {
                    e10 = e11;
                    this.f110294f.f110184a.a().o().c("Failed to get user properties; remote exception", this.f110289a, e10);
                    xc xcVar2 = this.f110294f;
                    xcVar2.f110184a.C().f0(this.f110293e, bundle);
                }
            } catch (Throwable th2) {
                th = th2;
                bundle2 = bundle;
                xc xcVar3 = this.f110294f;
                xcVar3.f110184a.C().f0(this.f110293e, bundle2);
                throw th;
            }
        } catch (RemoteException e12) {
            bundle = bundle2;
            e10 = e12;
        } catch (Throwable th3) {
            th = th3;
            xc xcVar4 = this.f110294f;
            xcVar4.f110184a.C().f0(this.f110293e, bundle2);
            throw th;
        }
    }
}
