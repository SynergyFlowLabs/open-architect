package io.customer.sdk.communication;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.o0;
import kotlinx.coroutines.p2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface b {
    @NotNull
    o0<a> a();

    @rg.a
    void b();

    @NotNull
    <T extends a> p2 c(@NotNull kotlin.reflect.d<T> dVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2);

    void d(@NotNull a aVar);
}
