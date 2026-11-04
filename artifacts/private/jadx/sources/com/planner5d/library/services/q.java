package com.planner5d.library.services;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public interface q {

    public static final class a {
        public static /* synthetic */ com.planner5d.library.services.bitmaploader.d.C1663d a(q qVar, String str, int i10, int i11, com.planner5d.library.services.bitmaploader.target.a aVar, long j10, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFromUri");
            }
            if ((i12 & 16) != 0) {
                j10 = 4;
            }
            return qVar.b(str, i10, i11, aVar, j10);
        }
    }

    @Nullable
    com.planner5d.library.services.bitmaploader.d.C1663d a(int i10, @Nullable String str, int i11, int i12, @Nullable com.planner5d.library.services.bitmaploader.target.a aVar, long j10, @Nullable com.planner5d.library.services.bitmaploader.background.postprocess.a aVar2);

    @NotNull
    com.planner5d.library.services.bitmaploader.d.C1663d b(@Nullable String str, int i10, int i11, @Nullable com.planner5d.library.services.bitmaploader.target.a aVar, long j10);
}
