package androidx.compose.ui.unit;

import androidx.annotation.b1;
import androidx.compose.runtime.k7;
import androidx.compose.runtime.o2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@o2
@b1({b1.a.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nFontScaling.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontScaling.kt\nandroidx/compose/ui/unit/FontScalingLinear\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1#2:74\n*E\n"})
public interface o {

    public static final class a {
        @k7
        public static /* synthetic */ void a() {
        }

        @k7
        @Deprecated
        public static float b(@NotNull o oVar, long j10) {
            return o.super.y(j10);
        }

        @k7
        @Deprecated
        public static long c(@NotNull o oVar, float f10) {
            return o.super.d0(f10);
        }
    }

    @k7
    default long d0(float f10) {
        return a0.l(f10 / m0());
    }

    float m0();

    @k7
    default float y(long j10) {
        if (b0.g(z.m(j10), b0.f42661b.b())) {
            return h.r(z.n(j10) * m0());
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }
}
