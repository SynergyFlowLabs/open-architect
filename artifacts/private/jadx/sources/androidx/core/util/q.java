package androidx.core.util;

import android.util.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class q {
    @e.a({"UnknownNullness"})
    public static final <F, S> F a(@NotNull Pair<F, S> pair) {
        return (F) pair.first;
    }

    @e.a({"UnknownNullness"})
    public static final <F, S> F b(@NotNull p<F, S> pVar) {
        return pVar.f48411a;
    }

    @e.a({"UnknownNullness"})
    public static final <F, S> S c(@NotNull Pair<F, S> pair) {
        return (S) pair.second;
    }

    @e.a({"UnknownNullness"})
    public static final <F, S> S d(@NotNull p<F, S> pVar) {
        return pVar.f48412b;
    }

    @NotNull
    public static final <F, S> Pair<F, S> e(@NotNull kotlin.Pair<? extends F, ? extends S> pair) {
        return new Pair<>(pair.getFirst(), pair.getSecond());
    }

    @NotNull
    public static final <F, S> p<F, S> f(@NotNull kotlin.Pair<? extends F, ? extends S> pair) {
        return new p<>(pair.getFirst(), pair.getSecond());
    }

    @NotNull
    public static final <F, S> kotlin.Pair<F, S> g(@NotNull Pair<F, S> pair) {
        return new kotlin.Pair<>(pair.first, pair.second);
    }

    @NotNull
    public static final <F, S> kotlin.Pair<F, S> h(@NotNull p<F, S> pVar) {
        return new kotlin.Pair<>(pVar.f48411a, pVar.f48412b);
    }
}
