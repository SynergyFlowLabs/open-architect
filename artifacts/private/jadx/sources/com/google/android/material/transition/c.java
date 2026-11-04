package com.google.android.material.transition;

/* JADX INFO: loaded from: classes4.dex */
class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f114482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f114483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f114484c;

    private c(int i10, int i11, boolean z10) {
        this.f114482a = i10;
        this.f114483b = i11;
        this.f114484c = z10;
    }

    static c a(int i10, int i11) {
        return new c(i10, i11, true);
    }

    static c b(int i10, int i11) {
        return new c(i10, i11, false);
    }
}
