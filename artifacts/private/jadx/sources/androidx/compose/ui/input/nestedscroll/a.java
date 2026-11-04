package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.unit.c0;
import n0.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface a {

    /* JADX INFO: renamed from: androidx.compose.ui.input.nestedscroll.a$a, reason: collision with other inner class name */
    public static final class C0295a {
        @Deprecated
        @Nullable
        public static Object a(@NotNull a aVar, long j10, long j11, @NotNull kotlin.coroutines.d<? super c0> dVar) {
            return a.super.B0(j10, j11, dVar);
        }

        @Deprecated
        public static long b(@NotNull a aVar, long j10, long j11, int i10) {
            return a.super.b2(j10, j11, i10);
        }

        @Deprecated
        @Nullable
        public static Object c(@NotNull a aVar, long j10, @NotNull kotlin.coroutines.d<? super c0> dVar) {
            return a.super.a4(j10, dVar);
        }

        @Deprecated
        public static long d(@NotNull a aVar, long j10, int i10) {
            return a.super.G7(j10, i10);
        }
    }

    static /* synthetic */ Object V4(a aVar, long j10, long j11, kotlin.coroutines.d<? super c0> dVar) {
        return c0.b(c0.f42681b.a());
    }

    static /* synthetic */ Object X7(a aVar, long j10, kotlin.coroutines.d<? super c0> dVar) {
        return c0.b(c0.f42681b.a());
    }

    @Nullable
    default Object B0(long j10, long j11, @NotNull kotlin.coroutines.d<? super c0> dVar) {
        return V4(this, j10, j11, dVar);
    }

    default long G7(long j10, int i10) {
        return g.f332700b.e();
    }

    @Nullable
    default Object a4(long j10, @NotNull kotlin.coroutines.d<? super c0> dVar) {
        return X7(this, j10, dVar);
    }

    default long b2(long j10, long j11, int i10) {
        return g.f332700b.e();
    }
}
