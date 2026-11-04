package kotlin;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@oj.i(name = "TuplesKt")
public final class TuplesKt {
    @NotNull
    public static final <A, B> Pair<A, B> to(A a10, B b10) {
        return new Pair<>(a10, b10);
    }

    @NotNull
    public static final <T> List<T> toList(@NotNull Pair<? extends T, ? extends T> pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return CollectionsKt.listOf(pair.getFirst(), pair.getSecond());
    }

    @NotNull
    public static final <T> List<T> toList(@NotNull n1<? extends T, ? extends T, ? extends T> n1Var) {
        Intrinsics.checkNotNullParameter(n1Var, "<this>");
        return CollectionsKt.listOf(n1Var.f(), n1Var.g(), n1Var.h());
    }
}
