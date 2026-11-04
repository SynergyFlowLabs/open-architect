package com.google.firebase.perf;

import android.content.Context;
import androidx.annotation.p0;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.v;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public class b {
    public b(com.google.firebase.h hVar, @p0 v vVar, Executor executor) {
        Context contextN = hVar.n();
        com.google.firebase.perf.config.a.h().R(contextN);
        com.google.firebase.perf.application.a aVarC = com.google.firebase.perf.application.a.c();
        aVarC.n(contextN);
        aVarC.o(new g());
        if (vVar != null) {
            AppStartTrace appStartTraceL = AppStartTrace.l();
            appStartTraceL.A(contextN);
            executor.execute(new AppStartTrace.c(appStartTraceL));
        }
        SessionManager.getInstance().initializeGaugeCollection();
    }
}
