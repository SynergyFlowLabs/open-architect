package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.annotation.b1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final h<Boolean> f76811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final c f76812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final h<androidx.work.impl.constraints.c> f76813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final h<Boolean> f76814d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public o(@NotNull Context context, @NotNull androidx.work.impl.utils.taskexecutor.b taskExecutor) {
        this(context, taskExecutor, null, null, null, null, 60, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
    }

    @NotNull
    public final h<Boolean> a() {
        return this.f76811a;
    }

    @NotNull
    public final c b() {
        return this.f76812b;
    }

    @NotNull
    public final h<androidx.work.impl.constraints.c> c() {
        return this.f76813c;
    }

    @NotNull
    public final h<Boolean> d() {
        return this.f76814d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public o(@NotNull Context context, @NotNull androidx.work.impl.utils.taskexecutor.b taskExecutor, @NotNull h<Boolean> batteryChargingTracker) {
        this(context, taskExecutor, batteryChargingTracker, null, null, null, 56, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Intrinsics.checkNotNullParameter(batteryChargingTracker, "batteryChargingTracker");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public o(@NotNull Context context, @NotNull androidx.work.impl.utils.taskexecutor.b taskExecutor, @NotNull h<Boolean> batteryChargingTracker, @NotNull c batteryNotLowTracker) {
        this(context, taskExecutor, batteryChargingTracker, batteryNotLowTracker, null, null, 48, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Intrinsics.checkNotNullParameter(batteryChargingTracker, "batteryChargingTracker");
        Intrinsics.checkNotNullParameter(batteryNotLowTracker, "batteryNotLowTracker");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public o(@NotNull Context context, @NotNull androidx.work.impl.utils.taskexecutor.b taskExecutor, @NotNull h<Boolean> batteryChargingTracker, @NotNull c batteryNotLowTracker, @NotNull h<androidx.work.impl.constraints.c> networkStateTracker) {
        this(context, taskExecutor, batteryChargingTracker, batteryNotLowTracker, networkStateTracker, null, 32, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Intrinsics.checkNotNullParameter(batteryChargingTracker, "batteryChargingTracker");
        Intrinsics.checkNotNullParameter(batteryNotLowTracker, "batteryNotLowTracker");
        Intrinsics.checkNotNullParameter(networkStateTracker, "networkStateTracker");
    }

    @oj.j
    public o(@NotNull Context context, @NotNull androidx.work.impl.utils.taskexecutor.b taskExecutor, @NotNull h<Boolean> batteryChargingTracker, @NotNull c batteryNotLowTracker, @NotNull h<androidx.work.impl.constraints.c> networkStateTracker, @NotNull h<Boolean> storageNotLowTracker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Intrinsics.checkNotNullParameter(batteryChargingTracker, "batteryChargingTracker");
        Intrinsics.checkNotNullParameter(batteryNotLowTracker, "batteryNotLowTracker");
        Intrinsics.checkNotNullParameter(networkStateTracker, "networkStateTracker");
        Intrinsics.checkNotNullParameter(storageNotLowTracker, "storageNotLowTracker");
        this.f76811a = batteryChargingTracker;
        this.f76812b = batteryNotLowTracker;
        this.f76813c = networkStateTracker;
        this.f76814d = storageNotLowTracker;
    }

    public /* synthetic */ o(Context context, androidx.work.impl.utils.taskexecutor.b bVar, h hVar, c cVar, h hVar2, h hVar3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        h aVar;
        c cVar2;
        h hVarA;
        h mVar;
        if ((i10 & 4) != 0) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            aVar = new a(applicationContext, bVar);
        } else {
            aVar = hVar;
        }
        if ((i10 & 8) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "context.applicationContext");
            cVar2 = new c(applicationContext2, bVar);
        } else {
            cVar2 = cVar;
        }
        if ((i10 & 16) != 0) {
            Context applicationContext3 = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext3, "context.applicationContext");
            hVarA = k.a(applicationContext3, bVar);
        } else {
            hVarA = hVar2;
        }
        if ((i10 & 32) != 0) {
            Context applicationContext4 = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext4, "context.applicationContext");
            mVar = new m(applicationContext4, bVar);
        } else {
            mVar = hVar3;
        }
        this(context, bVar, aVar, cVar2, hVarA, mVar);
    }
}
