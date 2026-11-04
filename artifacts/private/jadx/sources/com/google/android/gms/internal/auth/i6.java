package com.google.android.gms.internal.auth;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
final class i6 extends j6 {
    i6(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.auth.j6
    public final double a(Object obj, long j10) {
        return Double.longBitsToDouble(this.f107673a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.auth.j6
    public final float b(Object obj, long j10) {
        return Float.intBitsToFloat(this.f107673a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.auth.j6
    public final void c(Object obj, long j10, boolean z10) {
        if (k6.f107694g) {
            k6.i(obj, j10, z10);
        } else {
            k6.j(obj, j10, z10);
        }
    }

    @Override // com.google.android.gms.internal.auth.j6
    public final void d(Object obj, long j10, double d10) {
        this.f107673a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.auth.j6
    public final void e(Object obj, long j10, float f10) {
        this.f107673a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.auth.j6
    public final boolean f(Object obj, long j10) {
        return k6.f107694g ? k6.q(obj, j10) : k6.r(obj, j10);
    }
}
