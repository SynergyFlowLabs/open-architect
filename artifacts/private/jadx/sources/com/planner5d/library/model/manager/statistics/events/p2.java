package com.planner5d.library.model.manager.statistics.events;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class p2 extends w0 implements a4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final p2 f217307b = new p2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f217308c = 0;

    private p2() {
    }

    private final void x1(final a4.f fVar, final a4.e eVar, final a4.a aVar, final a4.c cVar, final String str, final String str2, final Long l10, final boolean z10, final boolean z11, final boolean z12, final a4.d dVar) {
        q1(u3.M4, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.o2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p2.z1(fVar, eVar, aVar, cVar, l10, z10, dVar, str, z11, z12, str2, (Map) obj);
            }
        });
    }

    static /* synthetic */ void y1(p2 p2Var, a4.f fVar, a4.e eVar, a4.a aVar, a4.c cVar, String str, String str2, Long l10, boolean z10, boolean z11, boolean z12, a4.d dVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            cVar = null;
        }
        if ((i10 & 16) != 0) {
            str = null;
        }
        if ((i10 & 32) != 0) {
            str2 = null;
        }
        if ((i10 & 64) != 0) {
            l10 = null;
        }
        if ((i10 & 128) != 0) {
            z10 = false;
        }
        if ((i10 & 256) != 0) {
            z11 = false;
        }
        if ((i10 & 512) != 0) {
            z12 = false;
        }
        if ((i10 & 1024) != 0) {
            dVar = a4.d.no;
        }
        p2Var.x1(fVar, eVar, aVar, cVar, str, str2, l10, z10, z11, z12, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z1(a4.f fVar, a4.e eVar, a4.a aVar, a4.c cVar, Long l10, boolean z10, a4.d dVar, String str, boolean z11, boolean z12, String str2, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("step_room_wizard", fVar.name());
        track.put("source", eVar.name());
        track.put(com.facebook.internal.w0.f100156c1, aVar.name());
        track.put(com.facebook.internal.w0.P0, cVar != null ? cVar.name() : null);
        track.put("room_type", l10);
        track.put("change_shape", Boolean.valueOf(z10));
        track.put("flip", dVar.name());
        track.put("room_shape", str);
        track.put("change_dimension_slider", Boolean.valueOf(z11));
        track.put("change_dimension_input", Boolean.valueOf(z12));
        track.put("room_style", str2);
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.statistics.events.a4
    public void E(@NotNull a4.e source, @NotNull a4.a action, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(action, "action");
        y1(this, a4.f.room_wizard_dimensions, source, action, null, null, null, null, false, z10, z11, null, 1272, null);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.a4
    public void b0(@NotNull a4.e source) {
        Intrinsics.checkNotNullParameter(source, "source");
        y1(this, a4.f.room_wizard_style, source, a4.a.rearrange_furniture, null, null, null, null, false, false, false, null, 2040, null);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.a4
    public void b1(@NotNull a4.e source, @NotNull a4.a action, @Nullable String str) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(action, "action");
        y1(this, a4.f.room_wizard_style, source, action, null, null, str, null, false, false, false, null, 2008, null);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.a4
    public void d(@NotNull a4.e source, @NotNull a4.a action, @Nullable Long l10) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(action, "action");
        y1(this, a4.f.room_wizard_type, source, action, null, null, null, l10, false, false, false, null, 1976, null);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.a4
    public void e(@NotNull a4.f step, @NotNull a4.e source) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(source, "source");
        y1(this, step, source, a4.a.open, null, null, null, null, false, false, false, null, 2040, null);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.a4
    public void l(@NotNull a4.e source, @NotNull a4.a action, @NotNull a4.d flip, boolean z10, @Nullable String str) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(flip, "flip");
        y1(this, a4.f.room_wizard_shape, source, action, null, str, null, null, z10, false, false, flip, 872, null);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.a4
    public void o(@NotNull a4.e source) {
        Intrinsics.checkNotNullParameter(source, "source");
        y1(this, a4.f.room_wizard_style, source, a4.a.furniture_arranged, null, null, null, null, false, false, false, null, 2040, null);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.a4
    public void w0(@NotNull a4.f step, @NotNull a4.e source, @NotNull a4.c errorType) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        y1(this, step, source, a4.a.error, errorType, null, null, null, false, false, false, null, 2032, null);
    }
}
