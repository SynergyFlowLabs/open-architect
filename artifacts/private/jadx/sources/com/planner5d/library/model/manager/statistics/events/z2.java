package com.planner5d.library.model.manager.statistics.events;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class z2 extends w0 implements d4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final z2 f217761b = new z2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f217762c = 0;

    private z2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x1(long j10, long j11, f4 f4Var, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("process_start", Long.valueOf(j10));
        track.put("process_end", Long.valueOf(j11));
        track.put("process_duration", Long.valueOf(j11 - j10));
        track.put("process_name", f4Var.o());
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.statistics.events.d4
    public void f1(final long j10, final long j11, @NotNull final f4 statisticsProcessName) {
        Intrinsics.checkNotNullParameter(statisticsProcessName, "statisticsProcessName");
        q1(u3.E4, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.y2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z2.x1(j10, j11, statisticsProcessName, (Map) obj);
            }
        });
    }
}
