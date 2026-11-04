package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
final class e1 implements com.google.android.gms.common.api.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ a0 f106004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f106005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.common.api.l f106006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ i1 f106007d;

    e1(i1 i1Var, a0 a0Var, boolean z10, com.google.android.gms.common.api.l lVar) {
        this.f106004a = a0Var;
        this.f106005b = z10;
        this.f106006c = lVar;
        this.f106007d = i1Var;
    }

    @Override // com.google.android.gms.common.api.w
    public final /* bridge */ /* synthetic */ void a(@NonNull com.google.android.gms.common.api.v vVar) {
        Status status = (Status) vVar;
        com.google.android.gms.auth.api.signin.internal.b.b(this.f106007d.f106072i).i();
        if (status.q2() && this.f106007d.u()) {
            i1 i1Var = this.f106007d;
            i1Var.i();
            i1Var.g();
        }
        this.f106004a.o(status);
        if (this.f106005b) {
            this.f106006c.i();
        }
    }
}
