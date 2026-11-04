package androidx.datastore.core;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface r0<T> extends e {
    @Nullable
    Object b(@NotNull Function2<? super w0<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @NotNull
    w c();

    @Nullable
    <R> Object e(@NotNull pj.n<? super j0<T>, ? super Boolean, ? super kotlin.coroutines.d<? super R>, ? extends Object> nVar, @NotNull kotlin.coroutines.d<? super R> dVar);
}
