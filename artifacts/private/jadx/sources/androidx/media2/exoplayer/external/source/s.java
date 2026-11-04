package androidx.media2.exoplayer.external.source;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
final class s implements androidx.media2.exoplayer.external.upstream.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.upstream.l f56387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f56388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f56389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f56390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f56391f;

    public interface a {
        void c(androidx.media2.exoplayer.external.util.x metadata);
    }

    public s(androidx.media2.exoplayer.external.upstream.l upstream, int metadataIntervalBytes, a listener) {
        androidx.media2.exoplayer.external.util.a.a(metadataIntervalBytes > 0);
        this.f56387b = upstream;
        this.f56388c = metadataIntervalBytes;
        this.f56389d = listener;
        this.f56390e = new byte[1];
        this.f56391f = metadataIntervalBytes;
    }

    private boolean d() throws IOException {
        if (this.f56387b.read(this.f56390e, 0, 1) == -1) {
            return false;
        }
        int i10 = (this.f56390e[0] & 255) << 4;
        if (i10 == 0) {
            return true;
        }
        byte[] bArr = new byte[i10];
        int i11 = i10;
        int i12 = 0;
        while (i11 > 0) {
            int i13 = this.f56387b.read(bArr, i12, i11);
            if (i13 == -1) {
                return false;
            }
            i12 += i13;
            i11 -= i13;
        }
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        if (i10 > 0) {
            this.f56389d.c(new androidx.media2.exoplayer.external.util.x(bArr, i10));
        }
        return true;
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public Map<String, List<String>> a() {
        return this.f56387b.a();
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public long b(androidx.media2.exoplayer.external.upstream.o dataSpec) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public void c(androidx.media2.exoplayer.external.upstream.q0 transferListener) {
        this.f56387b.c(transferListener);
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public void close() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    @androidx.annotation.p0
    public Uri getUri() {
        return this.f56387b.getUri();
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public int read(byte[] buffer, int offset, int readLength) throws IOException {
        if (this.f56391f == 0) {
            if (!d()) {
                return -1;
            }
            this.f56391f = this.f56388c;
        }
        int i10 = this.f56387b.read(buffer, offset, Math.min(this.f56391f, readLength));
        if (i10 != -1) {
            this.f56391f -= i10;
        }
        return i10;
    }
}
