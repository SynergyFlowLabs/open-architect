package androidx.compose.material.ripple;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nRippleAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimationKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,182:1\n149#2:183\n*S KotlinDebug\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimationKt\n*L\n177#1:183\n*E\n"})
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f24810a = androidx.compose.ui.unit.h.r(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f24811b = 75;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f24812c = 225;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f24813d = 150;

    public static final float a(@NotNull androidx.compose.ui.unit.d dVar, boolean z10, long j10) {
        float fM = n0.g.m(n0.h.a(n0.n.t(j10), n0.n.m(j10))) / 2.0f;
        if (z10) {
            fM += dVar.S7(f24810a);
        }
        return fM;
    }

    public static final float b(long j10) {
        return Math.max(n0.n.t(j10), n0.n.m(j10)) * 0.3f;
    }
}
