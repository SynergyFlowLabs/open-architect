package androidx.media3.datasource;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class o1 implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f62545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f62546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f62547d;

    public static final class a implements p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p.a f62548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f62549b;

        public a(p.a aVar, b bVar) {
            this.f62548a = aVar;
            this.f62549b = bVar;
        }

        @Override // androidx.media3.datasource.p.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public o1 a() {
            return new o1(this.f62548a.a(), this.f62549b);
        }
    }

    public interface b {
        default Uri a(Uri uri) {
            return uri;
        }

        x b(x xVar) throws IOException;
    }

    public o1(p pVar, b bVar) {
        this.f62545b = pVar;
        this.f62546c = bVar;
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    public Map<String, List<String>> a() {
        return this.f62545b.a();
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    public long c(x xVar) throws IOException {
        x xVarB = this.f62546c.b(xVar);
        this.f62547d = true;
        return this.f62545b.c(xVarB);
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    public void close() throws IOException {
        if (this.f62547d) {
            this.f62547d = false;
            this.f62545b.close();
        }
    }

    @Override // androidx.media3.datasource.p
    @androidx.annotation.p0
    public Uri getUri() {
        Uri uri = this.f62545b.getUri();
        if (uri == null) {
            return null;
        }
        return this.f62546c.a(uri);
    }

    @Override // androidx.media3.common.l, androidx.media3.datasource.g0
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        return this.f62545b.read(bArr, i10, i11);
    }

    @Override // androidx.media3.datasource.p
    public void s(r1 r1Var) {
        androidx.media3.common.util.a.g(r1Var);
        this.f62545b.s(r1Var);
    }
}
