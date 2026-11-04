package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes4.dex */
abstract class p0 extends c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final CharSequence f107988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final h0 f107989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f107990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f107991f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f107992g = Integer.MAX_VALUE;

    protected p0(b bVar, CharSequence charSequence) {
        this.f107989d = bVar.f107960a;
        this.f107990e = bVar.f107961b;
        this.f107988c = charSequence;
    }

    @Override // com.google.android.gms.internal.common.c0
    protected final /* bridge */ /* synthetic */ Object a() {
        int iC;
        int i10 = this.f107991f;
        while (true) {
            int i11 = this.f107991f;
            if (i11 == -1) {
                b();
                return null;
            }
            int iD = d(i11);
            if (iD == -1) {
                iD = this.f107988c.length();
                this.f107991f = -1;
                iC = -1;
            } else {
                iC = c(iD);
                this.f107991f = iC;
            }
            if (iC == i10) {
                int i12 = iC + 1;
                this.f107991f = i12;
                if (i12 > this.f107988c.length()) {
                    this.f107991f = -1;
                }
            } else {
                if (i10 < iD) {
                    this.f107988c.charAt(i10);
                }
                if (i10 < iD) {
                    this.f107988c.charAt(iD - 1);
                }
                if (!this.f107990e || i10 != iD) {
                    int i13 = this.f107992g;
                    if (i13 == 1) {
                        iD = this.f107988c.length();
                        this.f107991f = -1;
                        if (iD > i10) {
                            this.f107988c.charAt(iD - 1);
                        }
                    } else {
                        this.f107992g = i13 - 1;
                    }
                    return this.f107988c.subSequence(i10, iD).toString();
                }
                i10 = this.f107991f;
            }
        }
    }

    abstract int c(int i10);

    abstract int d(int i10);
}
