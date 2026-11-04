package androidx.media2.exoplayer.external.upstream;

import android.net.Uri;
import androidx.annotation.b1;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class a0 extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private RandomAccessFile f57245f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private Uri f57246g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f57247h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f57248i;

    public static class a extends IOException {
        public a(IOException cause) {
            super(cause);
        }
    }

    public a0() {
        super(false);
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public long b(o dataSpec) throws a {
        try {
            Uri uri = dataSpec.f57370a;
            this.f57246g = uri;
            g(dataSpec);
            RandomAccessFile randomAccessFile = new RandomAccessFile((String) androidx.media2.exoplayer.external.util.a.g(uri.getPath()), "r");
            this.f57245f = randomAccessFile;
            randomAccessFile.seek(dataSpec.f57375f);
            long length = dataSpec.f57376g;
            if (length == -1) {
                length = randomAccessFile.length() - dataSpec.f57375f;
            }
            this.f57247h = length;
            if (length < 0) {
                throw new EOFException();
            }
            this.f57248i = true;
            i(dataSpec);
            return this.f57247h;
        } catch (IOException e10) {
            throw new a(e10);
        }
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public void close() throws a {
        this.f57246g = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f57245f;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f57245f = null;
                if (this.f57248i) {
                    this.f57248i = false;
                    e();
                }
            } catch (IOException e10) {
                throw new a(e10);
            }
        } catch (Throwable th2) {
            this.f57245f = null;
            if (this.f57248i) {
                this.f57248i = false;
                e();
            }
            throw th2;
        }
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    @androidx.annotation.p0
    public Uri getUri() {
        return this.f57246g;
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public int read(byte[] buffer, int offset, int readLength) throws a {
        if (readLength == 0) {
            return 0;
        }
        if (this.f57247h == 0) {
            return -1;
        }
        try {
            int i10 = ((RandomAccessFile) androidx.media2.exoplayer.external.util.q0.i(this.f57245f)).read(buffer, offset, (int) Math.min(this.f57247h, readLength));
            if (i10 > 0) {
                this.f57247h -= (long) i10;
                d(i10);
            }
            return i10;
        } catch (IOException e10) {
            throw new a(e10);
        }
    }
}
