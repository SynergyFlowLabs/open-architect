package com.planner5d.library.model.manager.statistics.events;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class c extends w0 implements i3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final c f216767b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f216768c = 0;

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x1(i3.a aVar, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put(com.facebook.internal.w0.f100156c1, aVar);
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.statistics.events.i3
    public void V(@NotNull final i3.a action) {
        Intrinsics.checkNotNullParameter(action, "action");
        q1(u3.N4, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c.x1(action, (Map) obj);
            }
        });
    }
}
