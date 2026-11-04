package androidx.compose.animation.core;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class x {
    @NotNull
    public static final s a(float f10) {
        return new s(f10);
    }

    @NotNull
    public static final t b(float f10, float f11) {
        return new t(f10, f11);
    }

    @NotNull
    public static final u c(float f10, float f11, float f12) {
        return new u(f10, f11, f12);
    }

    @NotNull
    public static final v d(float f10, float f11, float f12, float f13) {
        return new v(f10, f11, f12, f13);
    }

    @NotNull
    public static final <T extends w> T e(@NotNull T t10) {
        T t11 = (T) g(t10);
        int iB = t11.b();
        for (int i10 = 0; i10 < iB; i10++) {
            t11.e(i10, t10.a(i10));
        }
        return t11;
    }

    public static final <T extends w> void f(@NotNull T t10, @NotNull T t11) {
        int iB = t10.b();
        for (int i10 = 0; i10 < iB; i10++) {
            t10.e(i10, t11.a(i10));
        }
    }

    @NotNull
    public static final <T extends w> T g(@NotNull T t10) {
        T t11 = (T) t10.c();
        Intrinsics.checkNotNull(t11, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        return t11;
    }
}
