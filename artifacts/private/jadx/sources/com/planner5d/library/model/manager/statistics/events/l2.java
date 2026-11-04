package com.planner5d.library.model.manager.statistics.events;

import com.appsflyer.AFInAppEventParameterName;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class l2 extends w0 implements y3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final l2 f217094b = new l2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f217095c = 0;

    private l2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F1(Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("method", "other");
        track.put("type", "catalog");
        track.put("sku", "catalog.24.trial");
        track.put("source", "menu_catalog");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G1(y3.c cVar, String str, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("source", cVar);
        track.put("source_item", str);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H1(y3.d dVar, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("state", dVar.name());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I1(y3.a aVar, y3.e eVar, fd.e eVar2, String str, boolean z10, y3.c cVar, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("method", aVar.name());
        track.put("type", eVar.name());
        track.put("layout", eVar2.n());
        track.put("sku", str);
        track.put("pending", Boolean.valueOf(z10));
        track.put("source", cVar != null ? cVar.name() : null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J1(y3.a aVar, y3.e eVar, String str, y3.b bVar, String str2, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("method", aVar.name());
        track.put("type", eVar.name());
        track.put("sku", str);
        track.put("error", bVar.name());
        track.put("error_raw", str2);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K1(y3.e eVar, String str, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("type", eVar.name());
        track.put("sku", str);
        track.put("tos", Boolean.FALSE);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L1(y3.e eVar, fd.e eVar2, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("type", eVar.name());
        track.put("layout", eVar2.n());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M1(y3.c cVar, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("source", cVar.name());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N1(y3.a aVar, y3.e eVar, fd.e eVar2, String str, boolean z10, y3.c cVar, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("method", aVar.name());
        track.put("type", eVar.name());
        track.put("layout", eVar2.n());
        track.put("sku", str);
        track.put("pending", Boolean.valueOf(z10));
        track.put("source", cVar != null ? cVar.name() : null);
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.statistics.events.y3
    public void C(@NotNull final y3.d stage) {
        Intrinsics.checkNotNullParameter(stage, "stage");
        q1(u3.f217526e4, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.c2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l2.H1(stage, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.y3
    public void P0(@NotNull final y3.a method, @NotNull final y3.e type, @NotNull final fd.e layout, @Nullable final String str, final boolean z10, @Nullable Float f10, @Nullable String str2, @Nullable final y3.c cVar) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(layout, "layout");
        p1(u3.f217522c4, MapsKt.mutableMapOf(TuplesKt.to(AFInAppEventParameterName.REVENUE, f10), TuplesKt.to(AFInAppEventParameterName.CURRENCY, str2)), new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.f2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l2.I1(method, type, layout, str, z10, cVar, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.y3
    public void S0(@NotNull final y3.e type, @NotNull final fd.e layout) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(layout, "layout");
        q1(u3.Y3, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.e2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l2.L1(type, layout, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.y3
    public void f(@NotNull final y3.c source) {
        Intrinsics.checkNotNullParameter(source, "source");
        q1(u3.Z3, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.k2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l2.M1(source, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.y3
    public void j() {
        q1(u3.f217524d4, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.d2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l2.F1((Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.y3
    public void o0(@NotNull final y3.a method, @NotNull final y3.e type, @NotNull final fd.e layout, @Nullable final String str, final boolean z10, @Nullable Float f10, @Nullable String str2, @Nullable final y3.c cVar) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(layout, "layout");
        p1(u3.f217524d4, MapsKt.mutableMapOf(TuplesKt.to(AFInAppEventParameterName.REVENUE, f10), TuplesKt.to(AFInAppEventParameterName.CURRENCY, str2)), new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.j2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l2.N1(method, type, layout, str, z10, cVar, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.y3
    public void t(@NotNull final y3.a method, @NotNull final y3.e type, @Nullable final String str, @NotNull final y3.b error, @Nullable final String str2) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(error, "error");
        q1(u3.f217521b4, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.h2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l2.J1(method, type, str, error, str2, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.y3
    public void u(@Nullable final y3.c cVar, @Nullable final String str) {
        q1(u3.X3, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.g2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l2.G1(cVar, str, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.y3
    public void y(@NotNull final y3.e type, @NotNull final String sku) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(sku, "sku");
        q1(u3.f217520a4, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.i2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l2.K1(type, sku, (Map) obj);
            }
        });
    }
}
