package io.grpc.okhttp.internal.framed;

import java.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public final class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f290592e = 65536;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int f290593f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f290594g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int f290595h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final int f290596i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final int f290597j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final int f290598k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f290599l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final int f290600m = 3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f290601n = 4;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final int f290602o = 5;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final int f290603p = 5;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final int f290604q = 6;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f290605r = 6;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f290606s = 7;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final int f290607t = 8;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final int f290608u = 10;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final int f290609v = 10;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final int f290610w = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f290611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f290612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f290613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f290614d = new int[10];

    void a() {
        this.f290613c = 0;
        this.f290612b = 0;
        this.f290611a = 0;
        Arrays.fill(this.f290614d, 0);
    }

    int b(int i10) {
        int i11 = q(i10) ? 2 : 0;
        return t(i10) ? i11 | 1 : i11;
    }

    public int c(int i10) {
        return this.f290614d[i10];
    }

    int d(int i10) {
        return (this.f290611a & 256) != 0 ? this.f290614d[8] : i10;
    }

    int e(int i10) {
        return (this.f290611a & 32) != 0 ? this.f290614d[5] : i10;
    }

    int f(int i10) {
        return (this.f290611a & 4) != 0 ? this.f290614d[2] : i10;
    }

    int g(int i10) {
        return (this.f290611a & 64) != 0 ? this.f290614d[6] : i10;
    }

    boolean h(boolean z10) {
        int i10;
        if ((this.f290611a & 4) != 0) {
            i10 = this.f290614d[2];
        } else {
            i10 = z10 ? 1 : 0;
        }
        return i10 == 1;
    }

    int i() {
        if ((this.f290611a & 2) != 0) {
            return this.f290614d[1];
        }
        return -1;
    }

    int j(int i10) {
        return (this.f290611a & 128) != 0 ? this.f290614d[7] : i10;
    }

    int k(int i10) {
        return (this.f290611a & 16) != 0 ? this.f290614d[4] : i10;
    }

    int l(int i10) {
        return (this.f290611a & 32) != 0 ? this.f290614d[5] : i10;
    }

    int m(int i10) {
        return (this.f290611a & 64) != 0 ? this.f290614d[6] : i10;
    }

    int n(int i10) {
        return (this.f290611a & 8) != 0 ? this.f290614d[3] : i10;
    }

    int o(int i10) {
        return (this.f290611a & 2) != 0 ? this.f290614d[1] : i10;
    }

    boolean p() {
        return (((this.f290611a & 1024) != 0 ? this.f290614d[10] : 0) & 1) != 0;
    }

    boolean q(int i10) {
        return (this.f290613c & (1 << i10)) != 0;
    }

    public boolean r(int i10) {
        return (this.f290611a & (1 << i10)) != 0;
    }

    void s(i iVar) {
        for (int i10 = 0; i10 < 10; i10++) {
            if (iVar.r(i10)) {
                u(i10, iVar.b(i10), iVar.c(i10));
            }
        }
    }

    boolean t(int i10) {
        return (this.f290612b & (1 << i10)) != 0;
    }

    public i u(int i10, int i11, int i12) {
        int[] iArr = this.f290614d;
        if (i10 >= iArr.length) {
            return this;
        }
        int i13 = 1 << i10;
        this.f290611a |= i13;
        if ((i11 & 1) != 0) {
            this.f290612b |= i13;
        } else {
            this.f290612b &= ~i13;
        }
        if ((i11 & 2) != 0) {
            this.f290613c |= i13;
        } else {
            this.f290613c &= ~i13;
        }
        iArr[i10] = i12;
        return this;
    }

    int v() {
        return Integer.bitCount(this.f290611a);
    }
}
