package com.google.android.gms.common.internal;

import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
final class o0 extends p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f106618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.common.api.internal.n f106619b;

    o0(Intent intent, com.google.android.gms.common.api.internal.n nVar, int i10) {
        this.f106618a = intent;
        this.f106619b = nVar;
    }

    @Override // com.google.android.gms.common.internal.p0
    public final void a() {
        Intent intent = this.f106618a;
        if (intent != null) {
            this.f106619b.startActivityForResult(intent, 2);
        }
    }
}
