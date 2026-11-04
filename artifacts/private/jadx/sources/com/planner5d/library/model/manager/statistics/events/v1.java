package com.planner5d.library.model.manager.statistics.events;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class v1 extends w0 implements w3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final v1 f217591b = new v1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f217592c = 0;

    private v1() {
    }

    public static /* synthetic */ void y1(v1 v1Var, w3.a aVar, fd.e eVar, com.planner5d.library.model.manager.config.purchaseplacement.b.a aVar2, String str, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str = null;
        }
        v1Var.x1(aVar, eVar, aVar2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z1(w3.a aVar, fd.e eVar, com.planner5d.library.model.manager.config.purchaseplacement.b.a aVar2, String str, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put(com.facebook.internal.w0.f100156c1, aVar.name());
        track.put("layout", eVar.n());
        track.put("placement", aVar2.name());
        if (str == null) {
            return Unit.f312394a;
        }
        track.put("sku", str);
        return Unit.f312394a;
    }

    public final void x1(@NotNull final w3.a action, @NotNull final fd.e layout, @NotNull final com.planner5d.library.model.manager.config.purchaseplacement.b.a placement, @Nullable final String str) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(placement, "placement");
        q1(u3.f217528f4, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.u1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v1.z1(action, layout, placement, str, (Map) obj);
            }
        });
    }
}
