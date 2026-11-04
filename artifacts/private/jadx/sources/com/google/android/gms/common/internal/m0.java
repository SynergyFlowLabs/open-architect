package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
final class m0 extends p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f106608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f106609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f106610c;

    m0(Intent intent, Activity activity, int i10) {
        this.f106608a = intent;
        this.f106609b = activity;
        this.f106610c = i10;
    }

    @Override // com.google.android.gms.common.internal.p0
    public final void a() {
        Intent intent = this.f106608a;
        if (intent != null) {
            this.f106609b.startActivityForResult(intent, this.f106610c);
        }
    }
}
