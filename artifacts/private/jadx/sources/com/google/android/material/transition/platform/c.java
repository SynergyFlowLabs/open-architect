package com.google.android.material.transition.platform;

import androidx.annotation.w0;

/* JADX INFO: loaded from: classes4.dex */
@w0(21)
class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f114586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f114587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f114588c;

    private c(int i10, int i11, boolean z10) {
        this.f114586a = i10;
        this.f114587b = i11;
        this.f114588c = z10;
    }

    static c a(int i10, int i11) {
        return new c(i10, i11, true);
    }

    static c b(int i10, int i11) {
        return new c(i10, i11, false);
    }
}
