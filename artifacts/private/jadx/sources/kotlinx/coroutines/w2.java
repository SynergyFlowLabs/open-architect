package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@kotlin.l(level = kotlin.n.ERROR, message = "This is internal API and may be removed in the future releases")
@SourceDebugExtension({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 4 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n+ 7 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 8 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n+ 9 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,1583:1\n732#1,3:1587\n361#1,2:1597\n363#1,5:1602\n368#1,5:1608\n373#1,2:1616\n361#1,2:1618\n363#1,5:1623\n368#1,5:1629\n373#1,2:1637\n169#1,2:1645\n734#1:1647\n536#1:1648\n169#1,2:1649\n537#1,15:1651\n169#1,2:1666\n169#1,2:1668\n169#1,2:1681\n732#1,3:1683\n732#1,3:1686\n169#1,2:1689\n732#1,3:1691\n169#1,2:1694\n169#1,2:1698\n169#1,2:1700\n536#1:1704\n169#1,2:1705\n537#1,15:1707\n1#2:1584\n1#2:1607\n1#2:1628\n29#3:1585\n29#3:1696\n29#3:1702\n16#4:1586\n16#4:1697\n16#4:1703\n295#5,2:1590\n295#5,2:1592\n23#6:1594\n159#7:1595\n159#7:1596\n149#7,4:1722\n273#8,3:1599\n276#8,3:1613\n273#8,3:1620\n276#8,3:1634\n273#8,6:1639\n426#9,11:1670\n*S KotlinDebug\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n241#1:1587,3\n324#1:1597,2\n324#1:1602,5\n324#1:1608,5\n324#1:1616,2\n357#1:1618,2\n357#1:1623,5\n357#1:1629,5\n357#1:1637,2\n377#1:1645,2\n422#1:1647\n468#1:1648\n468#1:1649,2\n468#1:1651,15\n536#1:1666,2\n579#1:1668,2\n621#1:1681,2\n648#1:1683,3\n657#1:1686,3\n721#1:1689,2\n750#1:1691,3\n763#1:1694,2\n836#1:1698,2\n858#1:1700,2\n1023#1:1704\n1023#1:1705,2\n1023#1:1707,15\n324#1:1607\n357#1:1628\n204#1:1585\n766#1:1696\n911#1:1702\n204#1:1586\n766#1:1697\n911#1:1703\n252#1:1590,2\n256#1:1592,2\n264#1:1594\n270#1:1595\n272#1:1596\n1327#1:1722,4\n324#1:1599,3\n324#1:1613,3\n357#1:1620,3\n357#1:1634,3\n362#1:1639,6\n585#1:1670,11\n*E\n"})
public class w2 implements p2, w, g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f315680a = AtomicReferenceFieldUpdater.newUpdater(w2.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f315681b = AtomicReferenceFieldUpdater.newUpdater(w2.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    @SourceDebugExtension({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$AwaitContinuation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1583:1\n1#2:1584\n*E\n"})
    private static final class a<T> extends p<T> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        private final w2 f315682i;

        public a(@NotNull kotlin.coroutines.d<? super T> dVar, @NotNull w2 w2Var) {
            super(dVar, 1);
            this.f315682i = w2Var;
        }

        @Override // kotlinx.coroutines.p
        @NotNull
        protected String O() {
            return "AwaitContinuation";
        }

        @Override // kotlinx.coroutines.p
        @NotNull
        public Throwable s(@NotNull p2 p2Var) {
            Throwable thE;
            Object objC1 = this.f315682i.c1();
            if (!(objC1 instanceof c) || (thE = ((c) objC1).e()) == null) {
                return objC1 instanceof c0 ? ((c0) objC1).f313551a : p2Var.y0();
            }
            return thE;
        }
    }

    private static final class b extends v2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final w2 f315683e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private final c f315684f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        private final v f315685g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        private final Object f315686h;

        public b(@NotNull w2 w2Var, @NotNull c cVar, @NotNull v vVar, @Nullable Object obj) {
            this.f315683e = w2Var;
            this.f315684f = cVar;
            this.f315685g = vVar;
            this.f315686h = obj;
        }

        @Override // kotlinx.coroutines.v2
        public boolean D() {
            return false;
        }

        @Override // kotlinx.coroutines.v2
        public void E(@Nullable Throwable th2) {
            this.f315683e.D0(this.f315684f, this.f315685g, this.f315686h);
        }
    }

    @SourceDebugExtension({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$Finishing\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1583:1\n1#2:1584\n*E\n"})
    private static final class c implements i2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f315687b = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting$volatile");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f315688c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause$volatile");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f315689d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final b3 f315690a;

        public c(@NotNull b3 b3Var, boolean z10, @Nullable Throwable th2) {
            this.f315690a = b3Var;
            this._isCompleting$volatile = z10 ? 1 : 0;
            this._rootCause$volatile = th2;
        }

        private final ArrayList<Throwable> c() {
            return new ArrayList<>(4);
        }

        private final Object d() {
            return f315689d.get(this);
        }

        private final /* synthetic */ Object f() {
            return this._exceptionsHolder$volatile;
        }

        private final /* synthetic */ int h() {
            return this._isCompleting$volatile;
        }

        private final /* synthetic */ Object j() {
            return this._rootCause$volatile;
        }

        private final void q(Object obj) {
            f315689d.set(this, obj);
        }

        private final /* synthetic */ void s(Object obj) {
            this._exceptionsHolder$volatile = obj;
        }

        private final /* synthetic */ void t(int i10) {
            this._isCompleting$volatile = i10;
        }

        private final /* synthetic */ void u(Object obj) {
            this._rootCause$volatile = obj;
        }

        @Override // kotlinx.coroutines.i2
        @NotNull
        public b3 a() {
            return this.f315690a;
        }

        public final void b(@NotNull Throwable th2) {
            Throwable thE = e();
            if (thE == null) {
                r(th2);
                return;
            }
            if (th2 == thE) {
                return;
            }
            Object objD = d();
            if (objD == null) {
                q(th2);
                return;
            }
            if (objD instanceof Throwable) {
                if (th2 == objD) {
                    return;
                }
                ArrayList<Throwable> arrayListC = c();
                arrayListC.add(objD);
                arrayListC.add(th2);
                q(arrayListC);
                return;
            }
            if (objD instanceof ArrayList) {
                ((ArrayList) objD).add(th2);
                return;
            }
            throw new IllegalStateException(("State is " + objD).toString());
        }

        @Nullable
        public final Throwable e() {
            return (Throwable) f315688c.get(this);
        }

        @Override // kotlinx.coroutines.i2
        public boolean isActive() {
            return e() == null;
        }

        public final boolean l() {
            return e() != null;
        }

        public final boolean m() {
            int i10 = 5 << 1;
            return f315687b.get(this) == 1;
        }

        public final boolean n() {
            return d() == x2.f315713h;
        }

        @NotNull
        public final List<Throwable> o(@Nullable Throwable th2) {
            ArrayList<Throwable> arrayListC;
            Object objD = d();
            if (objD == null) {
                arrayListC = c();
            } else if (objD instanceof Throwable) {
                ArrayList<Throwable> arrayListC2 = c();
                arrayListC2.add(objD);
                arrayListC = arrayListC2;
            } else {
                if (!(objD instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + objD).toString());
                }
                arrayListC = (ArrayList) objD;
            }
            Throwable thE = e();
            if (thE != null) {
                arrayListC.add(0, thE);
            }
            if (th2 != null && !Intrinsics.areEqual(th2, thE)) {
                arrayListC.add(th2);
            }
            q(x2.f315713h);
            return arrayListC;
        }

        public final void p(boolean z10) {
            f315687b.set(this, z10 ? 1 : 0);
        }

        public final void r(@Nullable Throwable th2) {
            f315688c.set(this, th2);
        }

        @NotNull
        public String toString() {
            return "Finishing[cancelling=" + l() + ", completing=" + m() + ", rootCause=" + e() + ", exceptions=" + d() + ", list=" + a() + AbstractJsonLexerKt.END_LIST;
        }
    }

    private final class d extends v2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final kotlinx.coroutines.selects.n<?> f315691e;

        public d(kotlinx.coroutines.selects.n<?> nVar) {
            this.f315691e = nVar;
        }

        @Override // kotlinx.coroutines.v2
        public boolean D() {
            return false;
        }

        @Override // kotlinx.coroutines.v2
        public void E(@Nullable Throwable th2) {
            Object objC1 = w2.this.c1();
            if (!(objC1 instanceof c0)) {
                objC1 = x2.h(objC1);
            }
            this.f315691e.i(w2.this, objC1);
        }
    }

    private final class e extends v2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final kotlinx.coroutines.selects.n<?> f315693e;

        public e(kotlinx.coroutines.selects.n<?> nVar) {
            this.f315693e = nVar;
        }

        @Override // kotlinx.coroutines.v2
        public boolean D() {
            return false;
        }

        @Override // kotlinx.coroutines.v2
        public void E(@Nullable Throwable th2) {
            this.f315693e.i(w2.this, Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", i = {1, 1, 1}, l = {1003, 1005}, m = "invokeSuspend", n = {"$this$sequence", "this_$iv", "cur$iv"}, s = {"L$0", "L$1", "L$2"})
    @SourceDebugExtension({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$children$1\n+ 2 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n*L\n1#1,1583:1\n273#2,6:1584\n*S KotlinDebug\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$children$1\n*L\n1005#1:1584,6\n*E\n"})
    static final class f extends kotlin.coroutines.jvm.internal.k implements Function2<kotlin.sequences.n<? super p2>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f315695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f315696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f315697c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f315698d;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            f fVar = w2.this.new f(dVar);
            fVar.f315698d = obj;
            return fVar;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x007e  */
        /* JADX WARN: Code duplicated, block: B:25:0x0082  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0080 -> B:28:0x009b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0098 -> B:28:0x009b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                r5 = 4
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r5 = 7
                int r1 = r6.f315697c
                r2 = 2
                r3 = 1
                r5 = r3
                if (r1 == 0) goto L32
                if (r1 == r3) goto L2d
                r5 = 2
                if (r1 != r2) goto L23
                java.lang.Object r1 = r6.f315696b
                kotlinx.coroutines.internal.f0 r1 = (kotlinx.coroutines.internal.f0) r1
                java.lang.Object r3 = r6.f315695a
                kotlinx.coroutines.internal.d0 r3 = (kotlinx.coroutines.internal.d0) r3
                java.lang.Object r4 = r6.f315698d
                kotlin.sequences.n r4 = (kotlin.sequences.n) r4
                kotlin.ResultKt.m(r7)
                r5 = 0
                goto L9b
            L23:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                r5 = 2
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                r5 = 4
                throw r6
            L2d:
                r5 = 6
                kotlin.ResultKt.m(r7)
                goto La0
            L32:
                kotlin.ResultKt.m(r7)
                java.lang.Object r7 = r6.f315698d
                kotlin.sequences.n r7 = (kotlin.sequences.n) r7
                kotlinx.coroutines.w2 r1 = kotlinx.coroutines.w2.this
                r5 = 7
                java.lang.Object r1 = r1.c1()
                r5 = 6
                boolean r4 = r1 instanceof kotlinx.coroutines.v
                r5 = 6
                if (r4 == 0) goto L56
                r5 = 0
                kotlinx.coroutines.v r1 = (kotlinx.coroutines.v) r1
                kotlinx.coroutines.w r1 = r1.f315661e
                r6.f315697c = r3
                java.lang.Object r6 = r7.b(r1, r6)
                r5 = 7
                if (r6 != r0) goto La0
                r5 = 2
                goto L9a
            L56:
                r5 = 2
                boolean r3 = r1 instanceof kotlinx.coroutines.i2
                if (r3 == 0) goto La0
                kotlinx.coroutines.i2 r1 = (kotlinx.coroutines.i2) r1
                kotlinx.coroutines.b3 r1 = r1.a()
                r5 = 5
                if (r1 == 0) goto La0
                java.lang.Object r3 = r1.j()
                r5 = 3
                java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
                r5 = 5
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r4)
                kotlinx.coroutines.internal.f0 r3 = (kotlinx.coroutines.internal.f0) r3
                r4 = r3
                r4 = r3
                r3 = r1
                r1 = r4
                r1 = r4
                r4 = r7
            L77:
                r5 = 2
                boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
                if (r7 != 0) goto La0
                boolean r7 = r1 instanceof kotlinx.coroutines.v
                if (r7 == 0) goto L9b
                r7 = r1
                r7 = r1
                kotlinx.coroutines.v r7 = (kotlinx.coroutines.v) r7
                r5 = 3
                kotlinx.coroutines.w r7 = r7.f315661e
                r6.f315698d = r4
                r6.f315695a = r3
                r6.f315696b = r1
                r5 = 0
                r6.f315697c = r2
                r5 = 4
                java.lang.Object r7 = r4.b(r7, r6)
                r5 = 3
                if (r7 != r0) goto L9b
            L9a:
                return r0
            L9b:
                kotlinx.coroutines.internal.f0 r1 = r1.k()
                goto L77
            La0:
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.w2.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlin.sequences.n<? super p2> nVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(nVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* synthetic */ class g extends kotlin.jvm.internal.g0 implements pj.n<w2, kotlinx.coroutines.selects.n<?>, Object, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f315700a = new g();

        g() {
            super(3, w2.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void X(w2 w2Var, kotlinx.coroutines.selects.n<?> nVar, Object obj) {
            w2Var.H1(nVar, obj);
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(w2 w2Var, kotlinx.coroutines.selects.n<?> nVar, Object obj) {
            X(w2Var, nVar, obj);
            return Unit.f312394a;
        }
    }

    /* synthetic */ class h extends kotlin.jvm.internal.g0 implements pj.n<w2, Object, Object, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f315701a = new h();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h() {
            super(3, w2.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
            int i10 = 2 >> 3;
        }

        @Override // pj.n
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final Object invoke(w2 w2Var, Object obj, Object obj2) {
            return w2Var.G1(obj, obj2);
        }
    }

    /* synthetic */ class i extends kotlin.jvm.internal.g0 implements pj.n<w2, kotlinx.coroutines.selects.n<?>, Object, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f315702a = new i();

        i() {
            super(3, w2.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void X(w2 w2Var, kotlinx.coroutines.selects.n<?> nVar, Object obj) {
            w2Var.N1(nVar, obj);
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(w2 w2Var, kotlinx.coroutines.selects.n<?> nVar, Object obj) {
            X(w2Var, nVar, obj);
            return Unit.f312394a;
        }
    }

    public w2(boolean z10) {
        this._state$volatile = z10 ? x2.f315715j : x2.f315714i;
    }

    private final void C0(i2 i2Var, Object obj) throws Throwable {
        u uVarA1 = a1();
        if (uVarA1 != null) {
            uVarA1.dispose();
            P1(d3.f313923a);
        }
        c0 c0Var = obj instanceof c0 ? (c0) obj : null;
        Throwable th2 = c0Var != null ? c0Var.f313551a : null;
        if (!(i2Var instanceof v2)) {
            b3 b3VarA = i2Var.a();
            if (b3VarA != null) {
                E1(b3VarA, th2);
                return;
            }
            return;
        }
        try {
            ((v2) i2Var).E(th2);
        } catch (Throwable th3) {
            p1(new d0("Exception in completion handler " + i2Var + " for " + this, th3));
        }
    }

    private final v C1(kotlinx.coroutines.internal.f0 f0Var) {
        while (f0Var.t()) {
            f0Var = f0Var.l();
        }
        while (true) {
            f0Var = f0Var.k();
            if (!f0Var.t()) {
                if (f0Var instanceof v) {
                    return (v) f0Var;
                }
                if (f0Var instanceof b3) {
                    return null;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D0(c cVar, v vVar, Object obj) {
        v vVarC1 = C1(vVar);
        if (vVarC1 == null || !c2(cVar, vVarC1, obj)) {
            cVar.a().f(2);
            v vVarC2 = C1(vVar);
            if (vVarC2 == null || !c2(cVar, vVarC2, obj)) {
                a0(I0(cVar, obj));
            }
        }
    }

    private final void D1(b3 b3Var, Throwable th2) throws Throwable {
        I1(th2);
        b3Var.f(4);
        Object objJ = b3Var.j();
        Intrinsics.checkNotNull(objJ, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        d0 d0Var = null;
        for (kotlinx.coroutines.internal.f0 f0VarK = (kotlinx.coroutines.internal.f0) objJ; !Intrinsics.areEqual(f0VarK, b3Var); f0VarK = f0VarK.k()) {
            if ((f0VarK instanceof v2) && ((v2) f0VarK).D()) {
                try {
                    ((v2) f0VarK).E(th2);
                } catch (Throwable th3) {
                    if (d0Var != null) {
                        kotlin.p.a(d0Var, th3);
                    } else {
                        d0Var = new d0("Exception in completion handler " + f0VarK + " for " + this, th3);
                        Unit unit = Unit.f312394a;
                    }
                }
            }
        }
        if (d0Var != null) {
            p1(d0Var);
        }
        v0(th2);
    }

    private final Throwable E0(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th2 = (Throwable) obj;
            return th2 == null ? new q2(z0(), null, this) : th2;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((g3) obj).Q0();
    }

    private final void E1(b3 b3Var, Throwable th2) throws Throwable {
        b3Var.f(1);
        Object objJ = b3Var.j();
        Intrinsics.checkNotNull(objJ, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        d0 d0Var = null;
        for (kotlinx.coroutines.internal.f0 f0VarK = (kotlinx.coroutines.internal.f0) objJ; !Intrinsics.areEqual(f0VarK, b3Var); f0VarK = f0VarK.k()) {
            if (f0VarK instanceof v2) {
                try {
                    ((v2) f0VarK).E(th2);
                } catch (Throwable th3) {
                    if (d0Var != null) {
                        kotlin.p.a(d0Var, th3);
                    } else {
                        d0Var = new d0("Exception in completion handler " + f0VarK + " for " + this, th3);
                        Unit unit = Unit.f312394a;
                    }
                }
            }
        }
        if (d0Var != null) {
            p1(d0Var);
        }
    }

    private final void F1(b3 b3Var, Throwable th2, Function1<? super v2, Boolean> function1) throws Throwable {
        Object objJ = b3Var.j();
        Intrinsics.checkNotNull(objJ, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        d0 d0Var = null;
        for (kotlinx.coroutines.internal.f0 f0VarK = (kotlinx.coroutines.internal.f0) objJ; !Intrinsics.areEqual(f0VarK, b3Var); f0VarK = f0VarK.k()) {
            if ((f0VarK instanceof v2) && function1.invoke(f0VarK).booleanValue()) {
                try {
                    ((v2) f0VarK).E(th2);
                } catch (Throwable th3) {
                    if (d0Var != null) {
                        kotlin.p.a(d0Var, th3);
                    } else {
                        d0Var = new d0("Exception in completion handler " + f0VarK + " for " + this, th3);
                        Unit unit = Unit.f312394a;
                    }
                }
            }
        }
        if (d0Var != null) {
            p1(d0Var);
        }
    }

    public static /* synthetic */ q2 G0(w2 w2Var, String str, Throwable th2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defaultCancellationException");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        if (str == null) {
            str = w2Var.z0();
        }
        return new q2(str, th2, w2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object G1(Object obj, Object obj2) throws Throwable {
        if (obj2 instanceof c0) {
            throw ((c0) obj2).f313551a;
        }
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H1(kotlinx.coroutines.selects.n<?> nVar, Object obj) {
        Object objC1;
        do {
            objC1 = c1();
            if (!(objC1 instanceof i2)) {
                if (!(objC1 instanceof c0)) {
                    objC1 = x2.h(objC1);
                }
                nVar.f(objC1);
                return;
            }
        } while (S1(objC1) < 0);
        nVar.g(u2.B(this, false, new d(nVar), 1, null));
    }

    private final Object I0(c cVar, Object obj) throws Throwable {
        boolean zL;
        Throwable thP0;
        c0 c0Var = obj instanceof c0 ? (c0) obj : null;
        Throwable th2 = c0Var != null ? c0Var.f313551a : null;
        synchronized (cVar) {
            zL = cVar.l();
            List<Throwable> listO = cVar.o(th2);
            thP0 = P0(cVar, listO);
            if (thP0 != null) {
                Z(thP0, listO);
            }
        }
        if (thP0 != null && thP0 != th2) {
            obj = new c0(thP0, false, 2, null);
        }
        if (thP0 != null && (v0(thP0) || n1(thP0))) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((c0) obj).d();
        }
        if (!zL) {
            I1(thP0);
        }
        J1(obj);
        androidx.concurrent.futures.b.a(f315680a, this, cVar, x2.g(obj));
        C0(cVar, obj);
        return obj;
    }

    private final void L1(r1 r1Var) {
        b3 b3Var = new b3();
        Object h2Var = b3Var;
        if (!r1Var.isActive()) {
            h2Var = new h2(b3Var);
        }
        androidx.concurrent.futures.b.a(f315680a, this, r1Var, h2Var);
    }

    private final void M1(v2 v2Var) {
        v2Var.e(new b3());
        androidx.concurrent.futures.b.a(f315680a, this, v2Var, v2Var.k());
    }

    private final Throwable N0(Object obj) {
        c0 c0Var = obj instanceof c0 ? (c0) obj : null;
        if (c0Var != null) {
            return c0Var.f313551a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N1(kotlinx.coroutines.selects.n<?> nVar, Object obj) {
        if (v1()) {
            nVar.g(u2.B(this, false, new e(nVar), 1, null));
        } else {
            nVar.f(Unit.f312394a);
        }
    }

    private final Throwable P0(c cVar, List<? extends Throwable> list) {
        Object next;
        Object obj = null;
        if (list.isEmpty()) {
            if (cVar.l()) {
                return new q2(z0(), null, this);
            }
            return null;
        }
        List<? extends Throwable> list2 = list;
        Iterator<T> it = list2.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Throwable) next) instanceof CancellationException);
        Throwable th2 = (Throwable) next;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = list.get(0);
        if (th3 instanceof z3) {
            for (Object obj2 : list2) {
                Throwable th4 = (Throwable) obj2;
                if (th4 != th3 && (th4 instanceof z3)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    private final /* synthetic */ void Q1(Object obj) {
        this._parentHandle$volatile = obj;
    }

    private final /* synthetic */ void R1(Object obj) {
        this._state$volatile = obj;
    }

    private final int S1(Object obj) {
        if (obj instanceof r1) {
            if (((r1) obj).isActive()) {
                return 0;
            }
            if (!androidx.concurrent.futures.b.a(f315680a, this, obj, x2.f315715j)) {
                return -1;
            }
            K1();
            return 1;
        }
        if (!(obj instanceof h2)) {
            return 0;
        }
        if (!androidx.concurrent.futures.b.a(f315680a, this, obj, ((h2) obj).a())) {
            return -1;
        }
        K1();
        return 1;
    }

    private final String T1(Object obj) {
        if (!(obj instanceof c)) {
            if (obj instanceof i2) {
                return ((i2) obj).isActive() ? "Active" : "New";
            }
            return obj instanceof c0 ? com.facebook.internal.a.f99699u : com.facebook.internal.a.f99695s;
        }
        c cVar = (c) obj;
        if (cVar.l()) {
            return "Cancelling";
        }
        return cVar.m() ? "Completing" : "Active";
    }

    public static /* synthetic */ CancellationException V1(w2 w2Var, Throwable th2, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        return w2Var.U1(th2, str);
    }

    protected static /* synthetic */ void W0() {
    }

    private final boolean X1(i2 i2Var, Object obj) throws Throwable {
        if (!androidx.concurrent.futures.b.a(f315680a, this, i2Var, x2.g(obj))) {
            return false;
        }
        I1(null);
        J1(obj);
        C0(i2Var, obj);
        return true;
    }

    public static /* synthetic */ void Y0() {
    }

    private final boolean Y1(i2 i2Var, Throwable th2) throws Throwable {
        b3 b3VarZ0 = Z0(i2Var);
        if (b3VarZ0 == null) {
            return false;
        }
        if (!androidx.concurrent.futures.b.a(f315680a, this, i2Var, new c(b3VarZ0, false, th2))) {
            return false;
        }
        D1(b3VarZ0, th2);
        return true;
    }

    private final void Z(Throwable th2, List<? extends Throwable> list) {
        if (list.size() > 1) {
            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
            for (Throwable th3 : list) {
                if (th3 != th2 && th3 != th2 && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                    kotlin.p.a(th2, th3);
                }
            }
        }
    }

    private final b3 Z0(i2 i2Var) {
        b3 b3VarA = i2Var.a();
        if (b3VarA != null) {
            return b3VarA;
        }
        if (i2Var instanceof r1) {
            return new b3();
        }
        if (i2Var instanceof v2) {
            M1((v2) i2Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + i2Var).toString());
    }

    private final Object Z1(Object obj, Object obj2) throws Throwable {
        if (!(obj instanceof i2)) {
            return x2.f315706a;
        }
        if ((!(obj instanceof r1) && !(obj instanceof v2)) || (obj instanceof v) || (obj2 instanceof c0)) {
            return a2((i2) obj, obj2);
        }
        return X1((i2) obj, obj2) ? obj2 : x2.f315708c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    private final Object a2(i2 i2Var, Object obj) throws Throwable {
        b3 b3VarZ0 = Z0(i2Var);
        if (b3VarZ0 == null) {
            return x2.f315708c;
        }
        c cVar = i2Var instanceof c ? (c) i2Var : null;
        if (cVar == null) {
            cVar = new c(b3VarZ0, false, null);
        }
        kotlin.jvm.internal.i1.h hVar = new kotlin.jvm.internal.i1.h();
        synchronized (cVar) {
            try {
                if (cVar.m()) {
                    return x2.f315706a;
                }
                cVar.p(true);
                if (cVar != i2Var && !androidx.concurrent.futures.b.a(f315680a, this, i2Var, cVar)) {
                    return x2.f315708c;
                }
                boolean zL = cVar.l();
                c0 c0Var = obj instanceof c0 ? (c0) obj : null;
                if (c0Var != null) {
                    cVar.b(c0Var.f313551a);
                }
                ?? E = zL ? 0 : cVar.e();
                hVar.f312751a = E;
                Unit unit = Unit.f312394a;
                if (E != 0) {
                    D1(b3VarZ0, E);
                }
                v vVarC1 = C1(b3VarZ0);
                if (vVarC1 != null && c2(cVar, vVarC1, obj)) {
                    return x2.f315707b;
                }
                b3VarZ0.f(2);
                v vVarC2 = C1(b3VarZ0);
                return (vVarC2 == null || !c2(cVar, vVarC2, obj)) ? I0(cVar, obj) : x2.f315707b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final boolean b2(v2 v2Var, Function2<? super i2, ? super b3, Boolean> function2) {
        while (true) {
            Object objC1 = c1();
            if (objC1 instanceof r1) {
                r1 r1Var = (r1) objC1;
                if (!r1Var.isActive()) {
                    L1(r1Var);
                } else if (androidx.concurrent.futures.b.a(f315680a, this, objC1, v2Var)) {
                    return true;
                }
            } else {
                if (!(objC1 instanceof i2)) {
                    return false;
                }
                b3 b3VarA = ((i2) objC1).a();
                if (b3VarA == null) {
                    Intrinsics.checkNotNull(objC1, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    M1((v2) objC1);
                } else if (function2.invoke(objC1, b3VarA).booleanValue()) {
                    return true;
                }
            }
        }
    }

    private final boolean c2(c cVar, v vVar, Object obj) {
        while (s2.B(vVar.f315661e, false, new b(this, cVar, vVar, obj)) == d3.f313923a) {
            vVar = C1(vVar);
            if (vVar == null) {
                return false;
            }
        }
        return true;
    }

    private final /* synthetic */ Object f1() {
        return this._parentHandle$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object i0(kotlin.coroutines.d<Object> dVar) {
        a aVar = new a(kotlin.coroutines.intrinsics.b.e(dVar), this);
        aVar.p0();
        r.a(aVar, u2.B(this, false, new i3(aVar), 1, null));
        Object objU = aVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU;
    }

    private final /* synthetic */ Object k1() {
        return this._state$volatile;
    }

    private final boolean s1(i2 i2Var) {
        return (i2Var instanceof c) && ((c) i2Var).l();
    }

    private final Object t0(Object obj) throws Throwable {
        Object objZ1;
        do {
            Object objC1 = c1();
            if ((objC1 instanceof i2) && (!(objC1 instanceof c) || !((c) objC1).m())) {
                objZ1 = Z1(objC1, new c0(E0(obj), false, 2, null));
            }
            return x2.f315706a;
        } while (objZ1 == x2.f315708c);
        return objZ1;
    }

    private final boolean v0(Throwable th2) {
        if (u1()) {
            return true;
        }
        boolean z10 = th2 instanceof CancellationException;
        u uVarA1 = a1();
        if (uVarA1 == null || uVarA1 == d3.f313923a) {
            return z10;
        }
        return uVarA1.c(th2) || z10;
    }

    private final boolean v1() {
        Object objC1;
        do {
            objC1 = c1();
            if (!(objC1 instanceof i2)) {
                return false;
            }
        } while (S1(objC1) < 0);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object w1(kotlin.coroutines.d<? super Unit> dVar) {
        p pVar = new p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        r.a(pVar, u2.B(this, false, new j3(pVar), 1, null));
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU == kotlin.coroutines.intrinsics.b.l() ? objU : Unit.f312394a;
    }

    private final Void x1(Function1<Object, Unit> function1) {
        while (true) {
            function1.invoke(c1());
        }
    }

    private final Object y1(Object obj) throws Throwable {
        Throwable thE0 = null;
        while (true) {
            Object objC1 = c1();
            if (objC1 instanceof c) {
                synchronized (objC1) {
                    try {
                        if (((c) objC1).n()) {
                            return x2.f315709d;
                        }
                        boolean zL = ((c) objC1).l();
                        if (obj != null || !zL) {
                            if (thE0 == null) {
                                thE0 = E0(obj);
                            }
                            ((c) objC1).b(thE0);
                        }
                        Throwable thE = zL ? null : ((c) objC1).e();
                        if (thE != null) {
                            D1(((c) objC1).a(), thE);
                        }
                        return x2.f315706a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            if (!(objC1 instanceof i2)) {
                return x2.f315709d;
            }
            if (thE0 == null) {
                thE0 = E0(obj);
            }
            i2 i2Var = (i2) objC1;
            if (!i2Var.isActive()) {
                Object objZ1 = Z1(objC1, new c0(thE0, false, 2, null));
                if (objZ1 == x2.f315706a) {
                    throw new IllegalStateException(("Cannot happen in " + objC1).toString());
                }
                if (objZ1 != x2.f315708c) {
                    return objZ1;
                }
            } else if (Y1(i2Var, thE0)) {
                return x2.f315706a;
            }
        }
    }

    public boolean A0(@NotNull Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        return q0(th2) && S0();
    }

    @Nullable
    public final Object A1(@Nullable Object obj) throws Throwable {
        Object objZ1;
        do {
            objZ1 = Z1(c1(), obj);
            if (objZ1 == x2.f315706a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, N0(obj));
            }
        } while (objZ1 == x2.f315708c);
        return objZ1;
    }

    @NotNull
    public String B1() {
        return x0.a(this);
    }

    @Override // kotlinx.coroutines.p2
    @NotNull
    public final o1 E(@NotNull Function1<? super Throwable, Unit> function1) {
        return r1(true, new o2(function1));
    }

    @NotNull
    public final q2 F0(@Nullable String str, @Nullable Throwable th2) {
        if (str == null) {
            str = z0();
        }
        return new q2(str, th2, this);
    }

    protected void I1(@Nullable Throwable th2) {
    }

    @Nullable
    public final Object J0() throws Throwable {
        Object objC1 = c1();
        if (objC1 instanceof i2) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (objC1 instanceof c0) {
            throw ((c0) objC1).f313551a;
        }
        return x2.h(objC1);
    }

    protected void J1(@Nullable Object obj) {
    }

    @Nullable
    protected final Throwable K0() {
        Object objC1 = c1();
        if (objC1 instanceof c) {
            Throwable thE = ((c) objC1).e();
            if (thE != null) {
                return thE;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (!(objC1 instanceof i2)) {
            if (objC1 instanceof c0) {
                return ((c0) objC1).f313551a;
            }
            return null;
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    protected void K1() {
    }

    protected final boolean L0() {
        Object objC1 = c1();
        return (objC1 instanceof c0) && ((c0) objC1).a();
    }

    public final void O1(@NotNull v2 v2Var) {
        Object objC1;
        do {
            objC1 = c1();
            if (!(objC1 instanceof v2)) {
                if (!(objC1 instanceof i2) || ((i2) objC1).a() == null) {
                    return;
                }
                v2Var.v();
                return;
            }
            if (objC1 != v2Var) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f315680a, this, objC1, x2.f315715j));
    }

    public final void P1(@Nullable u uVar) {
        f315681b.set(this, uVar);
    }

    @Override // kotlinx.coroutines.g3
    @NotNull
    public CancellationException Q0() {
        Throwable thE;
        Object objC1 = c1();
        if (objC1 instanceof c) {
            thE = ((c) objC1).e();
        } else if (objC1 instanceof c0) {
            thE = ((c0) objC1).f313551a;
        } else {
            if (objC1 instanceof i2) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objC1).toString());
            }
            thE = null;
        }
        CancellationException q2Var = thE instanceof CancellationException ? (CancellationException) thE : null;
        if (q2Var == null) {
            q2Var = new q2("Parent job is " + T1(objC1), thE, this);
        }
        return q2Var;
    }

    public boolean S0() {
        return true;
    }

    @NotNull
    protected final CancellationException U1(@NotNull Throwable th2, @Nullable String str) {
        CancellationException q2Var = th2 instanceof CancellationException ? (CancellationException) th2 : null;
        if (q2Var == null) {
            if (str == null) {
                str = z0();
            }
            q2Var = new q2(str, th2, this);
        }
        return q2Var;
    }

    @NotNull
    protected final kotlinx.coroutines.selects.h<?> V0() {
        g gVar = g.f315700a;
        Intrinsics.checkNotNull(gVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        pj.n nVar = (pj.n) kotlin.jvm.internal.r1.q(gVar, 3);
        h hVar = h.f315701a;
        Intrinsics.checkNotNull(hVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new kotlinx.coroutines.selects.i(this, nVar, (pj.n) kotlin.jvm.internal.r1.q(hVar, 3), null, 8, null);
    }

    @k2
    @NotNull
    public final String W1() {
        return B1() + AbstractJsonLexerKt.BEGIN_OBJ + T1(c1()) + AbstractJsonLexerKt.END_OBJ;
    }

    public boolean X0() {
        return false;
    }

    protected void a0(@Nullable Object obj) {
    }

    @Nullable
    public final u a1() {
        return (u) f315681b.get(this);
    }

    @Override // kotlinx.coroutines.p2
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Added since 1.2.0 for binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean c(Throwable th2) throws Throwable {
        Throwable q2Var;
        if (th2 == null || (q2Var = V1(this, th2, null, 1, null)) == null) {
            q2Var = new q2(z0(), null, this);
        }
        s0(q2Var);
        return true;
    }

    @Nullable
    public final Object c1() {
        return f315680a.get(this);
    }

    @Override // kotlinx.coroutines.p2
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        e(null);
    }

    @Override // kotlinx.coroutines.p2
    @Nullable
    public final Object d1(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        if (v1()) {
            Object objW1 = w1(dVar);
            return objW1 == kotlin.coroutines.intrinsics.b.l() ? objW1 : Unit.f312394a;
        }
        s2.y(dVar.getContext());
        return Unit.f312394a;
    }

    @Override // kotlinx.coroutines.p2
    public void e(@Nullable CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new q2(z0(), null, this);
        }
        s0(cancellationException);
    }

    @Override // kotlinx.coroutines.p2
    @NotNull
    public final kotlinx.coroutines.selects.f f0() {
        i iVar = i.f315702a;
        Intrinsics.checkNotNull(iVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        return new kotlinx.coroutines.selects.g(this, (pj.n) kotlin.jvm.internal.r1.q(iVar, 3), null, 4, null);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r10, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) p2.a.d(this, r10, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.b<E> bVar) {
        return (E) p2.a.e(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public final CoroutineContext.b<?> getKey() {
        return p2.M2;
    }

    @Override // kotlinx.coroutines.p2
    @Nullable
    public p2 getParent() {
        u uVarA1 = a1();
        if (uVarA1 != null) {
            return uVarA1.getParent();
        }
        return null;
    }

    @Nullable
    protected final Object h0(@NotNull kotlin.coroutines.d<Object> dVar) throws Throwable {
        Object objC1;
        do {
            objC1 = c1();
            if (!(objC1 instanceof i2)) {
                if (objC1 instanceof c0) {
                    throw ((c0) objC1).f313551a;
                }
                return x2.h(objC1);
            }
        } while (S1(objC1) < 0);
        return i0(dVar);
    }

    @Override // kotlinx.coroutines.p2
    public boolean isActive() {
        Object objC1 = c1();
        if (!(objC1 instanceof i2) || !((i2) objC1).isActive()) {
            return false;
        }
        int i10 = 5 << 1;
        return true;
    }

    @Override // kotlinx.coroutines.p2
    public final boolean isCancelled() {
        Object objC1 = c1();
        if (!(objC1 instanceof c0) && (!(objC1 instanceof c) || !((c) objC1).l())) {
            return false;
        }
        return true;
    }

    @Override // kotlinx.coroutines.p2
    @NotNull
    public final u j0(@NotNull w wVar) {
        v vVar = new v(wVar);
        vVar.F(this);
        while (true) {
            Object objC1 = c1();
            if (objC1 instanceof r1) {
                r1 r1Var = (r1) objC1;
                if (!r1Var.isActive()) {
                    L1(r1Var);
                } else if (androidx.concurrent.futures.b.a(f315680a, this, objC1, vVar)) {
                    return vVar;
                }
            } else {
                Throwable thE = null;
                if (!(objC1 instanceof i2)) {
                    Object objC2 = c1();
                    c0 c0Var = objC2 instanceof c0 ? (c0) objC2 : null;
                    vVar.E(c0Var != null ? c0Var.f313551a : null);
                    return d3.f313923a;
                }
                b3 b3VarA = ((i2) objC1).a();
                if (b3VarA != null) {
                    if (!b3VarA.b(vVar, 7)) {
                        boolean zB = b3VarA.b(vVar, 3);
                        Object objC3 = c1();
                        if (objC3 instanceof c) {
                            thE = ((c) objC3).e();
                        } else {
                            c0 c0Var2 = objC3 instanceof c0 ? (c0) objC3 : null;
                            if (c0Var2 != null) {
                                thE = c0Var2.f313551a;
                            }
                        }
                        vVar.E(thE);
                        if (!zB) {
                            return d3.f313923a;
                        }
                    }
                    return vVar;
                }
                Intrinsics.checkNotNull(objC1, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                M1((v2) objC1);
            }
        }
    }

    public final boolean m0(@Nullable Throwable th2) {
        return q0(th2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.b<?> bVar) {
        return p2.a.h(this, bVar);
    }

    protected boolean n1(@NotNull Throwable th2) {
        return false;
    }

    public void p1(@NotNull Throwable th2) throws Throwable {
        throw th2;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return p2.a.i(this, coroutineContext);
    }

    public final boolean q0(@Nullable Object obj) throws Throwable {
        Object objY1 = x2.f315706a;
        if (X0() && (objY1 = t0(obj)) == x2.f315707b) {
            return true;
        }
        if (objY1 == x2.f315706a) {
            objY1 = y1(obj);
        }
        if (objY1 == x2.f315706a || objY1 == x2.f315707b) {
            return true;
        }
        if (objY1 == x2.f315709d) {
            return false;
        }
        a0(objY1);
        return true;
    }

    protected final void q1(@Nullable p2 p2Var) {
        if (p2Var == null) {
            P1(d3.f313923a);
            return;
        }
        p2Var.start();
        u uVarJ0 = p2Var.j0(this);
        P1(uVarJ0);
        if (x()) {
            uVarJ0.dispose();
            P1(d3.f313923a);
        }
    }

    @Override // kotlinx.coroutines.w
    public final void r(@NotNull g3 g3Var) throws Throwable {
        q0(g3Var);
    }

    @Override // kotlinx.coroutines.p2
    @NotNull
    public final Sequence<p2> r0() {
        return kotlin.sequences.o.b(new f(null));
    }

    @NotNull
    public final o1 r1(boolean z10, @NotNull v2 v2Var) {
        boolean z11;
        boolean zB;
        v2Var.F(this);
        while (true) {
            Object objC1 = c1();
            z11 = true;
            if (!(objC1 instanceof r1)) {
                if (!(objC1 instanceof i2)) {
                    z11 = false;
                    break;
                }
                i2 i2Var = (i2) objC1;
                b3 b3VarA = i2Var.a();
                if (b3VarA == null) {
                    Intrinsics.checkNotNull(objC1, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    M1((v2) objC1);
                } else {
                    if (v2Var.D()) {
                        c cVar = i2Var instanceof c ? (c) i2Var : null;
                        Throwable thE = cVar != null ? cVar.e() : null;
                        if (thE != null) {
                            if (z10) {
                                v2Var.E(thE);
                            }
                            return d3.f313923a;
                        }
                        zB = b3VarA.b(v2Var, 5);
                    } else {
                        zB = b3VarA.b(v2Var, 1);
                    }
                    if (zB) {
                        break;
                    }
                }
            } else {
                r1 r1Var = (r1) objC1;
                if (!r1Var.isActive()) {
                    L1(r1Var);
                } else if (androidx.concurrent.futures.b.a(f315680a, this, objC1, v2Var)) {
                    break;
                }
            }
        }
        if (z11) {
            return v2Var;
        }
        if (z10) {
            Object objC2 = c1();
            c0 c0Var = objC2 instanceof c0 ? (c0) objC2 : null;
            v2Var.E(c0Var != null ? c0Var.f313551a : null);
        }
        return d3.f313923a;
    }

    public void s0(@NotNull Throwable th2) throws Throwable {
        q0(th2);
    }

    @Override // kotlinx.coroutines.p2
    public final boolean start() {
        int iS1;
        do {
            iS1 = S1(c1());
            if (iS1 == 0) {
                return false;
            }
        } while (iS1 != 1);
        return true;
    }

    @Override // kotlinx.coroutines.p2
    @kotlin.l(level = kotlin.n.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    @NotNull
    public p2 t(@NotNull p2 p2Var) {
        return p2.a.j(this, p2Var);
    }

    public final boolean t1() {
        return c1() instanceof c0;
    }

    @NotNull
    public String toString() {
        return W1() + '@' + x0.b(this);
    }

    protected boolean u1() {
        return false;
    }

    @Nullable
    public final Throwable w0() {
        Object objC1 = c1();
        if (objC1 instanceof i2) {
            throw new IllegalStateException("This job has not completed yet");
        }
        return N0(objC1);
    }

    @Override // kotlinx.coroutines.p2
    public final boolean x() {
        return !(c1() instanceof i2);
    }

    @Override // kotlinx.coroutines.p2
    @NotNull
    public final o1 x0(boolean z10, boolean z11, @NotNull Function1<? super Throwable, Unit> function1) {
        return r1(z11, z10 ? new n2(function1) : new o2(function1));
    }

    @Override // kotlinx.coroutines.p2
    @NotNull
    public final CancellationException y0() {
        Object objC1 = c1();
        if (!(objC1 instanceof c)) {
            if (objC1 instanceof i2) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (objC1 instanceof c0) {
                return V1(this, ((c0) objC1).f313551a, null, 1, null);
            }
            return new q2(x0.a(this) + " has completed normally", null, this);
        }
        Throwable thE = ((c) objC1).e();
        if (thE != null) {
            CancellationException cancellationExceptionU1 = U1(thE, x0.a(this) + " is cancelling");
            if (cancellationExceptionU1 != null) {
                return cancellationExceptionU1;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public String z0() {
        return "Job was cancelled";
    }

    public final boolean z1(@Nullable Object obj) throws Throwable {
        Object objZ1;
        do {
            objZ1 = Z1(c1(), obj);
            if (objZ1 == x2.f315706a) {
                return false;
            }
            if (objZ1 == x2.f315707b) {
                return true;
            }
        } while (objZ1 == x2.f315708c);
        a0(objZ1);
        return true;
    }
}
