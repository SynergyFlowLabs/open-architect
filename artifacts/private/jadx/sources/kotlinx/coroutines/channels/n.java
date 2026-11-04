package kotlinx.coroutines.channels;

import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.http.t1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.b1;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.r1;
import kotlin.text.StringsKt;
import kotlinx.coroutines.c2;
import kotlinx.coroutines.f4;
import kotlinx.coroutines.internal.p1;
import kotlinx.coroutines.internal.w0;
import kotlinx.coroutines.internal.x0;
import kotlinx.coroutines.internal.y0;
import kotlinx.coroutines.internal.z0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannelKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 5 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 6 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 7 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$sendImpl$1\n+ 8 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$receiveImpl$1\n+ 9 InlineList.kt\nkotlinx/coroutines/internal/InlineList\n+ 10 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,3116:1\n270#1,6:3119\n277#1,68:3126\n394#1,18:3217\n241#1:3235\n266#1,10:3236\n277#1,48:3247\n415#1:3295\n331#1,14:3296\n419#1,3:3311\n241#1:3324\n266#1,10:3325\n277#1,68:3336\n241#1:3414\n266#1,10:3415\n277#1,68:3426\n241#1:3498\n266#1,10:3499\n277#1,68:3510\n241#1:3579\n266#1,10:3580\n277#1,68:3591\n906#1,52:3661\n984#1,8:3717\n878#1:3725\n902#1,33:3726\n994#1:3759\n936#1,14:3760\n955#1,3:3775\n999#1,6:3778\n906#1,52:3792\n984#1,8:3848\n878#1:3856\n902#1,33:3857\n994#1:3890\n936#1,14:3891\n955#1,3:3906\n999#1,6:3909\n878#1:3924\n902#1,48:3925\n955#1,3:3974\n878#1:3977\n902#1,48:3978\n955#1,3:4027\n241#1:4039\n266#1,10:4040\n277#1,68:4051\n878#1:4120\n902#1,48:4121\n955#1,3:4170\n1#2:3117\n3099#3:3118\n3099#3:3125\n3099#3:3246\n3099#3:3335\n3099#3:3425\n3099#3:3497\n3099#3:3509\n3099#3:3590\n3099#3:3660\n3099#3:3923\n3099#3:4030\n3099#3:4031\n3113#3:4032\n3113#3:4033\n3112#3:4034\n3112#3:4035\n3112#3:4036\n3113#3:4037\n3112#3:4038\n3099#3:4050\n3100#3:4173\n3099#3:4174\n3099#3:4175\n3099#3:4176\n3100#3:4177\n3099#3:4178\n3100#3:4201\n3099#3:4202\n3099#3:4203\n3100#3:4204\n3099#3:4254\n3100#3:4255\n3100#3:4256\n3100#3:4274\n3100#3:4275\n426#4,9:3194\n435#4,2:3211\n444#4,4:3213\n448#4,8:3314\n426#4,9:3405\n435#4,2:3495\n444#4,4:3713\n448#4,8:3784\n444#4,4:3844\n448#4,8:3915\n204#5:3203\n205#5:3206\n204#5:3207\n205#5:3210\n57#6,2:3204\n57#6,2:3208\n57#6,2:3322\n266#7:3310\n266#7:3404\n266#7:3494\n266#7:3578\n266#7:3659\n266#7:4119\n902#8:3774\n902#8:3905\n902#8:3973\n902#8:4026\n902#8:4169\n33#9,11:4179\n33#9,11:4190\n68#10,3:4205\n42#10,8:4208\n68#10,3:4216\n42#10,8:4219\n42#10,8:4227\n68#10,3:4235\n42#10,8:4238\n42#10,8:4246\n774#11:4257\n865#11,2:4258\n2318#11,14:4260\n774#11:4276\n865#11,2:4277\n2318#11,14:4279\n774#11:4293\n865#11,2:4294\n2318#11,14:4296\n*S KotlinDebug\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n*L\n110#1:3119,6\n110#1:3126,68\n151#1:3217,18\n151#1:3235\n151#1:3236,10\n151#1:3247,48\n151#1:3295\n151#1:3296,14\n151#1:3311,3\n191#1:3324\n191#1:3325,10\n191#1:3336,68\n222#1:3414\n222#1:3415,10\n222#1:3426,68\n353#1:3498\n353#1:3499,10\n353#1:3510,68\n411#1:3579\n411#1:3580,10\n411#1:3591,68\n687#1:3661,52\n716#1:3717,8\n716#1:3725\n716#1:3726,33\n716#1:3759\n716#1:3760,14\n716#1:3775,3\n716#1:3778,6\n752#1:3792,52\n768#1:3848,8\n768#1:3856\n768#1:3857,33\n768#1:3890\n768#1:3891,14\n768#1:3906,3\n768#1:3909,6\n801#1:3924\n801#1:3925,48\n801#1:3974,3\n991#1:3977\n991#1:3978,48\n991#1:4027,3\n1484#1:4039\n1484#1:4040,10\n1484#1:4051,68\n1532#1:4120\n1532#1:4121,48\n1532#1:4170,3\n67#1:3118\n110#1:3125\n151#1:3246\n191#1:3335\n222#1:3425\n275#1:3497\n353#1:3509\n411#1:3590\n626#1:3660\n791#1:3923\n1027#1:4030\n1076#1:4031\n1394#1:4032\n1396#1:4033\n1426#1:4034\n1436#1:4035\n1445#1:4036\n1446#1:4037\n1453#1:4038\n1484#1:4050\n1898#1:4173\n1900#1:4174\n1902#1:4175\n1915#1:4176\n1926#1:4177\n1927#1:4178\n2229#1:4201\n2242#1:4202\n2252#1:4203\n2255#1:4204\n2572#1:4254\n2574#1:4255\n2599#1:4256\n2661#1:4274\n2662#1:4275\n131#1:3194,9\n131#1:3211,2\n150#1:3213,4\n150#1:3314,8\n218#1:3405,9\n218#1:3495,2\n715#1:3713,4\n715#1:3784,8\n766#1:3844,4\n766#1:3915,8\n135#1:3203\n135#1:3206\n138#1:3207\n138#1:3210\n135#1:3204,2\n138#1:3208,2\n180#1:3322,2\n151#1:3310\n191#1:3404\n222#1:3494\n353#1:3578\n411#1:3659\n1484#1:4119\n716#1:3774\n768#1:3905\n801#1:3973\n991#1:4026\n1532#1:4169\n2131#1:4179,11\n2186#1:4190,11\n2394#1:4205,3\n2394#1:4208,8\n2449#1:4216,3\n2449#1:4219,8\n2468#1:4227,8\n2498#1:4235,3\n2498#1:4238,8\n2559#1:4246,8\n2608#1:4257\n2608#1:4258,2\n2609#1:4260,14\n2673#1:4276\n2673#1:4277,2\n2674#1:4279,14\n2714#1:4293\n2714#1:4294,2\n2715#1:4296,14\n*E\n"})
public class n<E> implements kotlinx.coroutines.channels.p<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f313795d = AtomicLongFieldUpdater.newUpdater(n.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f313796e = AtomicLongFieldUpdater.newUpdater(n.class, "receivers$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f313797f = AtomicLongFieldUpdater.newUpdater(n.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f313798g = AtomicLongFieldUpdater.newUpdater(n.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f313799h = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f313800i = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f313801j = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f313802k = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f313803l = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f313804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @Nullable
    public final Function1<E, Unit> f313805b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final pj.n<kotlinx.coroutines.selects.n<?>, Object, Object, pj.n<Throwable, Object, CoroutineContext, Unit>> f313806c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    @SourceDebugExtension({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$BufferedChannelIterator\n+ 2 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$receiveImpl$1\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3116:1\n906#2,52:3117\n984#2,8:3173\n878#2:3181\n902#2,33:3182\n994#2:3215\n936#2,14:3216\n955#2,3:3231\n999#2,6:3234\n444#3,4:3169\n448#3,8:3240\n902#4:3230\n57#5,2:3248\n57#5,2:3251\n1#6:3250\n*S KotlinDebug\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$BufferedChannelIterator\n*L\n1619#1:3117,52\n1657#1:3173,8\n1657#1:3181\n1657#1:3182,33\n1657#1:3215\n1657#1:3216,14\n1657#1:3231,3\n1657#1:3234,6\n1655#1:3169,4\n1655#1:3240,8\n1657#1:3230\n1693#1:3248,2\n1741#1:3251,2\n*E\n"})
    private final class a implements r<E>, f4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private Object f313807a = kotlinx.coroutines.channels.o.f313857x;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private kotlinx.coroutines.p<? super Boolean> f313808b;

        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object h(u<E> uVar, int i10, long j10, kotlin.coroutines.d<? super Boolean> dVar) {
            Boolean boolA;
            u uVar2;
            n<E> nVar = n.this;
            kotlinx.coroutines.p pVarB = kotlinx.coroutines.r.b(kotlin.coroutines.intrinsics.b.e(dVar));
            try {
                this.f313808b = pVarB;
                Object objY2 = nVar.y2(uVar, i10, j10, this);
                if (objY2 != kotlinx.coroutines.channels.o.f313848o) {
                    pj.n nVarD0 = null;
                    if (objY2 == kotlinx.coroutines.channels.o.f313850q) {
                        if (j10 < nVar.W0()) {
                            uVar.b();
                        }
                        u uVar3 = (u) n.M0().get(nVar);
                        while (true) {
                            if (nVar.C()) {
                                j();
                                break;
                            }
                            long andIncrement = n.O0().getAndIncrement(nVar);
                            int i11 = kotlinx.coroutines.channels.o.f313835b;
                            long j11 = andIncrement / ((long) i11);
                            int i12 = (int) (andIncrement % ((long) i11));
                            if (uVar3.f315133c != j11) {
                                u uVarS0 = nVar.s0(j11, uVar3);
                                if (uVarS0 != null) {
                                    uVar2 = uVarS0;
                                }
                            } else {
                                uVar2 = uVar3;
                            }
                            Object objY3 = nVar.y2(uVar2, i12, andIncrement, this);
                            u uVar4 = uVar2;
                            if (objY3 == kotlinx.coroutines.channels.o.f313848o) {
                                nVar.G1(this, uVar4, i12);
                                break;
                            }
                            if (objY3 == kotlinx.coroutines.channels.o.f313850q) {
                                if (andIncrement < nVar.W0()) {
                                    uVar4.b();
                                }
                                uVar3 = uVar4;
                            } else {
                                if (objY3 == kotlinx.coroutines.channels.o.f313849p) {
                                    throw new IllegalStateException("unexpected");
                                }
                                uVar4.b();
                                this.f313807a = objY3;
                                this.f313808b = null;
                                boolA = kotlin.coroutines.jvm.internal.b.a(true);
                                Function1<E, Unit> function1 = nVar.f313805b;
                                if (function1 != null) {
                                    nVarD0 = nVar.d0(function1, objY3);
                                }
                            }
                        }
                    } else {
                        uVar.b();
                        this.f313807a = objY2;
                        this.f313808b = null;
                        boolA = kotlin.coroutines.jvm.internal.b.a(true);
                        Function1<E, Unit> function2 = nVar.f313805b;
                        if (function2 != null) {
                            nVarD0 = nVar.d0(function2, objY2);
                        }
                    }
                    pVarB.J(boolA, nVarD0);
                    break;
                }
                nVar.G1(this, uVar, i10);
                Object objU = pVarB.u();
                if (objU == kotlin.coroutines.intrinsics.b.l()) {
                    kotlin.coroutines.jvm.internal.h.c(dVar);
                }
                return objU;
            } catch (Throwable th2) {
                pVarB.R();
                throw th2;
            }
        }

        private final boolean i() throws Throwable {
            this.f313807a = kotlinx.coroutines.channels.o.z();
            Throwable thA0 = n.this.A0();
            if (thA0 == null) {
                return false;
            }
            throw y0.m(thA0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void j() {
            kotlinx.coroutines.p<? super Boolean> pVar = this.f313808b;
            Intrinsics.checkNotNull(pVar);
            this.f313808b = null;
            this.f313807a = kotlinx.coroutines.channels.o.z();
            Throwable thA0 = n.this.A0();
            if (thA0 == null) {
                Result.a aVar = Result.Companion;
                pVar.resumeWith(Result.m785constructorimpl(Boolean.FALSE));
            } else {
                Result.a aVar2 = Result.Companion;
                pVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(thA0)));
            }
        }

        @Override // kotlinx.coroutines.channels.r
        @kotlin.l(level = kotlin.n.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        @oj.i(name = t1.b.f296120h)
        public /* synthetic */ Object a(kotlin.coroutines.d dVar) {
            return r.a.a(this, dVar);
        }

        @Override // kotlinx.coroutines.f4
        public void b(@NotNull w0<?> w0Var, int i10) {
            kotlinx.coroutines.p<? super Boolean> pVar = this.f313808b;
            if (pVar != null) {
                pVar.b(w0Var, i10);
            }
        }

        @Override // kotlinx.coroutines.channels.r
        @Nullable
        public Object c(@NotNull kotlin.coroutines.d<? super Boolean> dVar) throws Throwable {
            u<E> uVarS0;
            boolean zI = true;
            if (this.f313807a == kotlinx.coroutines.channels.o.f313857x || this.f313807a == kotlinx.coroutines.channels.o.z()) {
                n<E> nVar = n.this;
                u<E> uVar = (u) n.M0().get(nVar);
                while (!nVar.C()) {
                    long andIncrement = n.O0().getAndIncrement(nVar);
                    int i10 = kotlinx.coroutines.channels.o.f313835b;
                    long j10 = andIncrement / ((long) i10);
                    int i11 = (int) (andIncrement % ((long) i10));
                    if (uVar.f315133c != j10) {
                        uVarS0 = nVar.s0(j10, uVar);
                        if (uVarS0 == null) {
                            continue;
                        }
                    } else {
                        uVarS0 = uVar;
                    }
                    Object objY2 = nVar.y2(uVarS0, i11, andIncrement, null);
                    if (objY2 == kotlinx.coroutines.channels.o.f313848o) {
                        throw new IllegalStateException("unreachable");
                    }
                    if (objY2 == kotlinx.coroutines.channels.o.f313850q) {
                        if (andIncrement < nVar.W0()) {
                            uVarS0.b();
                        }
                        uVar = uVarS0;
                    } else {
                        if (objY2 == kotlinx.coroutines.channels.o.f313849p) {
                            return h(uVarS0, i11, andIncrement, dVar);
                        }
                        uVarS0.b();
                        this.f313807a = objY2;
                    }
                }
                zI = i();
            }
            return kotlin.coroutines.jvm.internal.b.a(zI);
        }

        public final boolean k(E e10) {
            kotlinx.coroutines.p<? super Boolean> pVar = this.f313808b;
            Intrinsics.checkNotNull(pVar);
            this.f313808b = null;
            this.f313807a = e10;
            Boolean bool = Boolean.TRUE;
            n<E> nVar = n.this;
            Function1<E, Unit> function1 = nVar.f313805b;
            return kotlinx.coroutines.channels.o.F(pVar, bool, function1 != null ? nVar.d0(function1, e10) : null);
        }

        public final void l() {
            kotlinx.coroutines.p<? super Boolean> pVar = this.f313808b;
            Intrinsics.checkNotNull(pVar);
            this.f313808b = null;
            this.f313807a = kotlinx.coroutines.channels.o.z();
            Throwable thA0 = n.this.A0();
            if (thA0 == null) {
                Result.a aVar = Result.Companion;
                pVar.resumeWith(Result.m785constructorimpl(Boolean.FALSE));
            } else {
                Result.a aVar2 = Result.Companion;
                pVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(thA0)));
            }
        }

        @Override // kotlinx.coroutines.channels.r
        public E next() throws Throwable {
            E e10 = (E) this.f313807a;
            if (e10 == kotlinx.coroutines.channels.o.f313857x) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            this.f313807a = kotlinx.coroutines.channels.o.f313857x;
            if (e10 != kotlinx.coroutines.channels.o.z()) {
                return e10;
            }
            throw y0.m(n.this.K0());
        }
    }

    private static final class b implements f4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ kotlinx.coroutines.p<Boolean> f313810a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final kotlinx.coroutines.n<Boolean> f313811b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull kotlinx.coroutines.n<? super Boolean> nVar) {
            Intrinsics.checkNotNull(nVar, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlin.Boolean>");
            this.f313810a = (kotlinx.coroutines.p) nVar;
            this.f313811b = nVar;
        }

        @NotNull
        public final kotlinx.coroutines.n<Boolean> a() {
            return this.f313811b;
        }

        @Override // kotlinx.coroutines.f4
        public void b(@NotNull w0<?> w0Var, int i10) {
            this.f313810a.b(w0Var, i10);
        }
    }

    /* synthetic */ class c extends kotlin.jvm.internal.g0 implements pj.n<Throwable, E, CoroutineContext, Unit> {
        c(Object obj) {
            super(3, obj, n.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        public final void X(Throwable th2, E e10, CoroutineContext coroutineContext) {
            ((n) this.receiver).u1(th2, e10, coroutineContext);
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2, Object obj, CoroutineContext coroutineContext) {
            X(th2, obj, coroutineContext);
            return Unit.f312394a;
        }
    }

    /* synthetic */ class d extends kotlin.jvm.internal.g0 implements pj.n<Throwable, t<? extends E>, CoroutineContext, Unit> {
        d(Object obj) {
            super(3, obj, n.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        public final void X(Throwable th2, Object obj, CoroutineContext coroutineContext) {
            ((n) this.receiver).t1(th2, obj, coroutineContext);
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2, Object obj, CoroutineContext coroutineContext) {
            X(th2, ((t) obj).o(), coroutineContext);
            return Unit.f312394a;
        }
    }

    /* synthetic */ class e extends kotlin.jvm.internal.g0 implements pj.n<n<?>, kotlinx.coroutines.selects.n<?>, Object, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f313812a = new e();

        e() {
            super(3, n.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void X(n<?> nVar, kotlinx.coroutines.selects.n<?> nVar2, Object obj) {
            nVar.T1(nVar2, obj);
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(n<?> nVar, kotlinx.coroutines.selects.n<?> nVar2, Object obj) {
            X(nVar, nVar2, obj);
            return Unit.f312394a;
        }
    }

    /* synthetic */ class f extends kotlin.jvm.internal.g0 implements pj.n<n<?>, Object, Object, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f313813a = new f();

        f() {
            super(3, n.class, "processResultSelectReceive", "processResultSelectReceive(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // pj.n
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final Object invoke(n<?> nVar, Object obj, Object obj2) {
            return nVar.I1(obj, obj2);
        }
    }

    /* synthetic */ class g extends kotlin.jvm.internal.g0 implements pj.n<n<?>, kotlinx.coroutines.selects.n<?>, Object, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f313814a = new g();

        g() {
            super(3, n.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void X(n<?> nVar, kotlinx.coroutines.selects.n<?> nVar2, Object obj) {
            nVar.T1(nVar2, obj);
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(n<?> nVar, kotlinx.coroutines.selects.n<?> nVar2, Object obj) {
            X(nVar, nVar2, obj);
            return Unit.f312394a;
        }
    }

    /* synthetic */ class h extends kotlin.jvm.internal.g0 implements pj.n<n<?>, Object, Object, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f313815a = new h();

        h() {
            super(3, n.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // pj.n
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final Object invoke(n<?> nVar, Object obj, Object obj2) {
            return nVar.J1(obj, obj2);
        }
    }

    /* synthetic */ class i extends kotlin.jvm.internal.g0 implements pj.n<n<?>, kotlinx.coroutines.selects.n<?>, Object, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f313816a = new i();

        i() {
            super(3, n.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void X(n<?> nVar, kotlinx.coroutines.selects.n<?> nVar2, Object obj) {
            nVar.T1(nVar2, obj);
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(n<?> nVar, kotlinx.coroutines.selects.n<?> nVar2, Object obj) {
            X(nVar, nVar2, obj);
            return Unit.f312394a;
        }
    }

    /* synthetic */ class j extends kotlin.jvm.internal.g0 implements pj.n<n<?>, Object, Object, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f313817a = new j();

        j() {
            super(3, n.class, "processResultSelectReceiveOrNull", "processResultSelectReceiveOrNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // pj.n
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final Object invoke(n<?> nVar, Object obj, Object obj2) {
            return nVar.K1(obj, obj2);
        }
    }

    /* synthetic */ class k extends kotlin.jvm.internal.g0 implements pj.n<n<?>, kotlinx.coroutines.selects.n<?>, Object, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f313818a = new k();

        k() {
            super(3, n.class, "registerSelectForSend", "registerSelectForSend(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void X(n<?> nVar, kotlinx.coroutines.selects.n<?> nVar2, Object obj) {
            nVar.U1(nVar2, obj);
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(n<?> nVar, kotlinx.coroutines.selects.n<?> nVar2, Object obj) {
            X(nVar, nVar2, obj);
            return Unit.f312394a;
        }
    }

    /* synthetic */ class l extends kotlin.jvm.internal.g0 implements pj.n<n<?>, Object, Object, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f313819a = new l();

        l() {
            super(3, n.class, "processResultSelectSend", "processResultSelectSend(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // pj.n
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final Object invoke(n<?> nVar, Object obj, Object obj2) {
            return nVar.L1(obj, obj2);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", i = {}, l = {759}, m = "receiveCatching-JP2dKIU$suspendImpl", n = {}, s = {})
    static final class m<E> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f313820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n<E> f313821b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f313822c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(n<E> nVar, kotlin.coroutines.d<? super m> dVar) {
            super(dVar);
            this.f313821b = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f313820a = obj;
            this.f313822c |= Integer.MIN_VALUE;
            Object objN1 = n.N1(this.f313821b, this);
            return objN1 == kotlin.coroutines.intrinsics.b.l() ? objN1 : t.b(objN1);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.n$n, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", i = {0, 0, 0, 0}, l = {3117}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk", n = {"this", com.planner5d.library.model.manager.statistics.appsflyer.d.a.f202893i, FirebaseAnalytics.d.f120644b0, "r"}, s = {"L$0", "L$1", "I$0", "J$0"})
    static final class C2269n extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313823a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f313824b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f313825c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f313826d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f313827e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ n<E> f313828f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f313829g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2269n(n<E> nVar, kotlin.coroutines.d<? super C2269n> dVar) {
            super(dVar);
            this.f313828f = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f313827e = obj;
            this.f313829g |= Integer.MIN_VALUE;
            Object objO1 = this.f313828f.O1(null, 0, 0L, this);
            return objO1 == kotlin.coroutines.intrinsics.b.l() ? objO1 : t.b(objO1);
        }
    }

    public static final class o implements pj.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f313830a = new o();

        public final Void c(u<E> uVar, int i10, long j10) {
            throw new IllegalStateException("unexpected");
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return c((u) obj, ((Number) obj2).intValue(), ((Number) obj3).longValue());
        }
    }

    public static final class p implements pj.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p f313831a = new p();

        public final Void c(u<E> uVar, int i10, E e10, long j10) {
            throw new IllegalStateException("unexpected");
        }

        @Override // pj.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return c((u) obj, ((Number) obj2).intValue(), obj3, ((Number) obj4).longValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(int i10, @Nullable Function1<? super E, Unit> function1) {
        this.f313804a = i10;
        this.f313805b = function1;
        if (i10 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i10 + ", should be >=0").toString());
        }
        this.bufferEnd$volatile = kotlinx.coroutines.channels.o.E(i10);
        this.completedExpandBuffersAndPauseFlag$volatile = x0();
        u uVar = new u(0L, null, this, 3);
        this.sendSegment$volatile = uVar;
        this.receiveSegment$volatile = uVar;
        if (l1()) {
            uVar = kotlinx.coroutines.channels.o.f313834a;
            Intrinsics.checkNotNull(uVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = uVar;
        this.f313806c = function1 != 0 ? new pj.n() { // from class: kotlinx.coroutines.channels.l
            @Override // pj.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return n.E1(this.f313791a, (kotlinx.coroutines.selects.n) obj, obj2, obj3);
            }
        } : null;
        this._closeCause$volatile = kotlinx.coroutines.channels.o.A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0037  */
    public final Object A1(E e10, kotlin.coroutines.d<? super Unit> dVar) {
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        Function1<E, Unit> function1 = this.f313805b;
        if (function1 != null) {
            int i10 = 2 << 0;
            p1 p1VarC = kotlinx.coroutines.internal.r0.c(function1, e10, null, 2, null);
            if (p1VarC != null) {
                kotlin.p.a(p1VarC, Q0());
                Result.a aVar = Result.Companion;
                pVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(p1VarC)));
            } else {
                Throwable thQ0 = Q0();
                Result.a aVar2 = Result.Companion;
                pVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(thQ0)));
            }
        } else {
            Throwable thQ1 = Q0();
            Result.a aVar3 = Result.Companion;
            pVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(thQ1)));
        }
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU == kotlin.coroutines.intrinsics.b.l() ? objU : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int A2(u<E> uVar, int i10, E e10, long j10, Object obj, boolean z10) {
        uVar.O(i10, e10);
        if (z10) {
            return B2(uVar, i10, e10, j10, obj, z10);
        }
        Object objJ = uVar.J(i10);
        if (objJ == null) {
            if (g0(j10)) {
                if (uVar.D(i10, null, kotlinx.coroutines.channels.o.f313839f)) {
                    return 1;
                }
            } else {
                if (obj == null) {
                    return 3;
                }
                if (uVar.D(i10, null, obj)) {
                    return 2;
                }
            }
        } else if (objJ instanceof f4) {
            uVar.E(i10);
            if (s2(objJ, e10)) {
                uVar.N(i10, kotlinx.coroutines.channels.o.f313844k);
                C1();
                return 0;
            }
            if (uVar.F(i10, kotlinx.coroutines.channels.o.f313846m) != kotlinx.coroutines.channels.o.f313846m) {
                uVar.K(i10, true);
            }
            return 5;
        }
        return B2(uVar, i10, e10, j10, obj, z10);
    }

    private final /* synthetic */ Object B0() {
        return this.closeHandler$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B1(E e10, kotlinx.coroutines.n<? super Unit> nVar) {
        Function1<E, Unit> function1 = this.f313805b;
        if (function1 != null) {
            kotlinx.coroutines.internal.r0.a(function1, e10, nVar.getContext());
        }
        Throwable thQ0 = Q0();
        Result.a aVar = Result.Companion;
        nVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(thQ0)));
    }

    private final int B2(u<E> uVar, int i10, E e10, long j10, Object obj, boolean z10) {
        while (true) {
            Object objJ = uVar.J(i10);
            if (objJ == null) {
                if (!g0(j10) || z10) {
                    if (z10) {
                        if (uVar.D(i10, null, kotlinx.coroutines.channels.o.f313845l)) {
                            uVar.K(i10, false);
                            return 4;
                        }
                    } else {
                        if (obj == null) {
                            return 3;
                        }
                        if (uVar.D(i10, null, obj)) {
                            return 2;
                        }
                    }
                } else if (uVar.D(i10, null, kotlinx.coroutines.channels.o.f313839f)) {
                    return 1;
                }
            } else {
                if (objJ != kotlinx.coroutines.channels.o.f313840g) {
                    if (objJ == kotlinx.coroutines.channels.o.f313846m) {
                        uVar.E(i10);
                        return 5;
                    }
                    if (objJ == kotlinx.coroutines.channels.o.f313843j) {
                        uVar.E(i10);
                        return 5;
                    }
                    if (objJ == kotlinx.coroutines.channels.o.z()) {
                        uVar.E(i10);
                        o0();
                        return 4;
                    }
                    uVar.E(i10);
                    if (objJ instanceof r0) {
                        objJ = ((r0) objJ).f313892a;
                    }
                    if (s2(objJ, e10)) {
                        uVar.N(i10, kotlinx.coroutines.channels.o.f313844k);
                        C1();
                        return 0;
                    }
                    if (uVar.F(i10, kotlinx.coroutines.channels.o.f313846m) != kotlinx.coroutines.channels.o.f313846m) {
                        uVar.K(i10, true);
                    }
                    return 5;
                }
                if (uVar.D(i10, objJ, kotlinx.coroutines.channels.o.f313839f)) {
                    return 1;
                }
            }
        }
    }

    private final void C2(long j10) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f313796e;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(this);
            if (j11 >= j10) {
                break;
            }
            n<E> nVar = this;
            long j12 = j10;
            if (f313796e.compareAndSet(nVar, j11, j12)) {
                break;
            }
            this = nVar;
            j10 = j12;
        }
    }

    private final /* synthetic */ long D0() {
        return this.completedExpandBuffersAndPauseFlag$volatile;
    }

    private final void D2(long j10) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f313795d;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(this);
            long j12 = 1152921504606846975L & j11;
            if (j12 >= j10) {
                return;
            }
            n<E> nVar = this;
            if (f313795d.compareAndSet(nVar, j11, kotlinx.coroutines.channels.o.w(j12, (int) (j11 >> 60)))) {
                return;
            } else {
                this = nVar;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pj.n E1(final n nVar, final kotlinx.coroutines.selects.n nVar2, Object obj, final Object obj2) {
        return new pj.n() { // from class: kotlinx.coroutines.channels.k
            @Override // pj.n
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return n.F1(obj2, nVar, nVar2, (Throwable) obj3, obj4, (CoroutineContext) obj5);
            }
        };
    }

    public static /* synthetic */ void F0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F1(Object obj, n nVar, kotlinx.coroutines.selects.n nVar2, Throwable th2, Object obj2, CoroutineContext coroutineContext) {
        if (obj != kotlinx.coroutines.channels.o.z()) {
            kotlinx.coroutines.internal.r0.a(nVar.f313805b, obj, nVar2.getContext());
        }
        return Unit.f312394a;
    }

    public static /* synthetic */ void G0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G1(f4 f4Var, u<E> uVar, int i10) {
        D1();
        f4Var.b(uVar, i10);
    }

    public static /* synthetic */ void H0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H1(f4 f4Var, u<E> uVar, int i10) {
        f4Var.b(uVar, i10 + kotlinx.coroutines.channels.o.f313835b);
    }

    public static /* synthetic */ void I0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object I1(Object obj, Object obj2) throws Throwable {
        if (obj2 != kotlinx.coroutines.channels.o.z()) {
            return obj2;
        }
        throw K0();
    }

    private static /* synthetic */ void J0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object J1(Object obj, Object obj2) {
        return t.b(obj2 == kotlinx.coroutines.channels.o.z() ? t.f313893b.a(A0()) : t.f313893b.c(obj2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable K0() {
        Throwable thA0 = A0();
        return thA0 == null ? new c0(v.f313899a) : thA0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object K1(Object obj, Object obj2) throws Throwable {
        if (obj2 != kotlinx.coroutines.channels.o.z()) {
            return obj2;
        }
        if (A0() == null) {
            return null;
        }
        throw K0();
    }

    private final /* synthetic */ Object L0() {
        return this.receiveSegment$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object L1(Object obj, Object obj2) throws Throwable {
        if (obj2 != kotlinx.coroutines.channels.o.z()) {
            return this;
        }
        throw Q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater M0() {
        return f313800i;
    }

    static /* synthetic */ <E> Object M1(n<E> nVar, kotlin.coroutines.d<? super E> dVar) throws Throwable {
        u<E> uVar;
        u<E> uVar2 = (u) M0().get(nVar);
        while (!nVar.C()) {
            long andIncrement = O0().getAndIncrement(nVar);
            int i10 = kotlinx.coroutines.channels.o.f313835b;
            long j10 = andIncrement / ((long) i10);
            int i11 = (int) (andIncrement % ((long) i10));
            if (uVar2.f315133c != j10) {
                u<E> uVarS0 = nVar.s0(j10, uVar2);
                if (uVarS0 != null) {
                    uVar = uVarS0;
                }
            } else {
                uVar = uVar2;
            }
            n<E> nVar2 = nVar;
            Object objY2 = nVar2.y2(uVar, i11, andIncrement, null);
            if (objY2 == kotlinx.coroutines.channels.o.f313848o) {
                throw new IllegalStateException("unexpected");
            }
            if (objY2 != kotlinx.coroutines.channels.o.f313850q) {
                if (objY2 == kotlinx.coroutines.channels.o.f313849p) {
                    return nVar2.S1(uVar, i11, andIncrement, dVar);
                }
                uVar.b();
                return objY2;
            }
            if (andIncrement < nVar2.W0()) {
                uVar.b();
            }
            nVar = nVar2;
            uVar2 = uVar;
        }
        throw y0.m(nVar.K0());
    }

    private final /* synthetic */ long N0() {
        return this.receivers$volatile;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ <E> Object N1(n<E> nVar, kotlin.coroutines.d<? super t<? extends E>> dVar) {
        m mVar;
        u<E> uVar;
        if (dVar instanceof m) {
            mVar = (m) dVar;
            int i10 = mVar.f313822c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                mVar.f313822c = i10 - Integer.MIN_VALUE;
            } else {
                mVar = new m(nVar, dVar);
            }
        } else {
            mVar = new m(nVar, dVar);
        }
        m mVar2 = mVar;
        Object obj = mVar2.f313820a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = mVar2.f313822c;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return ((t) obj).o();
        }
        ResultKt.m(obj);
        u<E> uVar2 = (u) M0().get(nVar);
        while (!nVar.C()) {
            long andIncrement = O0().getAndIncrement(nVar);
            int i12 = kotlinx.coroutines.channels.o.f313835b;
            long j10 = andIncrement / ((long) i12);
            int i13 = (int) (andIncrement % ((long) i12));
            if (uVar2.f315133c != j10) {
                u<E> uVarS0 = nVar.s0(j10, uVar2);
                if (uVarS0 == null) {
                    continue;
                } else {
                    uVar = uVarS0;
                }
            } else {
                uVar = uVar2;
            }
            n<E> nVar2 = nVar;
            Object objY2 = nVar2.y2(uVar, i13, andIncrement, null);
            if (objY2 == kotlinx.coroutines.channels.o.f313848o) {
                throw new IllegalStateException("unexpected");
            }
            if (objY2 != kotlinx.coroutines.channels.o.f313850q) {
                if (objY2 != kotlinx.coroutines.channels.o.f313849p) {
                    uVar.b();
                    return t.f313893b.c(objY2);
                }
                mVar2.f313822c = 1;
                Object objO1 = nVar2.O1(uVar, i13, andIncrement, mVar2);
                return objO1 == objL ? objL : objO1;
            }
            if (andIncrement < nVar2.W0()) {
                uVar.b();
            }
            nVar = nVar2;
            uVar2 = uVar;
        }
        return t.f313893b.a(nVar.A0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater O0() {
        return f313796e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object O1(u<E> uVar, int i10, long j10, kotlin.coroutines.d<? super t<? extends E>> dVar) {
        C2269n c2269n;
        t tVarB;
        pj.n nVar;
        u uVar2;
        if (dVar instanceof C2269n) {
            c2269n = (C2269n) dVar;
            int i11 = c2269n.f313829g;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c2269n.f313829g = i11 - Integer.MIN_VALUE;
            } else {
                c2269n = new C2269n(this, dVar);
            }
        } else {
            c2269n = new C2269n(this, dVar);
        }
        Object objU = c2269n.f313827e;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i12 = c2269n.f313829g;
        if (i12 == 0) {
            ResultKt.m(objU);
            c2269n.f313823a = this;
            c2269n.f313824b = uVar;
            c2269n.f313825c = i10;
            c2269n.f313826d = j10;
            c2269n.f313829g = 1;
            kotlinx.coroutines.p pVarB = kotlinx.coroutines.r.b(kotlin.coroutines.intrinsics.b.e(c2269n));
            try {
                Intrinsics.checkNotNull(pVarB, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<E of kotlinx.coroutines.channels.BufferedChannel>>");
                m0 m0Var = new m0(pVarB);
                Object objY2 = y2(uVar, i10, j10, m0Var);
                if (objY2 != kotlinx.coroutines.channels.o.f313848o) {
                    if (objY2 == kotlinx.coroutines.channels.o.f313850q) {
                        if (j10 < W0()) {
                            uVar.b();
                        }
                        u uVar3 = (u) M0().get(this);
                        while (true) {
                            if (C()) {
                                w1(pVarB);
                                break;
                            }
                            long andIncrement = O0().getAndIncrement(this);
                            int i13 = kotlinx.coroutines.channels.o.f313835b;
                            long j11 = andIncrement / ((long) i13);
                            int i14 = (int) (andIncrement % ((long) i13));
                            if (uVar3.f315133c != j11) {
                                u uVarS0 = s0(j11, uVar3);
                                if (uVarS0 != null) {
                                    uVar2 = uVarS0;
                                }
                            } else {
                                uVar2 = uVar3;
                            }
                            Object objY3 = y2(uVar2, i14, andIncrement, m0Var);
                            u uVar4 = uVar2;
                            if (objY3 == kotlinx.coroutines.channels.o.f313848o) {
                                G1(m0Var, uVar4, i14);
                                break;
                            }
                            if (objY3 == kotlinx.coroutines.channels.o.f313850q) {
                                if (andIncrement < W0()) {
                                    uVar4.b();
                                }
                                uVar3 = uVar4;
                            } else {
                                if (objY3 == kotlinx.coroutines.channels.o.f313849p) {
                                    throw new IllegalStateException("unexpected");
                                }
                                uVar4.b();
                                tVarB = t.b(t.f313893b.c(objY3));
                                Function1<E, Unit> function1 = this.f313805b;
                                nVar = (pj.n) (function1 != null ? f0(function1) : null);
                            }
                        }
                    } else {
                        uVar.b();
                        tVarB = t.b(t.f313893b.c(objY2));
                        Function1<E, Unit> function2 = this.f313805b;
                        nVar = (pj.n) (function2 != null ? f0(function2) : null);
                    }
                    pVarB.J(tVarB, nVar);
                    break;
                }
                G1(m0Var, uVar, i10);
                objU = pVarB.u();
                if (objU == kotlin.coroutines.intrinsics.b.l()) {
                    kotlin.coroutines.jvm.internal.h.c(c2269n);
                }
                if (objU == objL) {
                    return objL;
                }
            } catch (Throwable th2) {
                pVarB.R();
                throw th2;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objU);
        }
        return ((t) objU).o();
    }

    private final <R> R P1(Object obj, Function1<? super E, ? extends R> function1, pj.n<? super u<E>, ? super Integer, ? super Long, ? extends R> nVar, Function0<? extends R> function0, pj.n<? super u<E>, ? super Integer, ? super Long, ? extends R> nVar2) {
        u uVar;
        u uVar2 = (u) M0().get(this);
        while (!this.C()) {
            long andIncrement = O0().getAndIncrement(this);
            int i10 = kotlinx.coroutines.channels.o.f313835b;
            long j10 = andIncrement / ((long) i10);
            int i11 = (int) (andIncrement % ((long) i10));
            if (uVar2.f315133c != j10) {
                u uVarS0 = this.s0(j10, uVar2);
                if (uVarS0 == null) {
                    continue;
                } else {
                    uVar = uVarS0;
                }
            } else {
                uVar = uVar2;
            }
            n<E> nVar3 = this;
            Object obj2 = obj;
            z0 z0Var = (Object) nVar3.y2(uVar, i11, andIncrement, obj2);
            uVar2 = uVar;
            if (z0Var == kotlinx.coroutines.channels.o.f313848o) {
                f4 f4Var = obj2 instanceof f4 ? (f4) obj2 : null;
                if (f4Var != null) {
                    nVar3.G1(f4Var, uVar2, i11);
                }
                return nVar.invoke(uVar2, Integer.valueOf(i11), Long.valueOf(andIncrement));
            }
            if (z0Var != kotlinx.coroutines.channels.o.f313850q) {
                if (z0Var == kotlinx.coroutines.channels.o.f313849p) {
                    return nVar2.invoke(uVar2, Integer.valueOf(i11), Long.valueOf(andIncrement));
                }
                uVar2.b();
                return function1.invoke(z0Var);
            }
            if (andIncrement < nVar3.W0()) {
                uVar2.b();
            }
            this = nVar3;
            obj = obj2;
        }
        return function0.invoke();
    }

    static /* synthetic */ Object Q1(n nVar, Object obj, Function1 function1, pj.n nVar2, Function0 function0, pj.n nVar3, int i10, Object obj2) {
        u uVar;
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: receiveImpl");
        }
        if ((i10 & 16) != 0) {
            nVar3 = o.f313830a;
        }
        u uVar2 = (u) M0().get(nVar);
        while (!nVar.C()) {
            long andIncrement = O0().getAndIncrement(nVar);
            int i11 = kotlinx.coroutines.channels.o.f313835b;
            long j10 = andIncrement / ((long) i11);
            int i12 = (int) (andIncrement % ((long) i11));
            if (uVar2.f315133c != j10) {
                u uVarS0 = nVar.s0(j10, uVar2);
                if (uVarS0 == null) {
                    continue;
                } else {
                    uVar = uVarS0;
                }
            } else {
                uVar = uVar2;
            }
            n nVar4 = nVar;
            Object obj3 = obj;
            Object objY2 = nVar4.y2(uVar, i12, andIncrement, obj3);
            uVar2 = uVar;
            if (objY2 == kotlinx.coroutines.channels.o.f313848o) {
                f4 f4Var = obj3 instanceof f4 ? (f4) obj3 : null;
                if (f4Var != null) {
                    nVar4.G1(f4Var, uVar2, i12);
                }
                return nVar2.invoke(uVar2, Integer.valueOf(i12), Long.valueOf(andIncrement));
            }
            if (objY2 != kotlinx.coroutines.channels.o.f313850q) {
                if (objY2 == kotlinx.coroutines.channels.o.f313849p) {
                    return nVar3.invoke(uVar2, Integer.valueOf(i12), Long.valueOf(andIncrement));
                }
                uVar2.b();
                return function1.invoke(objY2);
            }
            if (andIncrement < nVar4.W0()) {
                uVar2.b();
            }
            nVar = nVar4;
            obj = obj3;
        }
        return function0.invoke();
    }

    private final /* synthetic */ Object R0() {
        return this.sendSegment$volatile;
    }

    private final void R1(u<E> uVar, int i10, long j10, f4 f4Var, Function1<? super E, Unit> function1, Function0<Unit> function0) {
        z0 z0Var = (Object) y2(uVar, i10, j10, f4Var);
        if (z0Var == kotlinx.coroutines.channels.o.f313848o) {
            G1(f4Var, uVar, i10);
            return;
        }
        if (z0Var != kotlinx.coroutines.channels.o.f313850q) {
            uVar.b();
            function1.invoke(z0Var);
            return;
        }
        if (j10 < W0()) {
            uVar.b();
        }
        u uVar2 = (u) M0().get(this);
        while (!C()) {
            long andIncrement = O0().getAndIncrement(this);
            int i11 = kotlinx.coroutines.channels.o.f313835b;
            long j11 = andIncrement / ((long) i11);
            int i12 = (int) (andIncrement % ((long) i11));
            if (uVar2.f315133c != j11) {
                u uVarS0 = s0(j11, uVar2);
                if (uVarS0 == null) {
                    continue;
                } else {
                    uVar2 = uVarS0;
                }
            }
            z0 z0Var2 = (Object) y2(uVar2, i12, andIncrement, f4Var);
            if (z0Var2 == kotlinx.coroutines.channels.o.f313848o) {
                if (f4Var == null) {
                    f4Var = null;
                }
                if (f4Var != null) {
                    G1(f4Var, uVar2, i12);
                }
                Unit unit = Unit.f312394a;
                return;
            }
            if (z0Var2 != kotlinx.coroutines.channels.o.f313850q) {
                if (z0Var2 == kotlinx.coroutines.channels.o.f313849p) {
                    throw new IllegalStateException("unexpected");
                }
                uVar2.b();
                function1.invoke(z0Var2);
                return;
            }
            if (andIncrement < W0()) {
                uVar2.b();
            }
        }
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object S1(u<E> uVar, int i10, long j10, kotlin.coroutines.d<? super E> dVar) {
        pj.n nVar;
        u uVar2;
        kotlinx.coroutines.p pVarB = kotlinx.coroutines.r.b(kotlin.coroutines.intrinsics.b.e(dVar));
        try {
            Object objY2 = y2(uVar, i10, j10, pVarB);
            if (objY2 != kotlinx.coroutines.channels.o.f313848o) {
                if (objY2 == kotlinx.coroutines.channels.o.f313850q) {
                    if (j10 < W0()) {
                        uVar.b();
                    }
                    u uVar3 = (u) M0().get(this);
                    while (true) {
                        if (C()) {
                            x1(pVarB);
                            break;
                        }
                        long andIncrement = O0().getAndIncrement(this);
                        int i11 = kotlinx.coroutines.channels.o.f313835b;
                        long j11 = andIncrement / ((long) i11);
                        int i12 = (int) (andIncrement % ((long) i11));
                        if (uVar3.f315133c != j11) {
                            u uVarS0 = s0(j11, uVar3);
                            if (uVarS0 != null) {
                                uVar2 = uVarS0;
                            }
                        } else {
                            uVar2 = uVar3;
                        }
                        objY2 = y2(uVar2, i12, andIncrement, pVarB);
                        u uVar4 = uVar2;
                        if (objY2 == kotlinx.coroutines.channels.o.f313848o) {
                            kotlinx.coroutines.p pVar = pVarB != null ? pVarB : null;
                            if (pVar == null) {
                                break;
                            }
                            G1(pVar, uVar4, i12);
                            break;
                        }
                        if (objY2 == kotlinx.coroutines.channels.o.f313850q) {
                            if (andIncrement < W0()) {
                                uVar4.b();
                            }
                            uVar3 = uVar4;
                        } else {
                            if (objY2 == kotlinx.coroutines.channels.o.f313849p) {
                                throw new IllegalStateException("unexpected");
                            }
                            uVar4.b();
                            Function1<E, Unit> function1 = this.f313805b;
                            nVar = (pj.n) (function1 != null ? c0(function1) : null);
                        }
                    }
                } else {
                    uVar.b();
                    Function1<E, Unit> function2 = this.f313805b;
                    nVar = (pj.n) (function2 != null ? c0(function2) : null);
                }
                pVarB.J(objY2, nVar);
                break;
            }
            G1(pVarB, uVar, i10);
            Object objU = pVarB.u();
            if (objU == kotlin.coroutines.intrinsics.b.l()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return objU;
        } catch (Throwable th2) {
            pVarB.R();
            throw th2;
        }
    }

    private final /* synthetic */ long T0() {
        return this.sendersAndCloseStatus$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T1(kotlinx.coroutines.selects.n<?> nVar, Object obj) {
        u uVar;
        u uVar2 = (u) M0().get(this);
        while (!this.C()) {
            long andIncrement = O0().getAndIncrement(this);
            int i10 = kotlinx.coroutines.channels.o.f313835b;
            long j10 = andIncrement / ((long) i10);
            int i11 = (int) (andIncrement % ((long) i10));
            if (uVar2.f315133c != j10) {
                u uVarS0 = this.s0(j10, uVar2);
                if (uVarS0 == null) {
                    continue;
                } else {
                    uVar = uVarS0;
                }
            } else {
                uVar = uVar2;
            }
            n<E> nVar2 = this;
            kotlinx.coroutines.selects.n<?> nVar3 = nVar;
            Object objY2 = nVar2.y2(uVar, i11, andIncrement, nVar3);
            uVar2 = uVar;
            if (objY2 == kotlinx.coroutines.channels.o.f313848o) {
                f4 f4Var = nVar3 instanceof f4 ? (f4) nVar3 : null;
                if (f4Var != null) {
                    nVar2.G1(f4Var, uVar2, i11);
                    return;
                }
                return;
            }
            if (objY2 != kotlinx.coroutines.channels.o.f313850q) {
                if (objY2 == kotlinx.coroutines.channels.o.f313849p) {
                    throw new IllegalStateException("unexpected");
                }
                uVar2.b();
                nVar3.f(objY2);
                return;
            }
            if (andIncrement < nVar2.W0()) {
                uVar2.b();
            }
            this = nVar2;
            nVar = nVar3;
        }
        this.y1(nVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void V1(u<E> uVar) {
        Function1<E, Unit> function1 = this.f313805b;
        p1 p1VarB = null;
        Object objC = kotlinx.coroutines.internal.x.c(null, 1, null);
        loop0: do {
            for (int i10 = kotlinx.coroutines.channels.o.f313835b - 1; -1 < i10; i10--) {
                long j10 = (uVar.f315133c * ((long) kotlinx.coroutines.channels.o.f313835b)) + ((long) i10);
                while (true) {
                    Object objJ = uVar.J(i10);
                    if (objJ == kotlinx.coroutines.channels.o.f313844k) {
                        break loop0;
                    }
                    if (objJ != kotlinx.coroutines.channels.o.f313839f) {
                        if (objJ != kotlinx.coroutines.channels.o.f313840g && objJ != null) {
                            if (!(objJ instanceof f4) && !(objJ instanceof r0)) {
                                if (objJ != kotlinx.coroutines.channels.o.f313842i && objJ != kotlinx.coroutines.channels.o.f313841h) {
                                    if (objJ != kotlinx.coroutines.channels.o.f313842i) {
                                        break;
                                    }
                                } else {
                                    break loop0;
                                }
                            } else {
                                if (j10 < P0()) {
                                    break loop0;
                                }
                                f4 f4Var = objJ instanceof r0 ? ((r0) objJ).f313892a : (f4) objJ;
                                if (uVar.D(i10, objJ, kotlinx.coroutines.channels.o.z())) {
                                    if (function1 != null) {
                                        p1VarB = kotlinx.coroutines.internal.r0.b(function1, uVar.I(i10), p1VarB);
                                    }
                                    objC = kotlinx.coroutines.internal.x.h(objC, f4Var);
                                    uVar.E(i10);
                                    uVar.A();
                                    break;
                                }
                            }
                        } else {
                            if (uVar.D(i10, objJ, kotlinx.coroutines.channels.o.z())) {
                                uVar.A();
                                break;
                            }
                        }
                    } else {
                        if (j10 < P0()) {
                            break loop0;
                        }
                        if (uVar.D(i10, objJ, kotlinx.coroutines.channels.o.z())) {
                            if (function1 != null) {
                                p1VarB = kotlinx.coroutines.internal.r0.b(function1, uVar.I(i10), p1VarB);
                            }
                            uVar.E(i10);
                            uVar.A();
                            break;
                        }
                    }
                }
            }
            uVar = (u) uVar.h();
        } while (uVar != null);
        if (objC != null) {
            if (objC instanceof ArrayList) {
                Intrinsics.checkNotNull(objC, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
                ArrayList arrayList = (ArrayList) objC;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    X1((f4) arrayList.get(size));
                }
            } else {
                X1((f4) objC);
            }
        }
        if (p1VarB != null) {
            throw p1VarB;
        }
    }

    private final void W1(f4 f4Var) {
        Y1(f4Var, true);
    }

    private final /* synthetic */ Object X0() {
        return this._closeCause$volatile;
    }

    private final void X1(f4 f4Var) {
        Y1(f4Var, false);
    }

    private final void Y1(f4 f4Var, boolean z10) {
        if (f4Var instanceof b) {
            kotlinx.coroutines.n<Boolean> nVarA = ((b) f4Var).a();
            Result.a aVar = Result.Companion;
            nVarA.resumeWith(Result.m785constructorimpl(Boolean.FALSE));
            return;
        }
        if (f4Var instanceof kotlinx.coroutines.n) {
            kotlin.coroutines.d dVar = (kotlin.coroutines.d) f4Var;
            Result.a aVar2 = Result.Companion;
            dVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(z10 ? K0() : Q0())));
        } else if (f4Var instanceof m0) {
            kotlinx.coroutines.p<t<? extends E>> pVar = ((m0) f4Var).f313794a;
            Result.a aVar3 = Result.Companion;
            pVar.resumeWith(Result.m785constructorimpl(t.b(t.f313893b.a(A0()))));
        } else if (f4Var instanceof a) {
            ((a) f4Var).l();
        } else {
            if (f4Var instanceof kotlinx.coroutines.selects.n) {
                ((kotlinx.coroutines.selects.n) f4Var).i(this, kotlinx.coroutines.channels.o.z());
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + f4Var).toString());
        }
    }

    static /* synthetic */ <E> Object Z1(n<E> nVar, E e10, kotlin.coroutines.d<? super Unit> dVar) {
        u<E> uVar;
        u<E> uVar2 = (u) f313799h.get(nVar);
        while (true) {
            long andIncrement = f313795d.getAndIncrement(nVar);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zI1 = nVar.i1(andIncrement);
            int i10 = kotlinx.coroutines.channels.o.f313835b;
            long j11 = j10 / ((long) i10);
            int i11 = (int) (j10 % ((long) i10));
            if (uVar2.f315133c != j11) {
                u<E> uVarT0 = nVar.t0(j11, uVar2);
                if (uVarT0 != null) {
                    uVar = uVarT0;
                } else if (zI1) {
                    Object objA1 = nVar.A1(e10, dVar);
                    if (objA1 != kotlin.coroutines.intrinsics.b.l()) {
                        break;
                    }
                    return objA1;
                }
            } else {
                uVar = uVar2;
            }
            n<E> nVar2 = nVar;
            E e11 = e10;
            int iA2 = nVar2.A2(uVar, i11, e11, j10, null, zI1);
            if (iA2 == 0) {
                uVar.b();
                break;
            }
            if (iA2 != 1) {
                if (iA2 == 2) {
                    if (!zI1) {
                        break;
                    }
                    uVar.A();
                    Object objA2 = nVar2.A1(e11, dVar);
                    if (objA2 != kotlin.coroutines.intrinsics.b.l()) {
                        break;
                    }
                    return objA2;
                }
                if (iA2 == 3) {
                    Object objF2 = nVar2.f2(uVar, i11, e11, j10, dVar);
                    if (objF2 != kotlin.coroutines.intrinsics.b.l()) {
                        break;
                    }
                    return objF2;
                }
                if (iA2 == 4) {
                    if (j10 < nVar2.P0()) {
                        uVar.b();
                    }
                    Object objA3 = nVar2.A1(e11, dVar);
                    if (objA3 != kotlin.coroutines.intrinsics.b.l()) {
                        break;
                    }
                    return objA3;
                }
                if (iA2 == 5) {
                    uVar.b();
                }
                nVar = nVar2;
                uVar2 = uVar;
                e10 = e11;
            } else {
                break;
            }
        }
        return Unit.f312394a;
    }

    private final void a1(long j10) {
        if ((f313798g.addAndGet(this, j10) & 4611686018427387904L) != 0) {
            while ((f313798g.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    static /* synthetic */ void b1(n nVar, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i10 & 1) != 0) {
            j10 = 1;
        }
        nVar.a1(j10);
    }

    static /* synthetic */ <E> Object b2(n<E> nVar, E e10, kotlin.coroutines.d<? super Boolean> dVar) {
        u uVarT0;
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        if (nVar.f313805b != null) {
            throw new IllegalStateException("the `onUndeliveredElement` feature is unsupported for `sendBroadcast(e)`");
        }
        b bVar = new b(pVar);
        u uVar = (u) f313799h.get(nVar);
        while (true) {
            long andIncrement = f313795d.getAndIncrement(nVar);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zI1 = nVar.i1(andIncrement);
            int i10 = kotlinx.coroutines.channels.o.f313835b;
            long j11 = j10 / ((long) i10);
            int i11 = (int) (j10 % ((long) i10));
            if (uVar.f315133c != j11) {
                uVarT0 = nVar.t0(j11, uVar);
                if (uVarT0 == null) {
                    if (zI1) {
                        Result.a aVar = Result.Companion;
                        pVar.resumeWith(Result.m785constructorimpl(kotlin.coroutines.jvm.internal.b.a(false)));
                        break;
                    }
                }
            } else {
                uVarT0 = uVar;
            }
            E e11 = e10;
            n<E> nVar2 = nVar;
            int iA2 = nVar2.A2(uVarT0, i11, e11, j10, bVar, zI1);
            uVar = uVarT0;
            if (iA2 == 0) {
                uVar.b();
            } else if (iA2 != 1) {
                if (iA2 == 2) {
                    if (!zI1) {
                        nVar2.H1(bVar, uVar, i11);
                        break;
                    }
                    uVar.A();
                } else {
                    if (iA2 == 3) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (iA2 != 4) {
                        if (iA2 == 5) {
                            uVar.b();
                        }
                        nVar = nVar2;
                        e10 = e11;
                    } else if (j10 < nVar2.P0()) {
                        uVar.b();
                    }
                }
                Result.a aVar2 = Result.Companion;
                pVar.resumeWith(Result.m785constructorimpl(kotlin.coroutines.jvm.internal.b.a(false)));
                break;
            }
            Result.a aVar3 = Result.Companion;
            pVar.resumeWith(Result.m785constructorimpl(kotlin.coroutines.jvm.internal.b.a(true)));
            break;
        }
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.i<Unit> c0(Function1<? super E, Unit> function1) {
        return new c(this);
    }

    private final void c1() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f313803l;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, obj == null ? kotlinx.coroutines.channels.o.f313858y : kotlinx.coroutines.channels.o.f313859z));
        if (obj == null) {
            return;
        }
        ((Function1) obj).invoke(A0());
    }

    private final <R> R c2(E e10, Object obj, Function0<? extends R> function0, Function2<? super u<E>, ? super Integer, ? extends R> function2, Function0<? extends R> function1, pj.o<? super u<E>, ? super Integer, ? super E, ? super Long, ? extends R> oVar) {
        u uVar = (u) f313799h.get(this);
        while (true) {
            long andIncrement = f313795d.getAndIncrement(this);
            long j10 = 1152921504606846975L & andIncrement;
            boolean zI1 = i1(andIncrement);
            int i10 = kotlinx.coroutines.channels.o.f313835b;
            long j11 = j10 / ((long) i10);
            int i11 = (int) (j10 % ((long) i10));
            if (uVar.f315133c != j11) {
                u uVarT0 = t0(j11, uVar);
                if (uVarT0 != null) {
                    uVar = uVarT0;
                } else if (zI1) {
                    return function1.invoke();
                }
            }
            int iA2 = A2(uVar, i11, e10, j10, obj, zI1);
            if (iA2 == 0) {
                uVar.b();
                return function0.invoke();
            }
            if (iA2 == 1) {
                return function0.invoke();
            }
            if (iA2 == 2) {
                if (zI1) {
                    uVar.A();
                    return function1.invoke();
                }
                f4 f4Var = obj instanceof f4 ? (f4) obj : null;
                if (f4Var != null) {
                    H1(f4Var, uVar, i11);
                }
                return function2.invoke(uVar, Integer.valueOf(i11));
            }
            if (iA2 == 3) {
                return oVar.invoke(uVar, Integer.valueOf(i11), e10, Long.valueOf(j10));
            }
            if (iA2 == 4) {
                if (j10 < P0()) {
                    uVar.b();
                }
                return function1.invoke();
            }
            if (iA2 == 5) {
                uVar.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final pj.n<Throwable, Object, CoroutineContext, Unit> d0(final Function1<? super E, Unit> function1, final E e10) {
        return new pj.n() { // from class: kotlinx.coroutines.channels.m
            @Override // pj.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return n.e0(function1, e10, (Throwable) obj, obj2, (CoroutineContext) obj3);
            }
        };
    }

    private final boolean d1(u<E> uVar, int i10, long j10) {
        Object objJ;
        do {
            objJ = uVar.J(i10);
            if (objJ != null && objJ != kotlinx.coroutines.channels.o.f313840g) {
                if (objJ == kotlinx.coroutines.channels.o.f313839f) {
                    return true;
                }
                if (objJ == kotlinx.coroutines.channels.o.f313845l || objJ == kotlinx.coroutines.channels.o.z() || objJ == kotlinx.coroutines.channels.o.f313844k || objJ == kotlinx.coroutines.channels.o.f313843j) {
                    return false;
                }
                if (objJ == kotlinx.coroutines.channels.o.f313842i) {
                    return true;
                }
                return objJ != kotlinx.coroutines.channels.o.f313841h && j10 == P0();
            }
        } while (!uVar.D(i10, objJ, kotlinx.coroutines.channels.o.f313843j));
        q0();
        return false;
    }

    static /* synthetic */ Object d2(n nVar, Object obj, Object obj2, Function0 function0, Function2 function2, Function0 function1, pj.o oVar, int i10, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendImpl");
        }
        pj.o oVar2 = (i10 & 32) != 0 ? p.f313831a : oVar;
        u uVar = (u) f313799h.get(nVar);
        while (true) {
            long andIncrement = f313795d.getAndIncrement(nVar);
            long j10 = 1152921504606846975L & andIncrement;
            boolean zI1 = nVar.i1(andIncrement);
            int i11 = kotlinx.coroutines.channels.o.f313835b;
            long j11 = j10 / ((long) i11);
            int i12 = (int) (j10 % ((long) i11));
            if (uVar.f315133c != j11) {
                u uVarT0 = nVar.t0(j11, uVar);
                if (uVarT0 != null) {
                    uVar = uVarT0;
                } else if (zI1) {
                    return function1.invoke();
                }
            }
            int iA2 = nVar.A2(uVar, i12, obj, j10, obj2, zI1);
            if (iA2 == 0) {
                uVar.b();
                return function0.invoke();
            }
            if (iA2 == 1) {
                return function0.invoke();
            }
            if (iA2 == 2) {
                if (zI1) {
                    uVar.A();
                    return function1.invoke();
                }
                f4 f4Var = obj2 instanceof f4 ? (f4) obj2 : null;
                if (f4Var != null) {
                    nVar.H1(f4Var, uVar, i12);
                }
                return function2.invoke(uVar, Integer.valueOf(i12));
            }
            if (iA2 == 3) {
                return oVar2.invoke(uVar, Integer.valueOf(i12), obj, Long.valueOf(j10));
            }
            if (iA2 == 4) {
                if (j10 < nVar.P0()) {
                    uVar.b();
                }
                return function1.invoke();
            }
            if (iA2 == 5) {
                uVar.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e0(Function1 function1, Object obj, Throwable th2, Object obj2, CoroutineContext coroutineContext) {
        kotlinx.coroutines.internal.r0.a(function1, obj, coroutineContext);
        return Unit.f312394a;
    }

    private final boolean e1(long j10, boolean z10) {
        int i10 = (int) (j10 >> 60);
        if (i10 == 0 || i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            n0(j10 & 1152921504606846975L);
            return (z10 && Z0()) ? false : true;
        }
        if (i10 == 3) {
            m0(j10 & 1152921504606846975L);
            return true;
        }
        throw new IllegalStateException(("unexpected close status: " + i10).toString());
    }

    private final void e2(u<E> uVar, int i10, E e10, long j10, f4 f4Var, Function0<Unit> function0, Function0<Unit> function1) {
        Unit unitInvoke;
        int iA2 = A2(uVar, i10, e10, j10, f4Var, false);
        if (iA2 == 0) {
            uVar.b();
            function0.invoke();
            return;
        }
        if (iA2 == 1) {
            function0.invoke();
            return;
        }
        if (iA2 == 2) {
            H1(f4Var, uVar, i10);
            return;
        }
        if (iA2 == 4) {
            if (j10 < P0()) {
                uVar.b();
            }
            function1.invoke();
            return;
        }
        String str = "unexpected";
        if (iA2 != 5) {
            throw new IllegalStateException("unexpected");
        }
        uVar.b();
        u uVar2 = (u) f313799h.get(this);
        while (true) {
            long andIncrement = f313795d.getAndIncrement(this);
            long j11 = 1152921504606846975L & andIncrement;
            boolean zI1 = i1(andIncrement);
            int i11 = kotlinx.coroutines.channels.o.f313835b;
            long j12 = j11 / ((long) i11);
            int i12 = (int) (j11 % ((long) i11));
            str = str;
            if (uVar2.f315133c != j12) {
                u uVarT0 = t0(j12, uVar2);
                if (uVarT0 != null) {
                    uVar2 = uVarT0;
                } else if (zI1) {
                    unitInvoke = function1.invoke();
                    break;
                }
            }
            int iA3 = A2(uVar2, i12, e10, j11, f4Var, zI1);
            if (iA3 == 0) {
                uVar2.b();
                unitInvoke = function0.invoke();
                break;
            }
            if (iA3 == 1) {
                unitInvoke = function0.invoke();
                break;
            }
            if (iA3 == 2) {
                if (!zI1) {
                    f4 f4Var2 = f4Var != 0 ? f4Var : null;
                    if (f4Var2 != null) {
                        H1(f4Var2, uVar2, i12);
                    }
                    unitInvoke = Unit.f312394a;
                    break;
                }
                uVar2.A();
                unitInvoke = function1.invoke();
                break;
            }
            if (iA3 == 3) {
                throw new IllegalStateException(str);
            }
            if (iA3 == 4) {
                if (j11 < P0()) {
                    uVar2.b();
                }
                unitInvoke = function1.invoke();
                break;
            } else if (iA3 == 5) {
                uVar2.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.i<Unit> f0(Function1<? super E, Unit> function1) {
        return new d(this);
    }

    @c2
    public static /* synthetic */ void f1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:62:0x0102  */
    /* JADX WARN: Code duplicated, block: B:65:0x010b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x010c  */
    public final Object f2(u<E> uVar, int i10, E e10, long j10, kotlin.coroutines.d<? super Unit> dVar) {
        Object objM785constructorimpl;
        Object objU;
        kotlinx.coroutines.p pVarB = kotlinx.coroutines.r.b(kotlin.coroutines.intrinsics.b.e(dVar));
        try {
            int iA2 = A2(uVar, i10, e10, j10, pVarB, false);
            if (iA2 == 0) {
                uVar.b();
                Result.a aVar = Result.Companion;
                objM785constructorimpl = Result.m785constructorimpl(Unit.f312394a);
            } else {
                if (iA2 != 1) {
                    if (iA2 != 2) {
                        if (iA2 != 4) {
                            if (iA2 != 5) {
                                throw new IllegalStateException("unexpected");
                            }
                            uVar.b();
                            u uVar2 = (u) f313799h.get(this);
                            while (true) {
                                long andIncrement = f313795d.getAndIncrement(this);
                                long j11 = 1152921504606846975L & andIncrement;
                                boolean zI1 = i1(andIncrement);
                                int i11 = kotlinx.coroutines.channels.o.f313835b;
                                long j12 = j11 / ((long) i11);
                                int i12 = (int) (j11 % ((long) i11));
                                if (uVar2.f315133c != j12) {
                                    u uVarT0 = t0(j12, uVar2);
                                    if (uVarT0 != null) {
                                        uVar2 = uVarT0;
                                    } else if (zI1) {
                                    }
                                }
                                int iA3 = A2(uVar2, i12, e10, j11, pVarB, zI1);
                                if (iA3 == 0) {
                                    uVar2.b();
                                    Result.a aVar2 = Result.Companion;
                                    objM785constructorimpl = Result.m785constructorimpl(Unit.f312394a);
                                } else if (iA3 == 1) {
                                    Result.a aVar3 = Result.Companion;
                                    objM785constructorimpl = Result.m785constructorimpl(Unit.f312394a);
                                } else if (iA3 == 2) {
                                    if (!zI1) {
                                        kotlinx.coroutines.p pVar = pVarB != null ? pVarB : null;
                                        if (pVar == null) {
                                            break;
                                        }
                                        H1(pVar, uVar2, i12);
                                        break;
                                    }
                                    uVar2.A();
                                } else {
                                    if (iA3 == 3) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    if (iA3 != 4) {
                                        if (iA3 == 5) {
                                            uVar2.b();
                                        }
                                    } else if (j11 < P0()) {
                                        uVar2.b();
                                    }
                                }
                            }
                        } else if (j10 < P0()) {
                            uVar.b();
                        }
                        B1(e10, pVarB);
                        break;
                    } else {
                        H1(pVarB, uVar, i10);
                    }
                    objU = pVarB.u();
                    if (objU == kotlin.coroutines.intrinsics.b.l()) {
                        kotlin.coroutines.jvm.internal.h.c(dVar);
                    }
                    if (objU == kotlin.coroutines.intrinsics.b.l()) {
                        return objU;
                    }
                    return Unit.f312394a;
                }
                Result.a aVar4 = Result.Companion;
                objM785constructorimpl = Result.m785constructorimpl(Unit.f312394a);
            }
            pVarB.resumeWith(objM785constructorimpl);
            objU = pVarB.u();
            if (objU == kotlin.coroutines.intrinsics.b.l()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            if (objU == kotlin.coroutines.intrinsics.b.l()) {
                return objU;
            }
            return Unit.f312394a;
        } catch (Throwable th2) {
            pVarB.R();
            throw th2;
        }
    }

    private final boolean g0(long j10) {
        if (j10 >= x0() && j10 >= P0() + ((long) this.f313804a)) {
            return false;
        }
        return true;
    }

    private final boolean g1(long j10) {
        return e1(j10, true);
    }

    private final /* synthetic */ void g2(long j10) {
        this.bufferEnd$volatile = j10;
    }

    @c2
    public static /* synthetic */ void h1() {
    }

    private final /* synthetic */ void h2(Object obj) {
        this.bufferEndSegment$volatile = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void i0(u<E> uVar, long j10) {
        Object objC = kotlinx.coroutines.internal.x.c(null, 1, null);
        loop0: while (uVar != null) {
            for (int i10 = kotlinx.coroutines.channels.o.f313835b - 1; -1 < i10; i10--) {
                if ((uVar.f315133c * ((long) kotlinx.coroutines.channels.o.f313835b)) + ((long) i10) < j10) {
                    break loop0;
                }
                while (true) {
                    Object objJ = uVar.J(i10);
                    if (objJ != null && objJ != kotlinx.coroutines.channels.o.f313840g) {
                        if (!(objJ instanceof r0)) {
                            if (!(objJ instanceof f4)) {
                                break;
                            }
                            if (uVar.D(i10, objJ, kotlinx.coroutines.channels.o.z())) {
                                objC = kotlinx.coroutines.internal.x.h(objC, objJ);
                                uVar.K(i10, true);
                                break;
                            }
                        } else {
                            if (uVar.D(i10, objJ, kotlinx.coroutines.channels.o.z())) {
                                objC = kotlinx.coroutines.internal.x.h(objC, ((r0) objJ).f313892a);
                                uVar.K(i10, true);
                                break;
                            }
                        }
                    } else {
                        if (uVar.D(i10, objJ, kotlinx.coroutines.channels.o.z())) {
                            uVar.A();
                            break;
                        }
                    }
                }
            }
            uVar = (u) uVar.h();
        }
        if (objC != null) {
            if (!(objC instanceof ArrayList)) {
                W1((f4) objC);
                return;
            }
            Intrinsics.checkNotNull(objC, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ArrayList arrayList = (ArrayList) objC;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                W1((f4) arrayList.get(size));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean i1(long j10) {
        return e1(j10, false);
    }

    private final /* synthetic */ void i2(Object obj) {
        this.closeHandler$volatile = obj;
    }

    private final /* synthetic */ void j2(long j10) {
        this.completedExpandBuffersAndPauseFlag$volatile = j10;
    }

    private final u<E> k0() {
        Object obj = f313801j.get(this);
        u uVar = (u) f313799h.get(this);
        if (uVar.f315133c > ((u) obj).f315133c) {
            obj = uVar;
        }
        u uVar2 = (u) f313800i.get(this);
        if (uVar2.f315133c > ((u) obj).f315133c) {
            obj = uVar2;
        }
        return (u) kotlinx.coroutines.internal.e.e((kotlinx.coroutines.internal.f) obj);
    }

    @c2
    public static /* synthetic */ void k1() {
    }

    private final /* synthetic */ void k2(Object obj) {
        this.receiveSegment$volatile = obj;
    }

    private final boolean l1() {
        long jX0 = x0();
        return jX0 == 0 || jX0 == Long.MAX_VALUE;
    }

    private final /* synthetic */ void l2(long j10) {
        this.receivers$volatile = j10;
    }

    private final void m0(long j10) {
        V1(n0(j10));
    }

    private final /* synthetic */ void m1(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Function1<Object, Unit> function1) {
        while (true) {
            function1.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final /* synthetic */ void m2(Object obj) {
        this.sendSegment$volatile = obj;
    }

    private final u<E> n0(long j10) {
        u<E> uVarK0 = k0();
        if (j1()) {
            long jO1 = o1(uVarK0);
            if (jO1 != -1) {
                p0(jO1);
            }
        }
        i0(uVarK0, j10);
        return uVarK0;
    }

    private final /* synthetic */ void n1(AtomicLongFieldUpdater atomicLongFieldUpdater, Object obj, Function1<? super Long, Unit> function1) {
        while (true) {
            function1.invoke(Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    private final /* synthetic */ void n2(long j10) {
        this.sendersAndCloseStatus$volatile = j10;
    }

    private final void o0() {
        B();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long o1(u<E> uVar) {
        do {
            int i10 = kotlinx.coroutines.channels.o.f313835b;
            while (true) {
                i10--;
                if (-1 < i10) {
                    long j10 = (uVar.f315133c * ((long) kotlinx.coroutines.channels.o.f313835b)) + ((long) i10);
                    if (j10 >= P0()) {
                        while (true) {
                            Object objJ = uVar.J(i10);
                            if (objJ != null && objJ != kotlinx.coroutines.channels.o.f313840g) {
                                if (objJ != kotlinx.coroutines.channels.o.f313839f) {
                                    break;
                                }
                                return j10;
                            }
                            if (uVar.D(i10, objJ, kotlinx.coroutines.channels.o.z())) {
                                uVar.A();
                                break;
                            }
                        }
                    } else {
                        return -1L;
                    }
                }
            }
            uVar = (u) uVar.h();
        } while (uVar != null);
        return -1L;
    }

    private final /* synthetic */ void o2(Object obj) {
        this._closeCause$volatile = obj;
    }

    private final void p1() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f313795d;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if (((int) (j10 >> 60)) != 0) {
                return;
            }
            n<E> nVar = this;
            if (atomicLongFieldUpdater.compareAndSet(nVar, j10, kotlinx.coroutines.channels.o.w(1152921504606846975L & j10, 1))) {
                return;
            } else {
                this = nVar;
            }
        }
    }

    private final boolean p2(long j10) {
        if (i1(j10)) {
            return false;
        }
        return !g0(j10 & 1152921504606846975L);
    }

    private final void q0() {
        n<E> nVar;
        if (l1()) {
            return;
        }
        u<E> uVar = (u) f313801j.get(this);
        while (true) {
            long andIncrement = f313797f.getAndIncrement(this);
            int i10 = kotlinx.coroutines.channels.o.f313835b;
            long j10 = andIncrement / ((long) i10);
            if (this.W0() <= andIncrement) {
                if (uVar.f315133c < j10 && uVar.f() != 0) {
                    this.s1(j10, uVar);
                }
                b1(this, 0L, 1, null);
                return;
            }
            if (uVar.f315133c != j10) {
                nVar = this;
                u<E> uVarR0 = nVar.r0(j10, uVar, andIncrement);
                if (uVarR0 == null) {
                    continue;
                } else {
                    uVar = uVarR0;
                }
                this = nVar;
            } else {
                nVar = this;
            }
            if (nVar.w2(uVar, (int) (andIncrement % ((long) i10)), andIncrement)) {
                b1(nVar, 0L, 1, null);
                return;
            } else {
                b1(nVar, 0L, 1, null);
                this = nVar;
            }
        }
    }

    private final void q1() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f313795d;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            n<E> nVar = this;
            if (atomicLongFieldUpdater.compareAndSet(nVar, j10, kotlinx.coroutines.channels.o.w(1152921504606846975L & j10, 3))) {
                return;
            } else {
                this = nVar;
            }
        }
    }

    private final u<E> r0(long j10, u<E> uVar, long j11) {
        Object objI;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f313801j;
        Function2 function2 = (Function2) kotlinx.coroutines.channels.o.y();
        loop0: while (true) {
            objI = kotlinx.coroutines.internal.e.i(uVar, j10, function2);
            if (!x0.h(objI)) {
                w0 w0VarF = x0.f(objI);
                while (true) {
                    w0 w0Var = (w0) atomicReferenceFieldUpdater.get(this);
                    if (w0Var.f315133c >= w0VarF.f315133c) {
                        break loop0;
                    }
                    if (!w0VarF.C()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, w0Var, w0VarF)) {
                        if (!w0Var.v()) {
                            break loop0;
                        }
                        w0Var.q();
                        break loop0;
                    }
                    if (w0VarF.v()) {
                        w0VarF.q();
                    }
                }
            } else {
                break;
            }
        }
        if (x0.h(objI)) {
            o0();
            s1(j10, uVar);
            b1(this, 0L, 1, null);
            return null;
        }
        u<E> uVar2 = (u) x0.f(objI);
        if (uVar2.f315133c <= j10) {
            return uVar2;
        }
        long j12 = uVar2.f315133c;
        int i10 = kotlinx.coroutines.channels.o.f313835b;
        if (f313797f.compareAndSet(this, j11 + 1, j12 * ((long) i10))) {
            a1((uVar2.f315133c * ((long) i10)) - j11);
        } else {
            b1(this, 0L, 1, null);
        }
        return null;
    }

    private final void r1() {
        long jW;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f313795d;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (j10 >> 60);
            if (i10 == 0) {
                jW = kotlinx.coroutines.channels.o.w(1152921504606846975L & j10, 2);
            } else if (i10 != 1) {
                break;
            } else {
                jW = kotlinx.coroutines.channels.o.w(1152921504606846975L & j10, 3);
            }
            n<E> nVar = this;
            if (atomicLongFieldUpdater.compareAndSet(nVar, j10, jW)) {
                break;
            } else {
                this = nVar;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final u<E> s0(long j10, u<E> uVar) {
        Object objI;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f313800i;
        Function2 function2 = (Function2) kotlinx.coroutines.channels.o.y();
        loop0: while (true) {
            objI = kotlinx.coroutines.internal.e.i(uVar, j10, function2);
            if (!x0.h(objI)) {
                w0 w0VarF = x0.f(objI);
                while (true) {
                    w0 w0Var = (w0) atomicReferenceFieldUpdater.get(this);
                    if (w0Var.f315133c >= w0VarF.f315133c) {
                        break loop0;
                    }
                    if (!w0VarF.C()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, w0Var, w0VarF)) {
                        if (!w0Var.v()) {
                            break loop0;
                        }
                        w0Var.q();
                        break loop0;
                    }
                    if (w0VarF.v()) {
                        w0VarF.q();
                    }
                }
            } else {
                break;
            }
        }
        if (x0.h(objI)) {
            o0();
            if (uVar.f315133c * ((long) kotlinx.coroutines.channels.o.f313835b) < W0()) {
                uVar.b();
            }
            return null;
        }
        u<E> uVar2 = (u) x0.f(objI);
        if (!l1() && j10 <= x0() / ((long) kotlinx.coroutines.channels.o.f313835b)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f313801j;
            while (true) {
                w0 w0Var2 = (w0) atomicReferenceFieldUpdater2.get(this);
                if (w0Var2.f315133c >= uVar2.f315133c || !uVar2.C()) {
                    break;
                }
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater2, this, w0Var2, uVar2)) {
                    if (!w0Var2.v()) {
                        break;
                    }
                    w0Var2.q();
                    break;
                }
                if (uVar2.v()) {
                    uVar2.q();
                }
            }
        }
        long j11 = uVar2.f315133c;
        if (j11 <= j10) {
            return uVar2;
        }
        int i10 = kotlinx.coroutines.channels.o.f313835b;
        C2(j11 * ((long) i10));
        if (uVar2.f315133c * ((long) i10) < W0()) {
            uVar2.b();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void s1(long j10, u<E> uVar) {
        u<E> uVar2;
        u<E> uVar3;
        while (uVar.f315133c < j10 && (uVar3 = (u) uVar.f()) != null) {
            uVar = uVar3;
        }
        while (true) {
            if (!uVar.m() || (uVar2 = (u) uVar.f()) == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f313801j;
                while (true) {
                    w0 w0Var = (w0) atomicReferenceFieldUpdater.get(this);
                    if (w0Var.f315133c >= uVar.f315133c) {
                        return;
                    }
                    if (!uVar.C()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, w0Var, uVar)) {
                        if (w0Var.v()) {
                            w0Var.q();
                        }
                        return;
                    } else if (uVar.v()) {
                        uVar.q();
                    }
                }
            } else {
                uVar = uVar2;
            }
        }
    }

    private final boolean s2(Object obj, E e10) {
        if (obj instanceof kotlinx.coroutines.selects.n) {
            return ((kotlinx.coroutines.selects.n) obj).i(this, e10);
        }
        if (obj instanceof m0) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            kotlinx.coroutines.p<t<? extends E>> pVar = ((m0) obj).f313794a;
            t tVarB = t.b(t.f313893b.c(e10));
            Function1<E, Unit> function1 = this.f313805b;
            return kotlinx.coroutines.channels.o.F(pVar, tVarB, (pj.n) (function1 != null ? f0(function1) : null));
        }
        if (obj instanceof a) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).k(e10);
        }
        if (obj instanceof kotlinx.coroutines.n) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            kotlinx.coroutines.n nVar = (kotlinx.coroutines.n) obj;
            Function1<E, Unit> function2 = this.f313805b;
            return kotlinx.coroutines.channels.o.F(nVar, e10, (pj.n) (function2 != null ? c0(function2) : null));
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final u<E> t0(long j10, u<E> uVar) {
        Object objI;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f313799h;
        Function2 function2 = (Function2) kotlinx.coroutines.channels.o.y();
        loop0: while (true) {
            objI = kotlinx.coroutines.internal.e.i(uVar, j10, function2);
            if (!x0.h(objI)) {
                w0 w0VarF = x0.f(objI);
                while (true) {
                    w0 w0Var = (w0) atomicReferenceFieldUpdater.get(this);
                    if (w0Var.f315133c >= w0VarF.f315133c) {
                        break loop0;
                    }
                    if (!w0VarF.C()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, w0Var, w0VarF)) {
                        if (!w0Var.v()) {
                            break loop0;
                        }
                        w0Var.q();
                        break loop0;
                    }
                    if (w0VarF.v()) {
                        w0VarF.q();
                    }
                }
            } else {
                break;
            }
        }
        if (x0.h(objI)) {
            o0();
            if (uVar.f315133c * ((long) kotlinx.coroutines.channels.o.f313835b) < P0()) {
                uVar.b();
            }
            return null;
        }
        u<E> uVar2 = (u) x0.f(objI);
        long j11 = uVar2.f315133c;
        if (j11 <= j10) {
            return uVar2;
        }
        int i10 = kotlinx.coroutines.channels.o.f313835b;
        D2(j11 * ((long) i10));
        if (uVar2.f315133c * ((long) i10) < P0()) {
            uVar2.b();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t1(Throwable th2, Object obj, CoroutineContext coroutineContext) {
        Function1<E, Unit> function1 = this.f313805b;
        Intrinsics.checkNotNull(function1);
        Object objH = t.h(obj);
        Intrinsics.checkNotNull(objH);
        kotlinx.coroutines.internal.r0.a(function1, objH, coroutineContext);
    }

    private final boolean t2(Object obj, u<E> uVar, int i10) {
        if (obj instanceof kotlinx.coroutines.n) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return kotlinx.coroutines.channels.o.G((kotlinx.coroutines.n) obj, Unit.f312394a, null, 2, null);
        }
        if (obj instanceof kotlinx.coroutines.selects.n) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            kotlinx.coroutines.selects.s sVarL = ((kotlinx.coroutines.selects.m) obj).L(this, Unit.f312394a);
            if (sVarL == kotlinx.coroutines.selects.s.REREGISTER) {
                uVar.E(i10);
            }
            return sVarL == kotlinx.coroutines.selects.s.SUCCESSFUL;
        }
        if (obj instanceof b) {
            return kotlinx.coroutines.channels.o.G(((b) obj).a(), Boolean.TRUE, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    private final /* synthetic */ Object u0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Function1<Object, ? extends Object> function1) {
        Object obj2;
        do {
            obj2 = atomicReferenceFieldUpdater.get(obj);
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, obj, obj2, function1.invoke(obj2)));
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u1(Throwable th2, E e10, CoroutineContext coroutineContext) {
        Function1<E, Unit> function1 = this.f313805b;
        Intrinsics.checkNotNull(function1);
        kotlinx.coroutines.internal.r0.a(function1, e10, coroutineContext);
    }

    private final /* synthetic */ long v0() {
        return this.bufferEnd$volatile;
    }

    private final /* synthetic */ void v2(AtomicLongFieldUpdater atomicLongFieldUpdater, Object obj, Function1<? super Long, Long> function1) {
        while (true) {
            long j10 = atomicLongFieldUpdater.get(obj);
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
            Object obj2 = obj;
            if (atomicLongFieldUpdater2.compareAndSet(obj2, j10, function1.invoke(Long.valueOf(j10)).longValue())) {
                return;
            }
            atomicLongFieldUpdater = atomicLongFieldUpdater2;
            obj = obj2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w1(kotlinx.coroutines.n<? super t<? extends E>> nVar) {
        Result.a aVar = Result.Companion;
        nVar.resumeWith(Result.m785constructorimpl(t.b(t.f313893b.a(A0()))));
    }

    private final boolean w2(u<E> uVar, int i10, long j10) {
        Object objJ = uVar.J(i10);
        if (!(objJ instanceof f4) || j10 < f313796e.get(this) || !uVar.D(i10, objJ, kotlinx.coroutines.channels.o.f313842i)) {
            return x2(uVar, i10, j10);
        }
        if (t2(objJ, uVar, i10)) {
            uVar.N(i10, kotlinx.coroutines.channels.o.f313839f);
            return true;
        }
        uVar.N(i10, kotlinx.coroutines.channels.o.f313845l);
        uVar.K(i10, false);
        return false;
    }

    private final long x0() {
        return f313797f.get(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x1(kotlinx.coroutines.n<? super E> nVar) {
        Result.a aVar = Result.Companion;
        nVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(K0())));
    }

    private final boolean x2(u<E> uVar, int i10, long j10) {
        while (true) {
            Object objJ = uVar.J(i10);
            if (objJ instanceof f4) {
                if (j10 < f313796e.get(this)) {
                    if (uVar.D(i10, objJ, new r0((f4) objJ))) {
                        return true;
                    }
                } else if (uVar.D(i10, objJ, kotlinx.coroutines.channels.o.f313842i)) {
                    if (t2(objJ, uVar, i10)) {
                        uVar.N(i10, kotlinx.coroutines.channels.o.f313839f);
                        return true;
                    }
                    uVar.N(i10, kotlinx.coroutines.channels.o.f313845l);
                    uVar.K(i10, false);
                    return false;
                }
            } else {
                if (objJ == kotlinx.coroutines.channels.o.f313845l) {
                    return false;
                }
                if (objJ == null) {
                    if (uVar.D(i10, objJ, kotlinx.coroutines.channels.o.f313840g)) {
                        return true;
                    }
                } else {
                    if (objJ == kotlinx.coroutines.channels.o.f313839f) {
                        return true;
                    }
                    if (objJ == kotlinx.coroutines.channels.o.f313843j || objJ == kotlinx.coroutines.channels.o.f313844k || objJ == kotlinx.coroutines.channels.o.f313846m) {
                        return true;
                    }
                    if (objJ == kotlinx.coroutines.channels.o.z()) {
                        return true;
                    }
                    if (objJ != kotlinx.coroutines.channels.o.f313841h) {
                        throw new IllegalStateException(("Unexpected cell state: " + objJ).toString());
                    }
                }
            }
        }
    }

    private final /* synthetic */ Object y0() {
        return this.bufferEndSegment$volatile;
    }

    private final void y1(kotlinx.coroutines.selects.n<?> nVar) {
        nVar.f(kotlinx.coroutines.channels.o.z());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object y2(u<E> uVar, int i10, long j10, Object obj) {
        Object objJ = uVar.J(i10);
        if (objJ == null) {
            if (j10 >= (f313795d.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return kotlinx.coroutines.channels.o.f313849p;
                }
                if (uVar.D(i10, objJ, obj)) {
                    q0();
                    return kotlinx.coroutines.channels.o.f313848o;
                }
            }
        } else if (objJ == kotlinx.coroutines.channels.o.f313839f && uVar.D(i10, objJ, kotlinx.coroutines.channels.o.f313844k)) {
            q0();
            return uVar.L(i10);
        }
        return z2(uVar, i10, j10, obj);
    }

    private final void z1(E e10, kotlinx.coroutines.selects.n<?> nVar) {
        Function1<E, Unit> function1 = this.f313805b;
        if (function1 != null) {
            kotlinx.coroutines.internal.r0.a(function1, e10, nVar.getContext());
        }
        nVar.f(kotlinx.coroutines.channels.o.z());
    }

    private final Object z2(u<E> uVar, int i10, long j10, Object obj) {
        while (true) {
            Object objJ = uVar.J(i10);
            if (objJ == null || objJ == kotlinx.coroutines.channels.o.f313840g) {
                if (j10 < (f313795d.get(this) & 1152921504606846975L)) {
                    if (uVar.D(i10, objJ, kotlinx.coroutines.channels.o.f313843j)) {
                        q0();
                        return kotlinx.coroutines.channels.o.f313850q;
                    }
                } else {
                    if (obj == null) {
                        return kotlinx.coroutines.channels.o.f313849p;
                    }
                    if (uVar.D(i10, objJ, obj)) {
                        q0();
                        return kotlinx.coroutines.channels.o.f313848o;
                    }
                }
            } else {
                if (objJ != kotlinx.coroutines.channels.o.f313839f) {
                    if (objJ != kotlinx.coroutines.channels.o.f313845l && objJ != kotlinx.coroutines.channels.o.f313843j) {
                        if (objJ == kotlinx.coroutines.channels.o.z()) {
                            q0();
                            return kotlinx.coroutines.channels.o.f313850q;
                        }
                        if (objJ != kotlinx.coroutines.channels.o.f313842i && uVar.D(i10, objJ, kotlinx.coroutines.channels.o.f313841h)) {
                            boolean z10 = objJ instanceof r0;
                            if (z10) {
                                objJ = ((r0) objJ).f313892a;
                            }
                            if (t2(objJ, uVar, i10)) {
                                uVar.N(i10, kotlinx.coroutines.channels.o.f313844k);
                                q0();
                                return uVar.L(i10);
                            }
                            uVar.N(i10, kotlinx.coroutines.channels.o.f313845l);
                            uVar.K(i10, false);
                            if (z10) {
                                q0();
                            }
                            return kotlinx.coroutines.channels.o.f313850q;
                        }
                    }
                    return kotlinx.coroutines.channels.o.f313850q;
                }
                if (uVar.D(i10, objJ, kotlinx.coroutines.channels.o.f313844k)) {
                    q0();
                    return uVar.L(i10);
                }
            }
        }
    }

    @Override // kotlinx.coroutines.channels.n0
    @Nullable
    public Object A(@NotNull kotlin.coroutines.d<? super t<? extends E>> dVar) {
        return N1(this, dVar);
    }

    @Nullable
    protected final Throwable A0() {
        return (Throwable) f313802k.get(this);
    }

    @Override // kotlinx.coroutines.channels.o0
    public boolean B() {
        return i1(f313795d.get(this));
    }

    @Override // kotlinx.coroutines.channels.n0
    public boolean C() {
        return g1(f313795d.get(this));
    }

    protected void C1() {
    }

    @Override // kotlinx.coroutines.channels.n0
    @NotNull
    public kotlinx.coroutines.selects.h<E> D() {
        e eVar = e.f313812a;
        Intrinsics.checkNotNull(eVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        int i10 = 6 ^ 3;
        pj.n nVar = (pj.n) r1.q(eVar, 3);
        f fVar = f.f313813a;
        Intrinsics.checkNotNull(fVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new kotlinx.coroutines.selects.i(this, nVar, (pj.n) r1.q(fVar, 3), this.f313806c);
    }

    protected void D1() {
    }

    public final void E2(long j10) {
        n<E> nVar = this;
        if (nVar.l1()) {
            return;
        }
        while (nVar.x0() <= j10) {
            nVar = this;
        }
        int i10 = kotlinx.coroutines.channels.o.f313836c;
        for (int i11 = 0; i11 < i10; i11++) {
            long jX0 = nVar.x0();
            if (jX0 == (4611686018427387903L & f313798g.get(nVar)) && jX0 == nVar.x0()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f313798g;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(nVar);
            if (atomicLongFieldUpdater.compareAndSet(nVar, j11, kotlinx.coroutines.channels.o.v(j11 & 4611686018427387903L, true))) {
                break;
            } else {
                nVar = this;
            }
        }
        while (true) {
            long jX1 = nVar.x0();
            long j12 = f313798g.get(nVar);
            long j13 = j12 & 4611686018427387903L;
            boolean z10 = (4611686018427387904L & j12) != 0;
            if (jX1 == j13 && jX1 == nVar.x0()) {
                break;
            }
            if (z10) {
                nVar = this;
            } else {
                nVar = this;
                f313798g.compareAndSet(nVar, j12, kotlinx.coroutines.channels.o.v(j13, true));
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f313798g;
        while (true) {
            long j14 = atomicLongFieldUpdater2.get(nVar);
            boolean zCompareAndSet = atomicLongFieldUpdater2.compareAndSet(nVar, j14, kotlinx.coroutines.channels.o.v(j14 & 4611686018427387903L, false));
            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
            if (zCompareAndSet) {
                return;
            }
            atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
            nVar = this;
        }
    }

    @Override // kotlinx.coroutines.channels.o0
    public boolean F(@Nullable Throwable th2) {
        return l0(th2, false);
    }

    @Override // kotlinx.coroutines.channels.o0
    @Nullable
    public Object G(E e10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return Z1(this, e10, dVar);
    }

    public final long P0() {
        return f313796e.get(this);
    }

    @NotNull
    protected final Throwable Q0() {
        Throwable thA0 = A0();
        if (thA0 == null) {
            thA0 = new d0(v.f313899a);
        }
        return thA0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlinx.coroutines.channels.n<E>] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, kotlinx.coroutines.channels.n] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlinx.coroutines.channels.n] */
    protected void U1(@NotNull kotlinx.coroutines.selects.n<?> nVar, @Nullable Object obj) {
        u uVar;
        u uVar2 = (u) f313799h.get(this);
        while (true) {
            long andIncrement = f313795d.getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zI1 = this.i1(andIncrement);
            int i10 = kotlinx.coroutines.channels.o.f313835b;
            long j11 = j10 / ((long) i10);
            int i11 = (int) (j10 % ((long) i10));
            if (uVar2.f315133c != j11) {
                u uVarT0 = this.t0(j11, uVar2);
                if (uVarT0 != null) {
                    uVar = uVarT0;
                } else if (zI1) {
                    this.z1(obj, nVar);
                    return;
                }
            } else {
                uVar = uVar2;
            }
            ?? r10 = this;
            kotlinx.coroutines.selects.n<?> nVar2 = nVar;
            Object obj2 = obj;
            int iA2 = r10.A2(uVar, i11, obj2, j10, nVar2, zI1);
            uVar2 = uVar;
            if (iA2 == 0) {
                uVar2.b();
                nVar2.f(Unit.f312394a);
                return;
            }
            if (iA2 == 1) {
                nVar2.f(Unit.f312394a);
                return;
            }
            if (iA2 == 2) {
                if (zI1) {
                    uVar2.A();
                    r10.z1(obj2, nVar2);
                    return;
                } else {
                    f4 f4Var = nVar2 instanceof f4 ? (f4) nVar2 : null;
                    if (f4Var != null) {
                        r10.H1(f4Var, uVar2, i11);
                        return;
                    }
                    return;
                }
            }
            if (iA2 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iA2 == 4) {
                if (j10 < r10.P0()) {
                    uVar2.b();
                }
                r10.z1(obj2, nVar2);
                return;
            } else {
                if (iA2 == 5) {
                    uVar2.b();
                }
                this = (n<E>) r10;
                obj = obj2;
                nVar = nVar2;
            }
        }
    }

    public final long W0() {
        return f313795d.get(this) & 1152921504606846975L;
    }

    public final boolean Z0() {
        while (true) {
            u<E> uVarS0 = (u) f313800i.get(this);
            long jP0 = P0();
            if (W0() <= jP0) {
                return false;
            }
            int i10 = kotlinx.coroutines.channels.o.f313835b;
            long j10 = jP0 / ((long) i10);
            if (uVarS0.f315133c == j10 || (uVarS0 = s0(j10, uVarS0)) != null) {
                uVarS0.b();
                if (d1(uVarS0, (int) (jP0 % ((long) i10)), jP0)) {
                    return true;
                }
                f313796e.compareAndSet(this, jP0, 1 + jP0);
            } else if (((u) f313800i.get(this)).f315133c < j10) {
                return false;
            }
        }
    }

    @Nullable
    public Object a2(E e10, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        return b2(this, e10, dVar);
    }

    @Override // kotlinx.coroutines.channels.n0
    public final boolean c(@Nullable Throwable th2) {
        return h0(th2);
    }

    @Override // kotlinx.coroutines.channels.n0
    public final void cancel() {
        h0(null);
    }

    @Override // kotlinx.coroutines.channels.n0
    public final void e(@Nullable CancellationException cancellationException) {
        h0(cancellationException);
    }

    public boolean h0(@Nullable Throwable th2) {
        if (th2 == null) {
            th2 = new CancellationException("Channel was cancelled");
        }
        return l0(th2, true);
    }

    @Override // kotlinx.coroutines.channels.o0
    @NotNull
    public kotlinx.coroutines.selects.j<E, n<E>> i() {
        k kVar = k.f313818a;
        Intrinsics.checkNotNull(kVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        pj.n nVar = (pj.n) r1.q(kVar, 3);
        l lVar = l.f313819a;
        Intrinsics.checkNotNull(lVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new kotlinx.coroutines.selects.k(this, nVar, (pj.n) r1.q(lVar, 3), null, 8, null);
    }

    @Override // kotlinx.coroutines.channels.n0
    public boolean isEmpty() {
        if (!C() && !Z0()) {
            return !C();
        }
        return false;
    }

    @Override // kotlinx.coroutines.channels.n0
    @NotNull
    public r<E> iterator() {
        return new a();
    }

    @Override // kotlinx.coroutines.channels.n0
    @Nullable
    public Object j(@NotNull kotlin.coroutines.d<? super E> dVar) {
        return M1(this, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j0() {
        if (l1()) {
            if (f313801j.get(this) != kotlinx.coroutines.channels.o.f313834a) {
                throw new IllegalStateException(("bufferEndSegment must be NULL_SEGMENT for rendezvous and unlimited channels; they do not manipulate it.\nChannel state: " + this).toString());
            }
        } else if (((u) f313800i.get(this)).f315133c > ((u) f313801j.get(this)).f315133c) {
            throw new IllegalStateException(("bufferEndSegment should not have lower id than receiveSegment.\nChannel state: " + this).toString());
        }
        List listListOf = CollectionsKt.listOf((Object[]) new u[]{f313800i.get(this), f313799h.get(this), f313801j.get(this)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOf) {
            if (((u) obj) != kotlinx.coroutines.channels.o.f313834a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j10 = ((u) next).f315133c;
            do {
                Object next2 = it.next();
                long j11 = ((u) next2).f315133c;
                if (j10 > j11) {
                    next = next2;
                    j10 = j11;
                }
            } while (it.hasNext());
        }
        u uVar = (u) next;
        if (uVar.h() != 0) {
            throw new IllegalStateException(("All processed segments should be unreachable from the data structure, but the `prev` link of the leftmost segment is non-null.\nChannel state: " + this).toString());
        }
        while (uVar.f() != 0) {
            S sF = uVar.f();
            Intrinsics.checkNotNull(sF);
            if (((u) sF).h() != 0) {
                S sF2 = uVar.f();
                Intrinsics.checkNotNull(sF2);
                if (((u) sF2).h() != uVar) {
                    throw new IllegalStateException(("The `segment.next.prev === segment` invariant is violated.\nChannel state: " + this).toString());
                }
            }
            int i10 = kotlinx.coroutines.channels.o.f313835b;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object objJ = uVar.J(i12);
                if (!Intrinsics.areEqual(objJ, kotlinx.coroutines.channels.o.f313839f) && !(objJ instanceof f4)) {
                    if (Intrinsics.areEqual(objJ, kotlinx.coroutines.channels.o.f313846m) || Intrinsics.areEqual(objJ, kotlinx.coroutines.channels.o.f313845l) || Intrinsics.areEqual(objJ, kotlinx.coroutines.channels.o.z())) {
                        if (uVar.I(i12) != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        i11++;
                    } else {
                        if (!Intrinsics.areEqual(objJ, kotlinx.coroutines.channels.o.f313843j) && !Intrinsics.areEqual(objJ, kotlinx.coroutines.channels.o.f313844k)) {
                            throw new IllegalStateException(("Unexpected segment cell state: " + objJ + ".\nChannel state: " + this).toString());
                        }
                        if (uVar.I(i12) != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                    }
                }
            }
            if (i11 == kotlinx.coroutines.channels.o.f313835b && uVar != f313800i.get(this) && uVar != f313799h.get(this) && uVar != f313801j.get(this)) {
                throw new IllegalStateException(("Logically removed segment is reachable.\nChannel state: " + this).toString());
            }
            S sF3 = uVar.f();
            Intrinsics.checkNotNull(sF3);
            uVar = (u) sF3;
        }
    }

    protected boolean j1() {
        return false;
    }

    protected boolean l0(@Nullable Throwable th2, boolean z10) {
        if (z10) {
            p1();
        }
        boolean zA = androidx.concurrent.futures.b.a(f313802k, this, kotlinx.coroutines.channels.o.A, th2);
        if (z10) {
            q1();
        } else {
            r1();
        }
        o0();
        v1();
        if (zA) {
            c1();
        }
        return zA;
    }

    @Override // kotlinx.coroutines.channels.o0
    public void n(@NotNull Function1<? super Throwable, Unit> function1) {
        if (androidx.concurrent.futures.b.a(f313803l, this, null, function1)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f313803l;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != kotlinx.coroutines.channels.o.f313858y) {
                if (obj == kotlinx.coroutines.channels.o.f313859z) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        } while (!androidx.concurrent.futures.b.a(f313803l, this, kotlinx.coroutines.channels.o.f313858y, kotlinx.coroutines.channels.o.f313859z));
        function1.invoke(A0());
    }

    @Override // kotlinx.coroutines.channels.o0
    @kotlin.l(level = kotlin.n.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @b1(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e10) {
        return kotlinx.coroutines.channels.p.a.c(this, e10);
    }

    @Override // kotlinx.coroutines.channels.o0
    @NotNull
    public Object p(E e10) {
        u uVar;
        if (p2(f313795d.get(this))) {
            return t.f313893b.b();
        }
        Object obj = kotlinx.coroutines.channels.o.f313845l;
        u uVar2 = (u) f313799h.get(this);
        while (true) {
            long andIncrement = f313795d.getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zI1 = this.i1(andIncrement);
            int i10 = kotlinx.coroutines.channels.o.f313835b;
            long j11 = j10 / ((long) i10);
            int i11 = (int) (j10 % ((long) i10));
            if (uVar2.f315133c != j11) {
                u uVarT0 = this.t0(j11, uVar2);
                if (uVarT0 != null) {
                    uVar = uVarT0;
                } else if (zI1) {
                    return t.f313893b.a(this.Q0());
                }
            } else {
                uVar = uVar2;
            }
            int iA2 = this.A2(uVar, i11, e10, j10, obj, zI1);
            n<E> nVar = this;
            uVar2 = uVar;
            if (iA2 == 0) {
                uVar2.b();
                return t.f313893b.c(Unit.f312394a);
            }
            if (iA2 == 1) {
                return t.f313893b.c(Unit.f312394a);
            }
            if (iA2 == 2) {
                if (zI1) {
                    uVar2.A();
                    return t.f313893b.a(nVar.Q0());
                }
                f4 f4Var = obj instanceof f4 ? (f4) obj : null;
                if (f4Var != null) {
                    nVar.H1(f4Var, uVar2, i11);
                }
                uVar2.A();
                return t.f313893b.b();
            }
            if (iA2 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iA2 == 4) {
                if (j10 < nVar.P0()) {
                    uVar2.b();
                }
                return t.f313893b.a(nVar.Q0());
            }
            if (iA2 == 5) {
                uVar2.b();
            }
            this = nVar;
            e10 = e10;
        }
    }

    protected final void p0(long j10) {
        u<E> uVar;
        p1 p1VarC;
        u<E> uVar2 = (u) f313800i.get(this);
        while (true) {
            long j11 = f313796e.get(this);
            if (j10 < Math.max(((long) this.f313804a) + j11, this.x0())) {
                return;
            }
            n<E> nVar = this;
            this = nVar;
            if (f313796e.compareAndSet(nVar, j11, 1 + j11)) {
                int i10 = kotlinx.coroutines.channels.o.f313835b;
                long j12 = j11 / ((long) i10);
                int i11 = (int) (j11 % ((long) i10));
                if (uVar2.f315133c != j12) {
                    u<E> uVarS0 = this.s0(j12, uVar2);
                    if (uVarS0 != null) {
                        uVar = uVarS0;
                    }
                } else {
                    uVar = uVar2;
                }
                Object objY2 = this.y2(uVar, i11, j11, null);
                if (objY2 != kotlinx.coroutines.channels.o.f313850q) {
                    uVar.b();
                    Function1<E, Unit> function1 = this.f313805b;
                    if (function1 != null && (p1VarC = kotlinx.coroutines.internal.r0.c(function1, objY2, null, 2, null)) != null) {
                        throw p1VarC;
                    }
                } else if (j11 < this.W0()) {
                    uVar.b();
                }
                uVar2 = uVar;
            }
        }
    }

    @Override // kotlinx.coroutines.channels.n0
    @kotlin.l(level = kotlin.n.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @b1(expression = "tryReceive().getOrNull()", imports = {}))
    @Nullable
    public E poll() {
        return (E) kotlinx.coroutines.channels.p.a.d(this);
    }

    public boolean q2() {
        return p2(f313795d.get(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final String r2() {
        String strValueOf;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("S=" + W0() + ",R=" + P0() + ",B=" + x0() + ",B'=" + f313798g.get(this) + ",C=" + ((int) (f313795d.get(this) >> 60)) + AbstractJsonLexerKt.COMMA);
        int i10 = (int) (f313795d.get(this) >> 60);
        if (i10 == 1) {
            sb2.append("CANCELLATION_STARTED,");
        } else if (i10 == 2) {
            sb2.append("CLOSED,");
        } else if (i10 == 3) {
            sb2.append("CANCELLED,");
        }
        sb2.append("SEND_SEGM=" + kotlinx.coroutines.x0.b(f313799h.get(this)) + ",RCV_SEGM=" + kotlinx.coroutines.x0.b(f313800i.get(this)));
        if (!l1()) {
            sb2.append(",EB_SEGM=" + kotlinx.coroutines.x0.b(f313801j.get(this)));
        }
        sb2.append("  ");
        List listListOf = CollectionsKt.listOf((Object[]) new u[]{f313800i.get(this), f313799h.get(this), f313801j.get(this)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOf) {
            if (((u) obj) != kotlinx.coroutines.channels.o.f313834a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j10 = ((u) next).f315133c;
            do {
                Object next2 = it.next();
                long j11 = ((u) next2).f315133c;
                if (j10 > j11) {
                    next = next2;
                    j10 = j11;
                }
            } while (it.hasNext());
        }
        u uVar = (u) next;
        do {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(kotlinx.coroutines.x0.b(uVar));
            sb3.append("=[");
            sb3.append(uVar.m() ? "*" : "");
            sb3.append(uVar.f315133c);
            sb3.append(",prev=");
            u uVar2 = (u) uVar.h();
            sb3.append(uVar2 != null ? kotlinx.coroutines.x0.b(uVar2) : null);
            sb3.append(AbstractJsonLexerKt.COMMA);
            sb2.append(sb3.toString());
            int i11 = kotlinx.coroutines.channels.o.f313835b;
            for (int i12 = 0; i12 < i11; i12++) {
                Object objJ = uVar.J(i12);
                Object objI = uVar.I(i12);
                if (objJ instanceof kotlinx.coroutines.n) {
                    strValueOf = "cont";
                } else if (objJ instanceof kotlinx.coroutines.selects.n) {
                    strValueOf = "select";
                } else if (objJ instanceof m0) {
                    strValueOf = "receiveCatching";
                } else if (objJ instanceof b) {
                    strValueOf = "send(broadcast)";
                } else if (objJ instanceof r0) {
                    strValueOf = "EB(" + objJ + ')';
                } else {
                    strValueOf = String.valueOf(objJ);
                }
                sb2.append(AbstractJsonLexerKt.BEGIN_LIST + i12 + "]=(" + strValueOf + AbstractJsonLexerKt.COMMA + objI + "),");
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("next=");
            u uVar3 = (u) uVar.f();
            sb4.append(uVar3 != null ? kotlinx.coroutines.x0.b(uVar3) : null);
            sb4.append("]  ");
            sb2.append(sb4.toString());
            uVar = (u) uVar.f();
        } while (uVar != null);
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public String toString() {
        String string;
        StringBuilder sb2 = new StringBuilder();
        int i10 = (int) (f313795d.get(this) >> 60);
        if (i10 == 2) {
            sb2.append("closed,");
        } else if (i10 == 3) {
            sb2.append("cancelled,");
        }
        sb2.append("capacity=" + this.f313804a + AbstractJsonLexerKt.COMMA);
        sb2.append("data=[");
        int i11 = 0;
        List listListOf = CollectionsKt.listOf((Object[]) new u[]{f313800i.get(this), f313799h.get(this), f313801j.get(this)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOf) {
            if (((u) obj) != kotlinx.coroutines.channels.o.f313834a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j10 = ((u) next).f315133c;
            do {
                Object next2 = it.next();
                long j11 = ((u) next2).f315133c;
                if (j10 > j11) {
                    next = next2;
                    j10 = j11;
                }
            } while (it.hasNext());
        }
        u uVar = (u) next;
        long jP0 = P0();
        long jW0 = W0();
        loop2: while (true) {
            int i12 = kotlinx.coroutines.channels.o.f313835b;
            for (int i13 = i11; i13 < i12; i13++) {
                long j12 = (uVar.f315133c * ((long) kotlinx.coroutines.channels.o.f313835b)) + ((long) i13);
                if (j12 >= jW0 && j12 >= jP0) {
                    break loop2;
                }
                Object objJ = uVar.J(i13);
                Object objI = uVar.I(i13);
                if (objJ instanceof kotlinx.coroutines.n) {
                    string = (j12 >= jP0 || j12 < jW0) ? (j12 >= jW0 || j12 < jP0) ? "cont" : "send" : "receive";
                } else if (objJ instanceof kotlinx.coroutines.selects.n) {
                    string = (j12 >= jP0 || j12 < jW0) ? (j12 >= jW0 || j12 < jP0) ? "select" : "onSend" : "onReceive";
                } else if (objJ instanceof m0) {
                    string = "receiveCatching";
                } else if (objJ instanceof b) {
                    string = "sendBroadcast";
                } else if (objJ instanceof r0) {
                    string = "EB(" + objJ + ')';
                } else if (Intrinsics.areEqual(objJ, kotlinx.coroutines.channels.o.f313841h) || Intrinsics.areEqual(objJ, kotlinx.coroutines.channels.o.f313842i)) {
                    string = "resuming_sender";
                } else {
                    if (objJ != null && !Intrinsics.areEqual(objJ, kotlinx.coroutines.channels.o.f313840g) && !Intrinsics.areEqual(objJ, kotlinx.coroutines.channels.o.f313844k) && !Intrinsics.areEqual(objJ, kotlinx.coroutines.channels.o.f313843j) && !Intrinsics.areEqual(objJ, kotlinx.coroutines.channels.o.f313846m) && !Intrinsics.areEqual(objJ, kotlinx.coroutines.channels.o.f313845l) && !Intrinsics.areEqual(objJ, kotlinx.coroutines.channels.o.z())) {
                        string = objJ.toString();
                    }
                }
                if (objI != null) {
                    sb2.append('(' + string + AbstractJsonLexerKt.COMMA + objI + "),");
                } else {
                    sb2.append(string + AbstractJsonLexerKt.COMMA);
                }
            }
            uVar = (u) uVar.f();
            if (uVar == null) {
                break;
            }
            i11 = 0;
        }
        if (StringsKt.t7(sb2) == ',') {
            Intrinsics.checkNotNullExpressionValue(sb2.deleteCharAt(sb2.length() - 1), "deleteCharAt(...)");
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // kotlinx.coroutines.channels.n0
    @NotNull
    public kotlinx.coroutines.selects.h<t<E>> u() {
        g gVar = g.f313814a;
        Intrinsics.checkNotNull(gVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        pj.n nVar = (pj.n) r1.q(gVar, 3);
        h hVar = h.f313815a;
        Intrinsics.checkNotNull(hVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new kotlinx.coroutines.selects.i(this, nVar, (pj.n) r1.q(hVar, 3), this.f313806c);
    }

    @NotNull
    protected final Object u2(E e10) {
        u uVarT0;
        Object obj = kotlinx.coroutines.channels.o.f313839f;
        u uVar = (u) f313799h.get(this);
        while (true) {
            long andIncrement = f313795d.getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zI1 = this.i1(andIncrement);
            int i10 = kotlinx.coroutines.channels.o.f313835b;
            long j11 = j10 / ((long) i10);
            int i11 = (int) (j10 % ((long) i10));
            if (uVar.f315133c != j11) {
                uVarT0 = this.t0(j11, uVar);
                if (uVarT0 == null) {
                    if (zI1) {
                        return t.f313893b.a(this.Q0());
                    }
                }
            } else {
                uVarT0 = uVar;
            }
            E e11 = e10;
            int iA2 = this.A2(uVarT0, i11, e11, j10, obj, zI1);
            n<E> nVar = this;
            uVar = uVarT0;
            if (iA2 == 0) {
                uVar.b();
                return t.f313893b.c(Unit.f312394a);
            }
            if (iA2 == 1) {
                return t.f313893b.c(Unit.f312394a);
            }
            int i12 = 5 << 2;
            if (iA2 == 2) {
                if (zI1) {
                    uVar.A();
                    return t.f313893b.a(nVar.Q0());
                }
                f4 f4Var = obj instanceof f4 ? (f4) obj : null;
                if (f4Var != null) {
                    nVar.H1(f4Var, uVar, i11);
                }
                nVar.p0((uVar.f315133c * ((long) i10)) + ((long) i11));
                return t.f313893b.c(Unit.f312394a);
            }
            if (iA2 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iA2 == 4) {
                if (j10 < nVar.P0()) {
                    uVar.b();
                }
                return t.f313893b.a(nVar.Q0());
            }
            if (iA2 == 5) {
                uVar.b();
            }
            this = nVar;
            e10 = e11;
        }
    }

    @Override // kotlinx.coroutines.channels.n0
    @NotNull
    public kotlinx.coroutines.selects.h<E> v() {
        i iVar = i.f313816a;
        Intrinsics.checkNotNull(iVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        pj.n nVar = (pj.n) r1.q(iVar, 3);
        j jVar = j.f313817a;
        Intrinsics.checkNotNull(jVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new kotlinx.coroutines.selects.i(this, nVar, (pj.n) r1.q(jVar, 3), this.f313806c);
    }

    protected void v1() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.n0
    @NotNull
    public Object w() {
        u uVarS0;
        long j10 = f313796e.get(this);
        long j11 = f313795d.get(this);
        if (g1(j11)) {
            return t.f313893b.a(A0());
        }
        if (j10 >= (j11 & 1152921504606846975L)) {
            return t.f313893b.b();
        }
        Object obj = kotlinx.coroutines.channels.o.f313846m;
        u uVar = (u) M0().get(this);
        while (!this.C()) {
            long andIncrement = O0().getAndIncrement(this);
            int i10 = kotlinx.coroutines.channels.o.f313835b;
            long j12 = andIncrement / ((long) i10);
            int i11 = (int) (andIncrement % ((long) i10));
            if (uVar.f315133c != j12) {
                uVarS0 = this.s0(j12, uVar);
                if (uVarS0 == null) {
                    continue;
                }
            } else {
                uVarS0 = uVar;
            }
            n<E> nVar = this;
            Object objY2 = nVar.y2(uVarS0, i11, andIncrement, obj);
            uVar = uVarS0;
            if (objY2 == kotlinx.coroutines.channels.o.f313848o) {
                f4 f4Var = obj instanceof f4 ? (f4) obj : null;
                if (f4Var != null) {
                    nVar.G1(f4Var, uVar, i11);
                }
                nVar.E2(andIncrement);
                uVar.A();
                return t.f313893b.b();
            }
            if (objY2 != kotlinx.coroutines.channels.o.f313850q) {
                if (objY2 == kotlinx.coroutines.channels.o.f313849p) {
                    throw new IllegalStateException("unexpected");
                }
                uVar.b();
                return t.f313893b.c(objY2);
            }
            if (andIncrement < nVar.W0()) {
                uVar.b();
            }
            this = nVar;
        }
        return t.f313893b.a(this.A0());
    }

    @Override // kotlinx.coroutines.channels.n0
    @kotlin.internal.h
    @kotlin.l(level = kotlin.n.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @b1(expression = "receiveCatching().getOrNull()", imports = {}))
    @Nullable
    public Object z(@NotNull kotlin.coroutines.d<? super E> dVar) {
        return kotlinx.coroutines.channels.p.a.e(this, dVar);
    }

    public /* synthetic */ n(int i10, Function1 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? null : function1);
    }
}
