package kotlin.jvm.internal;

import kotlin.collections.BooleanIterator;
import kotlin.collections.ByteIterator;
import kotlin.collections.CharIterator;
import kotlin.collections.DoubleIterator;
import kotlin.collections.FloatIterator;
import kotlin.collections.IntIterator;
import kotlin.collections.LongIterator;
import kotlin.collections.ShortIterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class j {
    @NotNull
    public static final BooleanIterator a(@NotNull boolean[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return new b(array);
    }

    @NotNull
    public static final ByteIterator b(@NotNull byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return new c(array);
    }

    @NotNull
    public static final CharIterator c(@NotNull char[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return new d(array);
    }

    @NotNull
    public static final DoubleIterator d(@NotNull double[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return new e(array);
    }

    @NotNull
    public static final FloatIterator e(@NotNull float[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return new f(array);
    }

    @NotNull
    public static final IntIterator f(@NotNull int[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return new g(array);
    }

    @NotNull
    public static final LongIterator g(@NotNull long[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return new k(array);
    }

    @NotNull
    public static final ShortIterator h(@NotNull short[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return new l(array);
    }
}
