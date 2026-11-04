package androidx.media3.datasource;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class d0 extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private RandomAccessFile f62467f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private Uri f62468g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f62469h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f62470i;

    public static final class a implements p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.p0
        private r1 f62471a;

        @Override // androidx.media3.datasource.p.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public d0 a() {
            d0 d0Var = new d0();
            r1 r1Var = this.f62471a;
            if (r1Var != null) {
                d0Var.s(r1Var);
            }
            return d0Var;
        }

        @z7.a
        public a d(@androidx.annotation.p0 r1 r1Var) {
            this.f62471a = r1Var;
            return this;
        }
    }

    public static class b extends u {
        @Deprecated
        public b(Exception exc) {
            super(exc, 2000);
        }

        @Deprecated
        public b(String str, IOException iOException) {
            super(str, iOException, 2000);
        }

        public b(Throwable th2, int i10) {
            super(th2, i10);
        }

        public b(@androidx.annotation.p0 String str, @androidx.annotation.p0 Throwable th2, int i10) {
            super(str, th2, i10);
        }
    }

    public d0() {
        super(false);
    }

    private static RandomAccessFile y(Uri uri) throws b {
        int i10 = androidx.media3.common.x0.f61820i3;
        try {
            return new RandomAccessFile((String) androidx.media3.common.util.a.g(uri.getPath()), "r");
        } catch (FileNotFoundException e10) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new b(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e10, 1004);
            }
            if (!(e10.getCause() instanceof ErrnoException) || ((ErrnoException) e10.getCause()).errno != OsConstants.EACCES) {
                i10 = androidx.media3.common.x0.f61818h3;
            }
            throw new b(e10, i10);
        } catch (SecurityException e11) {
            throw new b(e11, androidx.media3.common.x0.f61820i3);
        } catch (RuntimeException e12) {
            throw new b(e12, 2000);
        }
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    public long c(x xVar) throws b {
        Uri uri = xVar.f62594a;
        this.f62468g = uri;
        w(xVar);
        RandomAccessFile randomAccessFileY = y(uri);
        this.f62467f = randomAccessFileY;
        try {
            randomAccessFileY.seek(xVar.f62600g);
            long length = xVar.f62601h;
            if (length == -1) {
                length = this.f62467f.length() - xVar.f62600g;
            }
            this.f62469h = length;
            if (length < 0) {
                throw new b(null, null, 2008);
            }
            this.f62470i = true;
            x(xVar);
            return this.f62469h;
        } catch (IOException e10) {
            throw new b(e10, 2000);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000d */
    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() throws androidx.media3.datasource.d0.b {
        /*
            r6 = this;
            r0 = 0
            r6.f62468g = r0
            r1 = 3
            r1 = 0
            java.io.RandomAccessFile r2 = r6.f62467f     // Catch: java.lang.Throwable -> Ld java.io.IOException -> Lf
            if (r2 == 0) goto L12
            r2.close()     // Catch: java.lang.Throwable -> Ld java.io.IOException -> Lf
            goto L12
        Ld:
            r2 = move-exception
            goto L29
        Lf:
            r2 = move-exception
            r5 = 7
            goto L20
        L12:
            r5 = 5
            r6.f62467f = r0
            r5 = 2
            boolean r0 = r6.f62470i
            if (r0 == 0) goto L1f
            r6.f62470i = r1
            r6.v()
        L1f:
            return
        L20:
            r5 = 6
            androidx.media3.datasource.d0$b r3 = new androidx.media3.datasource.d0$b     // Catch: java.lang.Throwable -> Ld
            r4 = 2000(0x7d0, float:2.803E-42)
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> Ld
            throw r3     // Catch: java.lang.Throwable -> Ld
        L29:
            r6.f62467f = r0
            r5 = 2
            boolean r0 = r6.f62470i
            if (r0 == 0) goto L36
            r6.f62470i = r1
            r5 = 2
            r6.v()
        L36:
            r5 = 1
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.datasource.d0.close():void");
    }

    @Override // androidx.media3.datasource.p
    @androidx.annotation.p0
    public Uri getUri() {
        return this.f62468g;
    }

    @Override // androidx.media3.common.l, androidx.media3.datasource.g0
    public int read(byte[] bArr, int i10, int i11) throws b {
        if (i11 == 0) {
            return 0;
        }
        if (this.f62469h == 0) {
            return -1;
        }
        try {
            int i12 = ((RandomAccessFile) androidx.media3.common.util.k1.o(this.f62467f)).read(bArr, i10, (int) Math.min(this.f62469h, i11));
            if (i12 > 0) {
                this.f62469h -= (long) i12;
                u(i12);
            }
            return i12;
        } catch (IOException e10) {
            throw new b(e10, 2000);
        }
    }
}
