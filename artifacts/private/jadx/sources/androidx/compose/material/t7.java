package androidx.compose.material;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nElevationOverlay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElevationOverlay.kt\nandroidx/compose/material/ElevationOverlayKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,101:1\n113#2:102\n*S KotlinDebug\n*F\n+ 1 ElevationOverlay.kt\nandroidx/compose/material/ElevationOverlayKt\n*L\n100#1:102\n*E\n"})
public final class t7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.m4<q7> f24987a = androidx.compose.runtime.a1.m(new Function0() { // from class: androidx.compose.material.r7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return t7.d();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.m4<androidx.compose.ui.unit.h> f24988b = androidx.compose.runtime.a1.k(null, new Function0() { // from class: androidx.compose.material.s7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return t7.c();
        }
    }, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.unit.h c() {
        return androidx.compose.ui.unit.h.o(androidx.compose.ui.unit.h.r(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q7 d() {
        return c5.f22302a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p4
    public static final long f(long j10, float f10, androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1613340891, i10, -1, "androidx.compose.material.calculateForegroundColor (ElevationOverlay.kt:85)");
        }
        long jW = androidx.compose.ui.graphics.q0.w(n4.d(j10, c0Var, i10 & 14), ((((float) Math.log(f10 + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jW;
    }

    @NotNull
    public static final androidx.compose.runtime.m4<androidx.compose.ui.unit.h> g() {
        return f24988b;
    }

    @NotNull
    public static final androidx.compose.runtime.m4<q7> h() {
        return f24987a;
    }
}
