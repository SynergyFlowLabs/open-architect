package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class j6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f110103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f110104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f110105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ k6 f110106d;

    public j6(k6 k6Var, String str, String str2) {
        Objects.requireNonNull(k6Var);
        this.f110106d = k6Var;
        com.google.android.gms.common.internal.w.l(str);
        this.f110103a = str;
    }

    @androidx.annotation.m1
    public final String a() {
        if (!this.f110104b) {
            this.f110104b = true;
            k6 k6Var = this.f110106d;
            this.f110105c = k6Var.p().getString(this.f110103a, null);
        }
        return this.f110105c;
    }

    @androidx.annotation.m1
    public final void b(String str) {
        SharedPreferences.Editor editorEdit = this.f110106d.p().edit();
        editorEdit.putString(this.f110103a, str);
        editorEdit.apply();
        this.f110105c = str;
    }
}
