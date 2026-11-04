package androidx.media2.exoplayer.external.upstream;

import android.net.Uri;
import androidx.annotation.b1;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class o0 implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f57379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f57380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Uri f57381d = Uri.EMPTY;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, List<String>> f57382e = Collections.EMPTY_MAP;

    public o0(l dataSource) {
        this.f57379b = (l) androidx.media2.exoplayer.external.util.a.g(dataSource);
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public Map<String, List<String>> a() {
        return this.f57379b.a();
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public long b(o dataSpec) throws IOException {
        this.f57381d = dataSpec.f57370a;
        this.f57382e = Collections.EMPTY_MAP;
        long jB = this.f57379b.b(dataSpec);
        this.f57381d = (Uri) androidx.media2.exoplayer.external.util.a.g(getUri());
        this.f57382e = a();
        return jB;
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public void c(q0 transferListener) {
        this.f57379b.c(transferListener);
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public void close() throws IOException {
        this.f57379b.close();
    }

    public long d() {
        return this.f57380c;
    }

    public Uri e() {
        return this.f57381d;
    }

    public Map<String, List<String>> g() {
        return this.f57382e;
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    @androidx.annotation.p0
    public Uri getUri() {
        return this.f57379b.getUri();
    }

    public void i() {
        this.f57380c = 0L;
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public int read(byte[] buffer, int offset, int readLength) throws IOException {
        int i10 = this.f57379b.read(buffer, offset, readLength);
        if (i10 != -1) {
            this.f57380c += (long) i10;
        }
        return i10;
    }
}
