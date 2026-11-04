package androidx.paging;

import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.l(message = "PagedList is deprecated and has been replaced by PagingData")
public final class v0<Key, Value> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Function0<h2<Key, Value>> f72669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final u.c<Key, Value> f72670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final q1.e f72671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private kotlinx.coroutines.s0 f72672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Key f72673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private q1.a<Value> f72674f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private kotlinx.coroutines.n0 f72675g;

    @kotlin.l(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @kotlin.b1(expression = "Pager(\n                PagingConfig(\n                    config.pageSize,\n                    config.prefetchDistance,\n                    config.enablePlaceholders,\n                    config.initialLoadSizeHint,\n                    config.maxSize\n                ),\n                initialLoadKey,\n                dataSourceFactory.asPagingSourceFactory(Dispatchers.IO)\n            ).liveData", imports = {"androidx.paging.Pager", "androidx.paging.PagingConfig", "androidx.paging.liveData", "kotlinx.coroutines.Dispatchers"}))
    public v0(@NotNull u.c<Key, Value> dataSourceFactory, @NotNull q1.e config) {
        Intrinsics.checkNotNullParameter(dataSourceFactory, "dataSourceFactory");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f72672d = kotlinx.coroutines.f2.f314023a;
        Executor executorG = androidx.arch.core.executor.c.g();
        Intrinsics.checkNotNullExpressionValue(executorG, "getIOThreadExecutor()");
        this.f72675g = kotlinx.coroutines.b2.c(executorG);
        this.f72669a = null;
        this.f72670b = dataSourceFactory;
        this.f72671c = config;
    }

    private static /* synthetic */ void b() {
    }

    private static /* synthetic */ void c() {
    }

    private static /* synthetic */ void d() {
    }

    @NotNull
    public final androidx.lifecycle.w0<q1<Value>> a() {
        Function0<h2<Key, Value>> function0E = this.f72669a;
        if (function0E == null) {
            u.c<Key, Value> cVar = this.f72670b;
            function0E = cVar != null ? cVar.e(this.f72675g) : null;
        }
        Function0<h2<Key, Value>> function0 = function0E;
        if (function0 == null) {
            throw new IllegalStateException("LivePagedList cannot be built without a PagingSourceFactory or DataSource.Factory");
        }
        kotlinx.coroutines.s0 s0Var = this.f72672d;
        Key key = this.f72673e;
        q1.e eVar = this.f72671c;
        q1.a<Value> aVar = this.f72674f;
        Executor executorI = androidx.arch.core.executor.c.i();
        Intrinsics.checkNotNullExpressionValue(executorI, "getMainThreadExecutor()");
        return new u0(s0Var, key, eVar, aVar, function0, kotlinx.coroutines.b2.c(executorI), this.f72675g);
    }

    @NotNull
    public final v0<Key, Value> e(@Nullable q1.a<Value> aVar) {
        this.f72674f = aVar;
        return this;
    }

    @NotNull
    public final v0<Key, Value> f(@NotNull kotlinx.coroutines.s0 coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f72672d = coroutineScope;
        return this;
    }

    @NotNull
    public final v0<Key, Value> g(@NotNull Executor fetchExecutor) {
        Intrinsics.checkNotNullParameter(fetchExecutor, "fetchExecutor");
        this.f72675g = kotlinx.coroutines.b2.c(fetchExecutor);
        return this;
    }

    @NotNull
    public final v0<Key, Value> h(@Nullable Key key) {
        this.f72673e = key;
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.l(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @kotlin.b1(expression = "Pager(\n                PagingConfig(pageSize),\n                initialLoadKey,\n                dataSourceFactory.asPagingSourceFactory(Dispatchers.IO)\n            ).liveData", imports = {"androidx.paging.Pager", "androidx.paging.PagingConfig", "androidx.paging.liveData", "kotlinx.coroutines.Dispatchers"}))
    public v0(@NotNull u.c<Key, Value> dataSourceFactory, int i10) {
        this(dataSourceFactory, new q1.e.a().e(i10).a());
        Intrinsics.checkNotNullParameter(dataSourceFactory, "dataSourceFactory");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.l(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @kotlin.b1(expression = "Pager(\n                PagingConfig(\n                    config.pageSize,\n                    config.prefetchDistance,\n                    config.enablePlaceholders,\n                    config.initialLoadSizeHint,\n                    config.maxSize\n                ),\n                initialLoadKey,\n                this\n            ).liveData", imports = {"androidx.paging.Pager", "androidx.paging.PagingConfig", "androidx.paging.liveData"}))
    public v0(@NotNull Function0<? extends h2<Key, Value>> pagingSourceFactory, @NotNull q1.e config) {
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f72672d = kotlinx.coroutines.f2.f314023a;
        Executor executorG = androidx.arch.core.executor.c.g();
        Intrinsics.checkNotNullExpressionValue(executorG, "getIOThreadExecutor()");
        this.f72675g = kotlinx.coroutines.b2.c(executorG);
        this.f72669a = pagingSourceFactory;
        this.f72670b = null;
        this.f72671c = config;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.l(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @kotlin.b1(expression = "Pager(\n                PagingConfig(pageSize),\n                initialLoadKey,\n                this\n            ).liveData", imports = {"androidx.paging.Pager", "androidx.paging.PagingConfig", "androidx.paging.liveData"}))
    public v0(@NotNull Function0<? extends h2<Key, Value>> pagingSourceFactory, int i10) {
        this(pagingSourceFactory, new q1.e.a().e(i10).a());
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
    }
}
