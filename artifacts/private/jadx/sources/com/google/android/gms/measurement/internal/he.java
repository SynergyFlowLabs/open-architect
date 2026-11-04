package com.google.android.gms.measurement.internal;

import android.content.Intent;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class he extends w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ qe f110060e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    he(qe qeVar, m8 m8Var) {
        super(m8Var);
        Objects.requireNonNull(qeVar);
        this.f110060e = qeVar;
    }

    @Override // com.google.android.gms.measurement.internal.w
    @androidx.annotation.m1
    public final void a() {
        qe qeVar = this.f110060e;
        qeVar.b().h();
        String str = (String) qeVar.y0().pollFirst();
        if (str != null) {
            qeVar.z0(qeVar.e().b());
            qeVar.a().w().b("Sending trigger URI notification to app", str);
            Intent intent = new Intent();
            intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intent.setPackage(str);
            qe.W(qeVar.d(), intent);
        }
        qeVar.v0();
    }
}
