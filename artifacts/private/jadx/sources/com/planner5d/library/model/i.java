package com.planner5d.library.model;

import android.os.Bundle;
import androidx.annotation.m1;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.q0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 0)
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f180755b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.builtin.i f180756a;

    @ij.a
    public i(@NotNull com.planner5d.library.model.manager.builtin.i builtInDataManager) {
        Intrinsics.checkNotNullParameter(builtInDataManager, "builtInDataManager");
        this.f180756a = builtInDataManager;
    }

    @m1
    @NotNull
    public final h a(@Nullable Bundle bundle) {
        com.planner5d.library.services.utility.j jVar = new com.planner5d.library.services.utility.j(bundle);
        String strT = jVar.t(com.planner5d.library.services.r.type, "ideas");
        Intrinsics.checkNotNull(strT);
        q0.c cVarValueOf = q0.c.valueOf(strT);
        String strT2 = jVar.t(com.planner5d.library.services.r.id, null);
        String strT3 = jVar.t(com.planner5d.library.services.r.hash, null);
        String strT4 = jVar.t(com.planner5d.library.services.r.uri, null);
        String strT5 = jVar.t(com.planner5d.library.services.r.imageUri, null);
        String strT6 = jVar.t(com.planner5d.library.services.r.title, com.planner5d.library.model.payments.a.f222474i);
        String strT7 = jVar.t(com.planner5d.library.services.r.userName, null);
        String strT8 = jVar.t(com.planner5d.library.services.r.userImage, null);
        long jD = jVar.d(com.planner5d.library.services.r.totalViews, 0L);
        long jD2 = jVar.d(com.planner5d.library.services.r.totalLikes, 0L);
        long jD3 = jVar.d(com.planner5d.library.services.r.totalComments, 0L);
        x[] xVarArrF0 = this.f180756a.f0(jVar.m(com.planner5d.library.services.r.tags, null));
        int[] iArrL = jVar.l(com.planner5d.library.services.r.imageSizes, null);
        if (iArrL == null) {
            iArrL = new int[0];
        }
        return new h(cVarValueOf, strT2, strT3, strT4, strT5, strT6, strT7, strT8, jD, jD2, jD3, xVarArrF0, iArrL, jVar.t(com.planner5d.library.services.r.shotsHash, null), jVar.v(com.planner5d.library.services.r.shotIds, null), jVar.d(com.planner5d.library.services.r.projectId, 0L));
    }
}
