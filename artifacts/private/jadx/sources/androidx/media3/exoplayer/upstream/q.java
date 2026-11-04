package androidx.media3.exoplayer.upstream;

import android.net.Uri;
import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.datasource.p1;
import androidx.media3.datasource.x;
import androidx.media3.exoplayer.source.d0;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class q<T> implements o.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f66153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f66154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f66155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p1 f66156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a<? extends T> f66157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private volatile T f66158f;

    public interface a<T> {
        T a(Uri uri, InputStream inputStream) throws IOException;
    }

    public q(androidx.media3.datasource.p pVar, Uri uri, int i10, a<? extends T> aVar) {
        this(pVar, new x.b().j(uri).c(1).a(), i10, aVar);
    }

    public static <T> T g(androidx.media3.datasource.p pVar, a<? extends T> aVar, Uri uri, int i10) throws IOException {
        q qVar = new q(pVar, uri, i10, aVar);
        qVar.a();
        return (T) androidx.media3.common.util.a.g(qVar.e());
    }

    public static <T> T h(androidx.media3.datasource.p pVar, a<? extends T> aVar, x xVar, int i10) throws IOException {
        q qVar = new q(pVar, xVar, i10, aVar);
        qVar.a();
        return (T) androidx.media3.common.util.a.g(qVar.e());
    }

    @Override // androidx.media3.exoplayer.upstream.o.e
    public final void a() throws IOException {
        this.f66156d.x();
        androidx.media3.datasource.v vVar = new androidx.media3.datasource.v(this.f66156d, this.f66154b);
        try {
            vVar.c();
            this.f66158f = this.f66157e.a((Uri) androidx.media3.common.util.a.g(this.f66156d.getUri()), vVar);
        } finally {
            k1.t(vVar);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.o.e
    public final void b() {
    }

    public long c() {
        return this.f66156d.u();
    }

    public Map<String, List<String>> d() {
        return this.f66156d.w();
    }

    @p0
    public final T e() {
        return this.f66158f;
    }

    public Uri f() {
        return this.f66156d.v();
    }

    public q(androidx.media3.datasource.p pVar, x xVar, int i10, a<? extends T> aVar) {
        this.f66156d = new p1(pVar);
        this.f66154b = xVar;
        this.f66155c = i10;
        this.f66157e = aVar;
        this.f66153a = d0.a();
    }
}
