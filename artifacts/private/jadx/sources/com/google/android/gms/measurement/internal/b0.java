package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes4.dex */
final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f109764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f109765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f109766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f109767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final long f109768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final long f109769f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final long f109770g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Long f109771h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final Long f109772i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final Long f109773j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final Boolean f109774k;

    b0(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        com.google.android.gms.common.internal.w.l(str);
        com.google.android.gms.common.internal.w.l(str2);
        com.google.android.gms.common.internal.w.a(j10 >= 0);
        com.google.android.gms.common.internal.w.a(j11 >= 0);
        com.google.android.gms.common.internal.w.a(j12 >= 0);
        com.google.android.gms.common.internal.w.a(j14 >= 0);
        this.f109764a = str;
        this.f109765b = str2;
        this.f109766c = j10;
        this.f109767d = j11;
        this.f109768e = j12;
        this.f109769f = j13;
        this.f109770g = j14;
        this.f109771h = l10;
        this.f109772i = l11;
        this.f109773j = l12;
        this.f109774k = bool;
    }

    final b0 a(long j10) {
        return new b0(this.f109764a, this.f109765b, this.f109766c, this.f109767d, this.f109768e, j10, this.f109770g, this.f109771h, this.f109772i, this.f109773j, this.f109774k);
    }

    final b0 b(long j10, long j11) {
        return new b0(this.f109764a, this.f109765b, this.f109766c, this.f109767d, this.f109768e, this.f109769f, j10, Long.valueOf(j11), this.f109772i, this.f109773j, this.f109774k);
    }

    final b0 c(Long l10, Long l11, Boolean bool) {
        return new b0(this.f109764a, this.f109765b, this.f109766c, this.f109767d, this.f109768e, this.f109769f, this.f109770g, this.f109771h, l10, l11, bool);
    }
}
