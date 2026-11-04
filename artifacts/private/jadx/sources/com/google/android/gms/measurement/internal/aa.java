package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class aa implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ x f109751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ta f109752b;

    aa(ta taVar, x xVar) {
        this.f109751a = xVar;
        Objects.requireNonNull(taVar);
        this.f109752b = taVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ta taVar = this.f109752b;
        h7 h7Var = taVar.f110184a;
        k6 k6VarX = h7Var.x();
        h7 h7Var2 = k6VarX.f110184a;
        k6VarX.h();
        x xVarU = k6VarX.u();
        x xVar = this.f109751a;
        if (!r8.u(xVar.b(), xVarU.b())) {
            h7Var.a().u().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(xVar.b()));
            return;
        }
        SharedPreferences.Editor editorEdit = k6VarX.p().edit();
        editorEdit.putString("dma_consent_settings", xVar.e());
        editorEdit.apply();
        h7Var.a().w().b("Setting DMA consent(FE)", xVar);
        h7 h7Var3 = taVar.f110184a;
        if (h7Var3.J().D()) {
            h7Var3.J().a0();
        } else {
            h7Var3.J().Y(false);
        }
    }
}
