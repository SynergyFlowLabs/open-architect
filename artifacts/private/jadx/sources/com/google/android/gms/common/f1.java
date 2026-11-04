package com.google.android.gms.common;

/* JADX INFO: loaded from: classes4.dex */
final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f106407a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private Boolean f106408b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private Boolean f106409c = null;

    private f1() {
    }

    final f1 a(boolean z10) {
        this.f106408b = Boolean.valueOf(z10);
        return this;
    }

    final f1 b(boolean z10) {
        this.f106409c = Boolean.valueOf(z10);
        return this;
    }

    final f1 c(String str) {
        this.f106407a = str;
        return this;
    }

    final b0 d() {
        Boolean bool = this.f106408b;
        if (bool == null) {
            throw new IllegalStateException("allowTestKeys must be set");
        }
        if (this.f106409c != null) {
            return new b0(this.f106407a, bool.booleanValue(), false, false, this.f106409c.booleanValue(), null, null);
        }
        throw new IllegalStateException("isGoogleOrPlatformOnly must be set");
    }

    /* synthetic */ f1(g1 g1Var) {
    }
}
