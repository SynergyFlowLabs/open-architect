package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
final class k9 extends l9 {
    k9(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.play_billing.l9
    public final double a(Object obj, long j10) {
        return Double.longBitsToDouble(this.f109200a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.play_billing.l9
    public final float b(Object obj, long j10) {
        return Float.intBitsToFloat(this.f109200a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.play_billing.l9
    public final void c(Object obj, long j10, boolean z10) {
        if (m9.f109227h) {
            m9.d(obj, j10, z10 ? (byte) 1 : (byte) 0);
        } else {
            m9.e(obj, j10, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.l9
    public final void d(Object obj, long j10, byte b10) {
        if (m9.f109227h) {
            m9.d(obj, j10, b10);
        } else {
            m9.e(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.l9
    public final void e(Object obj, long j10, double d10) {
        this.f109200a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.play_billing.l9
    public final void f(Object obj, long j10, float f10) {
        this.f109200a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.play_billing.l9
    public final boolean g(Object obj, long j10) {
        return m9.f109227h ? m9.y(obj, j10) : m9.z(obj, j10);
    }
}
