package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.p2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final /* synthetic */ class n {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> implements j<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<T, kotlin.coroutines.d<? super Unit>, Object> f314714a;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.n$a$a, reason: collision with other inner class name */
        public static final class C2300a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f314715a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f314717c;

            public C2300a(kotlin.coroutines.d<? super C2300a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314715a = obj;
                this.f314717c |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
            this.f314714a = function2;
        }

        public Object a(T t10, kotlin.coroutines.d<? super Unit> dVar) {
            kotlin.jvm.internal.h0.e(4);
            new C2300a(dVar);
            kotlin.jvm.internal.h0.e(5);
            this.f314714a.invoke(t10, dVar);
            return Unit.f312394a;
        }

        @Override // kotlinx.coroutines.flow.j
        public Object emit(T t10, kotlin.coroutines.d<? super Unit> dVar) {
            Object objInvoke = this.f314714a.invoke(t10, dVar);
            return objInvoke == kotlin.coroutines.intrinsics.b.l() ? objInvoke : Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nCollect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collectIndexed$2\n+ 2 FlowExceptions.common.kt\nkotlinx/coroutines/flow/internal/FlowExceptions_commonKt\n*L\n1#1,114:1\n29#2,4:115\n*S KotlinDebug\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collectIndexed$2\n*L\n58#1:115,4\n*E\n"})
    public static final class b<T> implements j<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f314718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ pj.n<Integer, T, kotlin.coroutines.d<? super Unit>, Object> f314719b;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f314720a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f314722c;

            public a(kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314720a = obj;
                this.f314722c |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(pj.n<? super Integer, ? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar) {
            this.f314719b = nVar;
        }

        public Object a(T t10, kotlin.coroutines.d<? super Unit> dVar) {
            kotlin.jvm.internal.h0.e(4);
            new a(dVar);
            kotlin.jvm.internal.h0.e(5);
            pj.n<Integer, T, kotlin.coroutines.d<? super Unit>, Object> nVar = this.f314719b;
            int i10 = this.f314718a;
            this.f314718a = i10 + 1;
            if (i10 < 0) {
                throw new ArithmeticException("Index overflow has happened");
            }
            nVar.invoke(Integer.valueOf(i10), t10, dVar);
            return Unit.f312394a;
        }

        @Override // kotlinx.coroutines.flow.j
        public Object emit(T t10, kotlin.coroutines.d<? super Unit> dVar) {
            pj.n<Integer, T, kotlin.coroutines.d<? super Unit>, Object> nVar = this.f314719b;
            int i10 = this.f314718a;
            this.f314718a = i10 + 1;
            if (i10 < 0) {
                throw new ArithmeticException("Index overflow has happened");
            }
            Object objInvoke = nVar.invoke(kotlin.coroutines.jvm.internal.b.f(i10), t10, dVar);
            return objInvoke == kotlin.coroutines.intrinsics.b.l() ? objInvoke : Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f314723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i<T> f314724b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(i<? extends T> iVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f314724b = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f314724b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f314723a;
            if (i10 == 0) {
                ResultKt.m(obj);
                i<T> iVar = this.f314724b;
                this.f314723a = 1;
                if (k.z(iVar, this) == objL) {
                    return objL;
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
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @Nullable
    public static final Object a(@NotNull i<?> iVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objCollect = iVar.collect(kotlinx.coroutines.flow.internal.t.f314618a, dVar);
        return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Backwards compatibility with JS and K/N")
    public static final /* synthetic */ <T> Object b(i<? extends T> iVar, Function2<? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super Unit> dVar) {
        Object objCollect = iVar.collect(new a(function2), dVar);
        return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Backwards compatibility with JS and K/N")
    private static final /* synthetic */ <T> Object c(i<? extends T> iVar, Function2<? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super Unit> dVar) {
        a aVar = new a(function2);
        kotlin.jvm.internal.h0.e(0);
        iVar.collect(aVar, dVar);
        kotlin.jvm.internal.h0.e(1);
        return Unit.f312394a;
    }

    @Nullable
    public static final <T> Object d(@NotNull i<? extends T> iVar, @NotNull pj.n<? super Integer, ? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objCollect = iVar.collect(new b(nVar), dVar);
        return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
    }

    private static final <T> Object e(i<? extends T> iVar, pj.n<? super Integer, ? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, kotlin.coroutines.d<? super Unit> dVar) {
        b bVar = new b(nVar);
        kotlin.jvm.internal.h0.e(0);
        iVar.collect(bVar, dVar);
        kotlin.jvm.internal.h0.e(1);
        return Unit.f312394a;
    }

    @Nullable
    public static final <T> Object f(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objZ = k.z(p.d(k.Y0(iVar, function2), 0, null, 2, null), dVar);
        return objZ == kotlin.coroutines.intrinsics.b.l() ? objZ : Unit.f312394a;
    }

    @Nullable
    public static final <T> Object g(@NotNull j<? super T> jVar, @NotNull i<? extends T> iVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        k.q0(jVar);
        Object objCollect = iVar.collect(jVar, dVar);
        return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
    }

    @NotNull
    public static final <T> p2 h(@NotNull i<? extends T> iVar, @NotNull kotlinx.coroutines.s0 s0Var) {
        return kotlinx.coroutines.k.f(s0Var, null, null, new c(iVar, null), 3, null);
    }
}
