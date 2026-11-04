package com.planner5d.library.model.manager.statistics.events;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class j1 extends w0 implements r3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final j1 f216988b = new j1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f216989c = 0;

    private j1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E1(String str, String str2, String str3, String str4, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("name", str);
        track.put("group", str2);
        track.put("source", str3);
        track.put("value", str4);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F1(String str, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("deeplink", str);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G1(r3.b bVar, r3.a aVar, p3.b bVar2, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("type", bVar.name());
        track.put(com.facebook.internal.w0.f100156c1, aVar.name());
        f216988b.m1(track, bVar2, null, false);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H1(Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("type", "gdpr");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I1(r3.d dVar, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put(com.facebook.internal.w0.f100156c1, dVar.name());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J1(r3.e eVar, r3.h hVar, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put(io.sentry.protocol.e.c.f306223k, eVar.name());
        track.put("name", hVar.name());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K1(r3.f fVar, r3.g gVar, Integer num, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put(com.facebook.internal.w0.f100156c1, fVar.name());
        track.put("source", gVar.name());
        track.put("stars", num);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L1(r3.k kVar, r3.l lVar, r3.j jVar, String str, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("source", kVar != null ? kVar.name() : null);
        track.put("type", lVar.name());
        track.put("method", jVar.name());
        track.put("method_raw", str);
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.statistics.events.r3
    public void H(@NotNull final r3.b type, @NotNull final r3.a action, @NotNull final p3.b state) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(state, "state");
        q1(u3.J3, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.i1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j1.G1(type, action, state, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.r3
    public void I(@NotNull final r3.e orientation, @NotNull final r3.h screen) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(screen, "screen");
        q1(u3.P3, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.g1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j1.J1(orientation, screen, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.r3
    public void K(@Nullable final String str) {
        q1(u3.Q3, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.h1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j1.F1(str, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.r3
    public void M(@Nullable final String str, @Nullable final String str2, @Nullable final String str3, @Nullable final String str4) {
        q1(u3.M3, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.e1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j1.E1(str, str2, str3, str4, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.r3
    public void P(@NotNull final r3.d action) {
        Intrinsics.checkNotNullParameter(action, "action");
        q1(u3.L3, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.b1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j1.I1(action, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.r3
    public void R0(@NotNull p3.b state, @Nullable p3.a aVar) {
        Intrinsics.checkNotNullParameter(state, "state");
        u1(u3.I3, state, aVar);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.r3
    public void c0() {
        q1(u3.G3, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.c1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j1.H1((Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.r3
    public void i0() {
        w0.s1(this, u3.H3, null, 2, null);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.r3
    public void q(@NotNull final r3.f action, @NotNull final r3.g source, int i10, @Nullable final Integer num) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(source, "source");
        q1(u3.N3, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.f1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j1.K1(action, source, num, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.r3
    public void q0(@Nullable final r3.k kVar, @NotNull final r3.l type, @NotNull final r3.j method, @Nullable final String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(method, "method");
        q1(u3.K3, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.d1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j1.L1(kVar, type, method, str, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.r3
    public void s0() {
        w0.s1(this, u3.f217553o, null, 2, null);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.r3
    public void t0() {
        w0.s1(this, u3.F3, null, 2, null);
    }
}
