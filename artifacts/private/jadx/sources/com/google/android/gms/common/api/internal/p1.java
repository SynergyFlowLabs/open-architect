package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes4.dex */
final class p1 implements d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f106164a;

    p1(i iVar) {
        this.f106164a = iVar;
    }

    @Override // com.google.android.gms.common.api.internal.d.a
    public final void a(boolean z10) {
        i iVar = this.f106164a;
        iVar.f106064n.sendMessage(iVar.f106064n.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
