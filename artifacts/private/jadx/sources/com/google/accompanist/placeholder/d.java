package com.google.accompanist.placeholder;

import androidx.annotation.x;
import androidx.compose.animation.core.g1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class d {
    @l(message = "\naccompanist/placeholder is deprecated and the API is no longer maintained. \nWe recommend forking the implementation and customising it to your needs. \nFor more information please visit https://google.github.io/accompanist/placeholder\n")
    @NotNull
    public static final c a(@NotNull c.a fade, long j10, @NotNull g1<Float> animationSpec) {
        Intrinsics.checkNotNullParameter(fade, "$this$fade");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return new a(j10, animationSpec, null);
    }

    public static /* synthetic */ c b(c.a aVar, long j10, g1 g1Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            g1Var = b.f103137a.a();
        }
        return a(aVar, j10, g1Var);
    }

    @l(message = "\naccompanist/placeholder is deprecated and the API is no longer maintained. \nWe recommend forking the implementation and customising it to your needs. \nFor more information please visit https://google.github.io/accompanist/placeholder\n")
    @NotNull
    public static final c c(@NotNull c.a shimmer, long j10, @NotNull g1<Float> animationSpec, @x(from = 0.0d, to = 1.0d) float f10) {
        Intrinsics.checkNotNullParameter(shimmer, "$this$shimmer");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return new g(j10, animationSpec, f10, null);
    }

    public static /* synthetic */ c d(c.a aVar, long j10, g1 g1Var, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            g1Var = b.f103137a.b();
        }
        if ((i10 & 4) != 0) {
            f10 = 0.6f;
        }
        return c(aVar, j10, g1Var, f10);
    }
}
