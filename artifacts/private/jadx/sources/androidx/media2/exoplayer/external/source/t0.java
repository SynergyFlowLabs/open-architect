package androidx.media2.exoplayer.external.source;

import androidx.media2.exoplayer.external.Format;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
final class t0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f56420u = 1000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f56429i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f56430j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f56431k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f56432l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f56435o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Format f56438r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Format f56439s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f56440t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f56421a = 1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f56422b = new int[1000];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long[] f56423c = new long[1000];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long[] f56426f = new long[1000];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int[] f56425e = new int[1000];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int[] f56424d = new int[1000];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private androidx.media2.exoplayer.external.extractor.s.a[] f56427g = new androidx.media2.exoplayer.external.extractor.s.a[1000];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Format[] f56428h = new Format[1000];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f56433m = Long.MIN_VALUE;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f56434n = Long.MIN_VALUE;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f56437q = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f56436p = true;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f56441a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f56442b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public androidx.media2.exoplayer.external.extractor.s.a f56443c;
    }

    private long e(int discardCount) {
        this.f56433m = Math.max(this.f56433m, o(discardCount));
        int i10 = this.f56429i - discardCount;
        this.f56429i = i10;
        this.f56430j += discardCount;
        int i11 = this.f56431k + discardCount;
        this.f56431k = i11;
        int i12 = this.f56421a;
        if (i11 >= i12) {
            this.f56431k = i11 - i12;
        }
        int i13 = this.f56432l - discardCount;
        this.f56432l = i13;
        if (i13 < 0) {
            this.f56432l = 0;
        }
        if (i10 != 0) {
            return this.f56423c[this.f56431k];
        }
        int i14 = this.f56431k;
        if (i14 != 0) {
            i12 = i14;
        }
        int i15 = i12 - 1;
        return this.f56423c[i15] + ((long) this.f56424d[i15]);
    }

    private int j(int relativeStartIndex, int length, long timeUs, boolean keyframe) {
        int i10 = -1;
        for (int i11 = 0; i11 < length && this.f56426f[relativeStartIndex] <= timeUs; i11++) {
            if (!keyframe || (this.f56425e[relativeStartIndex] & 1) != 0) {
                i10 = i11;
            }
            relativeStartIndex++;
            if (relativeStartIndex == this.f56421a) {
                relativeStartIndex = 0;
            }
        }
        return i10;
    }

    private long o(int length) {
        long jMax = Long.MIN_VALUE;
        if (length == 0) {
            return Long.MIN_VALUE;
        }
        int iQ = q(length - 1);
        for (int i10 = 0; i10 < length; i10++) {
            jMax = Math.max(jMax, this.f56426f[iQ]);
            if ((this.f56425e[iQ] & 1) != 0) {
                return jMax;
            }
            iQ--;
            if (iQ == -1) {
                iQ = this.f56421a - 1;
            }
        }
        return jMax;
    }

    private int q(int offset) {
        int i10 = this.f56431k + offset;
        int i11 = this.f56421a;
        return i10 < i11 ? i10 : i10 - i11;
    }

    public synchronized boolean A(int sampleIndex) {
        int i10 = this.f56430j;
        if (i10 > sampleIndex || sampleIndex > this.f56429i + i10) {
            return false;
        }
        this.f56432l = sampleIndex - i10;
        return true;
    }

    public void B(int sourceId) {
        this.f56440t = sourceId;
    }

    public synchronized int a(long timeUs, boolean toKeyframe, boolean allowTimeBeyondBuffer) throws Throwable {
        try {
            try {
                int iQ = q(this.f56432l);
                if (!t() || timeUs < this.f56426f[iQ] || (timeUs > this.f56434n && !allowTimeBeyondBuffer)) {
                    return -1;
                }
                int iJ = j(iQ, this.f56429i - this.f56432l, timeUs, toKeyframe);
                if (iJ == -1) {
                    return -1;
                }
                this.f56432l += iJ;
                return iJ;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public synchronized int b() {
        int i10;
        try {
            int i11 = this.f56429i;
            i10 = i11 - this.f56432l;
            this.f56432l = i11;
        } catch (Throwable th2) {
            throw th2;
        }
        return i10;
    }

    public synchronized boolean c(long timeUs) {
        if (this.f56429i == 0) {
            return timeUs > this.f56433m;
        }
        if (Math.max(this.f56433m, o(this.f56432l)) >= timeUs) {
            return false;
        }
        int i10 = this.f56429i;
        int iQ = q(i10 - 1);
        while (i10 > this.f56432l && this.f56426f[iQ] >= timeUs) {
            i10--;
            iQ--;
            if (iQ == -1) {
                iQ = this.f56421a - 1;
            }
        }
        i(this.f56430j + i10);
        return true;
    }

    public synchronized void d(long timeUs, int sampleFlags, long offset, int size, androidx.media2.exoplayer.external.extractor.s.a cryptoData) {
        try {
            if (this.f56436p) {
                if ((sampleFlags & 1) == 0) {
                    return;
                } else {
                    this.f56436p = false;
                }
            }
            androidx.media2.exoplayer.external.util.a.i(!this.f56437q);
            this.f56435o = (536870912 & sampleFlags) != 0;
            this.f56434n = Math.max(this.f56434n, timeUs);
            int iQ = q(this.f56429i);
            this.f56426f[iQ] = timeUs;
            long[] jArr = this.f56423c;
            jArr[iQ] = offset;
            this.f56424d[iQ] = size;
            this.f56425e[iQ] = sampleFlags;
            this.f56427g[iQ] = cryptoData;
            Format[] formatArr = this.f56428h;
            Format format = this.f56438r;
            formatArr[iQ] = format;
            this.f56422b[iQ] = this.f56440t;
            this.f56439s = format;
            int i10 = this.f56429i + 1;
            this.f56429i = i10;
            int i11 = this.f56421a;
            if (i10 == i11) {
                int i12 = i11 + 1000;
                int[] iArr = new int[i12];
                long[] jArr2 = new long[i12];
                long[] jArr3 = new long[i12];
                int[] iArr2 = new int[i12];
                int[] iArr3 = new int[i12];
                androidx.media2.exoplayer.external.extractor.s.a[] aVarArr = new androidx.media2.exoplayer.external.extractor.s.a[i12];
                Format[] formatArr2 = new Format[i12];
                int i13 = this.f56431k;
                int i14 = i11 - i13;
                System.arraycopy(jArr, i13, jArr2, 0, i14);
                System.arraycopy(this.f56426f, this.f56431k, jArr3, 0, i14);
                System.arraycopy(this.f56425e, this.f56431k, iArr2, 0, i14);
                System.arraycopy(this.f56424d, this.f56431k, iArr3, 0, i14);
                System.arraycopy(this.f56427g, this.f56431k, aVarArr, 0, i14);
                System.arraycopy(this.f56428h, this.f56431k, formatArr2, 0, i14);
                System.arraycopy(this.f56422b, this.f56431k, iArr, 0, i14);
                int i15 = this.f56431k;
                System.arraycopy(this.f56423c, 0, jArr2, i14, i15);
                System.arraycopy(this.f56426f, 0, jArr3, i14, i15);
                System.arraycopy(this.f56425e, 0, iArr2, i14, i15);
                System.arraycopy(this.f56424d, 0, iArr3, i14, i15);
                System.arraycopy(this.f56427g, 0, aVarArr, i14, i15);
                System.arraycopy(this.f56428h, 0, formatArr2, i14, i15);
                System.arraycopy(this.f56422b, 0, iArr, i14, i15);
                this.f56423c = jArr2;
                this.f56426f = jArr3;
                this.f56425e = iArr2;
                this.f56424d = iArr3;
                this.f56427g = aVarArr;
                this.f56428h = formatArr2;
                this.f56422b = iArr;
                this.f56431k = 0;
                this.f56429i = this.f56421a;
                this.f56421a = i12;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long f(long timeUs, boolean toKeyframe, boolean stopAtReadPosition) throws Throwable {
        Throwable th2;
        try {
            try {
                int i10 = this.f56429i;
                if (i10 != 0) {
                    long[] jArr = this.f56426f;
                    int i11 = this.f56431k;
                    if (timeUs >= jArr[i11]) {
                        if (stopAtReadPosition) {
                            try {
                                int i12 = this.f56432l;
                                if (i12 != i10) {
                                    i10 = i12 + 1;
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                throw th2;
                            }
                        }
                        int iJ = j(i11, i10, timeUs, toKeyframe);
                        if (iJ == -1) {
                            return -1L;
                        }
                        return e(iJ);
                    }
                }
                return -1L;
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    public synchronized long g() {
        try {
            int i10 = this.f56429i;
            if (i10 == 0) {
                return -1L;
            }
            return e(i10);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long h() {
        int i10 = this.f56432l;
        if (i10 == 0) {
            return -1L;
        }
        return e(i10);
    }

    public long i(int discardFromIndex) {
        int iS = s() - discardFromIndex;
        boolean z10 = false;
        androidx.media2.exoplayer.external.util.a.a(iS >= 0 && iS <= this.f56429i - this.f56432l);
        int i10 = this.f56429i - iS;
        this.f56429i = i10;
        this.f56434n = Math.max(this.f56433m, o(i10));
        if (iS == 0 && this.f56435o) {
            z10 = true;
        }
        this.f56435o = z10;
        int i11 = this.f56429i;
        if (i11 == 0) {
            return 0L;
        }
        int iQ = q(i11 - 1);
        return this.f56423c[iQ] + ((long) this.f56424d[iQ]);
    }

    public synchronized boolean k(Format format) {
        try {
            if (format == null) {
                this.f56437q = true;
                return false;
            }
            this.f56437q = false;
            if (androidx.media2.exoplayer.external.util.q0.b(format, this.f56438r)) {
                return false;
            }
            if (androidx.media2.exoplayer.external.util.q0.b(format, this.f56439s)) {
                this.f56438r = this.f56439s;
                return true;
            }
            this.f56438r = format;
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public int l() {
        return this.f56430j;
    }

    public synchronized long m() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f56429i == 0 ? Long.MIN_VALUE : this.f56426f[this.f56431k];
    }

    public synchronized long n() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f56434n;
    }

    public int p() {
        return this.f56430j + this.f56432l;
    }

    public synchronized Format r() {
        return this.f56437q ? null : this.f56438r;
    }

    public int s() {
        return this.f56430j + this.f56429i;
    }

    public synchronized boolean t() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f56432l != this.f56429i;
    }

    public synchronized boolean u() {
        return this.f56435o;
    }

    public synchronized int v(Format downstreamFormat) {
        try {
            int i10 = this.f56432l;
            if (i10 == this.f56429i) {
                return 0;
            }
            int iQ = q(i10);
            if (this.f56428h[iQ] != downstreamFormat) {
                return 1;
            }
            return (this.f56425e[iQ] & 1073741824) != 0 ? 3 : 2;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public int w() {
        return t() ? this.f56422b[q(this.f56432l)] : this.f56440t;
    }

    public synchronized int x(androidx.media2.exoplayer.external.d0 formatHolder, androidx.media2.exoplayer.external.decoder.e buffer, boolean formatRequired, boolean allowOnlyClearBuffers, boolean loadingFinished, Format downstreamFormat, a extrasHolder) {
        try {
            if (!t()) {
                if (!loadingFinished && !this.f56435o) {
                    Format format = this.f56438r;
                    if (format == null || (!formatRequired && format == downstreamFormat)) {
                        return -3;
                    }
                    formatHolder.f53762c = format;
                    return -5;
                }
                buffer.w(4);
                return -4;
            }
            int iQ = q(this.f56432l);
            if (!formatRequired && this.f56428h[iQ] == downstreamFormat) {
                if (allowOnlyClearBuffers && (this.f56425e[iQ] & 1073741824) != 0) {
                    return -3;
                }
                buffer.w(this.f56425e[iQ]);
                buffer.f53790d = this.f56426f[iQ];
                if (buffer.H()) {
                    return -4;
                }
                extrasHolder.f56441a = this.f56424d[iQ];
                extrasHolder.f56442b = this.f56423c[iQ];
                extrasHolder.f56443c = this.f56427g[iQ];
                this.f56432l++;
                return -4;
            }
            formatHolder.f53762c = this.f56428h[iQ];
            return -5;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void y(boolean resetUpstreamFormat) {
        this.f56429i = 0;
        this.f56430j = 0;
        this.f56431k = 0;
        this.f56432l = 0;
        this.f56436p = true;
        this.f56433m = Long.MIN_VALUE;
        this.f56434n = Long.MIN_VALUE;
        this.f56435o = false;
        this.f56439s = null;
        if (resetUpstreamFormat) {
            this.f56438r = null;
            this.f56437q = true;
        }
    }

    public synchronized void z() {
        try {
            this.f56432l = 0;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
