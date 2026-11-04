package androidx.media3.datasource;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.collection.g3;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class d extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AssetManager f62462f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private Uri f62463g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    private InputStream f62464h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f62465i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f62466j;

    public static final class a extends u {
        @Deprecated
        public a(IOException iOException) {
            super(iOException, 2000);
        }

        public a(@androidx.annotation.p0 Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    public d(Context context) {
        super(false);
        this.f62462f = context.getAssets();
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    public long c(x xVar) throws a {
        try {
            Uri uri = xVar.f62594a;
            this.f62463g = uri;
            String strSubstring = (String) androidx.media3.common.util.a.g(uri.getPath());
            if (strSubstring.startsWith("/android_asset/")) {
                strSubstring = strSubstring.substring(15);
            } else if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            w(xVar);
            InputStream inputStreamOpen = this.f62462f.open(strSubstring, 1);
            this.f62464h = inputStreamOpen;
            if (inputStreamOpen.skip(xVar.f62600g) < xVar.f62600g) {
                throw new a(null, 2008);
            }
            long j10 = xVar.f62601h;
            if (j10 != -1) {
                this.f62465i = j10;
            } else {
                long jAvailable = this.f62464h.available();
                this.f62465i = jAvailable;
                if (jAvailable == g3.f12256c) {
                    this.f62465i = -1L;
                }
            }
            this.f62466j = true;
            x(xVar);
            return this.f62465i;
        } catch (a e10) {
            throw e10;
        } catch (IOException e11) {
            throw new a(e11, e11 instanceof FileNotFoundException ? androidx.media3.common.x0.f61818h3 : 2000);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000f */
    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() throws androidx.media3.datasource.d.a {
        /*
            r6 = this;
            r0 = 0
            r5 = r0
            r6.f62463g = r0
            r1 = 0
            r1 = 0
            java.io.InputStream r2 = r6.f62464h     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L11
            if (r2 == 0) goto L13
            r5 = 1
            r2.close()     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L11
            goto L13
        Lf:
            r2 = move-exception
            goto L29
        L11:
            r2 = move-exception
            goto L20
        L13:
            r6.f62464h = r0
            r5 = 3
            boolean r0 = r6.f62466j
            if (r0 == 0) goto L1f
            r6.f62466j = r1
            r6.v()
        L1f:
            return
        L20:
            androidx.media3.datasource.d$a r3 = new androidx.media3.datasource.d$a     // Catch: java.lang.Throwable -> Lf
            r5 = 1
            r4 = 2000(0x7d0, float:2.803E-42)
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> Lf
        L29:
            r6.f62464h = r0
            boolean r0 = r6.f62466j
            if (r0 == 0) goto L35
            r5 = 5
            r6.f62466j = r1
            r6.v()
        L35:
            r5 = 0
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.datasource.d.close():void");
    }

    @Override // androidx.media3.datasource.p
    @androidx.annotation.p0
    public Uri getUri() {
        return this.f62463g;
    }

    @Override // androidx.media3.common.l, androidx.media3.datasource.g0
    public int read(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f62465i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new a(e10, 2000);
            }
        }
        int i12 = ((InputStream) androidx.media3.common.util.k1.o(this.f62464h)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        long j11 = this.f62465i;
        if (j11 != -1) {
            this.f62465i = j11 - ((long) i12);
        }
        u(i12);
        return i12;
    }
}
