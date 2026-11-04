package androidx.work.impl.constraints.trackers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.b1;
import androidx.work.v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP})
public abstract class e<T> extends h<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final BroadcastReceiver f76794f;

    public static final class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e<T> f76795a;

        a(e<T> eVar) {
            this.f76795a = eVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NotNull Context context, @NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            this.f76795a.l(intent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull Context context, @NotNull androidx.work.impl.utils.taskexecutor.b taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        this.f76794f = new a(this);
    }

    @Override // androidx.work.impl.constraints.trackers.h
    public void i() {
        v.e().a(f.f76796a, getClass().getSimpleName() + ": registering receiver");
        d().registerReceiver(this.f76794f, k());
    }

    @Override // androidx.work.impl.constraints.trackers.h
    public void j() {
        v.e().a(f.f76796a, getClass().getSimpleName() + ": unregistering receiver");
        d().unregisterReceiver(this.f76794f);
    }

    @NotNull
    public abstract IntentFilter k();

    public abstract void l(@NotNull Intent intent);
}
