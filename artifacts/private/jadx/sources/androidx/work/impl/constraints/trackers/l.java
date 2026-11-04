package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import androidx.work.v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends e<androidx.work.impl.constraints.c> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final ConnectivityManager f76809g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@NotNull Context context, @NotNull androidx.work.impl.utils.taskexecutor.b taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Object systemService = d().getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f76809g = (ConnectivityManager) systemService;
    }

    public static /* synthetic */ void m() {
    }

    @Override // androidx.work.impl.constraints.trackers.e
    @NotNull
    public IntentFilter k() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    @Override // androidx.work.impl.constraints.trackers.e
    public void l(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (Intrinsics.areEqual(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            v.e().a(k.f76808a, "Network broadcast received");
            h(k.c(this.f76809g));
        }
    }

    @Override // androidx.work.impl.constraints.trackers.h
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public androidx.work.impl.constraints.c f() {
        return k.c(this.f76809g);
    }
}
