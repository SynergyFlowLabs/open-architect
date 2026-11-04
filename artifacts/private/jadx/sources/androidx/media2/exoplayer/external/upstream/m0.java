package androidx.media2.exoplayer.external.upstream;

import android.net.Uri;
import androidx.annotation.b1;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class m0 implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f57352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f57353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f57354d;

    public static final class a implements l.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l.a f57355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f57356b;

        public a(l.a upstreamFactory, b resolver) {
            this.f57355a = upstreamFactory;
            this.f57356b = resolver;
        }

        @Override // androidx.media2.exoplayer.external.upstream.l.a
        public l a() {
            return new m0(this.f57355a.a(), this.f57356b);
        }
    }

    public interface b {
        Uri a(Uri uri);

        o b(o dataSpec) throws IOException;
    }

    public m0(l upstreamDataSource, b resolver) {
        this.f57352b = upstreamDataSource;
        this.f57353c = resolver;
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public Map<String, List<String>> a() {
        return this.f57352b.a();
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public long b(o dataSpec) throws IOException {
        o oVarB = this.f57353c.b(dataSpec);
        this.f57354d = true;
        return this.f57352b.b(oVarB);
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public void c(q0 transferListener) {
        this.f57352b.c(transferListener);
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public void close() throws IOException {
        if (this.f57354d) {
            this.f57354d = false;
            this.f57352b.close();
        }
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    @androidx.annotation.p0
    public Uri getUri() {
        Uri uri = this.f57352b.getUri();
        if (uri == null) {
            return null;
        }
        return this.f57353c.a(uri);
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public int read(byte[] buffer, int offset, int readLength) throws IOException {
        return this.f57352b.read(buffer, offset, readLength);
    }
}
