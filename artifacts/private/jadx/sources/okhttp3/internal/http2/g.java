package okhttp3.internal.http2;

import io.grpc.internal.v0;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.b0;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.f0;
import okhttp3.u;
import okio.b1;
import okio.e1;
import okio.z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements okhttp3.internal.http.d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final String f334411k = "host";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private static final String f334416p = "encoding";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final okhttp3.internal.connection.f f334420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final okhttp3.internal.http.g f334421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final f f334422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private volatile i f334423f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final c0 f334424g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f334425h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final a f334409i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final String f334410j = "connection";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final String f334412l = "keep-alive";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static final String f334413m = "proxy-connection";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private static final String f334415o = "te";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private static final String f334414n = "transfer-encoding";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private static final String f334417q = "upgrade";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private static final List<String> f334418r = jk.f.C(f334410j, "host", f334412l, f334413m, f334415o, f334414n, "encoding", f334417q, c.f334267g, c.f334268h, c.f334269i, c.f334270j);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private static final List<String> f334419s = jk.f.C(f334410j, "host", f334412l, f334413m, f334415o, f334414n, "encoding", f334417q);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<c> a(@NotNull d0 request) {
            Intrinsics.checkNotNullParameter(request, "request");
            u uVarK = request.k();
            ArrayList arrayList = new ArrayList(uVarK.size() + 4);
            arrayList.add(new c(c.f334272l, request.m()));
            arrayList.add(new c(c.f334273m, okhttp3.internal.http.i.f334198a.c(request.q())));
            String strI = request.i(com.google.common.net.d.f119547w);
            if (strI != null) {
                arrayList.add(new c(c.f334275o, strI));
            }
            arrayList.add(new c(c.f334274n, request.q().X()));
            int size = uVarK.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strN = uVarK.n(i10);
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = strN.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!g.f334418r.contains(lowerCase) || (Intrinsics.areEqual(lowerCase, g.f334415o) && Intrinsics.areEqual(uVarK.w(i10), v0.f289912q))) {
                    arrayList.add(new c(lowerCase, uVarK.w(i10)));
                }
            }
            return arrayList;
        }

        @NotNull
        public final f0.a b(@NotNull u headerBlock, @NotNull c0 protocol) throws IOException {
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            u.a aVar = new u.a();
            int size = headerBlock.size();
            okhttp3.internal.http.k kVarB = null;
            for (int i10 = 0; i10 < size; i10++) {
                String strN = headerBlock.n(i10);
                String strW = headerBlock.w(i10);
                if (Intrinsics.areEqual(strN, c.f334266f)) {
                    kVarB = okhttp3.internal.http.k.f334202d.b("HTTP/1.1 " + strW);
                } else if (!g.f334419s.contains(strN)) {
                    aVar.g(strN, strW);
                }
            }
            if (kVarB != null) {
                return new f0.a().B(protocol).g(kVarB.f334208b).y(kVarB.f334209c).w(aVar.i());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        private a() {
        }
    }

    public g(@NotNull b0 client, @NotNull okhttp3.internal.connection.f connection, @NotNull okhttp3.internal.http.g chain, @NotNull f http2Connection) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(http2Connection, "http2Connection");
        this.f334420c = connection;
        this.f334421d = chain;
        this.f334422e = http2Connection;
        List<c0> listD0 = client.d0();
        c0 c0Var = c0.H2_PRIOR_KNOWLEDGE;
        if (!listD0.contains(c0Var)) {
            c0Var = c0.HTTP_2;
        }
        this.f334424g = c0Var;
    }

    @Override // okhttp3.internal.http.d
    @NotNull
    public okhttp3.internal.connection.f C0() {
        return this.f334420c;
    }

    @Override // okhttp3.internal.http.d
    @NotNull
    public b1 a(@NotNull f0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        i iVar = this.f334423f;
        Intrinsics.checkNotNull(iVar);
        return iVar.r();
    }

    @Override // okhttp3.internal.http.d
    @NotNull
    public z0 b(@NotNull d0 request, long j10) {
        Intrinsics.checkNotNullParameter(request, "request");
        i iVar = this.f334423f;
        Intrinsics.checkNotNull(iVar);
        return iVar.o();
    }

    @Override // okhttp3.internal.http.d
    public void c() throws IOException {
        this.f334422e.flush();
    }

    @Override // okhttp3.internal.http.d
    public void cancel() {
        this.f334425h = true;
        i iVar = this.f334423f;
        if (iVar != null) {
            iVar.f(b.CANCEL);
        }
    }

    @Override // okhttp3.internal.http.d
    public void d() throws IOException {
        i iVar = this.f334423f;
        Intrinsics.checkNotNull(iVar);
        iVar.o().close();
    }

    @Override // okhttp3.internal.http.d
    public long e(@NotNull f0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (okhttp3.internal.http.e.c(response)) {
            return jk.f.A(response);
        }
        return 0L;
    }

    @Override // okhttp3.internal.http.d
    public void f(@NotNull d0 request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f334423f != null) {
            return;
        }
        this.f334423f = this.f334422e.Q0(f334409i.a(request), request.f() != null);
        if (this.f334425h) {
            i iVar = this.f334423f;
            Intrinsics.checkNotNull(iVar);
            iVar.f(b.CANCEL);
            throw new IOException("Canceled");
        }
        i iVar2 = this.f334423f;
        Intrinsics.checkNotNull(iVar2);
        e1 e1VarX = iVar2.x();
        long jN = this.f334421d.n();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        e1VarX.k(jN, timeUnit);
        i iVar3 = this.f334423f;
        Intrinsics.checkNotNull(iVar3);
        iVar3.L().k(this.f334421d.p(), timeUnit);
    }

    @Override // okhttp3.internal.http.d
    @Nullable
    public f0.a g(boolean z10) throws IOException {
        i iVar = this.f334423f;
        if (iVar == null) {
            throw new IOException("stream wasn't created");
        }
        f0.a aVarB = f334409i.b(iVar.H(), this.f334424g);
        if (z10 && aVarB.j() == 100) {
            aVarB = null;
        }
        return aVarB;
    }

    @Override // okhttp3.internal.http.d
    @NotNull
    public u h() {
        i iVar = this.f334423f;
        Intrinsics.checkNotNull(iVar);
        return iVar.I();
    }
}
