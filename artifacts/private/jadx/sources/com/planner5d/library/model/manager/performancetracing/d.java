package com.planner5d.library.model.manager.performancetracing;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public interface d {

    public static final class a {
        @NotNull
        public static g a(@NotNull d dVar, @NotNull String name, @NotNull c operation) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(operation, "operation");
            return dVar.a(name, operation, g.f193086a.a());
        }

        @Nullable
        public static Object b(@NotNull d dVar, @NotNull String str, @NotNull c cVar, @NotNull Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, @NotNull kotlin.coroutines.d<? super Unit> dVar2) {
            Object objE = dVar.e(str, cVar, g.f193086a.a(), function1, dVar2);
            return objE == kotlin.coroutines.intrinsics.b.l() ? objE : Unit.f312394a;
        }

        public static void c(@NotNull d dVar, @NotNull String name, @NotNull c operation, @NotNull Function0<Unit> action) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(action, "action");
            dVar.f(name, operation, g.f193086a.a(), action);
        }
    }

    @NotNull
    g a(@NotNull String str, @NotNull c cVar, @Nullable g gVar);

    @Nullable
    Object b(@NotNull String str, @NotNull c cVar, @NotNull Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @NotNull
    g c(@NotNull String str, @NotNull c cVar);

    void d(@NotNull String str, @NotNull c cVar, @NotNull Function0<Unit> function0);

    @Nullable
    Object e(@NotNull String str, @NotNull c cVar, @Nullable g gVar, @NotNull Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    void f(@NotNull String str, @NotNull c cVar, @Nullable g gVar, @NotNull Function0<Unit> function0);
}
