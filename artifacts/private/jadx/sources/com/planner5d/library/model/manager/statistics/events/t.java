package com.planner5d.library.model.manager.statistics.events;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class t extends w0 implements m3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final t f217459b = new t();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f217460c = 0;

    private t() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x1(m3.a aVar, m3.c cVar, m3.b bVar, m3.d dVar, m3.e eVar, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put(com.facebook.internal.w0.f100156c1, aVar);
        track.put("object_type", cVar);
        if (aVar == m3.a.crop_document) {
            track.put("change_size", bVar);
        }
        if (aVar == m3.a.file_sorting) {
            track.put("sorting_type", dVar != null ? dVar.n() : null);
        }
        if (aVar == m3.a.change_view) {
            track.put(com.facebook.appevents.internal.p.A, eVar);
        }
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.statistics.events.m3
    public void D0(@NotNull final m3.a action, @Nullable final m3.c cVar, @Nullable final m3.e eVar, @Nullable final m3.d dVar, @Nullable final m3.b bVar) {
        Intrinsics.checkNotNullParameter(action, "action");
        q1(u3.f217558p2, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t.x1(action, cVar, bVar, dVar, eVar, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.m3
    public void F(@NotNull m3.d type, boolean z10) {
        Intrinsics.checkNotNullParameter(type, "type");
        D0(m3.a.file_sorting, z10 ? m3.c.folder : m3.c.document, null, type, null);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.m3
    public void H0(@NotNull m3.a action, @Nullable m3.c cVar) {
        Intrinsics.checkNotNullParameter(action, "action");
        int i10 = 0 >> 0;
        D0(action, cVar, null, null, null);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.m3
    public void p0(boolean z10, boolean z11) {
        D0(m3.a.change_view, z11 ? m3.c.folder : m3.c.document, z10 ? m3.e.list : m3.e.icons, null, null);
    }
}
