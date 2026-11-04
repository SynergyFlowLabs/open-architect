package com.google.android.gms.measurement.internal;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
final class z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o8 f110743a;

    z2(o8 o8Var) {
        this.f110743a = o8Var;
    }

    static z2 c(String str) {
        return new z2((TextUtils.isEmpty(str) || str.length() > 1) ? o8.UNINITIALIZED : r8.j(str.charAt(0)));
    }

    final o8 a() {
        return this.f110743a;
    }

    final String b() {
        return String.valueOf(r8.m(this.f110743a));
    }
}
