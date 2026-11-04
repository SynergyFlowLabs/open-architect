package okhttp3.internal.http;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p;
import kotlin.text.StringsKt;
import okhttp3.d0;
import okhttp3.e0;
import okhttp3.f0;
import okhttp3.g0;
import okhttp3.w;
import okio.l0;
import okio.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f334174b;

    public b(boolean z10) {
        this.f334174b = z10;
    }

    private final boolean a(int i10) {
        if (i10 == 100) {
            return true;
        }
        return 102 <= i10 && i10 < 200;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, okhttp3.f0$a] */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v4, types: [okhttp3.f0$a] */
    @Override // okhttp3.w
    @NotNull
    public f0 intercept(@NotNull w.a chain) throws IOException {
        boolean z10;
        ?? r10;
        ?? R;
        f0.a aVar;
        Intrinsics.checkNotNullParameter(chain, "chain");
        g gVar = (g) chain;
        okhttp3.internal.connection.c cVarM = gVar.m();
        Intrinsics.checkNotNull(cVarM);
        d0 d0VarO = gVar.o();
        e0 e0VarF = d0VarO.f();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            cVarM.x(d0VarO);
            ?? B = f.b(d0VarO.m());
            try {
                if (B == 0 || e0VarF == null) {
                    cVarM.p();
                    z10 = true;
                    B = 0;
                } else {
                    if (StringsKt.N1("100-continue", d0VarO.i(com.google.common.net.d.f119535s), true)) {
                        cVarM.f();
                        f0.a aVarR = cVarM.r(true);
                        try {
                            cVarM.t();
                            z10 = false;
                            aVar = aVarR;
                        } catch (IOException e10) {
                            e = e10;
                            z10 = true;
                            r10 = aVarR;
                            if (e instanceof okhttp3.internal.http2.a) {
                                throw e;
                            }
                            if (!cVarM.k()) {
                                R = r10;
                                throw e;
                            }
                        }
                    } else {
                        z10 = true;
                        aVar = null;
                    }
                    if (aVar != null) {
                        cVarM.p();
                        if (!cVarM.h().A()) {
                            B = aVar;
                            cVarM.o();
                            B = aVar;
                        }
                    } else if (e0VarF.isDuplex()) {
                        cVarM.f();
                        e0VarF.writeTo(l0.d(cVarM.c(d0VarO, true)));
                        B = aVar;
                    } else {
                        m mVarD = l0.d(cVarM.c(d0VarO, false));
                        e0VarF.writeTo(mVarD);
                        mVarD.close();
                        B = aVar;
                    }
                }
                B = aVar;
                if (e0VarF == null || !e0VarF.isDuplex()) {
                    cVarM.e();
                }
                e = null;
                R = B;
            } catch (IOException e11) {
                e = e11;
                r10 = B;
            }
        } catch (IOException e12) {
            e = e12;
            z10 = true;
            r10 = 0;
        }
        if (R == 0) {
            try {
                R = cVarM.r(false);
                Intrinsics.checkNotNull(R);
                if (z10) {
                    cVarM.t();
                    z10 = false;
                }
            } catch (IOException e13) {
                if (e == null) {
                    throw e13;
                }
                p.a(e, e13);
                throw e;
            }
        }
        f0 f0VarC = R.E(d0VarO).u(cVarM.h().c()).F(jCurrentTimeMillis).C(System.currentTimeMillis()).c();
        int iE = f0VarC.E();
        if (a(iE)) {
            f0.a aVarR2 = cVarM.r(false);
            Intrinsics.checkNotNull(aVarR2);
            if (z10) {
                cVarM.t();
            }
            f0VarC = aVarR2.E(d0VarO).u(cVarM.h().c()).F(jCurrentTimeMillis).C(System.currentTimeMillis()).c();
            iE = f0VarC.E();
        }
        cVarM.s(f0VarC);
        f0 f0VarC2 = (this.f334174b && iE == 101) ? f0VarC.j0().b(jk.f.f307485c).c() : f0VarC.j0().b(cVarM.q(f0VarC)).c();
        if (StringsKt.N1("close", f0VarC2.x0().i(com.google.common.net.d.f119523o), true) || StringsKt.N1("close", f0.T(f0VarC2, com.google.common.net.d.f119523o, null, 2, null), true)) {
            cVarM.o();
        }
        if (iE == 204 || iE == 205) {
            g0 g0VarR = f0VarC2.r();
            if ((g0VarR != null ? g0VarR.contentLength() : -1L) > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("HTTP ");
                sb2.append(iE);
                sb2.append(" had non-zero Content-Length: ");
                g0 g0VarR2 = f0VarC2.r();
                sb2.append(g0VarR2 != null ? Long.valueOf(g0VarR2.contentLength()) : null);
                throw new ProtocolException(sb2.toString());
            }
        }
        return f0VarC2;
    }
}
