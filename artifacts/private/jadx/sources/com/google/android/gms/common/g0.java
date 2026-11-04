package com.google.android.gms.common;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    private String f106416a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f106417b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.gms.internal.common.m f106418c = com.google.android.gms.internal.common.m.w();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.gms.internal.common.m f106419d = com.google.android.gms.internal.common.m.w();

    g0() {
    }

    final g0 a(long j10) {
        this.f106417b = j10;
        return this;
    }

    final g0 b(List list) {
        com.google.android.gms.common.internal.w.r(list);
        this.f106419d = com.google.android.gms.internal.common.m.v(list);
        return this;
    }

    final g0 c(List list) {
        com.google.android.gms.common.internal.w.r(list);
        this.f106418c = com.google.android.gms.internal.common.m.v(list);
        return this;
    }

    final g0 d(String str) {
        this.f106416a = str;
        return this;
    }

    final i0 e() {
        if (this.f106416a == null) {
            throw new IllegalStateException("packageName must be defined");
        }
        if (this.f106417b < 0) {
            throw new IllegalStateException("minimumStampedVersionNumber must be greater than or equal to 0");
        }
        if (this.f106418c.isEmpty() && this.f106419d.isEmpty()) {
            throw new IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
        }
        return new i0(this.f106416a, this.f106417b, this.f106418c, this.f106419d, null);
    }
}
