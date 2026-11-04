package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class le implements ye {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ qe f110238a;

    le(qe qeVar) {
        Objects.requireNonNull(qeVar);
        this.f110238a = qeVar;
    }

    @Override // com.google.android.gms.measurement.internal.ye
    public final void a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f110238a.b().t(new ke(this, str, str2, bundle));
            return;
        }
        qe qeVar = this.f110238a;
        if (qeVar.x0() != null) {
            qeVar.x0().a().o().b("AppId not known when logging event", str2);
        }
    }
}
