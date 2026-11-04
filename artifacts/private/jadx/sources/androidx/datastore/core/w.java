package androidx.datastore.core;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface w {
    @Nullable
    <T> Object a(@NotNull Function1<? super kotlin.coroutines.d<? super T>, ? extends Object> function1, @NotNull kotlin.coroutines.d<? super T> dVar);

    @NotNull
    kotlinx.coroutines.flow.i<Unit> b();

    @Nullable
    <T> Object c(@NotNull Function2<? super Boolean, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super T> dVar);

    @Nullable
    Object d(@NotNull kotlin.coroutines.d<? super Integer> dVar);

    @Nullable
    Object e(@NotNull kotlin.coroutines.d<? super Integer> dVar);
}
