package com.planner5d.library.api.support;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.e0;
import okhttp3.x;
import okhttp3.y;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class g {
    @NotNull
    public final y.c a(@NotNull String partName, @NotNull r typedFile) {
        Intrinsics.checkNotNullParameter(partName, "partName");
        Intrinsics.checkNotNullParameter(typedFile, "typedFile");
        return y.c.f334834c.d(partName, typedFile.a().getName(), e0.Companion.a(typedFile.a(), x.f334808e.d(typedFile.b())));
    }

    @NotNull
    public final y.c b(@NotNull String partName, @NotNull String fileName, @NotNull String mimeType, @NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(partName, "partName");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return y.c.f334834c.d(partName, fileName, e0.a.r(e0.Companion, bytes, x.f334808e.d(mimeType), 0, 0, 6, null));
    }
}
