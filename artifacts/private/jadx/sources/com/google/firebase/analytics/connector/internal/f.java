package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
final class f implements n6.a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f120727a;

    public f(g gVar) {
        Objects.requireNonNull(gVar);
        this.f120727a = gVar;
    }

    @Override // n6.a.c, com.google.android.gms.measurement.internal.w8
    public final void a(String str, String str2, Bundle bundle, long j10) {
        if (str == null || !c.c(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j10);
        bundle2.putBundle("params", bundle);
        this.f120727a.c().a(3, bundle2);
    }
}
