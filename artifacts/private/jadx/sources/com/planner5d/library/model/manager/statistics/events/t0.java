package com.planner5d.library.model.manager.statistics.events;

import com.google.firebase.analytics.FirebaseAnalytics;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.sentry.n7;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nDefaultStatisticsEventEditor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultStatisticsEventEditor.kt\ncom/planner5d/library/model/manager/statistics/events/DefaultStatisticsEventEditor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,223:1\n1#2:224\n*E\n"})
public final class t0 extends w0 implements o3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final t0 f217461b = new t0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f217462c = 0;

    private t0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T1(boolean z10, o3.c cVar, Long l10, Long l11, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("read_only", Boolean.valueOf(z10));
        track.put("type", cVar.name());
        track.put("id", l10);
        track.put("project_id", l11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U1(o3.a aVar, Long l10, o3.d dVar, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put(com.facebook.internal.w0.f100156c1, aVar.name());
        track.put("project_id", l10);
        if (dVar != null) {
            track.put("file_type", dVar);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V1(Long l10, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("project_id", l10);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W1(long j10, o3.b bVar, o3.f fVar, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("category", String.valueOf(j10));
        track.put("category_type", bVar.name());
        if (fVar != null) {
            track.put("furniture_source", fVar.name());
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X1(String str, int i10, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put(FirebaseAnalytics.c.f120629o, str);
        track.put("total", Integer.valueOf(i10));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y1(Long l10, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("project_id", l10);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z1(boolean z10, o3.c cVar, Long l10, Long l11, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("read_only", Boolean.valueOf(z10));
        track.put(com.facebook.internal.w0.f100156c1, MetricTracker.Action.CLOSED);
        track.put("type", cVar.name());
        track.put("id", l10);
        track.put("project_id", l11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a2(Long l10, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("project_id", l10);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b2(o3.e eVar, Long l10, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put(com.facebook.internal.w0.f100156c1, eVar.name());
        track.put("project_id", l10);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c2(Long l10, o3.i iVar, String str, o3.g gVar, o3.f fVar, Long l11, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("category", l10);
        track.put("type", iVar.name());
        track.put("item", str);
        track.put("source", gVar.name());
        if (fVar != null) {
            track.put("furniture_source", fVar.name());
        }
        track.put("project_id", l11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d2(o3.i iVar, String str, int i10, boolean z10, boolean z11, Long l10, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("type", iVar.name());
        track.put("item", str);
        track.put("materials", Integer.valueOf(i10));
        track.put("size", Boolean.valueOf(z10));
        track.put("position", Boolean.valueOf(z11));
        track.put("project_id", l10);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e2(o3.i iVar, String str, boolean z10, String str2, String str3, boolean z11, boolean z12, Long l10, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("type", iVar.name());
        track.put("item", str);
        track.put("color", Boolean.valueOf(z10));
        track.put("texture", str2 + ":" + str3);
        track.put("texture_rotation", Boolean.valueOf(z11));
        track.put("texture_scale", Boolean.valueOf(z12));
        track.put("project_id", l10);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f2(int i10, boolean z10, boolean z11, Integer num, Integer num2, boolean z12, boolean z13, boolean z14, Long l10, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("materials", Integer.valueOf(i10));
        track.put("walls_height", Boolean.valueOf(z10));
        track.put("walls_thickness", Boolean.valueOf(z11));
        track.put("room_type", num + ":" + num2);
        track.put("room_title", Boolean.valueOf(z12));
        track.put("room_ceiling", Boolean.valueOf(z13));
        track.put("room_flooring", Boolean.valueOf(z14));
        track.put("project_id", l10);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g2(int i10, boolean z10, boolean z11, Long l10, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("materials", Integer.valueOf(i10));
        track.put("thickness", Boolean.valueOf(z10));
        track.put(n7.b.f305917e, Boolean.valueOf(z11));
        track.put("project_id", l10);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h2(o3.i iVar, String str, Long l10, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("type", iVar.name());
        track.put("item", str);
        track.put("project_id", l10);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i2(o3.i iVar, String str, o3.h hVar, Long l10, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("type", iVar.name());
        track.put("item", str);
        track.put(com.facebook.internal.w0.f100156c1, hVar.name());
        track.put("project_id", l10);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j2(o3.i iVar, String str, boolean z10, Long l10, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("type", iVar.name());
        track.put("item", str);
        track.put("changed", Boolean.valueOf(z10));
        track.put("project_id", l10);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k2(o3.i iVar, String str, Long l10, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("type", iVar.name());
        track.put("item", str);
        track.put("project_id", l10);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l2(o3.j jVar, Long l10, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("mode_new", jVar != null ? jVar.name() : null);
        track.put("project_id", l10);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m2(Long l10, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("project_id", l10);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n2(o3.k kVar, Long l10, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("setting", kVar.name());
        track.put("project_id", l10);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o2(Long l10, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("project_id", l10);
        return Unit.f312394a;
    }

    private final void p2(u3 u3Var, final o3.j jVar, final Function1<? super Map<String, Object>, Unit> function1) {
        q1(u3Var, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.o0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.r2(jVar, function1, (Map) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void q2(t0 t0Var, u3 u3Var, o3.j jVar, Function1 function1, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        t0Var.p2(u3Var, jVar, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r2(o3.j jVar, Function1 function1, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("mode", jVar != null ? jVar.name() : null);
        if (function1 != null) {
            function1.invoke(track);
        }
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.statistics.events.o3
    public void B0(@Nullable o3.j jVar, @NotNull final o3.e action, @Nullable final Long l10) {
        Intrinsics.checkNotNullParameter(action, "action");
        p2(u3.f217563r3, jVar, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.b2(action, l10, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.o3
    public void D(@Nullable o3.j jVar, final long j10, @NotNull final o3.b type, @Nullable final o3.f fVar) {
        Intrinsics.checkNotNullParameter(type, "type");
        p2(u3.C3, jVar, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.c0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.W1(j10, type, fVar, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.o3
    public void G(@Nullable o3.j jVar, @NotNull final o3.i type, @Nullable final String str, final boolean z10, @Nullable final String str2, @Nullable final String str3, final boolean z11, final boolean z12, @Nullable final Long l10) {
        Intrinsics.checkNotNullParameter(type, "type");
        p2(u3.f217577w3, jVar, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.e2(type, str, z10, str2, str3, z11, z12, l10, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.o3
    public void G0() {
        w0.s1(this, u3.f217542k3, null, 2, null);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.o3
    public void I0(@Nullable o3.j jVar, @NotNull final String search, final int i10) {
        Intrinsics.checkNotNullParameter(search, "search");
        p2(u3.D3, jVar, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.X1(search, i10, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.o3
    public void N0() {
        w0.s1(this, u3.f217545l3, null, 2, null);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.o3
    public void O(@Nullable o3.j jVar, @NotNull final o3.i type, @Nullable final String str, @Nullable final Long l10) {
        Intrinsics.checkNotNullParameter(type, "type");
        p2(u3.A3, jVar, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.k2(type, str, l10, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.o3
    public void Q(@Nullable o3.j jVar, @NotNull final o3.i type, @Nullable final String str, final int i10, final boolean z10, final boolean z11, @Nullable final Long l10) {
        Intrinsics.checkNotNullParameter(type, "type");
        p2(u3.f217574v3, jVar, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.e0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.d2(type, str, i10, z10, z11, l10, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.o3
    public void Q0() {
        w0.s1(this, u3.f217539j3, null, 2, null);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.o3
    public void T(@Nullable o3.j jVar, @Nullable final Long l10) {
        p2(u3.B3, jVar, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.s0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.V1(l10, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.o3
    public void U(@Nullable o3.j jVar, final int i10, final boolean z10, final boolean z11, @Nullable final Long l10) {
        p2(u3.f217581y3, jVar, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.q0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.g2(i10, z10, z11, l10, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.o3
    public void U0(@Nullable o3.j jVar, @NotNull final o3.k setting, @Nullable final Long l10) {
        Intrinsics.checkNotNullParameter(setting, "setting");
        p2(u3.f217548m3, jVar, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.n2(setting, l10, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.o3
    public void V0(@Nullable o3.j jVar, @Nullable final Long l10) {
        p2(u3.f217536i3, jVar, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.m2(l10, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.o3
    public void X(@Nullable o3.j jVar, @NotNull final o3.i type, @Nullable final String str, @NotNull final o3.h action, @Nullable final Long l10) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(action, "action");
        p2(u3.f217571u3, jVar, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.i2(type, str, action, l10, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.o3
    public void a0(@Nullable o3.j jVar, @Nullable final Long l10) {
        p2(u3.f217561q3, jVar, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.a2(l10, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.o3
    public void d0(@Nullable o3.j jVar, final boolean z10, @NotNull final o3.c type, @Nullable final Long l10, @Nullable final Long l11) {
        Intrinsics.checkNotNullParameter(type, "type");
        p2(u3.f217533h3, jVar, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.i0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.Z1(z10, type, l10, l11, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.o3
    public void g0(@Nullable o3.j jVar, final boolean z10, @NotNull final o3.c type, @Nullable final Long l10, @Nullable final Long l11) {
        Intrinsics.checkNotNullParameter(type, "type");
        p2(u3.f217530g3, jVar, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.h0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.T1(z10, type, l10, l11, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.o3
    public void h0(@Nullable o3.j jVar, @NotNull final o3.i type, @Nullable final String str, @Nullable final Long l10) {
        Intrinsics.checkNotNullParameter(type, "type");
        p2(u3.f217566s3, jVar, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.d0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.h2(type, str, l10, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.o3
    public void j0(@Nullable o3.j jVar, final int i10, final boolean z10, final boolean z11, @Nullable final Integer num, @Nullable final Integer num2, final boolean z12, final boolean z13, final boolean z14, @Nullable final Long l10) {
        p2(u3.f217579x3, jVar, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.b0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.f2(i10, z10, z11, num, num2, z12, z13, z14, l10, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.o3
    public void k(@Nullable o3.j jVar, @Nullable final Long l10) {
        p2(u3.E3, jVar, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.f0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.Y1(l10, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.o3
    public void m0(@Nullable o3.j jVar, @Nullable final o3.j jVar2, @Nullable final Long l10) {
        p2(u3.f217559p3, jVar, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.r0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.l2(jVar2, l10, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.o3
    public void n(@Nullable o3.j jVar, @Nullable final Long l10) {
        p2(u3.f217551n3, jVar, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.o2(l10, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.o3
    public void p(@Nullable o3.j jVar, @NotNull final o3.a action, @Nullable final Long l10, @Nullable final o3.d dVar) {
        Intrinsics.checkNotNullParameter(action, "action");
        p2(u3.f217554o3, jVar, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.g0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.U1(action, l10, dVar, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.o3
    public void w(@Nullable o3.j jVar, @NotNull final o3.i type, @Nullable final String str, @Nullable final Long l10, @NotNull final o3.g source, @Nullable final o3.f fVar, @Nullable final Long l11) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(source, "source");
        p2(u3.f217583z3, jVar, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.c2(l10, type, str, source, fVar, l11, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.o3
    public void x(@Nullable o3.j jVar, @NotNull final o3.i type, @Nullable final String str, final boolean z10, @Nullable final Long l10) {
        Intrinsics.checkNotNullParameter(type, "type");
        p2(u3.f217569t3, jVar, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.j2(type, str, z10, l10, (Map) obj);
            }
        });
    }
}
