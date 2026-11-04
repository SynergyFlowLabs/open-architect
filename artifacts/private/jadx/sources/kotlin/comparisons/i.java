package kotlin.comparisons;

import java.util.Comparator;
import kotlin.e1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
class i extends h {
    @e1(version = "1.4")
    public static final <T> T A0(T t10, @NotNull T[] other, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        for (T t11 : other) {
            if (comparator.compare(t10, t11) < 0) {
                t10 = t11;
            }
        }
        return t10;
    }

    @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public static final <T> T B0(T t10, T t11, T t12, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (T) C0(t10, C0(t11, t12, comparator), comparator);
    }

    @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public static final <T> T C0(T t10, T t11, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return comparator.compare(t10, t11) <= 0 ? t10 : t11;
    }

    @e1(version = "1.4")
    public static final <T> T D0(T t10, @NotNull T[] other, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        for (T t11 : other) {
            if (comparator.compare(t10, t11) > 0) {
                t10 = t11;
            }
        }
        return t10;
    }

    @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public static final <T> T y0(T t10, T t11, T t12, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (T) z0(t10, z0(t11, t12, comparator), comparator);
    }

    @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public static final <T> T z0(T t10, T t11, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return comparator.compare(t10, t11) >= 0 ? t10 : t11;
    }
}
