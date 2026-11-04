package androidx.compose.ui.platform;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nViewConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewConfiguration.kt\nandroidx/compose/ui/platform/ViewConfiguration\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,73:1\n113#2:74\n*S KotlinDebug\n*F\n+ 1 ViewConfiguration.kt\nandroidx/compose/ui/platform/ViewConfiguration\n*L\n54#1:74\n*E\n"})
public interface o4 {

    public static final class a {
        @Deprecated
        public static float a(@NotNull o4 o4Var) {
            return o4.super.h();
        }

        @Deprecated
        public static float b(@NotNull o4 o4Var) {
            return o4.super.b();
        }

        @Deprecated
        public static float c(@NotNull o4 o4Var) {
            return o4.super.m();
        }

        @Deprecated
        public static float d(@NotNull o4 o4Var) {
            return o4.super.k();
        }

        @Deprecated
        public static long e(@NotNull o4 o4Var) {
            return o4.super.l();
        }
    }

    long a();

    default float b() {
        return 2.0f;
    }

    float g();

    default float h() {
        return 16.0f;
    }

    long i();

    long j();

    default float k() {
        return 0.0f;
    }

    default long l() {
        float f10 = 48;
        return androidx.compose.ui.unit.i.b(androidx.compose.ui.unit.h.r(f10), androidx.compose.ui.unit.h.r(f10));
    }

    default float m() {
        return Float.MAX_VALUE;
    }
}
