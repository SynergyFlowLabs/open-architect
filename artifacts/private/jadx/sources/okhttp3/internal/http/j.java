package okhttp3.internal.http;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.b0;
import okhttp3.d0;
import okhttp3.e0;
import okhttp3.f0;
import okhttp3.g0;
import okhttp3.h0;
import okhttp3.v;
import okhttp3.w;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f334199c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f334200d = 20;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final b0 f334201b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public j(@NotNull b0 client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f334201b = client;
    }

    private final d0 a(f0 f0Var, String str) {
        String strT;
        v vVarW;
        if (!this.f334201b.U() || (strT = f0.T(f0Var, com.google.common.net.d.f119539t0, null, 2, null)) == null || (vVarW = f0Var.x0().q().W(strT)) == null) {
            return null;
        }
        if (!Intrinsics.areEqual(vVarW.X(), f0Var.x0().q().X()) && !this.f334201b.V()) {
            return null;
        }
        d0.a aVarN = f0Var.x0().n();
        if (f.b(str)) {
            int iE = f0Var.E();
            f fVar = f.f334185a;
            boolean z10 = fVar.d(str) || iE == 308 || iE == 307;
            if (!fVar.c(str) || iE == 308 || iE == 307) {
                aVarN.p(str, z10 ? f0Var.x0().f() : null);
            } else {
                aVarN.p("GET", null);
            }
            if (!z10) {
                aVarN.t(com.google.common.net.d.M0);
                aVarN.t("Content-Length");
                aVarN.t("Content-Type");
            }
        }
        if (!jk.f.l(f0Var.x0().q(), vVarW)) {
            aVarN.t("Authorization");
        }
        return aVarN.D(vVarW).b();
    }

    private final d0 b(f0 f0Var, okhttp3.internal.connection.c cVar) throws IOException {
        okhttp3.internal.connection.f fVarH;
        h0 h0VarB = (cVar == null || (fVarH = cVar.h()) == null) ? null : fVarH.b();
        int iE = f0Var.E();
        String strM = f0Var.x0().m();
        if (iE != 307 && iE != 308) {
            if (iE == 401) {
                return this.f334201b.H().a(h0VarB, f0Var);
            }
            if (iE == 421) {
                e0 e0VarF = f0Var.x0().f();
                if ((e0VarF != null && e0VarF.isOneShot()) || cVar == null || !cVar.l()) {
                    return null;
                }
                cVar.h().D();
                return f0Var.x0();
            }
            if (iE == 503) {
                f0 f0VarO0 = f0Var.o0();
                if ((f0VarO0 == null || f0VarO0.E() != 503) && f(f0Var, Integer.MAX_VALUE) == 0) {
                    return f0Var.x0();
                }
                return null;
            }
            if (iE == 407) {
                Intrinsics.checkNotNull(h0VarB);
                if (h0VarB.e().type() == Proxy.Type.HTTP) {
                    return this.f334201b.f0().a(h0VarB, f0Var);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (iE == 408) {
                if (!this.f334201b.i0()) {
                    return null;
                }
                e0 e0VarF2 = f0Var.x0().f();
                if (e0VarF2 != null && e0VarF2.isOneShot()) {
                    return null;
                }
                f0 f0VarO1 = f0Var.o0();
                if ((f0VarO1 == null || f0VarO1.E() != 408) && f(f0Var, 0) <= 0) {
                    return f0Var.x0();
                }
                return null;
            }
            switch (iE) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return a(f0Var, strM);
    }

    private final boolean c(IOException iOException, boolean z10) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            return (iOException instanceof SocketTimeoutException) && !z10;
        }
        return (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private final boolean d(IOException iOException, okhttp3.internal.connection.e eVar, d0 d0Var, boolean z10) {
        if (!this.f334201b.i0()) {
            return false;
        }
        if ((!z10 || !e(iOException, d0Var)) && c(iOException, z10) && eVar.x()) {
            return true;
        }
        return false;
    }

    private final boolean e(IOException iOException, d0 d0Var) {
        e0 e0VarF = d0Var.f();
        return (e0VarF != null && e0VarF.isOneShot()) || (iOException instanceof FileNotFoundException);
    }

    private final int f(f0 f0Var, int i10) {
        String strT = f0.T(f0Var, com.google.common.net.d.B0, null, 2, null);
        if (strT == null) {
            return i10;
        }
        if (!new Regex("\\d+").k(strT)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strT);
        Intrinsics.checkNotNullExpressionValue(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    @Override // okhttp3.w
    @NotNull
    public f0 intercept(@NotNull w.a chain) throws IOException {
        f0 f0VarC;
        Intrinsics.checkNotNullParameter(chain, "chain");
        g gVar = (g) chain;
        d0 d0VarO = gVar.o();
        okhttp3.internal.connection.e eVarK = gVar.k();
        List listEmptyList = CollectionsKt.emptyList();
        int i10 = 0;
        f0 f0Var = null;
        while (true) {
            boolean z10 = true;
            while (true) {
                eVarK.h(d0VarO, z10);
                try {
                    if (eVarK.isCanceled()) {
                        throw new IOException("Canceled");
                    }
                    try {
                        f0VarC = gVar.c(d0VarO);
                    } catch (IOException e10) {
                        if (!d(e10, eVarK, d0VarO, !(e10 instanceof okhttp3.internal.http2.a))) {
                            throw jk.f.o0(e10, listEmptyList);
                        }
                        listEmptyList = CollectionsKt.plus((Collection<? extends IOException>) listEmptyList, e10);
                        eVarK.i(true);
                        z10 = false;
                    } catch (okhttp3.internal.connection.i e11) {
                        if (!d(e11.c(), eVarK, d0VarO, false)) {
                            throw jk.f.o0(e11.b(), listEmptyList);
                        }
                        listEmptyList = CollectionsKt.plus((Collection<? extends IOException>) listEmptyList, e11.b());
                        eVarK.i(true);
                        z10 = false;
                    }
                    eVarK.i(true);
                    z10 = false;
                } catch (Throwable th2) {
                    eVarK.i(true);
                    throw th2;
                }
            }
            if (f0Var != null) {
                f0VarC = f0VarC.j0().A(f0Var.j0().b(null).c()).c();
            }
            f0Var = f0VarC;
            okhttp3.internal.connection.c cVarP = eVarK.p();
            d0 d0VarB = b(f0Var, cVarP);
            if (d0VarB == null) {
                if (cVarP != null && cVarP.m()) {
                    eVarK.B();
                }
                eVarK.i(false);
                return f0Var;
            }
            e0 e0VarF = d0VarB.f();
            if (e0VarF != null && e0VarF.isOneShot()) {
                eVarK.i(false);
                return f0Var;
            }
            g0 g0VarR = f0Var.r();
            if (g0VarR != null) {
                jk.f.o(g0VarR);
            }
            i10++;
            if (i10 > 20) {
                throw new ProtocolException("Too many follow-up requests: " + i10);
            }
            eVarK.i(true);
            d0VarO = d0VarB;
        }
    }
}
