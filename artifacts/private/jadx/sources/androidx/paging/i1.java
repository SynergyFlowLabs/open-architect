package androidx.paging;

import com.devtodev.core.data.metrics.MetricConsts;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nPageFetcherSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot\n+ 2 PageFetcherSnapshotState.kt\nandroidx/paging/PageFetcherSnapshotState$Holder\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 FlowExt.kt\nandroidx/paging/FlowExtKt\n+ 5 PagingLogger.kt\nandroidx/paging/PagingLoggerKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,639:1\n390#2:640\n391#2:649\n390#2:652\n391#2:661\n390#2:673\n391#2:682\n390#2:694\n391#2:703\n390#2:715\n391#2:724\n390#2:736\n391#2:745\n390#2:758\n391#2:767\n390#2:769\n391#2:778\n390#2:790\n391#2:799\n390#2:831\n391#2:840\n390#2:852\n391#2:861\n390#2:863\n391#2:872\n120#3,8:641\n129#3:650\n120#3,8:653\n129#3:662\n120#3,8:674\n129#3:683\n120#3,8:695\n129#3:704\n120#3,8:716\n129#3:725\n120#3,8:737\n129#3:746\n120#3,8:759\n129#3:768\n120#3,8:770\n129#3:779\n120#3,8:791\n129#3:800\n120#3,8:832\n129#3:841\n120#3,8:853\n129#3:862\n120#3,8:864\n129#3:873\n98#4:651\n32#5,10:663\n32#5,10:684\n32#5,10:705\n32#5,10:726\n32#5,10:747\n32#5,10:780\n32#5,10:801\n32#5,10:811\n32#5,10:821\n32#5,10:842\n1#6:757\n*S KotlinDebug\n*F\n+ 1 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot\n*L\n210#1:640\n210#1:649\n284#1:652\n284#1:661\n294#1:673\n294#1:682\n324#1:694\n324#1:703\n336#1:715\n336#1:724\n352#1:736\n352#1:745\n374#1:758\n374#1:767\n410#1:769\n410#1:778\n446#1:790\n446#1:799\n470#1:831\n470#1:840\n492#1:852\n492#1:861\n527#1:863\n527#1:872\n210#1:641,8\n210#1:650\n284#1:653,8\n284#1:662\n294#1:674,8\n294#1:683\n324#1:695,8\n324#1:704\n336#1:716,8\n336#1:725\n352#1:737,8\n352#1:746\n374#1:759,8\n374#1:768\n410#1:770,8\n410#1:779\n446#1:791,8\n446#1:800\n470#1:832,8\n470#1:841\n492#1:853,8\n492#1:862\n527#1:864,8\n527#1:873\n251#1:651\n288#1:663,10\n322#1:684,10\n330#1:705,10\n351#1:726,10\n358#1:747,10\n423#1:780,10\n452#1:801,10\n456#1:811,10\n469#1:821,10\n481#1:842,10\n*E\n"})
public final class i1<Key, Value> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Key f72140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final h2<Key, Value> f72141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final w1 f72142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.flow.i<Unit> f72143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final w2<Key, Value> f72144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final j2<Key, Value> f72145f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f72146g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final f0 f72147h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f72148i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.channels.p<g1<Value>> f72149j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final k1.a<Key, Value> f72150k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.a0 f72151l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.flow.i<g1<Value>> f72152m;

    static final class a extends kotlin.jvm.internal.l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f72153a = new a();

        a() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f72154a;

        static {
            int[] iArr = new int[a1.values().length];
            try {
                iArr[a1.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a1.PREPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a1.APPEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f72154a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1", f = "PageFetcherSnapshot.kt", i = {0, 0, 0}, l = {232, com.planner5d.library.engine.input.f.b.f160718p1}, m = "invokeSuspend", n = {"this_$iv", "$this$withLock_u24default$iv$iv", "generationId"}, s = {"L$1", "L$2", "I$0"})
    @SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$simpleFlatMapLatest$1\n+ 2 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot\n+ 3 PageFetcherSnapshotState.kt\nandroidx/paging/PageFetcherSnapshotState$Holder\n+ 4 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 5 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 6 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 7 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,224:1\n254#2:225\n258#2,2:236\n260#2,9:239\n390#3:226\n391#3:235\n120#4,8:227\n129#4:238\n53#5:248\n55#5:252\n50#6:249\n55#6:251\n107#7:250\n*S KotlinDebug\n*F\n+ 1 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot\n*L\n254#1:226\n254#1:235\n254#1:227,8\n254#1:238\n268#1:248\n268#1:252\n268#1:249\n268#1:251\n268#1:250\n*E\n"})
    public static final class c extends kotlin.coroutines.jvm.internal.o implements pj.n<kotlinx.coroutines.flow.j<? super e0>, Integer, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f72155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f72156b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f72157c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ i1 f72158d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ a1 f72159e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f72160f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f72161g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kotlin.coroutines.d dVar, i1 i1Var, a1 a1Var) {
            super(3, dVar);
            this.f72158d = i1Var;
            this.f72159e = a1Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00dc, code lost:
        
            if (kotlinx.coroutines.flow.k.o0(r7, r13, r12) == r0) goto L30;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 231
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.i1.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // pj.n
        @Nullable
        public final Object invoke(@NotNull kotlinx.coroutines.flow.j<? super e0> jVar, Integer num, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            c cVar = new c(dVar, this.f72158d, this.f72159e);
            cVar.f72156b = jVar;
            cVar.f72157c = num;
            return cVar.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$3", f = "PageFetcherSnapshot.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements pj.n<e0, e0, kotlin.coroutines.d<? super e0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f72162a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f72163b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f72164c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a1 f72165d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(a1 a1Var, kotlin.coroutines.d<? super d> dVar) {
            super(3, dVar);
            this.f72165d = a1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f72162a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            e0 e0Var = (e0) this.f72163b;
            e0 e0Var2 = (e0) this.f72164c;
            return j1.a(e0Var2, e0Var, this.f72165d) ? e0Var2 : e0Var;
        }

        @Override // pj.n
        @Nullable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull e0 e0Var, @NotNull e0 e0Var2, @Nullable kotlin.coroutines.d<? super e0> dVar) {
            d dVar2 = new d(this.f72165d, dVar);
            dVar2.f72163b = e0Var;
            dVar2.f72164c = e0Var2;
            return dVar2.invokeSuspend(Unit.f312394a);
        }
    }

    static final class e<T> implements kotlinx.coroutines.flow.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1<Key, Value> f72166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a1 f72167b;

        e(i1<Key, Value> i1Var, a1 a1Var) {
            this.f72166a = i1Var;
            this.f72167b = a1Var;
        }

        @Override // kotlinx.coroutines.flow.j
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(@NotNull e0 e0Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
            Object objU = this.f72166a.u(this.f72167b, e0Var, dVar);
            return objU == kotlin.coroutines.intrinsics.b.l() ? objU : Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,113:1\n51#2,5:114\n*E\n"})
    public static final class f implements kotlinx.coroutines.flow.i<e0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f72168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f72169b;

        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot\n*L\n1#1,222:1\n54#2:223\n268#3:224\n*E\n"})
        public static final class a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f72170a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f72171b;

            /* JADX INFO: renamed from: androidx.paging.i1$f$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1$2", f = "PageFetcherSnapshot.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            public static final class C0667a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f72172a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f72173b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Object f72174c;

                public C0667a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f72172a = obj;
                    this.f72173b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(kotlinx.coroutines.flow.j jVar, int i10) {
                this.f72170a = jVar;
                this.f72171b = i10;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0015  */
            @Override // kotlinx.coroutines.flow.j
            @Nullable
            public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
                C0667a c0667a;
                if (dVar instanceof C0667a) {
                    c0667a = (C0667a) dVar;
                    int i10 = c0667a.f72173b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0667a.f72173b = i10 - Integer.MIN_VALUE;
                    } else {
                        c0667a = new C0667a(dVar);
                    }
                } else {
                    c0667a = new C0667a(dVar);
                }
                Object obj2 = c0667a.f72172a;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i11 = c0667a.f72173b;
                if (i11 == 0) {
                    ResultKt.m(obj2);
                    kotlinx.coroutines.flow.j jVar = this.f72170a;
                    e0 e0Var = new e0(this.f72171b, (j3) obj);
                    c0667a.f72173b = 1;
                    if (jVar.emit(e0Var, c0667a) == objL) {
                        return objL;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj2);
                }
                return Unit.f312394a;
            }
        }

        public f(kotlinx.coroutines.flow.i iVar, int i10) {
            this.f72168a = iVar;
            this.f72169b = i10;
        }

        @Override // kotlinx.coroutines.flow.i
        @Nullable
        public Object collect(@NotNull kotlinx.coroutines.flow.j<? super e0> jVar, @NotNull kotlin.coroutines.d dVar) {
            Object objCollect = this.f72168a.collect(new a(jVar, this.f72169b), dVar);
            return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", i = {0, 0, 0}, l = {646}, m = "currentPagingState", n = {"this", "this_$iv", "$this$withLock_u24default$iv$iv"}, s = {"L$0", "L$1", "L$2"})
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f72176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f72177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f72178c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f72179d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ i1<Key, Value> f72180e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f72181f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(i1<Key, Value> i1Var, kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
            this.f72180e = i1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f72179d = obj;
            this.f72181f |= Integer.MIN_VALUE;
            return this.f72180e.s(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", i = {0, 0, 0, 1, 1, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8}, l = {646, 284, 290, 667, 688, 326, 709, 730, 354}, m = "doInitialLoad", n = {"this", "this_$iv", "$this$withLock_u24default$iv$iv", "this", "$this$withLock_u24default$iv$iv", "this", "this", "result", "this_$iv", "$this$withLock_u24default$iv$iv", "this", "result", "this_$iv", "$this$withLock_u24default$iv$iv", "this", "result", "$this$withLock_u24default$iv$iv", "this", "result", "this_$iv", "$this$withLock_u24default$iv$iv", "this", "result", "this_$iv", "$this$withLock_u24default$iv$iv", "$this$withLock_u24default$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0"})
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f72182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f72183b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f72184c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f72185d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f72186e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ i1<Key, Value> f72187f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f72188g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(i1<Key, Value> i1Var, kotlin.coroutines.d<? super h> dVar) {
            super(dVar);
            this.f72187f = i1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f72186e = obj;
            this.f72188g |= Integer.MIN_VALUE;
            return this.f72187f.t(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, l = {647, 658, 415, androidx.constraintlayout.core.motion.utils.v.c.f44021v, 679, 720, 472, 741, 495, 521, 752}, m = "doLoad", n = {"this", "loadType", "generationalHint", "itemsLoaded", "this_$iv", "$this$withLock_u24default$iv$iv", "this", "loadType", "generationalHint", "itemsLoaded", "loadKey", "this_$iv", "$this$withLock_u24default$iv$iv", "this", "loadType", "generationalHint", "itemsLoaded", "loadKey", "$this$withLock_u24default$iv$iv", "this", "loadType", "generationalHint", "itemsLoaded", "loadKey", "endOfPaginationReached", "params", "this", "loadType", "generationalHint", "itemsLoaded", "loadKey", "endOfPaginationReached", "params", "result", "this_$iv", "$this$withLock_u24default$iv$iv", "this", "loadType", "generationalHint", "result", "this_$iv", "$this$withLock_u24default$iv$iv", "loadType", "generationalHint", "$this$withLock_u24default$iv$iv", "state", "this", "loadType", "generationalHint", "itemsLoaded", "loadKey", "endOfPaginationReached", "params", "result", "dropType", "this_$iv", "$this$withLock_u24default$iv$iv", "this", "loadType", "generationalHint", "itemsLoaded", "loadKey", "endOfPaginationReached", "params", "result", "$this$withLock_u24default$iv$iv", "state", "this", "loadType", "generationalHint", "itemsLoaded", "loadKey", "endOfPaginationReached", "params", "result", "$this$withLock_u24default$iv$iv", "this", "loadType", "generationalHint", "itemsLoaded", "loadKey", "endOfPaginationReached", "this_$iv", "$this$withLock_u24default$iv$iv", "endsPrepend", "endsAppend"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1"})
    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f72189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f72190b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f72191c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f72192d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f72193e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f72194f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f72195g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f72196h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f72197i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f72198j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f72199k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f72200l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f72201m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f72202n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ i1<Key, Value> f72203o;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f72204s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(i1<Key, Value> i1Var, kotlin.coroutines.d<? super i> dVar) {
            super(dVar);
            this.f72203o = i1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f72202n = obj;
            this.f72204s |= Integer.MIN_VALUE;
            int i10 = 6 | 0;
            return this.f72203o.u(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1", f = "PageFetcherSnapshot.kt", i = {0, 0, 0, 0, 1, 2, 2, 2}, l = {646, 168, 657}, m = "invokeSuspend", n = {"$this$cancelableChannelFlow", MetricConsts.Install, "this_$iv", "$this$withLock_u24default$iv$iv", "$this$cancelableChannelFlow", "$this$cancelableChannelFlow", "this_$iv", "$this$withLock_u24default$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$0", "L$1", "L$2"})
    @SourceDebugExtension({"SMAP\nPageFetcherSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot$pageEventFlow$1\n+ 2 PageFetcherSnapshotState.kt\nandroidx/paging/PageFetcherSnapshotState$Holder\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,639:1\n390#2:640\n391#2:649\n390#2:651\n391#2:660\n120#3,8:641\n129#3:650\n120#3,8:652\n129#3:661\n*S KotlinDebug\n*F\n+ 1 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot$pageEventFlow$1\n*L\n161#1:640\n161#1:649\n171#1:651\n171#1:660\n161#1:641,8\n161#1:650\n171#1:652,8\n171#1:661\n*E\n"})
    static final class j extends kotlin.coroutines.jvm.internal.o implements Function2<a3<g1<Value>>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f72205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f72206b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f72207c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f72208d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f72209e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ i1<Key, Value> f72210f;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2", f = "PageFetcherSnapshot.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160711n0}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f72211a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ i1<Key, Value> f72212b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ a3<g1<Value>> f72213c;

            /* JADX INFO: renamed from: androidx.paging.i1$j$a$a, reason: collision with other inner class name */
            static final class C0668a<T> implements kotlinx.coroutines.flow.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ a3<g1<Value>> f72214a;

                /* JADX INFO: renamed from: androidx.paging.i1$j$a$a$a, reason: collision with other inner class name */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1", f = "PageFetcherSnapshot.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160706l1}, m = "emit", n = {}, s = {})
                static final class C0669a extends kotlin.coroutines.jvm.internal.d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f72215a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ C0668a<T> f72216b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    int f72217c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C0669a(C0668a<? super T> c0668a, kotlin.coroutines.d<? super C0669a> dVar) {
                        super(dVar);
                        this.f72216b = c0668a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f72215a = obj;
                        this.f72217c |= Integer.MIN_VALUE;
                        return this.f72216b.emit(null, this);
                    }
                }

                C0668a(a3<g1<Value>> a3Var) {
                    this.f72214a = a3Var;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0018  */
                @Override // kotlinx.coroutines.flow.j
                @Nullable
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(@NotNull g1<Value> g1Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
                    C0669a c0669a;
                    if (dVar instanceof C0669a) {
                        c0669a = (C0669a) dVar;
                        int i10 = c0669a.f72217c;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c0669a.f72217c = i10 - Integer.MIN_VALUE;
                        } else {
                            c0669a = new C0669a(this, dVar);
                        }
                    } else {
                        c0669a = new C0669a(this, dVar);
                    }
                    Object obj = c0669a.f72215a;
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i11 = c0669a.f72217c;
                    try {
                        if (i11 == 0) {
                            ResultKt.m(obj);
                            a3<g1<Value>> a3Var = this.f72214a;
                            c0669a.f72217c = 1;
                            if (a3Var.G(g1Var, c0669a) == objL) {
                                return objL;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.m(obj);
                        }
                    } catch (kotlinx.coroutines.channels.d0 unused) {
                    }
                    return Unit.f312394a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i1<Key, Value> i1Var, a3<g1<Value>> a3Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f72212b = i1Var;
                this.f72213c = a3Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new a(this.f72212b, this.f72213c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f72211a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    kotlinx.coroutines.flow.i iVarZ = kotlinx.coroutines.flow.k.Z(((i1) this.f72212b).f72149j);
                    C0668a c0668a = new C0668a(this.f72213c);
                    this.f72211a = 1;
                    if (iVarZ.collect(c0668a, this) == objL) {
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
            @Nullable
            public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3", f = "PageFetcherSnapshot.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f72218a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ i1<Key, Value> f72219b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.channels.p<Unit> f72220c;

            static final class a<T> implements kotlinx.coroutines.flow.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.channels.p<Unit> f72221a;

                a(kotlinx.coroutines.channels.p<Unit> pVar) {
                    this.f72221a = pVar;
                }

                @Override // kotlinx.coroutines.flow.j
                @Nullable
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(@NotNull Unit unit, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
                    this.f72221a.p(unit);
                    return Unit.f312394a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(i1<Key, Value> i1Var, kotlinx.coroutines.channels.p<Unit> pVar, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f72219b = i1Var;
                this.f72220c = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new b(this.f72219b, this.f72220c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f72218a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    kotlinx.coroutines.flow.i iVar = ((i1) this.f72219b).f72143d;
                    a aVar = new a(this.f72220c);
                    this.f72218a = 1;
                    if (iVar.collect(aVar, this) == objL) {
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
            @Nullable
            public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
                return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4", f = "PageFetcherSnapshot.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f72222a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f72223b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.channels.p<Unit> f72224c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ i1<Key, Value> f72225d;

            @SourceDebugExtension({"SMAP\nPageFetcherSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1\n+ 2 PageFetcherSnapshotState.kt\nandroidx/paging/PageFetcherSnapshotState$Holder\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 LoadStates.kt\nandroidx/paging/LoadStates\n*L\n1#1,639:1\n390#2:640\n391#2:649\n390#2:652\n391#2:661\n390#2:663\n391#2:672\n390#2:674\n391#2:683\n390#2:686\n391#2:695\n390#2:697\n391#2:706\n390#2:708\n391#2:717\n390#2:720\n391#2:729\n390#2:731\n391#2:740\n390#2:742\n391#2:751\n120#3,8:641\n129#3:650\n120#3,8:653\n129#3:662\n120#3,8:664\n129#3:673\n120#3,8:675\n129#3:684\n120#3,8:687\n129#3:696\n120#3,8:698\n129#3:707\n120#3,8:709\n129#3:718\n120#3,8:721\n129#3:730\n120#3,8:732\n129#3:741\n120#3,8:743\n129#3:752\n36#4:651\n37#4:685\n38#4:719\n39#4:753\n*S KotlinDebug\n*F\n+ 1 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1\n*L\n111#1:640\n111#1:649\n125#1:652\n125#1:661\n133#1:663\n133#1:672\n142#1:674\n142#1:683\n125#1:686\n125#1:695\n133#1:697\n133#1:706\n142#1:708\n142#1:717\n125#1:720\n125#1:729\n133#1:731\n133#1:740\n142#1:742\n142#1:751\n111#1:641,8\n111#1:650\n125#1:653,8\n125#1:662\n133#1:664,8\n133#1:673\n142#1:675,8\n142#1:684\n125#1:687,8\n125#1:696\n133#1:698,8\n133#1:707\n142#1:709,8\n142#1:718\n125#1:721,8\n125#1:730\n133#1:732,8\n133#1:741\n142#1:743,8\n142#1:752\n120#1:651\n120#1:685\n120#1:719\n120#1:753\n*E\n"})
            static final class a<T> implements kotlinx.coroutines.flow.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ i1<Key, Value> f72226a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.s0 f72227b;

                /* JADX INFO: renamed from: androidx.paging.i1$j$c$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C0670a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final /* synthetic */ int[] f72228a;

                    static {
                        int[] iArr = new int[a1.values().length];
                        try {
                            iArr[a1.REFRESH.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        f72228a = iArr;
                    }
                }

                @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$1", f = "PageFetcherSnapshot.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 10, 10, 10, 11, 11, 11, 12, 12, 13, 13, 13, 14, 15, 15}, l = {646, 658, 125, 669, 128, 680, 692, 125, 703, 128, 714, 726, 125, 737, 128, 748}, m = "emit", n = {"this", "this_$iv", "$this$withLock_u24default$iv$iv", "this_$iv", "loadType", "this_$iv", "$this$withLock_u24default$iv$iv", "this_$iv", "loadType", "$this$withLock_u24default$iv$iv", "this_$iv", "loadType", "this_$iv", "$this$withLock_u24default$iv$iv", "this_$iv", "loadType", "this_$iv", "this_$iv", "$this$withLock_u24default$iv$iv", "this_$iv", "loadType", "this_$iv", "$this$withLock_u24default$iv$iv", "this_$iv", "loadType", "$this$withLock_u24default$iv$iv", "this_$iv", "loadType", "this_$iv", "$this$withLock_u24default$iv$iv", "this_$iv", "loadType", "this_$iv", "this_$iv", "$this$withLock_u24default$iv$iv", "loadType", "this_$iv", "$this$withLock_u24default$iv$iv", "loadType", "$this$withLock_u24default$iv$iv", "loadType", "this_$iv", "$this$withLock_u24default$iv$iv", "loadType", "this_$iv", "$this$withLock_u24default$iv$iv"}, s = {"L$0", "L$1", "L$3", "L$0", "L$3", "L$4", "L$5", "L$0", "L$3", "L$4", "L$0", "L$3", "L$4", "L$5", "L$0", "L$3", "L$0", "L$3", "L$4", "L$0", "L$3", "L$4", "L$5", "L$0", "L$3", "L$4", "L$0", "L$3", "L$4", "L$5", "L$0", "L$3", "L$0", "L$3", "L$4", "L$2", "L$3", "L$4", "L$2", "L$3", "L$2", "L$3", "L$4", "L$2", "L$2", "L$3"})
                static final class b extends kotlin.coroutines.jvm.internal.d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    Object f72229a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    Object f72230b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    Object f72231c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    Object f72232d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    Object f72233e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    Object f72234f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    Object f72235g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    Object f72236h;

                    /* JADX INFO: renamed from: i, reason: collision with root package name */
                    /* synthetic */ Object f72237i;

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    final /* synthetic */ a<T> f72238j;

                    /* JADX INFO: renamed from: k, reason: collision with root package name */
                    int f72239k;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    b(a<? super T> aVar, kotlin.coroutines.d<? super b> dVar) {
                        super(dVar);
                        this.f72238j = aVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f72237i = obj;
                        this.f72239k |= Integer.MIN_VALUE;
                        return this.f72238j.emit(null, this);
                    }
                }

                a(i1<Key, Value> i1Var, kotlinx.coroutines.s0 s0Var) {
                    this.f72226a = i1Var;
                    this.f72227b = s0Var;
                }

                /* JADX WARN: Code duplicated, block: B:104:0x0405  */
                /* JADX WARN: Code duplicated, block: B:107:0x0416  */
                /* JADX WARN: Code duplicated, block: B:108:0x041c  */
                /* JADX WARN: Code duplicated, block: B:110:0x043f  */
                /* JADX WARN: Code duplicated, block: B:111:0x0442  */
                /* JADX WARN: Code duplicated, block: B:117:0x047d  */
                /* JADX WARN: Code duplicated, block: B:120:0x0487  */
                /* JADX WARN: Code duplicated, block: B:127:0x04c5 A[PHI: r4 r5 r6
                  0x04c5: PHI (r4v53 kotlinx.coroutines.s0) = (r4v48 kotlinx.coroutines.s0), (r4v54 kotlinx.coroutines.s0), (r4v54 kotlinx.coroutines.s0) binds: [B:119:0x0485, B:125:0x04c0, B:126:0x04c2] A[DONT_GENERATE, DONT_INLINE]
                  0x04c5: PHI (r5v57 androidx.paging.i1<Key, Value>) = (r5v51 androidx.paging.i1<Key, Value>), (r5v58 androidx.paging.i1<Key, Value>), (r5v58 androidx.paging.i1<Key, Value>) binds: [B:119:0x0485, B:125:0x04c0, B:126:0x04c2] A[DONT_GENERATE, DONT_INLINE]
                  0x04c5: PHI (r6v42 androidx.paging.z0) = (r6v37 androidx.paging.z0), (r6v43 androidx.paging.z0), (r6v43 androidx.paging.z0) binds: [B:119:0x0485, B:125:0x04c0, B:126:0x04c2] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:134:0x04d6 A[PHI: r1 r12 r14
                  0x04d6: PHI (r1v56 kotlinx.coroutines.s0) = (r1v28 kotlinx.coroutines.s0), (r1v59 kotlinx.coroutines.s0) binds: [B:89:0x0399, B:127:0x04c5] A[DONT_GENERATE, DONT_INLINE]
                  0x04d6: PHI (r12v57 androidx.paging.z0) = (r12v29 androidx.paging.z0), (r12v65 androidx.paging.z0) binds: [B:89:0x0399, B:127:0x04c5] A[DONT_GENERATE, DONT_INLINE]
                  0x04d6: PHI (r14v56 androidx.paging.i1<Key, Value>) = (r14v31 androidx.paging.i1<Key, Value>), (r14v58 androidx.paging.i1<Key, Value>) binds: [B:89:0x0399, B:127:0x04c5] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:136:0x04e1  */
                /* JADX WARN: Code duplicated, block: B:138:0x04e6  */
                /* JADX WARN: Code duplicated, block: B:141:0x0507  */
                /* JADX WARN: Code duplicated, block: B:144:0x0529  */
                /* JADX WARN: Code duplicated, block: B:145:0x052b  */
                /* JADX WARN: Code duplicated, block: B:150:0x053e  */
                /* JADX WARN: Code duplicated, block: B:153:0x054d  */
                /* JADX WARN: Code duplicated, block: B:154:0x0555  */
                /* JADX WARN: Code duplicated, block: B:156:0x057a  */
                /* JADX WARN: Code duplicated, block: B:157:0x057c  */
                /* JADX WARN: Code duplicated, block: B:163:0x05b7  */
                /* JADX WARN: Code duplicated, block: B:166:0x05be  */
                /* JADX WARN: Code duplicated, block: B:169:0x05de  */
                /* JADX WARN: Code duplicated, block: B:173:0x05fb  */
                /* JADX WARN: Code duplicated, block: B:189:0x0363 A[EXC_TOP_SPLITTER, PHI: r1 r4 r5 r6 r12
                  0x0363: PHI (r1v33 androidx.paging.k1$a) = (r1v25 androidx.paging.k1$a), (r1v36 androidx.paging.k1$a) binds: [B:75:0x035e, B:30:0x0162] A[DONT_GENERATE, DONT_INLINE]
                  0x0363: PHI (r4v29 kotlinx.coroutines.s0) = (r4v23 kotlinx.coroutines.s0), (r4v31 kotlinx.coroutines.s0) binds: [B:75:0x035e, B:30:0x0162] A[DONT_GENERATE, DONT_INLINE]
                  0x0363: PHI (r5v32 androidx.paging.i1<Key, Value>) = (r5v21 androidx.paging.i1<Key, Value>), (r5v34 androidx.paging.i1<Key, Value>) binds: [B:75:0x035e, B:30:0x0162] A[DONT_GENERATE, DONT_INLINE]
                  0x0363: PHI (r6v19 androidx.paging.z0) = (r6v14 androidx.paging.z0), (r6v21 androidx.paging.z0) binds: [B:75:0x035e, B:30:0x0162] A[DONT_GENERATE, DONT_INLINE]
                  0x0363: PHI (r12v34 kotlinx.coroutines.sync.a) = (r12v26 kotlinx.coroutines.sync.a), (r12v37 kotlinx.coroutines.sync.a) binds: [B:75:0x035e, B:30:0x0162] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:55:0x02a5  */
                /* JADX WARN: Code duplicated, block: B:58:0x02ba  */
                /* JADX WARN: Code duplicated, block: B:61:0x02cc  */
                /* JADX WARN: Code duplicated, block: B:62:0x02d2  */
                /* JADX WARN: Code duplicated, block: B:64:0x02fa  */
                /* JADX WARN: Code duplicated, block: B:65:0x02fd  */
                /* JADX WARN: Code duplicated, block: B:70:0x0334  */
                /* JADX WARN: Code duplicated, block: B:71:0x0337  */
                /* JADX WARN: Code duplicated, block: B:74:0x0342  */
                /* JADX WARN: Code duplicated, block: B:76:0x0360  */
                /* JADX WARN: Code duplicated, block: B:7:0x0018  */
                /* JADX WARN: Code duplicated, block: B:80:0x0379  */
                /* JADX WARN: Code duplicated, block: B:81:0x037c A[PHI: r4 r5 r6
                  0x037c: PHI (r4v28 kotlinx.coroutines.s0) = (r4v23 kotlinx.coroutines.s0), (r4v29 kotlinx.coroutines.s0), (r4v29 kotlinx.coroutines.s0) binds: [B:73:0x0340, B:79:0x0377, B:80:0x0379] A[DONT_GENERATE, DONT_INLINE]
                  0x037c: PHI (r5v31 androidx.paging.i1<Key, Value>) = (r5v21 androidx.paging.i1<Key, Value>), (r5v32 androidx.paging.i1<Key, Value>), (r5v32 androidx.paging.i1<Key, Value>) binds: [B:73:0x0340, B:79:0x0377, B:80:0x0379] A[DONT_GENERATE, DONT_INLINE]
                  0x037c: PHI (r6v18 androidx.paging.z0) = (r6v14 androidx.paging.z0), (r6v19 androidx.paging.z0), (r6v19 androidx.paging.z0) binds: [B:73:0x0340, B:79:0x0377, B:80:0x0379] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:88:0x038f A[PHI: r1 r12 r14
                  0x038f: PHI (r1v28 kotlinx.coroutines.s0) = (r1v7 kotlinx.coroutines.s0), (r1v32 kotlinx.coroutines.s0) binds: [B:57:0x02b8, B:81:0x037c] A[DONT_GENERATE, DONT_INLINE]
                  0x038f: PHI (r12v29 androidx.paging.z0) = (r12v7 androidx.paging.z0), (r12v33 androidx.paging.z0) binds: [B:57:0x02b8, B:81:0x037c] A[DONT_GENERATE, DONT_INLINE]
                  0x038f: PHI (r14v31 androidx.paging.i1<Key, Value>) = (r14v9 androidx.paging.i1<Key, Value>), (r14v32 androidx.paging.i1<Key, Value>) binds: [B:57:0x02b8, B:81:0x037c] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:90:0x039b  */
                /* JADX WARN: Code duplicated, block: B:92:0x039f  */
                /* JADX WARN: Code duplicated, block: B:95:0x03c5  */
                /* JADX WARN: Code duplicated, block: B:98:0x03ed  */
                /* JADX WARN: Code duplicated, block: B:99:0x03f0  */
                /* JADX WARN: Code restructure failed: missing block: B:121:0x04a8, code lost:
                
                    if (r12.h(null, r13) == r0) goto L168;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r12v0, types: [androidx.paging.i1$j$c$a, androidx.paging.i1$j$c$a<T>, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r12v1, types: [kotlinx.coroutines.sync.a] */
                /* JADX WARN: Type inference failed for: r12v102 */
                /* JADX WARN: Type inference failed for: r12v103 */
                /* JADX WARN: Type inference failed for: r12v105 */
                /* JADX WARN: Type inference failed for: r12v106 */
                /* JADX WARN: Type inference failed for: r12v108 */
                /* JADX WARN: Type inference failed for: r12v109 */
                /* JADX WARN: Type inference failed for: r12v14, types: [kotlinx.coroutines.sync.a] */
                /* JADX WARN: Type inference failed for: r12v2, types: [kotlinx.coroutines.sync.a] */
                /* JADX WARN: Type inference failed for: r12v3, types: [kotlinx.coroutines.sync.a] */
                /* JADX WARN: Type inference failed for: r12v42, types: [kotlinx.coroutines.sync.a] */
                /* JADX WARN: Type inference failed for: r12v74, types: [kotlinx.coroutines.sync.a] */
                /* JADX WARN: Type inference failed for: r5v1 */
                /* JADX WARN: Type inference failed for: r5v2, types: [androidx.paging.i1$j$c$a] */
                /* JADX WARN: Type inference failed for: r5v73 */
                @Override // kotlinx.coroutines.flow.j
                @org.jetbrains.annotations.Nullable
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(@org.jetbrains.annotations.NotNull kotlin.Unit r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r14) {
                    /*
                        Method dump skipped, instruction units count: 1594
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.paging.i1.j.c.a.emit(kotlin.Unit, kotlin.coroutines.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(kotlinx.coroutines.channels.p<Unit> pVar, i1<Key, Value> i1Var, kotlin.coroutines.d<? super c> dVar) {
                super(2, dVar);
                this.f72224c = pVar;
                this.f72225d = i1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                c cVar = new c(this.f72224c, this.f72225d, dVar);
                cVar.f72223b = obj;
                return cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f72222a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f72223b;
                    kotlinx.coroutines.flow.i iVarZ = kotlinx.coroutines.flow.k.Z(this.f72224c);
                    a aVar = new a(this.f72225d, s0Var);
                    this.f72222a = 1;
                    if (iVarZ.collect(aVar, this) == objL) {
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
            @Nullable
            public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
                return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(i1<Key, Value> i1Var, kotlin.coroutines.d<? super j> dVar) {
            super(2, dVar);
            this.f72210f = i1Var;
            int i10 = 0 >> 2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            j jVar = new j(this.f72210f, dVar);
            jVar.f72209e = obj;
            return jVar;
        }

        /* JADX WARN: Code duplicated, block: B:32:0x0102  */
        /* JADX WARN: Code duplicated, block: B:37:0x011e  */
        /* JADX WARN: Code duplicated, block: B:41:0x0139  */
        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a3 a3Var;
            w2<Key, Value> w2VarY;
            j2<Key, Value> j2Var;
            k1.a aVar;
            kotlinx.coroutines.sync.a aVar2;
            a3 a3Var2;
            w2<Key, Value> w2Var;
            i1<Key, Value> i1Var;
            a3 a3Var3;
            k1.a aVar3;
            kotlinx.coroutines.sync.a aVar4;
            a3 a3Var4;
            k1.a aVar5;
            x0 x0VarA;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f72208d;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        aVar2 = (kotlinx.coroutines.sync.a) this.f72207c;
                        aVar = (k1.a) this.f72206b;
                        w2Var = (w2) this.f72205a;
                        a3Var2 = (a3) this.f72209e;
                        ResultKt.m(obj);
                    } else {
                        if (i10 == 2) {
                            a3Var3 = (a3) this.f72209e;
                            ResultKt.m(obj);
                            aVar3 = ((i1) this.f72210f).f72150k;
                            aVar4 = aVar3.f72324b;
                            this.f72209e = a3Var3;
                            this.f72205a = aVar3;
                            this.f72206b = aVar4;
                            this.f72208d = 3;
                            if (aVar4.h(null, this) != objL) {
                                a3Var4 = a3Var3;
                                aVar5 = aVar3;
                            }
                            return objL;
                        }
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlinx.coroutines.sync.a aVar6 = (kotlinx.coroutines.sync.a) this.f72206b;
                        aVar5 = (k1.a) this.f72205a;
                        a3Var4 = (a3) this.f72209e;
                        ResultKt.m(obj);
                        aVar4 = aVar6;
                    }
                    try {
                        x0VarA = aVar5.f72325c.p().a(a1.REFRESH);
                        aVar4.i(null);
                        if (!(x0VarA instanceof x0.a)) {
                            this.f72210f.G(a3Var4);
                        }
                        return Unit.f312394a;
                    } catch (Throwable th2) {
                        aVar4.i(null);
                        throw th2;
                    }
                }
                ResultKt.m(obj);
                a3Var = (a3) this.f72209e;
                if (!((i1) this.f72210f).f72148i.compareAndSet(false, true)) {
                    throw new IllegalStateException("Attempt to collect twice from pageEventFlow, which is an illegal operation. Did you forget to call Flow<PagingData<*>>.cachedIn(coroutineScope)?");
                }
                kotlinx.coroutines.k.f(a3Var, null, null, new a(this.f72210f, a3Var, null), 3, null);
                kotlinx.coroutines.channels.p pVarD = kotlinx.coroutines.channels.s.d(0, null, null, 6, null);
                kotlinx.coroutines.k.f(a3Var, null, null, new b(this.f72210f, pVarD, null), 3, null);
                kotlinx.coroutines.k.f(a3Var, null, null, new c(pVarD, this.f72210f, null), 3, null);
                w2VarY = this.f72210f.y();
                if (w2VarY != null) {
                    i1<Key, Value> i1Var2 = this.f72210f;
                    j2Var = ((i1) i1Var2).f72145f;
                    if (j2Var == null) {
                        k1.a aVar7 = ((i1) i1Var2).f72150k;
                        kotlinx.coroutines.sync.a aVar8 = aVar7.f72324b;
                        this.f72209e = a3Var;
                        this.f72205a = w2VarY;
                        this.f72206b = aVar7;
                        this.f72207c = aVar8;
                        this.f72208d = 1;
                        if (aVar8.h(null, this) != objL) {
                            aVar = aVar7;
                            aVar2 = aVar8;
                            a3Var2 = a3Var;
                            w2Var = w2VarY;
                        }
                    } else {
                        w2VarY.d(j2Var);
                        i1Var = this.f72210f;
                        this.f72209e = a3Var;
                        this.f72205a = null;
                        this.f72206b = null;
                        this.f72207c = null;
                        this.f72208d = 2;
                        if (i1Var.t(this) != objL) {
                            a3Var3 = a3Var;
                            aVar3 = ((i1) this.f72210f).f72150k;
                            aVar4 = aVar3.f72324b;
                            this.f72209e = a3Var3;
                            this.f72205a = aVar3;
                            this.f72206b = aVar4;
                            this.f72208d = 3;
                            if (aVar4.h(null, this) != objL) {
                                a3Var4 = a3Var3;
                                aVar5 = aVar3;
                                x0VarA = aVar5.f72325c.p().a(a1.REFRESH);
                                aVar4.i(null);
                                if (!(x0VarA instanceof x0.a)) {
                                    this.f72210f.G(a3Var4);
                                }
                                return Unit.f312394a;
                            }
                        }
                    }
                } else {
                    i1Var = this.f72210f;
                    this.f72209e = a3Var;
                    this.f72205a = null;
                    this.f72206b = null;
                    this.f72207c = null;
                    this.f72208d = 2;
                    if (i1Var.t(this) != objL) {
                        a3Var3 = a3Var;
                        aVar3 = ((i1) this.f72210f).f72150k;
                        aVar4 = aVar3.f72324b;
                        this.f72209e = a3Var3;
                        this.f72205a = aVar3;
                        this.f72206b = aVar4;
                        this.f72208d = 3;
                        if (aVar4.h(null, this) != objL) {
                            a3Var4 = a3Var3;
                            aVar5 = aVar3;
                            x0VarA = aVar5.f72325c.p().a(a1.REFRESH);
                            aVar4.i(null);
                            if (!(x0VarA instanceof x0.a)) {
                                this.f72210f.G(a3Var4);
                            }
                            return Unit.f312394a;
                        }
                    }
                }
                return objL;
                j2<Key, Value> j2VarG = aVar.f72325c.g(null);
                aVar2.i(null);
                a3 a3Var5 = a3Var2;
                j2Var = j2VarG;
                w2VarY = w2Var;
                a3Var = a3Var5;
                w2VarY.d(j2Var);
                i1Var = this.f72210f;
                this.f72209e = a3Var;
                this.f72205a = null;
                this.f72206b = null;
                this.f72207c = null;
                this.f72208d = 2;
                if (i1Var.t(this) != objL) {
                    a3Var3 = a3Var;
                    aVar3 = ((i1) this.f72210f).f72150k;
                    aVar4 = aVar3.f72324b;
                    this.f72209e = a3Var3;
                    this.f72205a = aVar3;
                    this.f72206b = aVar4;
                    this.f72208d = 3;
                    if (aVar4.h(null, this) != objL) {
                        a3Var4 = a3Var3;
                        aVar5 = aVar3;
                        x0VarA = aVar5.f72325c.p().a(a1.REFRESH);
                        aVar4.i(null);
                        if (!(x0VarA instanceof x0.a)) {
                            this.f72210f.G(a3Var4);
                        }
                        return Unit.f312394a;
                    }
                }
                return objL;
            } catch (Throwable th3) {
                aVar2.i(null);
                throw th3;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull a3<g1<Value>> a3Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((j) create(a3Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$2", f = "PageFetcherSnapshot.kt", i = {0, 0}, l = {646, 179}, m = "invokeSuspend", n = {"this_$iv", "$this$withLock_u24default$iv$iv"}, s = {"L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nPageFetcherSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot$pageEventFlow$2\n+ 2 PageFetcherSnapshotState.kt\nandroidx/paging/PageFetcherSnapshotState$Holder\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,639:1\n390#2:640\n391#2:649\n120#3,8:641\n129#3:650\n*S KotlinDebug\n*F\n+ 1 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot$pageEventFlow$2\n*L\n179#1:640\n179#1:649\n179#1:641,8\n179#1:650\n*E\n"})
    static final class k extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.flow.j<? super g1<Value>>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f72240a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f72241b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f72242c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f72243d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ i1<Key, Value> f72244e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(i1<Key, Value> i1Var, kotlin.coroutines.d<? super k> dVar) {
            super(2, dVar);
            this.f72244e = i1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            k kVar = new k(this.f72244e, dVar);
            kVar.f72243d = obj;
            return kVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
        
            if (r1.emit(r2, r7) == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.f72242c
                r2 = 1
                r6 = 6
                r3 = 2
                r4 = 0
                if (r1 == 0) goto L30
                if (r1 == r2) goto L1e
                r6 = 3
                if (r1 != r3) goto L16
                kotlin.ResultKt.m(r8)
                r6 = 0
                goto L7c
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L1e:
                java.lang.Object r1 = r7.f72241b
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                java.lang.Object r2 = r7.f72240a
                r6 = 1
                kotlinx.coroutines.sync.a r2 = (kotlinx.coroutines.sync.a) r2
                java.lang.Object r5 = r7.f72243d
                androidx.paging.k1$a r5 = (androidx.paging.k1.a) r5
                r6 = 4
                kotlin.ResultKt.m(r8)
                goto L55
            L30:
                kotlin.ResultKt.m(r8)
                java.lang.Object r8 = r7.f72243d
                r1 = r8
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                androidx.paging.i1<Key, Value> r8 = r7.f72244e
                androidx.paging.k1$a r5 = androidx.paging.i1.k(r8)
                r6 = 4
                kotlinx.coroutines.sync.a r8 = androidx.paging.k1.a.a(r5)
                r6 = 6
                r7.f72243d = r5
                r7.f72240a = r8
                r6 = 7
                r7.f72241b = r1
                r7.f72242c = r2
                java.lang.Object r2 = r8.h(r4, r7)
                if (r2 != r0) goto L54
                goto L7b
            L54:
                r2 = r8
            L55:
                r6 = 4
                androidx.paging.k1 r8 = androidx.paging.k1.a.b(r5)     // Catch: java.lang.Throwable -> L7f
                androidx.paging.e1 r8 = r8.p()     // Catch: java.lang.Throwable -> L7f
                r6 = 1
                androidx.paging.z0 r8 = r8.j()     // Catch: java.lang.Throwable -> L7f
                r6 = 2
                r2.i(r4)
                androidx.paging.g1$c r2 = new androidx.paging.g1$c
                r2.<init>(r8, r4, r3, r4)
                r7.f72243d = r4
                r7.f72240a = r4
                r7.f72241b = r4
                r6 = 5
                r7.f72242c = r3
                java.lang.Object r7 = r1.emit(r2, r7)
                if (r7 != r0) goto L7c
            L7b:
                return r0
            L7c:
                kotlin.Unit r7 = kotlin.Unit.f312394a
                return r7
            L7f:
                r7 = move-exception
                r6 = 7
                r2.i(r4)
                r6 = 2
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.i1.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull kotlinx.coroutines.flow.j<? super g1<Value>> jVar, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((k) create(jVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1", f = "PageFetcherSnapshot.kt", i = {}, l = {220}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nPageFetcherSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot$startConsumingHints$1\n+ 2 PagingLogger.kt\nandroidx/paging/PagingLoggerKt\n*L\n1#1,639:1\n32#2,10:640\n*S KotlinDebug\n*F\n+ 1 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot$startConsumingHints$1\n*L\n225#1:640,10\n*E\n"})
    static final class l extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f72245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i1<Key, Value> f72246b;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1$jumpHint$1", f = "PageFetcherSnapshot.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<j3, kotlin.coroutines.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f72247a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f72248b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ i1<Key, Value> f72249c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i1<Key, Value> i1Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f72249c = i1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f72249c, dVar);
                aVar.f72248b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f72247a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                j3 j3Var = (j3) this.f72248b;
                return kotlin.coroutines.jvm.internal.b.a(j3Var.d() * (-1) > ((i1) this.f72249c).f72142c.f72688f || j3Var.c() * (-1) > ((i1) this.f72249c).f72142c.f72688f);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull j3 j3Var, @Nullable kotlin.coroutines.d<? super Boolean> dVar) {
                return ((a) create(j3Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(i1<Key, Value> i1Var, kotlin.coroutines.d<? super l> dVar) {
            super(2, dVar);
            this.f72246b = i1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new l(this.f72246b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f72245a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.i iVarC1 = kotlinx.coroutines.flow.k.c1(((i1) this.f72246b).f72147h.c(a1.APPEND), ((i1) this.f72246b).f72147h.c(a1.PREPEND));
                a aVar = new a(this.f72246b, null);
                this.f72245a = 1;
                obj = kotlinx.coroutines.flow.k.z0(iVarC1, aVar, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            j3 j3Var = (j3) obj;
            if (j3Var != null) {
                i1<Key, Value> i1Var = this.f72246b;
                f2 f2Var = f2.f71875a;
                if (f2Var.a(3)) {
                    f2Var.b(3, "Jump triggered on PagingSource " + i1Var.x() + " by " + j3Var, null);
                }
                ((i1) this.f72246b).f72146g.invoke();
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((l) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$2", f = "PageFetcherSnapshot.kt", i = {0, 0}, l = {646, 233}, m = "invokeSuspend", n = {"this_$iv", "$this$withLock_u24default$iv$iv"}, s = {"L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nPageFetcherSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot$startConsumingHints$2\n+ 2 PageFetcherSnapshotState.kt\nandroidx/paging/PageFetcherSnapshotState$Holder\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,639:1\n390#2:640\n391#2:649\n120#3,8:641\n129#3:650\n*S KotlinDebug\n*F\n+ 1 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot$startConsumingHints$2\n*L\n232#1:640\n232#1:649\n232#1:641,8\n232#1:650\n*E\n"})
    static final class m extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f72250a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f72251b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f72252c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f72253d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ i1<Key, Value> f72254e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(i1<Key, Value> i1Var, kotlin.coroutines.d<? super m> dVar) {
            super(2, dVar);
            this.f72254e = i1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new m(this.f72254e, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
        
            if (r1.r(r8, r3, r7) == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
            /*
                r7 = this;
                r6 = 5
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.f72253d
                r2 = 3
                r2 = 2
                r3 = 1
                r6 = 1
                r4 = 0
                if (r1 == 0) goto L33
                r6 = 6
                if (r1 == r3) goto L21
                if (r1 != r2) goto L17
                kotlin.ResultKt.m(r8)
                goto L74
            L17:
                r6 = 4
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r6 = 0
                r7.<init>(r8)
                throw r7
            L21:
                java.lang.Object r1 = r7.f72252c
                androidx.paging.i1 r1 = (androidx.paging.i1) r1
                java.lang.Object r3 = r7.f72251b
                r6 = 2
                kotlinx.coroutines.sync.a r3 = (kotlinx.coroutines.sync.a) r3
                java.lang.Object r5 = r7.f72250a
                androidx.paging.k1$a r5 = (androidx.paging.k1.a) r5
                kotlin.ResultKt.m(r8)
                r6 = 3
                goto L54
            L33:
                kotlin.ResultKt.m(r8)
                androidx.paging.i1<Key, Value> r1 = r7.f72254e
                r6 = 4
                androidx.paging.k1$a r5 = androidx.paging.i1.k(r1)
                kotlinx.coroutines.sync.a r8 = androidx.paging.k1.a.a(r5)
                r6 = 7
                r7.f72250a = r5
                r7.f72251b = r8
                r7.f72252c = r1
                r7.f72253d = r3
                java.lang.Object r3 = r8.h(r4, r7)
                if (r3 != r0) goto L52
                r6 = 4
                goto L73
            L52:
                r3 = r8
                r3 = r8
            L54:
                r6 = 7
                androidx.paging.k1 r8 = androidx.paging.k1.a.b(r5)     // Catch: java.lang.Throwable -> L77
                kotlinx.coroutines.flow.i r8 = r8.f()     // Catch: java.lang.Throwable -> L77
                r3.i(r4)
                androidx.paging.a1 r3 = androidx.paging.a1.PREPEND
                r6 = 7
                r7.f72250a = r4
                r7.f72251b = r4
                r6 = 7
                r7.f72252c = r4
                r7.f72253d = r2
                java.lang.Object r7 = androidx.paging.i1.a(r1, r8, r3, r7)
                r6 = 3
                if (r7 != r0) goto L74
            L73:
                return r0
            L74:
                kotlin.Unit r7 = kotlin.Unit.f312394a
                return r7
            L77:
                r7 = move-exception
                r6 = 4
                r3.i(r4)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.i1.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((m) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$3", f = "PageFetcherSnapshot.kt", i = {0, 0}, l = {646, 238}, m = "invokeSuspend", n = {"this_$iv", "$this$withLock_u24default$iv$iv"}, s = {"L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nPageFetcherSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot$startConsumingHints$3\n+ 2 PageFetcherSnapshotState.kt\nandroidx/paging/PageFetcherSnapshotState$Holder\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,639:1\n390#2:640\n391#2:649\n120#3,8:641\n129#3:650\n*S KotlinDebug\n*F\n+ 1 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot$startConsumingHints$3\n*L\n237#1:640\n237#1:649\n237#1:641,8\n237#1:650\n*E\n"})
    static final class n extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f72255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f72256b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f72257c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f72258d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ i1<Key, Value> f72259e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(i1<Key, Value> i1Var, kotlin.coroutines.d<? super n> dVar) {
            super(2, dVar);
            this.f72259e = i1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new n(this.f72259e, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
        
            if (r1.r(r8, r3, r7) == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.f72258d
                r6 = 3
                r2 = 2
                r3 = 1
                r6 = 3
                r4 = 0
                if (r1 == 0) goto L31
                if (r1 == r3) goto L1f
                r6 = 3
                if (r1 != r2) goto L16
                kotlin.ResultKt.m(r8)
                goto L76
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r6 = 1
                r7.<init>(r8)
                throw r7
            L1f:
                java.lang.Object r1 = r7.f72257c
                androidx.paging.i1 r1 = (androidx.paging.i1) r1
                java.lang.Object r3 = r7.f72256b
                r6 = 5
                kotlinx.coroutines.sync.a r3 = (kotlinx.coroutines.sync.a) r3
                java.lang.Object r5 = r7.f72255a
                r6 = 5
                androidx.paging.k1$a r5 = (androidx.paging.k1.a) r5
                kotlin.ResultKt.m(r8)
                goto L55
            L31:
                kotlin.ResultKt.m(r8)
                androidx.paging.i1<Key, Value> r1 = r7.f72259e
                androidx.paging.k1$a r5 = androidx.paging.i1.k(r1)
                r6 = 0
                kotlinx.coroutines.sync.a r8 = androidx.paging.k1.a.a(r5)
                r7.f72255a = r5
                r6 = 2
                r7.f72256b = r8
                r6 = 0
                r7.f72257c = r1
                r6 = 6
                r7.f72258d = r3
                java.lang.Object r3 = r8.h(r4, r7)
                r6 = 1
                if (r3 != r0) goto L53
                r6 = 3
                goto L75
            L53:
                r3 = r8
                r3 = r8
            L55:
                androidx.paging.k1 r8 = androidx.paging.k1.a.b(r5)     // Catch: java.lang.Throwable -> L79
                r6 = 3
                kotlinx.coroutines.flow.i r8 = r8.e()     // Catch: java.lang.Throwable -> L79
                r6 = 6
                r3.i(r4)
                r6 = 4
                androidx.paging.a1 r3 = androidx.paging.a1.APPEND
                r6 = 4
                r7.f72255a = r4
                r7.f72256b = r4
                r7.f72257c = r4
                r6 = 3
                r7.f72258d = r2
                java.lang.Object r7 = androidx.paging.i1.a(r1, r8, r3, r7)
                if (r7 != r0) goto L76
            L75:
                return r0
            L76:
                kotlin.Unit r7 = kotlin.Unit.f312394a
                return r7
            L79:
                r7 = move-exception
                r3.i(r4)
                r6 = 5
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.i1.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((n) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public i1(@Nullable Key key, @NotNull h2<Key, Value> pagingSource, @NotNull w1 config, @NotNull kotlinx.coroutines.flow.i<Unit> retryFlow, @Nullable w2<Key, Value> w2Var, @Nullable j2<Key, Value> j2Var, @NotNull Function0<Unit> jumpCallback) {
        Intrinsics.checkNotNullParameter(pagingSource, "pagingSource");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(retryFlow, "retryFlow");
        Intrinsics.checkNotNullParameter(jumpCallback, "jumpCallback");
        this.f72140a = key;
        this.f72141b = pagingSource;
        this.f72142c = config;
        this.f72143d = retryFlow;
        this.f72144e = w2Var;
        this.f72145f = j2Var;
        this.f72146g = jumpCallback;
        if (config.f72688f != Integer.MIN_VALUE && !pagingSource.getJumpingSupported()) {
            throw new IllegalArgumentException("PagingConfig.jumpThreshold was set, but the associated PagingSource has not marked support for jumps by overriding PagingSource.jumpingSupported to true.");
        }
        this.f72147h = new f0();
        this.f72148i = new AtomicBoolean(false);
        this.f72149j = kotlinx.coroutines.channels.s.d(-2, null, null, 6, null);
        this.f72150k = new k1.a<>(config);
        kotlinx.coroutines.a0 a0VarC = kotlinx.coroutines.u2.c(null, 1, null);
        this.f72151l = a0VarC;
        this.f72152m = kotlinx.coroutines.flow.k.o1(androidx.paging.k.a(a0VarC, new j(this, null)), new k(this, null));
    }

    private final String A(a1 a1Var, Key key, h2.b<Key, Value> bVar) {
        if (bVar == null) {
            return "End " + a1Var + " with loadkey " + key + ". Load CANCELLED.";
        }
        return "End " + a1Var + " with loadKey " + key + ". Returned " + bVar;
    }

    private final Key B(k1<Key, Value> k1Var, a1 a1Var, int i10, int i11) {
        if (i10 == k1Var.j(a1Var) && !(k1Var.p().a(a1Var) instanceof x0.a) && i11 < this.f72142c.f72684b) {
            return a1Var == a1.PREPEND ? (Key) ((h2.b.c) CollectionsKt.first((List) k1Var.m())).A() : (Key) ((h2.b.c) CollectionsKt.last((List) k1Var.m())).w();
        }
        return null;
    }

    private final void C() {
        q();
        this.f72141b.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object D(a1 a1Var, j3 j3Var, kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        if (b.f72154a[a1Var.ordinal()] == 1) {
            Object objT = t(dVar);
            return objT == kotlin.coroutines.intrinsics.b.l() ? objT : Unit.f312394a;
        }
        if (j3Var == null) {
            throw new IllegalStateException("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint");
        }
        this.f72147h.a(a1Var, j3Var);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object E(k1<Key, Value> k1Var, a1 a1Var, x0.a aVar, kotlin.coroutines.d<? super Unit> dVar) {
        if (Intrinsics.areEqual(k1Var.p().a(a1Var), aVar)) {
            return Unit.f312394a;
        }
        k1Var.p().f(a1Var, aVar);
        Object objG = this.f72149j.G(new g1.c(k1Var.p().j(), null), dVar);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object F(k1<Key, Value> k1Var, a1 a1Var, kotlin.coroutines.d<? super Unit> dVar) {
        x0 x0VarA = k1Var.p().a(a1Var);
        x0.b bVar = x0.b.f72692b;
        if (Intrinsics.areEqual(x0VarA, bVar)) {
            return Unit.f312394a;
        }
        k1Var.p().f(a1Var, bVar);
        Object objG = this.f72149j.G(new g1.c(k1Var.p().j(), null), dVar);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(kotlinx.coroutines.s0 s0Var) {
        if (this.f72142c.f72688f != Integer.MIN_VALUE) {
            kotlinx.coroutines.k.f(s0Var, null, null, new l(this, null), 3, null);
        }
        kotlinx.coroutines.k.f(s0Var, null, null, new m(this, null), 3, null);
        kotlinx.coroutines.k.f(s0Var, null, null, new n(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r(kotlinx.coroutines.flow.i<Integer> iVar, a1 a1Var, kotlin.coroutines.d<? super Unit> dVar) {
        Object objCollect = kotlinx.coroutines.flow.k.Y(d0.f(d0.h(iVar, new c(null, this, a1Var)), new d(a1Var, null))).collect(new e(this, a1Var), dVar);
        return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:105:0x0291  */
    /* JADX WARN: Code duplicated, block: B:107:0x0295  */
    /* JADX WARN: Code duplicated, block: B:109:0x029d  */
    /* JADX WARN: Code duplicated, block: B:113:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:122:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:124:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:126:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:43:0x0114  */
    /* JADX WARN: Code duplicated, block: B:47:0x0148  */
    /* JADX WARN: Code duplicated, block: B:50:0x014f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0168  */
    /* JADX WARN: Code duplicated, block: B:56:0x0190 A[Catch: all -> 0x019e, TryCatch #4 {all -> 0x019e, blocks: (B:54:0x016c, B:56:0x0190, B:59:0x01a1, B:61:0x01aa), top: B:141:0x016c }] */
    /* JADX WARN: Code duplicated, block: B:61:0x01aa A[Catch: all -> 0x019e, TRY_LEAVE, TryCatch #4 {all -> 0x019e, blocks: (B:54:0x016c, B:56:0x0190, B:59:0x01a1, B:61:0x01aa), top: B:141:0x016c }] */
    /* JADX WARN: Code duplicated, block: B:64:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:73:0x0209  */
    /* JADX WARN: Code duplicated, block: B:74:0x020b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0217  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:81:0x021f  */
    /* JADX WARN: Code duplicated, block: B:85:0x022e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0237  */
    /* JADX WARN: Code duplicated, block: B:92:0x0256  */
    /* JADX WARN: Code duplicated, block: B:96:0x0272  */
    /* JADX WARN: Code duplicated, block: B:99:0x027f  */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02e5, code lost:
    
        if (r4.E(r15, r3, r2, r0) == r1) goto L116;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x0114, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.paging.i1] */
    /* JADX WARN: Type inference failed for: r14v0, types: [androidx.paging.i1, androidx.paging.i1<Key, Value>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v19, types: [androidx.paging.i1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r14v3, types: [androidx.paging.i1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v39, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r14v53, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r14v62 */
    /* JADX WARN: Type inference failed for: r14v63 */
    /* JADX WARN: Type inference failed for: r14v65 */
    /* JADX WARN: Type inference failed for: r14v66 */
    /* JADX WARN: Type inference failed for: r14v69 */
    /* JADX WARN: Type inference failed for: r14v70 */
    /* JADX WARN: Type inference failed for: r14v71 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.paging.i1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [androidx.paging.i1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.paging.i1] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.paging.i1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [androidx.paging.i1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(kotlin.coroutines.d<? super kotlin.Unit> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.i1.t(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:143:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:163:0x055f  */
    /* JADX WARN: Code duplicated, block: B:165:0x0563  */
    /* JADX WARN: Code duplicated, block: B:167:0x056c  */
    /* JADX WARN: Code duplicated, block: B:172:0x0585  */
    /* JADX WARN: Code duplicated, block: B:173:0x0588  */
    /* JADX WARN: Code duplicated, block: B:177:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:180:0x05c9 A[Catch: all -> 0x05ff, TRY_LEAVE, TryCatch #8 {all -> 0x05ff, blocks: (B:178:0x05bb, B:180:0x05c9, B:189:0x0605, B:191:0x061c, B:193:0x0628, B:195:0x0630, B:197:0x063d, B:196:0x0637, B:198:0x0640), top: B:262:0x05bb }] */
    /* JADX WARN: Code duplicated, block: B:183:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:191:0x061c A[Catch: all -> 0x05ff, TryCatch #8 {all -> 0x05ff, blocks: (B:178:0x05bb, B:180:0x05c9, B:189:0x0605, B:191:0x061c, B:193:0x0628, B:195:0x0630, B:197:0x063d, B:196:0x0637, B:198:0x0640), top: B:262:0x05bb }] */
    /* JADX WARN: Code duplicated, block: B:195:0x0630 A[Catch: all -> 0x05ff, TryCatch #8 {all -> 0x05ff, blocks: (B:178:0x05bb, B:180:0x05c9, B:189:0x0605, B:191:0x061c, B:193:0x0628, B:195:0x0630, B:197:0x063d, B:196:0x0637, B:198:0x0640), top: B:262:0x05bb }] */
    /* JADX WARN: Code duplicated, block: B:196:0x0637 A[Catch: all -> 0x05ff, TryCatch #8 {all -> 0x05ff, blocks: (B:178:0x05bb, B:180:0x05c9, B:189:0x0605, B:191:0x061c, B:193:0x0628, B:195:0x0630, B:197:0x063d, B:196:0x0637, B:198:0x0640), top: B:262:0x05bb }] */
    /* JADX WARN: Code duplicated, block: B:201:0x066c  */
    /* JADX WARN: Code duplicated, block: B:205:0x0680  */
    /* JADX WARN: Code duplicated, block: B:208:0x068b  */
    /* JADX WARN: Code duplicated, block: B:211:0x0690  */
    /* JADX WARN: Code duplicated, block: B:214:0x069a  */
    /* JADX WARN: Code duplicated, block: B:217:0x069f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:234:0x0700  */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Code duplicated, block: B:87:0x036d  */
    /* JADX WARN: Code duplicated, block: B:89:0x037a  */
    /* JADX WARN: Code duplicated, block: B:90:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:94:0x03c9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v72, types: [androidx.paging.k1] */
    /* JADX WARN: Type inference failed for: r10v3, types: [androidx.paging.j3] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v22, types: [androidx.paging.a1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v49, types: [androidx.paging.a1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v51 */
    /* JADX WARN: Type inference failed for: r11v52 */
    /* JADX WARN: Type inference failed for: r11v55 */
    /* JADX WARN: Type inference failed for: r11v56 */
    /* JADX WARN: Type inference failed for: r11v57 */
    /* JADX WARN: Type inference failed for: r11v58 */
    /* JADX WARN: Type inference failed for: r11v59 */
    /* JADX WARN: Type inference failed for: r11v60 */
    /* JADX WARN: Type inference failed for: r11v61 */
    /* JADX WARN: Type inference failed for: r11v62 */
    /* JADX WARN: Type inference failed for: r11v63 */
    /* JADX WARN: Type inference failed for: r12v12, types: [androidx.paging.i1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v41, types: [androidx.paging.i1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v50 */
    /* JADX WARN: Type inference failed for: r12v51 */
    /* JADX WARN: Type inference failed for: r12v52 */
    /* JADX WARN: Type inference failed for: r12v53 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r13v12, types: [androidx.paging.j3] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v32, types: [java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v34, types: [androidx.paging.a1] */
    /* JADX WARN: Type inference failed for: r13v35, types: [androidx.paging.a1, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r13v50 */
    /* JADX WARN: Type inference failed for: r13v51 */
    /* JADX WARN: Type inference failed for: r13v52 */
    /* JADX WARN: Type inference failed for: r13v53 */
    /* JADX WARN: Type inference failed for: r14v16, types: [androidx.paging.i1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v17, types: [androidx.paging.a1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24, types: [androidx.paging.i1] */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v35, types: [androidx.paging.i1] */
    /* JADX WARN: Type inference failed for: r14v39 */
    /* JADX WARN: Type inference failed for: r14v40 */
    /* JADX WARN: Type inference failed for: r14v41 */
    /* JADX WARN: Type inference failed for: r14v42 */
    /* JADX WARN: Type inference failed for: r14v43 */
    /* JADX WARN: Type inference failed for: r14v44 */
    /* JADX WARN: Type inference failed for: r14v45 */
    /* JADX WARN: Type inference failed for: r14v46 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v6, types: [androidx.paging.i1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [androidx.paging.i1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v100 */
    /* JADX WARN: Type inference failed for: r1v101 */
    /* JADX WARN: Type inference failed for: r1v102 */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v39, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r1v47, types: [androidx.paging.k1] */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v99 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v14, types: [T] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v63 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.paging.a1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r5v57, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v26, types: [androidx.paging.i1] */
    /* JADX WARN: Type inference failed for: r8v35, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v42, types: [androidx.paging.e1] */
    /* JADX WARN: Type inference failed for: r8v45, types: [androidx.paging.e1] */
    /* JADX WARN: Type inference failed for: r8v49, types: [androidx.paging.i1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v52 */
    /* JADX WARN: Type inference failed for: r8v53, types: [androidx.paging.i1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v56 */
    /* JADX WARN: Type inference failed for: r8v57 */
    /* JADX WARN: Type inference failed for: r8v63 */
    /* JADX WARN: Type inference failed for: r8v64 */
    /* JADX WARN: Type inference failed for: r8v65 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:222:0x06cb -> B:260:0x06d1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object u(androidx.paging.a1 r18, androidx.paging.e0 r19, kotlin.coroutines.d<? super kotlin.Unit> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.i1.u(androidx.paging.a1, androidx.paging.e0, kotlin.coroutines.d):java.lang.Object");
    }

    private final h2.a<Key> z(a1 a1Var, Key key) {
        return h2.a.f72092c.a(a1Var, key, a1Var == a1.REFRESH ? this.f72142c.f72686d : this.f72142c.f72683a, this.f72142c.f72685c);
    }

    public final void p(@NotNull j3 viewportHint) {
        Intrinsics.checkNotNullParameter(viewportHint, "viewportHint");
        this.f72147h.d(viewportHint);
    }

    public final void q() {
        boolean z10 = false & true;
        kotlinx.coroutines.p2.a.b(this.f72151l, null, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Nullable
    public final Object s(@NotNull kotlin.coroutines.d<? super j2<Key, Value>> dVar) {
        g gVar;
        kotlinx.coroutines.sync.a aVar;
        k1.a<Key, Value> aVar2;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i10 = gVar.f72181f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f72181f = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, dVar);
            }
        } else {
            gVar = new g(this, dVar);
        }
        Object obj = gVar.f72179d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = gVar.f72181f;
        if (i11 == 0) {
            ResultKt.m(obj);
            k1.a<Key, Value> aVar3 = this.f72150k;
            aVar = ((k1.a) aVar3).f72324b;
            gVar.f72176a = this;
            gVar.f72177b = aVar3;
            gVar.f72178c = aVar;
            gVar.f72181f = 1;
            if (aVar.h(null, gVar) == objL) {
                return objL;
            }
            aVar2 = aVar3;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinx.coroutines.sync.a aVar4 = (kotlinx.coroutines.sync.a) gVar.f72178c;
            aVar2 = (k1.a) gVar.f72177b;
            i1<Key, Value> i1Var = (i1) gVar.f72176a;
            ResultKt.m(obj);
            aVar = aVar4;
            this = i1Var;
        }
        try {
            return ((k1.a) aVar2).f72325c.g(this.f72147h.b());
        } finally {
            aVar.i(null);
        }
    }

    @Nullable
    public final Key v() {
        return this.f72140a;
    }

    @NotNull
    public final kotlinx.coroutines.flow.i<g1<Value>> w() {
        return this.f72152m;
    }

    @NotNull
    public final h2<Key, Value> x() {
        return this.f72141b;
    }

    @Nullable
    public final w2<Key, Value> y() {
        return this.f72144e;
    }

    public /* synthetic */ i1(Object obj, h2 h2Var, w1 w1Var, kotlinx.coroutines.flow.i iVar, w2 w2Var, j2 j2Var, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, h2Var, w1Var, iVar, (i10 & 16) != 0 ? null : w2Var, (i10 & 32) != 0 ? null : j2Var, (i10 & 64) != 0 ? a.f72153a : function0);
    }
}
