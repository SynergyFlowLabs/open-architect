package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes4.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f112141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f112142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f112143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f112144d;

    public e(double d10, double d11, double d12, double d13) {
        this.f112141a = d10;
        this.f112142b = d11;
        this.f112143c = d12;
        this.f112144d = d13;
    }

    public double a(double d10) {
        if (d10 <= -1.0d) {
            return this.f112141a;
        }
        if (d10 < 0.0d) {
            return v5.d(this.f112141a, this.f112142b, (d10 - (-1.0d)) / 1.0d);
        }
        if (d10 < 0.5d) {
            return v5.d(this.f112142b, this.f112143c, (d10 - 0.0d) / 0.5d);
        }
        return d10 < 1.0d ? v5.d(this.f112143c, this.f112144d, (d10 - 0.5d) / 0.5d) : this.f112144d;
    }
}
