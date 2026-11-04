package androidx.media3.datasource.cache;

import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.z;
import androidx.media3.datasource.x;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class b implements androidx.media3.datasource.o {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f62302k = 5242880;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f62303l = 20480;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f62304m = 2097152;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f62305n = "CacheDataSink";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media3.datasource.cache.a f62306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f62307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f62308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private x f62309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f62310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private File f62311f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private OutputStream f62312g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f62313h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f62314i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private s f62315j;

    public static final class a extends androidx.media3.datasource.cache.a.C0574a {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    /* JADX INFO: renamed from: androidx.media3.datasource.cache.b$b, reason: collision with other inner class name */
    public static final class C0575b implements androidx.media3.datasource.o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private androidx.media3.datasource.cache.a f62316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f62317b = b.f62302k;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f62318c = b.f62303l;

        @Override // androidx.media3.datasource.o.a
        public androidx.media3.datasource.o a() {
            return new b((androidx.media3.datasource.cache.a) androidx.media3.common.util.a.g(this.f62316a), this.f62317b, this.f62318c);
        }

        @z7.a
        public C0575b b(int i10) {
            this.f62318c = i10;
            return this;
        }

        @z7.a
        public C0575b c(androidx.media3.datasource.cache.a aVar) {
            this.f62316a = aVar;
            return this;
        }

        @z7.a
        public C0575b d(long j10) {
            this.f62317b = j10;
            return this;
        }
    }

    public b(androidx.media3.datasource.cache.a aVar, long j10) {
        this(aVar, j10, f62303l);
    }

    private void a() throws IOException {
        OutputStream outputStream = this.f62312g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            k1.t(this.f62312g);
            this.f62312g = null;
            File file = (File) k1.o(this.f62311f);
            this.f62311f = null;
            this.f62306a.o(file, this.f62313h);
        } catch (Throwable th2) {
            k1.t(this.f62312g);
            this.f62312g = null;
            File file2 = (File) k1.o(this.f62311f);
            this.f62311f = null;
            file2.delete();
            throw th2;
        }
    }

    private void b(x xVar) throws IOException {
        long j10 = xVar.f62601h;
        this.f62311f = this.f62306a.h((String) k1.o(xVar.f62602i), xVar.f62600g + this.f62314i, j10 != -1 ? Math.min(j10 - this.f62314i, this.f62310e) : -1L);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f62311f);
        if (this.f62308c > 0) {
            s sVar = this.f62315j;
            if (sVar == null) {
                this.f62315j = new s(fileOutputStream, this.f62308c);
            } else {
                sVar.a(fileOutputStream);
            }
            this.f62312g = this.f62315j;
        } else {
            this.f62312g = fileOutputStream;
        }
        this.f62313h = 0L;
    }

    @Override // androidx.media3.datasource.o
    public void c(x xVar) throws a {
        androidx.media3.common.util.a.g(xVar.f62602i);
        if (xVar.f62601h == -1 && xVar.d(2)) {
            this.f62309d = null;
            return;
        }
        this.f62309d = xVar;
        this.f62310e = xVar.d(4) ? this.f62307b : Long.MAX_VALUE;
        this.f62314i = 0L;
        try {
            b(xVar);
        } catch (IOException e10) {
            throw new a(e10);
        }
    }

    @Override // androidx.media3.datasource.o
    public void close() throws a {
        if (this.f62309d == null) {
            return;
        }
        try {
            a();
        } catch (IOException e10) {
            throw new a(e10);
        }
    }

    @Override // androidx.media3.datasource.o
    public void write(byte[] bArr, int i10, int i11) throws a {
        x xVar = this.f62309d;
        if (xVar == null) {
            return;
        }
        int i12 = 0;
        while (i12 < i11) {
            try {
                if (this.f62313h == this.f62310e) {
                    a();
                    b(xVar);
                }
                int iMin = (int) Math.min(i11 - i12, this.f62310e - this.f62313h);
                ((OutputStream) k1.o(this.f62312g)).write(bArr, i10 + i12, iMin);
                i12 += iMin;
                long j10 = iMin;
                this.f62313h += j10;
                this.f62314i += j10;
            } catch (IOException e10) {
                throw new a(e10);
            }
        }
    }

    public b(androidx.media3.datasource.cache.a aVar, long j10, int i10) {
        androidx.media3.common.util.a.j(j10 > 0 || j10 == -1, "fragmentSize must be positive or C.LENGTH_UNSET.");
        if (j10 != -1 && j10 < 2097152) {
            z.n(f62305n, "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        this.f62306a = (androidx.media3.datasource.cache.a) androidx.media3.common.util.a.g(aVar);
        this.f62307b = j10 == -1 ? Long.MAX_VALUE : j10;
        this.f62308c = i10;
    }
}
