package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
final class ae extends be {
    ae(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.be
    public final void a(Object obj, long j10, byte b10) {
        if (ce.f108342h) {
            ce.d(obj, j10, b10);
        } else {
            ce.e(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.be
    public final boolean b(Object obj, long j10) {
        return ce.f108342h ? ce.z(obj, j10) : ce.A(obj, j10);
    }

    @Override // com.google.android.gms.internal.measurement.be
    public final void c(Object obj, long j10, boolean z10) {
        if (ce.f108342h) {
            ce.d(obj, j10, z10 ? (byte) 1 : (byte) 0);
        } else {
            ce.e(obj, j10, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.be
    public final float d(Object obj, long j10) {
        return Float.intBitsToFloat(this.f108315a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.measurement.be
    public final void e(Object obj, long j10, float f10) {
        this.f108315a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.measurement.be
    public final double f(Object obj, long j10) {
        return Double.longBitsToDouble(this.f108315a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.measurement.be
    public final void g(Object obj, long j10, double d10) {
        this.f108315a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }
}
