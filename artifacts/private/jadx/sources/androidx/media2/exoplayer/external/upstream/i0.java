package androidx.media2.exoplayer.external.upstream;

import android.net.Uri;
import androidx.annotation.b1;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class i0<T> implements g0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f57332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o0 f57334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a<? extends T> f57335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private volatile T f57336e;

    public interface a<T> {
        T a(Uri uri, InputStream inputStream) throws IOException;
    }

    public i0(l dataSource, Uri uri, int type, a<? extends T> parser) {
        this(dataSource, new o(uri, 1), type, parser);
    }

    public static <T> T g(l lVar, a<? extends T> aVar, Uri uri, int i10) throws IOException {
        i0 i0Var = new i0(lVar, uri, i10, aVar);
        i0Var.a();
        return (T) androidx.media2.exoplayer.external.util.a.g(i0Var.e());
    }

    public static <T> T h(l lVar, a<? extends T> aVar, o oVar, int i10) throws IOException {
        i0 i0Var = new i0(lVar, oVar, i10, aVar);
        i0Var.a();
        return (T) androidx.media2.exoplayer.external.util.a.g(i0Var.e());
    }

    @Override // androidx.media2.exoplayer.external.upstream.g0.e
    public final void a() throws IOException {
        this.f57334c.i();
        n nVar = new n(this.f57334c, this.f57332a);
        try {
            nVar.c();
            this.f57336e = this.f57335d.a((Uri) androidx.media2.exoplayer.external.util.a.g(this.f57334c.getUri()), nVar);
        } finally {
            androidx.media2.exoplayer.external.util.q0.o(nVar);
        }
    }

    @Override // androidx.media2.exoplayer.external.upstream.g0.e
    public final void b() {
    }

    public long c() {
        return this.f57334c.d();
    }

    public Map<String, List<String>> d() {
        return this.f57334c.g();
    }

    @androidx.annotation.p0
    public final T e() {
        return this.f57336e;
    }

    public Uri f() {
        return this.f57334c.e();
    }

    public i0(l dataSource, o dataSpec, int type, a<? extends T> parser) {
        this.f57334c = new o0(dataSource);
        this.f57332a = dataSpec;
        this.f57333b = type;
        this.f57335d = parser;
    }
}
