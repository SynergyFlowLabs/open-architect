package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdd;

/* JADX INFO: loaded from: classes4.dex */
public final class y8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f110725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    Boolean f110726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f110727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    zzdd f110728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f110729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    final Long f110730f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    String f110731g;

    public y8(Context context, @androidx.annotation.p0 zzdd zzddVar, @androidx.annotation.p0 Long l10) {
        this.f110729e = true;
        com.google.android.gms.common.internal.w.r(context);
        Context applicationContext = context.getApplicationContext();
        com.google.android.gms.common.internal.w.r(applicationContext);
        this.f110725a = applicationContext;
        this.f110730f = l10;
        if (zzddVar != null) {
            this.f110728d = zzddVar;
            this.f110729e = zzddVar.f109032c;
            this.f110727c = zzddVar.f109031b;
            this.f110731g = zzddVar.f109034e;
            Bundle bundle = zzddVar.f109033d;
            if (bundle != null) {
                this.f110726b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
