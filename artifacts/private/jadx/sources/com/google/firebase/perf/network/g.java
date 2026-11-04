package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.i;
import com.google.firebase.perf.transport.k;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import okhttp3.d0;
import okhttp3.f0;
import okhttp3.v;

/* JADX INFO: loaded from: classes5.dex */
public class g implements okhttp3.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final okhttp3.f f124072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f124073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Timer f124074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f124075d;

    public g(okhttp3.f fVar, k kVar, Timer timer, long j10) {
        this.f124072a = fVar;
        this.f124073b = i.c(kVar);
        this.f124075d = j10;
        this.f124074c = timer;
    }

    @Override // okhttp3.f
    public void onFailure(okhttp3.e eVar, IOException iOException) {
        d0 d0VarRequest = eVar.request();
        if (d0VarRequest != null) {
            v vVarQ = d0VarRequest.q();
            if (vVarQ != null) {
                this.f124073b.A(vVarQ.a0().toString());
            }
            if (d0VarRequest.m() != null) {
                this.f124073b.o(d0VarRequest.m());
            }
        }
        this.f124073b.u(this.f124075d);
        this.f124073b.y(this.f124074c.c());
        h.d(this.f124073b);
        this.f124072a.onFailure(eVar, iOException);
    }

    @Override // okhttp3.f
    public void onResponse(okhttp3.e eVar, f0 f0Var) throws IOException {
        FirebasePerfOkHttpClient.a(f0Var, this.f124073b, this.f124075d, this.f124074c.c());
        this.f124072a.onResponse(eVar, f0Var);
    }
}
