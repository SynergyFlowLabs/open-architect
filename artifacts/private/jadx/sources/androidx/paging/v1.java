package androidx.paging;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class v1<Key, Value> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.flow.i<x1<Value>> f72676a;

    /* synthetic */ class a extends kotlin.jvm.internal.g0 implements Function1<kotlin.coroutines.d<? super h2<Key, Value>>, Object>, kotlin.coroutines.jvm.internal.n {
        a(Object obj) {
            super(1, obj, e3.class, "create", "create(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@NotNull kotlin.coroutines.d<? super h2<Key, Value>> dVar) {
            return ((e3) this.receiver).d(dVar);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.Pager$flow$2", f = "Pager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super h2<Key, Value>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f72677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<h2<Key, Value>> f72678b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function0<? extends h2<Key, Value>> function0, kotlin.coroutines.d<? super b> dVar) {
            super(1, dVar);
            this.f72678b = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@NotNull kotlin.coroutines.d<?> dVar) {
            return new b(this.f72678b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f72677a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return this.f72678b.invoke();
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable kotlin.coroutines.d<? super h2<Key, Value>> dVar) {
            return ((b) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public v1(@NotNull w1 config, @NotNull Function0<? extends h2<Key, Value>> pagingSourceFactory) {
        this(config, null, pagingSourceFactory, 2, null);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        int i10 = 6 | 2;
    }

    public static /* synthetic */ void b() {
    }

    @NotNull
    public final kotlinx.coroutines.flow.i<x1<Value>> a() {
        return this.f72676a;
    }

    @a0
    public v1(@NotNull w1 config, @Nullable Key key, @Nullable s2<Key, Value> s2Var, @NotNull Function0<? extends h2<Key, Value>> pagingSourceFactory) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        this.f72676a = new h1(pagingSourceFactory instanceof e3 ? new a(pagingSourceFactory) : new b(pagingSourceFactory, null), key, config, s2Var).i();
    }

    public /* synthetic */ v1(w1 w1Var, Object obj, s2 s2Var, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(w1Var, (i10 & 2) != 0 ? null : obj, s2Var, function0);
    }

    public /* synthetic */ v1(w1 w1Var, Object obj, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(w1Var, (i10 & 2) != 0 ? null : obj, function0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public v1(@NotNull w1 config, @Nullable Key key, @NotNull Function0<? extends h2<Key, Value>> pagingSourceFactory) {
        this(config, key, null, pagingSourceFactory);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        int i10 = 4 | 0;
    }
}
