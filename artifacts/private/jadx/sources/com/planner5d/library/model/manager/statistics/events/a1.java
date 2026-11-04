package com.planner5d.library.model.manager.statistics.events;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class a1 extends w0 implements q3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a1 f216679b = new a1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f216680c = 0;

    private a1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A1(q3.a aVar, q3.b bVar, Integer num, q3.d dVar, String str, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put(com.facebook.internal.w0.f100156c1, aVar.name());
        track.put("category_type", bVar != null ? bVar.name() : null);
        track.put("name", String.valueOf(num));
        track.put("source", dVar != null ? dVar.name() : null);
        if (aVar == q3.a.share) {
            track.put("method", str);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B1(Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put(com.facebook.internal.w0.f100156c1, "open");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z1(q3.a aVar, q3.b bVar, q3.d dVar, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put(com.facebook.internal.w0.f100156c1, aVar.name());
        track.put("category_type", bVar.name());
        track.put("source", dVar != null ? dVar.name() : null);
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.statistics.events.q3
    @Nullable
    public q3.b A0(@Nullable Integer num) {
        for (q3.b bVar : q3.b.values()) {
            int iN = bVar.n();
            if (num != null && iN == num.intValue()) {
                return bVar;
            }
        }
        return null;
    }

    @Override // com.planner5d.library.model.manager.statistics.events.q3
    public void Y0() {
        q1(u3.D4, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.y0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return a1.B1((Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.q3
    public void d1(@NotNull final q3.a action, @Nullable final q3.b bVar, @Nullable final Integer num, @Nullable final q3.d dVar, @Nullable final String str) {
        Intrinsics.checkNotNullParameter(action, "action");
        q1(u3.B4, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.x0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return a1.A1(action, bVar, num, dVar, str, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.q3
    public void e1(@NotNull final q3.a action, @NotNull final q3.b categoryType, @Nullable final q3.d dVar) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(categoryType, "categoryType");
        q1(u3.C4, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.z0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return a1.z1(action, categoryType, dVar, (Map) obj);
            }
        });
    }
}
