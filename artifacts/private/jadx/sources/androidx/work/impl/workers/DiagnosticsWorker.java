package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.b0;
import androidx.work.impl.model.k;
import androidx.work.impl.model.p;
import androidx.work.impl.model.v;
import androidx.work.impl.model.w;
import androidx.work.impl.r0;
import androidx.work.u;
import f4.e;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(@NotNull Context context, @NotNull WorkerParameters parameters) {
        super(context, parameters);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    @NotNull
    public u.a doWork() {
        r0 r0VarM = r0.M(getApplicationContext());
        Intrinsics.checkNotNullExpressionValue(r0VarM, "getInstance(applicationContext)");
        WorkDatabase workDatabaseS = r0VarM.S();
        Intrinsics.checkNotNullExpressionValue(workDatabaseS, "workManager.workDatabase");
        w wVarK = workDatabaseS.k();
        p pVarI = workDatabaseS.i();
        b0 b0VarL = workDatabaseS.l();
        k kVarH = workDatabaseS.h();
        List<v> listE = wVarK.E(r0VarM.o().a().currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List<v> listO = wVarK.O();
        List<v> listO2 = wVarK.o(200);
        if (!listE.isEmpty()) {
            androidx.work.v.e().f(e.f274938a, "Recently completed work:\n\n");
            androidx.work.v.e().f(e.f274938a, e.d(pVarI, b0VarL, kVarH, listE));
        }
        if (!listO.isEmpty()) {
            androidx.work.v.e().f(e.f274938a, "Running work:\n\n");
            androidx.work.v.e().f(e.f274938a, e.d(pVarI, b0VarL, kVarH, listO));
        }
        if (!listO2.isEmpty()) {
            androidx.work.v.e().f(e.f274938a, "Enqueued work:\n\n");
            androidx.work.v.e().f(e.f274938a, e.d(pVarI, b0VarL, kVarH, listO2));
        }
        u.a aVarE = u.a.e();
        Intrinsics.checkNotNullExpressionValue(aVarE, "success()");
        return aVarE;
    }
}
