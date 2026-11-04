package androidx.compose.foundation.shape;

import androidx.annotation.g0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAbsoluteRoundedCornerShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbsoluteRoundedCornerShape.kt\nandroidx/compose/foundation/shape/AbsoluteRoundedCornerShapeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,197:1\n113#2:198\n113#2:199\n113#2:200\n113#2:201\n*S KotlinDebug\n*F\n+ 1 AbsoluteRoundedCornerShape.kt\nandroidx/compose/foundation/shape/AbsoluteRoundedCornerShapeKt\n*L\n147#1:198\n148#1:199\n149#1:200\n150#1:201\n*E\n"})
public final class d {
    @NotNull
    public static final c a(float f10) {
        return e(g.a(f10));
    }

    @NotNull
    public static final c b(float f10, float f11, float f12, float f13) {
        return new c(g.a(f10), g.a(f11), g.a(f12), g.a(f13));
    }

    @NotNull
    public static final c c(int i10) {
        return e(g.b(i10));
    }

    @NotNull
    public static final c d(@g0(from = 0, to = 100) int i10, @g0(from = 0, to = 100) int i11, @g0(from = 0, to = 100) int i12, @g0(from = 0, to = 100) int i13) {
        return new c(g.b(i10), g.b(i11), g.b(i12), g.b(i13));
    }

    @NotNull
    public static final c e(@NotNull f fVar) {
        return new c(fVar, fVar, fVar, fVar);
    }

    public static /* synthetic */ c f(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        if ((i10 & 8) != 0) {
            f13 = 0.0f;
        }
        return b(f10, f11, f12, f13);
    }

    public static /* synthetic */ c g(int i10, int i11, int i12, int i13, int i14, Object obj) {
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
        return d(i10, i11, i12, i13);
    }

    @NotNull
    public static final c h(float f10) {
        return e(g.c(f10));
    }

    @NotNull
    public static final c i(float f10, float f11, float f12, float f13) {
        return new c(g.c(f10), g.c(f11), g.c(f12), g.c(f13));
    }

    public static /* synthetic */ c j(float f10, float f11, float f12, float f13, int i10, Object obj) {
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
        return i(f10, f11, f12, f13);
    }
}
