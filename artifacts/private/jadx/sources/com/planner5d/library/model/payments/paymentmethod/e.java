package com.planner5d.library.model.payments.paymentmethod;

import android.app.Activity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.n0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public interface e {

    public enum a {
        None(0),
        Google(1);


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f222524e = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f222525a;

        a(int i10) {
            this.f222525a = i10;
        }

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f222524e;
        }

        public final int n() {
            return this.f222525a;
        }
    }

    @Nullable
    Object a(@NotNull kotlin.coroutines.d<? super List<fd.c>> dVar) throws Throwable;

    @Nullable
    Object b(@NotNull kotlin.coroutines.d<? super com.planner5d.library.model.payments.a[]> dVar) throws Throwable;

    @Nullable
    Object c(@NotNull kotlin.coroutines.d<? super List<com.planner5d.library.model.payments.a>> dVar) throws Throwable;

    @NotNull
    n0<d> d();

    @Nullable
    Object e(@NotNull com.planner5d.library.model.payments.a aVar, @NotNull kotlin.coroutines.d<? super Boolean> dVar);

    @Nullable
    Object f(@Nullable com.planner5d.library.model.payments.a aVar, @NotNull kotlin.coroutines.d<? super Boolean> dVar);

    @Nullable
    Object g(@Nullable fd.f fVar, @Nullable Activity activity, long j10, @NotNull String str, @NotNull String str2, @NotNull Function2<? super Throwable, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable;

    @NotNull
    a getId();

    @Nullable
    Object h(@Nullable id.a aVar, @NotNull String[] strArr, @NotNull kotlin.coroutines.d<? super fd.f[]> dVar) throws Throwable;
}
