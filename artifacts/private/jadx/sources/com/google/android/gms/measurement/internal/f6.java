package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class f6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f109944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f109945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f109946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f109947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ k6 f109948e;

    public f6(k6 k6Var, String str, boolean z10) {
        Objects.requireNonNull(k6Var);
        this.f109948e = k6Var;
        com.google.android.gms.common.internal.w.l(str);
        this.f109944a = str;
        this.f109945b = z10;
    }

    @androidx.annotation.m1
    public final boolean a() {
        if (!this.f109946c) {
            this.f109946c = true;
            k6 k6Var = this.f109948e;
            this.f109947d = k6Var.p().getBoolean(this.f109944a, this.f109945b);
        }
        return this.f109947d;
    }

    @androidx.annotation.m1
    public final void b(boolean z10) {
        SharedPreferences.Editor editorEdit = this.f109948e.p().edit();
        editorEdit.putBoolean(this.f109944a, z10);
        editorEdit.apply();
        this.f109947d = z10;
    }
}
