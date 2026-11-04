package androidx.compose.foundation.lazy.layout;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazyLayoutCacheWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutCacheWindow.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutCacheWindowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,119:1\n113#2:120\n*S KotlinDebug\n*F\n+ 1 LazyLayoutCacheWindow.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutCacheWindowKt\n*L\n63#1:120\n*E\n"})
public final class x {
    @androidx.compose.foundation.b2
    @NotNull
    public static final w a(@androidx.annotation.x(from = 0.0d) float f10, @androidx.annotation.x(from = 0.0d) float f11) {
        return new l(f10, f11);
    }

    public static /* synthetic */ w b(float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        return a(f10, f11);
    }

    @androidx.compose.foundation.b2
    @NotNull
    public static final w c(float f10, float f11) {
        return new j(f10, f11, null);
    }

    public static /* synthetic */ w d(float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = androidx.compose.ui.unit.h.r(0);
        }
        if ((i10 & 2) != 0) {
            f11 = androidx.compose.ui.unit.h.r(0);
        }
        return c(f10, f11);
    }
}
