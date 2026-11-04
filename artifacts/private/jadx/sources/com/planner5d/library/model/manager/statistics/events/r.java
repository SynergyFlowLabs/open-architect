package com.planner5d.library.model.manager.statistics.events;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class r extends w0 implements l3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final r f217359b = new r();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f217360c = 0;

    private r() {
    }

    private final void A1(u3 u3Var, Long l10, final l3.a aVar, final l3.b bVar) {
        B1(u3Var, l10, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r.E1(aVar, bVar, (Map) obj);
            }
        });
    }

    private final void B1(u3 u3Var, final Long l10, final Function1<? super Map<String, Object>, Unit> function1) {
        q1(u3Var, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r.F1(l10, function1, (Map) obj);
            }
        });
    }

    static /* synthetic */ void C1(r rVar, u3 u3Var, Long l10, l3.a aVar, l3.b bVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            bVar = null;
        }
        rVar.A1(u3Var, l10, aVar, bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void D1(r rVar, u3 u3Var, Long l10, Function1 function1, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        rVar.B1(u3Var, l10, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E1(l3.a aVar, l3.b bVar, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put(com.facebook.internal.w0.f100156c1, aVar.name());
        if (bVar != null) {
            track.put("sources", bVar.name());
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F1(Long l10, Function1 function1, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("contest_id", l10);
        if (function1 != null) {
            function1.invoke(track);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z1(l3.b bVar, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("source", bVar.name());
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.statistics.events.l3
    public void A() {
        w0.s1(this, u3.f217565s, null, 2, null);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.l3
    public void K0() {
        w0.s1(this, u3.f217568t, null, 2, null);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.l3
    public void L0(@Nullable Long l10, @NotNull l3.a action, @Nullable l3.b bVar) {
        Intrinsics.checkNotNullParameter(action, "action");
        A1(u3.Z, l10, action, bVar);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.l3
    public void g(@NotNull final l3.b source) {
        Intrinsics.checkNotNullParameter(source, "source");
        q1(u3.f217573v, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r.z1(source, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.l3
    public void g1() {
        w0.s1(this, u3.f217556p0, null, 2, null);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.l3
    public void j1(@Nullable Long l10, @NotNull l3.a action, @Nullable l3.b bVar) {
        Intrinsics.checkNotNullParameter(action, "action");
        A1(u3.f217557p1, l10, action, bVar);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.l3
    public void r(long j10) {
        D1(this, u3.f217576w, Long.valueOf(j10), null, 4, null);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.l3
    public void x0(@Nullable Long l10) {
        int i10 = 3 ^ 0;
        D1(this, u3.Y, l10, null, 4, null);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.l3
    public void z0(@Nullable Long l10) {
        D1(this, u3.X, l10, null, 4, null);
    }
}
