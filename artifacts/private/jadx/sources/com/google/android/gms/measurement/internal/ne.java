package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class ne {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f110300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f110301b;

    /* synthetic */ ne(qe qeVar, String str, byte[] bArr) {
        this(qeVar, str);
    }

    private ne(qe qeVar, String str) {
        Objects.requireNonNull(qeVar);
        this.f110300a = str;
        this.f110301b = qeVar.e().b();
    }

    /* synthetic */ ne(qe qeVar, byte[] bArr) {
        this(qeVar, qeVar.N0().l0());
    }
}
