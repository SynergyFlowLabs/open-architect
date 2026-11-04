package androidx.compose.ui.node;

import androidx.compose.ui.layout.h3;
import androidx.compose.ui.layout.i3;
import androidx.compose.ui.layout.v2;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nLookaheadDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadCapablePlaceable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n+ 6 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 7 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 8 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegateKt\n+ 9 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,686:1\n1#2:687\n1#2:766\n372#3,3:688\n329#3,6:691\n339#3,3:698\n342#3,2:702\n345#3,6:733\n375#3:739\n329#3,6:741\n339#3,3:748\n342#3,2:752\n345#3,6:758\n372#3,3:774\n329#3,6:777\n339#3,3:784\n342#3,9:788\n375#3:797\n372#3,3:798\n329#3,6:801\n339#3,3:808\n342#3,9:812\n375#3:821\n372#3,3:822\n329#3,6:825\n339#3,3:832\n342#3,9:836\n375#3:845\n1399#4:697\n1270#4:701\n1399#4:747\n1270#4:751\n1399#4:783\n1270#4:787\n1399#4:807\n1270#4:811\n1399#4:831\n1270#4:835\n1399#4:856\n1270#4:860\n809#5,2:704\n812#5,4:722\n816#5:732\n200#6,16:706\n217#6,6:726\n231#6,3:846\n200#6,7:849\n211#6,3:857\n214#6,9:861\n234#6:870\n842#7:740\n844#7,4:754\n848#7:764\n683#7:765\n394#8:767\n395#8,2:770\n398#8:773\n57#9,2:768\n60#9:772\n*S KotlinDebug\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadCapablePlaceable\n*L\n177#1:766\n170#1:688,3\n170#1:691,6\n170#1:698,3\n170#1:702,2\n170#1:733,6\n170#1:739\n171#1:741,6\n171#1:748,3\n171#1:752,2\n171#1:758,6\n245#1:774,3\n245#1:777,6\n245#1:784,3\n245#1:788,9\n245#1:797\n271#1:798,3\n271#1:801,6\n271#1:808,3\n271#1:812,9\n271#1:821\n304#1:822,3\n304#1:825,6\n304#1:832,3\n304#1:836,9\n304#1:845\n170#1:697\n170#1:701\n171#1:747\n171#1:751\n245#1:783\n245#1:787\n271#1:807\n271#1:811\n304#1:831\n304#1:835\n314#1:856\n314#1:860\n170#1:704,2\n170#1:722,4\n170#1:732\n170#1:706,16\n170#1:726,6\n314#1:846,3\n314#1:849,7\n314#1:857,3\n314#1:861,9\n314#1:870\n171#1:740\n171#1:754,4\n171#1:764\n177#1:765\n215#1:767\n215#1:770,2\n215#1:773\n215#1:768,2\n215#1:772\n*E\n"})
public abstract class u0 extends androidx.compose.ui.layout.i2 implements b1, f1 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f40010t = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private c f40012g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private Function1<? super v2, Unit> f40013h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private c2 f40014i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f40015j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f40016k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f40017l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.layout.i2.a f40018m = androidx.compose.ui.layout.j2.a(this);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private h2 f40019n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private androidx.collection.k2<androidx.compose.ui.layout.s2, androidx.collection.l2<u2<l0>>> f40020o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public static final b f40009s = new b(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private static final Function1<c2, Unit> f40011v = a.f40021a;

    static final class a extends kotlin.jvm.internal.l0 implements Function1<c2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40021a = new a();

        a() {
            super(1);
        }

        public final void c(c2 c2Var) {
            if (c2Var.H2()) {
                c2Var.a().I1(c2Var);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(c2 c2Var) {
            c(c2Var);
            return Unit.f312394a;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    private final class c implements v2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f40022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f40023b = androidx.compose.ui.unit.q.f42709b.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f40024c = androidx.compose.ui.unit.u.f42720b.a();

        public c() {
        }

        public final void I(long j10) {
            this.f40023b = j10;
        }

        public final void J(long j10) {
            this.f40024c = j10;
        }

        @Override // androidx.compose.ui.layout.v2
        public void X4(@NotNull i3 i3Var, float f10) {
            u0.this.O2(i3Var, f10);
        }

        public final long a() {
            return this.f40024c;
        }

        public final boolean c() {
            return this.f40022a;
        }

        @Override // androidx.compose.ui.layout.v2
        public void e2(@NotNull androidx.compose.ui.layout.s2 s2Var, float f10) {
            u0.this.V2(s2Var, f10);
        }

        @Override // androidx.compose.ui.unit.d
        public float getDensity() {
            return u0.this.getDensity();
        }

        @Override // androidx.compose.ui.unit.n
        public float m0() {
            return u0.this.m0();
        }

        @Override // androidx.compose.ui.layout.v2
        @NotNull
        public androidx.compose.ui.layout.g0 n() {
            this.f40022a = true;
            androidx.compose.ui.layout.g0 g0VarN = u0.this.n();
            if (androidx.compose.ui.unit.q.k(this.f40023b, androidx.compose.ui.unit.q.f42709b.a())) {
                this.f40023b = androidx.compose.ui.unit.r.g(androidx.compose.ui.layout.h0.h(g0VarN));
                this.f40024c = g0VarN.a();
            }
            u0.this.i4().k0().H();
            return g0VarN;
        }

        public final long w() {
            return this.f40023b;
        }

        public final void x(boolean z10) {
            this.f40022a = z10;
        }
    }

    static final class d extends kotlin.jvm.internal.l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f40027b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f40028c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c2 f40029d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j10, long j11, c2 c2Var) {
            super(0);
            this.f40027b = j10;
            this.f40028c = j11;
            this.f40029d = c2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            u0.this.v2().x(false);
            u0.this.v2().I(this.f40027b);
            u0.this.v2().J(this.f40028c);
            Function1<v2, Unit> function1J = this.f40029d.b().j();
            if (function1J != null) {
                function1J.invoke(u0.this.v2());
            }
        }
    }

    public static final class e implements androidx.compose.ui.layout.b1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f40030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f40031b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map<androidx.compose.ui.layout.a, Integer> f40032c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<v2, Unit> f40033d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.ui.layout.i2.a, Unit> f40034e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ u0 f40035f;

        /* JADX WARN: Multi-variable type inference failed */
        e(int i10, int i11, Map<androidx.compose.ui.layout.a, Integer> map, Function1<? super v2, Unit> function1, Function1<? super androidx.compose.ui.layout.i2.a, Unit> function2, u0 u0Var) {
            this.f40030a = i10;
            this.f40031b = i11;
            this.f40032c = map;
            this.f40033d = function1;
            this.f40034e = function2;
            this.f40035f = u0Var;
        }

        @Override // androidx.compose.ui.layout.b1
        public int getHeight() {
            return this.f40031b;
        }

        @Override // androidx.compose.ui.layout.b1
        public int getWidth() {
            return this.f40030a;
        }

        @Override // androidx.compose.ui.layout.b1
        public Function1<v2, Unit> j() {
            return this.f40033d;
        }

        @Override // androidx.compose.ui.layout.b1
        public Map<androidx.compose.ui.layout.a, Integer> x() {
            return this.f40032c;
        }

        @Override // androidx.compose.ui.layout.b1
        public void y() {
            this.f40034e.invoke(this.f40035f.t2());
        }
    }

    private final boolean A2(l0 l0Var, l0 l0Var2) {
        if (l0Var == l0Var2) {
            return true;
        }
        l0 l0VarJ0 = l0Var.J0();
        if (l0VarJ0 != null) {
            return A2(l0VarJ0, l0Var2);
        }
        return false;
    }

    private final void E1(c2 c2Var, long j10, long j11) {
        z1 snapshotObserver;
        androidx.collection.k2<androidx.compose.ui.layout.s2, androidx.collection.l2<u2<l0>>> k2Var = this.f40020o;
        h2 h2Var = this.f40019n;
        if (h2Var == null) {
            h2Var = new h2();
            this.f40019n = h2Var;
        }
        x1 x1VarI0 = i4().I0();
        if (x1VarI0 != null && (snapshotObserver = x1VarI0.getSnapshotObserver()) != null) {
            snapshotObserver.i(c2Var, f40011v, new d(j10, j11, c2Var));
        }
        h2Var.d(P5(), this, k2Var);
    }

    static /* synthetic */ void H1(u0 u0Var, c2 c2Var, long j10, long j11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: captureRulers-OSxE8f4");
        }
        if ((i10 & 2) != 0) {
            j10 = androidx.compose.ui.unit.q.f42709b.a();
        }
        long j12 = j10;
        if ((i10 & 4) != 0) {
            j11 = androidx.compose.ui.unit.u.f42720b.a();
        }
        u0Var.E1(c2Var, j12, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:20:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x005b A[LOOP:0: B:11:0x001e->B:21:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x005e A[EDGE_INSN: B:27:0x005e->B:22:0x005e BREAK  A[LOOP:0: B:11:0x001e->B:21:0x005b], SYNTHETIC] */
    public final void I1(c2 c2Var) {
        if (this.f40017l) {
            return;
        }
        Function1<v2, Unit> function1J = c2Var.b().j();
        androidx.collection.k2<androidx.compose.ui.layout.s2, androidx.collection.l2<u2<l0>>> k2Var = this.f40020o;
        if (function1J != null) {
            H1(this, c2Var, 0L, 0L, 6, null);
            this.f40013h = function1J;
            return;
        }
        if (k2Var != null) {
            Object[] objArr = k2Var.f12132c;
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
                                N2((androidx.collection.l2) objArr[(i10 << 3) + i12]);
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
            k2Var.K();
        }
    }

    private final u0 M1(androidx.compose.ui.layout.s2 s2Var) {
        u0 u0VarQ2;
        while (true) {
            h2 h2Var = this.f40019n;
            if ((h2Var != null && h2Var.b(s2Var)) || (u0VarQ2 = this.q2()) == null) {
                return this;
            }
            this = u0VarQ2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void N2(androidx.collection.l2<u2<l0>> l2Var) {
        l0 l0Var;
        Object[] objArr = l2Var.f12171b;
        long[] jArr = l2Var.f12170a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128 && (l0Var = (l0) ((u2) objArr[(i10 << 3) + i12]).get()) != null) {
                        if (P5()) {
                            l0Var.N1(false);
                        } else {
                            l0Var.R1(false);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c v2() {
        c cVar = this.f40012g;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.f40012g = cVar2;
        return cVar2;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:49:0x011d  */
    /* JADX WARN: Code duplicated, block: B:89:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    private final void x1(l0 l0Var, androidx.compose.ui.layout.s2 s2Var) {
        char c10;
        long j10;
        long j11;
        long j12;
        int i10;
        int i11;
        long[] jArr;
        long[] jArr2;
        long j13;
        int i12;
        char c11;
        long j14;
        int i13;
        int i14;
        int i15;
        boolean z10;
        androidx.collection.k2<androidx.compose.ui.layout.s2, androidx.collection.l2<u2<l0>>> k2Var = this.f40020o;
        char c12 = 7;
        long j15 = -9187201950435737472L;
        int i16 = 8;
        if (k2Var != null) {
            Object[] objArr = k2Var.f12132c;
            long[] jArr3 = k2Var.f12130a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i17 = 0;
                j11 = 128;
                while (true) {
                    long j16 = jArr3[i17];
                    j12 = 255;
                    if ((((~j16) << c12) & j16 & j15) != j15) {
                        int i18 = 8 - ((~(i17 - length)) >>> 31);
                        int i19 = 0;
                        while (i19 < i18) {
                            if ((j16 & 255) < 128) {
                                c11 = c12;
                                androidx.collection.l2 l2Var = (androidx.collection.l2) objArr[(i17 << 3) + i19];
                                j14 = j15;
                                Object[] objArr2 = l2Var.f12171b;
                                long[] jArr4 = l2Var.f12170a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    int i20 = i16;
                                    int i21 = 0;
                                    while (true) {
                                        int i22 = length2;
                                        long j17 = jArr4[i21];
                                        jArr2 = jArr3;
                                        j13 = j16;
                                        if ((((~j17) << c11) & j17 & j14) != j14) {
                                            int i23 = 8 - ((~(i21 - i22)) >>> 31);
                                            int i24 = 0;
                                            while (i24 < i23) {
                                                if ((j17 & 255) < 128) {
                                                    int i25 = (i21 << 3) + i24;
                                                    l0 l0Var2 = (l0) ((u2) objArr2[i25]).get();
                                                    i14 = i24;
                                                    if (l0Var2 != null) {
                                                        boolean zI = l0Var2.I();
                                                        i15 = i19;
                                                        z10 = zI;
                                                        if (!z10) {
                                                            l2Var.n0(i25);
                                                        }
                                                    } else {
                                                        i15 = i19;
                                                    }
                                                    if (!z10) {
                                                        l2Var.n0(i25);
                                                    }
                                                } else {
                                                    i14 = i24;
                                                    i15 = i19;
                                                }
                                                j17 >>= i20;
                                                i24 = i14 + 1;
                                                i19 = i15;
                                            }
                                            i12 = i19;
                                            if (i23 != i20) {
                                                break;
                                            }
                                        } else {
                                            i12 = i19;
                                        }
                                        length2 = i22;
                                        if (i21 == length2) {
                                            break;
                                        }
                                        i21++;
                                        jArr3 = jArr2;
                                        j16 = j13;
                                        i19 = i12;
                                        i20 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j13 = j16;
                                    i12 = i19;
                                }
                                i13 = 8;
                            } else {
                                jArr2 = jArr3;
                                j13 = j16;
                                i12 = i19;
                                c11 = c12;
                                j14 = j15;
                                i13 = i16;
                            }
                            i16 = i13;
                            j16 = j13 >> i13;
                            c12 = c11;
                            j15 = j14;
                            i19 = i12 + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c10 = c12;
                        j10 = j15;
                        if (i18 != i16) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c10 = c12;
                        j10 = j15;
                    }
                    if (i17 == length) {
                        break;
                    }
                    i17++;
                    c12 = c10;
                    j15 = j10;
                    jArr3 = jArr;
                    i16 = 8;
                }
            } else {
                c10 = 7;
                j10 = -9187201950435737472L;
                j11 = 128;
                j12 = 255;
            }
        } else {
            c10 = 7;
            j10 = -9187201950435737472L;
            j11 = 128;
            j12 = 255;
        }
        androidx.collection.k2<androidx.compose.ui.layout.s2, androidx.collection.l2<u2<l0>>> k2Var2 = this.f40020o;
        if (k2Var2 != null) {
            long[] jArr5 = k2Var2.f12130a;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i26 = 0;
                while (true) {
                    long j18 = jArr5[i26];
                    if ((((~j18) << c10) & j18 & j10) != j10) {
                        int i27 = 8 - ((~(i26 - length3)) >>> 31);
                        for (int i28 = 0; i28 < i27; i28++) {
                            if ((j18 & j12) < j11) {
                                int i29 = (i26 << 3) + i28;
                                if (((androidx.collection.l2) k2Var2.f12132c[i29]).r()) {
                                    k2Var2.o0(i29);
                                }
                            }
                            j18 >>= 8;
                        }
                        if (i27 != 8) {
                            break;
                        }
                    }
                    if (i26 == length3) {
                        break;
                    } else {
                        i26++;
                    }
                }
            }
        }
        androidx.collection.k2<androidx.compose.ui.layout.s2, androidx.collection.l2<u2<l0>>> k2Var3 = this.f40020o;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (k2Var3 == null) {
            i10 = 0;
            i11 = 1;
            k2Var3 = new androidx.collection.k2<>(i10, i11, defaultConstructorMarker);
            this.f40020o = k2Var3;
        } else {
            i10 = 0;
            i11 = 1;
        }
        androidx.collection.l2<u2<l0>> l2VarP = k2Var3.p(s2Var);
        if (l2VarP == null) {
            l2VarP = new androidx.collection.l2<>(i10, i11, defaultConstructorMarker);
            k2Var3.q0(s2Var, l2VarP);
        }
        l2VarP.d0(new u2<>(l0Var));
    }

    public abstract int B1(@NotNull androidx.compose.ui.layout.a aVar);

    public final boolean B2() {
        return this.f40017l;
    }

    @Override // androidx.compose.ui.node.f1
    public boolean H0() {
        return this.f40015j;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x0122 A[LOOP:2: B:57:0x00f4->B:67:0x0122, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x0125 A[EDGE_INSN: B:80:0x0125->B:68:0x0125 BREAK  A[LOOP:2: B:57:0x00f4->B:67:0x0122], SYNTHETIC] */
    public final void J1(@Nullable androidx.compose.ui.layout.b1 b1Var) {
        char c10;
        androidx.collection.k2<androidx.compose.ui.layout.s2, androidx.collection.l2<u2<l0>>> k2Var = this.f40020o;
        char c11 = 7;
        if (b1Var == null) {
            if (k2Var != null) {
                Object[] objArr = k2Var.f12132c;
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
                                if ((j10 & 255) < 128) {
                                    N2((androidx.collection.l2) objArr[(i10 << 3) + i12]);
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
            }
            if (k2Var != null) {
                k2Var.K();
            }
            h2 h2Var = this.f40019n;
            if (h2Var != null) {
                h2Var.a();
                return;
            }
            return;
        }
        if (this.f40017l) {
            return;
        }
        Function1<v2, Unit> function1J = b1Var.j();
        if (function1J != null) {
            boolean z10 = this.f40013h != function1J;
            long jA = androidx.compose.ui.unit.q.f42709b.a();
            long jA2 = androidx.compose.ui.unit.u.f42720b.a();
            if (!z10 && v2().c()) {
                androidx.compose.ui.layout.g0 g0VarN = n();
                jA = androidx.compose.ui.unit.r.g(androidx.compose.ui.layout.h0.h(g0VarN));
                jA2 = g0VarN.a();
                z10 = (androidx.compose.ui.unit.q.k(jA, v2().w()) && androidx.compose.ui.unit.u.h(jA2, v2().a())) ? false : true;
            }
            long j11 = jA;
            long j12 = jA2;
            if (z10) {
                c2 c2Var = this.f40014i;
                if (c2Var != null) {
                    c2Var.c(b1Var);
                } else {
                    c2Var = new c2(b1Var, this);
                    this.f40014i = c2Var;
                }
                E1(c2Var, j11, j12);
                this.f40013h = b1Var.j();
                return;
            }
            return;
        }
        if (k2Var != null) {
            Object[] objArr2 = k2Var.f12132c;
            long[] jArr2 = k2Var.f12130a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i13 = 0;
                while (true) {
                    long j13 = jArr2[i13];
                    if ((((~j13) << c11) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8 - ((~(i13 - length2)) >>> 31);
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((j13 & 255) < 128) {
                                N2((androidx.collection.l2) objArr2[(i13 << 3) + i15]);
                            }
                            j13 >>= 8;
                            i15++;
                            c11 = c11;
                        }
                        c10 = c11;
                        if (i14 != 8) {
                            break;
                        }
                    } else {
                        c10 = c11;
                    }
                    if (i13 == length2) {
                        break;
                    }
                    i13++;
                    c11 = c10;
                }
            }
            k2Var.K();
        }
    }

    public final boolean K2() {
        return this.f40016k;
    }

    @Override // androidx.compose.ui.layout.e1
    public final int M(@NotNull androidx.compose.ui.layout.a aVar) {
        int iB1;
        if (b2() && (iB1 = B1(aVar)) != Integer.MIN_VALUE) {
            return iB1 + (aVar instanceof h3 ? androidx.compose.ui.unit.q.n(b1()) : androidx.compose.ui.unit.q.p(b1()));
        }
        return Integer.MIN_VALUE;
    }

    public final void O2(@NotNull androidx.compose.ui.layout.s2 s2Var, float f10) {
        h2 h2Var = this.f40019n;
        if (h2Var == null) {
            h2Var = new h2();
            this.f40019n = h2Var;
        }
        if (getLayoutDirection() != androidx.compose.ui.unit.w.Ltr) {
            f10 = h1() - f10;
        }
        h2Var.e(s2Var, f10);
    }

    @Override // androidx.compose.ui.layout.z
    public boolean P5() {
        return false;
    }

    public final float R1(@NotNull androidx.compose.ui.layout.s2 s2Var, float f10) {
        if (this.f40017l) {
            return f10;
        }
        u0 u0Var = this;
        while (true) {
            h2 h2Var = u0Var.f40019n;
            float fC = h2Var != null ? h2Var.c(s2Var, Float.NaN) : Float.NaN;
            if (!Float.isNaN(fC)) {
                u0Var.x1(i4(), s2Var);
                return s2Var.a(fC, u0Var.n(), n());
            }
            u0 u0VarQ2 = u0Var.q2();
            if (u0VarQ2 == null) {
                u0Var.x1(i4(), s2Var);
                return f10;
            }
            u0Var = u0VarQ2;
        }
    }

    @NotNull
    public abstract androidx.compose.ui.node.b S1();

    @Nullable
    public abstract u0 T1();

    public final void V2(@NotNull androidx.compose.ui.layout.s2 s2Var, float f10) {
        h2 h2Var = this.f40019n;
        if (h2Var == null) {
            h2Var = new h2();
            this.f40019n = h2Var;
        }
        h2Var.e(s2Var, f10);
    }

    public abstract void W2();

    public void X2(boolean z10) {
        this.f40015j = z10;
    }

    public final void Y2(boolean z10) {
        this.f40017l = z10;
    }

    @Override // androidx.compose.ui.node.f1
    public void Z(boolean z10) {
        u0 u0VarQ2 = q2();
        l0 l0VarI4 = u0VarQ2 != null ? u0VarQ2.i4() : null;
        if (Intrinsics.areEqual(l0VarI4, i4())) {
            X2(z10);
            return;
        }
        if ((l0VarI4 != null ? l0VarI4.m0() : null) != l0.e.LayingOut) {
            if ((l0VarI4 != null ? l0VarI4.m0() : null) != l0.e.LookaheadLayingOut) {
                return;
            }
        }
        X2(z10);
    }

    public final void Z2(boolean z10) {
        this.f40016k = z10;
    }

    public abstract boolean b2();

    @Override // androidx.compose.ui.layout.c1
    @NotNull
    public androidx.compose.ui.layout.b1 f8(int i10, int i11, @NotNull Map<androidx.compose.ui.layout.a, Integer> map, @Nullable Function1<? super v2, Unit> function1, @NotNull Function1<? super androidx.compose.ui.layout.i2.a, Unit> function2) {
        if (!((i10 & (-16777216)) == 0 && ((-16777216) & i11) == 0)) {
            s0.a.i("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new e(i10, i11, map, function1, function2, this);
    }

    @NotNull
    public abstract l0 i4();

    @NotNull
    public abstract androidx.compose.ui.layout.b1 l2();

    @NotNull
    public abstract androidx.compose.ui.layout.g0 n();

    @Nullable
    public abstract u0 q2();

    @NotNull
    public final androidx.compose.ui.layout.i2.a t2() {
        return this.f40018m;
    }

    public abstract long u2();

    protected final void w2(@NotNull k1 k1Var) {
        androidx.compose.ui.node.a aVarX;
        k1 k1VarY4 = k1Var.Y4();
        if (!Intrinsics.areEqual(k1VarY4 != null ? k1VarY4.i4() : null, k1Var.i4())) {
            k1Var.S1().x().q();
            return;
        }
        androidx.compose.ui.node.b bVarT0 = k1Var.S1().t0();
        if (bVarT0 == null || (aVarX = bVarT0.x()) == null) {
            return;
        }
        aVarX.q();
    }

    public final void z2(@NotNull androidx.compose.ui.layout.s2 s2Var) {
        androidx.collection.k2<androidx.compose.ui.layout.s2, androidx.collection.l2<u2<l0>>> k2Var = M1(s2Var).f40020o;
        androidx.collection.l2<u2<l0>> l2VarL0 = k2Var != null ? k2Var.l0(s2Var) : null;
        if (l2VarL0 != null) {
            N2(l2VarL0);
        }
    }
}
