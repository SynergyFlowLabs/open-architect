package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes4.dex */
final class a0 implements v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private com.google.android.gms.common.api.internal.o f108081a;

    a0(com.google.android.gms.common.api.internal.o oVar) {
        this.f108081a = oVar;
    }

    @Override // com.google.android.gms.internal.location.v2
    public final synchronized com.google.android.gms.common.api.internal.o a() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f108081a;
    }

    @Override // com.google.android.gms.internal.location.v2
    public final synchronized void b(com.google.android.gms.common.api.internal.o oVar) {
        try {
            com.google.android.gms.common.api.internal.o oVar2 = this.f108081a;
            if (oVar2 != oVar) {
                oVar2.a();
                this.f108081a = oVar;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.location.v2
    public final void h() {
    }
}
