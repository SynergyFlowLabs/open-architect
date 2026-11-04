package androidx.media2.exoplayer.external.upstream;

import android.net.Uri;
import androidx.annotation.b1;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class p0 implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f57392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j f57393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f57394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f57395e;

    public p0(l upstream, j dataSink) {
        this.f57392b = (l) androidx.media2.exoplayer.external.util.a.g(upstream);
        this.f57393c = (j) androidx.media2.exoplayer.external.util.a.g(dataSink);
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public Map<String, List<String>> a() {
        return this.f57392b.a();
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public long b(o dataSpec) throws IOException {
        long jB = this.f57392b.b(dataSpec);
        this.f57395e = jB;
        if (jB == 0) {
            return 0L;
        }
        if (dataSpec.f57376g == -1 && jB != -1) {
            dataSpec = dataSpec.e(0L, jB);
        }
        this.f57394d = true;
        this.f57393c.b(dataSpec);
        return this.f57395e;
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public void c(q0 transferListener) {
        this.f57392b.c(transferListener);
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public void close() throws IOException {
        try {
            this.f57392b.close();
            if (this.f57394d) {
                this.f57394d = false;
                j jVar = this.f57393c;
            }
        } finally {
            if (this.f57394d) {
                this.f57394d = false;
                this.f57393c.close();
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    @androidx.annotation.p0
    public Uri getUri() {
        return this.f57392b.getUri();
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public int read(byte[] buffer, int offset, int max) throws IOException {
        if (this.f57395e == 0) {
            return -1;
        }
        int i10 = this.f57392b.read(buffer, offset, max);
        if (i10 > 0) {
            this.f57393c.write(buffer, offset, i10);
            long j10 = this.f57395e;
            if (j10 != -1) {
                this.f57395e = j10 - ((long) i10);
            }
        }
        return i10;
    }
}
