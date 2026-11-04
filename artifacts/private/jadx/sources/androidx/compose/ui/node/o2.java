package androidx.compose.ui.node;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nTouchBoundsExpansion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchBoundsExpansion.kt\nandroidx/compose/ui/node/TouchBoundsExpansionKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,249:1\n103#2,4:250\n103#2,4:254\n103#2,4:258\n103#2,4:262\n113#3:266\n113#3:267\n113#3:268\n113#3:269\n*S KotlinDebug\n*F\n+ 1 TouchBoundsExpansion.kt\nandroidx/compose/ui/node/TouchBoundsExpansionKt\n*L\n216#1:250,4\n219#1:254,4\n222#1:258,4\n225#1:262,4\n242#1:266\n243#1:267\n244#1:268\n245#1:269\n*E\n"})
public final class o2 {
    @NotNull
    public static final s a(float f10, float f11, float f12, float f13) {
        return new s(f10, f11, f12, f13, true, null);
    }

    public static /* synthetic */ s b(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = androidx.compose.ui.unit.h.r(0);
        }
        if ((i10 & 2) != 0) {
            f11 = androidx.compose.ui.unit.h.r(0);
        }
        if ((i10 & 4) != 0) {
            f12 = androidx.compose.ui.unit.h.r(0);
        }
        if ((i10 & 8) != 0) {
            f13 = androidx.compose.ui.unit.h.r(0);
        }
        return a(f10, f11, f12, f13);
    }

    public static final long c(int i10, int i11, int i12, int i13) {
        if (!(i10 >= 0 && i10 < 32768)) {
            s0.a.g("Start must be in the range of 0 .. 32767");
        }
        if (!(i11 >= 0 && i11 < 32768)) {
            s0.a.g("Top must be in the range of 0 .. 32767");
        }
        if (!(i12 >= 0 && i12 < 32768)) {
            s0.a.g("End must be in the range of 0 .. 32767");
        }
        if (!(i13 >= 0 && i13 < 32768)) {
            s0.a.g("Bottom must be in the range of 0 .. 32767");
        }
        return n2.e(n2.f39928b.e(i10, i11, i12, i13, true));
    }

    public static /* synthetic */ long d(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = 0;
        }
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = 0;
        }
        return c(i10, i11, i12, i13);
    }
}
