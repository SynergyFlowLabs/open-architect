package androidx.paging;

import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 {
    @kotlin.l(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @kotlin.b1(expression = "Pager(\n            PagingConfig(pageSize),\n            initialLoadKey,\n            this.asPagingSourceFactory(fetchExecutor.asCoroutineDispatcher())\n        ).liveData", imports = {"androidx.paging.Pager", "androidx.paging.PagingConfig", "androidx.paging.liveData", "kotlinx.coroutines.asCoroutineDispatcher"}))
    @NotNull
    public static final <Key, Value> androidx.lifecycle.w0<q1<Value>> a(@NotNull u.c<Key, Value> cVar, int i10, @Nullable Key key, @Nullable q1.a<Value> aVar, @NotNull Executor fetchExecutor) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(fetchExecutor, "fetchExecutor");
        return new v0(cVar, s1.b(i10, 0, false, 0, 0, 30, null)).h(key).e(aVar).g(fetchExecutor).a();
    }

    @kotlin.l(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @kotlin.b1(expression = "Pager(\n            PagingConfig(\n                config.pageSize,\n                config.prefetchDistance,\n                config.enablePlaceholders,\n                config.initialLoadSizeHint,\n                config.maxSize\n            ),\n            initialLoadKey,\n            this.asPagingSourceFactory(fetchExecutor.asCoroutineDispatcher())\n        ).liveData", imports = {"androidx.paging.Pager", "androidx.paging.PagingConfig", "androidx.paging.liveData", "kotlinx.coroutines.asCoroutineDispatcher"}))
    @NotNull
    public static final <Key, Value> androidx.lifecycle.w0<q1<Value>> b(@NotNull u.c<Key, Value> cVar, @NotNull q1.e config, @Nullable Key key, @Nullable q1.a<Value> aVar, @NotNull Executor fetchExecutor) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(fetchExecutor, "fetchExecutor");
        return new v0(cVar, config).h(key).e(aVar).g(fetchExecutor).a();
    }

    @kotlin.l(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @kotlin.b1(expression = "Pager(\n            PagingConfig(pageSize),\n            initialLoadKey,\n            this\n        ).liveData", imports = {"androidx.paging.Pager", "androidx.paging.PagingConfig", "androidx.paging.liveData"}))
    @NotNull
    public static final <Key, Value> androidx.lifecycle.w0<q1<Value>> c(@NotNull Function0<? extends h2<Key, Value>> function0, int i10, @Nullable Key key, @Nullable q1.a<Value> aVar, @NotNull kotlinx.coroutines.s0 coroutineScope, @NotNull kotlinx.coroutines.n0 fetchDispatcher) {
        Intrinsics.checkNotNullParameter(function0, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(fetchDispatcher, "fetchDispatcher");
        q1.e eVarA = new q1.e.a().e(i10).a();
        Executor executorI = androidx.arch.core.executor.c.i();
        Intrinsics.checkNotNullExpressionValue(executorI, "getMainThreadExecutor()");
        return new u0(coroutineScope, key, eVarA, aVar, function0, kotlinx.coroutines.b2.c(executorI), fetchDispatcher);
    }

    @kotlin.l(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @kotlin.b1(expression = "Pager(\n            PagingConfig(\n                config.pageSize,\n                config.prefetchDistance,\n                config.enablePlaceholders,\n                config.initialLoadSizeHint,\n                config.maxSize\n            ),\n            initialLoadKey,\n            this\n        ).liveData", imports = {"androidx.paging.Pager", "androidx.paging.PagingConfig", "androidx.paging.liveData"}))
    @NotNull
    public static final <Key, Value> androidx.lifecycle.w0<q1<Value>> d(@NotNull Function0<? extends h2<Key, Value>> function0, @NotNull q1.e config, @Nullable Key key, @Nullable q1.a<Value> aVar, @NotNull kotlinx.coroutines.s0 coroutineScope, @NotNull kotlinx.coroutines.n0 fetchDispatcher) {
        Intrinsics.checkNotNullParameter(function0, "<this>");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(fetchDispatcher, "fetchDispatcher");
        Executor executorI = androidx.arch.core.executor.c.i();
        Intrinsics.checkNotNullExpressionValue(executorI, "getMainThreadExecutor()");
        return new u0(coroutineScope, key, config, aVar, function0, kotlinx.coroutines.b2.c(executorI), fetchDispatcher);
    }

    public static /* synthetic */ androidx.lifecycle.w0 e(u.c cVar, int i10, Object obj, q1.a aVar, Executor executor, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            obj = null;
        }
        if ((i11 & 4) != 0) {
            aVar = null;
        }
        if ((i11 & 8) != 0) {
            executor = androidx.arch.core.executor.c.g();
            Intrinsics.checkNotNullExpressionValue(executor, "getIOThreadExecutor()");
        }
        return a(cVar, i10, obj, aVar, executor);
    }

    public static /* synthetic */ androidx.lifecycle.w0 f(u.c cVar, q1.e eVar, Object obj, q1.a aVar, Executor executor, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            obj = null;
        }
        if ((i10 & 4) != 0) {
            aVar = null;
        }
        if ((i10 & 8) != 0) {
            executor = androidx.arch.core.executor.c.g();
            Intrinsics.checkNotNullExpressionValue(executor, "getIOThreadExecutor()");
        }
        return b(cVar, eVar, obj, aVar, executor);
    }

    public static /* synthetic */ androidx.lifecycle.w0 g(Function0 function0, int i10, Object obj, q1.a aVar, kotlinx.coroutines.s0 s0Var, kotlinx.coroutines.n0 n0Var, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            obj = null;
        }
        if ((i11 & 4) != 0) {
            aVar = null;
        }
        if ((i11 & 8) != 0) {
            s0Var = kotlinx.coroutines.f2.f314023a;
        }
        if ((i11 & 16) != 0) {
            Executor executorG = androidx.arch.core.executor.c.g();
            Intrinsics.checkNotNullExpressionValue(executorG, "getIOThreadExecutor()");
            n0Var = kotlinx.coroutines.b2.c(executorG);
        }
        return c(function0, i10, obj, aVar, s0Var, n0Var);
    }

    public static /* synthetic */ androidx.lifecycle.w0 h(Function0 function0, q1.e eVar, Object obj, q1.a aVar, kotlinx.coroutines.s0 s0Var, kotlinx.coroutines.n0 n0Var, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            obj = null;
        }
        if ((i10 & 4) != 0) {
            aVar = null;
        }
        if ((i10 & 8) != 0) {
            s0Var = kotlinx.coroutines.f2.f314023a;
        }
        if ((i10 & 16) != 0) {
            Executor executorG = androidx.arch.core.executor.c.g();
            Intrinsics.checkNotNullExpressionValue(executorG, "getIOThreadExecutor()");
            n0Var = kotlinx.coroutines.b2.c(executorG);
        }
        return d(function0, eVar, obj, aVar, s0Var, n0Var);
    }
}
