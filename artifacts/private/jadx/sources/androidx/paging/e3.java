package androidx.paging;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class e3<Key, Value> implements Function0<h2<Key, Value>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.n0 f71830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<h2<Key, Value>> f71831b;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.SuspendingPagingSourceFactory$create$2", f = "SuspendingPagingSourceFactory.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super h2<Key, Value>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f71832a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e3<Key, Value> f71833b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e3<Key, Value> e3Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f71833b = e3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new a(this.f71833b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f71832a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return ((e3) this.f71833b).f71831b.invoke();
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super h2<Key, Value>> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e3(@NotNull kotlinx.coroutines.n0 dispatcher, @NotNull Function0<? extends h2<Key, Value>> delegate) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f71830a = dispatcher;
        this.f71831b = delegate;
    }

    @Nullable
    public final Object d(@NotNull kotlin.coroutines.d<? super h2<Key, Value>> dVar) {
        return kotlinx.coroutines.i.h(this.f71830a, new a(this, null), dVar);
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public h2<Key, Value> invoke() {
        return this.f71831b.invoke();
    }
}
