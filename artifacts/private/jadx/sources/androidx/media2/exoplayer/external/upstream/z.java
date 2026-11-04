package androidx.media2.exoplayer.external.upstream;

import android.net.Uri;
import androidx.annotation.b1;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class z implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z f57498b = new z();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l.a f57499c = y.f57497a;

    private z() {
    }

    static final /* bridge */ /* synthetic */ z d() {
        return new z();
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public Map a() {
        return k.a(this);
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public long b(o dataSpec) throws IOException {
        throw new IOException("Dummy source");
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public void c(q0 transferListener) {
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public void close() {
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    @androidx.annotation.p0
    public Uri getUri() {
        return null;
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public int read(byte[] buffer, int offset, int readLength) {
        throw new UnsupportedOperationException();
    }
}
