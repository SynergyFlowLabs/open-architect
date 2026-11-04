package com.bumptech.glide.load.resource.bitmap;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements ImageHeaderParser {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f97019b = "DfltImageHeaderParser";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f97020c = 4671814;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f97021d = -1991225785;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f97022e = 65496;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f97023f = 19789;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f97024g = 18761;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f97027j = 218;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f97028k = 217;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final int f97029l = 255;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final int f97030m = 225;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f97031n = 274;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f97033p = 1380533830;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f97034q = 1464156752;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f97035r = 1448097792;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f97036s = -256;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f97037t = 255;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f97038u = 88;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f97039v = 76;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f97040w = 16;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f97041x = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f97025h = "Exif\u0000\u0000";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final byte[] f97026i = f97025h.getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int[] f97032o = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    private static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f97042a;

        a(ByteBuffer byteBuffer) {
            this.f97042a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.o.c
        public int a() throws c.a {
            return c() | (c() << 8);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.o.c
        public int b(byte[] bArr, int i10) {
            int iMin = Math.min(i10, this.f97042a.remaining());
            if (iMin == 0) {
                return -1;
            }
            this.f97042a.get(bArr, 0, iMin);
            return iMin;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.o.c
        public short c() throws c.a {
            if (this.f97042a.remaining() >= 1) {
                return (short) (this.f97042a.get() & 255);
            }
            throw new c.a();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.o.c
        public long skip(long j10) {
            int iMin = (int) Math.min(this.f97042a.remaining(), j10);
            ByteBuffer byteBuffer = this.f97042a;
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f97043a;

        b(byte[] bArr, int i10) {
            this.f97043a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
        }

        private boolean c(int i10, int i11) {
            return this.f97043a.remaining() - i10 >= i11;
        }

        short a(int i10) {
            if (c(i10, 2)) {
                return this.f97043a.getShort(i10);
            }
            return (short) -1;
        }

        int b(int i10) {
            if (c(i10, 4)) {
                return this.f97043a.getInt(i10);
            }
            return -1;
        }

        int d() {
            return this.f97043a.remaining();
        }

        void e(ByteOrder byteOrder) {
            this.f97043a.order(byteOrder);
        }
    }

    private interface c {

        public static final class a extends IOException {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static final long f97044a = 1;

            a() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a() throws IOException;

        int b(byte[] bArr, int i10) throws IOException;

        short c() throws IOException;

        long skip(long j10) throws IOException;
    }

    private static final class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InputStream f97045a;

        d(InputStream inputStream) {
            this.f97045a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.o.c
        public int a() throws IOException {
            return c() | (c() << 8);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.o.c
        public int b(byte[] bArr, int i10) throws IOException {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10 && (i12 = this.f97045a.read(bArr, i11, i10 - i11)) != -1) {
                i11 += i12;
            }
            if (i11 == 0 && i12 == -1) {
                throw new c.a();
            }
            return i11;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.o.c
        public short c() throws IOException {
            int i10 = this.f97045a.read();
            if (i10 != -1) {
                return (short) i10;
            }
            throw new c.a();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.o.c
        public long skip(long j10) throws IOException {
            if (j10 < 0) {
                return 0L;
            }
            long j11 = j10;
            while (j11 > 0) {
                long jSkip = this.f97045a.skip(j11);
                if (jSkip <= 0) {
                    if (this.f97045a.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j11 -= jSkip;
            }
            return j10 - j11;
        }
    }

    private static int e(int i10, int i11) {
        return i10 + 2 + (i11 * 12);
    }

    private int f(c cVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        int iJ;
        try {
            if (h(cVar.a()) && (iJ = j(cVar)) != -1) {
                byte[] bArr = (byte[]) bVar.a(iJ, byte[].class);
                try {
                    int iL = l(cVar, bArr, iJ);
                    bVar.put(bArr);
                    return iL;
                } catch (Throwable th2) {
                    bVar.put(bArr);
                    throw th2;
                }
            }
            return -1;
        } catch (c.a unused) {
            return -1;
        }
    }

    @NonNull
    private ImageHeaderParser.ImageType g(c cVar) throws IOException {
        try {
            int iA = cVar.a();
            if (iA == f97022e) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int iC = (iA << 8) | cVar.c();
            if (iC == f97020c) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int iC2 = (iC << 8) | cVar.c();
            if (iC2 == f97021d) {
                cVar.skip(21L);
                try {
                    return cVar.c() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (c.a unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (iC2 != 1380533830) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            cVar.skip(4L);
            if (((cVar.a() << 16) | cVar.a()) != f97034q) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int iA2 = (cVar.a() << 16) | cVar.a();
            if ((iA2 & (-256)) != f97035r) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i10 = iA2 & 255;
            if (i10 == 88) {
                cVar.skip(4L);
                return (cVar.c() & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (i10 != 76) {
                return ImageHeaderParser.ImageType.WEBP;
            }
            cVar.skip(4L);
            return (cVar.c() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        } catch (c.a unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    private static boolean h(int i10) {
        return (i10 & f97022e) == f97022e || i10 == f97023f || i10 == f97024g;
    }

    private boolean i(byte[] bArr, int i10) {
        boolean z10 = bArr != null && i10 > f97026i.length;
        if (z10) {
            int i11 = 0;
            while (true) {
                byte[] bArr2 = f97026i;
                if (i11 >= bArr2.length) {
                    break;
                }
                if (bArr[i11] != bArr2[i11]) {
                    return false;
                }
                i11++;
            }
        }
        return z10;
    }

    private int j(c cVar) throws IOException {
        short sC;
        while (cVar.c() == 255 && (sC = cVar.c()) != f97027j && sC != f97028k) {
            int iA = cVar.a() - 2;
            if (sC == f97030m) {
                return iA;
            }
            long j10 = iA;
            if (cVar.skip(j10) != j10) {
                return -1;
            }
        }
        return -1;
    }

    private static int k(b bVar) {
        short sA;
        int iB;
        int i10;
        int i11;
        short sA2 = bVar.a(6);
        bVar.e(sA2 != f97024g ? sA2 != f97023f ? ByteOrder.BIG_ENDIAN : ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        int iB2 = bVar.b(10) + 6;
        short sA3 = bVar.a(iB2);
        for (int i12 = 0; i12 < sA3; i12++) {
            int iE = e(iB2, i12);
            if (bVar.a(iE) == f97031n && (sA = bVar.a(iE + 2)) >= 1 && sA <= 12 && (iB = bVar.b(iE + 4)) >= 0 && (i10 = iB + f97032o[sA]) <= 4 && (i11 = iE + 8) >= 0 && i11 <= bVar.d() && i10 >= 0 && i10 + i11 <= bVar.d()) {
                return bVar.a(i11);
            }
        }
        return -1;
    }

    private int l(c cVar, byte[] bArr, int i10) throws IOException {
        if (cVar.b(bArr, i10) == i10 && i(bArr, i10)) {
            return k(new b(bArr, i10));
        }
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int a(@NonNull ByteBuffer byteBuffer, @NonNull com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        return f(new a((ByteBuffer) com.bumptech.glide.util.k.d(byteBuffer)), (com.bumptech.glide.load.engine.bitmap_recycle.b) com.bumptech.glide.util.k.d(bVar));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public ImageHeaderParser.ImageType b(@NonNull InputStream inputStream) throws IOException {
        return g(new d((InputStream) com.bumptech.glide.util.k.d(inputStream)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int c(@NonNull InputStream inputStream, @NonNull com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        return f(new d((InputStream) com.bumptech.glide.util.k.d(inputStream)), (com.bumptech.glide.load.engine.bitmap_recycle.b) com.bumptech.glide.util.k.d(bVar));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public ImageHeaderParser.ImageType d(@NonNull ByteBuffer byteBuffer) throws IOException {
        return g(new a((ByteBuffer) com.bumptech.glide.util.k.d(byteBuffer)));
    }
}
