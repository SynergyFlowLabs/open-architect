package com.superwall.sdk.store.transactions.notifications;

import android.content.Context;
import androidx.core.app.c0;
import androidx.core.app.w;
import androidx.core.content.d;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.u;
import com.superwall.sdk.paywall.view.SuperwallPaywallActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class NotificationWorker extends Worker {

    @NotNull
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationWorker(@NotNull Context context, @NotNull WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        this.context = context;
    }

    @Override // androidx.work.Worker
    @NotNull
    public u.a doWork() {
        w.n nVarA0;
        int iV = getInputData().v("id", 0);
        String strA = getInputData().A("title");
        String strA2 = getInputData().A("body");
        w.n nVarO = new w.n(getApplicationContext(), SuperwallPaywallActivity.NOTIFICATION_CHANNEL_ID).t0(this.context.getApplicationInfo().icon).O(strA);
        String strA3 = getInputData().A("subtitle");
        if (strA3 == null || (nVarA0 = nVarO.A0(strA3)) == null) {
            Intrinsics.checkNotNull(nVarO);
        } else {
            nVarO = nVarA0;
        }
        w.n nVarK0 = nVarO.N(strA2).k0(1);
        Intrinsics.checkNotNullExpressionValue(nVarK0, "setPriority(...)");
        c0 c0VarQ = c0.q(getApplicationContext());
        if (d.a(this.context, "android.permission.POST_NOTIFICATIONS") != 0) {
            u.a aVarA = u.a.a();
            Intrinsics.checkNotNullExpressionValue(aVarA, "failure(...)");
            return aVarA;
        }
        c0VarQ.F(iV, nVarK0.h());
        u.a aVarE = u.a.e();
        Intrinsics.checkNotNullExpressionValue(aVarE, "success(...)");
        return aVarE;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }
}
