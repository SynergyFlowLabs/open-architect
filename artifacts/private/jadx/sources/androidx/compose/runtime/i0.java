package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 4 CompositeKeyHashCode.jvm.kt\nandroidx/compose/runtime/CompositeKeyHashCode_jvmKt\n+ 5 BitwiseOperators.kt\nandroidx/compose/runtime/BitwiseOperatorsKt\n+ 6 Trace.kt\nandroidx/compose/runtime/internal/TraceKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 9 CompositionLocalMap.kt\nandroidx/compose/runtime/CompositionLocalMapKt\n+ 10 Composer.kt\nandroidx/compose/runtime/GroupKind\n+ 11 IntIntMap.kt\nandroidx/collection/IntIntMap\n+ 12 ComposerChangeListWriter.kt\nandroidx/compose/runtime/changelist/ComposerChangeListWriter\n+ 13 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 14 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 15 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 16 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 17 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 18 Stack.kt\nandroidx/compose/runtime/IntStack\n+ 19 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,5012:1\n4286#1,11:5021\n4297#1:5034\n4289#1,9:5035\n4286#1,11:5068\n4297#1:5081\n4289#1,9:5082\n4305#1,11:5093\n4316#1:5106\n4308#1,9:5107\n4305#1,11:5116\n4316#1:5129\n4308#1,9:5130\n4286#1,11:5149\n4297#1:5162\n4289#1,9:5163\n4305#1,11:5172\n4316#1:5185\n4308#1,9:5186\n3631#1,8:5221\n3640#1,3:5244\n4295#1,2:5353\n4297#1:5357\n4295#1,2:5358\n4297#1:5362\n4295#1,2:5363\n4297#1:5367\n4295#1,2:5368\n4297#1:5372\n4314#1,2:5375\n4316#1:5379\n4314#1,2:5380\n4316#1:5384\n4314#1,2:5385\n4316#1:5389\n4314#1,2:5390\n4316#1:5394\n3631#1,8:5404\n3640#1,3:5420\n1#2:5013\n159#3,7:5014\n159#3,7:5211\n159#3,3:5218\n163#3,3:5247\n159#3,7:5259\n159#3,7:5266\n159#3,3:5335\n163#3,3:5346\n33#4:5032\n30#4:5044\n33#4:5079\n36#4:5104\n36#4:5127\n30#4:5140\n44#4:5141\n39#4:5143\n39#4:5145\n39#4:5147\n33#4:5160\n36#4:5183\n30#4:5203\n33#4:5355\n33#4:5360\n33#4:5365\n33#4:5370\n33#4:5373\n36#4:5377\n36#4:5382\n36#4:5387\n36#4:5392\n36#4:5395\n35#5:5033\n35#5:5080\n27#5:5105\n27#5:5128\n35#5:5142\n35#5:5144\n35#5:5146\n35#5:5148\n35#5:5161\n27#5:5184\n35#5:5356\n35#5:5361\n35#5:5366\n35#5:5371\n35#5:5374\n27#5:5378\n27#5:5383\n27#5:5388\n27#5:5393\n27#5:5396\n45#6,5:5045\n45#6,3:5314\n49#6:5326\n4788#7,4:5050\n4788#7,4:5054\n4809#7:5063\n4788#7,4:5064\n4788#7,4:5195\n4788#7,4:5199\n4788#7,4:5273\n4788#7,4:5277\n4788#7,4:5281\n4788#7,4:5310\n4788#7,4:5327\n4788#7,4:5331\n4788#7,4:5349\n4636#7,9:5426\n34#8,4:5058\n80#9:5062\n4718#10:5091\n4721#10:5092\n430#11:5139\n173#12,4:5204\n173#12,4:5229\n183#12,8:5233\n178#12,3:5241\n178#12,3:5251\n173#12,8:5338\n173#12,4:5400\n183#12,8:5412\n178#12,3:5423\n34#13,3:5208\n38#13:5250\n34#13,5:5254\n357#14,4:5285\n329#14,6:5289\n339#14,3:5296\n342#14,9:5300\n361#14:5309\n1399#15:5295\n1270#15:5299\n390#16,6:5317\n396#16,2:5324\n44#17:5323\n53#18:5397\n53#18:5398\n53#18:5399\n1863#19,2:5435\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n*L\n1551#1:5021,11\n1551#1:5034\n1551#1:5035,9\n2529#1:5068,11\n2529#1:5081\n2529#1:5082,9\n2672#1:5093,11\n2672#1:5106\n2672#1:5107,9\n2680#1:5116,11\n2680#1:5129\n2680#1:5130,9\n3229#1:5149,11\n3229#1:5162\n3229#1:5163,9\n3233#1:5172,11\n3233#1:5185\n3233#1:5186,9\n3593#1:5221,8\n3593#1:5244,3\n4288#1:5353,2\n4288#1:5357\n4289#1:5358,2\n4289#1:5362\n4290#1:5363,2\n4290#1:5367\n4291#1:5368,2\n4291#1:5372\n4307#1:5375,2\n4307#1:5379\n4308#1:5380,2\n4308#1:5384\n4309#1:5385,2\n4309#1:5389\n4310#1:5390,2\n4310#1:5394\n3542#1:5404,8\n3542#1:5420,3\n1486#1:5014,7\n3536#1:5211,7\n3592#1:5218,3\n3592#1:5247,3\n3720#1:5259,7\n3728#1:5266,7\n4080#1:5335,3\n4080#1:5346,3\n1551#1:5032\n1745#1:5044\n2529#1:5079\n2672#1:5104\n2680#1:5127\n3146#1:5140\n3151#1:5141\n3157#1:5143\n3164#1:5145\n3165#1:5147\n3229#1:5160\n3233#1:5183\n3442#1:5203\n4288#1:5355\n4289#1:5360\n4290#1:5365\n4291#1:5370\n4296#1:5373\n4307#1:5377\n4308#1:5382\n4309#1:5387\n4310#1:5392\n4315#1:5395\n1551#1:5033\n2529#1:5080\n2672#1:5105\n2680#1:5128\n3151#1:5142\n3157#1:5144\n3164#1:5146\n3165#1:5148\n3229#1:5161\n3233#1:5184\n4288#1:5356\n4289#1:5361\n4290#1:5366\n4291#1:5371\n4296#1:5374\n4307#1:5378\n4308#1:5383\n4309#1:5388\n4310#1:5393\n4315#1:5396\n1810#1:5045,5\n3821#1:5314,3\n3821#1:5326\n1881#1:5050,4\n1892#1:5054,4\n2501#1:5063\n2501#1:5064,4\n3277#1:5195,4\n3296#1:5199,4\n3744#1:5273,4\n3754#1:5277,4\n3771#1:5281,4\n3819#1:5310,4\n3881#1:5327,4\n3888#1:5331,4\n4092#1:5349,4\n3929#1:5426,9\n1937#1:5058,4\n2322#1:5062\n2535#1:5091\n2560#1:5092\n3051#1:5139\n3513#1:5204,4\n3598#1:5229,4\n3599#1:5233,8\n3598#1:5241,3\n3513#1:5251,3\n4082#1:5338,8\n3541#1:5400,4\n3543#1:5412,8\n3541#1:5423,3\n3515#1:5208,3\n3515#1:5250\n3658#1:5254,5\n3803#1:5285,4\n3803#1:5289,6\n3803#1:5296,3\n3803#1:5300,9\n3803#1:5309\n3803#1:5295\n3803#1:5299\n3840#1:5317,6\n3840#1:5324,2\n3840#1:5323\n4320#1:5397\n4322#1:5398\n4324#1:5399\n4011#1:5435,2\n*E\n"})
public final class i0 implements c0 {
    public static final int Z = 8;
    private boolean A;
    private int C;
    private int D;
    private boolean E;

    @NotNull
    private final c F;

    @NotNull
    private final ArrayList<Object> G;
    private boolean H;
    private boolean I;

    @NotNull
    private v5 J;

    @NotNull
    private w5 K;

    @NotNull
    private z5 L;
    private boolean M;

    @Nullable
    private e4 N;

    @Nullable
    private androidx.compose.runtime.changelist.a O;

    @NotNull
    private final androidx.compose.runtime.changelist.b P;

    @NotNull
    private g Q;

    @NotNull
    private androidx.compose.runtime.changelist.c R;
    private boolean S;

    @Nullable
    private t5 T;

    @Nullable
    private final androidx.compose.runtime.tooling.j U;

    @NotNull
    private final CoroutineContext V;
    private boolean W;
    private long X;

    @Nullable
    private androidx.compose.runtime.tooling.f Y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final i<?> f35819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final p0 f35820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final w5 f35821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Set<m5> f35822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private androidx.compose.runtime.changelist.a f35823f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private androidx.compose.runtime.changelist.a f35824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final d1 f35825h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final s0 f35826i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private d4 f35828k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f35829l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f35830m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f35831n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    private int[] f35833p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    private androidx.collection.q1 f35834q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f35835r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f35836s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f35837t;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    private androidx.collection.t1<e4> f35841x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f35842y;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final ArrayList<Object> f35827j = m7.d(null, 1, null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final p2 f35832o = new p2();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private final List<t2> f35838u = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final p2 f35839v = new p2();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private e4 f35840w = androidx.compose.runtime.internal.q0.b();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    private final p2 f35843z = new p2();
    private int B = -1;

    @androidx.compose.runtime.internal.w0(parameters = 0)
    public static final class a implements q5 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f35844b = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final b f35845a;

        public a(@NotNull b bVar) {
            this.f35845a = bVar;
        }

        @NotNull
        public final b a() {
            return this.f35845a;
        }

        @Override // androidx.compose.runtime.m5
        public void i() {
        }

        @Override // androidx.compose.runtime.m5
        public void j() {
            this.f35845a.B();
        }

        @Override // androidx.compose.runtime.m5
        public void k() {
            this.f35845a.B();
        }
    }

    @SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$CompositionContextImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,5012:1\n1863#2,2:5013\n85#3:5015\n117#3,2:5016\n1#4:5018\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$CompositionContextImpl\n*L\n4159#1:5013,2\n4226#1:5015\n4226#1:5016,2\n*E\n"})
    public final class b extends p0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f35846b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f35847c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f35848d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private final d1 f35849e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private Set<Set<androidx.compose.runtime.tooling.f>> f35850f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        private final Set<i0> f35851g = new LinkedHashSet();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        private final n3 f35852h = w6.k(androidx.compose.runtime.internal.q0.b(), w6.v());

        public b(long j10, boolean z10, @Nullable boolean z11, d1 d1Var) {
            this.f35846b = j10;
            this.f35847c = z10;
            this.f35848d = z11;
            this.f35849e = d1Var;
        }

        private final e4 D() {
            return (e4) this.f35852h.getValue();
        }

        public static /* synthetic */ void F() {
        }

        private final void G(e4 e4Var) {
            this.f35852h.setValue(e4Var);
        }

        @Override // androidx.compose.runtime.p0
        public void A(@NotNull l1 l1Var) {
            i0.this.f35820c.A(l1Var);
        }

        public final void B() {
            if (this.f35851g.isEmpty()) {
                return;
            }
            Set<Set<androidx.compose.runtime.tooling.f>> set = this.f35850f;
            if (set != null) {
                for (i0 i0Var : this.f35851g) {
                    Iterator<Set<androidx.compose.runtime.tooling.f>> it = set.iterator();
                    while (it.hasNext()) {
                        it.next().remove(i0Var.f35821d);
                    }
                }
            }
            this.f35851g.clear();
        }

        @NotNull
        public final Set<i0> C() {
            return this.f35851g;
        }

        @Nullable
        public final Set<Set<androidx.compose.runtime.tooling.f>> E() {
            return this.f35850f;
        }

        public final void H(@Nullable Set<Set<androidx.compose.runtime.tooling.f>> set) {
            this.f35850f = set;
        }

        public final void I(@NotNull e4 e4Var) {
            G(e4Var);
        }

        @Override // androidx.compose.runtime.p0
        @p(scheme = "[0[0]]")
        public void a(@NotNull l1 l1Var, @NotNull Function2<? super c0, ? super Integer, Unit> function2) {
            i0.this.f35820c.a(l1Var, function2);
        }

        @Override // androidx.compose.runtime.p0
        @p(scheme = "[0[0]]")
        @NotNull
        public androidx.collection.c3<s4> b(@NotNull l1 l1Var, @NotNull t5 t5Var, @NotNull Function2<? super c0, ? super Integer, Unit> function2) {
            return i0.this.f35820c.b(l1Var, t5Var, function2);
        }

        @Override // androidx.compose.runtime.p0
        public void c(@NotNull i3 i3Var) {
            i0.this.f35820c.c(i3Var);
        }

        @Override // androidx.compose.runtime.p0
        public void d() {
            i0.this.C--;
        }

        @Override // androidx.compose.runtime.p0
        public boolean e() {
            return i0.this.f35820c.e();
        }

        @Override // androidx.compose.runtime.p0
        public boolean f() {
            return this.f35847c;
        }

        @Override // androidx.compose.runtime.p0
        public boolean g() {
            return this.f35848d;
        }

        @Override // androidx.compose.runtime.p0
        public long h() {
            return this.f35846b;
        }

        @Override // androidx.compose.runtime.p0
        @NotNull
        public o0 i() {
            return i0.this.x();
        }

        @Override // androidx.compose.runtime.p0
        @NotNull
        public e4 j() {
            return D();
        }

        @Override // androidx.compose.runtime.p0
        @NotNull
        public CoroutineContext k() {
            return i0.this.f35820c.k();
        }

        @Override // androidx.compose.runtime.p0
        @Nullable
        public d1 l() {
            return this.f35849e;
        }

        @Override // androidx.compose.runtime.p0
        @NotNull
        public CoroutineContext m() {
            return t0.j(i0.this.x());
        }

        @Override // androidx.compose.runtime.p0
        public void n(@NotNull i3 i3Var) {
            i0.this.f35820c.n(i3Var);
        }

        @Override // androidx.compose.runtime.p0
        public void o(@NotNull l1 l1Var) {
            i0.this.f35820c.o(i0.this.x());
            i0.this.f35820c.o(l1Var);
        }

        @Override // androidx.compose.runtime.p0
        public void p(@NotNull s4 s4Var) {
            i0.this.f35820c.p(s4Var);
        }

        @Override // androidx.compose.runtime.p0
        public void q(@NotNull i3 i3Var, @NotNull h3 h3Var, @NotNull i<?> iVar) {
            i0.this.f35820c.q(i3Var, h3Var, iVar);
        }

        @Override // androidx.compose.runtime.p0
        @Nullable
        public h3 r(@NotNull i3 i3Var) {
            return i0.this.f35820c.r(i3Var);
        }

        @Override // androidx.compose.runtime.p0
        @NotNull
        public androidx.collection.c3<s4> s(@NotNull l1 l1Var, @NotNull t5 t5Var, @NotNull androidx.collection.c3<s4> c3Var) {
            return i0.this.f35820c.s(l1Var, t5Var, c3Var);
        }

        @Override // androidx.compose.runtime.p0
        public void t(@NotNull Set<androidx.compose.runtime.tooling.f> set) {
            Set hashSet = this.f35850f;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.f35850f = hashSet;
            }
            hashSet.add(set);
        }

        @Override // androidx.compose.runtime.p0
        public void u(@NotNull c0 c0Var) {
            Intrinsics.checkNotNull(c0Var, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
            super.u((i0) c0Var);
            this.f35851g.add(c0Var);
        }

        @Override // androidx.compose.runtime.p0
        public void v(@NotNull l1 l1Var) {
            i0.this.f35820c.v(l1Var);
        }

        @Override // androidx.compose.runtime.p0
        public void w(@NotNull s4 s4Var) {
            i0.this.f35820c.w(s4Var);
        }

        @Override // androidx.compose.runtime.p0
        public void x(@NotNull l1 l1Var) {
            i0.this.f35820c.x(l1Var);
        }

        @Override // androidx.compose.runtime.p0
        public void y() {
            i0.this.C++;
        }

        @Override // androidx.compose.runtime.p0
        public void z(@NotNull c0 c0Var) {
            Set<Set<androidx.compose.runtime.tooling.f>> set = this.f35850f;
            if (set != null) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    Set set2 = (Set) it.next();
                    Intrinsics.checkNotNull(c0Var, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                    set2.remove(((i0) c0Var).f35821d);
                }
            }
            kotlin.jvm.internal.r1.a(this.f35851g).remove(c0Var);
        }
    }

    public static final class c implements r1 {
        c() {
        }

        @Override // androidx.compose.runtime.r1
        public void a(q1<?> q1Var) {
            i0.this.C--;
        }

        @Override // androidx.compose.runtime.r1
        public void b(q1<?> q1Var) {
            i0.this.C++;
        }
    }

    static final class d implements Function2<c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e3<Object> f35855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f35856b;

        d(e3<Object> e3Var, Object obj) {
            this.f35855a = e3Var;
            this.f35856b = obj;
        }

        @o
        public final void c(c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (m0.l0()) {
                m0.A0(316014703, i10, -1, "androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda.<anonymous> (Composer.kt:3477)");
            }
            this.f35855a.a().invoke(this.f35856b, c0Var, 0);
            if (m0.l0()) {
                m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    public i0(@NotNull i<?> iVar, @NotNull p0 p0Var, @NotNull w5 w5Var, @NotNull Set<m5> set, @NotNull androidx.compose.runtime.changelist.a aVar, @NotNull androidx.compose.runtime.changelist.a aVar2, @NotNull d1 d1Var, @NotNull s0 s0Var) {
        this.f35819b = iVar;
        this.f35820c = p0Var;
        this.f35821d = w5Var;
        this.f35822e = set;
        this.f35823f = aVar;
        this.f35824g = aVar2;
        this.f35825h = d1Var;
        this.f35826i = s0Var;
        this.E = p0Var.g() || p0Var.e();
        this.F = new c();
        this.G = m7.d(null, 1, null);
        v5 v5VarY = w5Var.Y();
        v5VarY.e();
        this.J = v5VarY;
        w5 w5Var2 = new w5();
        if (p0Var.g()) {
            w5Var2.p();
        }
        if (p0Var.e()) {
            w5Var2.n();
        }
        this.K = w5Var2;
        z5 z5VarA0 = w5Var2.a0();
        z5VarA0.M(true);
        this.L = z5VarA0;
        this.P = new androidx.compose.runtime.changelist.b(this, this.f35823f);
        v5 v5VarY2 = this.K.Y();
        try {
            g gVarA = v5VarY2.a(0);
            v5VarY2.e();
            this.Q = gVarA;
            this.R = new androidx.compose.runtime.changelist.c();
            this.U = new androidx.compose.runtime.tooling.j(this);
            CoroutineContext coroutineContextK = p0Var.k();
            CoroutineContext coroutineContextP1 = p1();
            if (coroutineContextP1 == null) {
                coroutineContextP1 = kotlin.coroutines.h.f312451a;
            }
            this.V = coroutineContextK.plus(coroutineContextP1);
        } catch (Throwable th2) {
            v5VarY2.e();
            throw th2;
        }
    }

    private final void A1(e3<Object> e3Var, e4 e4Var, Object obj, boolean z10) {
        m0(f3.f35774a, e3Var);
        A2(obj);
        long jG = g();
        try {
            this.X = f3.f35774a;
            boolean z11 = false;
            if (P()) {
                z5.I0(this.L, 0, 1, null);
            }
            if (!P() && !Intrinsics.areEqual(this.J.n(), e4Var)) {
                z11 = true;
            }
            if (z11) {
                S1(e4Var);
            }
            k2(202, m0.L(), k2.f36180b.a(), e4Var);
            this.N = null;
            if (!P() || z10) {
                boolean z12 = this.f35842y;
                this.f35842y = z11;
                androidx.compose.runtime.internal.f0.a(this, androidx.compose.runtime.internal.w.c(316014703, true, new d(e3Var, obj)));
                this.f35842y = z12;
            } else {
                this.M = true;
                z5 z5Var = this.L;
                this.f35820c.n(new i3(e3Var, obj, x(), this.K, z5Var.C(z5Var.V0(z5Var.k0())), CollectionsKt.emptyList(), Q0(), null));
            }
            Z0();
            this.N = null;
            this.X = jG;
            v0();
        } catch (Throwable th2) {
            try {
                throw androidx.compose.runtime.tooling.d.b(th2, new Function0() { // from class: androidx.compose.runtime.d0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return i0.B1(this.f35576a);
                    }
                });
            } catch (Throwable th3) {
                Z0();
                this.N = null;
                this.X = jG;
                v0();
                throw th3;
            }
        }
    }

    private final void A2(Object obj) {
        E1();
        B2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List B1(i0 i0Var) {
        return i0Var.S0();
    }

    private final int C2(int i10) {
        int i11;
        if (i10 >= 0) {
            int[] iArr = this.f35833p;
            return (iArr == null || (i11 = iArr[i10]) < 0) ? this.J.V(i10) : i11;
        }
        androidx.collection.q1 q1Var = this.f35834q;
        if (q1Var == null || !q1Var.e(i10)) {
            return 0;
        }
        return q1Var.n(i10);
    }

    private final void D0() {
        L0();
        m7.b(this.f35827j);
        this.f35832o.a();
        this.f35839v.a();
        this.f35843z.a();
        this.f35841x = null;
        this.R.c();
        this.X = 0;
        this.C = 0;
        this.f35837t = false;
        this.W = false;
        this.A = false;
        this.H = false;
        this.f35836s = false;
        this.B = -1;
        if (!this.J.k()) {
            this.J.e();
        }
        if (!this.L.e0()) {
            i1();
        }
    }

    private final void D2() {
        if (!this.f35837t) {
            m0.y("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f35837t = false;
    }

    private final void E2() {
        if (this.f35837t) {
            m0.y("A call to createNode(), emitNode() or useNode() expected");
        }
    }

    private final Object G1(v5 v5Var, int i10) {
        return v5Var.T(i10);
    }

    private final <R> R G2(v5 v5Var, Function0<? extends R> function0) {
        v5 v5Var2 = this.J;
        int[] iArr = this.f35833p;
        androidx.collection.t1<e4> t1Var = this.f35841x;
        this.f35833p = null;
        this.f35841x = null;
        try {
            this.J = v5Var;
            R rInvoke = function0.invoke();
            kotlin.jvm.internal.h0.d(1);
            this.J = v5Var2;
            this.f35833p = iArr;
            this.f35841x = t1Var;
            kotlin.jvm.internal.h0.c(1);
            return rInvoke;
        } catch (Throwable th2) {
            kotlin.jvm.internal.h0.d(1);
            this.J = v5Var2;
            this.f35833p = iArr;
            this.f35841x = t1Var;
            kotlin.jvm.internal.h0.c(1);
            throw th2;
        }
    }

    private final int H1(int i10, int i11, int i12, int i13) {
        int iX = this.J.X(i11);
        while (iX != i12 && !this.J.R(iX)) {
            iX = this.J.X(iX);
        }
        if (this.J.R(iX)) {
            i13 = 0;
        }
        if (iX == i11) {
            return i13;
        }
        int iC2 = (C2(iX) - this.J.V(i11)) + i13;
        loop1: while (i13 < iC2 && iX != i10) {
            iX++;
            while (iX < i10) {
                int iM = this.J.M(iX) + iX;
                if (i10 >= iM) {
                    i13 += this.J.R(iX) ? 1 : C2(iX);
                    iX = iM;
                }
            }
            break loop1;
        }
        return i13;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0075  */
    private final void I0() {
        s4 s4Var;
        boolean z10;
        if (P()) {
            s0 s0VarX = x();
            Intrinsics.checkNotNull(s0VarX, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            s4 s4Var2 = new s4(s0VarX);
            m7.n(this.G, s4Var2);
            B2(s4Var2);
            e1(s4Var2);
            return;
        }
        t2 t2VarR0 = m0.r0(this.f35838u, this.J.z());
        Object objS = this.J.S();
        if (Intrinsics.areEqual(objS, c0.f35327a.a())) {
            s0 s0VarX2 = x();
            Intrinsics.checkNotNull(s0VarX2, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            s4Var = new s4(s0VarX2);
            B2(s4Var);
        } else {
            Intrinsics.checkNotNull(objS, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
            s4Var = (s4) objS;
        }
        if (t2VarR0 != null) {
            z10 = true;
        } else {
            boolean zM = s4Var.m();
            if (zM) {
                s4Var.J(false);
            }
            if (zM) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        s4Var.M(z10);
        m7.n(this.G, s4Var);
        e1(s4Var);
        if (s4Var.o()) {
            s4Var.L(false);
            s4Var.P(true);
            this.P.a0(s4Var);
            if (this.A || !s4Var.t()) {
                return;
            }
            this.A = true;
            s4Var.O(true);
        }
    }

    private final void L0() {
        this.f35828k = null;
        this.f35829l = 0;
        this.f35830m = 0;
        this.X = 0L;
        this.f35837t = false;
        this.P.V();
        m7.b(this.G);
        M0();
    }

    private final int L1(int i10) {
        int iX = this.J.X(i10) + 1;
        int i11 = 0;
        while (iX < i10) {
            if (!this.J.O(iX)) {
                i11++;
            }
            iX += this.J.M(iX);
        }
        return i11;
    }

    private final void M0() {
        this.f35833p = null;
        this.f35834q = null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #0 {all -> 0x002e, blocks: (B:3:0x0007, B:5:0x0016, B:7:0x002a, B:11:0x0035, B:10:0x0030, B:15:0x003d, B:17:0x0043, B:19:0x004a), top: B:24:0x0007 }] */
    private final <R> R N1(l1 l1Var, l1 l1Var2, Integer num, List<? extends Pair<s4, ? extends Object>> list, Function0<? extends R> function0) {
        R rInvoke;
        boolean z10 = this.H;
        int i10 = this.f35829l;
        try {
            this.H = true;
            this.f35829l = 0;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                Pair<s4, ? extends Object> pair = list.get(i11);
                s4 s4VarComponent1 = pair.component1();
                Object objComponent2 = pair.component2();
                if (objComponent2 != null) {
                    q2(s4VarComponent1, objComponent2);
                } else {
                    q2(s4VarComponent1, null);
                }
            }
            if (l1Var == null) {
                rInvoke = function0.invoke();
            } else {
                rInvoke = (R) l1Var.T(l1Var2, num != null ? num.intValue() : -1, function0);
                if (rInvoke == null) {
                    rInvoke = function0.invoke();
                }
            }
            this.H = z10;
            return rInvoke;
        } finally {
            this.H = z10;
            this.f35829l = i10;
        }
    }

    private final long O0(int i10, int i11, long j10) {
        long jRotateLeft;
        long jRotateLeft2 = 0;
        int i12 = 3;
        int i13 = 0;
        while (i10 >= 0) {
            if (i10 == i11) {
                jRotateLeft = Long.rotateLeft(j10, i13);
            } else {
                int iV1 = v1(this.J, i10);
                if (iV1 == 126665345) {
                    jRotateLeft = Long.rotateLeft(iV1, i13);
                } else {
                    jRotateLeft2 = (jRotateLeft2 ^ Long.rotateLeft(iV1, i12)) ^ Long.rotateLeft(this.J.O(i10) ? 0 : L1(i10), i13);
                    i12 = (i12 + 6) % 64;
                    i13 = (i13 + 6) % 64;
                    i10 = this.J.X(i10);
                }
            }
            return jRotateLeft ^ jRotateLeft2;
        }
        return jRotateLeft2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object O1(i0 i0Var, l1 l1Var, l1 l1Var2, Integer num, List list, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l1Var = null;
        }
        if ((i10 & 2) != 0) {
            l1Var2 = null;
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            list = CollectionsKt.emptyList();
        }
        return i0Var.N1(l1Var, l1Var2, num, list, function0);
    }

    private final void P0() {
        if (!this.L.e0()) {
            m0.y("Check failed");
        }
        i1();
    }

    private final void P1() {
        boolean z10 = this.H;
        this.H = true;
        int iZ = this.J.z();
        int iM = this.J.M(iZ) + iZ;
        int i10 = this.f35829l;
        long jG = g();
        int i11 = this.f35830m;
        int i12 = this.f35831n;
        t2 t2VarI = m0.I(this.f35838u, this.J.m(), iM);
        boolean z11 = false;
        int i13 = iZ;
        while (t2VarI != null) {
            int iB = t2VarI.b();
            s4 s4VarC = t2VarI.c();
            m0.r0(this.f35838u, iB);
            if (t2VarI.d()) {
                this.J.Z(iB);
                int iM2 = this.J.m();
                T1(i13, iM2, iZ);
                this.f35829l = H1(iB, iM2, iZ, i10);
                this.f35831n = L1(iM2);
                this.X = O0(this.J.X(iM2), iZ, jG);
                this.N = null;
                s4VarC.e(this);
                this.N = null;
                this.J.a0(iZ);
                z11 = true;
                i13 = iM2;
            } else {
                m7.n(this.G, s4VarC);
                androidx.compose.runtime.tooling.o oVarA = this.f35825h.a();
                if (oVarA != null) {
                    try {
                        oVarA.a(s4VarC);
                        s4VarC.D();
                        oVarA.c(s4VarC);
                    } catch (Throwable th2) {
                        oVarA.c(s4VarC);
                        throw th2;
                    }
                } else {
                    s4VarC.D();
                }
                m7.m(this.G);
            }
            t2VarI = m0.I(this.f35838u, this.J.m(), iM);
        }
        if (z11) {
            T1(i13, iZ, iZ);
            this.J.d0();
            int iC2 = C2(iZ);
            this.f35829l = i10 + iC2;
            this.f35830m = i11 + iC2;
            this.f35831n = i12;
        } else {
            f2();
        }
        this.X = jG;
        this.H = z10;
    }

    private final e4 Q0() {
        e4 e4Var = this.N;
        return e4Var != null ? e4Var : R0(this.J.z());
    }

    private final void Q1() {
        W1(this.J.m());
        this.P.S();
    }

    private final e4 R0(int i10) {
        e4 e4VarN;
        if (P() && this.M) {
            int iK0 = this.L.k0();
            while (iK0 > 0) {
                if (this.L.r0(iK0) == 202 && Intrinsics.areEqual(this.L.s0(iK0), m0.L())) {
                    Object objP0 = this.L.p0(iK0);
                    Intrinsics.checkNotNull(objP0, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    e4 e4Var = (e4) objP0;
                    this.N = e4Var;
                    return e4Var;
                }
                iK0 = this.L.V0(iK0);
            }
        }
        if (this.J.C() > 0) {
            while (i10 > 0) {
                if (this.J.J(i10) == 202 && Intrinsics.areEqual(this.J.L(i10), m0.L())) {
                    androidx.collection.t1<e4> t1Var = this.f35841x;
                    if (t1Var == null || (e4VarN = t1Var.n(i10)) == null) {
                        Object objF = this.J.F(i10);
                        Intrinsics.checkNotNull(objF, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        e4VarN = (e4) objF;
                    }
                    this.N = e4VarN;
                    return e4VarN;
                }
                i10 = this.J.X(i10);
            }
        }
        e4 e4Var2 = this.f35840w;
        this.N = e4Var2;
        return e4Var2;
    }

    private final void R1(g gVar) {
        if (this.R.h()) {
            this.P.v(gVar, this.K);
        } else {
            this.P.w(gVar, this.K, this.R);
            this.R = new androidx.compose.runtime.changelist.c();
        }
    }

    private final List<androidx.compose.runtime.tooling.c> S0() {
        if (!this.E) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(androidx.compose.runtime.tooling.b.c(this.L, null, 0, null, 7, null));
        arrayList.addAll(androidx.compose.runtime.tooling.b.a(this.J));
        arrayList.addAll(J1());
        return arrayList;
    }

    private final void S1(e4 e4Var) {
        androidx.collection.t1<e4> t1Var = this.f35841x;
        if (t1Var == null) {
            t1Var = new androidx.collection.t1<>(0, 1, null);
            this.f35841x = t1Var;
        }
        t1Var.j0(this.J.m(), e4Var);
    }

    private final void T1(int i10, int i11, int i12) {
        v5 v5Var = this.J;
        int iN0 = m0.n0(v5Var, i10, i11, i12);
        while (i10 > 0 && i10 != iN0) {
            if (v5Var.R(i10)) {
                this.P.C();
            }
            i10 = v5Var.X(i10);
        }
        X0(i11, iN0);
    }

    private final g U1() {
        int i10;
        int i11;
        if (P()) {
            if (!m0.k0(this.L)) {
                return null;
            }
            int iH0 = this.L.h0() - 1;
            int iV0 = this.L.V0(iH0);
            while (true) {
                int i12 = iV0;
                i11 = iH0;
                iH0 = i12;
                if (iH0 == this.L.k0() || iH0 < 0) {
                    break;
                }
                iV0 = this.L.V0(iH0);
            }
            return this.L.C(i11);
        }
        if (!m0.j0(this.J)) {
            return null;
        }
        int iM = this.J.m() - 1;
        int iX = this.J.X(iM);
        while (true) {
            int i13 = iX;
            i10 = iM;
            iM = i13;
            if (iM == this.J.z() || iM < 0) {
                break;
            }
            iX = this.J.X(iM);
        }
        return this.J.a(i10);
    }

    private final void V0(androidx.collection.k2<Object, Object> k2Var, Function2<? super c0, ? super Integer, Unit> function2) {
        if (this.H) {
            m0.y("Reentrant composition is not supported");
        }
        androidx.compose.runtime.tooling.o oVarA = this.f35825h.a();
        androidx.compose.runtime.internal.b1 b1Var = androidx.compose.runtime.internal.b1.f35891a;
        Object objA = b1Var.a("Compose:recompose");
        try {
            this.D = Long.hashCode(androidx.compose.runtime.snapshots.b0.N().p());
            this.f35841x = null;
            s2(k2Var);
            this.f35829l = 0;
            this.H = true;
            if (oVarA != null) {
                oVarA.e(x());
            }
            try {
                p2();
                Object objE1 = E1();
                if (objE1 != function2 && function2 != null) {
                    B2(function2);
                }
                c cVar = this.F;
                androidx.compose.runtime.collection.d<r1> dVarC = w6.c();
                try {
                    dVarC.d(cVar);
                    if (function2 != null) {
                        m2(200, m0.P());
                        androidx.compose.runtime.internal.f0.a(this, function2);
                        Z0();
                    } else if ((!this.f35836s && !this.f35842y) || objE1 == null || Intrinsics.areEqual(objE1, c0.f35327a.a())) {
                        Q();
                    } else {
                        m2(200, m0.P());
                        androidx.compose.runtime.internal.f0.a(this, (Function2) kotlin.jvm.internal.r1.q(objE1, 2));
                        Z0();
                    }
                    dVarC.r0(dVarC.R() - 1);
                    b1();
                    if (oVarA != null) {
                        oVarA.g(x());
                    }
                    this.H = false;
                    this.f35838u.clear();
                    P0();
                    Unit unit = Unit.f312394a;
                    b1Var.b(objA);
                } catch (Throwable th2) {
                    dVarC.r0(dVarC.R() - 1);
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    throw androidx.compose.runtime.tooling.d.b(th3, new Function0() { // from class: androidx.compose.runtime.g0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return i0.W0(this.f35800a);
                        }
                    });
                } catch (Throwable th4) {
                    if (oVarA != null) {
                        oVarA.g(x());
                    }
                    this.H = false;
                    this.f35838u.clear();
                    D0();
                    P0();
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            androidx.compose.runtime.internal.b1.f35891a.b(objA);
            throw th5;
        }
    }

    private final void V1() {
        if (this.f35821d.s()) {
            x().w0();
            androidx.compose.runtime.changelist.a aVar = new androidx.compose.runtime.changelist.a();
            this.O = aVar;
            v5 v5VarY = this.f35821d.Y();
            try {
                this.J = v5VarY;
                androidx.compose.runtime.changelist.b bVar = this.P;
                androidx.compose.runtime.changelist.a aVarP = bVar.p();
                try {
                    bVar.W(aVar);
                    W1(0);
                    this.P.O();
                    bVar.W(aVarP);
                    Unit unit = Unit.f312394a;
                    v5VarY.e();
                } catch (Throwable th2) {
                    bVar.W(aVarP);
                    throw th2;
                }
            } catch (Throwable th3) {
                v5VarY.e();
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List W0(i0 i0Var) {
        return i0Var.S0();
    }

    private final void W1(int i10) {
        boolean zR = this.J.R(i10);
        if (zR) {
            this.P.i();
            this.P.y(this.J.T(i10));
        }
        a2(this, i10, i10, zR, 0);
        this.P.i();
        if (zR) {
            this.P.C();
        }
    }

    private final void X0(int i10, int i11) {
        if (i10 <= 0 || i10 == i11) {
            return;
        }
        X0(this.J.X(i10), i11);
        if (this.J.R(i10)) {
            this.P.y(G1(this.J, i10));
        }
    }

    private static final i3 X1(i0 i0Var, int i10, List<i3> list) {
        Object objL = i0Var.J.L(i10);
        Intrinsics.checkNotNull(objL, "null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
        e3 e3Var = (e3) objL;
        int i11 = 7 << 0;
        Object objI = i0Var.J.I(i10, 0);
        g gVarA = i0Var.J.a(i10);
        int iM = i0Var.J.M(i10) + i10;
        ArrayList arrayList = new ArrayList();
        List<t2> list2 = i0Var.f35838u;
        for (int iG = m0.G(list2, i10); iG < list2.size(); iG++) {
            t2 t2Var = list2.get(iG);
            if (t2Var.b() >= iM) {
                break;
            }
            arrayList.add(TuplesKt.to(t2Var.c(), t2Var.a()));
        }
        return new i3(e3Var, objI, i0Var.x(), i0Var.f35821d, gVarA, arrayList, i0Var.R0(i10), list);
    }

    private final void Y0(boolean z10) {
        long jRotateRight;
        long j10;
        int iB;
        List<w2> list;
        long jRotateRight2;
        long j11;
        int iH = this.f35832o.h() - 1;
        if (P()) {
            int iK0 = this.L.k0();
            int iR0 = this.L.r0(iK0);
            Object objS0 = this.L.s0(iK0);
            Object objP0 = this.L.p0(iK0);
            if (objS0 != null) {
                int iOrdinal = objS0 instanceof Enum ? ((Enum) objS0).ordinal() : objS0.hashCode();
                jRotateRight2 = Long.rotateRight(g() ^ ((long) 0), 3);
                j11 = iOrdinal;
            } else if (objP0 == null || iR0 != 207 || Intrinsics.areEqual(objP0, c0.f35327a.a())) {
                jRotateRight2 = Long.rotateRight(g() ^ ((long) iH), 3);
                j11 = iR0;
            } else {
                this.X = Long.rotateRight(((long) objP0.hashCode()) ^ Long.rotateRight(g() ^ ((long) iH), 3), 3);
            }
            this.X = Long.rotateRight(jRotateRight2 ^ j11, 3);
        } else {
            int iZ = this.J.z();
            int iJ = this.J.J(iZ);
            Object objL = this.J.L(iZ);
            Object objF = this.J.F(iZ);
            if (objL != null) {
                int iOrdinal2 = objL instanceof Enum ? ((Enum) objL).ordinal() : objL.hashCode();
                jRotateRight = Long.rotateRight(g() ^ ((long) 0), 3);
                j10 = iOrdinal2;
            } else if (objF == null || iJ != 207 || Intrinsics.areEqual(objF, c0.f35327a.a())) {
                jRotateRight = Long.rotateRight(g() ^ ((long) iH), 3);
                j10 = iJ;
            } else {
                this.X = Long.rotateRight(((long) objF.hashCode()) ^ Long.rotateRight(g() ^ ((long) iH), 3), 3);
            }
            this.X = Long.rotateRight(jRotateRight ^ j10, 3);
        }
        int i10 = this.f35830m;
        d4 d4Var = this.f35828k;
        if (d4Var != null && d4Var.b().size() > 0) {
            List<w2> listB = d4Var.b();
            List<w2> listF = d4Var.f();
            Set setN = androidx.compose.runtime.snapshots.d.n(listF);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = listF.size();
            int size2 = listB.size();
            int i11 = 0;
            int i12 = 0;
            int iO = 0;
            while (i11 < size2) {
                w2 w2Var = listB.get(i11);
                if (setN.contains(w2Var)) {
                    list = listB;
                    if (!linkedHashSet.contains(w2Var)) {
                        if (i12 < size) {
                            w2 w2Var2 = listF.get(i12);
                            if (w2Var2 != w2Var) {
                                int iG = d4Var.g(w2Var2);
                                linkedHashSet.add(w2Var2);
                                if (iG != iO) {
                                    int iO2 = d4Var.o(w2Var2);
                                    this.P.z(d4Var.e() + iG, iO + d4Var.e(), iO2);
                                    d4Var.j(iG, iO, iO2);
                                }
                            } else {
                                i11++;
                            }
                            i12++;
                            iO += d4Var.o(w2Var2);
                            listB = list;
                            listF = listF;
                        }
                    }
                    listB = list;
                } else {
                    this.P.T(d4Var.g(w2Var) + d4Var.e(), w2Var.d());
                    d4Var.n(w2Var.c(), 0);
                    this.P.A(w2Var.c());
                    this.J.Z(w2Var.c());
                    Q1();
                    this.J.c0();
                    list = listB;
                    m0.s0(this.f35838u, w2Var.c(), w2Var.c() + this.J.M(w2Var.c()));
                }
                i11++;
                listB = list;
            }
            this.P.i();
            if (listB.size() > 0) {
                this.P.A(this.J.o());
                this.J.d0();
            }
        }
        boolean zP = P();
        if (!zP && (iB = this.J.B()) > 0) {
            this.P.b0(iB);
        }
        int i13 = this.f35829l;
        while (!this.J.P()) {
            int iM = this.J.m();
            Q1();
            this.P.T(i13, this.J.c0());
            m0.s0(this.f35838u, iM, this.J.m());
        }
        if (zP) {
            if (z10) {
                this.R.e();
                i10 = 1;
            }
            this.J.g();
            int iK1 = this.L.k0();
            this.L.V();
            if (!this.J.x()) {
                int iZ1 = z1(iK1);
                this.L.W();
                this.L.M(true);
                R1(this.Q);
                this.W = false;
                if (!this.f35821d.isEmpty()) {
                    x2(iZ1, 0);
                    y2(iZ1, i10);
                }
            }
        } else {
            if (z10) {
                this.P.C();
            }
            this.P.g();
            int iZ2 = this.J.z();
            if (i10 != C2(iZ2)) {
                y2(iZ2, i10);
            }
            if (z10) {
                i10 = 1;
            }
            this.J.h();
            this.P.i();
        }
        f1(i10, zP);
    }

    private static final i3 Y1(i0 i0Var, int i10) {
        int iJ = i0Var.J.J(i10);
        Object objL = i0Var.J.L(i10);
        ArrayList arrayList = null;
        if (iJ != 126665345 || !(objL instanceof e3)) {
            return null;
        }
        if (i0Var.J.f(i10)) {
            ArrayList arrayList2 = new ArrayList();
            Z1(i0Var, arrayList2, i10);
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return X1(i0Var, i10, arrayList);
    }

    private final void Z0() {
        Y0(false);
    }

    private static final void Z1(i0 i0Var, List<i3> list, int i10) {
        int iM = i0Var.J.M(i10) + i10;
        int iM2 = i10 + 1;
        while (iM2 < iM) {
            if (i0Var.J.N(iM2)) {
                i3 i3VarY1 = Y1(i0Var, iM2);
                if (i3VarY1 != null) {
                    list.add(i3VarY1);
                }
            } else if (i0Var.J.f(iM2)) {
                Z1(i0Var, list, iM2);
            }
            iM2 += i0Var.J.M(iM2);
        }
    }

    private static final int a2(i0 i0Var, int i10, int i11, boolean z10, int i12) {
        v5 v5Var = i0Var.J;
        if (!v5Var.N(i11)) {
            if (!v5Var.f(i11)) {
                if (v5Var.R(i11)) {
                    return 1;
                }
                return v5Var.V(i11);
            }
            int iM = v5Var.M(i11) + i11;
            int iA2 = 0;
            for (int iM2 = i11 + 1; iM2 < iM; iM2 += v5Var.M(iM2)) {
                boolean zR = v5Var.R(iM2);
                if (zR) {
                    i0Var.P.i();
                    i0Var.P.y(v5Var.T(iM2));
                }
                iA2 += a2(i0Var, i10, iM2, zR || z10, zR ? 0 : i12 + iA2);
                if (zR) {
                    i0Var.P.i();
                    i0Var.P.C();
                }
            }
            if (v5Var.R(i11)) {
                return 1;
            }
            return iA2;
        }
        int iJ = v5Var.J(i11);
        Object objL = v5Var.L(i11);
        if (iJ == 126665345 && (objL instanceof e3)) {
            i3 i3VarY1 = Y1(i0Var, i11);
            if (i3VarY1 != null) {
                i0Var.f35820c.c(i3VarY1);
                i0Var.P.N();
                i0Var.P.P(i0Var.x(), i0Var.f35820c, i3VarY1);
            }
            if (!z10 || i11 == i10) {
                return v5Var.V(i11);
            }
            i0Var.P.j(i12, i11);
            return 0;
        }
        if (iJ != 206 || !Intrinsics.areEqual(objL, m0.e0())) {
            if (v5Var.R(i11)) {
                return 1;
            }
            return v5Var.V(i11);
        }
        Object objI = v5Var.I(i11, 0);
        a aVar = objI instanceof a ? (a) objI : null;
        if (aVar != null) {
            for (i0 i0Var2 : aVar.a().C()) {
                i0Var2.V1();
                i0Var.f35820c.x(i0Var2.x());
            }
        }
        return v5Var.V(i11);
    }

    @w
    public static /* synthetic */ void b() {
    }

    private final void b1() {
        Z0();
        this.f35820c.d();
        Z0();
        this.P.l();
        h1();
        this.J.e();
        this.f35836s = false;
        this.f35842y = m0.t(this.f35843z.j());
    }

    private final void c1() {
        if (this.L.e0()) {
            z5 z5VarA0 = this.K.a0();
            this.L = z5VarA0;
            z5VarA0.s1();
            this.M = false;
            this.N = null;
        }
    }

    @r2
    public static /* synthetic */ void d0() {
    }

    private final void d1(boolean z10, d4 d4Var) {
        m7.n(this.f35827j, this.f35828k);
        this.f35828k = d4Var;
        this.f35832o.k(this.f35830m);
        this.f35832o.k(this.f35831n);
        this.f35832o.k(this.f35829l);
        if (z10) {
            this.f35829l = 0;
        }
        this.f35830m = 0;
        this.f35831n = 0;
    }

    private final void e1(s4 s4Var) {
        s4Var.T(this.D);
        androidx.compose.runtime.tooling.o oVarA = this.f35825h.a();
        if (oVarA != null) {
            oVarA.a(s4Var);
        }
    }

    private final void e2() {
        this.f35830m += this.J.c0();
    }

    private final void f1(int i10, boolean z10) {
        d4 d4Var = (d4) m7.m(this.f35827j);
        if (d4Var != null && !z10) {
            d4Var.l(d4Var.a() + 1);
        }
        this.f35828k = d4Var;
        this.f35829l = this.f35832o.j() + i10;
        this.f35831n = this.f35832o.j();
        this.f35830m = this.f35832o.j() + i10;
    }

    private final void f2() {
        this.f35830m = this.J.A();
        this.J.d0();
    }

    private final Function1<o0, Unit> g1(s4 s4Var) {
        androidx.compose.runtime.tooling.o oVarA = this.f35825h.a();
        if (oVarA != null) {
            oVarA.c(s4Var);
        }
        return s4Var.f(this.D);
    }

    private final List<androidx.compose.runtime.tooling.c> g2(int i10, Integer num) {
        if (!this.E) {
            return CollectionsKt.emptyList();
        }
        v5 v5VarY = this.f35821d.Y();
        try {
            List<androidx.compose.runtime.tooling.c> listG = androidx.compose.runtime.tooling.b.g(v5VarY, i10, num);
            v5VarY.e();
            return listG;
        } catch (Throwable th2) {
            v5VarY.e();
            throw th2;
        }
    }

    private final void h1() {
        this.P.o();
        if (!m7.i(this.f35827j)) {
            m0.y("Start/end imbalance");
        }
        L0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h2(Object obj, Object obj2) {
        if (obj2 != obj) {
            n5 n5Var = obj2 instanceof n5 ? (n5) obj2 : null;
            if ((n5Var != null ? n5Var.b() : null) != obj) {
                return false;
            }
        }
        return true;
    }

    private final void i1() {
        w5 w5Var = new w5();
        if (this.E) {
            w5Var.p();
        }
        if (this.f35820c.e()) {
            w5Var.n();
        }
        this.K = w5Var;
        z5 z5VarA0 = w5Var.a0();
        z5VarA0.M(true);
        this.L = z5VarA0;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0088  */
    /* JADX WARN: Code duplicated, block: B:23:0x0095  */
    /* JADX WARN: Code duplicated, block: B:24:0x0099  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00af  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00be  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:44:0x0105  */
    /* JADX WARN: Code duplicated, block: B:50:0x0115  */
    /* JADX WARN: Code duplicated, block: B:53:0x011b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0139  */
    /* JADX WARN: Code duplicated, block: B:62:0x014d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0198  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:72:0x01bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:83:0x020e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0210  */
    private final void k2(int i10, Object obj, int i11, Object obj2) {
        long jRotateLeft;
        k2.a aVar;
        boolean z10;
        d4 d4Var;
        boolean z11;
        d4 d4Var2;
        int iH0;
        d4 d4Var3;
        E2();
        int i12 = this.f35831n;
        int i13 = 0;
        if (obj == null) {
            if (obj2 == null || i10 != 207 || Intrinsics.areEqual(obj2, c0.f35327a.a())) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(g(), 3) ^ ((long) i10), 3) ^ ((long) i12);
            } else {
                this.X = Long.rotateLeft(Long.rotateLeft(g(), 3) ^ ((long) obj2.hashCode()), 3) ^ ((long) i12);
            }
            if (obj == null) {
                this.f35831n++;
            }
            aVar = k2.f36180b;
            if (i11 != aVar.a()) {
                z10 = true;
            } else {
                z10 = false;
            }
            d4Var = null;
            if (P()) {
                this.J.d();
                iH0 = this.L.h0();
                if (z10) {
                    this.L.H1(i10, c0.f35327a.a());
                } else if (obj2 != null) {
                    z5 z5Var = this.L;
                    if (obj == null) {
                        obj = c0.f35327a.a();
                    }
                    z5Var.C1(i10, obj, obj2);
                } else {
                    z5 z5Var2 = this.L;
                    if (obj == null) {
                        obj = c0.f35327a.a();
                    }
                    z5Var2.F1(i10, obj);
                }
                d4Var3 = this.f35828k;
                if (d4Var3 != null) {
                    w2 w2Var = new w2(i10, -1, z1(iH0), -1, 0);
                    d4Var3.i(w2Var, this.f35829l - d4Var3.e());
                    d4Var3.h(w2Var);
                }
                d1(z10, null);
                return;
            }
            if (i11 != aVar.b() && this.A) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f35828k == null) {
                int iP = this.J.p();
                if (z11 && iP == i10 && Intrinsics.areEqual(obj, this.J.r())) {
                    n2(z10, obj2);
                } else {
                    this.f35828k = new d4(this.J.i(), this.f35829l);
                }
            }
            d4Var2 = this.f35828k;
            if (d4Var2 != null) {
                w2 w2VarD = d4Var2.d(i10, obj);
                if (!z11 || w2VarD == null) {
                    this.J.d();
                    this.W = true;
                    this.N = null;
                    c1();
                    this.L.I();
                    int iH1 = this.L.h0();
                    if (z10) {
                        this.L.H1(i10, c0.f35327a.a());
                    } else if (obj2 != null) {
                        z5 z5Var3 = this.L;
                        if (obj == null) {
                            obj = c0.f35327a.a();
                        }
                        z5Var3.C1(i10, obj, obj2);
                    } else {
                        z5 z5Var4 = this.L;
                        if (obj == null) {
                            obj = c0.f35327a.a();
                        }
                        z5Var4.F1(i10, obj);
                    }
                    this.Q = this.L.C(iH1);
                    w2 w2Var2 = new w2(i10, -1, z1(iH1), -1, 0);
                    d4Var2.i(w2Var2, this.f35829l - d4Var2.e());
                    d4Var2.h(w2Var2);
                    ArrayList arrayList = new ArrayList();
                    if (!z10) {
                        i13 = this.f35829l;
                    }
                    d4Var = new d4(arrayList, i13);
                } else {
                    d4Var2.h(w2VarD);
                    int iC = w2VarD.c();
                    this.f35829l = d4Var2.g(w2VarD) + d4Var2.e();
                    int iM = d4Var2.m(w2VarD);
                    int iA = iM - d4Var2.a();
                    d4Var2.k(iM, d4Var2.a());
                    this.P.A(iC);
                    this.J.Z(iC);
                    if (iA > 0) {
                        this.P.x(iA);
                    }
                    n2(z10, obj2);
                }
            }
            d1(z10, d4Var);
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(g(), 3) ^ ((long) (obj instanceof Enum ? ((Enum) obj).ordinal() : obj.hashCode())), 3) ^ ((long) 0);
        this.X = jRotateLeft;
        if (obj == null) {
            this.f35831n++;
        }
        aVar = k2.f36180b;
        if (i11 != aVar.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        d4Var = null;
        if (P()) {
            this.J.d();
            iH0 = this.L.h0();
            if (z10) {
                this.L.H1(i10, c0.f35327a.a());
            } else if (obj2 != null) {
                z5 z5Var5 = this.L;
                if (obj == null) {
                    obj = c0.f35327a.a();
                }
                z5Var5.C1(i10, obj, obj2);
            } else {
                z5 z5Var6 = this.L;
                if (obj == null) {
                    obj = c0.f35327a.a();
                }
                z5Var6.F1(i10, obj);
            }
            d4Var3 = this.f35828k;
            if (d4Var3 != null) {
                w2 w2Var3 = new w2(i10, -1, z1(iH0), -1, 0);
                d4Var3.i(w2Var3, this.f35829l - d4Var3.e());
                d4Var3.h(w2Var3);
            }
            d1(z10, null);
            return;
        }
        if (i11 != aVar.b()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (this.f35828k == null) {
            int iP2 = this.J.p();
            if (z11) {
                this.f35828k = new d4(this.J.i(), this.f35829l);
            } else {
                this.f35828k = new d4(this.J.i(), this.f35829l);
            }
        }
        d4Var2 = this.f35828k;
        if (d4Var2 != null) {
            w2 w2VarD2 = d4Var2.d(i10, obj);
            if (z11) {
                this.J.d();
                this.W = true;
                this.N = null;
                c1();
                this.L.I();
                int iH2 = this.L.h0();
                if (z10) {
                    this.L.H1(i10, c0.f35327a.a());
                } else if (obj2 != null) {
                    z5 z5Var7 = this.L;
                    if (obj == null) {
                        obj = c0.f35327a.a();
                    }
                    z5Var7.C1(i10, obj, obj2);
                } else {
                    z5 z5Var8 = this.L;
                    if (obj == null) {
                        obj = c0.f35327a.a();
                    }
                    z5Var8.F1(i10, obj);
                }
                this.Q = this.L.C(iH2);
                w2 w2Var4 = new w2(i10, -1, z1(iH2), -1, 0);
                d4Var2.i(w2Var4, this.f35829l - d4Var2.e());
                d4Var2.h(w2Var4);
                ArrayList arrayList2 = new ArrayList();
                if (!z10) {
                    i13 = this.f35829l;
                }
                d4Var = new d4(arrayList2, i13);
            } else {
                this.J.d();
                this.W = true;
                this.N = null;
                c1();
                this.L.I();
                int iH3 = this.L.h0();
                if (z10) {
                    this.L.H1(i10, c0.f35327a.a());
                } else if (obj2 != null) {
                    z5 z5Var9 = this.L;
                    if (obj == null) {
                        obj = c0.f35327a.a();
                    }
                    z5Var9.C1(i10, obj, obj2);
                } else {
                    z5 z5Var10 = this.L;
                    if (obj == null) {
                        obj = c0.f35327a.a();
                    }
                    z5Var10.F1(i10, obj);
                }
                this.Q = this.L.C(iH3);
                w2 w2Var5 = new w2(i10, -1, z1(iH3), -1, 0);
                d4Var2.i(w2Var5, this.f35829l - d4Var2.e());
                d4Var2.h(w2Var5);
                ArrayList arrayList3 = new ArrayList();
                if (!z10) {
                    i13 = this.f35829l;
                }
                d4Var = new d4(arrayList3, i13);
            }
        }
        d1(z10, d4Var);
    }

    private final void l2(int i10) {
        k2(i10, null, k2.f36180b.a(), null);
    }

    private final void m2(int i10, Object obj) {
        k2(i10, obj, k2.f36180b.a(), null);
    }

    private final void n2(boolean z10, Object obj) {
        if (z10) {
            this.J.g0();
            return;
        }
        if (obj != null && this.J.n() != obj) {
            this.P.d0(obj);
        }
        this.J.f0();
    }

    private final void p2() {
        this.f35831n = 0;
        this.J = this.f35821d.Y();
        l2(100);
        this.f35820c.y();
        e4 e4VarJ = this.f35820c.j();
        this.f35843z.k(m0.u(this.f35842y));
        this.f35842y = D(e4VarJ);
        this.N = null;
        if (!this.f35835r) {
            this.f35835r = this.f35820c.f();
        }
        if (!this.E) {
            this.E = this.f35820c.g();
        }
        if (this.E) {
            u0<androidx.compose.runtime.tooling.h> u0VarC = androidx.compose.runtime.tooling.l.c();
            Intrinsics.checkNotNull(u0VarC, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
            e4VarJ = e4VarJ.b2(u0VarC, new p7(p1()));
        }
        this.f35840w = e4VarJ;
        Set<androidx.compose.runtime.tooling.f> set = (Set) c1.c(e4VarJ, androidx.compose.runtime.tooling.u.c());
        if (set != null) {
            set.add(j0());
            this.f35820c.t(set);
        }
        l2(Long.hashCode(this.f35820c.h()));
    }

    @w
    public static /* synthetic */ void t0() {
    }

    private final Object t1(v5 v5Var) {
        return v5Var.T(v5Var.z());
    }

    private final void t2(int i10, int i11, Object obj, Object obj2) {
        if (obj != null) {
            if (obj instanceof Enum) {
                this.X = ((long) 0) ^ Long.rotateLeft(Long.rotateLeft(g(), 3) ^ ((long) ((Enum) obj).ordinal()), 3);
                return;
            } else {
                this.X = ((long) 0) ^ Long.rotateLeft(Long.rotateLeft(g(), 3) ^ ((long) obj.hashCode()), 3);
                return;
            }
        }
        if (obj2 == null || i10 != 207 || Intrinsics.areEqual(obj2, c0.f35327a.a())) {
            this.X = ((long) i11) ^ Long.rotateLeft(Long.rotateLeft(g(), 3) ^ ((long) i10), 3);
        } else {
            this.X = ((long) i11) ^ Long.rotateLeft(Long.rotateLeft(g(), 3) ^ ((long) obj2.hashCode()), 3);
        }
    }

    private final void u2(int i10, int i11) {
        this.X = ((long) i11) ^ Long.rotateLeft(Long.rotateLeft(g(), 3) ^ ((long) i10), 3);
    }

    @w
    public static /* synthetic */ void v() {
    }

    private final int v1(v5 v5Var, int i10) {
        Object objF;
        if (v5Var.O(i10)) {
            Object objL = v5Var.L(i10);
            if (objL == null) {
                return 0;
            }
            if (objL instanceof Enum) {
                return ((Enum) objL).ordinal();
            }
            return objL instanceof e3 ? f3.f35774a : objL.hashCode();
        }
        int iJ = v5Var.J(i10);
        if (iJ == 207 && (objF = v5Var.F(i10)) != null && !Intrinsics.areEqual(objF, c0.f35327a.a())) {
            return objF.hashCode();
        }
        return iJ;
    }

    private final void v2(int i10, int i11, Object obj, Object obj2) {
        if (obj != null) {
            if (obj instanceof Enum) {
                this.X = Long.rotateRight(Long.rotateRight(g() ^ ((long) 0), 3) ^ ((long) ((Enum) obj).ordinal()), 3);
                return;
            } else {
                this.X = Long.rotateRight(Long.rotateRight(g() ^ ((long) 0), 3) ^ ((long) obj.hashCode()), 3);
                return;
            }
        }
        if (obj2 == null || i10 != 207 || Intrinsics.areEqual(obj2, c0.f35327a.a())) {
            this.X = Long.rotateRight(Long.rotateRight(g() ^ ((long) i11), 3) ^ ((long) i10), 3);
        } else {
            this.X = Long.rotateRight(Long.rotateRight(g() ^ ((long) i11), 3) ^ ((long) obj2.hashCode()), 3);
        }
    }

    private final void w1(List<Pair<i3, i3>> list) throws Throwable {
        androidx.compose.runtime.changelist.b bVar;
        androidx.compose.runtime.changelist.a aVar;
        w5 w5VarH;
        g gVarA;
        v5 v5Var;
        androidx.compose.runtime.changelist.b bVar2;
        androidx.compose.runtime.changelist.a aVar2;
        w5 w5VarF;
        List<Pair<i3, i3>> list2 = list;
        androidx.compose.runtime.changelist.b bVar3 = this.P;
        androidx.compose.runtime.changelist.a aVar3 = this.f35824g;
        androidx.compose.runtime.changelist.a aVarP = bVar3.p();
        try {
            bVar3.W(aVar3);
            this.P.U();
            int size = list2.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                try {
                    Pair<i3, i3> pair = list2.get(i11);
                    final i3 i3VarComponent1 = pair.component1();
                    i3 i3VarComponent2 = pair.component2();
                    g gVarA2 = i3VarComponent1.a();
                    int iK = i3VarComponent1.h().k(gVarA2);
                    androidx.compose.runtime.internal.j0 j0Var = new androidx.compose.runtime.internal.j0(i10, 1, null);
                    this.P.e(j0Var, gVarA2);
                    if (i3VarComponent2 == null) {
                        if (Intrinsics.areEqual(i3VarComponent1.h(), this.K)) {
                            P0();
                        }
                        final v5 v5VarY = i3VarComponent1.h().Y();
                        try {
                            v5VarY.Z(iK);
                            this.P.B(iK);
                            final androidx.compose.runtime.changelist.a aVar4 = new androidx.compose.runtime.changelist.a();
                            O1(this, null, null, null, null, new Function0() { // from class: androidx.compose.runtime.e0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return i0.x1(this.f35590a, aVar4, v5VarY, i3VarComponent1);
                                }
                            }, 15, null);
                            this.P.t(aVar4, j0Var);
                            Unit unit = Unit.f312394a;
                            v5VarY.e();
                        } catch (Throwable th2) {
                            v5VarY.e();
                            throw th2;
                        }
                    } else {
                        h3 h3VarR = this.f35820c.r(i3VarComponent2);
                        if (h3VarR == null || (w5VarH = h3VarR.f()) == null) {
                            w5VarH = i3VarComponent2.h();
                        }
                        if (h3VarR == null || (w5VarF = h3VarR.f()) == null || (gVarA = w5VarF.d(0)) == null) {
                            gVarA = i3VarComponent2.a();
                        }
                        List<? extends Object> listW = m0.w(w5VarH, gVarA);
                        if (!listW.isEmpty()) {
                            this.P.b(listW, j0Var);
                            if (Intrinsics.areEqual(i3VarComponent1.h(), this.f35821d)) {
                                int iK2 = this.f35821d.k(gVarA2);
                                x2(iK2, C2(iK2) + listW.size());
                            }
                        }
                        this.P.c(h3VarR, this.f35820c, i3VarComponent2, i3VarComponent1);
                        v5 v5VarY2 = w5VarH.Y();
                        try {
                            v5 v5Var2 = this.J;
                            int[] iArr = this.f35833p;
                            androidx.collection.t1<e4> t1Var = this.f35841x;
                            this.f35833p = null;
                            this.f35841x = null;
                            try {
                                this.J = v5VarY2;
                                int iK3 = w5VarH.k(gVarA);
                                v5VarY2.Z(iK3);
                                this.P.B(iK3);
                                androidx.compose.runtime.changelist.a aVar5 = new androidx.compose.runtime.changelist.a();
                                androidx.compose.runtime.changelist.b bVar4 = this.P;
                                androidx.compose.runtime.changelist.a aVarP2 = bVar4.p();
                                try {
                                    bVar4.W(aVar5);
                                    v5Var = v5VarY2;
                                    try {
                                        androidx.compose.runtime.changelist.b bVar5 = this.P;
                                        boolean zQ = bVar5.q();
                                        try {
                                            bVar5.X(false);
                                            i3VarComponent2.j();
                                            try {
                                                t1Var = t1Var;
                                                bVar2 = bVar4;
                                                aVar2 = aVarP2;
                                                try {
                                                    N1(i3VarComponent2.b(), i3VarComponent1.b(), Integer.valueOf(v5Var.m()), i3VarComponent2.d(), new Function0() { // from class: androidx.compose.runtime.f0
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            return i0.y1(this.f35768a, i3VarComponent1);
                                                        }
                                                    });
                                                    try {
                                                        bVar5.X(zQ);
                                                        try {
                                                            bVar2.W(aVar2);
                                                            this.P.t(aVar5, j0Var);
                                                            Unit unit2 = Unit.f312394a;
                                                            try {
                                                                this.J = v5Var2;
                                                                this.f35833p = iArr;
                                                                this.f35841x = t1Var;
                                                                v5Var.e();
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                v5Var.e();
                                                                throw th;
                                                            }
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            this.J = v5Var2;
                                                            this.f35833p = iArr;
                                                            this.f35841x = t1Var;
                                                            throw th;
                                                        }
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        bVar2.W(aVar2);
                                                        throw th;
                                                    }
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    bVar5.X(zQ);
                                                    throw th;
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                t1Var = t1Var;
                                                aVar2 = aVarP2;
                                                bVar2 = bVar4;
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            t1Var = t1Var;
                                            bVar2 = bVar4;
                                            aVar2 = aVarP2;
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        bVar2 = bVar4;
                                        aVar2 = aVarP2;
                                        bVar2.W(aVar2);
                                        throw th;
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                    v5Var = v5VarY2;
                                }
                            } catch (Throwable th11) {
                                th = th11;
                                t1Var = t1Var;
                                v5Var = v5VarY2;
                            }
                        } catch (Throwable th12) {
                            th = th12;
                            v5Var = v5VarY2;
                        }
                    }
                    try {
                        this.P.Z();
                        i11++;
                        list2 = list;
                        size = size;
                        bVar3 = bVar3;
                        aVarP = aVarP;
                        i10 = 0;
                    } catch (Throwable th13) {
                        th = th13;
                        bVar = bVar3;
                        aVar = aVarP;
                        bVar.W(aVar);
                        throw th;
                    }
                } catch (Throwable th14) {
                    th = th14;
                    bVar3 = bVar3;
                    aVarP = aVarP;
                }
            }
            androidx.compose.runtime.changelist.b bVar6 = bVar3;
            androidx.compose.runtime.changelist.a aVar6 = aVarP;
            this.P.h();
            this.P.B(0);
            bVar6.W(aVar6);
        } catch (Throwable th15) {
            th = th15;
            bVar = bVar3;
            aVar = aVarP;
            bVar.W(aVar);
            throw th;
        }
    }

    private final void w2(int i10, int i11) {
        this.X = Long.rotateRight(Long.rotateRight(g() ^ ((long) i11), 3) ^ ((long) i10), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x1(i0 i0Var, androidx.compose.runtime.changelist.a aVar, v5 v5Var, i3 i3Var) {
        androidx.compose.runtime.changelist.b bVar = i0Var.P;
        androidx.compose.runtime.changelist.a aVarP = bVar.p();
        try {
            bVar.W(aVar);
            v5 v5Var2 = i0Var.J;
            int[] iArr = i0Var.f35833p;
            androidx.collection.t1<e4> t1Var = i0Var.f35841x;
            i0Var.f35833p = null;
            i0Var.f35841x = null;
            try {
                i0Var.J = v5Var;
                androidx.compose.runtime.changelist.b bVar2 = i0Var.P;
                boolean zQ = bVar2.q();
                try {
                    bVar2.X(false);
                    i0Var.A1(i3Var.c(), i3Var.e(), i3Var.g(), true);
                    bVar2.X(zQ);
                    Unit unit = Unit.f312394a;
                    i0Var.J = v5Var2;
                    i0Var.f35833p = iArr;
                    i0Var.f35841x = t1Var;
                    bVar.W(aVarP);
                    return unit;
                } catch (Throwable th2) {
                    bVar2.X(zQ);
                    throw th2;
                }
            } catch (Throwable th3) {
                i0Var.J = v5Var2;
                i0Var.f35833p = iArr;
                i0Var.f35841x = t1Var;
                throw th3;
            }
        } catch (Throwable th4) {
            bVar.W(aVarP);
            throw th4;
        }
    }

    private final void x2(int i10, int i11) {
        if (C2(i10) != i11) {
            if (i10 < 0) {
                androidx.collection.q1 q1Var = this.f35834q;
                if (q1Var == null) {
                    q1Var = new androidx.collection.q1(0, 1, null);
                    this.f35834q = q1Var;
                }
                q1Var.k0(i10, i11);
                return;
            }
            int[] iArr = this.f35833p;
            if (iArr == null) {
                int[] iArr2 = new int[this.J.C()];
                ArraysKt.fill$default(iArr2, -1, 0, 0, 6, (Object) null);
                this.f35833p = iArr2;
                iArr = iArr2;
            }
            iArr[i10] = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y1(i0 i0Var, i3 i3Var) {
        i0Var.A1(i3Var.c(), i3Var.e(), i3Var.g(), true);
        return Unit.f312394a;
    }

    private final void y2(int i10, int i11) {
        int iC2 = C2(i10);
        if (iC2 != i11) {
            int i12 = i11 - iC2;
            int iG = m7.g(this.f35827j) - 1;
            while (i10 != -1) {
                int iC3 = C2(i10) + i12;
                x2(i10, iC3);
                for (int i13 = iG; -1 < i13; i13--) {
                    d4 d4Var = (d4) m7.l(this.f35827j, i13);
                    if (d4Var != null && d4Var.n(i10, iC3)) {
                        iG = i13 - 1;
                        break;
                    }
                }
                if (i10 < 0) {
                    i10 = this.J.z();
                } else if (this.J.R(i10)) {
                    break;
                } else {
                    i10 = this.J.X(i10);
                }
            }
        }
    }

    private final int z1(int i10) {
        return (-2) - i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.compose.runtime.e4, java.lang.Object] */
    private final e4 z2(e4 e4Var, e4 e4Var2) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.h.a<u0<Object>, z7<Object>> aVarC = e4Var.c();
        aVarC.putAll(e4Var2);
        ?? Build2 = aVarC.build2();
        m2(204, m0.Y());
        A2(Build2);
        A2(e4Var2);
        Z0();
        return Build2;
    }

    @Override // androidx.compose.runtime.c0
    @w
    public void A() {
        Z0();
    }

    @Override // androidx.compose.runtime.c0
    @NotNull
    public p0 B() {
        i0 i0Var;
        m2(206, m0.e0());
        if (P()) {
            z5.I0(this.L, 0, 1, null);
        }
        Object objE1 = E1();
        a aVar = objE1 instanceof a ? (a) objE1 : null;
        if (aVar == null) {
            long jG = g();
            boolean z10 = this.f35835r;
            boolean z11 = this.E;
            s0 s0VarX = x();
            if (s0VarX == null) {
                s0VarX = null;
            }
            d1 d1VarI = s0VarX != null ? s0VarX.I() : null;
            i0Var = this;
            aVar = new a(i0Var.new b(jG, z10, z11, d1VarI));
            i0Var.B2(aVar);
        } else {
            i0Var = this;
        }
        aVar.a().I(i0Var.Q0());
        i0Var.Z0();
        return aVar.a();
    }

    @kotlin.a1
    public final void B2(@Nullable Object obj) {
        if (P()) {
            this.L.N1(obj);
            return;
        }
        if (!this.J.v()) {
            androidx.compose.runtime.changelist.b bVar = this.P;
            v5 v5Var = this.J;
            bVar.a(v5Var.a(v5Var.z()), obj);
            return;
        }
        int iU = this.J.u() - 1;
        if (!this.P.r()) {
            this.P.f0(obj, iU);
            return;
        }
        androidx.compose.runtime.changelist.b bVar2 = this.P;
        v5 v5Var2 = this.J;
        bVar2.c0(obj, v5Var2.a(v5Var2.z()), iU);
    }

    @Override // androidx.compose.runtime.c0
    @w
    public void C() {
        if (P() && this.E) {
            this.L.d1();
        }
    }

    public final boolean C1() {
        return this.H;
    }

    @Override // androidx.compose.runtime.c0
    @w
    public boolean D(@Nullable Object obj) {
        if (Intrinsics.areEqual(E1(), obj)) {
            return false;
        }
        B2(obj);
        return true;
    }

    public final boolean D1() {
        return this.I;
    }

    @Override // androidx.compose.runtime.c0
    @w
    public void E(int i10) {
        if (this.f35828k != null) {
            k2(i10, null, k2.f36180b.a(), null);
            return;
        }
        E2();
        this.X = Long.rotateLeft(Long.rotateLeft(g(), 3) ^ ((long) i10), 3) ^ ((long) this.f35831n);
        this.f35831n++;
        v5 v5Var = this.J;
        if (P()) {
            v5Var.d();
            this.L.F1(i10, c0.f35327a.a());
            d1(false, null);
            return;
        }
        if (v5Var.p() == i10 && !v5Var.w()) {
            v5Var.f0();
            d1(false, null);
            return;
        }
        if (!v5Var.P()) {
            int i11 = this.f35829l;
            int iM = v5Var.m();
            Q1();
            this.P.T(i11, v5Var.c0());
            m0.s0(this.f35838u, iM, v5Var.m());
        }
        v5Var.d();
        this.W = true;
        this.N = null;
        c1();
        z5 z5Var = this.L;
        z5Var.I();
        int iH0 = z5Var.h0();
        z5Var.F1(i10, c0.f35327a.a());
        this.Q = z5Var.C(iH0);
        d1(false, null);
    }

    @kotlin.a1
    @Nullable
    public final Object E1() {
        if (P()) {
            E2();
            return c0.f35327a.a();
        }
        Object objS = this.J.S();
        return (!this.A || (objS instanceof q5)) ? objS : c0.f35327a.a();
    }

    @Override // androidx.compose.runtime.c0
    @r2
    public void F(@NotNull n4<?>[] n4VarArr) {
        e4 e4VarZ2;
        e4 e4VarQ0 = Q0();
        m2(201, m0.V());
        boolean z10 = true;
        boolean z11 = false;
        if (P()) {
            e4VarZ2 = z2(e4VarQ0, c1.e(n4VarArr, e4VarQ0, null, 4, null));
            this.M = true;
        } else {
            Object objH = this.J.H(0);
            Intrinsics.checkNotNull(objH, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            e4 e4Var = (e4) objH;
            Object objH2 = this.J.H(1);
            Intrinsics.checkNotNull(objH2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            e4 e4Var2 = (e4) objH2;
            e4 e4VarD = c1.d(n4VarArr, e4VarQ0, e4Var2);
            if (d() && !this.A && Intrinsics.areEqual(e4Var2, e4VarD)) {
                e2();
                e4VarZ2 = e4Var;
            } else {
                e4VarZ2 = z2(e4VarQ0, e4VarD);
                if (!this.A && Intrinsics.areEqual(e4VarZ2, e4Var)) {
                    z10 = false;
                }
                z11 = z10;
            }
        }
        if (z11 && !P()) {
            S1(e4VarZ2);
        }
        this.f35843z.k(m0.u(this.f35842y));
        this.f35842y = z11;
        this.N = e4VarZ2;
        k2(202, m0.L(), k2.f36180b.a(), e4VarZ2);
    }

    @kotlin.a1
    @Nullable
    public final Object F1() {
        if (P()) {
            E2();
            return c0.f35327a.a();
        }
        Object objS = this.J.S();
        if (!this.A || (objS instanceof q5)) {
            return objS instanceof n5 ? ((n5) objS).b() : objS;
        }
        return c0.f35327a.a();
    }

    public final void F2() {
        this.K.z0();
    }

    @Override // androidx.compose.runtime.c0
    @w
    public boolean G(boolean z10) {
        Object objE1 = E1();
        if ((objE1 instanceof Boolean) && z10 == ((Boolean) objE1).booleanValue()) {
            return false;
        }
        B2(Boolean.valueOf(z10));
        return true;
    }

    @Override // androidx.compose.runtime.c0
    @w
    public boolean H(short s10) {
        Object objE1 = E1();
        if ((objE1 instanceof Short) && s10 == ((Number) objE1).shortValue()) {
            return false;
        }
        B2(Short.valueOf(s10));
        return true;
    }

    @Override // androidx.compose.runtime.c0
    @w
    public boolean I(float f10) {
        Object objE1 = E1();
        if ((objE1 instanceof Float) && f10 == ((Number) objE1).floatValue()) {
            return false;
        }
        B2(Float.valueOf(f10));
        return true;
    }

    @lm.n
    public final int I1() {
        if (P()) {
            z5 z5Var = this.L;
            return z5Var.r0(z5Var.k0());
        }
        v5 v5Var = this.J;
        return v5Var.J(v5Var.z());
    }

    @Override // androidx.compose.runtime.c0
    public void J() {
        this.A = this.B >= 0;
    }

    @w
    public final <T> T J0(boolean z10, @NotNull Function0<? extends T> function0) {
        T t10 = (T) F1();
        if (t10 != c0.f35327a.a() && !z10) {
            return t10;
        }
        T tInvoke = function0.invoke();
        r2(tInvoke);
        return tInvoke;
    }

    @NotNull
    public final List<androidx.compose.runtime.tooling.c> J1() {
        Integer numE;
        o0 o0VarI = this.f35820c.i();
        s0 s0Var = o0VarI instanceof s0 ? (s0) o0VarI : null;
        if (s0Var != null && (numE = androidx.compose.runtime.tooling.b.e(s0Var.f0(), this.f35820c)) != null) {
            v5 v5VarY = s0Var.f0().Y();
            try {
                List<androidx.compose.runtime.tooling.c> listG = androidx.compose.runtime.tooling.b.g(v5VarY, numE.intValue(), 0);
                v5VarY.e();
                return listG;
            } catch (Throwable th2) {
                v5VarY.e();
                throw th2;
            }
        }
        return CollectionsKt.emptyList();
    }

    @Override // androidx.compose.runtime.c0
    @w
    public boolean K(int i10) {
        Object objE1 = E1();
        if ((objE1 instanceof Integer) && i10 == ((Number) objE1).intValue()) {
            return false;
        }
        B2(Integer.valueOf(i10));
        return true;
    }

    public final void K0() {
        this.f35841x = null;
    }

    public final void K1(@NotNull Function0<Unit> function0) {
        if (this.H) {
            m0.y("Preparing a composition while composing is not supported");
        }
        this.H = true;
        try {
            function0.invoke();
        } finally {
            this.H = false;
        }
    }

    @Override // androidx.compose.runtime.c0
    @w
    public boolean L(long j10) {
        Object objE1 = E1();
        if ((objE1 instanceof Long) && j10 == ((Number) objE1).longValue()) {
            return false;
        }
        B2(Long.valueOf(j10));
        return true;
    }

    @Override // androidx.compose.runtime.c0
    @w
    public boolean M(byte b10) {
        Object objE1 = E1();
        if ((objE1 instanceof Byte) && b10 == ((Number) objE1).byteValue()) {
            int i10 = 3 ^ 0;
            return false;
        }
        B2(Byte.valueOf(b10));
        return true;
    }

    public final boolean M1(@NotNull androidx.collection.k2<Object, Object> k2Var, @Nullable t5 t5Var) {
        if (!this.f35823f.f()) {
            m0.y("Expected applyChanges() to have been called");
        }
        if (androidx.compose.runtime.collection.h.m(k2Var) <= 0 && this.f35838u.isEmpty() && !this.f35836s) {
            return false;
        }
        this.T = t5Var;
        try {
            V0(k2Var, null);
            this.T = null;
            return this.f35823f.g();
        } catch (Throwable th2) {
            this.T = null;
            throw th2;
        }
    }

    @Override // androidx.compose.runtime.c0
    @w
    public boolean N(char c10) {
        Object objE1 = E1();
        if ((objE1 instanceof Character) && c10 == ((Character) objE1).charValue()) {
            return false;
        }
        B2(Character.valueOf(c10));
        return true;
    }

    public final void N0(@NotNull androidx.collection.k2<Object, Object> k2Var, @NotNull Function2<? super c0, ? super Integer, Unit> function2, @Nullable t5 t5Var) {
        if (!this.f35823f.f()) {
            m0.y("Expected applyChanges() to have been called");
        }
        this.T = t5Var;
        try {
            V0(k2Var, function2);
            this.T = null;
        } catch (Throwable th2) {
            this.T = null;
            throw th2;
        }
    }

    @Override // androidx.compose.runtime.c0
    @w
    public boolean O(double d10) {
        Object objE1 = E1();
        if ((objE1 instanceof Double) && d10 == ((Number) objE1).doubleValue()) {
            return false;
        }
        B2(Double.valueOf(d10));
        return true;
    }

    @Override // androidx.compose.runtime.c0
    public boolean P() {
        return this.W;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:35:0x0107  */
    @Override // androidx.compose.runtime.c0
    @w
    public void Q() {
        long jRotateLeft;
        long j10;
        if (this.f35838u.isEmpty()) {
            e2();
            return;
        }
        v5 v5Var = this.J;
        int iP = v5Var.p();
        Object objR = v5Var.r();
        Object objN = v5Var.n();
        int i10 = this.f35831n;
        if (objR == null) {
            if (objN == null || iP != 207 || Intrinsics.areEqual(objN, c0.f35327a.a())) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(g(), 3) ^ ((long) iP), 3);
                j10 = i10;
            } else {
                this.X = Long.rotateLeft(Long.rotateLeft(g(), 3) ^ ((long) objN.hashCode()), 3) ^ ((long) i10);
            }
            n2(v5Var.Q(), null);
            P1();
            v5Var.h();
            if (objR != null) {
                if (objR instanceof Enum) {
                    this.X = Long.rotateRight(Long.rotateRight(g() ^ ((long) 0), 3) ^ ((long) ((Enum) objR).ordinal()), 3);
                } else {
                    this.X = Long.rotateRight(Long.rotateRight(g() ^ ((long) 0), 3) ^ ((long) objR.hashCode()), 3);
                }
            }
            if (objN == null && iP == 207 && !Intrinsics.areEqual(objN, c0.f35327a.a())) {
                this.X = Long.rotateRight(Long.rotateRight(g() ^ ((long) i10), 3) ^ ((long) objN.hashCode()), 3);
                return;
            } else {
                this.X = Long.rotateRight(((long) iP) ^ Long.rotateRight(g() ^ ((long) i10), 3), 3);
            }
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(g(), 3) ^ ((long) (objR instanceof Enum ? ((Enum) objR).ordinal() : objR.hashCode())), 3);
        j10 = 0;
        this.X = jRotateLeft ^ j10;
        n2(v5Var.Q(), null);
        P1();
        v5Var.h();
        if (objR != null) {
            if (objN == null) {
            }
            this.X = Long.rotateRight(((long) iP) ^ Long.rotateRight(g() ^ ((long) i10), 3), 3);
        } else if (objR instanceof Enum) {
            this.X = Long.rotateRight(Long.rotateRight(g() ^ ((long) 0), 3) ^ ((long) ((Enum) objR).ordinal()), 3);
        } else {
            this.X = Long.rotateRight(Long.rotateRight(g() ^ ((long) 0), 3) ^ ((long) objR.hashCode()), 3);
        }
    }

    @Override // androidx.compose.runtime.c0
    @w
    @NotNull
    public c0 R(int i10) {
        E(i10);
        I0();
        return this;
    }

    @Override // androidx.compose.runtime.c0
    @NotNull
    public i<?> S() {
        return this.f35819b;
    }

    @Override // androidx.compose.runtime.c0
    @w
    @Nullable
    public s5 T() {
        g gVarA;
        s4 s4Var = null;
        s4 s4Var2 = m7.j(this.G) ? (s4) m7.m(this.G) : null;
        if (s4Var2 != null) {
            s4Var2.M(false);
            Function1<o0, Unit> function1G1 = g1(s4Var2);
            if (function1G1 != null) {
                this.P.f(function1G1, x());
            }
            if (s4Var2.s()) {
                s4Var2.P(false);
                this.P.k(s4Var2);
                s4Var2.Q(false);
                if (s4Var2.r()) {
                    s4Var2.O(false);
                    this.A = false;
                }
            }
        }
        if (s4Var2 != null && !s4Var2.u() && (s4Var2.v() || this.f35835r)) {
            if (s4Var2.h() == null) {
                if (P()) {
                    z5 z5Var = this.L;
                    gVarA = z5Var.C(z5Var.k0());
                } else {
                    v5 v5Var = this.J;
                    gVarA = v5Var.a(v5Var.z());
                }
                s4Var2.F(gVarA);
            }
            s4Var2.H(false);
            s4Var = s4Var2;
        }
        Y0(false);
        return s4Var;
    }

    public final void T0() {
        m7.b(this.G);
        this.f35838u.clear();
        this.f35823f.c();
        this.f35841x = null;
    }

    @Override // androidx.compose.runtime.c0
    @w
    @NotNull
    public Object U(@Nullable Object obj, @Nullable Object obj2) {
        Object objT = m0.T(this.J.r(), obj, obj2);
        return objT == null ? new v2(obj, obj2) : objT;
    }

    public final void U0() {
        androidx.compose.runtime.internal.b1 b1Var = androidx.compose.runtime.internal.b1.f35891a;
        Object objA = b1Var.a("Compose:Composer.dispose");
        try {
            this.f35820c.z(this);
            T0();
            S().clear();
            this.I = true;
            Unit unit = Unit.f312394a;
            b1Var.b(objA);
        } catch (Throwable th2) {
            androidx.compose.runtime.internal.b1.f35891a.b(objA);
            throw th2;
        }
    }

    @Override // androidx.compose.runtime.c0
    public void V() {
        k2(125, null, k2.f36180b.b(), null);
        this.f35837t = true;
    }

    @Override // androidx.compose.runtime.c0
    @r2
    public <T> T W(@NotNull u0<T> u0Var) {
        return (T) c1.c(Q0(), u0Var);
    }

    @Override // androidx.compose.runtime.c0
    @NotNull
    public CoroutineContext X() {
        return this.V;
    }

    @Override // androidx.compose.runtime.c0
    public void Y(@Nullable Object obj) {
        r2(obj);
    }

    @Override // androidx.compose.runtime.c0
    @w
    public void Z() {
        Z0();
        s4 s4VarN1 = n1();
        if (s4VarN1 == null || !s4VarN1.v()) {
            return;
        }
        s4VarN1.G(true);
    }

    @Override // androidx.compose.runtime.c0
    public int a() {
        return P() ? -this.L.k0() : this.J.z();
    }

    public final void a1() {
        if (!(!this.H && this.B == 100)) {
            f4.d("Cannot disable reuse from root if it was caused by other groups");
        }
        this.B = -1;
        this.A = false;
    }

    @Override // androidx.compose.runtime.c0
    @r2
    public void b0(@NotNull e3<?> e3Var, @Nullable Object obj) {
        Intrinsics.checkNotNull(e3Var, "null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
        A1(e3Var, Q0(), obj, false);
    }

    public final void b2(@Nullable androidx.compose.runtime.changelist.a aVar) {
        this.O = aVar;
    }

    @Override // androidx.compose.runtime.c0
    @w
    public void c(boolean z10) {
        if (!(this.f35830m == 0)) {
            m0.y("No nodes can be emitted before calling dactivateToEndGroup");
        }
        if (P()) {
            return;
        }
        if (!z10) {
            f2();
            return;
        }
        int iM = this.J.m();
        int iL = this.J.l();
        this.P.d();
        m0.s0(this.f35838u, iM, iL);
        this.J.d0();
    }

    @Override // androidx.compose.runtime.c0
    public void c0() {
        this.E = false;
    }

    public final void c2(@NotNull w5 w5Var) {
        this.K = w5Var;
    }

    @Override // androidx.compose.runtime.c0
    public boolean d() {
        s4 s4VarN1;
        return (P() || this.A || this.f35842y || (s4VarN1 = n1()) == null || s4VarN1.p() || this.f35836s) ? false : true;
    }

    public final void d2(@NotNull v5 v5Var) {
        this.J = v5Var;
    }

    @Override // androidx.compose.runtime.c0
    @r2
    public void e(@NotNull List<Pair<i3, i3>> list) {
        try {
            w1(list);
            L0();
        } catch (Throwable th2) {
            D0();
            throw th2;
        }
    }

    @Override // androidx.compose.runtime.c0
    public void e0() {
        this.f35835r = true;
        this.E = true;
        this.f35821d.p();
        this.K.p();
        this.L.X1();
    }

    @Override // androidx.compose.runtime.c0
    public <V, T> void f(V v10, @NotNull Function2<? super T, ? super V, Unit> function2) {
        if (P()) {
            this.R.j(v10, function2);
        } else {
            this.P.e0(v10, function2);
        }
    }

    @Override // androidx.compose.runtime.c0
    @Nullable
    public q4 f0() {
        return n1();
    }

    @Override // androidx.compose.runtime.c0
    public long g() {
        return this.X;
    }

    @Override // androidx.compose.runtime.c0
    public void g0() {
        if (this.A && this.J.z() == this.B) {
            this.B = -1;
            this.A = false;
        }
        Y0(false);
    }

    @Override // androidx.compose.runtime.c0
    @w
    public boolean h(boolean z10, int i10) {
        s4 s4VarN1;
        if ((i10 & 1) != 0 || (!P() && !this.A)) {
            return z10 || !d();
        }
        t5 t5Var = this.T;
        if (t5Var == null || (s4VarN1 = n1()) == null || !t5Var.a() || s4VarN1.s()) {
            return true;
        }
        s4VarN1.S(true);
        s4VarN1.Q(this.A);
        s4VarN1.L(true);
        this.P.R(s4VarN1);
        this.f35820c.w(s4VarN1);
        return false;
    }

    @Override // androidx.compose.runtime.c0
    @w
    public void h0(int i10) {
        k2(i10, null, k2.f36180b.a(), null);
    }

    @Override // androidx.compose.runtime.c0
    @Nullable
    public Object i0() {
        return F1();
    }

    @NotNull
    public final List<androidx.compose.runtime.tooling.c> i2(@Nullable final Object obj) {
        List<androidx.compose.runtime.tooling.c> listPlus;
        if (!this.E) {
            return CollectionsKt.emptyList();
        }
        androidx.compose.runtime.tooling.w wVarD = androidx.compose.runtime.tooling.b.d(this.f35821d, new Function1() { // from class: androidx.compose.runtime.h0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(i0.h2(obj, obj2));
            }
        });
        return (wVarD == null || (listPlus = CollectionsKt.plus((Collection) g2(wVarD.a(), wVarD.b()), (Iterable) J1())) == null) ? CollectionsKt.emptyList() : listPlus;
    }

    @Override // androidx.compose.runtime.c0
    public void j(int i10) {
        if (i10 < 0) {
            int i11 = -i10;
            z5 z5Var = this.L;
            while (true) {
                int iK0 = z5Var.k0();
                if (iK0 <= i11) {
                    return;
                } else {
                    Y0(z5Var.F0(iK0));
                }
            }
        } else {
            if (P()) {
                z5 z5Var2 = this.L;
                while (P()) {
                    Y0(z5Var2.F0(z5Var2.k0()));
                }
            }
            v5 v5Var = this.J;
            while (true) {
                int iZ = v5Var.z();
                if (iZ <= i10) {
                    return;
                } else {
                    Y0(v5Var.R(iZ));
                }
            }
        }
    }

    @Override // androidx.compose.runtime.c0
    @NotNull
    public androidx.compose.runtime.tooling.f j0() {
        androidx.compose.runtime.tooling.f fVar = this.Y;
        if (fVar != null) {
            return fVar;
        }
        r0 r0Var = new r0(x());
        this.Y = r0Var;
        return r0Var;
    }

    public final boolean j1() {
        if (this.f35835r) {
            return false;
        }
        this.f35835r = true;
        this.f35836s = true;
        return true;
    }

    public final int j2() {
        return this.f35839v.f36312b + m7.g(this.G) + this.f35843z.f36312b + m7.g(this.f35827j) + this.f35832o.f36312b;
    }

    @Override // androidx.compose.runtime.c0
    @NotNull
    public b1 k() {
        return Q0();
    }

    @Override // androidx.compose.runtime.c0
    @w
    public boolean k0(@Nullable Object obj) {
        if (E1() == obj) {
            return false;
        }
        B2(obj);
        return true;
    }

    public final boolean k1() {
        return this.C > 0;
    }

    @Override // androidx.compose.runtime.c0
    public void l() {
        D2();
        if (P()) {
            m0.y("useNode() called while inserting");
        }
        Object objT1 = t1(this.J);
        this.P.y(objT1);
        if (this.A && (objT1 instanceof x)) {
            this.P.g0(objT1);
        }
    }

    @Override // androidx.compose.runtime.c0
    @w
    public void l0() {
        k2(m0.f36232e, null, k2.f36180b.a(), null);
    }

    public final int l1() {
        return this.f35823f.e();
    }

    @Override // androidx.compose.runtime.c0
    @w
    public void m0(int i10, @Nullable Object obj) {
        k2(i10, obj, k2.f36180b.a(), null);
    }

    @Override // androidx.compose.runtime.c0
    @NotNull
    /* JADX INFO: renamed from: m1, reason: merged with bridge method [inline-methods] */
    public s0 x() {
        return this.f35826i;
    }

    @Override // androidx.compose.runtime.c0
    @r2
    public void n() {
        Z0();
        Z0();
        this.f35842y = m0.t(this.f35843z.j());
        this.N = null;
    }

    @Nullable
    public final s4 n1() {
        ArrayList<Object> arrayList = this.G;
        if (this.C == 0 && m7.j(arrayList)) {
            return (s4) m7.k(arrayList);
        }
        return null;
    }

    @Override // androidx.compose.runtime.c0
    public void o() {
        Y0(true);
    }

    @Override // androidx.compose.runtime.c0
    public void o0() {
        this.A = false;
    }

    @Nullable
    public final androidx.compose.runtime.changelist.a o1() {
        return this.O;
    }

    public final void o2() {
        this.B = 100;
        this.A = true;
    }

    @Override // androidx.compose.runtime.c0
    public void p(@NotNull Function0<Unit> function0) {
        this.P.Y(function0);
    }

    @Override // androidx.compose.runtime.c0
    @r2
    public void p0(@NotNull n4<?> n4Var) {
        z7<?> z7Var;
        e4 e4VarQ0 = Q0();
        m2(201, m0.V());
        Object objI0 = i0();
        if (Intrinsics.areEqual(objI0, c0.f35327a.a())) {
            z7Var = null;
        } else {
            Intrinsics.checkNotNull(objI0, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            z7Var = (z7) objI0;
        }
        u0<?> u0VarB = n4Var.b();
        Intrinsics.checkNotNull(u0VarB, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        Intrinsics.checkNotNull(n4Var, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
        z7<?> z7VarD = u0VarB.d(n4Var, z7Var);
        boolean zAreEqual = Intrinsics.areEqual(z7VarD, z7Var);
        if (!zAreEqual) {
            Y(z7VarD);
        }
        boolean z10 = true;
        boolean z11 = false;
        if (P()) {
            if (n4Var.a() || !c1.a(e4VarQ0, u0VarB)) {
                e4VarQ0 = e4VarQ0.b2(u0VarB, z7VarD);
            }
            this.M = true;
        } else {
            v5 v5Var = this.J;
            Object objF = v5Var.F(v5Var.m());
            Intrinsics.checkNotNull(objF, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            e4 e4Var = (e4) objF;
            if (!(d() && zAreEqual) && (n4Var.a() || !c1.a(e4VarQ0, u0VarB))) {
                e4VarQ0 = e4VarQ0.b2(u0VarB, z7VarD);
            } else if ((zAreEqual && !this.f35842y) || !this.f35842y) {
                e4VarQ0 = e4Var;
            }
            if (!this.A && e4Var == e4VarQ0) {
                z10 = false;
            }
            z11 = z10;
        }
        if (z11 && !P()) {
            S1(e4VarQ0);
        }
        this.f35843z.k(m0.u(this.f35842y));
        this.f35842y = z11;
        this.N = e4VarQ0;
        k2(202, m0.L(), k2.f36180b.a(), e4VarQ0);
    }

    @Nullable
    public final androidx.compose.runtime.tooling.j p1() {
        if (this.E) {
            return this.U;
        }
        return null;
    }

    @Override // androidx.compose.runtime.c0
    public void q() {
        k2(125, null, k2.f36180b.c(), null);
        this.f35837t = true;
    }

    @Override // androidx.compose.runtime.c0
    public <T> void q0(@NotNull Function0<? extends T> function0) {
        D2();
        if (!P()) {
            m0.y("createNode() can only be called when inserting");
        }
        int iF = this.f35832o.f();
        z5 z5Var = this.L;
        g gVarC = z5Var.C(z5Var.k0());
        this.f35830m++;
        this.R.d(function0, iF, gVarC);
    }

    public final boolean q1() {
        return !this.f35838u.isEmpty();
    }

    public final boolean q2(@NotNull s4 s4Var, @Nullable Object obj) {
        g gVarH = s4Var.h();
        if (gVarH == null) {
            return false;
        }
        int iD = gVarH.d(this.J.E());
        if (!this.H || iD < this.J.m()) {
            return false;
        }
        m0.i0(this.f35838u, iD, s4Var, obj);
        return true;
    }

    @Override // androidx.compose.runtime.c0
    public void r(int i10, @Nullable Object obj) {
        if (!P() && this.J.p() == i10 && !Intrinsics.areEqual(this.J.n(), obj) && this.B < 0) {
            this.B = this.J.m();
            this.A = true;
        }
        k2(i10, null, k2.f36180b.a(), obj);
    }

    public final boolean r1() {
        return this.f35823f.g();
    }

    @kotlin.a1
    public final void r2(@Nullable Object obj) {
        boolean z10 = obj instanceof m5;
        Object obj2 = obj;
        if (z10) {
            n5 n5Var = new n5((m5) obj, U1());
            if (P()) {
                this.P.Q(n5Var);
            }
            this.f35822e.add(obj);
            obj2 = n5Var;
        }
        B2(obj2);
    }

    @Override // androidx.compose.runtime.c0
    @Nullable
    public Object s() {
        s4 s4VarN1 = n1();
        if (s4VarN1 != null) {
            return s4VarN1.h();
        }
        return null;
    }

    @Override // androidx.compose.runtime.c0
    @r2
    public void s0() {
        Z0();
        Z0();
        this.f35842y = m0.t(this.f35843z.j());
        this.N = null;
    }

    @NotNull
    public final w5 s1() {
        return this.K;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x00aa A[LOOP:1: B:17:0x004d->B:32:0x00aa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ad A[EDGE_INSN: B:40:0x00ad->B:33:0x00ad BREAK  A[LOOP:1: B:17:0x004d->B:32:0x00aa], SYNTHETIC] */
    public final void s2(@NotNull androidx.collection.k2<Object, Object> k2Var) {
        for (int lastIndex = CollectionsKt.getLastIndex(this.f35838u); -1 < lastIndex; lastIndex--) {
            t2 t2Var = this.f35838u.get(lastIndex);
            g gVarH = t2Var.c().h();
            if (gVarH == null || !gVarH.b()) {
                this.f35838u.remove(lastIndex);
            } else if (t2Var.b() != gVarH.a()) {
                t2Var.f(gVarH.a());
            }
        }
        Object[] objArr = k2Var.f12131b;
        Object[] objArr2 = k2Var.f12132c;
        long[] jArr = k2Var.f12130a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            Object obj = objArr[i13];
                            Object obj2 = objArr2[i13];
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                            s4 s4Var = (s4) obj;
                            g gVarH2 = s4Var.h();
                            if (gVarH2 != null) {
                                int iA = gVarH2.a();
                                List<t2> list = this.f35838u;
                                if (obj2 == r5.f36336a) {
                                    obj2 = null;
                                }
                                list.add(new t2(s4Var, iA, obj2));
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    } else if (i10 != length) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
        CollectionsKt.sortWith(this.f35838u, m0.f36248u);
    }

    @Override // androidx.compose.runtime.c0
    @w
    public void t(@NotNull String str) {
        if (P() && this.E) {
            this.L.c1(str);
        }
    }

    @Override // androidx.compose.runtime.c0
    @w
    public void u() {
        if (!(this.f35830m == 0)) {
            m0.y("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (!P()) {
            s4 s4VarN1 = n1();
            if (s4VarN1 != null) {
                s4VarN1.E();
            }
            if (this.f35838u.isEmpty()) {
                f2();
                return;
            }
            P1();
        }
    }

    @NotNull
    public final v5 u1() {
        return this.J;
    }

    @Override // androidx.compose.runtime.c0
    @w
    public void v0() {
        Z0();
    }

    @Override // androidx.compose.runtime.c0
    @w
    public void w(int i10, @NotNull String str) {
        if (P() && this.E) {
            this.L.e1(i10, str);
        }
    }

    @Override // androidx.compose.runtime.c0
    @w
    public void w0() {
        Z0();
    }

    @Override // androidx.compose.runtime.c0
    public boolean y() {
        s4 s4VarN1;
        return !d() || this.f35842y || ((s4VarN1 = n1()) != null && s4VarN1.k());
    }

    @Override // androidx.compose.runtime.c0
    public void z(@NotNull q4 q4Var) {
        s4 s4Var = q4Var instanceof s4 ? (s4) q4Var : null;
        if (s4Var != null) {
            s4Var.S(true);
        }
    }
}
