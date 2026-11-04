package androidx.media3.exoplayer.source.mediaparser;

import android.media.MediaParser$SeekableInputReader;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@b1
@w0(30)
public final class a implements MediaParser$SeekableInputReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private androidx.media3.common.l f65213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f65214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f65215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f65216d;

    public long a() {
        long j10 = this.f65216d;
        this.f65216d = -1L;
        return j10;
    }

    public void b(long j10) {
        this.f65215c = j10;
    }

    public void c(androidx.media3.common.l lVar, long j10) {
        this.f65213a = lVar;
        this.f65214b = j10;
        this.f65216d = -1L;
    }

    public long getLength() {
        return this.f65214b;
    }

    public long getPosition() {
        return this.f65215c;
    }

    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = ((androidx.media3.common.l) k1.o(this.f65213a)).read(bArr, i10, i11);
        this.f65215c += (long) i12;
        return i12;
    }

    public void seekToPosition(long j10) {
        this.f65216d = j10;
    }
}
