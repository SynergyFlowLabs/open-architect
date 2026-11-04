package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
final class y implements androidx.loader.app.a.InterfaceC0484a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ SignInHubActivity f105692a;

    /* synthetic */ y(SignInHubActivity signInHubActivity, z zVar) {
        this.f105692a = signInHubActivity;
    }

    @Override // androidx.loader.app.a.InterfaceC0484a
    public final androidx.loader.content.c a(int i10, Bundle bundle) {
        return new f(this.f105692a, com.google.android.gms.common.api.l.n());
    }

    @Override // androidx.loader.app.a.InterfaceC0484a
    public final /* bridge */ /* synthetic */ void b(androidx.loader.content.c cVar, Object obj) {
        SignInHubActivity signInHubActivity = this.f105692a;
        signInHubActivity.setResult(signInHubActivity.f105666d, signInHubActivity.f105667e);
        this.f105692a.finish();
    }

    @Override // androidx.loader.app.a.InterfaceC0484a
    public final void c(androidx.loader.content.c cVar) {
    }
}
