package com.planner5d.library.model.manager.statistics.events;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class v extends w0 implements n3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final v f217588b = new v();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f217589c = 0;

    private v() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x1(n3.a aVar, n3.c cVar, n3.d dVar, n3.b bVar, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put(com.facebook.internal.w0.f100156c1, aVar);
        track.put("object_type", cVar);
        track.put("number_of_files", 1);
        if (aVar == n3.a.add) {
            track.put("source", dVar);
        }
        if (aVar == n3.a.server_sync) {
            track.put("backend_status", bVar);
        }
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.statistics.events.n3
    public void T0(@Nullable n3.c cVar, @Nullable n3.d dVar) {
        v(n3.a.add, cVar, dVar, null);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.n3
    public void e0(@Nullable n3.c cVar, @Nullable n3.b bVar) {
        v(n3.a.server_sync, cVar, null, bVar);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.n3
    public void i1(@NotNull n3.a action, @Nullable n3.c cVar) {
        Intrinsics.checkNotNullParameter(action, "action");
        v(action, cVar, null, null);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.n3
    public void v(@NotNull final n3.a action, @Nullable final n3.c cVar, @Nullable final n3.d dVar, @Nullable final n3.b bVar) {
        Intrinsics.checkNotNullParameter(action, "action");
        q1(u3.H1, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v.x1(action, cVar, dVar, bVar, (Map) obj);
            }
        });
    }
}
