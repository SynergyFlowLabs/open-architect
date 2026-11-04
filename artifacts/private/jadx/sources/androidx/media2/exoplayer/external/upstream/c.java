package androidx.media2.exoplayer.external.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.b1;
import androidx.collection.g3;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class c extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AssetManager f57250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private Uri f57251g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    private InputStream f57252h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f57253i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f57254j;

    public static final class a extends IOException {
        public a(IOException cause) {
            super(cause);
        }
    }

    public c(Context context) {
        super(false);
        this.f57250f = context.getAssets();
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public long b(o dataSpec) throws a {
        try {
            Uri uri = dataSpec.f57370a;
            this.f57251g = uri;
            String strSubstring = (String) androidx.media2.exoplayer.external.util.a.g(uri.getPath());
            if (strSubstring.startsWith("/android_asset/")) {
                strSubstring = strSubstring.substring(15);
            } else if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            g(dataSpec);
            InputStream inputStreamOpen = this.f57250f.open(strSubstring, 1);
            this.f57252h = inputStreamOpen;
            if (inputStreamOpen.skip(dataSpec.f57375f) < dataSpec.f57375f) {
                throw new EOFException();
            }
            long j10 = dataSpec.f57376g;
            if (j10 != -1) {
                this.f57253i = j10;
            } else {
                long jAvailable = this.f57252h.available();
                this.f57253i = jAvailable;
                if (jAvailable == g3.f12256c) {
                    this.f57253i = -1L;
                }
            }
            this.f57254j = true;
            i(dataSpec);
            return this.f57253i;
        } catch (IOException e10) {
            throw new a(e10);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000f */
    @Override // androidx.media2.exoplayer.external.upstream.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() throws androidx.media2.exoplayer.external.upstream.c.a {
        /*
            r5 = this;
            r0 = 0
            r4 = 3
            r5.f57251g = r0
            r1 = 0
            java.io.InputStream r2 = r5.f57252h     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L11
            r4 = 5
            if (r2 == 0) goto L13
            r2.close()     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L11
            r4 = 7
            goto L13
        Lf:
            r2 = move-exception
            goto L25
        L11:
            r2 = move-exception
            goto L1f
        L13:
            r5.f57252h = r0
            boolean r0 = r5.f57254j
            if (r0 == 0) goto L1e
            r5.f57254j = r1
            r5.e()
        L1e:
            return
        L1f:
            androidx.media2.exoplayer.external.upstream.c$a r3 = new androidx.media2.exoplayer.external.upstream.c$a     // Catch: java.lang.Throwable -> Lf
            r3.<init>(r2)     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> Lf
        L25:
            r5.f57252h = r0
            r4 = 1
            boolean r0 = r5.f57254j
            r4 = 0
            if (r0 == 0) goto L32
            r5.f57254j = r1
            r5.e()
        L32:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media2.exoplayer.external.upstream.c.close():void");
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    @androidx.annotation.p0
    public Uri getUri() {
        return this.f57251g;
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public int read(byte[] buffer, int offset, int readLength) throws a {
        if (readLength == 0) {
            return 0;
        }
        long j10 = this.f57253i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                readLength = (int) Math.min(j10, readLength);
            } catch (IOException e10) {
                throw new a(e10);
            }
        }
        int i10 = ((InputStream) androidx.media2.exoplayer.external.util.q0.i(this.f57252h)).read(buffer, offset, readLength);
        if (i10 == -1) {
            if (this.f57253i == -1) {
                return -1;
            }
            throw new a(new EOFException());
        }
        long j11 = this.f57253i;
        if (j11 != -1) {
            this.f57253i = j11 - ((long) i10);
        }
        d(i10);
        return i10;
    }
}
