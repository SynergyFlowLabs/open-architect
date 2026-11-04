package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.k7;
import androidx.compose.ui.platform.o4;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.coroutines.i
public interface c extends androidx.compose.ui.unit.d {

    public static final class a {
        @Deprecated
        public static long b(@NotNull c cVar) {
            return c.super.i0();
        }

        @k7
        @Deprecated
        public static int c(@NotNull c cVar, long j10) {
            return c.super.c8(j10);
        }

        @k7
        @Deprecated
        public static int d(@NotNull c cVar, float f10) {
            return c.super.g6(f10);
        }

        @k7
        @Deprecated
        public static float e(@NotNull c cVar, long j10) {
            return c.super.y(j10);
        }

        @k7
        @Deprecated
        public static float f(@NotNull c cVar, float f10) {
            return c.super.F3(f10);
        }

        @k7
        @Deprecated
        public static float g(@NotNull c cVar, int i10) {
            return c.super.D3(i10);
        }

        @k7
        @Deprecated
        public static long h(@NotNull c cVar, long j10) {
            return c.super.C0(j10);
        }

        @k7
        @Deprecated
        public static float i(@NotNull c cVar, long j10) {
            return c.super.p6(j10);
        }

        @k7
        @Deprecated
        public static float j(@NotNull c cVar, float f10) {
            return c.super.S7(f10);
        }

        @k7
        @Deprecated
        @NotNull
        public static n0.j k(@NotNull c cVar, @NotNull androidx.compose.ui.unit.k kVar) {
            return c.super.N3(kVar);
        }

        @k7
        @Deprecated
        public static long l(@NotNull c cVar, long j10) {
            return c.super.k4(j10);
        }

        @k7
        @Deprecated
        public static long m(@NotNull c cVar, float f10) {
            return c.super.d0(f10);
        }

        @k7
        @Deprecated
        public static long n(@NotNull c cVar, float f10) {
            return c.super.m1(f10);
        }

        @k7
        @Deprecated
        public static long o(@NotNull c cVar, int i10) {
            return c.super.j1(i10);
        }

        @Deprecated
        @Nullable
        public static <T> Object p(@NotNull c cVar, long j10, @NotNull Function2<? super c, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super T> dVar) {
            return c.super.Y1(j10, function2, dVar);
        }

        @Deprecated
        @Nullable
        public static <T> Object q(@NotNull c cVar, long j10, @NotNull Function2<? super c, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super T> dVar) {
            return c.super.q5(j10, function2, dVar);
        }
    }

    static /* synthetic */ <T> Object Y0(c cVar, long j10, Function2<? super c, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, kotlin.coroutines.d<? super T> dVar) {
        return function2.invoke(cVar, dVar);
    }

    static /* synthetic */ Object d1(c cVar, s sVar, kotlin.coroutines.d dVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
        }
        if ((i10 & 1) != 0) {
            sVar = s.Main;
        }
        return cVar.I6(sVar, dVar);
    }

    static /* synthetic */ <T> Object y1(c cVar, long j10, Function2<? super c, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, kotlin.coroutines.d<? super T> dVar) {
        return function2.invoke(cVar, dVar);
    }

    @Nullable
    Object I6(@NotNull s sVar, @NotNull kotlin.coroutines.d<? super q> dVar);

    @NotNull
    q J6();

    @Nullable
    default <T> Object Y1(long j10, @NotNull Function2<? super c, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super T> dVar) {
        return Y0(this, j10, function2, dVar);
    }

    long a();

    @NotNull
    o4 getViewConfiguration();

    default long i0() {
        return n0.n.f332724b.c();
    }

    @Nullable
    default <T> Object q5(long j10, @NotNull Function2<? super c, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super T> dVar) {
        return y1(this, j10, function2, dVar);
    }
}
