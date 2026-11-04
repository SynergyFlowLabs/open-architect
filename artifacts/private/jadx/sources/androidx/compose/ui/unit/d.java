package androidx.compose.ui.unit;

import androidx.compose.runtime.k7;
import androidx.compose.runtime.o2;
import com.rabbitmq.client.k0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@o2
@SourceDebugExtension({"SMAP\nDensity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Density.kt\nandroidx/compose/ui/unit/Density\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n1#1,111:1\n26#2:112\n26#2:117\n22#2:128\n53#3,4:113\n123#4:118\n123#4:119\n363#4:120\n33#5:121\n136#5:125\n53#6,3:122\n60#6:127\n70#6:130\n57#7:126\n61#7:129\n*S KotlinDebug\n*F\n+ 1 Density.kt\nandroidx/compose/ui/unit/Density\n*L\n58#1:112\n73#1:117\n106#1:128\n68#1:113,4\n76#1:118\n82#1:119\n96#1:120\n97#1:121\n105#1:125\n97#1:122,3\n106#1:127\n106#1:130\n106#1:126\n106#1:129\n*E\n"})
public interface d extends n {

    public static final class a {
        @k7
        public static /* synthetic */ void a() {
        }

        @k7
        @Deprecated
        public static int b(@NotNull d dVar, long j10) {
            return d.super.c8(j10);
        }

        @k7
        @Deprecated
        public static int c(@NotNull d dVar, float f10) {
            return d.super.g6(f10);
        }

        @k7
        @Deprecated
        public static float d(@NotNull d dVar, long j10) {
            return d.super.y(j10);
        }

        @k7
        @Deprecated
        public static float e(@NotNull d dVar, float f10) {
            return d.super.F3(f10);
        }

        @k7
        @Deprecated
        public static float f(@NotNull d dVar, int i10) {
            return d.super.D3(i10);
        }

        @k7
        @Deprecated
        public static long g(@NotNull d dVar, long j10) {
            return d.super.C0(j10);
        }

        @k7
        @Deprecated
        public static float h(@NotNull d dVar, long j10) {
            return d.super.p6(j10);
        }

        @k7
        @Deprecated
        public static float i(@NotNull d dVar, float f10) {
            return d.super.S7(f10);
        }

        @k7
        @Deprecated
        @NotNull
        public static n0.j j(@NotNull d dVar, @NotNull k kVar) {
            return d.super.N3(kVar);
        }

        @k7
        @Deprecated
        public static long k(@NotNull d dVar, long j10) {
            return d.super.k4(j10);
        }

        @k7
        @Deprecated
        public static long l(@NotNull d dVar, float f10) {
            return d.super.d0(f10);
        }

        @k7
        @Deprecated
        public static long m(@NotNull d dVar, float f10) {
            return d.super.m1(f10);
        }

        @k7
        @Deprecated
        public static long n(@NotNull d dVar, int i10) {
            return d.super.j1(i10);
        }
    }

    @k7
    default long C0(long j10) {
        return j10 != n0.d.f332689d ? i.b(F3(Float.intBitsToFloat((int) (j10 >> 32))), F3(Float.intBitsToFloat((int) (j10 & k0.f265952a)))) : l.f42704b.a();
    }

    @k7
    default float D3(int i10) {
        return h.r(i10 / getDensity());
    }

    @k7
    default float F3(float f10) {
        return h.r(f10 / getDensity());
    }

    @k7
    @NotNull
    default n0.j N3(@NotNull k kVar) {
        return new n0.j(S7(kVar.i()), S7(kVar.m()), S7(kVar.k()), S7(kVar.g()));
    }

    @k7
    default float S7(float f10) {
        return f10 * getDensity();
    }

    @k7
    default int c8(long j10) {
        return Math.round(p6(j10));
    }

    @k7
    default int g6(float f10) {
        float fS7 = S7(f10);
        if (Float.isInfinite(fS7)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fS7);
    }

    float getDensity();

    @k7
    default long j1(int i10) {
        return d0(D3(i10));
    }

    @k7
    default long k4(long j10) {
        if (j10 == n0.d.f332689d) {
            return n0.n.f332724b.a();
        }
        float fS7 = S7(l.p(j10));
        float fS8 = S7(l.m(j10));
        return n0.n.f((((long) Float.floatToRawIntBits(fS7)) << 32) | (((long) Float.floatToRawIntBits(fS8)) & k0.f265952a));
    }

    @k7
    default long m1(float f10) {
        return d0(F3(f10));
    }

    @k7
    default float p6(long j10) {
        if (!b0.g(z.m(j10), b0.f42661b.b())) {
            p.d("Only Sp can convert to Px");
        }
        return S7(y(j10));
    }
}
