package com.planner5d.library.model.editorcollection;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 1)
public final class b implements a<com.planner5d.library.model.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f180684a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f180685b = 0;

    private b() {
    }

    @Override // com.planner5d.library.model.editorcollection.a
    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.b b(@NotNull g.b value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.b() == g.c.Color) {
            return new com.planner5d.library.model.b(Integer.parseInt(value.a()));
        }
        return null;
    }

    @NotNull
    public final g.b d(int i10) {
        return a(new com.planner5d.library.model.b(i10));
    }

    @Override // com.planner5d.library.model.editorcollection.a
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public g.b a(@NotNull com.planner5d.library.model.b value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new g.b(g.c.Color, String.valueOf(value.a()));
    }
}
