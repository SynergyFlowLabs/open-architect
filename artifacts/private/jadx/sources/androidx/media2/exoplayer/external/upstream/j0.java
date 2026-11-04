package androidx.media2.exoplayer.external.upstream;

import android.net.Uri;
import androidx.annotation.b1;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class j0 implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f57337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.util.a0 f57338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f57339d;

    public j0(l upstream, androidx.media2.exoplayer.external.util.a0 priorityTaskManager, int priority) {
        this.f57337b = (l) androidx.media2.exoplayer.external.util.a.g(upstream);
        this.f57338c = (androidx.media2.exoplayer.external.util.a0) androidx.media2.exoplayer.external.util.a.g(priorityTaskManager);
        this.f57339d = priority;
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public Map<String, List<String>> a() {
        return this.f57337b.a();
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public long b(o dataSpec) throws IOException {
        this.f57338c.d(this.f57339d);
        return this.f57337b.b(dataSpec);
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public void c(q0 transferListener) {
        this.f57337b.c(transferListener);
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public void close() throws IOException {
        this.f57337b.close();
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    @androidx.annotation.p0
    public Uri getUri() {
        return this.f57337b.getUri();
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public int read(byte[] buffer, int offset, int max) throws IOException {
        this.f57338c.d(this.f57339d);
        return this.f57337b.read(buffer, offset, max);
    }
}
