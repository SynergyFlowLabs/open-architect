package androidx.media2.exoplayer.external.upstream.crypto;

import android.net.Uri;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.upstream.l;
import androidx.media2.exoplayer.external.upstream.o;
import androidx.media2.exoplayer.external.upstream.q0;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class b implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f57259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f57260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private c f57261d;

    public b(byte[] secretKey, l upstream) {
        this.f57259b = upstream;
        this.f57260c = secretKey;
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public Map<String, List<String>> a() {
        return this.f57259b.a();
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public long b(o dataSpec) throws IOException {
        long jB = this.f57259b.b(dataSpec);
        this.f57261d = new c(2, this.f57260c, d.a(dataSpec.f57377h), dataSpec.f57374e);
        return jB;
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public void c(q0 transferListener) {
        this.f57259b.c(transferListener);
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public void close() throws IOException {
        this.f57261d = null;
        this.f57259b.close();
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    @p0
    public Uri getUri() {
        return this.f57259b.getUri();
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public int read(byte[] data, int offset, int readLength) throws IOException {
        if (readLength == 0) {
            return 0;
        }
        int i10 = this.f57259b.read(data, offset, readLength);
        if (i10 == -1) {
            return -1;
        }
        ((c) androidx.media2.exoplayer.external.util.q0.i(this.f57261d)).d(data, offset, i10);
        return i10;
    }
}
