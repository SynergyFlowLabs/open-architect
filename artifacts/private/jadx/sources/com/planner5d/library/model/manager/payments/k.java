package com.planner5d.library.model.manager.payments;

import androidx.annotation.m1;
import com.planner5d.library.model.payments.Payment;
import kotlin.Unit;
import kotlinx.coroutines.n0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public interface k {
    @Nullable
    Object a(@NotNull com.planner5d.library.model.payments.a aVar, @Nullable id.a aVar2, @NotNull kotlin.coroutines.d<? super Boolean> dVar);

    @m1
    boolean b(@Nullable com.planner5d.library.model.payments.a aVar);

    @Nullable
    Object c(@NotNull kotlin.coroutines.d<? super Boolean> dVar);

    @Nullable
    Object d(@NotNull com.planner5d.library.model.payments.a[] aVarArr, @Nullable id.a aVar, @NotNull kotlin.coroutines.d<? super com.planner5d.library.model.payments.a[]> dVar) throws Throwable;

    @Nullable
    Object f(@Nullable id.a aVar, boolean z10, @NotNull kotlin.coroutines.d<? super com.planner5d.library.model.payments.a[]> dVar) throws Throwable;

    @Nullable
    Object h(@Nullable com.planner5d.library.model.payments.a aVar, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @Nullable
    Object i(@Nullable id.a aVar, @NotNull kotlin.coroutines.d<? super fd.a> dVar);

    @Nullable
    Object j(@Nullable com.planner5d.library.model.payments.a aVar, @NotNull kotlin.coroutines.d<? super Boolean> dVar);

    @Nullable
    Object k(@NotNull com.planner5d.library.model.payments.a aVar, @NotNull kotlin.coroutines.d<? super Boolean> dVar);

    @Nullable
    Object m(long j10, @Nullable id.a aVar, @NotNull kotlin.coroutines.d<? super com.planner5d.library.model.payments.a> dVar) throws Exception;

    @Nullable
    Object n(@NotNull com.planner5d.library.model.payments.a aVar, @Nullable id.a aVar2, @NotNull kotlin.coroutines.d<? super Long> dVar) throws Throwable;

    @Nullable
    Object o(@Nullable id.a aVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable;

    @Nullable
    Object p(@NotNull com.planner5d.library.model.payments.a aVar, @NotNull kotlin.coroutines.d<? super Boolean> dVar);

    @Nullable
    Object q(@NotNull fd.i iVar, @NotNull kotlin.coroutines.d<? super Boolean> dVar);

    @Nullable
    Object r(@NotNull n0 n0Var, @NotNull Payment.b bVar, @NotNull kotlin.coroutines.d<? super com.planner5d.library.model.payments.a[]> dVar);
}
