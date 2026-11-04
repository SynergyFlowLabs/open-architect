package com.planner5d.library.model.manager.statistics.events;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class g extends w0 implements StatisticsEventAiDesigner {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final g f216942b = new g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f216943c = 0;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f216944a;

        static {
            int[] iArr = new int[StatisticsEventAiDesigner.a.values().length];
            try {
                iArr[StatisticsEventAiDesigner.a.button_view.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatisticsEventAiDesigner.a.button_click.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StatisticsEventAiDesigner.a.popup_view.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f216944a = iArr;
        }
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x1(StatisticsEventAiDesigner.a aVar, StatisticsEventAiDesigner.d dVar, StatisticsEventAiDesigner.g gVar, Integer num, Integer num2, Integer num3, StatisticsEventAiDesigner.e eVar, String str, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put(com.facebook.internal.w0.f100156c1, aVar);
        track.put("entry_point", dVar);
        track.put("name_tool", gVar);
        StatisticsEventAiDesigner.a aVar2 = StatisticsEventAiDesigner.a.next;
        if (aVar == aVar2 || aVar == StatisticsEventAiDesigner.a.back) {
            track.put("room_type", num);
        }
        if (aVar == aVar2 || aVar == StatisticsEventAiDesigner.a.back || aVar == StatisticsEventAiDesigner.a.completed) {
            track.put("room_style", num2);
        }
        track.put(FirebaseAnalytics.d.D, num3);
        if (eVar != null) {
            track.put(com.facebook.internal.w0.P0, eVar);
        }
        if (str != null) {
            track.put("decor_elements", str);
        }
        int i10 = a.f216944a[aVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            track.put("button_value", StatisticsEventAiDesigner.b.ai_designer_button);
        } else if (i10 != 3) {
            Unit unit = Unit.f312394a;
        } else {
            track.put("popup_name", StatisticsEventAiDesigner.f.choose_a_room_alert);
        }
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner
    public void F0(@NotNull final StatisticsEventAiDesigner.a action, @Nullable final StatisticsEventAiDesigner.d dVar, @Nullable final StatisticsEventAiDesigner.g gVar, @Nullable final Integer num, @Nullable final Integer num2, @Nullable final Integer num3, @Nullable final StatisticsEventAiDesigner.e eVar, @Nullable final String str) {
        Intrinsics.checkNotNullParameter(action, "action");
        q1(u3.L4, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.x1(action, dVar, gVar, num, num2, num3, eVar, str, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner
    public void i(@NotNull StatisticsEventAiDesigner.a action, @NotNull StatisticsEventAiDesigner.EventData parameters) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        F0(action, parameters.l(), parameters.q(), parameters.o(), parameters.n(), parameters.p(), parameters.m(), parameters.k());
    }
}
