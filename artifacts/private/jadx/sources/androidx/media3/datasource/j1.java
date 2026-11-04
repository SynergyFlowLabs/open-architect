package androidx.media3.datasource;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class j1 implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j1 f62514b = new j1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p.a f62515c = new p.a() { // from class: androidx.media3.datasource.i1
        @Override // androidx.media3.datasource.p.a
        public final p a() {
            return j1.u();
        }
    };

    private j1() {
    }

    public static /* synthetic */ j1 u() {
        return new j1();
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    public long c(x xVar) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    public void close() {
    }

    @Override // androidx.media3.datasource.p
    @androidx.annotation.p0
    public Uri getUri() {
        return null;
    }

    @Override // androidx.media3.common.l, androidx.media3.datasource.g0
    public int read(byte[] bArr, int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.datasource.p
    public void s(r1 r1Var) {
    }
}
