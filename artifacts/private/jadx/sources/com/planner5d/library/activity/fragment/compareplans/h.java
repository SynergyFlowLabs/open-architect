package com.planner5d.library.activity.fragment.compareplans;

import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.f2;
import com.planner5d.library.model.manager.config.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@w0(parameters = 0)
public final class h extends f2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f131588b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final fg.e<j> f131589a;

    @ij.a
    public h(@NotNull fg.e<j> featureConfigManager) {
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        this.f131589a = featureConfigManager;
    }

    @NotNull
    public final List<g> U() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new g(com.planner5d.library.f.h.f167778s7, com.planner5d.library.f.s.Mx, 0, com.planner5d.library.f.s.rG, com.planner5d.library.f.h.f167911z7, 0, false, 100, null));
        if (this.f131589a.get().a(com.planner5d.library.model.manager.config.f.RendersAi)) {
            arrayList.add(new g(com.planner5d.library.f.h.f167873x7, com.planner5d.library.f.s.Rx, 0, 0, com.planner5d.library.f.h.f167911z7, com.planner5d.library.f.h.C7, false, 76, null));
        }
        g gVar = new g(com.planner5d.library.f.h.f167873x7, com.planner5d.library.f.s.Px, 0, 0, com.planner5d.library.f.h.f167911z7, com.planner5d.library.f.h.C7, false, 76, null);
        g gVar2 = new g(com.planner5d.library.f.h.A7, com.planner5d.library.f.s.Ox, 0, 0, com.planner5d.library.f.h.f167911z7, com.planner5d.library.f.h.C7, true, 12, null);
        g gVar3 = new g(com.planner5d.library.f.h.f167854w7, com.planner5d.library.f.s.cy, com.planner5d.library.f.s.ly, com.planner5d.library.f.s.ny, 0, 0, false, com.planner5d.library.engine.input.f.b.B, null);
        g gVar4 = new g(com.planner5d.library.f.h.f167835v7, com.planner5d.library.f.s.Wx, 0, 0, com.planner5d.library.f.h.f167911z7, com.planner5d.library.f.h.C7, false, 76, null);
        int i10 = com.planner5d.library.f.h.f167873x7;
        int i11 = com.planner5d.library.f.s.Qx;
        int i12 = com.planner5d.library.f.h.C7;
        g gVar5 = new g(i10, i11, 0, 0, i12, i12, false, 76, null);
        int i13 = com.planner5d.library.f.h.f167873x7;
        int i14 = com.planner5d.library.f.s.my;
        int i15 = com.planner5d.library.f.h.C7;
        g gVar6 = new g(i13, i14, 0, 0, i15, i15, false, 76, null);
        int i16 = com.planner5d.library.f.h.B7;
        int i17 = com.planner5d.library.f.s.Sx;
        int i18 = com.planner5d.library.f.h.C7;
        g gVar7 = new g(i16, i17, 0, 0, i18, i18, false, 76, null);
        int i19 = com.planner5d.library.f.h.f167797t7;
        int i20 = com.planner5d.library.f.s.Nx;
        int i21 = com.planner5d.library.f.h.C7;
        g gVar8 = new g(i19, i20, 0, 0, i21, i21, false, 76, null);
        int i22 = com.planner5d.library.f.h.B7;
        int i23 = com.planner5d.library.f.s.ay;
        int i24 = com.planner5d.library.f.h.C7;
        arrayList.addAll(CollectionsKt.listOf((Object[]) new g[]{gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, new g(i22, i23, 0, 0, i24, i24, false, 76, null), new g(com.planner5d.library.f.h.f167892y7, com.planner5d.library.f.s.gy, 0, com.planner5d.library.f.s.ny, com.planner5d.library.f.h.f167911z7, 0, true, 36, null), new g(com.planner5d.library.f.h.f167759r7, com.planner5d.library.f.s.iy, 0, com.planner5d.library.f.s.ny, com.planner5d.library.f.h.f167911z7, 0, true, 36, null), new g(com.planner5d.library.f.h.f167759r7, com.planner5d.library.f.s.oy, 0, com.planner5d.library.f.s.ny, com.planner5d.library.f.h.f167911z7, 0, true, 36, null)}));
        return arrayList;
    }
}
