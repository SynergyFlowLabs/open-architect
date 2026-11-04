package androidx.compose.material;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nModalBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,590:1\n113#2:591\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetDefaults\n*L\n519#1:591\n*E\n"})
public final class la {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final la f23669a = new la();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f23670b = androidx.compose.ui.unit.h.r(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.animation.core.o<Float> f23671c = androidx.compose.animation.core.p.t(300, 0, androidx.compose.animation.core.u0.d(), 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f23672d = 8;

    private la() {
    }

    @NotNull
    public final androidx.compose.animation.core.o<Float> a() {
        return f23671c;
    }

    public final float b() {
        return f23670b;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getScrimColor")
    public final long c(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-112572414, i10, -1, "androidx.compose.material.ModalBottomSheetDefaults.<get-scrimColor> (ModalBottomSheet.kt:522)");
        }
        long jW = androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0Var, 6).i(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jW;
    }
}
