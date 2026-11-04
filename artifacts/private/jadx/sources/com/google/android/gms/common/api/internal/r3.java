package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* JADX INFO: loaded from: classes4.dex */
final class r3 extends a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Dialog f106193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ s3 f106194b;

    r3(s3 s3Var, Dialog dialog) {
        this.f106193a = dialog;
        this.f106194b = s3Var;
    }

    @Override // com.google.android.gms.common.api.internal.a2
    public final void a() {
        this.f106194b.f106201b.p();
        if (this.f106193a.isShowing()) {
            this.f106193a.dismiss();
        }
    }
}
