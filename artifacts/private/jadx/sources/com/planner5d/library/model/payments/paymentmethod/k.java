package com.planner5d.library.model.payments.paymentmethod;

import android.app.Activity;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.n0;
import kotlinx.coroutines.channels.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final e.a f222750a = e.a.None;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n0<d> f222751b = s.d(0, null, null, 7, null);

    @Override // com.planner5d.library.model.payments.paymentmethod.e
    @Nullable
    public Object a(@NotNull kotlin.coroutines.d<? super List<fd.c>> dVar) {
        return CollectionsKt.emptyList();
    }

    @Override // com.planner5d.library.model.payments.paymentmethod.e
    @Nullable
    public Object b(@NotNull kotlin.coroutines.d<? super com.planner5d.library.model.payments.a[]> dVar) {
        return new com.planner5d.library.model.payments.a[0];
    }

    @Override // com.planner5d.library.model.payments.paymentmethod.e
    @Nullable
    public Object c(@NotNull kotlin.coroutines.d<? super List<com.planner5d.library.model.payments.a>> dVar) {
        return CollectionsKt.emptyList();
    }

    @Override // com.planner5d.library.model.payments.paymentmethod.e
    @NotNull
    public n0<d> d() {
        return this.f222751b;
    }

    @Override // com.planner5d.library.model.payments.paymentmethod.e
    @Nullable
    public Object e(@NotNull com.planner5d.library.model.payments.a aVar, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        return kotlin.coroutines.jvm.internal.b.a(false);
    }

    @Override // com.planner5d.library.model.payments.paymentmethod.e
    @Nullable
    public Object f(@Nullable com.planner5d.library.model.payments.a aVar, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        return kotlin.coroutines.jvm.internal.b.a(false);
    }

    @Override // com.planner5d.library.model.payments.paymentmethod.e
    @Nullable
    public Object g(@Nullable fd.f fVar, @Nullable Activity activity, long j10, @NotNull String str, @NotNull String str2, @NotNull Function2<? super Throwable, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.model.payments.paymentmethod.e
    @NotNull
    public e.a getId() {
        return this.f222750a;
    }

    @Override // com.planner5d.library.model.payments.paymentmethod.e
    @Nullable
    public Object h(@Nullable id.a aVar, @NotNull String[] strArr, @NotNull kotlin.coroutines.d<? super fd.f[]> dVar) {
        return new fd.f[0];
    }
}
