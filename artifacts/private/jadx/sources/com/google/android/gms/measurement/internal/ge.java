package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class ge implements y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f110004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ te f110005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ qe f110006c;

    ge(qe qeVar, String str, te teVar) {
        this.f110004a = str;
        this.f110005b = teVar;
        Objects.requireNonNull(qeVar);
        this.f110006c = qeVar;
    }

    @Override // com.google.android.gms.measurement.internal.y5
    public final void a(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        this.f110006c.v(this.f110004a, i10, th2, bArr, this.f110005b);
    }
}
