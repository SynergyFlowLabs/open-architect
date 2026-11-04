package com.davidehrmann.vcdiff.engine;

/* JADX INFO: loaded from: classes3.dex */
class h implements Cloneable {
    protected static final short X = 256;
    public static final h Y;
    public static final int Z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final org.slf4j.c f97844h = org.slf4j.e.k(h.class);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f97845i = 256;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte f97846j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final byte f97847k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final byte f97848l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final byte f97849m = 3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected static final byte f97850n = 3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final byte f97851o = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final byte f97852s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final byte f97853t = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final byte f97854v = 3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final byte f97855w = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f97856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f97857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f97858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f97859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f97860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f97861f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile byte[] f97862g;

    static {
        h hVar = new h(new byte[]{2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3}, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1}, new byte[]{0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, com.google.common.base.c.f116461n, com.google.common.base.c.f116462o, com.google.common.base.c.f116463p, com.google.common.base.c.f116464q, com.google.common.base.c.f116465r, 17, 0, 4, 5, 6, 7, 8, 9, 10, 11, com.google.common.base.c.f116461n, com.google.common.base.c.f116462o, com.google.common.base.c.f116463p, com.google.common.base.c.f116464q, com.google.common.base.c.f116465r, 17, com.google.common.base.c.f116468u, 0, 4, 5, 6, 7, 8, 9, 10, 11, com.google.common.base.c.f116461n, com.google.common.base.c.f116462o, com.google.common.base.c.f116463p, com.google.common.base.c.f116464q, com.google.common.base.c.f116465r, 17, com.google.common.base.c.f116468u, 0, 4, 5, 6, 7, 8, 9, 10, 11, com.google.common.base.c.f116461n, com.google.common.base.c.f116462o, com.google.common.base.c.f116463p, com.google.common.base.c.f116464q, com.google.common.base.c.f116465r, 17, com.google.common.base.c.f116468u, 0, 4, 5, 6, 7, 8, 9, 10, 11, com.google.common.base.c.f116461n, com.google.common.base.c.f116462o, com.google.common.base.c.f116463p, com.google.common.base.c.f116464q, com.google.common.base.c.f116465r, 17, com.google.common.base.c.f116468u, 0, 4, 5, 6, 7, 8, 9, 10, 11, com.google.common.base.c.f116461n, com.google.common.base.c.f116462o, com.google.common.base.c.f116463p, com.google.common.base.c.f116464q, com.google.common.base.c.f116465r, 17, com.google.common.base.c.f116468u, 0, 4, 5, 6, 7, 8, 9, 10, 11, com.google.common.base.c.f116461n, com.google.common.base.c.f116462o, com.google.common.base.c.f116463p, com.google.common.base.c.f116464q, com.google.common.base.c.f116465r, 17, com.google.common.base.c.f116468u, 0, 4, 5, 6, 7, 8, 9, 10, 11, com.google.common.base.c.f116461n, com.google.common.base.c.f116462o, com.google.common.base.c.f116463p, com.google.common.base.c.f116464q, com.google.common.base.c.f116465r, 17, com.google.common.base.c.f116468u, 0, 4, 5, 6, 7, 8, 9, 10, 11, com.google.common.base.c.f116461n, com.google.common.base.c.f116462o, com.google.common.base.c.f116463p, com.google.common.base.c.f116464q, com.google.common.base.c.f116465r, 17, com.google.common.base.c.f116468u, 0, 4, 5, 6, 7, 8, 9, 10, 11, com.google.common.base.c.f116461n, com.google.common.base.c.f116462o, com.google.common.base.c.f116463p, com.google.common.base.c.f116464q, com.google.common.base.c.f116465r, 17, com.google.common.base.c.f116468u, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 1, 1, 1, 1, 1, 1, 1, 1, 1}, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8}, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        Y = hVar;
        Z = hVar.f().length;
    }

    public h() {
        this.f97856a = new byte[256];
        this.f97857b = new byte[256];
        this.f97858c = new byte[256];
        this.f97859d = new byte[256];
        this.f97860e = new byte[256];
        this.f97861f = new byte[256];
        this.f97862g = null;
    }

    public static String a(int i10) {
        if (i10 == 0) {
            return "NOOP";
        }
        if (i10 == 1) {
            return "ADD";
        }
        if (i10 != 2) {
            return i10 != 3 ? "" : "COPY";
        }
        return "RUN";
    }

    protected static boolean d(int i10, short s10, short s11, short s12, short s13, String str) {
        boolean z10;
        if (s10 > 3 || s10 < 0) {
            f97844h.b("VCDiff: Bad code table; opcode {} has invalid {} instruction type {}", Integer.valueOf(i10), str, Short.valueOf(s10));
            z10 = false;
        } else {
            z10 = true;
        }
        if (s12 > s13 || s12 < 0) {
            f97844h.b("VCDiff: Bad code table; opcode {} has invalid {} mode {}", Integer.valueOf(i10), str, Short.valueOf(s12));
            z10 = false;
        }
        if (s10 == 0 && s11 != 0) {
            f97844h.b("VCDiff: Bad code table; opcode {} has {} instruction NOOP with nonzero size {}", Integer.valueOf(i10), str, Short.valueOf(s11));
            z10 = false;
        }
        if (s11 < 0) {
            f97844h.b("VCDiff: Bad code table; opcode {} has {} instruction with size less than zero {}", Integer.valueOf(i10), str, Short.valueOf(s11));
            z10 = false;
        }
        if (s10 == 3 || s12 == 0) {
            return z10;
        }
        f97844h.b("VCDiff: Bad code table; opcode {} has non-COPY {} instruction with nonzero mode {}", Integer.valueOf(i10), str, Short.valueOf(s12));
        return false;
    }

    protected boolean b() {
        return c(f.f());
    }

    protected boolean c(short s10) {
        int i10 = s10 + 4;
        boolean[] zArr = new boolean[259];
        for (int i11 = 0; i11 < i10; i11++) {
            zArr[i11] = false;
        }
        int i12 = 0;
        boolean z10 = true;
        while (i12 < 256) {
            short s11 = s10;
            z10 = d(i12, (short) (this.f97857b[i12] & 255), (short) (this.f97859d[i12] & 255), (short) (this.f97861f[i12] & 255), s11, "second") && (d(i12, (short) (this.f97856a[i12] & 255), (short) (this.f97858c[i12] & 255), (short) (this.f97860e[i12] & 255), s11, "first") && z10);
            if (this.f97858c[i12] == 0 && this.f97857b[i12] == 0) {
                byte b10 = this.f97856a[i12];
                byte b11 = this.f97860e[i12];
                if ((b10 & 255) + (b11 & 255) < i10) {
                    zArr[(b10 & 255) + (b11 & 255)] = true;
                }
            }
            i12++;
            s10 = s11;
        }
        for (int i13 = 0; i13 < i10; i13++) {
            if (i13 != 0 && !zArr[i13]) {
                if (i13 >= 3) {
                    f97844h.w("VCDiff: Bad code table; there is no opcode for inst COPY, size 0, mode {}", Integer.valueOf(i13 - 3));
                } else {
                    f97844h.w("VCDiff: Bad code table; there is no opcode for inst {}, size -,  mode 0", a(i13));
                }
                z10 = false;
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public h clone() {
        return new h(this.f97856a, this.f97857b, this.f97858c, this.f97859d, this.f97860e, this.f97861f);
    }

    public byte[] f() {
        if (this.f97862g == null) {
            synchronized (this) {
                try {
                    if (this.f97862g == null) {
                        this.f97862g = new byte[this.f97856a.length + this.f97857b.length + this.f97858c.length + this.f97859d.length + this.f97860e.length + this.f97861f.length];
                        System.arraycopy(this.f97856a, 0, this.f97862g, 0, this.f97856a.length);
                        int length = this.f97856a.length;
                        System.arraycopy(this.f97857b, 0, this.f97862g, length, this.f97857b.length);
                        int length2 = length + this.f97857b.length;
                        System.arraycopy(this.f97858c, 0, this.f97862g, length2, this.f97858c.length);
                        int length3 = length2 + this.f97858c.length;
                        System.arraycopy(this.f97859d, 0, this.f97862g, length3, this.f97859d.length);
                        int length4 = length3 + this.f97859d.length;
                        System.arraycopy(this.f97860e, 0, this.f97862g, length4, this.f97860e.length);
                        System.arraycopy(this.f97861f, 0, this.f97862g, length4 + this.f97860e.length, this.f97861f.length);
                        int length5 = this.f97861f.length;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f97862g;
    }

    public h(byte[] bArr) {
        byte[] bArr2 = new byte[256];
        this.f97856a = bArr2;
        byte[] bArr3 = new byte[256];
        this.f97857b = bArr3;
        byte[] bArr4 = new byte[256];
        this.f97858c = bArr4;
        byte[] bArr5 = new byte[256];
        this.f97859d = bArr5;
        byte[] bArr6 = new byte[256];
        this.f97860e = bArr6;
        byte[] bArr7 = new byte[256];
        this.f97861f = bArr7;
        this.f97862g = null;
        if (bArr.length == bArr2.length + bArr3.length + bArr4.length + bArr5.length + bArr6.length + bArr7.length) {
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
            int length = bArr2.length;
            System.arraycopy(bArr, length, bArr3, 0, bArr3.length);
            int length2 = length + bArr3.length;
            System.arraycopy(bArr, length2, bArr4, 0, bArr4.length);
            int length3 = length2 + bArr4.length;
            System.arraycopy(bArr, length3, bArr5, 0, bArr5.length);
            int length4 = length3 + bArr5.length;
            System.arraycopy(bArr, length4, bArr6, 0, bArr6.length);
            System.arraycopy(bArr, length4 + bArr6.length, bArr7, 0, bArr7.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    public h(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        byte[] bArr7 = new byte[256];
        this.f97856a = bArr7;
        byte[] bArr8 = new byte[256];
        this.f97857b = bArr8;
        byte[] bArr9 = new byte[256];
        this.f97858c = bArr9;
        byte[] bArr10 = new byte[256];
        this.f97859d = bArr10;
        byte[] bArr11 = new byte[256];
        this.f97860e = bArr11;
        byte[] bArr12 = new byte[256];
        this.f97861f = bArr12;
        this.f97862g = null;
        if (bArr.length == 256 && bArr2.length == 256 && bArr3.length == 256 && bArr4.length == 256 && bArr5.length == 256 && bArr6.length == 256) {
            System.arraycopy(bArr, 0, bArr7, 0, 256);
            System.arraycopy(bArr2, 0, bArr8, 0, 256);
            System.arraycopy(bArr3, 0, bArr9, 0, 256);
            System.arraycopy(bArr4, 0, bArr10, 0, 256);
            System.arraycopy(bArr5, 0, bArr11, 0, 256);
            System.arraycopy(bArr6, 0, bArr12, 0, 256);
            return;
        }
        throw new IllegalArgumentException();
    }
}
