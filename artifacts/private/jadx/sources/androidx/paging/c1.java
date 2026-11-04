package androidx.paging;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class c1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.s0 f71561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final x1<T> f71562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final androidx.paging.c f71563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final i<T> f71564d;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.MulticastedPagingData$asPagingData$1", f = "CachedPagingData.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.flow.j<? super g1<T>>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f71565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c1<T> f71566b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c1<T> c1Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f71566b = c1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new a(this.f71566b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f71565a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.paging.c cVarF = this.f71566b.f();
                if (cVarF != null) {
                    androidx.paging.c.a aVar = androidx.paging.c.a.PAGE_EVENT_FLOW;
                    this.f71565a = 1;
                    if (cVarF.c(aVar, this) == objL) {
                        return objL;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull kotlinx.coroutines.flow.j<? super g1<T>> jVar, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(jVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.MulticastedPagingData$asPagingData$2", f = "CachedPagingData.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements pj.n<kotlinx.coroutines.flow.j<? super g1<T>>, Throwable, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f71567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c1<T> f71568b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(c1<T> c1Var, kotlin.coroutines.d<? super b> dVar) {
            super(3, dVar);
            this.f71568b = c1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f71567a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.paging.c cVarF = this.f71568b.f();
                if (cVarF != null) {
                    androidx.paging.c.a aVar = androidx.paging.c.a.PAGE_EVENT_FLOW;
                    this.f71567a = 1;
                    if (cVarF.a(aVar, this) == objL) {
                        return objL;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // pj.n
        @Nullable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull kotlinx.coroutines.flow.j<? super g1<T>> jVar, @Nullable Throwable th2, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return new b(this.f71568b, dVar).invokeSuspend(Unit.f312394a);
        }
    }

    static final class c extends kotlin.jvm.internal.l0 implements Function0<g1.b<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c1<T> f71569a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(c1<T> c1Var) {
            super(0);
            this.f71569a = c1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final g1.b<T> invoke() {
            return ((c1) this.f71569a).f71564d.f();
        }
    }

    public c1(@NotNull kotlinx.coroutines.s0 scope, @NotNull x1<T> parent, @Nullable androidx.paging.c cVar) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.f71561a = scope;
        this.f71562b = parent;
        this.f71563c = cVar;
        i<T> iVar = new i<>(parent.j(), scope);
        if (cVar != null) {
            cVar.b(iVar);
        }
        this.f71564d = iVar;
    }

    @NotNull
    public final x1<T> b() {
        return new x1<>(kotlinx.coroutines.flow.k.g1(kotlinx.coroutines.flow.k.o1(this.f71564d.g(), new a(this, null)), new b(this, null)), this.f71562b.l(), this.f71562b.k(), new c(this));
    }

    @Nullable
    public final Object c(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        this.f71564d.e();
        return Unit.f312394a;
    }

    @NotNull
    public final x1<T> d() {
        return this.f71562b;
    }

    @NotNull
    public final kotlinx.coroutines.s0 e() {
        return this.f71561a;
    }

    @Nullable
    public final androidx.paging.c f() {
        return this.f71563c;
    }

    public /* synthetic */ c1(kotlinx.coroutines.s0 s0Var, x1 x1Var, androidx.paging.c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(s0Var, x1Var, (i10 & 4) != 0 ? null : cVar);
    }
}
