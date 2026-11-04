package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class h6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f110013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f110014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f110015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f110016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ k6 f110017e;

    public h6(k6 k6Var, String str, long j10) {
        Objects.requireNonNull(k6Var);
        this.f110017e = k6Var;
        com.google.android.gms.common.internal.w.l(str);
        this.f110013a = str;
        this.f110014b = j10;
    }

    @androidx.annotation.m1
    public final long a() {
        if (!this.f110015c) {
            this.f110015c = true;
            k6 k6Var = this.f110017e;
            this.f110016d = k6Var.p().getLong(this.f110013a, this.f110014b);
        }
        return this.f110016d;
    }

    @androidx.annotation.m1
    public final void b(long j10) {
        SharedPreferences.Editor editorEdit = this.f110017e.p().edit();
        editorEdit.putLong(this.f110013a, j10);
        editorEdit.apply();
        this.f110016d = j10;
    }
}
