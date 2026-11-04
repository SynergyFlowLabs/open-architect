package androidx.compose.runtime.external.kotlinx.collections.immutable;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface i<E> extends e<E>, f<E> {

    public interface a<E> extends Set<E>, f.a<E>, qj.h {
        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.f.a
        @NotNull
        i<E> build();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @NotNull
    i<E> I(@NotNull Function1<? super E, Boolean> function1);

    @Override // java.util.Set, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @NotNull
    i<E> add(E e10);

    @Override // java.util.Set, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @NotNull
    i<E> addAll(@NotNull Collection<? extends E> collection);

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @NotNull
    a<E> builder();

    @Override // java.util.Set, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @NotNull
    i<E> clear();

    @Override // java.util.Set, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @NotNull
    i<E> remove(E e10);

    @Override // java.util.Set, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @NotNull
    i<E> removeAll(@NotNull Collection<? extends E> collection);

    @Override // java.util.Set, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @NotNull
    i<E> retainAll(@NotNull Collection<? extends E> collection);
}
