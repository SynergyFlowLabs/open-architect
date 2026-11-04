package kotlinx.coroutines.flow;

import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.IntIterator;
import kotlin.collections.LongIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,350:1\n105#2:351\n105#2:352\n105#2:353\n105#2:354\n105#2:355\n105#2:356\n105#2:357\n105#2:358\n105#2:359\n105#2:360\n105#2:361\n105#2:362\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n64#1:351\n78#1:352\n85#1:353\n94#1:354\n103#1:355\n118#1:356\n127#1:357\n149#1:358\n160#1:359\n171#1:360\n180#1:361\n189#1:362\n*E\n"})
final /* synthetic */ class l {

    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,108:1\n190#2:109\n191#2,2:111\n193#2:114\n1863#3:110\n1864#3:113\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n190#1:110\n190#1:113\n*E\n"})
    public static final class a implements kotlinx.coroutines.flow.i<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.ranges.n f314635a;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.l$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10", f = "Builders.kt", i = {0}, l = {com.rabbitmq.client.impl.k.b.p.f265340a}, m = "collect", n = {"$this$asFlow_u24lambda_u2419"}, s = {"L$0"})
        public static final class C2298a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f314636a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f314637b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f314639d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f314640e;

            public C2298a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314636a = obj;
                this.f314637b |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public a(kotlin.ranges.n nVar) {
            this.f314635a = nVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0018  */
        @Override // kotlinx.coroutines.flow.i
        public Object collect(kotlinx.coroutines.flow.j<? super Long> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            C2298a c2298a;
            Iterator<Long> it;
            if (dVar instanceof C2298a) {
                c2298a = (C2298a) dVar;
                int i10 = c2298a.f314637b;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c2298a.f314637b = i10 - Integer.MIN_VALUE;
                } else {
                    c2298a = new C2298a(dVar);
                }
            } else {
                c2298a = new C2298a(dVar);
            }
            Object obj = c2298a.f314636a;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = c2298a.f314637b;
            if (i11 == 0) {
                ResultKt.m(obj);
                it = this.f314635a.iterator();
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) c2298a.f314640e;
                jVar = (kotlinx.coroutines.flow.j) c2298a.f314639d;
                ResultKt.m(obj);
            }
            while (it.hasNext()) {
                Long lG = kotlin.coroutines.jvm.internal.b.g(((LongIterator) it).nextLong());
                c2298a.f314639d = jVar;
                c2298a.f314640e = it;
                c2298a.f314637b = 1;
                if (jVar.emit(lG, c2298a) == objL) {
                    return objL;
                }
            }
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n1#1,108:1\n65#2,2:109\n*E\n"})
    public static final class b<T> implements kotlinx.coroutines.flow.i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f314641a;

        public b(Function0 function0) {
            this.f314641a = function0;
        }

        @Override // kotlinx.coroutines.flow.i
        public Object collect(kotlinx.coroutines.flow.j<? super T> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            Object objEmit = jVar.emit((Object) this.f314641a.invoke(), dVar);
            return objEmit == kotlin.coroutines.intrinsics.b.l() ? objEmit : Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n1#1,108:1\n79#2,2:109\n*E\n"})
    public static final class c<T> implements kotlinx.coroutines.flow.i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f314642a;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2", f = "Builders.kt", i = {}, l = {109, 109}, m = "collect", n = {}, s = {})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f314643a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f314644b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f314646d;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314643a = obj;
                this.f314644b |= Integer.MIN_VALUE;
                return c.this.collect(null, this);
            }
        }

        public c(Function1 function1) {
            this.f314642a = function1;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0018  */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
        
            if (r7.emit(r8, r0) == r1) goto L21;
         */
        @Override // kotlinx.coroutines.flow.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(kotlinx.coroutines.flow.j<? super T> r7, kotlin.coroutines.d<? super kotlin.Unit> r8) {
            /*
                r6 = this;
                java.lang.String r5 = "Androeed.ru"
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.l.c.a
                r5 = 0
                if (r0 == 0) goto L18
                r0 = r8
                kotlinx.coroutines.flow.l$c$a r0 = (kotlinx.coroutines.flow.l.c.a) r0
                int r1 = r0.f314644b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L18
                int r1 = r1 - r2
                r5 = 3
                r0.f314644b = r1
                r5 = 1
                goto L1d
            L18:
                kotlinx.coroutines.flow.l$c$a r0 = new kotlinx.coroutines.flow.l$c$a
                r0.<init>(r8)
            L1d:
                java.lang.Object r8 = r0.f314643a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                r5 = 6
                int r2 = r0.f314644b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L49
                if (r2 == r4) goto L3c
                if (r2 != r3) goto L32
                kotlin.ResultKt.m(r8)
                goto L75
            L32:
                r5 = 4
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                r5 = 0
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L3c:
                r5 = 2
                java.lang.Object r6 = r0.f314646d
                r7 = r6
                r5 = 0
                kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                r5 = 0
                kotlin.ResultKt.m(r8)
                r5 = 0
                goto L67
            L49:
                kotlin.ResultKt.m(r8)
                kotlin.jvm.functions.Function1 r6 = r6.f314642a
                r5 = 5
                r0.f314646d = r7
                r0.f314644b = r4
                r8 = 2
                r8 = 6
                kotlin.jvm.internal.h0.e(r8)
                r5 = 3
                java.lang.Object r8 = r6.invoke(r0)
                r5 = 7
                r6 = 7
                r5 = 6
                kotlin.jvm.internal.h0.e(r6)
                if (r8 != r1) goto L67
                r5 = 7
                goto L74
            L67:
                r6 = 7
                r6 = 0
                r5 = 4
                r0.f314646d = r6
                r0.f314644b = r3
                java.lang.Object r6 = r7.emit(r8, r0)
                if (r6 != r1) goto L75
            L74:
                return r1
            L75:
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.c.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,108:1\n86#2:109\n87#2,2:111\n89#2:114\n1863#3:110\n1864#3:113\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n86#1:110\n86#1:113\n*E\n"})
    public static final class d<T> implements kotlinx.coroutines.flow.i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f314647a;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3", f = "Builders.kt", i = {0}, l = {com.rabbitmq.client.impl.k.b.p.f265340a}, m = "collect", n = {"$this$asFlow_u24lambda_u243"}, s = {"L$0"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f314648a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f314649b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f314651d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f314652e;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314648a = obj;
                this.f314649b |= Integer.MIN_VALUE;
                return d.this.collect(null, this);
            }
        }

        public d(Iterable iterable) {
            this.f314647a = iterable;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001a  */
        @Override // kotlinx.coroutines.flow.i
        public Object collect(kotlinx.coroutines.flow.j<? super T> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar;
            Iterator<T> it;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i10 = aVar.f314649b;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f314649b = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(dVar);
                }
            } else {
                aVar = new a(dVar);
            }
            Object obj = aVar.f314648a;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = aVar.f314649b;
            if (i11 == 0) {
                ResultKt.m(obj);
                it = this.f314647a.iterator();
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) aVar.f314652e;
                jVar = (kotlinx.coroutines.flow.j) aVar.f314651d;
                ResultKt.m(obj);
            }
            while (it.hasNext()) {
                T next = it.next();
                aVar.f314651d = jVar;
                aVar.f314652e = it;
                aVar.f314649b = 1;
                if (jVar.emit(next, aVar) == objL) {
                    return objL;
                }
            }
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,108:1\n95#2:109\n96#2,2:111\n98#2:114\n32#3:110\n33#3:113\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n95#1:110\n95#1:113\n*E\n"})
    public static final class e<T> implements kotlinx.coroutines.flow.i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f314653a;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$4", f = "Builders.kt", i = {0}, l = {com.rabbitmq.client.impl.k.b.p.f265340a}, m = "collect", n = {"$this$asFlow_u24lambda_u245"}, s = {"L$0"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f314654a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f314655b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f314657d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f314658e;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314654a = obj;
                this.f314655b |= Integer.MIN_VALUE;
                return e.this.collect(null, this);
            }
        }

        public e(Iterator it) {
            this.f314653a = it;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001a  */
        @Override // kotlinx.coroutines.flow.i
        public Object collect(kotlinx.coroutines.flow.j<? super T> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar;
            Iterator it;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i10 = aVar.f314655b;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f314655b = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(dVar);
                }
            } else {
                aVar = new a(dVar);
            }
            Object obj = aVar.f314654a;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = aVar.f314655b;
            if (i11 == 0) {
                ResultKt.m(obj);
                it = this.f314653a;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) aVar.f314658e;
                jVar = (kotlinx.coroutines.flow.j) aVar.f314657d;
                ResultKt.m(obj);
            }
            while (it.hasNext()) {
                Object next = it.next();
                aVar.f314657d = jVar;
                aVar.f314658e = it;
                aVar.f314655b = 1;
                if (jVar.emit(next, aVar) == objL) {
                    return objL;
                }
            }
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,108:1\n104#2:109\n105#2,2:111\n107#2:114\n1317#3:110\n1318#3:113\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n104#1:110\n104#1:113\n*E\n"})
    public static final class f<T> implements kotlinx.coroutines.flow.i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Sequence f314659a;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5", f = "Builders.kt", i = {0}, l = {com.rabbitmq.client.impl.k.b.p.f265340a}, m = "collect", n = {"$this$asFlow_u24lambda_u247"}, s = {"L$0"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f314660a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f314661b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f314663d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f314664e;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314660a = obj;
                this.f314661b |= Integer.MIN_VALUE;
                return f.this.collect(null, this);
            }
        }

        public f(Sequence sequence) {
            this.f314659a = sequence;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        @Override // kotlinx.coroutines.flow.i
        public Object collect(kotlinx.coroutines.flow.j<? super T> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar;
            Iterator<T> it;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i10 = aVar.f314661b;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f314661b = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(dVar);
                }
            } else {
                aVar = new a(dVar);
            }
            Object obj = aVar.f314660a;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = aVar.f314661b;
            if (i11 == 0) {
                ResultKt.m(obj);
                it = this.f314659a.iterator();
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) aVar.f314664e;
                jVar = (kotlinx.coroutines.flow.j) aVar.f314663d;
                ResultKt.m(obj);
            }
            while (it.hasNext()) {
                T next = it.next();
                aVar.f314663d = jVar;
                aVar.f314664e = it;
                aVar.f314661b = 1;
                if (jVar.emit(next, aVar) == objL) {
                    return objL;
                }
            }
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,108:1\n150#2:109\n151#2,2:111\n153#2:114\n13402#3:110\n13403#3:113\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n150#1:110\n150#1:113\n*E\n"})
    public static final class g<T> implements kotlinx.coroutines.flow.i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object[] f314665a;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6", f = "Builders.kt", i = {0, 0}, l = {com.rabbitmq.client.impl.k.b.p.f265340a}, m = "collect", n = {"$this$asFlow_u24lambda_u2411", "$this$forEach$iv"}, s = {"L$0", "L$1"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f314666a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f314667b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f314669d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f314670e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f314671f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f314672g;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314666a = obj;
                this.f314667b |= Integer.MIN_VALUE;
                return g.this.collect(null, this);
            }
        }

        public g(Object[] objArr) {
            this.f314665a = objArr;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0059  */
        /* JADX WARN: Code duplicated, block: B:18:0x006d  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v3 */
        /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlinx.coroutines.flow.j] */
        /* JADX WARN: Type inference failed for: r9v5 */
        /* JADX WARN: Type inference failed for: r9v6 */
        /* JADX WARN: Type inference failed for: r9v7 */
        /* JADX WARN: Type inference failed for: r9v8 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x006b -> B:20:0x006f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlinx.coroutines.flow.i
        public java.lang.Object collect(kotlinx.coroutines.flow.j<? super T> r8, kotlin.coroutines.d<? super kotlin.Unit> r9) {
            /*
                r7 = this;
                java.lang.String r6 = "Androeed.ru"
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.l.g.a
                if (r0 == 0) goto L17
                r0 = r9
                r0 = r9
                r6 = 3
                kotlinx.coroutines.flow.l$g$a r0 = (kotlinx.coroutines.flow.l.g.a) r0
                int r1 = r0.f314667b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L17
                int r1 = r1 - r2
                r0.f314667b = r1
                goto L1c
            L17:
                kotlinx.coroutines.flow.l$g$a r0 = new kotlinx.coroutines.flow.l$g$a
                r0.<init>(r9)
            L1c:
                java.lang.Object r9 = r0.f314666a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                r6 = 2
                int r2 = r0.f314667b
                r3 = 2
                r3 = 1
                r6 = 3
                if (r2 == 0) goto L48
                if (r2 != r3) goto L3f
                r6 = 4
                int r7 = r0.f314672g
                int r8 = r0.f314671f
                java.lang.Object r2 = r0.f314670e
                java.lang.Object[] r2 = (java.lang.Object[]) r2
                r6 = 7
                java.lang.Object r4 = r0.f314669d
                kotlinx.coroutines.flow.j r4 = (kotlinx.coroutines.flow.j) r4
                kotlin.ResultKt.m(r9)
                r9 = r4
                goto L6f
            L3f:
                r6 = 3
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L48:
                kotlin.ResultKt.m(r9)
                java.lang.Object[] r7 = r7.f314665a
                int r9 = r7.length
                r2 = 5
                r2 = 0
                r6 = 0
                r5 = r2
                r2 = r7
                r7 = r9
                r9 = r8
                r6 = 5
                r8 = r5
            L57:
                if (r8 >= r7) goto L72
                r6 = 6
                r4 = r2[r8]
                r0.f314669d = r9
                r0.f314670e = r2
                r0.f314671f = r8
                r6 = 6
                r0.f314672g = r7
                r0.f314667b = r3
                java.lang.Object r4 = r9.emit(r4, r0)
                if (r4 != r1) goto L6f
                r6 = 2
                return r1
            L6f:
                int r8 = r8 + r3
                r6 = 0
                goto L57
            L72:
                r6 = 4
                kotlin.Unit r7 = kotlin.Unit.f312394a
                r6 = 3
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.g.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,108:1\n161#2:109\n162#2,2:111\n164#2:114\n13423#3:110\n13424#3:113\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n161#1:110\n161#1:113\n*E\n"})
    public static final class h implements kotlinx.coroutines.flow.i<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int[] f314673a;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7", f = "Builders.kt", i = {0, 0}, l = {com.rabbitmq.client.impl.k.b.p.f265340a}, m = "collect", n = {"$this$asFlow_u24lambda_u2413", "$this$forEach$iv"}, s = {"L$0", "L$1"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f314674a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f314675b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f314677d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f314678e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f314679f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f314680g;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314674a = obj;
                this.f314675b |= Integer.MIN_VALUE;
                return h.this.collect(null, this);
            }
        }

        public h(int[] iArr) {
            this.f314673a = iArr;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x005c  */
        /* JADX WARN: Code duplicated, block: B:19:0x0077  */
        /* JADX WARN: Code duplicated, block: B:7:0x0019  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0075 -> B:21:0x0079). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlinx.coroutines.flow.i
        public java.lang.Object collect(kotlinx.coroutines.flow.j<? super java.lang.Integer> r8, kotlin.coroutines.d<? super kotlin.Unit> r9) {
            /*
                r7 = this;
                java.lang.String r6 = "Androeed.ru"
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.l.h.a
                r6 = 0
                if (r0 == 0) goto L19
                r0 = r9
                kotlinx.coroutines.flow.l$h$a r0 = (kotlinx.coroutines.flow.l.h.a) r0
                int r1 = r0.f314675b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r6 = 3
                r3 = r1 & r2
                r6 = 0
                if (r3 == 0) goto L19
                int r1 = r1 - r2
                r0.f314675b = r1
                r6 = 7
                goto L1e
            L19:
                kotlinx.coroutines.flow.l$h$a r0 = new kotlinx.coroutines.flow.l$h$a
                r0.<init>(r9)
            L1e:
                java.lang.Object r9 = r0.f314674a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f314675b
                r3 = 1
                r6 = 1
                if (r2 == 0) goto L49
                r6 = 4
                if (r2 != r3) goto L3f
                int r7 = r0.f314680g
                int r8 = r0.f314679f
                java.lang.Object r2 = r0.f314678e
                int[] r2 = (int[]) r2
                java.lang.Object r4 = r0.f314677d
                kotlinx.coroutines.flow.j r4 = (kotlinx.coroutines.flow.j) r4
                kotlin.ResultKt.m(r9)
                r9 = r4
                r6 = 3
                goto L79
            L3f:
                r6 = 5
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                r6 = 6
                throw r7
            L49:
                kotlin.ResultKt.m(r9)
                int[] r7 = r7.f314673a
                r6 = 7
                int r9 = r7.length
                r2 = 0
                r6 = 1
                r5 = r2
                r2 = r7
                r6 = 6
                r7 = r9
                r9 = r8
                r6 = 0
                r8 = r5
                r8 = r5
            L5a:
                if (r8 >= r7) goto L7c
                r6 = 3
                r4 = r2[r8]
                r6 = 4
                java.lang.Integer r4 = kotlin.coroutines.jvm.internal.b.f(r4)
                r0.f314677d = r9
                r6 = 3
                r0.f314678e = r2
                r0.f314679f = r8
                r6 = 2
                r0.f314680g = r7
                r0.f314675b = r3
                r6 = 4
                java.lang.Object r4 = r9.emit(r4, r0)
                if (r4 != r1) goto L79
                r6 = 0
                return r1
            L79:
                int r8 = r8 + r3
                r6 = 2
                goto L5a
            L7c:
                kotlin.Unit r7 = kotlin.Unit.f312394a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.h.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,108:1\n172#2:109\n173#2,2:111\n175#2:114\n13430#3:110\n13431#3:113\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n172#1:110\n172#1:113\n*E\n"})
    public static final class i implements kotlinx.coroutines.flow.i<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long[] f314681a;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8", f = "Builders.kt", i = {0, 0}, l = {com.rabbitmq.client.impl.k.b.p.f265340a}, m = "collect", n = {"$this$asFlow_u24lambda_u2415", "$this$forEach$iv"}, s = {"L$0", "L$1"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f314682a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f314683b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f314685d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f314686e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f314687f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f314688g;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314682a = obj;
                this.f314683b |= Integer.MIN_VALUE;
                return i.this.collect(null, this);
            }
        }

        public i(long[] jArr) {
            this.f314681a = jArr;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x005b  */
        /* JADX WARN: Code duplicated, block: B:18:0x0074 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0072 -> B:19:0x0075). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlinx.coroutines.flow.i
        public java.lang.Object collect(kotlinx.coroutines.flow.j<? super java.lang.Long> r9, kotlin.coroutines.d<? super kotlin.Unit> r10) {
            /*
                r8 = this;
                java.lang.String r7 = "Androeed.ru"
                boolean r0 = r10 instanceof kotlinx.coroutines.flow.l.i.a
                if (r0 == 0) goto L17
                r0 = r10
                r0 = r10
                kotlinx.coroutines.flow.l$i$a r0 = (kotlinx.coroutines.flow.l.i.a) r0
                r7 = 3
                int r1 = r0.f314683b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L17
                int r1 = r1 - r2
                r0.f314683b = r1
                goto L1d
            L17:
                kotlinx.coroutines.flow.l$i$a r0 = new kotlinx.coroutines.flow.l$i$a
                r7 = 2
                r0.<init>(r10)
            L1d:
                r7 = 7
                java.lang.Object r10 = r0.f314682a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f314683b
                r7 = 4
                r3 = 1
                if (r2 == 0) goto L4b
                if (r2 != r3) goto L41
                int r8 = r0.f314688g
                int r9 = r0.f314687f
                r7 = 4
                java.lang.Object r2 = r0.f314686e
                long[] r2 = (long[]) r2
                r7 = 7
                java.lang.Object r4 = r0.f314685d
                kotlinx.coroutines.flow.j r4 = (kotlinx.coroutines.flow.j) r4
                r7 = 5
                kotlin.ResultKt.m(r10)
                r10 = r4
                r7 = 0
                goto L75
            L41:
                r7 = 4
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r7 = 0
                r8.<init>(r9)
                throw r8
            L4b:
                kotlin.ResultKt.m(r10)
                long[] r8 = r8.f314681a
                int r10 = r8.length
                r2 = 0
                r7 = 0
                r6 = r2
                r2 = r8
                r7 = 0
                r8 = r10
                r10 = r9
                r9 = r6
            L59:
                if (r9 >= r8) goto L77
                r4 = r2[r9]
                java.lang.Long r4 = kotlin.coroutines.jvm.internal.b.g(r4)
                r7 = 1
                r0.f314685d = r10
                r0.f314686e = r2
                r7 = 2
                r0.f314687f = r9
                r0.f314688g = r8
                r0.f314683b = r3
                java.lang.Object r4 = r10.emit(r4, r0)
                r7 = 6
                if (r4 != r1) goto L75
                return r1
            L75:
                int r9 = r9 + r3
                goto L59
            L77:
                kotlin.Unit r8 = kotlin.Unit.f312394a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.i.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,108:1\n181#2:109\n182#2,2:111\n184#2:114\n1863#3:110\n1864#3:113\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n181#1:110\n181#1:113\n*E\n"})
    public static final class j implements kotlinx.coroutines.flow.i<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IntRange f314689a;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9", f = "Builders.kt", i = {0}, l = {com.rabbitmq.client.impl.k.b.p.f265340a}, m = "collect", n = {"$this$asFlow_u24lambda_u2417"}, s = {"L$0"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f314690a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f314691b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f314693d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f314694e;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314690a = obj;
                this.f314691b |= Integer.MIN_VALUE;
                return j.this.collect(null, this);
            }
        }

        public j(IntRange intRange) {
            this.f314689a = intRange;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0016  */
        @Override // kotlinx.coroutines.flow.i
        public Object collect(kotlinx.coroutines.flow.j<? super Integer> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar;
            Iterator<Integer> it;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i10 = aVar.f314691b;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f314691b = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(dVar);
                }
            } else {
                aVar = new a(dVar);
            }
            Object obj = aVar.f314690a;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = aVar.f314691b;
            if (i11 == 0) {
                ResultKt.m(obj);
                it = this.f314689a.iterator();
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) aVar.f314694e;
                jVar = (kotlinx.coroutines.flow.j) aVar.f314693d;
                ResultKt.m(obj);
            }
            while (it.hasNext()) {
                Integer numF = kotlin.coroutines.jvm.internal.b.f(((IntIterator) it).nextInt());
                aVar.f314693d = jVar;
                aVar.f314694e = it;
                aVar.f314691b = 1;
                if (jVar.emit(numF, aVar) == objL) {
                    return objL;
                }
            }
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n1#1,108:1\n119#2,4:109\n*E\n"})
    public static final class k<T> implements kotlinx.coroutines.flow.i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object[] f314695a;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1", f = "Builders.kt", i = {0, 0}, l = {110}, m = "collect", n = {"this", "$this$flowOf_u24lambda_u248"}, s = {"L$0", "L$1"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f314696a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f314697b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f314699d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f314700e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f314701f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f314702g;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314696a = obj;
                this.f314697b |= Integer.MIN_VALUE;
                return k.this.collect(null, this);
            }
        }

        public k(Object[] objArr) {
            this.f314695a = objArr;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0058  */
        /* JADX WARN: Code duplicated, block: B:19:0x006e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:20:0x006f  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v10 */
        /* JADX WARN: Type inference failed for: r9v5 */
        /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, kotlinx.coroutines.flow.j] */
        /* JADX WARN: Type inference failed for: r9v7 */
        /* JADX WARN: Type inference failed for: r9v8 */
        /* JADX WARN: Type inference failed for: r9v9 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006f -> B:21:0x0072). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlinx.coroutines.flow.i
        public java.lang.Object collect(kotlinx.coroutines.flow.j<? super T> r8, kotlin.coroutines.d<? super kotlin.Unit> r9) {
            /*
                r7 = this;
                java.lang.String r6 = "Androeed.ru"
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.l.k.a
                r6 = 2
                if (r0 == 0) goto L17
                r0 = r9
                r0 = r9
                kotlinx.coroutines.flow.l$k$a r0 = (kotlinx.coroutines.flow.l.k.a) r0
                int r1 = r0.f314697b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L17
                int r1 = r1 - r2
                r0.f314697b = r1
                goto L1c
            L17:
                kotlinx.coroutines.flow.l$k$a r0 = new kotlinx.coroutines.flow.l$k$a
                r0.<init>(r9)
            L1c:
                java.lang.Object r9 = r0.f314696a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f314697b
                r6 = 4
                r3 = 1
                if (r2 == 0) goto L47
                if (r2 != r3) goto L3e
                int r7 = r0.f314702g
                int r8 = r0.f314701f
                java.lang.Object r2 = r0.f314700e
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                r6 = 5
                java.lang.Object r4 = r0.f314699d
                kotlinx.coroutines.flow.l$k r4 = (kotlinx.coroutines.flow.l.k) r4
                r6 = 7
                kotlin.ResultKt.m(r9)
                r9 = r2
                r6 = 1
                goto L72
            L3e:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                r6 = 0
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L47:
                kotlin.ResultKt.m(r9)
                r6 = 0
                java.lang.Object[] r9 = r7.f314695a
                int r9 = r9.length
                r2 = 0
                r5 = r8
                r8 = r7
                r7 = r9
                r7 = r9
                r9 = r5
                r9 = r5
            L55:
                r6 = 7
                if (r2 >= r7) goto L77
                java.lang.Object[] r4 = r8.f314695a
                r4 = r4[r2]
                r0.f314699d = r8
                r6 = 4
                r0.f314700e = r9
                r0.f314701f = r2
                r6 = 1
                r0.f314702g = r7
                r0.f314697b = r3
                java.lang.Object r4 = r9.emit(r4, r0)
                if (r4 != r1) goto L6f
                return r1
            L6f:
                r4 = r8
                r6 = 1
                r8 = r2
            L72:
                int r2 = r8 + 1
                r8 = r4
                r8 = r4
                goto L55
            L77:
                kotlin.Unit r7 = kotlin.Unit.f312394a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.k.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.l$l, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n1#1,108:1\n132#2,2:109\n*E\n"})
    public static final class C2299l<T> implements kotlinx.coroutines.flow.i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f314703a;

        public C2299l(Object obj) {
            this.f314703a = obj;
        }

        @Override // kotlinx.coroutines.flow.i
        public Object collect(kotlinx.coroutines.flow.j<? super T> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            Object objEmit = jVar.emit((Object) this.f314703a, dVar);
            return objEmit == kotlin.coroutines.intrinsics.b.l() ? objEmit : Unit.f312394a;
        }
    }

    @NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> a(@NotNull Iterable<? extends T> iterable) {
        return new d(iterable);
    }

    @NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> b(@NotNull Iterator<? extends T> it) {
        return new e(it);
    }

    @NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> c(@NotNull Function0<? extends T> function0) {
        return new b(function0);
    }

    @NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> d(@NotNull Function1<? super kotlin.coroutines.d<? super T>, ? extends Object> function1) {
        return new c(function1);
    }

    @NotNull
    public static final kotlinx.coroutines.flow.i<Integer> e(@NotNull IntRange intRange) {
        return new j(intRange);
    }

    @NotNull
    public static final kotlinx.coroutines.flow.i<Long> f(@NotNull kotlin.ranges.n nVar) {
        return new a(nVar);
    }

    @NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> g(@NotNull Sequence<? extends T> sequence) {
        return new f(sequence);
    }

    @NotNull
    public static final kotlinx.coroutines.flow.i<Integer> h(@NotNull int[] iArr) {
        return new h(iArr);
    }

    @NotNull
    public static final kotlinx.coroutines.flow.i<Long> i(@NotNull long[] jArr) {
        return new i(jArr);
    }

    @NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> j(@NotNull T[] tArr) {
        return new g(tArr);
    }

    @NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> k(@kotlin.b @NotNull Function2<? super kotlinx.coroutines.channels.l0<? super T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        return new kotlinx.coroutines.flow.b(function2, null, 0, null, 14, null);
    }

    @NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> l(@kotlin.b @NotNull Function2<? super kotlinx.coroutines.channels.l0<? super T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        return new kotlinx.coroutines.flow.f(function2, null, 0, null, 14, null);
    }

    @NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> m() {
        return kotlinx.coroutines.flow.h.f314357a;
    }

    @NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> n(@kotlin.b @NotNull Function2<? super kotlinx.coroutines.flow.j<? super T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        return new n0(function2);
    }

    @NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> o(T t10) {
        return new C2299l(t10);
    }

    @NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> p(@NotNull T... tArr) {
        return new k(tArr);
    }
}
