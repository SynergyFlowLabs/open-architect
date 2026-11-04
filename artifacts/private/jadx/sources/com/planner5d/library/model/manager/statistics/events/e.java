package com.planner5d.library.model.manager.statistics.events;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nDefaultStatisticsEventAiDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultStatisticsEventAiDecoration.kt\ncom/planner5d/library/model/manager/statistics/events/DefaultStatisticsEventAiDecoration\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,24:1\n1#2:25\n*E\n"})
public final class e extends w0 implements j3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final e f216850b = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f216851c = 0;

    public enum a {
        action,
        screen,
        popup_name,
        button_value,
        room_type,
        room_design,
        source;


        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f216860i = kotlin.enums.c.c(k());

        static {
            int i10 = 3 << 2;
        }

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f216860i;
        }
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x1(j3.a aVar, j3.g gVar, j3.e eVar, j3.b bVar, j3.f fVar, String str, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put(com.facebook.internal.w0.f100156c1, aVar);
        track.put("source", j3.h.home);
        if (gVar != null) {
            track.put(com.segment.analytics.kotlin.android.plugins.a.f266538j3, gVar);
        }
        if (eVar != null) {
            track.put("popup_name", eVar);
        }
        if (bVar != null) {
            track.put("button_value", bVar);
        }
        if (fVar != null) {
            track.put("room_type", fVar);
        }
        if (str != null) {
            track.put("room_design", str);
        }
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.statistics.events.j3
    public void z(@NotNull final j3.a action, @Nullable final j3.g gVar, @Nullable final j3.b bVar, @Nullable final j3.f fVar, @Nullable final String str, @Nullable final j3.e eVar) {
        Intrinsics.checkNotNullParameter(action, "action");
        q1(u3.K4, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.x1(action, gVar, eVar, bVar, fVar, str, (Map) obj);
            }
        });
    }
}
