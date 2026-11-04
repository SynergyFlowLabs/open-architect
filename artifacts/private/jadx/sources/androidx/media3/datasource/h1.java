package androidx.media3.datasource;

import android.media.MediaDataSource;
import android.net.Uri;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
@androidx.annotation.w0(23)
public class h1 extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final MediaDataSource f62503f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private Uri f62504g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f62505h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f62506i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f62507j;

    public h1(MediaDataSource mediaDataSource, boolean z10) {
        super(z10);
        this.f62503f = mediaDataSource;
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    public long c(x xVar) throws IOException {
        this.f62504g = xVar.f62594a;
        this.f62505h = xVar.f62600g;
        w(xVar);
        if (this.f62503f.getSize() != -1 && this.f62505h > this.f62503f.getSize()) {
            throw new u(2008);
        }
        if (this.f62503f.getSize() == -1) {
            this.f62506i = -1L;
        } else {
            this.f62506i = this.f62503f.getSize() - this.f62505h;
        }
        long jMin = xVar.f62601h;
        if (jMin != -1) {
            long j10 = this.f62506i;
            if (j10 != -1) {
                jMin = Math.min(j10, jMin);
            }
            this.f62506i = jMin;
        }
        this.f62507j = true;
        x(xVar);
        long j11 = xVar.f62601h;
        return j11 != -1 ? j11 : this.f62506i;
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    public void close() throws IOException {
        this.f62504g = null;
        if (this.f62507j) {
            this.f62507j = false;
            v();
        }
    }

    @Override // androidx.media3.datasource.p
    @androidx.annotation.p0
    public Uri getUri() {
        return this.f62504g;
    }

    @Override // androidx.media3.common.l, androidx.media3.datasource.g0
    public int read(byte[] bArr, int i10, int i11) throws u {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f62506i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            i11 = (int) Math.min(j10, i11);
        }
        try {
            int at = this.f62503f.readAt(this.f62505h, bArr, i10, i11);
            if (at == -1) {
                return -1;
            }
            long j11 = at;
            this.f62505h += j11;
            long j12 = this.f62506i;
            if (j12 != -1) {
                this.f62506i = j12 - j11;
            }
            u(at);
            return at;
        } catch (IOException e10) {
            throw new u(e10, 2000);
        }
    }
}
