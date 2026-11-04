package okhttp3.internal.http;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.d0;
import okhttp3.f0;
import okhttp3.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nRealInterceptorChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealInterceptorChain.kt\nokhttp3/internal/http/RealInterceptorChain\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"})
public final class g implements w.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final okhttp3.internal.connection.e f334186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<w> f334187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f334188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final okhttp3.internal.connection.c f334189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final d0 f334190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f334191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f334192g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f334193h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f334194i;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@NotNull okhttp3.internal.connection.e call, @NotNull List<? extends w> interceptors, int i10, @Nullable okhttp3.internal.connection.c cVar, @NotNull d0 request, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f334186a = call;
        this.f334187b = interceptors;
        this.f334188c = i10;
        this.f334189d = cVar;
        this.f334190e = request;
        this.f334191f = i11;
        this.f334192g = i12;
        this.f334193h = i13;
    }

    public static /* synthetic */ g j(g gVar, int i10, okhttp3.internal.connection.c cVar, d0 d0Var, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = gVar.f334188c;
        }
        if ((i14 & 2) != 0) {
            cVar = gVar.f334189d;
        }
        if ((i14 & 4) != 0) {
            d0Var = gVar.f334190e;
        }
        if ((i14 & 8) != 0) {
            i11 = gVar.f334191f;
        }
        if ((i14 & 16) != 0) {
            i12 = gVar.f334192g;
        }
        if ((i14 & 32) != 0) {
            i13 = gVar.f334193h;
        }
        int i15 = i12;
        int i16 = i13;
        return gVar.i(i10, cVar, d0Var, i11, i15, i16);
    }

    @Override // okhttp3.w.a
    public int a() {
        return this.f334192g;
    }

    @Override // okhttp3.w.a
    @NotNull
    public w.a b(int i10, @NotNull TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (this.f334189d != null) {
            throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
        }
        int i11 = 6 & 0;
        return j(this, 0, null, null, jk.f.m("connectTimeout", i10, unit), 0, 0, 55, null);
    }

    @Override // okhttp3.w.a
    @NotNull
    public f0 c(@NotNull d0 request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f334188c >= this.f334187b.size()) {
            throw new IllegalStateException("Check failed.");
        }
        this.f334194i++;
        okhttp3.internal.connection.c cVar = this.f334189d;
        if (cVar != null) {
            if (!cVar.j().g(request.q())) {
                throw new IllegalStateException(("network interceptor " + this.f334187b.get(this.f334188c - 1) + " must retain the same host and port").toString());
            }
            if (this.f334194i != 1) {
                throw new IllegalStateException(("network interceptor " + this.f334187b.get(this.f334188c - 1) + " must call proceed() exactly once").toString());
            }
        }
        g gVarJ = j(this, this.f334188c + 1, null, request, 0, 0, 0, 58, null);
        w wVar = this.f334187b.get(this.f334188c);
        f0 f0VarIntercept = wVar.intercept(gVarJ);
        if (f0VarIntercept == null) {
            throw new NullPointerException("interceptor " + wVar + " returned null");
        }
        if (this.f334189d != null && this.f334188c + 1 < this.f334187b.size() && gVarJ.f334194i != 1) {
            throw new IllegalStateException(("network interceptor " + wVar + " must call proceed() exactly once").toString());
        }
        if (f0VarIntercept.r() != null) {
            return f0VarIntercept;
        }
        throw new IllegalStateException(("interceptor " + wVar + " returned a response with no body").toString());
    }

    @Override // okhttp3.w.a
    @NotNull
    public okhttp3.e call() {
        return this.f334186a;
    }

    @Override // okhttp3.w.a
    @Nullable
    public okhttp3.j d() {
        okhttp3.internal.connection.c cVar = this.f334189d;
        if (cVar != null) {
            return cVar.h();
        }
        return null;
    }

    @Override // okhttp3.w.a
    @NotNull
    public w.a e(int i10, @NotNull TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (this.f334189d == null) {
            return j(this, 0, null, null, 0, jk.f.m("readTimeout", i10, unit), 0, 47, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
    }

    @Override // okhttp3.w.a
    @NotNull
    public w.a f(int i10, @NotNull TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (this.f334189d != null) {
            throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
        }
        int i11 = 4 ^ 0;
        return j(this, 0, null, null, 0, 0, jk.f.m("writeTimeout", i10, unit), 31, null);
    }

    @Override // okhttp3.w.a
    public int g() {
        return this.f334193h;
    }

    @Override // okhttp3.w.a
    public int h() {
        return this.f334191f;
    }

    @NotNull
    public final g i(int i10, @Nullable okhttp3.internal.connection.c cVar, @NotNull d0 request, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new g(this.f334186a, this.f334187b, i10, cVar, request, i11, i12, i13);
    }

    @NotNull
    public final okhttp3.internal.connection.e k() {
        return this.f334186a;
    }

    public final int l() {
        return this.f334191f;
    }

    @Nullable
    public final okhttp3.internal.connection.c m() {
        return this.f334189d;
    }

    public final int n() {
        return this.f334192g;
    }

    @NotNull
    public final d0 o() {
        return this.f334190e;
    }

    public final int p() {
        return this.f334193h;
    }

    @Override // okhttp3.w.a
    @NotNull
    public d0 request() {
        return this.f334190e;
    }
}
