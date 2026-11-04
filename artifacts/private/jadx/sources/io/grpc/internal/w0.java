package io.grpc.internal;

import java.io.Closeable;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipException;

/* JADX INFO: loaded from: classes13.dex */
@gj.c
class w0 implements Closeable {
    private static final int X = 8;
    private static final int Y = 2;
    private static final int Z = 4;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final int f289973p0 = 8;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final int f289974p1 = 16;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f289975s = 512;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f289976t = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f289977v = 35615;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f289978w = 10;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f289983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f289984f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Inflater f289985g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f289988j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f289989k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f289990l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f289979a = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CRC32 f289980b = new CRC32();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f289981c = new b(this, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f289982d = new byte[512];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c f289986h = c.HEADER;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f289987i = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f289991m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f289992n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f289993o = true;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f289994a;

        static {
            int[] iArr = new int[c.values().length];
            f289994a = iArr;
            try {
                iArr[c.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f289994a[c.HEADER_EXTRA_LEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f289994a[c.HEADER_EXTRA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f289994a[c.HEADER_NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f289994a[c.HEADER_COMMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                int i10 = 2 << 6;
                f289994a[c.HEADER_CRC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f289994a[c.INITIALIZE_INFLATER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f289994a[c.INFLATING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f289994a[c.INFLATER_NEEDS_INPUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f289994a[c.TRAILER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private class b {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean g() {
            while (k() > 0) {
                if (h() == 0) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int h() {
            int unsignedByte;
            if (w0.this.f289984f - w0.this.f289983e > 0) {
                unsignedByte = w0.this.f289982d[w0.this.f289983e] & 255;
                w0.c(w0.this, 1);
            } else {
                unsignedByte = w0.this.f289979a.readUnsignedByte();
            }
            w0.this.f289980b.update(unsignedByte);
            w0.g(w0.this, 1);
            return unsignedByte;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long i() {
            return ((long) j()) | (((long) j()) << 16);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int j() {
            return (h() << 8) | h();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int k() {
            return (w0.this.f289984f - w0.this.f289983e) + w0.this.f289979a.q0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l(int i10) {
            int i11;
            int i12 = w0.this.f289984f - w0.this.f289983e;
            if (i12 > 0) {
                int iMin = Math.min(i12, i10);
                w0.this.f289980b.update(w0.this.f289982d, w0.this.f289983e, iMin);
                w0.c(w0.this, iMin);
                i11 = i10 - iMin;
            } else {
                i11 = i10;
            }
            if (i11 > 0) {
                byte[] bArr = new byte[512];
                int i13 = 0;
                while (i13 < i11) {
                    int iMin2 = Math.min(i11 - i13, 512);
                    w0.this.f289979a.e7(bArr, 0, iMin2);
                    w0.this.f289980b.update(bArr, 0, iMin2);
                    i13 += iMin2;
                }
            }
            w0.g(w0.this, i10);
        }

        /* synthetic */ b(w0 w0Var, a aVar) {
            this();
        }
    }

    private enum c {
        HEADER,
        HEADER_EXTRA_LEN,
        HEADER_EXTRA,
        HEADER_NAME,
        HEADER_COMMENT,
        HEADER_CRC,
        INITIALIZE_INFLATER,
        INFLATING,
        INFLATER_NEEDS_INPUT,
        TRAILER
    }

    w0() {
    }

    private boolean E() {
        if ((this.f289988j & 16) != 16) {
            this.f289986h = c.HEADER_CRC;
            return true;
        }
        if (!this.f289981c.g()) {
            return false;
        }
        this.f289986h = c.HEADER_CRC;
        return true;
    }

    private boolean H() throws ZipException {
        if ((this.f289988j & 2) != 2) {
            this.f289986h = c.INITIALIZE_INFLATER;
            return true;
        }
        if (this.f289981c.k() < 2) {
            return false;
        }
        if ((((int) this.f289980b.getValue()) & 65535) != this.f289981c.j()) {
            throw new ZipException("Corrupt GZIP header");
        }
        this.f289986h = c.INITIALIZE_INFLATER;
        return true;
    }

    private boolean I() {
        int iK = this.f289981c.k();
        int i10 = this.f289989k;
        if (iK < i10) {
            return false;
        }
        this.f289981c.l(i10);
        this.f289986h = c.HEADER_NAME;
        int i11 = 4 ^ 1;
        return true;
    }

    private boolean N() {
        if ((this.f289988j & 4) != 4) {
            this.f289986h = c.HEADER_NAME;
            return true;
        }
        if (this.f289981c.k() < 2) {
            return false;
        }
        this.f289989k = this.f289981c.j();
        this.f289986h = c.HEADER_EXTRA;
        return true;
    }

    private boolean R() {
        if ((this.f289988j & 8) != 8) {
            this.f289986h = c.HEADER_COMMENT;
            return true;
        }
        if (!this.f289981c.g()) {
            return false;
        }
        this.f289986h = c.HEADER_COMMENT;
        return true;
    }

    private boolean T() throws ZipException {
        if (this.f289985g != null && this.f289981c.k() <= 18) {
            this.f289985g.end();
            this.f289985g = null;
        }
        if (this.f289981c.k() < 8) {
            return false;
        }
        if (this.f289980b.getValue() != this.f289981c.i() || this.f289990l != this.f289981c.i()) {
            throw new ZipException("Corrupt GZIP trailer");
        }
        this.f289980b.reset();
        this.f289986h = c.HEADER;
        return true;
    }

    static /* synthetic */ int c(w0 w0Var, int i10) {
        int i11 = w0Var.f289983e + i10;
        w0Var.f289983e = i11;
        return i11;
    }

    static /* synthetic */ int g(w0 w0Var, int i10) {
        int i11 = w0Var.f289991m + i10;
        w0Var.f289991m = i11;
        return i11;
    }

    private boolean j() {
        com.google.common.base.j0.h0(this.f289985g != null, "inflater is null");
        com.google.common.base.j0.h0(this.f289983e == this.f289984f, "inflaterInput has unconsumed bytes");
        int iMin = Math.min(this.f289979a.q0(), 512);
        if (iMin == 0) {
            return false;
        }
        this.f289983e = 0;
        this.f289984f = iMin;
        this.f289979a.e7(this.f289982d, 0, iMin);
        this.f289985g.setInput(this.f289982d, this.f289983e, iMin);
        this.f289986h = c.INFLATING;
        return true;
    }

    private int q(byte[] bArr, int i10, int i11) throws ZipException, DataFormatException {
        com.google.common.base.j0.h0(this.f289985g != null, "inflater is null");
        try {
            int totalIn = this.f289985g.getTotalIn();
            int iInflate = this.f289985g.inflate(bArr, i10, i11);
            int totalIn2 = this.f289985g.getTotalIn() - totalIn;
            this.f289991m += totalIn2;
            this.f289992n += totalIn2;
            this.f289983e += totalIn2;
            this.f289980b.update(bArr, i10, iInflate);
            if (this.f289985g.finished()) {
                this.f289990l = this.f289985g.getBytesWritten() & com.rabbitmq.client.k0.f265952a;
                this.f289986h = c.TRAILER;
                return iInflate;
            }
            if (this.f289985g.needsInput()) {
                this.f289986h = c.INFLATER_NEEDS_INPUT;
            }
            return iInflate;
        } catch (DataFormatException e10) {
            throw new DataFormatException("Inflater data format exception: " + e10.getMessage());
        }
    }

    private boolean t() {
        Inflater inflater = this.f289985g;
        if (inflater == null) {
            this.f289985g = new Inflater(true);
        } else {
            inflater.reset();
        }
        this.f289980b.reset();
        int i10 = this.f289984f;
        int i11 = this.f289983e;
        int i12 = i10 - i11;
        if (i12 > 0) {
            this.f289985g.setInput(this.f289982d, i11, i12);
            this.f289986h = c.INFLATING;
        } else {
            this.f289986h = c.INFLATER_NEEDS_INPUT;
        }
        return true;
    }

    private boolean y() throws ZipException {
        if (this.f289981c.k() < 10) {
            return false;
        }
        if (this.f289981c.j() != f289977v) {
            throw new ZipException("Not in GZIP format");
        }
        if (this.f289981c.h() != 8) {
            throw new ZipException("Unsupported compression method");
        }
        this.f289988j = this.f289981c.h();
        this.f289981c.l(6);
        this.f289986h = c.HEADER_EXTRA_LEN;
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f289987i) {
            this.f289987i = true;
            this.f289979a.close();
            Inflater inflater = this.f289985g;
            if (inflater != null) {
                inflater.end();
                this.f289985g = null;
            }
        }
    }

    void h(i2 i2Var) {
        com.google.common.base.j0.h0(!this.f289987i, "GzipInflatingBuffer is closed");
        this.f289979a.b(i2Var);
        this.f289993o = false;
    }

    int l() {
        int i10 = this.f289991m;
        this.f289991m = 0;
        return i10;
    }

    int m() {
        int i10 = this.f289992n;
        this.f289992n = 0;
        return i10;
    }

    boolean o() {
        com.google.common.base.j0.h0(!this.f289987i, "GzipInflatingBuffer is closed");
        return (this.f289981c.k() == 0 && this.f289986h == c.HEADER) ? false : true;
    }

    int r(byte[] bArr, int i10, int i11) throws ZipException, DataFormatException {
        boolean zT;
        boolean z10 = true;
        com.google.common.base.j0.h0(!this.f289987i, "GzipInflatingBuffer is closed");
        int iQ = 0;
        while (true) {
            zT = true;
            while (true) {
                if (zT) {
                    int i12 = i11 - iQ;
                    if (i12 > 0) {
                        switch (a.f289994a[this.f289986h.ordinal()]) {
                            case 1:
                                zT = y();
                                break;
                            case 2:
                                zT = N();
                                break;
                            case 3:
                                zT = I();
                                break;
                            case 4:
                                zT = R();
                                break;
                            case 5:
                                zT = E();
                                break;
                            case 6:
                                zT = H();
                                break;
                            case 7:
                                zT = t();
                                break;
                            case 8:
                                iQ += q(bArr, i10 + iQ, i12);
                                if (this.f289986h == c.TRAILER) {
                                    zT = T();
                                }
                                break;
                            case 9:
                                zT = j();
                                break;
                            case 10:
                                zT = T();
                                break;
                            default:
                                throw new AssertionError("Invalid state: " + this.f289986h);
                        }
                    }
                }
            }
        }
        if (zT && (this.f289986h != c.HEADER || this.f289981c.k() >= 10)) {
            z10 = false;
        }
        this.f289993o = z10;
        return iQ;
    }

    boolean x() {
        com.google.common.base.j0.h0(!this.f289987i, "GzipInflatingBuffer is closed");
        return this.f289993o;
    }
}
