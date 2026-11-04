package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
final class k implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f107025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f107026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Bundle f107027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ a f107028d;

    k(a aVar, Activity activity, Bundle bundle, Bundle bundle2) {
        this.f107025a = activity;
        this.f107026b = bundle;
        this.f107027c = bundle2;
        this.f107028d = aVar;
    }

    @Override // com.google.android.gms.dynamic.q
    public final void a(e eVar) {
        this.f107028d.f107015a.i(this.f107025a, this.f107026b, this.f107027c);
    }

    @Override // com.google.android.gms.dynamic.q
    public final int c() {
        return 0;
    }
}
