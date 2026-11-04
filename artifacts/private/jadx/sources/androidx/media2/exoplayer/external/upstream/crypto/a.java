package androidx.media2.exoplayer.external.upstream.crypto;

import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.upstream.j;
import androidx.media2.exoplayer.external.upstream.o;
import androidx.media2.exoplayer.external.util.q0;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f57255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f57256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private final byte[] f57257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private c f57258d;

    public a(byte[] secretKey, j wrappedDataSink) {
        this(secretKey, wrappedDataSink, null);
    }

    @Override // androidx.media2.exoplayer.external.upstream.j
    public void b(o dataSpec) throws IOException {
        this.f57255a.b(dataSpec);
        this.f57258d = new c(1, this.f57256b, d.a(dataSpec.f57377h), dataSpec.f57374e);
    }

    @Override // androidx.media2.exoplayer.external.upstream.j
    public void close() throws IOException {
        this.f57258d = null;
        this.f57255a.close();
    }

    @Override // androidx.media2.exoplayer.external.upstream.j
    public void write(byte[] data, int offset, int length) throws IOException {
        if (this.f57257c == null) {
            ((c) q0.i(this.f57258d)).d(data, offset, length);
            this.f57255a.write(data, offset, length);
            return;
        }
        int i10 = 0;
        while (i10 < length) {
            int iMin = Math.min(length - i10, this.f57257c.length);
            byte[] bArr = data;
            ((c) q0.i(this.f57258d)).c(bArr, offset + i10, iMin, this.f57257c, 0);
            this.f57255a.write(this.f57257c, 0, iMin);
            i10 += iMin;
            data = bArr;
        }
    }

    public a(byte[] secretKey, j wrappedDataSink, @p0 byte[] scratch) {
        this.f57255a = wrappedDataSink;
        this.f57256b = secretKey;
        this.f57257c = scratch;
    }
}
