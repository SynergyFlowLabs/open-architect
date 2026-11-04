package com.planner5d.library.model.manager.statistics.events;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nDefaultStatisticsEventFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultStatisticsEventFactory.kt\ncom/planner5d/library/model/manager/statistics/events/DefaultStatisticsEventFactory\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,47:1\n216#2,2:48\n*S KotlinDebug\n*F\n+ 1 DefaultStatisticsEventFactory.kt\ncom/planner5d/library/model/manager/statistics/events/DefaultStatisticsEventFactory\n*L\n23#1:48,2\n*E\n"})
public class w0 implements p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f217639a = 0;

    public static /* synthetic */ void n1(w0 w0Var, Map map, p3.b bVar, p3.a aVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: putForm");
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        w0Var.m1(map, bVar, aVar, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void r1(w0 w0Var, u3 u3Var, Map map, Function1 function1, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: track");
        }
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        w0Var.p1(u3Var, map, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void s1(w0 w0Var, u3 u3Var, Function1 function1, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: track");
        }
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        w0Var.q1(u3Var, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t1(Map map, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        for (Map.Entry entry : map.entrySet()) {
            track.put((String) entry.getKey(), entry.getValue());
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v1(w0 w0Var, p3.b bVar, p3.a aVar, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        n1(w0Var, track, bVar, aVar, false, 4, null);
        return Unit.f312394a;
    }

    protected final void m1(@NotNull Map<String, Object> map, @Nullable p3.b bVar, @Nullable p3.a aVar, boolean z10) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (bVar != null) {
            map.put("state", bVar.name());
            if (z10) {
                map.put("error", aVar);
            }
        }
    }

    protected final void o1(@NotNull u3 name, @Nullable Map<String, ? extends Object> map, @NotNull final Map<String, ? extends Object> parameters) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        p1(name, map, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.v0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w0.t1(parameters, (Map) obj);
            }
        });
    }

    protected final void p1(@NotNull u3 name, @Nullable Map<String, ? extends Object> map, @Nullable Function1<? super Map<String, Object>, Unit> function1) {
        Intrinsics.checkNotNullParameter(name, "name");
        com.planner5d.library.model.manager.statistics.b0 b0VarW1 = com.planner5d.library.application.b.f142455c.a().W1();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (function1 != null) {
            function1.invoke(linkedHashMap);
        }
        Unit unit = Unit.f312394a;
        b0VarW1.d(new h3(name, linkedHashMap, map));
    }

    protected final void q1(@NotNull u3 name, @Nullable Function1<? super Map<String, Object>, Unit> function1) {
        Intrinsics.checkNotNullParameter(name, "name");
        p1(name, null, function1);
    }

    protected final void u1(@NotNull u3 name, @NotNull final p3.b state, @Nullable final p3.a aVar) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(state, "state");
        q1(name, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.u0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w0.v1(this.f217510a, state, aVar, (Map) obj);
            }
        });
    }
}
