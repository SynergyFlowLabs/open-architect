package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.metrics.i;
import com.google.firebase.perf.transport.k;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import okhttp3.d0;
import okhttp3.f0;
import okhttp3.g0;
import okhttp3.v;
import okhttp3.x;

/* JADX INFO: loaded from: classes5.dex */
public class FirebasePerfOkHttpClient {
    private FirebasePerfOkHttpClient() {
    }

    static void a(f0 f0Var, i iVar, long j10, long j11) throws IOException {
        d0 d0VarX0 = f0Var.x0();
        if (d0VarX0 == null) {
            return;
        }
        iVar.A(d0VarX0.q().a0().toString());
        iVar.o(d0VarX0.m());
        if (d0VarX0.f() != null) {
            long jContentLength = d0VarX0.f().contentLength();
            if (jContentLength != -1) {
                iVar.t(jContentLength);
            }
        }
        g0 g0VarR = f0Var.r();
        if (g0VarR != null) {
            long jContentLength2 = g0VarR.contentLength();
            if (jContentLength2 != -1) {
                iVar.w(jContentLength2);
            }
            x xVarContentType = g0VarR.contentType();
            if (xVarContentType != null) {
                iVar.v(xVarContentType.toString());
            }
        }
        iVar.p(f0Var.E());
        iVar.u(j10);
        iVar.y(j11);
        iVar.b();
    }

    @Keep
    public static void enqueue(okhttp3.e eVar, okhttp3.f fVar) {
        Timer timer = new Timer();
        eVar.li(new g(fVar, k.l(), timer, timer.f()));
    }

    @Keep
    public static f0 execute(okhttp3.e eVar) throws IOException {
        i iVarC = i.c(k.l());
        Timer timer = new Timer();
        long jF = timer.f();
        try {
            f0 f0VarExecute = eVar.execute();
            a(f0VarExecute, iVarC, jF, timer.c());
            return f0VarExecute;
        } catch (IOException e10) {
            d0 d0VarRequest = eVar.request();
            if (d0VarRequest != null) {
                v vVarQ = d0VarRequest.q();
                if (vVarQ != null) {
                    iVarC.A(vVarQ.a0().toString());
                }
                if (d0VarRequest.m() != null) {
                    iVarC.o(d0VarRequest.m());
                }
            }
            iVarC.u(jF);
            iVarC.y(timer.c());
            h.d(iVarC);
            throw e10;
        }
    }
}
