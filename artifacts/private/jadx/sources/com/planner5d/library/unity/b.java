package com.planner5d.library.unity;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f230644a = new b();

    private b() {
    }

    public final float a(@Nullable Float f10) {
        return b(f10, 0.0f);
    }

    public final float b(@Nullable Float f10, float f11) {
        return f10 != null ? f10.floatValue() : f11;
    }

    public final boolean c(@Nullable Float f10) {
        return f10 == null;
    }
}
