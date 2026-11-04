package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class fe implements y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f109967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f109968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ qe f109969c;

    fe(qe qeVar, String str, List list) {
        this.f109967a = str;
        this.f109968b = list;
        Objects.requireNonNull(qeVar);
        this.f109969c = qeVar;
    }

    @Override // com.google.android.gms.measurement.internal.y5
    public final void a(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        this.f109969c.A(true, i10, th2, bArr, this.f109967a, this.f109968b);
    }
}
