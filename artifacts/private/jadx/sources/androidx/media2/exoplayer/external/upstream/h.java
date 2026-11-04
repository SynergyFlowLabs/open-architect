package androidx.media2.exoplayer.external.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.annotation.b1;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class h extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ContentResolver f57321f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private Uri f57322g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    private AssetFileDescriptor f57323h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    private FileInputStream f57324i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f57325j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f57326k;

    public static class a extends IOException {
        public a(IOException cause) {
            super(cause);
        }
    }

    public h(Context context) {
        super(false);
        this.f57321f = context.getContentResolver();
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public long b(o dataSpec) throws a {
        try {
            Uri uri = dataSpec.f57370a;
            this.f57322g = uri;
            g(dataSpec);
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.f57321f.openAssetFileDescriptor(uri, "r");
            this.f57323h = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                String strValueOf = String.valueOf(uri);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 36);
                sb2.append("Could not open file descriptor for: ");
                sb2.append(strValueOf);
                throw new FileNotFoundException(sb2.toString());
            }
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f57324i = fileInputStream;
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(dataSpec.f57375f + startOffset) - startOffset;
            if (jSkip != dataSpec.f57375f) {
                throw new EOFException();
            }
            long j10 = dataSpec.f57376g;
            long jPosition = -1;
            if (j10 != -1) {
                this.f57325j = j10;
            } else {
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size != 0) {
                        jPosition = size - channel.position();
                    }
                    this.f57325j = jPosition;
                } else {
                    this.f57325j = length - jSkip;
                }
            }
            this.f57326k = true;
            i(dataSpec);
            return this.f57325j;
        } catch (IOException e10) {
            throw new a(e10);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0056 */
    @Override // androidx.media2.exoplayer.external.upstream.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() throws androidx.media2.exoplayer.external.upstream.h.a {
        /*
            r5 = this;
            r0 = 0
            r5.f57322g = r0
            r1 = 0
            java.io.FileInputStream r2 = r5.f57324i     // Catch: java.lang.Throwable -> Le java.io.IOException -> L11
            r4 = 1
            if (r2 == 0) goto L14
            r2.close()     // Catch: java.lang.Throwable -> Le java.io.IOException -> L11
            r4 = 3
            goto L14
        Le:
            r2 = move-exception
            r4 = 1
            goto L4a
        L11:
            r2 = move-exception
            r4 = 6
            goto L44
        L14:
            r5.f57324i = r0
            r4 = 4
            android.content.res.AssetFileDescriptor r2 = r5.f57323h     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L23
            if (r2 == 0) goto L25
            r2.close()     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L23
            r4 = 4
            goto L25
        L20:
            r2 = move-exception
            r4 = 0
            goto L38
        L23:
            r2 = move-exception
            goto L31
        L25:
            r5.f57323h = r0
            boolean r0 = r5.f57326k
            if (r0 == 0) goto L30
            r5.f57326k = r1
            r5.e()
        L30:
            return
        L31:
            androidx.media2.exoplayer.external.upstream.h$a r3 = new androidx.media2.exoplayer.external.upstream.h$a     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L20
            throw r3     // Catch: java.lang.Throwable -> L20
        L38:
            r5.f57323h = r0
            boolean r0 = r5.f57326k
            if (r0 == 0) goto L43
            r5.f57326k = r1
            r5.e()
        L43:
            throw r2
        L44:
            androidx.media2.exoplayer.external.upstream.h$a r3 = new androidx.media2.exoplayer.external.upstream.h$a     // Catch: java.lang.Throwable -> Le
            r3.<init>(r2)     // Catch: java.lang.Throwable -> Le
            throw r3     // Catch: java.lang.Throwable -> Le
        L4a:
            r5.f57324i = r0
            r4 = 4
            android.content.res.AssetFileDescriptor r3 = r5.f57323h     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L59
            if (r3 == 0) goto L5b
            r3.close()     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L59
            r4 = 2
            goto L5b
        L56:
            r2 = move-exception
            r4 = 4
            goto L6f
        L59:
            r2 = move-exception
            goto L68
        L5b:
            r5.f57323h = r0
            r4 = 5
            boolean r0 = r5.f57326k
            if (r0 == 0) goto L67
            r5.f57326k = r1
            r5.e()
        L67:
            throw r2
        L68:
            r4 = 6
            androidx.media2.exoplayer.external.upstream.h$a r3 = new androidx.media2.exoplayer.external.upstream.h$a     // Catch: java.lang.Throwable -> L56
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L56
            throw r3     // Catch: java.lang.Throwable -> L56
        L6f:
            r4 = 2
            r5.f57323h = r0
            boolean r0 = r5.f57326k
            if (r0 == 0) goto L7b
            r5.f57326k = r1
            r5.e()
        L7b:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media2.exoplayer.external.upstream.h.close():void");
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    @androidx.annotation.p0
    public Uri getUri() {
        return this.f57322g;
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public int read(byte[] buffer, int offset, int readLength) throws a {
        if (readLength == 0) {
            return 0;
        }
        long j10 = this.f57325j;
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
        int i10 = ((FileInputStream) androidx.media2.exoplayer.external.util.q0.i(this.f57324i)).read(buffer, offset, readLength);
        if (i10 == -1) {
            if (this.f57325j == -1) {
                return -1;
            }
            throw new a(new EOFException());
        }
        long j11 = this.f57325j;
        if (j11 != -1) {
            this.f57325j = j11 - ((long) i10);
        }
        d(i10);
        return i10;
    }
}
