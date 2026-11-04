package com.planner5d.library.model.manager.statistics.events;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class n extends w0 implements k3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final n f217157b = new n();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f217158c = 0;

    private n() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D1(k3.a aVar, k3.e eVar, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("form", aVar.name());
        track.put("source", eVar.name());
        return Unit.f312394a;
    }

    private final void H1(final k3.e eVar, final k3.c cVar, final k3.b bVar) {
        q1(u3.f217529g, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.K1(eVar, bVar, cVar, (Map) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K1(k3.e eVar, k3.b bVar, k3.c cVar, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("source", eVar != null ? eVar.name() : null);
        track.put("automatic", Boolean.FALSE);
        track.put("mailing", bVar != null ? bVar.name() : null);
        track.put("method", cVar.name());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N1(k3.a aVar, p3.b bVar, p3.a aVar2, k3.c cVar, boolean z10, boolean z11, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("form", aVar.name());
        w0.n1(f217157b, track, bVar, aVar2, false, 4, null);
        track.put("method", cVar.name());
        track.put("first_time", Boolean.valueOf(z10));
        track.put("automatic", Boolean.valueOf(z11));
        return Unit.f312394a;
    }

    private final k3.b O1(boolean z10) {
        return z10 ? k3.b.true_sign_up_screen : k3.b.not_agree;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q1(k3.d dVar, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("source", dVar.name());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S1(k3.e eVar, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("source", eVar.name());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U1(k3.e eVar, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("source", eVar.name());
        return Unit.f312394a;
    }

    public final void C1(@NotNull final k3.a form, @NotNull final k3.e source) {
        Intrinsics.checkNotNullParameter(form, "form");
        Intrinsics.checkNotNullParameter(source, "source");
        q1(u3.f217527f, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.D1(form, source, (Map) obj);
            }
        });
    }

    public final void E1() {
        w0.s1(this, u3.f217538j, null, 2, null);
    }

    public final void F1(@NotNull p3.b state, @Nullable p3.a aVar) {
        Intrinsics.checkNotNullParameter(state, "state");
        u1(u3.f217541k, state, aVar);
    }

    public final void G1(@Nullable k3.e eVar, @NotNull k3.c method) {
        Intrinsics.checkNotNullParameter(method, "method");
        H1(eVar, method, k3.b.none);
    }

    public final void I1(@Nullable k3.e eVar, @NotNull k3.c method, boolean z10) {
        Intrinsics.checkNotNullParameter(method, "method");
        H1(eVar, method, O1(z10));
    }

    public final void J1(boolean z10, @NotNull k3.c method) {
        Intrinsics.checkNotNullParameter(method, "method");
        H1(z10 ? k3.e.sign_up : k3.e.sign_in, method, k3.b.none);
    }

    public final void L1(@NotNull final k3.a form, @NotNull final p3.b state, @Nullable final p3.a aVar, @NotNull final k3.c method, final boolean z10, final boolean z11) {
        Intrinsics.checkNotNullParameter(form, "form");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(method, "method");
        q1(u3.f217532h, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.N1(form, state, aVar, method, z10, z11, (Map) obj);
            }
        });
    }

    public final void M1(boolean z10, @Nullable p3.a aVar, @NotNull k3.c method, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(method, "method");
        L1(z10 ? k3.a.sign_up : k3.a.sign_in, aVar == null ? p3.b.success : p3.b.error, aVar, method, z11, z12);
    }

    public final void P1(@NotNull final k3.d source) {
        Intrinsics.checkNotNullParameter(source, "source");
        q1(u3.f217550n, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.Q1(source, (Map) obj);
            }
        });
    }

    public final void R1(@NotNull final k3.e source) {
        Intrinsics.checkNotNullParameter(source, "source");
        q1(u3.f217544l, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.S1(source, (Map) obj);
            }
        });
    }

    public final void T1(@NotNull final k3.e source) {
        Intrinsics.checkNotNullParameter(source, "source");
        q1(u3.f217547m, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.U1(source, (Map) obj);
            }
        });
    }
}
