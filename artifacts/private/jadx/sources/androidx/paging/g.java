package androidx.paging;

import android.os.Handler;
import android.os.Looper;
import com.devtodev.core.data.metrics.MetricConsts;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nAsyncPagingDataDiffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncPagingDataDiffer.kt\nandroidx/paging/AsyncPagingDataDiffer\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,668:1\n39#2,6:669\n230#3,5:675\n230#3,5:680\n1#4:685\n*S KotlinDebug\n*F\n+ 1 AsyncPagingDataDiffer.kt\nandroidx/paging/AsyncPagingDataDiffer\n*L\n507#1:669,6\n457#1:675,5\n462#1:680,5\n*E\n"})
public final class g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.recyclerview.widget.k.f<T> f71879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.recyclerview.widget.v f71880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f71881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f71882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.flow.k0<Boolean> f71883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f71884f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final AtomicReference<l2<T>> f71885g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final a2<T> f71886h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final AtomicInteger f71887i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.flow.i<n> f71888j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.flow.i<Unit> f71889k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final AtomicReference<Function1<n, Unit>> f71890l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final CopyOnWriteArrayList<Function1<n, Unit>> f71891m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final Function1<n, Unit> f71892n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f71893o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private final b f71894p;

    static final class a extends kotlin.jvm.internal.l0 implements Function0<Handler> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f71895a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    @SourceDebugExtension({"SMAP\nAsyncPagingDataDiffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncPagingDataDiffer.kt\nandroidx/paging/AsyncPagingDataDiffer$LoadStateListenerRunnable$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,668:1\n1855#2,2:669\n*S KotlinDebug\n*F\n+ 1 AsyncPagingDataDiffer.kt\nandroidx/paging/AsyncPagingDataDiffer$LoadStateListenerRunnable$1\n*L\n643#1:669,2\n*E\n"})
    public static final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private AtomicReference<n> f71896a = new AtomicReference<>(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g<T> f71897b;

        b(g<T> gVar) {
            this.f71897b = gVar;
        }

        @NotNull
        public final AtomicReference<n> a() {
            return this.f71896a;
        }

        public final void b(@NotNull AtomicReference<n> atomicReference) {
            Intrinsics.checkNotNullParameter(atomicReference, "<set-?>");
            this.f71896a = atomicReference;
        }

        @Override // java.lang.Runnable
        public void run() {
            n nVar = this.f71896a.get();
            if (nVar != null) {
                Iterator<T> it = ((g) this.f71897b).f71891m.iterator();
                while (it.hasNext()) {
                    ((Function1) it.next()).invoke(nVar);
                }
            }
        }
    }

    @SourceDebugExtension({"SMAP\nAsyncPagingDataDiffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncPagingDataDiffer.kt\nandroidx/paging/AsyncPagingDataDiffer$internalLoadStateListener$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,668:1\n1855#2,2:669\n*S KotlinDebug\n*F\n+ 1 AsyncPagingDataDiffer.kt\nandroidx/paging/AsyncPagingDataDiffer$internalLoadStateListener$1\n*L\n623#1:669,2\n*E\n"})
    static final class c extends kotlin.jvm.internal.l0 implements Function1<n, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g<T> f71898a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(g<T> gVar) {
            super(1);
            this.f71898a = gVar;
        }

        public final void c(@NotNull n loadState) {
            Intrinsics.checkNotNullParameter(loadState, "loadState");
            if (!this.f71898a.n().getValue().booleanValue()) {
                Iterator<T> it = ((g) this.f71898a).f71891m.iterator();
                while (it.hasNext()) {
                    ((Function1) it.next()).invoke(loadState);
                }
            } else {
                Handler handlerS = this.f71898a.s();
                g<T> gVar = this.f71898a;
                handlerS.removeCallbacks(((g) gVar).f71894p);
                ((g) gVar).f71894p.a().set(loadState);
                handlerS.post(((g) gVar).f71894p);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(n nVar) {
            c(nVar);
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.AsyncPagingDataDiffer$loadStateFlow$1$1", f = "AsyncPagingDataDiffer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<Boolean, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f71899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ boolean f71900b;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f71900b = ((Boolean) obj).booleanValue();
            return dVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, kotlin.coroutines.d<? super Boolean> dVar) {
            return invoke(bool.booleanValue(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f71899a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return kotlin.coroutines.jvm.internal.b.a(!this.f71900b);
        }

        @Nullable
        public final Object invoke(boolean z10, @Nullable kotlin.coroutines.d<? super Boolean> dVar) {
            return ((d) create(Boolean.valueOf(z10), dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class e extends a2<T> {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ g<T> f71901m;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.AsyncPagingDataDiffer$presenter$1", f = "AsyncPagingDataDiffer.kt", i = {0, 0}, l = {183}, m = "presentPagingDataEvent", n = {"this", "$this$presentPagingDataEvent_u24lambda_u240"}, s = {"L$0", "L$3"})
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f71902a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f71903b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f71904c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f71905d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f71906e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f71908g;

            a(kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f71906e = obj;
                this.f71908g |= Integer.MIN_VALUE;
                return e.this.v(null, this);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$2$diffResult$1", f = "AsyncPagingDataDiffer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super k2>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f71909a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ z1.e<T> f71910b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ g<T> f71911c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(z1.e<T> eVar, g<T> gVar, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f71910b = eVar;
                this.f71911c = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new b(this.f71910b, this.f71911c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f71909a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return m2.a(this.f71910b.b(), this.f71910b.a(), ((g) this.f71911c).f71879a);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super k2> dVar) {
                return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(g<T> gVar, CoroutineContext coroutineContext) {
            super(coroutineContext, null, 2, 0 == true ? 1 : 0);
            this.f71901m = gVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        @Override // androidx.paging.a2
        @Nullable
        public Object v(@NotNull z1<T> z1Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
            a aVar;
            g<T> gVar;
            e eVar;
            z1.e eVar2;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i10 = aVar.f71908g;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f71908g = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(dVar);
                }
            } else {
                aVar = new a(dVar);
            }
            Object obj = aVar.f71906e;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = aVar.f71908g;
            if (i11 == 0) {
                ResultKt.m(obj);
                if (z1Var instanceof z1.e) {
                    g<T> gVar2 = this.f71901m;
                    z1.e eVar3 = (z1.e) z1Var;
                    if (eVar3.b().getSize() == 0) {
                        if (eVar3.a().getSize() > 0) {
                            ((g) gVar2).f71880b.b(0, eVar3.a().getSize());
                        }
                    } else if (eVar3.a().getSize() != 0) {
                        ((g) gVar2).f71885g.set(eVar3.b());
                        try {
                            CoroutineContext coroutineContext = ((g) gVar2).f71882d;
                            b bVar = new b(eVar3, gVar2, null);
                            aVar.f71902a = this;
                            aVar.f71903b = z1Var;
                            aVar.f71904c = gVar2;
                            aVar.f71905d = eVar3;
                            aVar.f71908g = 1;
                            Object objH = kotlinx.coroutines.i.h(coroutineContext, bVar, aVar);
                            if (objH == objL) {
                                return objL;
                            }
                            obj = objH;
                            gVar = gVar2;
                            eVar = this;
                            eVar2 = eVar3;
                        } catch (Throwable th2) {
                            th = th2;
                            gVar = gVar2;
                            ((g) gVar).f71885g.set(null);
                            throw th;
                        }
                    } else if (eVar3.b().getSize() > 0) {
                        ((g) gVar2).f71880b.c(0, eVar3.b().getSize());
                    }
                } else if (z1Var instanceof z1.d) {
                    g<T> gVar3 = this.f71901m;
                    z1.d dVar2 = (z1.d) z1Var;
                    int size = dVar2.a().size();
                    int iMin = Math.min(dVar2.c(), size);
                    int iC = dVar2.c() - iMin;
                    int i12 = size - iMin;
                    if (iMin > 0) {
                        ((g) gVar3).f71880b.a(iC, iMin, null);
                    }
                    if (i12 > 0) {
                        ((g) gVar3).f71880b.b(0, i12);
                    }
                    int iB = (dVar2.b() - dVar2.c()) + iMin;
                    if (iB > 0) {
                        ((g) gVar3).f71880b.b(0, iB);
                    } else if (iB < 0) {
                        ((g) gVar3).f71880b.c(0, -iB);
                    }
                } else if (z1Var instanceof z1.a) {
                    g<T> gVar4 = this.f71901m;
                    z1.a aVar2 = (z1.a) z1Var;
                    int size2 = aVar2.a().size();
                    int iMin2 = Math.min(aVar2.c(), size2);
                    int iD = aVar2.d();
                    int i13 = size2 - iMin2;
                    int i14 = iD + iMin2;
                    if (iMin2 > 0) {
                        ((g) gVar4).f71880b.a(iD, iMin2, null);
                    }
                    if (i13 > 0) {
                        ((g) gVar4).f71880b.b(i14, i13);
                    }
                    int iB2 = (aVar2.b() - aVar2.c()) + iMin2;
                    int iD2 = aVar2.d() + size2 + aVar2.b();
                    if (iB2 > 0) {
                        ((g) gVar4).f71880b.b(iD2 - iB2, iB2);
                    } else if (iB2 < 0) {
                        ((g) gVar4).f71880b.c(iD2, -iB2);
                    }
                } else if (z1Var instanceof z1.c) {
                    g<T> gVar5 = this.f71901m;
                    z1.c cVar = (z1.c) z1Var;
                    int iB3 = (cVar.b() - cVar.a()) - cVar.c();
                    if (iB3 > 0) {
                        ((g) gVar5).f71880b.b(0, iB3);
                    } else if (iB3 < 0) {
                        ((g) gVar5).f71880b.c(0, -iB3);
                    }
                    int iMax = Math.max(0, cVar.c() + iB3);
                    int iB4 = cVar.b() - iMax;
                    if (iB4 > 0) {
                        ((g) gVar5).f71880b.a(iMax, iB4, null);
                    }
                } else if (z1Var instanceof z1.b) {
                    g<T> gVar6 = this.f71901m;
                    z1.b bVar2 = (z1.b) z1Var;
                    int iB5 = (bVar2.b() - bVar2.a()) - bVar2.c();
                    int iD3 = bVar2.d() + bVar2.b();
                    if (iB5 > 0) {
                        ((g) gVar6).f71880b.b(iD3 - iB5, iB5);
                    } else if (iB5 < 0) {
                        ((g) gVar6).f71880b.c(iD3, -iB5);
                    }
                    int iB6 = (bVar2.b() - bVar2.c()) + (iB5 < 0 ? Math.min(bVar2.c(), -iB5) : 0);
                    if (iB6 > 0) {
                        ((g) gVar6).f71880b.a(bVar2.d(), iB6, null);
                    }
                }
                return Unit.f312394a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar2 = (z1.e) aVar.f71905d;
            gVar = (g) aVar.f71904c;
            eVar = (e) aVar.f71902a;
            try {
                ResultKt.m(obj);
            } catch (Throwable th3) {
                th = th3;
                ((g) gVar).f71885g.set(null);
                throw th;
            }
            k2 k2Var = (k2) obj;
            ((g) gVar).f71885g.set(null);
            m2.b(eVar2.b(), ((g) gVar).f71880b, eVar2.a(), k2Var);
            int iC2 = m2.c(eVar2.b(), k2Var, eVar2.a(), ((g) gVar).f71884f);
            ((g) gVar).f71884f = iC2;
            eVar.p(iC2);
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1", f = "AsyncPagingDataDiffer.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1\n*L\n1#1,222:1\n*E\n"})
    public static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.flow.j<? super n>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f71912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f71913b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f71914c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ g f71915d;

        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1$1\n+ 2 AsyncPagingDataDiffer.kt\nandroidx/paging/AsyncPagingDataDiffer\n*L\n1#1,222:1\n508#2,8:223\n*E\n"})
        public static final class a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j<n> f71916a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ g f71917b;

            /* JADX INFO: renamed from: androidx.paging.g$f$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1$1", f = "AsyncPagingDataDiffer.kt", i = {0, 0, 0, 1, 1}, l = {224, 225, 229}, m = "emit", n = {"this", MetricConsts.Install, "$this$loadStateFlow_u24lambda_u242", MetricConsts.Install, "$this$loadStateFlow_u24lambda_u242"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            public static final class C0654a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f71918a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f71919b;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                Object f71921d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                Object f71922e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f71923f;

                public C0654a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f71918a = obj;
                    this.f71919b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(kotlinx.coroutines.flow.j jVar, g gVar) {
                this.f71917b = gVar;
                this.f71916a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x00c7, code lost:
            
                if (r10.emit(r9, r0) == r1) goto L32;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlinx.coroutines.flow.j
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r10) {
                /*
                    Method dump skipped, instruction units count: 206
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.g.f.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(kotlinx.coroutines.flow.i iVar, kotlin.coroutines.d dVar, g gVar) {
            super(2, dVar);
            this.f71914c = iVar;
            this.f71915d = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            f fVar = new f(this.f71914c, dVar, this.f71915d);
            fVar.f71913b = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f71912a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f71913b;
                kotlinx.coroutines.flow.i iVar = this.f71914c;
                a aVar = new a(jVar, this.f71915d);
                this.f71912a = 1;
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
        public final Object invoke(@NotNull kotlinx.coroutines.flow.j<? super n> jVar, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(jVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: androidx.paging.g$g, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.AsyncPagingDataDiffer$submitData$2", f = "AsyncPagingDataDiffer.kt", i = {}, l = {com.rabbitmq.client.a.f264843n}, m = "invokeSuspend", n = {}, s = {})
    static final class C0655g extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f71924a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g<T> f71925b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f71926c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ x1<T> f71927d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0655g(g<T> gVar, int i10, x1<T> x1Var, kotlin.coroutines.d<? super C0655g> dVar) {
            super(2, dVar);
            this.f71925b = gVar;
            this.f71926c = i10;
            this.f71927d = x1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new C0655g(this.f71925b, this.f71926c, this.f71927d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f71924a;
            if (i10 == 0) {
                ResultKt.m(obj);
                if (((g) this.f71925b).f71887i.get() == this.f71926c) {
                    a2<T> a2VarU = this.f71925b.u();
                    x1<T> x1Var = this.f71927d;
                    this.f71924a = 1;
                    if (a2VarU.o(x1Var, this) == objL) {
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
        public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((C0655g) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public g(@NotNull androidx.recyclerview.widget.k.f<T> diffCallback, @NotNull androidx.recyclerview.widget.v updateCallback) {
        this(diffCallback, updateCallback, (CoroutineContext) null, (CoroutineContext) null, 12, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        Intrinsics.checkNotNullParameter(updateCallback, "updateCallback");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler s() {
        return (Handler) this.f71893o.getValue();
    }

    @NotNull
    public final q0<T> A() {
        q0<T> q0VarF;
        l2<T> l2Var = this.f71885g.get();
        return (l2Var == null || (q0VarF = h.f(l2Var)) == null) ? this.f71886h.B() : q0VarF;
    }

    @Nullable
    public final Object B(@NotNull x1<T> x1Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        this.f71887i.incrementAndGet();
        Object objO = this.f71886h.o(x1Var, dVar);
        return objO == kotlin.coroutines.intrinsics.b.l() ? objO : Unit.f312394a;
    }

    public final void C(@NotNull androidx.lifecycle.c0 lifecycle, @NotNull x1<T> pagingData) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(pagingData, "pagingData");
        kotlinx.coroutines.k.f(androidx.lifecycle.m0.a(lifecycle), null, null, new C0655g(this, this.f71887i.incrementAndGet(), pagingData, null), 3, null);
    }

    public final void k(@NotNull Function1<? super n, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.f71890l.get() == null) {
            l(this.f71892n);
        }
        this.f71891m.add(listener);
    }

    public final void l(@NotNull Function1<? super n, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f71890l.set(listener);
        this.f71886h.m(listener);
    }

    public final void m(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f71886h.n(listener);
    }

    @NotNull
    public final kotlinx.coroutines.flow.k0<Boolean> n() {
        return this.f71883e;
    }

    @NotNull
    public final Function1<n, Unit> o() {
        return this.f71892n;
    }

    @androidx.annotation.l0
    @Nullable
    public final T p(@androidx.annotation.g0(from = 0) int i10) {
        Boolean value;
        Boolean value2;
        Boolean value3;
        try {
            kotlinx.coroutines.flow.k0<Boolean> k0Var = this.f71883e;
            do {
                value2 = k0Var.getValue();
                value2.getClass();
            } while (!k0Var.compareAndSet(value2, Boolean.TRUE));
            this.f71884f = i10;
            l2<T> l2Var = this.f71885g.get();
            T tP = l2Var != null ? (T) h.d(l2Var, i10) : this.f71886h.p(i10);
            kotlinx.coroutines.flow.k0<Boolean> k0Var2 = this.f71883e;
            do {
                value3 = k0Var2.getValue();
                value3.getClass();
            } while (!k0Var2.compareAndSet(value3, Boolean.FALSE));
            return tP;
        } catch (Throwable th2) {
            kotlinx.coroutines.flow.k0<Boolean> k0Var3 = this.f71883e;
            do {
                value = k0Var3.getValue();
                value.getClass();
            } while (!k0Var3.compareAndSet(value, Boolean.FALSE));
            throw th2;
        }
    }

    public final int q() {
        l2<T> l2Var = this.f71885g.get();
        return l2Var != null ? l2Var.getSize() : this.f71886h.s();
    }

    @NotNull
    public final kotlinx.coroutines.flow.i<n> r() {
        return this.f71888j;
    }

    @NotNull
    public final kotlinx.coroutines.flow.i<Unit> t() {
        return this.f71889k;
    }

    @NotNull
    public final a2<T> u() {
        return this.f71886h;
    }

    @androidx.annotation.l0
    @Nullable
    public final T v(@androidx.annotation.g0(from = 0) int i10) {
        l2<T> l2Var = this.f71885g.get();
        return l2Var != null ? (T) h.e(l2Var, i10) : this.f71886h.t(i10);
    }

    public final void w() {
        this.f71886h.w();
    }

    public final void x(@NotNull Function1<? super n, Unit> listener) {
        Function1<n, Unit> function1;
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f71891m.remove(listener);
        if (this.f71891m.isEmpty() && (function1 = this.f71890l.get()) != null) {
            this.f71886h.x(function1);
        }
    }

    public final void y(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f71886h.y(listener);
    }

    public final void z() {
        this.f71886h.z();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public g(@NotNull androidx.recyclerview.widget.k.f<T> diffCallback, @NotNull androidx.recyclerview.widget.v updateCallback, @NotNull CoroutineContext mainDispatcher) {
        this(diffCallback, updateCallback, mainDispatcher, (CoroutineContext) null, 8, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        Intrinsics.checkNotNullParameter(updateCallback, "updateCallback");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
    }

    @oj.j
    public g(@NotNull androidx.recyclerview.widget.k.f<T> diffCallback, @NotNull androidx.recyclerview.widget.v updateCallback, @NotNull CoroutineContext mainDispatcher, @NotNull CoroutineContext workerDispatcher) {
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        Intrinsics.checkNotNullParameter(updateCallback, "updateCallback");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(workerDispatcher, "workerDispatcher");
        this.f71879a = diffCallback;
        this.f71880b = updateCallback;
        this.f71881c = mainDispatcher;
        this.f71882d = workerDispatcher;
        this.f71883e = kotlinx.coroutines.flow.b1.a(Boolean.FALSE);
        this.f71885g = new AtomicReference<>(null);
        e eVar = new e(this, mainDispatcher);
        this.f71886h = eVar;
        this.f71887i = new AtomicInteger(0);
        int i10 = 4 ^ (-1);
        this.f71888j = kotlinx.coroutines.flow.k.P0(kotlinx.coroutines.flow.k.K0(new f(kotlinx.coroutines.flow.p.d(kotlinx.coroutines.flow.k.v0(eVar.q()), -1, null, 2, null), null, this)), kotlinx.coroutines.l1.e());
        this.f71889k = eVar.r();
        this.f71890l = new AtomicReference<>(null);
        this.f71891m = new CopyOnWriteArrayList<>();
        this.f71892n = new c(this);
        this.f71893o = kotlin.g0.c(a.f71895a);
        this.f71894p = new b(this);
    }

    public /* synthetic */ g(androidx.recyclerview.widget.k.f fVar, androidx.recyclerview.widget.v vVar, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, vVar, (i10 & 4) != 0 ? kotlinx.coroutines.l1.e() : coroutineContext, (i10 & 8) != 0 ? kotlinx.coroutines.l1.a() : coroutineContext2);
    }

    public /* synthetic */ g(androidx.recyclerview.widget.k.f fVar, androidx.recyclerview.widget.v vVar, kotlinx.coroutines.n0 n0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, vVar, (i10 & 4) != 0 ? kotlinx.coroutines.l1.e() : n0Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Superseded by constructors which accept CoroutineContext")
    public /* synthetic */ g(androidx.recyclerview.widget.k.f diffCallback, androidx.recyclerview.widget.v updateCallback, kotlinx.coroutines.n0 mainDispatcher) {
        this(diffCallback, updateCallback, (CoroutineContext) mainDispatcher, (CoroutineContext) kotlinx.coroutines.l1.a());
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        Intrinsics.checkNotNullParameter(updateCallback, "updateCallback");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
    }

    public /* synthetic */ g(androidx.recyclerview.widget.k.f fVar, androidx.recyclerview.widget.v vVar, kotlinx.coroutines.n0 n0Var, kotlinx.coroutines.n0 n0Var2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, vVar, (i10 & 4) != 0 ? kotlinx.coroutines.l1.e() : n0Var, (i10 & 8) != 0 ? kotlinx.coroutines.l1.a() : n0Var2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Superseded by constructors which accept CoroutineContext")
    public /* synthetic */ g(androidx.recyclerview.widget.k.f diffCallback, androidx.recyclerview.widget.v updateCallback, kotlinx.coroutines.n0 mainDispatcher, kotlinx.coroutines.n0 workerDispatcher) {
        this(diffCallback, updateCallback, (CoroutineContext) mainDispatcher, (CoroutineContext) workerDispatcher);
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        Intrinsics.checkNotNullParameter(updateCallback, "updateCallback");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(workerDispatcher, "workerDispatcher");
    }
}
