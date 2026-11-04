package androidx.compose.runtime.external.kotlinx.collections.immutable;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface f<E> extends b<E> {

    public interface a<E> extends Collection<E>, qj.b {
        @NotNull
        f<E> build();
    }

    @NotNull
    f<E> I(@NotNull Function1<? super E, Boolean> function1);

    @Override // java.util.Collection
    @NotNull
    f<E> add(E e10);

    @Override // java.util.Collection
    @NotNull
    f<E> addAll(@NotNull Collection<? extends E> collection);

    @NotNull
    a<E> builder();

    @Override // java.util.Collection
    @NotNull
    f<E> clear();

    @Override // java.util.Collection
    @NotNull
    f<E> remove(E e10);

    @Override // java.util.Collection
    @NotNull
    f<E> removeAll(@NotNull Collection<? extends E> collection);

    @Override // java.util.Collection
    @NotNull
    f<E> retainAll(@NotNull Collection<? extends E> collection);
}
