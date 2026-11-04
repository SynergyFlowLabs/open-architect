package androidx.compose.runtime.external.kotlinx.collections.immutable;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface g<E> extends c<E>, f<E> {

    public interface a<E> extends List<E>, f.a<E>, qj.e {
        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.f.a
        @NotNull
        g<E> build();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @NotNull
    g<E> I(@NotNull Function1<? super E, Boolean> function1);

    @Override // java.util.List
    @NotNull
    g<E> add(int i10, E e10);

    @Override // java.util.List, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @NotNull
    g<E> add(E e10);

    @Override // java.util.List
    @NotNull
    g<E> addAll(int i10, @NotNull Collection<? extends E> collection);

    @Override // java.util.List, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @NotNull
    g<E> addAll(@NotNull Collection<? extends E> collection);

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @NotNull
    a<E> builder();

    @Override // java.util.List, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @NotNull
    g<E> clear();

    @NotNull
    g<E> l3(int i10);

    @Override // java.util.List, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @NotNull
    g<E> remove(E e10);

    @Override // java.util.List, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @NotNull
    g<E> removeAll(@NotNull Collection<? extends E> collection);

    @Override // java.util.List, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @NotNull
    g<E> retainAll(@NotNull Collection<? extends E> collection);

    @Override // java.util.List
    @NotNull
    g<E> set(int i10, E e10);
}
