package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.b1;
import androidx.work.v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class c extends e<Boolean> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context, @NotNull androidx.work.impl.utils.taskexecutor.b taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
    }

    @Override // androidx.work.impl.constraints.trackers.e
    @NotNull
    public IntentFilter k() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // androidx.work.impl.constraints.trackers.e
    public void l(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (intent.getAction() != null) {
            v.e().a(d.f76792a, "Received " + intent.getAction());
            String action = intent.getAction();
            if (action != null) {
                int iHashCode = action.hashCode();
                if (iHashCode != -1980154005) {
                    if (iHashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                        h(Boolean.FALSE);
                    }
                } else if (action.equals("android.intent.action.BATTERY_OKAY")) {
                    h(Boolean.TRUE);
                }
            }
        }
    }

    @Override // androidx.work.impl.constraints.trackers.h
    @NotNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Boolean f() {
        Intent intentRegisterReceiver = d().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            v.e().c(d.f76792a, "getInitialState - null intent received");
            return Boolean.FALSE;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        float intExtra2 = intentRegisterReceiver.getIntExtra("level", -1) / intentRegisterReceiver.getIntExtra("scale", -1);
        boolean z10 = true;
        if (intExtra != 1 && intExtra2 <= 0.15f) {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
