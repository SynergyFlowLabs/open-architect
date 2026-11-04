package tj;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.e1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.m2;
import kotlin.s;
import kotlin.sequences.Sequence;
import kotlin.sequences.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class a {
    @m2(markerClass = {s.class})
    @e1(version = "1.8")
    @NotNull
    public static final <T> Sequence<T> a(@NotNull Optional<? extends T> optional) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        return optional.isPresent() ? o.q(optional.get()) : o.g();
    }

    @m2(markerClass = {s.class})
    @e1(version = "1.8")
    public static final <T> T b(@NotNull Optional<? extends T> optional, T t10) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        return optional.isPresent() ? optional.get() : t10;
    }

    @m2(markerClass = {s.class})
    @e1(version = "1.8")
    public static final <T> T c(@NotNull Optional<? extends T> optional, @NotNull Function0<? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return optional.isPresent() ? optional.get() : defaultValue.invoke();
    }

    @m2(markerClass = {s.class})
    @e1(version = "1.8")
    @Nullable
    public static final <T> T d(@NotNull Optional<T> optional) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        return optional.orElse(null);
    }

    @m2(markerClass = {s.class})
    @e1(version = "1.8")
    @NotNull
    public static final <T, C extends Collection<? super T>> C e(@NotNull Optional<T> optional, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (optional.isPresent()) {
            T t10 = optional.get();
            Intrinsics.checkNotNullExpressionValue(t10, "get(...)");
            destination.add(t10);
        }
        return destination;
    }

    @m2(markerClass = {s.class})
    @e1(version = "1.8")
    @NotNull
    public static final <T> List<T> f(@NotNull Optional<? extends T> optional) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        return optional.isPresent() ? CollectionsKt.listOf(optional.get()) : CollectionsKt.emptyList();
    }

    @m2(markerClass = {s.class})
    @e1(version = "1.8")
    @NotNull
    public static final <T> Set<T> g(@NotNull Optional<? extends T> optional) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        return optional.isPresent() ? SetsKt.setOf(optional.get()) : SetsKt.emptySet();
    }
}
