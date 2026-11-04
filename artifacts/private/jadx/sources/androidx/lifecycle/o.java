package androidx.lifecycle;

import java.time.Duration;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f52451a = 5000;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2", f = "CoroutineLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super s>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f52452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a1<T> f52453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0<T> f52454c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(a1<T> a1Var, w0<T> w0Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f52453b = a1Var;
            this.f52454c = w0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit m(a1 a1Var, Object obj) {
            a1Var.r(obj);
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f52453b, this.f52454c, dVar);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f52452a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            final a1<T> a1Var = this.f52453b;
            a1Var.s(this.f52454c, new b(new Function1() { // from class: androidx.lifecycle.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return o.a.m(a1Var, obj2);
                }
            }));
            return new s(this.f52454c, this.f52453b);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super s> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static final class b implements d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f52455a;

        b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f52455a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f52455a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f52455a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof d1) && (obj instanceof kotlin.jvm.internal.c0)) {
                return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    @Nullable
    public static final <T> Object a(@NotNull a1<T> a1Var, @NotNull w0<T> w0Var, @NotNull kotlin.coroutines.d<? super s> dVar) {
        return kotlinx.coroutines.i.h(kotlinx.coroutines.l1.e().R0(), new a(a1Var, w0Var, null), dVar);
    }

    @oj.j
    @androidx.annotation.w0(26)
    @NotNull
    public static final <T> w0<T> b(@NotNull Duration timeout, @NotNull CoroutineContext context, @NotNull Function2<? super y0<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        return new m(context, d.f52305a.a(timeout), block);
    }

    @oj.j
    @androidx.annotation.w0(26)
    @NotNull
    public static final <T> w0<T> c(@NotNull Duration timeout, @NotNull Function2<? super y0<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        Intrinsics.checkNotNullParameter(block, "block");
        return g(timeout, null, block, 2, null);
    }

    @oj.j
    @NotNull
    public static final <T> w0<T> d(@NotNull CoroutineContext context, long j10, @NotNull Function2<? super y0<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        return new m(context, j10, block);
    }

    @oj.j
    @NotNull
    public static final <T> w0<T> e(@NotNull CoroutineContext context, @NotNull Function2<? super y0<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        return h(context, 0L, block, 2, null);
    }

    @oj.j
    @NotNull
    public static final <T> w0<T> f(@NotNull Function2<? super y0<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return h(null, 0L, block, 3, null);
    }

    public static /* synthetic */ w0 g(Duration duration, CoroutineContext coroutineContext, Function2 function2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        return b(duration, coroutineContext, function2);
    }

    public static /* synthetic */ w0 h(CoroutineContext coroutineContext, long j10, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        if ((i10 & 2) != 0) {
            j10 = 5000;
        }
        return d(coroutineContext, j10, function2);
    }
}
