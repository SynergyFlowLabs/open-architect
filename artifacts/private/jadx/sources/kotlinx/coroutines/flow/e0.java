package kotlinx.coroutines.flow;

import com.devtodev.core.data.metrics.MetricConsts;
import java.util.NoSuchElementException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlinx.coroutines.s2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nReduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,168:1\n124#2,17:169\n124#2,17:186\n124#2,17:203\n124#2,17:220\n124#2,17:237\n*S KotlinDebug\n*F\n+ 1 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n68#1:169,17\n88#1:186,17\n102#1:203,17\n120#1:220,17\n133#1:237,17\n*E\n"})
final /* synthetic */ class e0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n1#1,131:1\n89#2,2:132\n*E\n"})
    public static final class a<T> implements kotlinx.coroutines.flow.j<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1.h f314126a;

        public a(i1.h hVar) {
            this.f314126a = hVar;
        }

        @Override // kotlinx.coroutines.flow.j
        public Object emit(T t10, kotlin.coroutines.d<? super Unit> dVar) {
            this.f314126a.f312751a = t10;
            throw new kotlinx.coroutines.flow.internal.a(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n1#1,131:1\n103#2,6:132\n*E\n"})
    public static final class b<T> implements kotlinx.coroutines.flow.j<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2 f314127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i1.h f314128b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", i = {0, 0}, l = {132}, m = "emit", n = {"this", MetricConsts.Install}, s = {"L$0", "L$1"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f314129a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f314130b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f314131c;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f314133e;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314130b = obj;
                this.f314131c |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(Function2 function2, i1.h hVar) {
            this.f314127a = function2;
            this.f314128b = hVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0019  */
        @Override // kotlinx.coroutines.flow.j
        public Object emit(T t10, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i10 = aVar.f314131c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f314131c = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(dVar);
                }
            } else {
                aVar = new a(dVar);
            }
            Object objInvoke = aVar.f314130b;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = aVar.f314131c;
            if (i11 == 0) {
                ResultKt.m(objInvoke);
                Function2 function2 = this.f314127a;
                aVar.f314129a = this;
                aVar.f314133e = t10;
                aVar.f314131c = 1;
                kotlin.jvm.internal.h0.e(6);
                objInvoke = function2.invoke(t10, aVar);
                kotlin.jvm.internal.h0.e(7);
                if (objInvoke == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t10 = (T) aVar.f314133e;
                this = (b) aVar.f314129a;
                ResultKt.m(objInvoke);
            }
            if (!((Boolean) objInvoke).booleanValue()) {
                return Unit.f312394a;
            }
            this.f314128b.f312751a = t10;
            throw new kotlinx.coroutines.flow.internal.a(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {179}, m = "first", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    static final class c<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f314134a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f314135b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f314136c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f314137d;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f314136c = obj;
            this.f314137d |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.k.w0(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {179}, m = "first", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    static final class d<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f314138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f314139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f314140c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f314141d;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f314140c = obj;
            this.f314141d |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.k.x0(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n1#1,131:1\n121#2,2:132\n*E\n"})
    public static final class e<T> implements kotlinx.coroutines.flow.j<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1.h f314142a;

        public e(i1.h hVar) {
            this.f314142a = hVar;
        }

        @Override // kotlinx.coroutines.flow.j
        public Object emit(T t10, kotlin.coroutines.d<? super Unit> dVar) {
            this.f314142a.f312751a = t10;
            throw new kotlinx.coroutines.flow.internal.a(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n1#1,131:1\n134#2,6:132\n*E\n"})
    public static final class f<T> implements kotlinx.coroutines.flow.j<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2 f314143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i1.h f314144b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2", f = "Reduce.kt", i = {0, 0}, l = {132}, m = "emit", n = {"this", MetricConsts.Install}, s = {"L$0", "L$1"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f314145a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f314146b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f314147c;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f314149e;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314146b = obj;
                this.f314147c |= Integer.MIN_VALUE;
                return f.this.emit(null, this);
            }
        }

        public f(Function2 function2, i1.h hVar) {
            this.f314143a = function2;
            this.f314144b = hVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0018  */
        @Override // kotlinx.coroutines.flow.j
        public Object emit(T t10, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i10 = aVar.f314147c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f314147c = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(dVar);
                }
            } else {
                aVar = new a(dVar);
            }
            Object objInvoke = aVar.f314146b;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = aVar.f314147c;
            int i12 = 3 << 1;
            if (i11 == 0) {
                ResultKt.m(objInvoke);
                Function2 function2 = this.f314143a;
                aVar.f314145a = this;
                aVar.f314149e = t10;
                aVar.f314147c = 1;
                kotlin.jvm.internal.h0.e(6);
                objInvoke = function2.invoke(t10, aVar);
                kotlin.jvm.internal.h0.e(7);
                if (objInvoke == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t10 = (T) aVar.f314149e;
                this = (f) aVar.f314145a;
                ResultKt.m(objInvoke);
            }
            if (!((Boolean) objInvoke).booleanValue()) {
                return Unit.f312394a;
            }
            this.f314144b.f312751a = t10;
            throw new kotlinx.coroutines.flow.internal.a(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {179}, m = "firstOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    static final class g<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f314150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f314151b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f314152c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f314153d;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f314152c = obj;
            this.f314153d |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.k.y0(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {179}, m = "firstOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    static final class h<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f314154a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f314155b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f314156c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f314157d;

        h(kotlin.coroutines.d<? super h> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f314156c = obj;
            this.f314157d |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.k.z0(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {40}, m = "fold", n = {"accumulator"}, s = {"L$0"})
    static final class i<T, R> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f314158a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f314159b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f314160c;

        i(kotlin.coroutines.d<? super i> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f314159b = obj;
            this.f314160c |= Integer.MIN_VALUE;
            return e0.e(null, null, null, this);
        }
    }

    public static final class j<T> implements kotlinx.coroutines.flow.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1.h<R> f314161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ pj.n<R, T, kotlin.coroutines.d<? super R>, Object> f314162b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2", f = "Reduce.kt", i = {}, l = {41}, m = "emit", n = {}, s = {})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f314163a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f314164b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ j<T> f314165c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f314166d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(j<? super T> jVar, kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
                this.f314165c = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314164b = obj;
                this.f314166d |= Integer.MIN_VALUE;
                return this.f314165c.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public j(i1.h<R> hVar, pj.n<? super R, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> nVar) {
            this.f314161a = hVar;
            this.f314162b = nVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final Object a(T t10, kotlin.coroutines.d<? super Unit> dVar) {
            kotlin.jvm.internal.h0.e(4);
            new a(this, dVar);
            kotlin.jvm.internal.h0.e(5);
            i1.h<R> hVar = this.f314161a;
            hVar.f312751a = (T) this.f314162b.invoke((R) hVar.f312751a, t10, (kotlin.coroutines.d<? super R>) dVar);
            return Unit.f312394a;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0016  */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlinx.coroutines.flow.j
        public final Object emit(T t10, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar;
            i1.h hVar;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i10 = aVar.f314166d;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f314166d = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(this, dVar);
                }
            } else {
                aVar = new a(this, dVar);
            }
            Object obj = aVar.f314164b;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = aVar.f314166d;
            if (i11 == 0) {
                ResultKt.m(obj);
                i1.h hVar2 = this.f314161a;
                pj.n<R, T, kotlin.coroutines.d<? super R>, Object> nVar = this.f314162b;
                T t11 = hVar2.f312751a;
                aVar.f314163a = hVar2;
                aVar.f314166d = 1;
                Object objInvoke = nVar.invoke((R) t11, t10, aVar);
                if (objInvoke == objL) {
                    return objL;
                }
                obj = (T) objInvoke;
                hVar = hVar2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hVar = (i1.h) aVar.f314163a;
                ResultKt.m(obj);
            }
            hVar.f312751a = (T) obj;
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {151}, m = "last", n = {"result"}, s = {"L$0"})
    static final class k<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f314167a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f314168b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f314169c;

        k(kotlin.coroutines.d<? super k> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f314168b = obj;
            this.f314169c |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.k.U0(null, this);
        }
    }

    static final class l<T> implements kotlinx.coroutines.flow.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1.h<Object> f314170a;

        l(i1.h<Object> hVar) {
            this.f314170a = hVar;
        }

        @Override // kotlinx.coroutines.flow.j
        public final Object emit(T t10, kotlin.coroutines.d<? super Unit> dVar) {
            this.f314170a.f312751a = t10;
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {163}, m = "lastOrNull", n = {"result"}, s = {"L$0"})
    static final class m<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f314171a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f314172b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f314173c;

        m(kotlin.coroutines.d<? super m> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f314172b = obj;
            this.f314173c |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.k.V0(null, this);
        }
    }

    static final class n<T> implements kotlinx.coroutines.flow.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1.h<T> f314174a;

        n(i1.h<T> hVar) {
            this.f314174a = hVar;
        }

        @Override // kotlinx.coroutines.flow.j
        public final Object emit(T t10, kotlin.coroutines.d<? super Unit> dVar) {
            this.f314174a.f312751a = t10;
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {18}, m = "reduce", n = {"accumulator"}, s = {"L$0"})
    static final class o<S, T extends S> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f314175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f314176b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f314177c;

        o(kotlin.coroutines.d<? super o> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f314176b = obj;
            this.f314177c |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.k.v1(null, null, this);
        }
    }

    static final class p<T> implements kotlinx.coroutines.flow.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1.h<Object> f314178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ pj.n<S, T, kotlin.coroutines.d<? super S>, Object> f314179b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2", f = "Reduce.kt", i = {}, l = {21}, m = "emit", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f314180a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f314181b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ p<T> f314182c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f314183d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(p<? super T> pVar, kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
                this.f314182c = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314181b = obj;
                this.f314183d |= Integer.MIN_VALUE;
                return this.f314182c.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        p(i1.h<Object> hVar, pj.n<? super S, ? super T, ? super kotlin.coroutines.d<? super S>, ? extends Object> nVar) {
            this.f314178a = hVar;
            this.f314179b = nVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
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
        @Override // kotlinx.coroutines.flow.j
        public final Object emit(T t10, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar;
            i1.h<Object> hVar;
            Object obj;
            i1.h<Object> hVar2;
            Object obj2;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i10 = aVar.f314183d;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f314183d = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(this, dVar);
                }
            } else {
                aVar = new a(this, dVar);
            }
            Object obj3 = aVar.f314181b;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = aVar.f314183d;
            if (i11 == 0) {
                ResultKt.m(obj3);
                hVar = this.f314178a;
                Object obj4 = hVar.f312751a;
                if (obj4 != kotlinx.coroutines.flow.internal.u.f314619a) {
                    pj.n<S, T, kotlin.coroutines.d<? super S>, Object> nVar = this.f314179b;
                    aVar.f314180a = hVar;
                    aVar.f314183d = 1;
                    Object objInvoke = nVar.invoke((S) obj4, t10, aVar);
                    if (objInvoke == objL) {
                        obj2 = t10;
                        return objL;
                    }
                    obj2 = t10;
                    obj = objInvoke;
                    hVar2 = hVar;
                }
                obj2 = t10;
                hVar.f312751a = (T) obj2;
                return Unit.f312394a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar2 = (i1.h) aVar.f314180a;
            ResultKt.m(obj3);
            obj = (T) obj3;
            hVar = hVar2;
            obj2 = obj;
            obj2 = t10;
            hVar.f312751a = (T) obj2;
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {53}, m = "single", n = {"result"}, s = {"L$0"})
    static final class q<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f314184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f314185b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f314186c;

        q(kotlin.coroutines.d<? super q> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f314185b = obj;
            this.f314186c |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.k.K1(null, this);
        }
    }

    @SourceDebugExtension({"SMAP\nReduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt$single$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n1#2:169\n*E\n"})
    static final class r<T> implements kotlinx.coroutines.flow.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1.h<Object> f314187a;

        r(i1.h<Object> hVar) {
            this.f314187a = hVar;
        }

        @Override // kotlinx.coroutines.flow.j
        public final Object emit(T t10, kotlin.coroutines.d<? super Unit> dVar) {
            i1.h<Object> hVar = this.f314187a;
            if (hVar.f312751a != kotlinx.coroutines.flow.internal.u.f314619a) {
                throw new IllegalArgumentException("Flow has more than one element");
            }
            hVar.f312751a = t10;
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n1#1,131:1\n70#2,8:132\n*E\n"})
    public static final class s<T> implements kotlinx.coroutines.flow.j<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1.h f314188a;

        public s(i1.h hVar) {
            this.f314188a = hVar;
        }

        @Override // kotlinx.coroutines.flow.j
        public Object emit(T t10, kotlin.coroutines.d<? super Unit> dVar) {
            i1.h hVar = this.f314188a;
            T t11 = hVar.f312751a;
            T t12 = (T) kotlinx.coroutines.flow.internal.u.f314619a;
            if (t11 == t12) {
                hVar.f312751a = t10;
                return Unit.f312394a;
            }
            hVar.f312751a = t12;
            throw new kotlinx.coroutines.flow.internal.a(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {179}, m = "singleOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    static final class t<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f314189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f314190b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f314191c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f314192d;

        t(kotlin.coroutines.d<? super t> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f314191c = obj;
            this.f314192d |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.k.L1(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public static final <T> Object a(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar, @NotNull kotlin.coroutines.d<? super T> dVar) {
        c cVar;
        i1.h hVar;
        kotlinx.coroutines.flow.internal.a e10;
        kotlinx.coroutines.flow.j<? super Object> jVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f314137d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f314137d = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object obj = cVar.f314136c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f314137d;
        if (i11 == 0) {
            ResultKt.m(obj);
            i1.h hVar2 = new i1.h();
            hVar2.f312751a = (T) kotlinx.coroutines.flow.internal.u.f314619a;
            kotlinx.coroutines.flow.j<? super Object> aVar = new a<>(hVar2);
            try {
                cVar.f314134a = hVar2;
                cVar.f314135b = aVar;
                cVar.f314137d = 1;
                if (iVar.collect(aVar, cVar) == objL) {
                    return objL;
                }
                hVar = hVar2;
            } catch (kotlinx.coroutines.flow.internal.a e11) {
                hVar = hVar2;
                e10 = e11;
                jVar = aVar;
                kotlinx.coroutines.flow.internal.q.b(e10, jVar);
                s2.y(cVar.getContext());
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = (a) cVar.f314135b;
            hVar = (i1.h) cVar.f314134a;
            try {
                ResultKt.m(obj);
            } catch (kotlinx.coroutines.flow.internal.a e12) {
                e10 = e12;
                kotlinx.coroutines.flow.internal.q.b(e10, jVar);
                s2.y(cVar.getContext());
            }
        }
        T t10 = hVar.f312751a;
        if (t10 != kotlinx.coroutines.flow.internal.u.f314619a) {
            return t10;
        }
        throw new NoSuchElementException("Expected at least one element");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public static final <T> Object b(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super T> dVar) {
        d dVar2;
        i1.h hVar;
        kotlinx.coroutines.flow.internal.a e10;
        kotlinx.coroutines.flow.j<? super Object> jVar;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f314141d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f314141d = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object obj = dVar2.f314140c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar2.f314141d;
        if (i11 == 0) {
            ResultKt.m(obj);
            i1.h hVar2 = new i1.h();
            hVar2.f312751a = (T) kotlinx.coroutines.flow.internal.u.f314619a;
            kotlinx.coroutines.flow.j<? super Object> bVar = new b<>(function2, hVar2);
            try {
                dVar2.f314138a = hVar2;
                dVar2.f314139b = bVar;
                dVar2.f314141d = 1;
                if (iVar.collect(bVar, dVar2) == objL) {
                    return objL;
                }
                hVar = hVar2;
            } catch (kotlinx.coroutines.flow.internal.a e11) {
                hVar = hVar2;
                e10 = e11;
                jVar = bVar;
                kotlinx.coroutines.flow.internal.q.b(e10, jVar);
                s2.y(dVar2.getContext());
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = (b) dVar2.f314139b;
            hVar = (i1.h) dVar2.f314138a;
            try {
                ResultKt.m(obj);
            } catch (kotlinx.coroutines.flow.internal.a e12) {
                e10 = e12;
                kotlinx.coroutines.flow.internal.q.b(e10, jVar);
                s2.y(dVar2.getContext());
            }
        }
        T t10 = hVar.f312751a;
        if (t10 != kotlinx.coroutines.flow.internal.u.f314619a) {
            return t10;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public static final <T> Object c(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar, @NotNull kotlin.coroutines.d<? super T> dVar) {
        g gVar;
        i1.h hVar;
        kotlinx.coroutines.flow.internal.a e10;
        kotlinx.coroutines.flow.j<? super Object> jVar;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i10 = gVar.f314153d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f314153d = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(dVar);
            }
        } else {
            gVar = new g(dVar);
        }
        Object obj = gVar.f314152c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = gVar.f314153d;
        if (i11 == 0) {
            ResultKt.m(obj);
            i1.h hVar2 = new i1.h();
            kotlinx.coroutines.flow.j<? super Object> eVar = new e<>(hVar2);
            try {
                gVar.f314150a = hVar2;
                gVar.f314151b = eVar;
                gVar.f314153d = 1;
                if (iVar.collect(eVar, gVar) == objL) {
                    return objL;
                }
                hVar = hVar2;
            } catch (kotlinx.coroutines.flow.internal.a e11) {
                hVar = hVar2;
                e10 = e11;
                jVar = eVar;
                kotlinx.coroutines.flow.internal.q.b(e10, jVar);
                s2.y(gVar.getContext());
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = (e) gVar.f314151b;
            hVar = (i1.h) gVar.f314150a;
            try {
                ResultKt.m(obj);
            } catch (kotlinx.coroutines.flow.internal.a e12) {
                e10 = e12;
                kotlinx.coroutines.flow.internal.q.b(e10, jVar);
                s2.y(gVar.getContext());
            }
        }
        return hVar.f312751a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Nullable
    public static final <T> Object d(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super T> dVar) {
        h hVar;
        i1.h hVar2;
        kotlinx.coroutines.flow.internal.a e10;
        kotlinx.coroutines.flow.j<? super Object> jVar;
        if (dVar instanceof h) {
            hVar = (h) dVar;
            int i10 = hVar.f314157d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f314157d = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(dVar);
            }
        } else {
            hVar = new h(dVar);
        }
        Object obj = hVar.f314156c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = hVar.f314157d;
        if (i11 == 0) {
            ResultKt.m(obj);
            i1.h hVar3 = new i1.h();
            kotlinx.coroutines.flow.j<? super Object> fVar = new f<>(function2, hVar3);
            try {
                hVar.f314154a = hVar3;
                hVar.f314155b = fVar;
                hVar.f314157d = 1;
                if (iVar.collect(fVar, hVar) == objL) {
                    return objL;
                }
                hVar2 = hVar3;
            } catch (kotlinx.coroutines.flow.internal.a e11) {
                hVar2 = hVar3;
                e10 = e11;
                jVar = fVar;
                kotlinx.coroutines.flow.internal.q.b(e10, jVar);
                s2.y(hVar.getContext());
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = (f) hVar.f314155b;
            hVar2 = (i1.h) hVar.f314154a;
            try {
                ResultKt.m(obj);
            } catch (kotlinx.coroutines.flow.internal.a e12) {
                e10 = e12;
                kotlinx.coroutines.flow.internal.q.b(e10, jVar);
                s2.y(hVar.getContext());
            }
        }
        return hVar2.f312751a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <T, R> Object e(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar, R r10, @NotNull pj.n<? super R, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> nVar, @NotNull kotlin.coroutines.d<? super R> dVar) {
        i iVar2;
        i1.h hVar;
        if (dVar instanceof i) {
            iVar2 = (i) dVar;
            int i10 = iVar2.f314160c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar2.f314160c = i10 - Integer.MIN_VALUE;
            } else {
                iVar2 = new i(dVar);
            }
        } else {
            iVar2 = new i(dVar);
        }
        Object obj = iVar2.f314159b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = iVar2.f314160c;
        if (i11 == 0) {
            ResultKt.m(obj);
            i1.h hVar2 = new i1.h();
            hVar2.f312751a = r10;
            kotlinx.coroutines.flow.j<? super Object> jVar = new j<>(hVar2, nVar);
            iVar2.f314158a = hVar2;
            iVar2.f314160c = 1;
            if (iVar.collect(jVar, iVar2) == objL) {
                return objL;
            }
            hVar = hVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (i1.h) iVar2.f314158a;
            ResultKt.m(obj);
        }
        return hVar.f312751a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T, R> Object f(kotlinx.coroutines.flow.i<? extends T> iVar, R r10, pj.n<? super R, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> nVar, kotlin.coroutines.d<? super R> dVar) {
        i1.h hVar = new i1.h();
        hVar.f312751a = r10;
        j jVar = new j(hVar, nVar);
        kotlin.jvm.internal.h0.e(0);
        iVar.collect(jVar, dVar);
        kotlin.jvm.internal.h0.e(1);
        return hVar.f312751a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public static final <T> Object g(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar, @NotNull kotlin.coroutines.d<? super T> dVar) {
        k kVar;
        i1.h hVar;
        if (dVar instanceof k) {
            kVar = (k) dVar;
            int i10 = kVar.f314169c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kVar.f314169c = i10 - Integer.MIN_VALUE;
            } else {
                kVar = new k(dVar);
            }
        } else {
            kVar = new k(dVar);
        }
        Object obj = kVar.f314168b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = kVar.f314169c;
        if (i11 == 0) {
            ResultKt.m(obj);
            i1.h hVar2 = new i1.h();
            hVar2.f312751a = (T) kotlinx.coroutines.flow.internal.u.f314619a;
            kotlinx.coroutines.flow.j<? super Object> lVar = new l<>(hVar2);
            kVar.f314167a = hVar2;
            kVar.f314169c = 1;
            if (iVar.collect(lVar, kVar) == objL) {
                return objL;
            }
            hVar = hVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (i1.h) kVar.f314167a;
            ResultKt.m(obj);
        }
        T t10 = hVar.f312751a;
        if (t10 != kotlinx.coroutines.flow.internal.u.f314619a) {
            return t10;
        }
        throw new NoSuchElementException("Expected at least one element");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public static final <T> Object h(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar, @NotNull kotlin.coroutines.d<? super T> dVar) {
        m mVar;
        i1.h hVar;
        if (dVar instanceof m) {
            mVar = (m) dVar;
            int i10 = mVar.f314173c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                mVar.f314173c = i10 - Integer.MIN_VALUE;
            } else {
                mVar = new m(dVar);
            }
        } else {
            mVar = new m(dVar);
        }
        Object obj = mVar.f314172b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = mVar.f314173c;
        if (i11 == 0) {
            ResultKt.m(obj);
            i1.h hVar2 = new i1.h();
            kotlinx.coroutines.flow.j<? super Object> nVar = new n<>(hVar2);
            mVar.f314171a = hVar2;
            mVar.f314173c = 1;
            if (iVar.collect(nVar, mVar) == objL) {
                return objL;
            }
            hVar = hVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (i1.h) mVar.f314171a;
            ResultKt.m(obj);
        }
        return hVar.f312751a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, kotlinx.coroutines.internal.z0] */
    @Nullable
    public static final <S, T extends S> Object i(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar, @NotNull pj.n<? super S, ? super T, ? super kotlin.coroutines.d<? super S>, ? extends Object> nVar, @NotNull kotlin.coroutines.d<? super S> dVar) {
        o oVar;
        i1.h hVar;
        if (dVar instanceof o) {
            oVar = (o) dVar;
            int i10 = oVar.f314177c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                oVar.f314177c = i10 - Integer.MIN_VALUE;
            } else {
                oVar = new o(dVar);
            }
        } else {
            oVar = new o(dVar);
        }
        Object obj = oVar.f314176b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = oVar.f314177c;
        if (i11 == 0) {
            ResultKt.m(obj);
            i1.h hVar2 = new i1.h();
            hVar2.f312751a = kotlinx.coroutines.flow.internal.u.f314619a;
            kotlinx.coroutines.flow.j<? super Object> pVar = new p<>(hVar2, nVar);
            oVar.f314175a = hVar2;
            oVar.f314177c = 1;
            if (iVar.collect(pVar, oVar) == objL) {
                return objL;
            }
            hVar = hVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (i1.h) oVar.f314175a;
            ResultKt.m(obj);
        }
        T t10 = hVar.f312751a;
        if (t10 != kotlinx.coroutines.flow.internal.u.f314619a) {
            return t10;
        }
        throw new NoSuchElementException("Empty flow can't be reduced");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public static final <T> Object j(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar, @NotNull kotlin.coroutines.d<? super T> dVar) {
        q qVar;
        i1.h hVar;
        if (dVar instanceof q) {
            qVar = (q) dVar;
            int i10 = qVar.f314186c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                qVar.f314186c = i10 - Integer.MIN_VALUE;
            } else {
                qVar = new q(dVar);
            }
        } else {
            qVar = new q(dVar);
        }
        Object obj = qVar.f314185b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = qVar.f314186c;
        if (i11 == 0) {
            ResultKt.m(obj);
            i1.h hVar2 = new i1.h();
            hVar2.f312751a = (T) kotlinx.coroutines.flow.internal.u.f314619a;
            kotlinx.coroutines.flow.j<? super Object> rVar = new r<>(hVar2);
            qVar.f314184a = hVar2;
            qVar.f314186c = 1;
            if (iVar.collect(rVar, qVar) == objL) {
                return objL;
            }
            hVar = hVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (i1.h) qVar.f314184a;
            ResultKt.m(obj);
        }
        T t10 = hVar.f312751a;
        if (t10 != kotlinx.coroutines.flow.internal.u.f314619a) {
            return t10;
        }
        throw new NoSuchElementException("Flow is empty");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public static final <T> Object k(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar, @NotNull kotlin.coroutines.d<? super T> dVar) {
        t tVar;
        i1.h hVar;
        kotlinx.coroutines.flow.internal.a e10;
        kotlinx.coroutines.flow.j<? super Object> jVar;
        if (dVar instanceof t) {
            tVar = (t) dVar;
            int i10 = tVar.f314192d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                tVar.f314192d = i10 - Integer.MIN_VALUE;
            } else {
                tVar = new t(dVar);
            }
        } else {
            tVar = new t(dVar);
        }
        Object obj = tVar.f314191c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = tVar.f314192d;
        if (i11 == 0) {
            ResultKt.m(obj);
            i1.h hVar2 = new i1.h();
            hVar2.f312751a = (T) kotlinx.coroutines.flow.internal.u.f314619a;
            kotlinx.coroutines.flow.j<? super Object> sVar = new s<>(hVar2);
            try {
                tVar.f314189a = hVar2;
                tVar.f314190b = sVar;
                tVar.f314192d = 1;
                if (iVar.collect(sVar, tVar) == objL) {
                    return objL;
                }
                hVar = hVar2;
            } catch (kotlinx.coroutines.flow.internal.a e11) {
                hVar = hVar2;
                e10 = e11;
                jVar = sVar;
                kotlinx.coroutines.flow.internal.q.b(e10, jVar);
                s2.y(tVar.getContext());
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = (s) tVar.f314190b;
            hVar = (i1.h) tVar.f314189a;
            try {
                ResultKt.m(obj);
            } catch (kotlinx.coroutines.flow.internal.a e12) {
                e10 = e12;
                kotlinx.coroutines.flow.internal.q.b(e10, jVar);
                s2.y(tVar.getContext());
            }
        }
        T t10 = hVar.f312751a;
        if (t10 == kotlinx.coroutines.flow.internal.u.f314619a) {
            return null;
        }
        return t10;
    }
}
