package androidx.media2.exoplayer.external.upstream;

import androidx.annotation.b1;
import androidx.collection.g3;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class f implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ByteArrayOutputStream f57285a;

    @androidx.annotation.p0
    public byte[] a() {
        ByteArrayOutputStream byteArrayOutputStream = this.f57285a;
        if (byteArrayOutputStream == null) {
            return null;
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // androidx.media2.exoplayer.external.upstream.j
    public void b(o dataSpec) {
        boolean z10;
        long j10 = dataSpec.f57376g;
        if (j10 == -1) {
            this.f57285a = new ByteArrayOutputStream();
            return;
        }
        if (j10 <= g3.f12256c) {
            z10 = true;
            int i10 = 6 >> 1;
        } else {
            z10 = false;
        }
        androidx.media2.exoplayer.external.util.a.a(z10);
        this.f57285a = new ByteArrayOutputStream((int) dataSpec.f57376g);
    }

    @Override // androidx.media2.exoplayer.external.upstream.j
    public void close() throws IOException {
        ((ByteArrayOutputStream) androidx.media2.exoplayer.external.util.q0.i(this.f57285a)).close();
    }

    @Override // androidx.media2.exoplayer.external.upstream.j
    public void write(byte[] buffer, int offset, int length) {
        ((ByteArrayOutputStream) androidx.media2.exoplayer.external.util.q0.i(this.f57285a)).write(buffer, offset, length);
    }
}
