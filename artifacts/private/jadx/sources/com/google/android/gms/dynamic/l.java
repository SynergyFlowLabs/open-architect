package com.google.android.gms.dynamic;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
final class l implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f107029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f107030b;

    l(a aVar, Bundle bundle) {
        this.f107029a = bundle;
        this.f107030b = aVar;
    }

    @Override // com.google.android.gms.dynamic.q
    public final void a(e eVar) {
        this.f107030b.f107015a.h(this.f107029a);
    }

    @Override // com.google.android.gms.dynamic.q
    public final int c() {
        return 1;
    }
}
