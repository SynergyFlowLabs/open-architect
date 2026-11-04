package androidx.media3.datasource;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class m extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ContentResolver f62527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private Uri f62528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    private AssetFileDescriptor f62529h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    private FileInputStream f62530i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f62531j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f62532k;

    public static class a extends u {
        @Deprecated
        public a(IOException iOException) {
            this(iOException, 2000);
        }

        public a(@androidx.annotation.p0 IOException iOException, int i10) {
            super(iOException, i10);
        }
    }

    public m(Context context) {
        super(false);
        this.f62527f = context.getContentResolver();
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    public long c(x xVar) throws a {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uriNormalizeScheme = xVar.f62594a.normalizeScheme();
            this.f62528g = uriNormalizeScheme;
            w(xVar);
            if (FirebaseAnalytics.d.P.equals(uriNormalizeScheme.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptorOpenAssetFileDescriptor = this.f62527f.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = this.f62527f.openAssetFileDescriptor(uriNormalizeScheme, "r");
            }
            this.f62529h = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new a(new IOException("Could not open file descriptor for: " + uriNormalizeScheme), 2000);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f62530i = fileInputStream;
            if (length != -1 && xVar.f62600g > length) {
                throw new a(null, 2008);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(xVar.f62600g + startOffset) - startOffset;
            if (jSkip != xVar.f62600g) {
                throw new a(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f62531j = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.f62531j = jPosition;
                    if (jPosition < 0) {
                        throw new a(null, 2008);
                    }
                }
            } else {
                long j10 = length - jSkip;
                this.f62531j = j10;
                if (j10 < 0) {
                    throw new a(null, 2008);
                }
            }
            long jMin = xVar.f62601h;
            if (jMin != -1) {
                long j11 = this.f62531j;
                if (j11 != -1) {
                    jMin = Math.min(j11, jMin);
                }
                this.f62531j = jMin;
            }
            this.f62532k = true;
            x(xVar);
            long j12 = xVar.f62601h;
            return j12 != -1 ? j12 : this.f62531j;
        } catch (a e10) {
            throw e10;
        } catch (IOException e11) {
            throw new a(e11, e11 instanceof FileNotFoundException ? androidx.media3.common.x0.f61818h3 : 2000);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0057 */
    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() throws androidx.media3.datasource.m.a {
        /*
            r6 = this;
            java.lang.String r5 = "Androeed.ru"
            r0 = 0
            r6.f62528g = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r5 = 4
            r2 = 0
            java.io.FileInputStream r3 = r6.f62530i     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L14
            if (r3 == 0) goto L16
            r3.close()     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L14
            goto L16
        L11:
            r3 = move-exception
            r5 = 5
            goto L4d
        L14:
            r3 = move-exception
            goto L46
        L16:
            r6.f62530i = r0
            android.content.res.AssetFileDescriptor r3 = r6.f62529h     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L22
            if (r3 == 0) goto L24
            r3.close()     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L22
            goto L24
        L20:
            r1 = move-exception
            goto L37
        L22:
            r3 = move-exception
            goto L30
        L24:
            r6.f62529h = r0
            boolean r0 = r6.f62532k
            if (r0 == 0) goto L2f
            r6.f62532k = r2
            r6.v()
        L2f:
            return
        L30:
            androidx.media3.datasource.m$a r4 = new androidx.media3.datasource.m$a     // Catch: java.lang.Throwable -> L20
            r5 = 5
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L20
            throw r4     // Catch: java.lang.Throwable -> L20
        L37:
            r6.f62529h = r0
            r5 = 4
            boolean r0 = r6.f62532k
            if (r0 == 0) goto L44
            r6.f62532k = r2
            r5 = 6
            r6.v()
        L44:
            r5 = 0
            throw r1
        L46:
            androidx.media3.datasource.m$a r4 = new androidx.media3.datasource.m$a     // Catch: java.lang.Throwable -> L11
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L11
            r5 = 2
            throw r4     // Catch: java.lang.Throwable -> L11
        L4d:
            r6.f62530i = r0
            android.content.res.AssetFileDescriptor r4 = r6.f62529h     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            if (r4 == 0) goto L5b
            r4.close()     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            goto L5b
        L57:
            r1 = move-exception
            goto L6d
        L59:
            r3 = move-exception
            goto L67
        L5b:
            r6.f62529h = r0
            boolean r0 = r6.f62532k
            if (r0 == 0) goto L66
            r6.f62532k = r2
            r6.v()
        L66:
            throw r3
        L67:
            androidx.media3.datasource.m$a r4 = new androidx.media3.datasource.m$a     // Catch: java.lang.Throwable -> L57
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L57
            throw r4     // Catch: java.lang.Throwable -> L57
        L6d:
            r6.f62529h = r0
            boolean r0 = r6.f62532k
            r5 = 1
            if (r0 == 0) goto L79
            r6.f62532k = r2
            r6.v()
        L79:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.datasource.m.close():void");
    }

    @Override // androidx.media3.datasource.p
    @androidx.annotation.p0
    public Uri getUri() {
        return this.f62528g;
    }

    @Override // androidx.media3.common.l, androidx.media3.datasource.g0
    public int read(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f62531j;
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
        int i12 = ((FileInputStream) androidx.media3.common.util.k1.o(this.f62530i)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        long j11 = this.f62531j;
        if (j11 != -1) {
            this.f62531j = j11 - ((long) i12);
        }
        u(i12);
        return i12;
    }
}
