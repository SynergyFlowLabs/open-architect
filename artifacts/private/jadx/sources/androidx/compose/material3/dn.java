package androidx.compose.material3;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nNavigationDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerItemDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1315:1\n113#2:1316\n*S KotlinDebug\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerItemDefaults\n*L\n1188#1:1316\n*E\n"})
public final class dn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final dn f27122a = new dn();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.foundation.layout.g5 f27123b = androidx.compose.foundation.layout.d5.h(androidx.compose.ui.unit.h.r(12), 0.0f, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f27124c = 0;

    private dn() {
    }

    @androidx.compose.runtime.o
    @NotNull
    public final cn a(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long jR = (i11 & 1) != 0 ? o6.r(d0.m1.f268453a.f(), c0Var, 6) : j10;
        long jS = (i11 & 2) != 0 ? androidx.compose.ui.graphics.q0.f38131b.s() : j11;
        long jR2 = (i11 & 4) != 0 ? o6.r(d0.m1.f268453a.e(), c0Var, 6) : j12;
        long jR3 = (i11 & 8) != 0 ? o6.r(d0.m1.f268453a.y(), c0Var, 6) : j13;
        long jR4 = (i11 & 16) != 0 ? o6.r(d0.m1.f268453a.j(), c0Var, 6) : j14;
        long jR5 = (i11 & 32) != 0 ? o6.r(d0.m1.f268453a.z(), c0Var, 6) : j15;
        long j18 = (i11 & 64) != 0 ? jR4 : j16;
        long j19 = (i11 & 128) != 0 ? jR5 : j17;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1574983348, i10, -1, "androidx.compose.material3.NavigationDrawerItemDefaults.colors (NavigationDrawer.kt:1172)");
        }
        rb rbVar = new rb(jR2, jR3, jR4, jR5, jR, jS, j18, j19, null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return rbVar;
    }

    @NotNull
    public final androidx.compose.foundation.layout.g5 b() {
        return f27123b;
    }
}
