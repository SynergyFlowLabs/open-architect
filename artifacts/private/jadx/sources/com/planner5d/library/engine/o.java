package com.planner5d.library.engine;

import android.graphics.Bitmap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public interface o extends b {

    public enum a {
        GRID,
        CUBE,
        SPHERE;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f165341e = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f165341e;
        }
    }

    void F0(float f10);

    void L1(@Nullable Bitmap bitmap);

    void T(float f10);

    void c1(@NotNull a aVar);

    void d(float f10);
}
