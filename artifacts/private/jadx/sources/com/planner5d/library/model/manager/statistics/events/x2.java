package com.planner5d.library.model.manager.statistics.events;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class x2 extends w0 implements c4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final x2 f217661b = new x2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f217662c = 0;

    private x2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y1(c4.a aVar, c4.c cVar, String str, String str2, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put(com.facebook.internal.w0.f100156c1, aVar);
        track.put("form", cVar);
        track.put("object", str);
        track.put(com.facebook.internal.a.Y, str2);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z1(c4.d dVar, String str, Integer num, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("onboarding_form_name", "new_onboarding_08_2025");
        track.put("frame_name", dVar);
        track.put("user_selection", str);
        track.put("selection_index", num);
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.statistics.events.c4
    public void Z0(@NotNull final c4.a action, @NotNull final c4.c form, @Nullable final String str, @Nullable final String str2) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(form, "form");
        q1(u3.P4, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.w2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return x2.y1(action, form, str, str2, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.c4
    public void a1(@NotNull final c4.d frameName, @Nullable final String str, @Nullable final Integer num) {
        Intrinsics.checkNotNullParameter(frameName, "frameName");
        q1(u3.f217584z4, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.v2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return x2.z1(frameName, str, num, (Map) obj);
            }
        });
    }
}
