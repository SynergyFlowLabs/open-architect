package com.planner5d.library.model.manager.statistics.events;

import com.devtodev.analytics.internal.storage.sqlite.TutorialMarkEntry;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nDefaultStatisticsEventOnboarding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultStatisticsEventOnboarding.kt\ncom/planner5d/library/model/manager/statistics/events/DefaultStatisticsEventOnboarding\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,40:1\n1863#2,2:41\n*S KotlinDebug\n*F\n+ 1 DefaultStatisticsEventOnboarding.kt\ncom/planner5d/library/model/manager/statistics/events/DefaultStatisticsEventOnboarding\n*L\n26#1:41,2\n*E\n"})
public final class t1 extends w0 implements v3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final t1 f217463b = new t1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Map<Integer, v3.e> f217464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f217465d;

    static {
        Pair pair = TuplesKt.to(0, v3.e.video_new);
        Pair pair2 = TuplesKt.to(1, v3.e.onboarding_start);
        Pair pair3 = TuplesKt.to(2, v3.e.purpose_selected);
        Pair pair4 = TuplesKt.to(3, v3.e.space_selection);
        v3.e eVar = v3.e.space_selected;
        f217464c = MapsKt.mapOf(pair, pair2, pair3, pair4, TuplesKt.to(4, eVar), TuplesKt.to(5, eVar), TuplesKt.to(6, v3.e.personalisation), TuplesKt.to(7, v3.e.onboarding_finished));
        f217465d = 8;
    }

    private t1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B1(int i10, String str, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put(FirebaseAnalytics.d.f120644b0, Integer.valueOf(i10));
        track.put("purpose", str);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C1(String str, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("answer", str);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D1(int i10, String str, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put(FirebaseAnalytics.d.f120644b0, Integer.valueOf(i10));
        track.put("space_type", str);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E1(int i10, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put(TutorialMarkEntry.step, Integer.valueOf(i10));
        track.put("step_name", f217464c.get(Integer.valueOf(i10)));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F1(List list, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            track.put(pair.getFirst(), pair.getSecond());
        }
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.statistics.events.v3
    public void L(final int i10) {
        q1(u3.f217572u4, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.o1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t1.E1(i10, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.v3
    public void N(@NotNull final List<Pair<String, Integer>> styles) {
        Intrinsics.checkNotNullParameter(styles, "styles");
        q1(u3.f217580x4, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.s1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t1.F1(styles, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.v3
    public void a(final int i10, @NotNull final String purpose) {
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        q1(u3.f217582y4, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.p1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t1.B1(i10, purpose, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.v3
    public void h1() {
        w0.s1(this, u3.f217575v4, null, 2, null);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.v3
    public void s(final int i10, @NotNull final String space) {
        Intrinsics.checkNotNullParameter(space, "space");
        q1(u3.f217578w4, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.q1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t1.D1(i10, space, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.v3
    public void y0(@NotNull final String answer) {
        Intrinsics.checkNotNullParameter(answer, "answer");
        q1(u3.A4, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.r1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t1.C1(answer, (Map) obj);
            }
        });
    }
}
