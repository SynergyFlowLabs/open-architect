package com.planner5d.library.model.manager.statistics.events;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class b2 extends w0 implements x3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final b2 f216725b = new b2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f216726c = 0;

    private b2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B1(x3.b bVar, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("source", bVar.name());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C1(x3.c cVar, Long l10, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("method", cVar.name());
        track.put("project_id", l10);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D1(x3.d dVar, boolean z10, Long l10, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("source", dVar != null ? dVar.name() : null);
        track.put("created", Boolean.valueOf(z10));
        track.put("project_id", l10);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E1(String str, x3.e eVar, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("folder", str);
        track.put("source", eVar != null ? eVar.name() : null);
        track.put("archive", Boolean.FALSE);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F1(x3.a aVar, Long l10, p3.b bVar, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put(com.facebook.internal.w0.f100156c1, aVar.name());
        track.put("project_id", l10);
        f216725b.m1(track, bVar, null, false);
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.statistics.events.x3
    public void B(@NotNull final x3.c method, @Nullable final Long l10) {
        Intrinsics.checkNotNullParameter(method, "method");
        q1(u3.V3, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.x1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b2.C1(method, l10, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.x3
    public void M0(@Nullable final String str, @Nullable final x3.e eVar) {
        q1(u3.S3, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.z1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b2.E1(str, eVar, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.x3
    public void c(@Nullable final x3.d dVar, final boolean z10, @Nullable final Long l10) {
        q1(u3.W3, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.w1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b2.D1(dVar, z10, l10, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.x3
    public void c1(@NotNull final x3.b source) {
        Intrinsics.checkNotNullParameter(source, "source");
        q1(u3.U3, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.y1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b2.B1(source, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.x3
    public void u0(@NotNull final x3.a action, @Nullable final p3.b bVar, @Nullable final Long l10) {
        Intrinsics.checkNotNullParameter(action, "action");
        q1(u3.T3, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.a2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b2.F1(action, l10, bVar, (Map) obj);
            }
        });
    }
}
