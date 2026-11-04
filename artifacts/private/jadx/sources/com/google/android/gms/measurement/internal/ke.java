package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class ke implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f110200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f110201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Bundle f110202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ le f110203d;

    ke(le leVar, String str, String str2, Bundle bundle) {
        this.f110200a = str;
        this.f110201b = str2;
        this.f110202c = bundle;
        Objects.requireNonNull(leVar);
        this.f110203d = leVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qe qeVar = this.f110203d.f110238a;
        ze zeVarN0 = qeVar.N0();
        long jCurrentTimeMillis = qeVar.e().currentTimeMillis();
        String str = this.f110200a;
        qeVar.i((zzbg) com.google.android.gms.common.internal.w.r(zeVarN0.R(str, this.f110201b, this.f110202c, "auto", jCurrentTimeMillis, false, true)), str);
    }
}
