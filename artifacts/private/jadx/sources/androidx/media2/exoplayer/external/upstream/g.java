package androidx.media2.exoplayer.external.upstream;

import android.net.Uri;
import androidx.annotation.b1;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class g extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f57286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private Uri f57287g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f57288h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f57289i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f57290j;

    public g(byte[] data) {
        super(false);
        androidx.media2.exoplayer.external.util.a.g(data);
        androidx.media2.exoplayer.external.util.a.a(data.length > 0);
        this.f57286f = data;
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public long b(o dataSpec) throws IOException {
        this.f57287g = dataSpec.f57370a;
        g(dataSpec);
        long j10 = dataSpec.f57375f;
        int i10 = (int) j10;
        this.f57288h = i10;
        long length = dataSpec.f57376g;
        if (length == -1) {
            length = ((long) this.f57286f.length) - j10;
        }
        int i11 = (int) length;
        this.f57289i = i11;
        if (i11 > 0 && i10 + i11 <= this.f57286f.length) {
            this.f57290j = true;
            i(dataSpec);
            return this.f57289i;
        }
        int i12 = this.f57288h;
        long j11 = dataSpec.f57376g;
        int length2 = this.f57286f.length;
        StringBuilder sb2 = new StringBuilder(77);
        sb2.append("Unsatisfiable range: [");
        sb2.append(i12);
        sb2.append(", ");
        sb2.append(j11);
        sb2.append("], length: ");
        sb2.append(length2);
        throw new IOException(sb2.toString());
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public void close() {
        if (this.f57290j) {
            this.f57290j = false;
            e();
        }
        this.f57287g = null;
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    @androidx.annotation.p0
    public Uri getUri() {
        return this.f57287g;
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public int read(byte[] buffer, int offset, int readLength) {
        if (readLength == 0) {
            return 0;
        }
        int i10 = this.f57289i;
        if (i10 == 0) {
            return -1;
        }
        int iMin = Math.min(readLength, i10);
        System.arraycopy(this.f57286f, this.f57288h, buffer, offset, iMin);
        this.f57288h += iMin;
        this.f57289i -= iMin;
        d(iMin);
        return iMin;
    }
}
