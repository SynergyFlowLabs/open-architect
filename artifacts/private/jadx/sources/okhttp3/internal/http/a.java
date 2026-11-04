package okhttp3.internal.http;

import java.io.IOException;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okhttp3.d0;
import okhttp3.e0;
import okhttp3.f0;
import okhttp3.g0;
import okhttp3.m;
import okhttp3.n;
import okhttp3.w;
import okhttp3.x;
import okio.b0;
import okio.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nBridgeInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BridgeInterceptor.kt\nokhttp3/internal/http/BridgeInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,117:1\n1864#2,3:118\n*S KotlinDebug\n*F\n+ 1 BridgeInterceptor.kt\nokhttp3/internal/http/BridgeInterceptor\n*L\n111#1:118,3\n*E\n"})
public final class a implements w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n f334173b;

    public a(@NotNull n cookieJar) {
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        this.f334173b = cookieJar;
    }

    private final String a(List<m> list) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            m mVar = (m) obj;
            if (i10 > 0) {
                sb2.append("; ");
            }
            sb2.append(mVar.s());
            sb2.append('=');
            sb2.append(mVar.z());
            i10 = i11;
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // okhttp3.w
    @NotNull
    public f0 intercept(@NotNull w.a chain) throws IOException {
        g0 g0VarR;
        Intrinsics.checkNotNullParameter(chain, "chain");
        d0 d0VarRequest = chain.request();
        d0.a aVarN = d0VarRequest.n();
        e0 e0VarF = d0VarRequest.f();
        if (e0VarF != null) {
            x xVarContentType = e0VarF.contentType();
            if (xVarContentType != null) {
                aVarN.n("Content-Type", xVarContentType.toString());
            }
            long jContentLength = e0VarF.contentLength();
            if (jContentLength != -1) {
                aVarN.n("Content-Length", String.valueOf(jContentLength));
                aVarN.t(com.google.common.net.d.M0);
            } else {
                aVarN.n(com.google.common.net.d.M0, "chunked");
                aVarN.t("Content-Length");
            }
        }
        boolean z10 = false;
        int i10 = 2 | 0;
        if (d0VarRequest.i(com.google.common.net.d.f119547w) == null) {
            aVarN.n(com.google.common.net.d.f119547w, jk.f.g0(d0VarRequest.q(), false, 1, null));
        }
        if (d0VarRequest.i(com.google.common.net.d.f119523o) == null) {
            aVarN.n(com.google.common.net.d.f119523o, com.google.common.net.d.f119542u0);
        }
        if (d0VarRequest.i(com.google.common.net.d.f119507j) == null && d0VarRequest.i(com.google.common.net.d.I) == null) {
            aVarN.n(com.google.common.net.d.f119507j, "gzip");
            z10 = true;
        }
        List<m> listA = this.f334173b.a(d0VarRequest.q());
        if (!listA.isEmpty()) {
            aVarN.n("Cookie", a(listA));
        }
        if (d0VarRequest.i(com.google.common.net.d.P) == null) {
            aVarN.n(com.google.common.net.d.P, jk.f.f307492j);
        }
        f0 f0VarC = chain.c(aVarN.b());
        e.g(this.f334173b, d0VarRequest.q(), f0VarC.Y());
        f0.a aVarE = f0VarC.j0().E(d0VarRequest);
        if (z10 && StringsKt.N1("gzip", f0.T(f0VarC, com.google.common.net.d.f119476b0, null, 2, null), true) && e.c(f0VarC) && (g0VarR = f0VarC.r()) != null) {
            b0 b0Var = new b0(g0VarR.source());
            aVarE.w(f0VarC.Y().s().l(com.google.common.net.d.f119476b0).l("Content-Length").i());
            aVarE.b(new h(f0.T(f0VarC, "Content-Type", null, 2, null), -1L, l0.e(b0Var)));
        }
        return aVarE.c();
    }
}
