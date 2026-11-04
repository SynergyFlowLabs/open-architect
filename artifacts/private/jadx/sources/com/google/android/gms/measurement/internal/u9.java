package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class u9 implements ye {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ta f110585a;

    u9(ta taVar) {
        Objects.requireNonNull(taVar);
        this.f110585a = taVar;
    }

    @Override // com.google.android.gms.measurement.internal.ye
    public final void a(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.f110585a.p("auto", "_err", bundle);
        } else {
            this.f110585a.w("auto", "_err", bundle, str);
        }
    }
}
