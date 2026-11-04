package androidx.media3.datasource;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class k1 implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f62516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.media3.common.b1 f62517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f62518d;

    public static final class a implements p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p.a f62519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.media3.common.b1 f62520b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f62521c;

        public a(p.a aVar, androidx.media3.common.b1 b1Var, int i10) {
            this.f62519a = aVar;
            this.f62520b = b1Var;
            this.f62521c = i10;
        }

        @Override // androidx.media3.datasource.p.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public k1 a() {
            return new k1(this.f62519a.a(), this.f62520b, this.f62521c);
        }
    }

    public k1(p pVar, androidx.media3.common.b1 b1Var, int i10) {
        this.f62516b = (p) androidx.media3.common.util.a.g(pVar);
        this.f62517c = (androidx.media3.common.b1) androidx.media3.common.util.a.g(b1Var);
        this.f62518d = i10;
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    public Map<String, List<String>> a() {
        return this.f62516b.a();
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    public long c(x xVar) throws IOException {
        this.f62517c.d(this.f62518d);
        return this.f62516b.c(xVar);
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    public void close() throws IOException {
        this.f62516b.close();
    }

    @Override // androidx.media3.datasource.p
    @androidx.annotation.p0
    public Uri getUri() {
        return this.f62516b.getUri();
    }

    @Override // androidx.media3.common.l, androidx.media3.datasource.g0
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        this.f62517c.d(this.f62518d);
        return this.f62516b.read(bArr, i10, i11);
    }

    @Override // androidx.media3.datasource.p
    public void s(r1 r1Var) {
        androidx.media3.common.util.a.g(r1Var);
        this.f62516b.s(r1Var);
    }
}
