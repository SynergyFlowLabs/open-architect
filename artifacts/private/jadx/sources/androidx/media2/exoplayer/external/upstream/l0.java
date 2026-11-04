package androidx.media2.exoplayer.external.upstream;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.b1;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class l0 extends e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f57343l = "rawresource";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Resources f57344f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private Uri f57345g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    private AssetFileDescriptor f57346h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    private InputStream f57347i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f57348j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f57349k;

    public static class a extends IOException {
        public a(String message) {
            super(message);
        }

        public a(IOException e10) {
            super(e10);
        }
    }

    public l0(Context context) {
        super(false);
        this.f57344f = context.getResources();
    }

    public static Uri k(int rawResourceId) {
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("rawresource:///");
        sb2.append(rawResourceId);
        return Uri.parse(sb2.toString());
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public long b(o dataSpec) throws a {
        try {
            Uri uri = dataSpec.f57370a;
            this.f57345g = uri;
            if (!TextUtils.equals("rawresource", uri.getScheme())) {
                throw new a("URI must use scheme rawresource");
            }
            try {
                int i10 = Integer.parseInt((String) androidx.media2.exoplayer.external.util.a.g(uri.getLastPathSegment()));
                g(dataSpec);
                AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = this.f57344f.openRawResourceFd(i10);
                this.f57346h = assetFileDescriptorOpenRawResourceFd;
                if (assetFileDescriptorOpenRawResourceFd == null) {
                    String strValueOf = String.valueOf(uri);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 24);
                    sb2.append("Resource is compressed: ");
                    sb2.append(strValueOf);
                    throw new a(sb2.toString());
                }
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenRawResourceFd.getFileDescriptor());
                this.f57347i = fileInputStream;
                fileInputStream.skip(assetFileDescriptorOpenRawResourceFd.getStartOffset());
                if (fileInputStream.skip(dataSpec.f57375f) < dataSpec.f57375f) {
                    throw new EOFException();
                }
                long j10 = dataSpec.f57376g;
                long j11 = -1;
                if (j10 != -1) {
                    this.f57348j = j10;
                } else {
                    long length = assetFileDescriptorOpenRawResourceFd.getLength();
                    if (length != -1) {
                        j11 = length - dataSpec.f57375f;
                    }
                    this.f57348j = j11;
                }
                this.f57349k = true;
                i(dataSpec);
                return this.f57348j;
            } catch (NumberFormatException unused) {
                throw new a("Resource identifier must be an integer.");
            }
        } catch (IOException e10) {
            throw new a(e10);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    @Override // androidx.media2.exoplayer.external.upstream.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() throws androidx.media2.exoplayer.external.upstream.l0.a {
        /*
            r5 = this;
            r0 = 0
            r5.f57345g = r0
            r1 = 0
            r4 = 7
            java.io.InputStream r2 = r5.f57347i     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            r4 = 5
            if (r2 == 0) goto L12
            r2.close()     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            goto L12
        Le:
            r2 = move-exception
            goto L46
        L10:
            r2 = move-exception
            goto L40
        L12:
            r5.f57347i = r0
            android.content.res.AssetFileDescriptor r2 = r5.f57346h     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            if (r2 == 0) goto L20
            r2.close()     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            goto L20
        L1c:
            r2 = move-exception
            goto L32
        L1e:
            r2 = move-exception
            goto L2c
        L20:
            r5.f57346h = r0
            boolean r0 = r5.f57349k
            if (r0 == 0) goto L2b
            r5.f57349k = r1
            r5.e()
        L2b:
            return
        L2c:
            androidx.media2.exoplayer.external.upstream.l0$a r3 = new androidx.media2.exoplayer.external.upstream.l0$a     // Catch: java.lang.Throwable -> L1c
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L1c
            throw r3     // Catch: java.lang.Throwable -> L1c
        L32:
            r4 = 7
            r5.f57346h = r0
            r4 = 5
            boolean r0 = r5.f57349k
            if (r0 == 0) goto L3f
            r5.f57349k = r1
            r5.e()
        L3f:
            throw r2
        L40:
            androidx.media2.exoplayer.external.upstream.l0$a r3 = new androidx.media2.exoplayer.external.upstream.l0$a     // Catch: java.lang.Throwable -> Le
            r3.<init>(r2)     // Catch: java.lang.Throwable -> Le
            throw r3     // Catch: java.lang.Throwable -> Le
        L46:
            r5.f57347i = r0
            r4 = 2
            android.content.res.AssetFileDescriptor r3 = r5.f57346h     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L54
            if (r3 == 0) goto L56
            r3.close()     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L54
            goto L56
        L51:
            r2 = move-exception
            r4 = 6
            goto L6a
        L54:
            r2 = move-exception
            goto L63
        L56:
            r5.f57346h = r0
            r4 = 3
            boolean r0 = r5.f57349k
            if (r0 == 0) goto L62
            r5.f57349k = r1
            r5.e()
        L62:
            throw r2
        L63:
            androidx.media2.exoplayer.external.upstream.l0$a r3 = new androidx.media2.exoplayer.external.upstream.l0$a     // Catch: java.lang.Throwable -> L51
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L51
            r4 = 0
            throw r3     // Catch: java.lang.Throwable -> L51
        L6a:
            r5.f57346h = r0
            boolean r0 = r5.f57349k
            if (r0 == 0) goto L77
            r4 = 0
            r5.f57349k = r1
            r4 = 1
            r5.e()
        L77:
            r4 = 3
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media2.exoplayer.external.upstream.l0.close():void");
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    @androidx.annotation.p0
    public Uri getUri() {
        return this.f57345g;
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public int read(byte[] buffer, int offset, int readLength) throws a {
        if (readLength == 0) {
            return 0;
        }
        long j10 = this.f57348j;
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
        int i10 = ((InputStream) androidx.media2.exoplayer.external.util.q0.i(this.f57347i)).read(buffer, offset, readLength);
        if (i10 == -1) {
            if (this.f57348j == -1) {
                return -1;
            }
            throw new a(new EOFException());
        }
        long j11 = this.f57348j;
        if (j11 != -1) {
            this.f57348j = j11 - ((long) i10);
        }
        d(i10);
        return i10;
    }
}
