package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 3 Stack.kt\nandroidx/compose/runtime/IntStack\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 IntObjectMap.kt\nandroidx/collection/MutableIntObjectMap\n+ 7 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 8 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 9 ObjectList.kt\nandroidx/collection/ObjectList\n+ 10 IntList.kt\nandroidx/collection/IntListKt\n+ 11 IntList.kt\nandroidx/collection/IntList\n+ 12 ArrayUtils.android.kt\nandroidx/compose/runtime/collection/ArrayUtils_androidKt\n+ 13 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 14 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,4061:1\n2070#1,6:4178\n2076#1,5:4185\n2081#1,10:4191\n3767#2:4062\n3767#2:4063\n3833#2:4064\n3827#2:4065\n3773#2:4066\n3782#2:4067\n3767#2:4068\n3782#2:4091\n3782#2:4100\n3833#2:4149\n3767#2:4150\n3833#2:4161\n3833#2:4162\n3767#2:4163\n3767#2:4172\n3833#2:4173\n3767#2:4239\n3833#2:4240\n3923#2,6:4272\n3790#2:4278\n3799#2:4279\n3799#2:4280\n3809#2:4281\n3799#2:4282\n3809#2:4283\n3850#2,2:4284\n3847#2:4291\n3850#2,2:4292\n3878#2:4298\n3881#2,2:4303\n3878#2:4305\n3881#2,2:4310\n3881#2,2:4312\n3767#2:4318\n3847#2:4328\n3827#2:4329\n3833#2:4330\n3878#2:4331\n3847#2:4332\n3767#2:4333\n3878#2:4334\n3847#2:4347\n3847#2:4352\n3847#2:4361\n3878#2:4362\n3881#2,2:4363\n3764#2:4365\n3824#2:4366\n82#3:4069\n53#3:4140\n4788#4,4:4070\n4788#4,4:4077\n4809#4:4081\n4788#4,4:4082\n4809#4:4086\n4788#4,4:4087\n4788#4,4:4092\n4788#4,4:4096\n4788#4,4:4101\n4788#4,4:4116\n4788#4,4:4120\n4788#4,4:4124\n4788#4,4:4132\n4788#4,4:4141\n4788#4,4:4145\n4788#4,4:4157\n4788#4,4:4164\n4788#4,4:4168\n4788#4,4:4174\n4788#4,4:4201\n4788#4,4:4205\n4788#4,4:4209\n4788#4,4:4215\n4809#4:4219\n4788#4,4:4220\n4809#4:4224\n4788#4,4:4225\n4809#4:4229\n4788#4,4:4230\n4809#4:4234\n4788#4,4:4235\n4809#4:4241\n4788#4,4:4242\n4809#4:4246\n4788#4,4:4247\n4809#4:4259\n4788#4,4:4260\n4809#4:4286\n4788#4,4:4287\n4788#4,4:4299\n4788#4,4:4306\n4788#4,4:4319\n1#5:4074\n1#5:4076\n1#5:4255\n1#5:4268\n679#6:4075\n49#7,4:4105\n49#7,4:4128\n49#7,4:4136\n49#7,4:4335\n49#7,4:4339\n49#7,4:4343\n49#7,4:4348\n49#7,4:4353\n49#7,4:4357\n381#8,7:4109\n287#9,6:4151\n905#10:4184\n65#11:4190\n27#12,2:4213\n27#12,2:4294\n27#12,2:4296\n27#12,2:4314\n27#12,2:4316\n175#13,4:4251\n180#13,3:4256\n175#13,4:4264\n180#13,3:4269\n34#14,5:4323\n82#14,2:4367\n34#14,5:4369\n84#14:4374\n223#14,2:4375\n64#14,5:4377\n225#14:4382\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n*L\n2098#1:4178,6\n2098#1:4185,5\n2098#1:4191,10\n1345#1:4062\n1356#1:4063\n1359#1:4064\n1362#1:4065\n1367#1:4066\n1376#1:4067\n1407#1:4068\n1528#1:4091\n1544#1:4100\n1883#1:4149\n1901#1:4150\n1923#1:4161\n1958#1:4162\n1961#1:4163\n2010#1:4172\n2010#1:4173\n2511#1:4239\n2513#1:4240\n2625#1:4272,6\n2631#1:4278\n2633#1:4279\n2641#1:4280\n2644#1:4281\n2667#1:4282\n2679#1:4283\n2717#1:4284,2\n2762#1:4291\n2766#1:4292,2\n2812#1:4298\n2816#1:4303,2\n2824#1:4305\n2828#1:4310,2\n2906#1:4312,2\n3022#1:4318\n3162#1:4328\n3164#1:4329\n3166#1:4330\n3168#1:4331\n3170#1:4332\n3171#1:4333\n3203#1:4334\n3228#1:4347\n3234#1:4352\n3263#1:4361\n3269#1:4362\n3276#1:4363,2\n3285#1:4365\n3285#1:4366\n1435#1:4069\n1771#1:4140\n1460#1:4070,4\n1494#1:4077,4\n1512#1:4081\n1512#1:4082,4\n1517#1:4086\n1517#1:4087,4\n1528#1:4092,4\n1541#1:4096,4\n1544#1:4101,4\n1623#1:4116,4\n1637#1:4120,4\n1730#1:4124,4\n1735#1:4132,4\n1771#1:4141,4\n1780#1:4145,4\n1920#1:4157,4\n1982#1:4164,4\n1987#1:4168,4\n2015#1:4174,4\n2163#1:4201,4\n2164#1:4205,4\n2175#1:4209,4\n2265#1:4215,4\n2484#1:4219\n2484#1:4220,4\n2485#1:4224\n2485#1:4225,4\n2486#1:4229\n2486#1:4230,4\n2489#1:4234\n2489#1:4235,4\n2518#1:4241\n2518#1:4242,4\n2534#1:4246\n2534#1:4247,4\n2604#1:4259\n2604#1:4260,4\n2760#1:4286\n2760#1:4287,4\n2813#1:4299,4\n2825#1:4306,4\n3022#1:4319,4\n1479#1:4076\n2570#1:4255\n2612#1:4268\n1479#1:4075\n1554#1:4105,4\n1731#1:4128,4\n1769#1:4136,4\n3205#1:4335,4\n3209#1:4339,4\n3213#1:4343,4\n3229#1:4348,4\n3237#1:4353,4\n3241#1:4357,4\n1594#1:4109,7\n1906#1:4151,6\n2115#1:4184\n2130#1:4190\n2232#1:4213,2\n2786#1:4294,2\n2794#1:4296,2\n2940#1:4314,2\n2946#1:4316,2\n2570#1:4251,4\n2570#1:4256,3\n2612#1:4264,4\n2612#1:4269,3\n3118#1:4323,5\n3295#1:4367,2\n3295#1:4369,5\n3295#1:4374\n3299#1:4375,2\n3299#1:4377,5\n3299#1:4382\n*E\n"})
public final class z5 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public static final a f36875y = new a(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f36876z = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final w5 f36877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private int[] f36878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private Object[] f36879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private ArrayList<g> f36880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private HashMap<g, l2> f36881e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private androidx.collection.t1<androidx.collection.u1> f36882f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f36883g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f36884h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f36885i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f36886j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f36887k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f36888l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f36889m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f36890n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f36891o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private androidx.collection.t1<androidx.collection.g2<Object>> f36895s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f36896t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f36897u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f36899w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    private androidx.collection.r1 f36900x;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private final p2 f36892p = new p2();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private final p2 f36893q = new p2();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private final p2 f36894r = new p2();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f36898v = -1;

    @SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter$Companion\n+ 2 ArrayUtils.android.kt\nandroidx/compose/runtime/collection/ArrayUtils_androidKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,4061:1\n27#2,2:4062\n3850#3,2:4064\n3847#3:4067\n3850#3,2:4068\n3881#3,2:4070\n3767#3:4081\n3833#3:4082\n1#4:4066\n34#5,5:4072\n4788#6,4:4077\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter$Companion\n*L\n2316#1:4062,2\n2326#1:4064,2\n2336#1:4067\n2337#1:4068,2\n2356#1:4070,2\n2459#1:4081\n2459#1:4082\n2395#1:4072,5\n2455#1:4077,4\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<g> b(z5 z5Var, int i10, z5 z5Var2, boolean z10, boolean z11, boolean z12) {
            boolean zH1;
            List<g> listEmptyList;
            int iT0 = z5Var.t0(i10);
            int i11 = i10 + iT0;
            int iQ = z5Var.Q(i10);
            int iQ2 = z5Var.Q(i11);
            int i12 = iQ2 - iQ;
            boolean zN = z5Var.N(i10);
            z5Var2.B0(iT0);
            z5Var2.C0(i12, z5Var2.h0());
            if (z5Var.f36883g < i11) {
                z5Var.N0(i11);
            }
            if (z5Var.f36887k < iQ2) {
                z5Var.P0(iQ2, i11);
            }
            int[] iArr = z5Var2.f36878b;
            int iH0 = z5Var2.h0();
            int i13 = iH0 * 5;
            ArraysKt.copyInto(z5Var.f36878b, iArr, i13, i10 * 5, i11 * 5);
            Object[] objArr = z5Var2.f36879c;
            int i14 = z5Var2.f36885i;
            System.arraycopy(z5Var.f36879c, iQ, objArr, i14, i12);
            int iK0 = z5Var2.k0();
            iArr[i13 + 2] = iK0;
            int i15 = iH0 - i10;
            int i16 = iH0 + iT0;
            int iR = i14 - z5Var2.R(iArr, iH0);
            int i17 = z5Var2.f36889m;
            int i18 = z5Var2.f36888l;
            int length = objArr.length;
            int i19 = i17;
            int i20 = iH0;
            while (true) {
                zH1 = false;
                if (i20 >= i16) {
                    break;
                }
                if (i20 != iH0) {
                    int i21 = (i20 * 5) + 2;
                    iArr[i21] = iArr[i21] + i15;
                }
                int[] iArr2 = iArr;
                int i22 = iH0;
                iArr2[(i20 * 5) + 4] = z5Var2.T(z5Var2.R(iArr, i20) + iR, i19 >= i20 ? z5Var2.f36887k : 0, i18, length);
                if (i20 == i19) {
                    i19++;
                }
                i20++;
                iH0 = i22;
                iArr = iArr2;
            }
            int[] iArr3 = iArr;
            z5Var2.f36889m = i19;
            int iX = y5.X(z5Var.f36880d, i10, z5Var.l0());
            int iX2 = y5.X(z5Var.f36880d, i11, z5Var.l0());
            if (iX < iX2) {
                ArrayList arrayList = z5Var.f36880d;
                ArrayList arrayList2 = new ArrayList(iX2 - iX);
                for (int i23 = iX; i23 < iX2; i23++) {
                    g gVar = (g) arrayList.get(i23);
                    gVar.c(gVar.a() + i15);
                    arrayList2.add(gVar);
                }
                z5Var2.f36880d.addAll(y5.X(z5Var2.f36880d, z5Var2.h0(), z5Var2.l0()), arrayList2);
                arrayList.subList(iX, iX2).clear();
                listEmptyList = arrayList2;
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            List<g> list = listEmptyList;
            if (!list.isEmpty()) {
                HashMap map = z5Var.f36881e;
                HashMap map2 = z5Var2.f36881e;
                if (map != null && map2 != null) {
                    int size = list.size();
                    for (int i24 = 0; i24 < size; i24++) {
                        g gVar2 = listEmptyList.get(i24);
                        l2 l2Var = (l2) map.get(gVar2);
                        if (l2Var != null) {
                            map.remove(gVar2);
                            map2.put(gVar2, l2Var);
                        }
                    }
                }
            }
            int iK1 = z5Var2.k0();
            l2 l2VarA1 = z5Var2.A1(iK0);
            if (l2VarA1 != null) {
                int iM = iK1 + 1;
                int iH1 = z5Var2.h0();
                int i25 = -1;
                while (iM < iH1) {
                    i25 = iM;
                    iM = y5.M(z5Var2.f36878b, iM) + iM;
                }
                l2VarA1.b(z5Var2, i25, iH1);
            }
            int iV0 = z5Var.V0(i10);
            if (z12) {
                if (z10) {
                    boolean z13 = iV0 >= 0;
                    if (z13) {
                        z5Var.D1();
                        z5Var.B(iV0 - z5Var.h0());
                        z5Var.D1();
                    }
                    z5Var.B(i10 - z5Var.h0());
                    boolean zG1 = z5Var.g1();
                    if (z13) {
                        z5Var.s1();
                        z5Var.V();
                        z5Var.s1();
                        z5Var.V();
                    }
                    zH1 = zG1;
                } else {
                    zH1 = z5Var.h1(i10, iT0);
                    z5Var.i1(iQ, i12, i10 - 1);
                }
            }
            if (zH1) {
                m0.y("Unexpectedly removed anchors");
            }
            int i26 = z5Var2.f36891o;
            int i27 = iArr3[i13 + 1];
            z5Var2.f36891o = i26 + ((1073741824 & i27) == 0 ? i27 & androidx.compose.ui.spatial.e.f41245c : 1);
            if (z11) {
                z5Var2.f36896t = i16;
                z5Var2.f36885i = i14 + i12;
            }
            if (zN) {
                z5Var2.Q1(iK0);
            }
            return listEmptyList;
        }

        static /* synthetic */ List c(a aVar, z5 z5Var, int i10, z5 z5Var2, boolean z10, boolean z11, boolean z12, int i11, Object obj) {
            if ((i11 & 32) != 0) {
                z12 = true;
            }
            return aVar.b(z5Var, i10, z5Var2, z10, z11, z12);
        }

        private a() {
        }
    }

    public static final class b implements Iterator<Object>, qj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f36901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f36902b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ z5 f36903c;

        b(int i10, int i11, z5 z5Var) {
            this.f36902b = i11;
            this.f36903c = z5Var;
            this.f36901a = i10;
        }

        public final int b() {
            return this.f36901a;
        }

        public final void c(int i10) {
            this.f36901a = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f36901a < this.f36902b;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                return null;
            }
            Object[] objArr = this.f36903c.f36879c;
            z5 z5Var = this.f36903c;
            int i10 = this.f36901a;
            this.f36901a = i10 + 1;
            return objArr[z5Var.S(i10)];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public z5(@NotNull w5 w5Var) {
        this.f36877a = w5Var;
        this.f36878b = w5Var.D();
        this.f36879c = w5Var.G();
        this.f36880d = w5Var.B();
        this.f36881e = w5Var.J();
        this.f36882f = w5Var.C();
        this.f36883g = w5Var.F();
        this.f36884h = (this.f36878b.length / 5) - w5Var.F();
        this.f36887k = w5Var.e2();
        this.f36888l = this.f36879c.length - w5Var.e2();
        this.f36889m = w5Var.F();
        this.f36897u = w5Var.F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B0(int i10) {
        if (i10 > 0) {
            int i11 = this.f36896t;
            N0(i11);
            int i12 = this.f36883g;
            int i13 = this.f36884h;
            int[] iArr = this.f36878b;
            int length = iArr.length / 5;
            int i14 = length - i13;
            int i15 = 0;
            if (i13 < i10) {
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                int[] iArr2 = new int[iMax * 5];
                int i16 = iMax - i14;
                ArraysKt.copyInto(iArr, iArr2, 0, 0, i12 * 5);
                ArraysKt.copyInto(iArr, iArr2, (i12 + i16) * 5, (i13 + i12) * 5, length * 5);
                this.f36878b = iArr2;
                i13 = i16;
            }
            int i17 = this.f36897u;
            if (i17 >= i12) {
                this.f36897u = i17 + i10;
            }
            int i18 = i12 + i10;
            this.f36883g = i18;
            this.f36884h = i13 - i10;
            int iQ = i14 > 0 ? Q(i11 + i10) : 0;
            if (this.f36889m >= i12) {
                i15 = this.f36887k;
            }
            int iT = T(iQ, i15, this.f36888l, this.f36879c.length);
            for (int i19 = i12; i19 < i18; i19++) {
                this.f36878b[(i19 * 5) + 4] = iT;
            }
            int i20 = this.f36889m;
            if (i20 >= i12) {
                this.f36889m = i20 + i10;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C0(int i10, int i11) {
        if (i10 > 0) {
            P0(this.f36885i, i11);
            int i12 = this.f36887k;
            int i13 = this.f36888l;
            if (i13 < i10) {
                Object[] objArr = this.f36879c;
                int length = objArr.length;
                int i14 = length - i13;
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i15 = 0; i15 < iMax; i15++) {
                    objArr2[i15] = null;
                }
                int i16 = iMax - i14;
                int i17 = i13 + i12;
                System.arraycopy(objArr, 0, objArr2, 0, i12);
                System.arraycopy(objArr, i17, objArr2, i12 + i16, length - i17);
                this.f36879c = objArr2;
                i13 = i16;
            }
            int i18 = this.f36886j;
            if (i18 >= i12) {
                this.f36886j = i18 + i10;
            }
            this.f36887k = i12 + i10;
            this.f36888l = i13 - i10;
        }
    }

    public static /* synthetic */ g D(z5 z5Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = z5Var.f36896t;
        }
        return z5Var.C(i10);
    }

    private final int G(int[] iArr, int i10) {
        return R(iArr, i10) + Integer.bitCount(iArr[(i10 * 5) + 1] >> 29);
    }

    private final List<Integer> G0() {
        List listW = y5.W(this.f36878b, 0, 1, null);
        ArrayList arrayList = new ArrayList(listW.size());
        int size = listW.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = listW.get(i10);
            ((Number) obj).intValue();
            int i11 = this.f36883g;
            if (i10 < i11 || i10 >= i11 + this.f36884h) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v2 */
    private final void G1(int i10, Object obj, boolean z10, Object obj2) {
        int iM;
        l2 l2VarA1;
        int i11 = this.f36898v;
        Object[] objArr = this.f36890n > 0;
        this.f36894r.k(this.f36891o);
        if (objArr == true) {
            int i12 = this.f36896t;
            int iR = R(this.f36878b, q0(i12));
            B0(1);
            this.f36885i = iR;
            this.f36886j = iR;
            int iQ0 = q0(i12);
            c0.a aVar = c0.f35327a;
            ?? r12 = obj != aVar.a() ? 1 : 0;
            ?? r13 = (z10 || obj2 == aVar.a()) ? 0 : 1;
            int iT = T(iR, this.f36887k, this.f36888l, this.f36879c.length);
            if (iT >= 0 && this.f36889m < i12) {
                iT = -(((this.f36879c.length - this.f36888l) - iT) + 1);
            }
            y5.S(this.f36878b, iQ0, i10, z10, r12, r13, this.f36898v, iT);
            int i13 = (z10 ? 1 : 0) + r12 + r13;
            if (i13 > 0) {
                C0(i13, i12);
                Object[] objArr2 = this.f36879c;
                int i14 = this.f36885i;
                if (z10) {
                    objArr2[i14] = obj2;
                    i14++;
                }
                if (r12 != 0) {
                    objArr2[i14] = obj;
                    i14++;
                }
                if (r13 != 0) {
                    objArr2[i14] = obj2;
                    i14++;
                }
                this.f36885i = i14;
            }
            this.f36891o = 0;
            iM = i12 + 1;
            this.f36898v = i12;
            this.f36896t = iM;
            if (i11 >= 0 && (l2VarA1 = A1(i11)) != null) {
                l2VarA1.o(this, i12);
            }
        } else {
            this.f36892p.k(i11);
            l1();
            int i15 = this.f36896t;
            int iQ1 = q0(i15);
            if (!Intrinsics.areEqual(obj2, c0.f35327a.a())) {
                if (z10) {
                    U1(obj2);
                } else {
                    P1(obj2);
                }
            }
            this.f36885i = v1(this.f36878b, iQ1);
            this.f36886j = R(this.f36878b, q0(this.f36896t + 1));
            int[] iArr = this.f36878b;
            this.f36891o = iArr[(iQ1 * 5) + 1] & androidx.compose.ui.spatial.e.f41245c;
            this.f36898v = i15;
            this.f36896t = i15 + 1;
            iM = i15 + y5.M(iArr, iQ1);
        }
        this.f36897u = iM;
    }

    public static /* synthetic */ void I0(z5 z5Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = z5Var.f36898v;
        }
        z5Var.H0(i10);
    }

    private final boolean J(int i10) {
        int iT0 = i10 + 1;
        int iT1 = i10 + t0(i10);
        while (iT0 < iT1) {
            if ((this.f36878b[(q0(iT0) * 5) + 1] & 201326592) != 0) {
                return true;
            }
            iT0 += t0(iT0);
        }
        return false;
    }

    private final void J0(int i10, int i11, int i12) {
        g gVar;
        int iE;
        int i13 = i12 + i10;
        int iL0 = l0();
        int iX = y5.X(this.f36880d, i10, iL0);
        ArrayList arrayList = new ArrayList();
        if (iX >= 0) {
            while (iX < this.f36880d.size() && (iE = E((gVar = this.f36880d.get(iX)))) >= i10 && iE < i13) {
                arrayList.add(gVar);
                this.f36880d.remove(iX);
            }
        }
        int i14 = i11 - i10;
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            g gVar2 = (g) arrayList.get(i15);
            int iE2 = E(gVar2) + i14;
            if (iE2 >= this.f36883g) {
                gVar2.c(-(iL0 - iE2));
            } else {
                gVar2.c(iE2);
            }
            this.f36880d.add(y5.X(this.f36880d, iE2, iL0), gVar2);
        }
    }

    private final void L() {
        int i10 = this.f36887k;
        ArraysKt.fill(this.f36879c, (Object) null, i10, this.f36888l + i10);
    }

    public static /* synthetic */ List L0(z5 z5Var, w5 w5Var, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = true;
        }
        return z5Var.K0(w5Var, i10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean N(int i10) {
        return i10 >= 0 && (this.f36878b[(q0(i10) * 5) + 1] & 201326592) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N0(int i10) {
        int i11 = this.f36884h;
        int i12 = this.f36883g;
        if (i12 != i10) {
            if (!this.f36880d.isEmpty()) {
                O1(i12, i10);
            }
            if (i11 > 0) {
                int[] iArr = this.f36878b;
                int i13 = i10 * 5;
                int i14 = i11 * 5;
                int i15 = i12 * 5;
                if (i10 < i12) {
                    ArraysKt.copyInto(iArr, iArr, i14 + i13, i13, i15);
                } else {
                    ArraysKt.copyInto(iArr, iArr, i15, i15 + i14, i13 + i14);
                }
            }
            if (i10 < i12) {
                i12 = i10 + i11;
            }
            int iD0 = d0();
            if (!(i12 < iD0)) {
                m0.y("Check failed");
            }
            while (i12 < iD0) {
                int i16 = (i12 * 5) + 2;
                int i17 = this.f36878b[i16];
                int iZ0 = Z0(Y0(i17), i10);
                if (iZ0 != i17) {
                    this.f36878b[i16] = iZ0;
                }
                i12++;
                if (i12 == i10) {
                    i12 += i11;
                }
            }
        }
        this.f36883g = i10;
    }

    private final boolean O(int i10) {
        return i10 >= 0 && (this.f36878b[(q0(i10) * 5) + 1] & 67108864) != 0;
    }

    private final void O1(int i10, int i11) {
        g gVar;
        int iA;
        g gVar2;
        int iA2;
        int i12;
        int iD0 = d0() - this.f36884h;
        if (i10 < i11) {
            for (int iX = y5.X(this.f36880d, i10, iD0); iX < this.f36880d.size() && (iA2 = (gVar2 = this.f36880d.get(iX)).a()) < 0 && (i12 = iA2 + iD0) < i11; iX++) {
                gVar2.c(i12);
            }
        } else {
            for (int iX2 = y5.X(this.f36880d, i11, iD0); iX2 < this.f36880d.size() && (iA = (gVar = this.f36880d.get(iX2)).a()) >= 0; iX2++) {
                gVar.c(-(iD0 - iA));
            }
        }
    }

    private final int P(int i10, int i11, int i12) {
        return i10 < 0 ? (i12 - i11) + i10 + 1 : i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P0(int i10, int i11) {
        int i12 = this.f36888l;
        int i13 = this.f36887k;
        int i14 = this.f36889m;
        if (i13 != i10) {
            Object[] objArr = this.f36879c;
            if (i10 < i13) {
                System.arraycopy(objArr, i10, objArr, i10 + i12, i13 - i10);
            } else {
                int i15 = i13 + i12;
                System.arraycopy(objArr, i15, objArr, i13, (i10 + i12) - i15);
            }
        }
        int iMin = Math.min(i11 + 1, l0());
        if (i14 != iMin) {
            int length = this.f36879c.length - i12;
            if (iMin < i14) {
                int iQ0 = q0(iMin);
                int iQ1 = q0(i14);
                int i16 = this.f36883g;
                while (iQ0 < iQ1) {
                    int i17 = (iQ0 * 5) + 4;
                    int i18 = this.f36878b[i17];
                    if (!(i18 >= 0)) {
                        m0.y("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f36878b[i17] = -((length - i18) + 1);
                    iQ0++;
                    if (iQ0 == i16) {
                        iQ0 += this.f36884h;
                    }
                }
            } else {
                int iQ2 = q0(i14);
                int iQ3 = q0(iMin);
                while (iQ2 < iQ3) {
                    int i19 = (iQ2 * 5) + 4;
                    int i20 = this.f36878b[i19];
                    if (!(i20 < 0)) {
                        m0.y("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f36878b[i19] = i20 + length + 1;
                    iQ2++;
                    if (iQ2 == this.f36883g) {
                        iQ2 += this.f36884h;
                    }
                }
            }
            this.f36889m = iMin;
        }
        this.f36887k = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int Q(int i10) {
        return R(this.f36878b, q0(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q1(int i10) {
        if (i10 >= 0) {
            androidx.collection.r1 r1VarD = this.f36900x;
            if (r1VarD == null) {
                r1VarD = i4.d(null, 1, null);
                this.f36900x = r1VarD;
            }
            i4.a(r1VarD, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int R(int[] iArr, int i10) {
        return i10 >= d0() ? this.f36879c.length - this.f36888l : P(iArr[(i10 * 5) + 4], this.f36888l, this.f36879c.length);
    }

    private final void R1(int i10, androidx.collection.r1 r1Var) {
        int iQ0 = q0(i10);
        boolean zJ = J(i10);
        int[] iArr = this.f36878b;
        if (((iArr[(iQ0 * 5) + 1] & 67108864) != 0) != zJ) {
            y5.m0(iArr, iQ0, zJ);
            int iV0 = V0(i10);
            if (iV0 >= 0) {
                i4.a(r1Var, iV0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int S(int i10) {
        return i10 + (this.f36888l * (i10 < this.f36887k ? 0 : 1));
    }

    private final void S1(int[] iArr, int i10, int i11) {
        iArr[(i10 * 5) + 4] = T(i11, this.f36887k, this.f36888l, this.f36879c.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int T(int i10, int i11, int i12, int i13) {
        return i10 > i11 ? -(((i13 - i12) - i10) + 1) : i10;
    }

    private final List<Integer> U(int[] iArr) {
        List listF = y5.F(this.f36878b, 0, 1, null);
        List listPlus = CollectionsKt.plus((Collection) CollectionsKt.slice(listF, kotlin.ranges.r.W1(0, this.f36883g)), (Iterable) CollectionsKt.slice(listF, kotlin.ranges.r.W1(this.f36883g + this.f36884h, iArr.length / 5)));
        ArrayList arrayList = new ArrayList(listPlus.size());
        int size = listPlus.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(Integer.valueOf(P(((Number) listPlus.get(i10)).intValue(), this.f36888l, this.f36879c.length)));
        }
        return arrayList;
    }

    private final int U0(int[] iArr, int i10) {
        return R(iArr, i10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    private final void V1(int i10, Object obj) {
        boolean z10;
        int iQ0 = q0(i10);
        int[] iArr = this.f36878b;
        if (iQ0 < iArr.length) {
            z10 = (iArr[(iQ0 * 5) + 1] & 1073741824) != 0;
        }
        if (!z10) {
            m0.y("Updating the node of a group at " + i10 + " that was not created with as a node group");
        }
        this.f36879c[S(U0(this.f36878b, iQ0))] = obj;
    }

    private final int X0(int[] iArr, int i10) {
        return Y0(iArr[(q0(i10) * 5) + 2]);
    }

    private final int Y0(int i10) {
        return i10 > -2 ? i10 : (l0() + i10) - (-2);
    }

    private final void Z(int i10, int i11, int i12) {
        int iZ0 = Z0(i10, this.f36883g);
        while (i12 < i11) {
            this.f36878b[(q0(i12) * 5) + 2] = iZ0;
            int iM = y5.M(this.f36878b, q0(i12)) + i12;
            Z(i12, iM, i12 + 1);
            i12 = iM;
        }
    }

    private final int Z0(int i10, int i11) {
        return i10 < i11 ? i10 : -((l0() - i10) + 2);
    }

    private final Object a1(Object obj) {
        Object objQ1 = q1();
        p1(obj);
        return objQ1;
    }

    private final void b1() {
        androidx.collection.r1 r1Var = this.f36900x;
        if (r1Var != null) {
            while (i4.i(r1Var)) {
                R1(i4.k(r1Var), r1Var);
            }
        }
    }

    private final int d0() {
        return this.f36878b.length / 5;
    }

    private final boolean f1(int i10, int i11, HashMap<g, l2> map) {
        int i12 = i11 + i10;
        int iX = y5.X(this.f36880d, i12, d0() - this.f36884h);
        if (iX >= this.f36880d.size()) {
            iX--;
        }
        int i13 = iX + 1;
        int i14 = 0;
        while (iX >= 0) {
            g gVar = this.f36880d.get(iX);
            int iE = E(gVar);
            if (iE < i10) {
                break;
            }
            if (iE < i12) {
                gVar.c(Integer.MIN_VALUE);
                if (map != null) {
                    map.remove(gVar);
                }
                if (i14 == 0) {
                    i14 = iX + 1;
                }
                i13 = iX;
            }
            iX--;
        }
        boolean z10 = i13 < i14;
        if (z10) {
            this.f36880d.subList(i13, i14).clear();
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean h1(int i10, int i11) {
        boolean zF1 = false;
        if (i11 > 0) {
            ArrayList<g> arrayList = this.f36880d;
            N0(i10);
            zF1 = arrayList.isEmpty() ? false : f1(i10, i11, this.f36881e);
            this.f36883g = i10;
            this.f36884h += i11;
            int i12 = this.f36889m;
            if (i12 > i10) {
                this.f36889m = Math.max(i10, i12 - i11);
            }
            int i13 = this.f36897u;
            if (i13 >= this.f36883g) {
                this.f36897u = i13 - i11;
            }
            int i14 = this.f36898v;
            if (O(i14)) {
                Q1(i14);
            }
        }
        return zF1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i1(int i10, int i11, int i12) {
        if (i11 > 0) {
            int i13 = this.f36888l;
            int i14 = i10 + i11;
            P0(i14, i12);
            this.f36887k = i10;
            this.f36888l = i13 + i11;
            ArraysKt.fill(this.f36879c, (Object) null, i10, i14);
            int i15 = this.f36886j;
            if (i15 >= i10) {
                this.f36886j = i15 - i11;
            }
        }
    }

    private final int j0() {
        return u0(this.f36898v);
    }

    private final int k1() {
        int iD0 = (d0() - this.f36884h) - this.f36893q.j();
        this.f36897u = iD0;
        return iD0;
    }

    private final void l1() {
        this.f36893q.k((d0() - this.f36884h) - this.f36897u);
    }

    private final void o0(StringBuilder sb2, int i10) {
        int iQ0 = q0(i10);
        sb2.append("Group(");
        if (i10 < 10) {
            sb2.append(' ');
        }
        if (i10 < 100) {
            sb2.append(' ');
        }
        if (i10 < 1000) {
            sb2.append(' ');
        }
        sb2.append(i10);
        if (iQ0 != i10) {
            sb2.append("(");
            sb2.append(iQ0);
            sb2.append(")");
        }
        sb2.append('#');
        sb2.append(y5.M(this.f36878b, iQ0));
        sb2.append('^');
        int i11 = iQ0 * 5;
        int i12 = i11 + 2;
        sb2.append(Y0(this.f36878b[i12]));
        sb2.append(": key=");
        sb2.append(this.f36878b[i11]);
        sb2.append(", nodes=");
        int i13 = i11 + 1;
        sb2.append(this.f36878b[i13] & androidx.compose.ui.spatial.e.f41245c);
        sb2.append(", dataAnchor=");
        sb2.append(this.f36878b[i11 + 4]);
        sb2.append(", parentAnchor=");
        sb2.append(this.f36878b[i12]);
        if ((this.f36878b[i13] & 1073741824) != 0) {
            sb2.append(", node=" + y5.j0(String.valueOf(this.f36879c[S(U0(this.f36878b, iQ0))]), 10));
        }
        int iV1 = v1(this.f36878b, iQ0);
        int iR = R(this.f36878b, q0(i10 + 1));
        if (iR > iV1) {
            sb2.append(", [");
            for (int i14 = iV1; i14 < iR; i14++) {
                if (i14 != iV1) {
                    sb2.append(", ");
                }
                sb2.append(y5.j0(String.valueOf(this.f36879c[S(i14)]), 10));
            }
            sb2.append(AbstractJsonLexerKt.END_LIST);
        }
        sb2.append(")");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int q0(int i10) {
        return i10 + (this.f36884h * (i10 < this.f36883g ? 0 : 1));
    }

    private final int v1(int[] iArr, int i10) {
        return i10 >= d0() ? this.f36879c.length - this.f36888l : P(y5.i0(iArr, i10), this.f36888l, this.f36879c.length);
    }

    private final l2 w0(int i10, String str) {
        HashMap<g, l2> map = this.f36881e;
        if (map == null) {
            return null;
        }
        g gVarC = C(i10);
        l2 l2Var = map.get(gVarC);
        if (l2Var == null) {
            l2Var = new l2(0, str, 0);
            if (str == null) {
                int iM = i10 + 1;
                int i11 = this.f36896t;
                while (iM < i11) {
                    l2Var.o(this, iM);
                    iM += y5.M(this.f36878b, iM);
                }
            }
            map.put(gVarC, l2Var);
        }
        return l2Var;
    }

    public final void A0(@Nullable Object obj) {
        if (!(this.f36890n >= 0)) {
            m0.y("Cannot insert auxiliary data when not inserting");
        }
        int i10 = this.f36898v;
        int iQ0 = q0(i10);
        if ((this.f36878b[(iQ0 * 5) + 1] & 268435456) != 0) {
            m0.y("Group already has auxiliary data");
        }
        C0(1, i10);
        int iG = G(this.f36878b, iQ0);
        int iS = S(iG);
        int i11 = this.f36885i;
        if (i11 > iG) {
            int i12 = i11 - iG;
            if (!(i12 < 3)) {
                f4.e("Moving more than two slot not supported");
            }
            if (i12 > 1) {
                Object[] objArr = this.f36879c;
                objArr[iS + 2] = objArr[iS + 1];
            }
            Object[] objArr2 = this.f36879c;
            objArr2[iS + 1] = objArr2[iS];
        }
        y5.x(this.f36878b, iQ0);
        this.f36879c[iS] = obj;
        this.f36885i++;
    }

    @Nullable
    public final l2 A1(int i10) {
        g gVarM1;
        HashMap<g, l2> map = this.f36881e;
        if (map == null || (gVarM1 = M1(i10)) == null) {
            return null;
        }
        return map.get(gVarM1);
    }

    public final void B(int i10) {
        boolean z10 = false;
        if (!(i10 >= 0)) {
            m0.y("Cannot seek backwards");
        }
        if (!(this.f36890n <= 0)) {
            f4.e("Cannot call seek() while inserting");
        }
        if (i10 == 0) {
            return;
        }
        int i11 = this.f36896t + i10;
        if (i11 >= this.f36898v && i11 <= this.f36897u) {
            z10 = true;
        }
        if (!z10) {
            m0.y("Cannot seek outside the current group (" + this.f36898v + org.apache.commons.codec.language.l.f335457d + this.f36897u + ')');
        }
        this.f36896t = i11;
        int iR = R(this.f36878b, q0(i11));
        this.f36885i = iR;
        this.f36886j = iR;
    }

    public final void B1(int i10, @Nullable Object obj) {
        G1(i10, c0.f35327a.a(), false, obj);
    }

    @NotNull
    public final g C(int i10) {
        ArrayList<g> arrayList = this.f36880d;
        int iG0 = y5.g0(arrayList, i10, l0());
        if (iG0 >= 0) {
            return arrayList.get(iG0);
        }
        if (i10 > this.f36883g) {
            i10 = -(l0() - i10);
        }
        g gVar = new g(i10);
        arrayList.add(-(iG0 + 1), gVar);
        return gVar;
    }

    public final void C1(int i10, @Nullable Object obj, @Nullable Object obj2) {
        G1(i10, obj, false, obj2);
    }

    public final boolean D0() {
        return this.f36896t == this.f36897u;
    }

    public final void D1() {
        if (!(this.f36890n == 0)) {
            m0.y("Key must be supplied when inserting");
        }
        c0.a aVar = c0.f35327a;
        G1(0, aVar.a(), false, aVar.a());
    }

    public final int E(@NotNull g gVar) {
        int iA = gVar.a();
        return iA < 0 ? l0() + iA : iA;
    }

    public final boolean E0() {
        int i10 = this.f36896t;
        return i10 < this.f36897u && (this.f36878b[(q0(i10) * 5) + 1] & 1073741824) != 0;
    }

    public final void E1(int i10) {
        c0.a aVar = c0.f35327a;
        G1(i10, aVar.a(), false, aVar.a());
    }

    public final void F(@NotNull g gVar, @Nullable Object obj) {
        if (!(this.f36890n == 0)) {
            m0.y("Can only append a slot if not current inserting");
        }
        int i10 = this.f36885i;
        int i11 = this.f36886j;
        int iE = E(gVar);
        int iR = R(this.f36878b, q0(iE + 1));
        this.f36885i = iR;
        this.f36886j = iR;
        C0(1, iE);
        if (i10 >= iR) {
            i10++;
            i11++;
        }
        this.f36879c[iR] = obj;
        this.f36885i = i10;
        this.f36886j = i11;
    }

    public final boolean F0(int i10) {
        return (this.f36878b[(q0(i10) * 5) + 1] & 1073741824) != 0;
    }

    public final void F1(int i10, @Nullable Object obj) {
        G1(i10, obj, false, c0.f35327a.a());
    }

    public final void H() {
        y5.o0(this.f36878b, this.f36896t, -3);
    }

    public final void H0(int i10) {
        int iQ0 = q0(i10);
        int[] iArr = this.f36878b;
        int i11 = (iQ0 * 5) + 1;
        if ((iArr[i11] & androidx.media3.common.j.W0) != 0) {
            return;
        }
        y5.q0(iArr, iQ0, true);
        if ((this.f36878b[i11] & 67108864) != 0) {
            return;
        }
        Q1(V0(i10));
    }

    public final void H1(int i10, @Nullable Object obj) {
        G1(i10, obj, true, c0.f35327a.a());
    }

    public final void I() {
        int i10 = this.f36890n;
        this.f36890n = i10 + 1;
        if (i10 == 0) {
            l1();
        }
    }

    public final void I1(int i10, @Nullable Object obj, @Nullable Object obj2) {
        G1(i10, obj, true, obj2);
    }

    @NotNull
    public final String J1() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(toString());
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append("  parent:    " + this.f36898v);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append("  current:   " + this.f36896t);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append("  group gap: " + this.f36883g + org.apache.commons.codec.language.l.f335457d + (this.f36883g + this.f36884h) + '(' + this.f36884h + ')');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append("  slots gap: " + this.f36887k + org.apache.commons.codec.language.l.f335457d + (this.f36887k + this.f36888l) + '(' + this.f36888l + ')');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("  gap owner: ");
        sb3.append(this.f36889m);
        sb2.append(sb3.toString());
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        int iL0 = l0();
        for (int i10 = 0; i10 < iL0; i10++) {
            o0(sb2, i10);
            sb2.append('\n');
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Nullable
    public final Object K(int i10) {
        int iS = S(i10);
        Object[] objArr = this.f36879c;
        Object obj = objArr[iS];
        objArr[iS] = c0.f35327a.a();
        return obj;
    }

    @NotNull
    public final List<g> K0(@NotNull w5 w5Var, int i10, boolean z10) {
        boolean z11 = false;
        if (!(this.f36890n > 0 ? true : z11)) {
            m0.y("Check failed");
        }
        if (i10 != 0 || this.f36896t != 0 || this.f36877a.F() != 0 || y5.M(w5Var.D(), i10) != w5Var.F()) {
            z5 z5VarA0 = w5Var.a0();
            try {
                return f36875y.b(z5VarA0, i10, this, true, true, z10);
            } finally {
                z5VarA0.M(z11);
            }
        }
        int[] iArr = this.f36878b;
        Object[] objArr = this.f36879c;
        ArrayList<g> arrayList = this.f36880d;
        HashMap<g, l2> map = this.f36881e;
        androidx.collection.t1<androidx.collection.u1> t1Var = this.f36882f;
        int[] iArrD = w5Var.D();
        int iF = w5Var.F();
        Object[] objArrG = w5Var.G();
        int iE2 = w5Var.e2();
        HashMap<g, l2> mapJ = w5Var.J();
        androidx.collection.t1<androidx.collection.u1> t1VarC = w5Var.C();
        this.f36878b = iArrD;
        this.f36879c = objArrG;
        this.f36880d = w5Var.B();
        this.f36883g = iF;
        this.f36884h = (iArrD.length / 5) - iF;
        this.f36887k = iE2;
        this.f36888l = objArrG.length - iE2;
        this.f36889m = iF;
        this.f36881e = mapJ;
        this.f36882f = t1VarC;
        w5Var.m0(iArr, 0, objArr, 0, arrayList, map, t1Var);
        return this.f36880d;
    }

    public final void K1(int i10, @NotNull Function1<? super Integer, Unit> function1, @NotNull Function1<? super Integer, Unit> function2) {
        int iV0 = V0(i10);
        int iL0 = l0();
        int iT0 = t0(i10) + i10;
        int i11 = i10;
        while (i11 < iT0) {
            function1.invoke(Integer.valueOf(i11));
            int i12 = i11 + 1;
            int iV1 = i12 < iL0 ? V0(i12) : -1;
            if (iV1 != i11) {
                while (true) {
                    function2.invoke(Integer.valueOf(i11));
                    if (i11 == i10 || iV0 == iV1) {
                        break;
                    }
                    i11 = iV0;
                    iV0 = V0(iV0);
                }
            }
            i11 = i12;
            iV0 = iV1;
        }
    }

    public final void L1(int i10) {
        if (!(i10 > 0)) {
            m0.y("Check failed");
        }
        int i11 = this.f36898v;
        int iV1 = v1(this.f36878b, q0(i11));
        int iR = R(this.f36878b, q0(i11 + 1)) - i10;
        if (!(iR >= iV1)) {
            m0.y("Check failed");
        }
        i1(iR, i10, i11);
        int i12 = this.f36885i;
        if (i12 >= iV1) {
            this.f36885i = i12 - i10;
        }
    }

    public final void M(boolean z10) {
        this.f36899w = true;
        if (z10 && this.f36892p.f36312b == 0) {
            N0(l0());
            P0(this.f36879c.length - this.f36888l, this.f36883g);
            L();
            b1();
        }
        this.f36877a.m(this, this.f36878b, this.f36883g, this.f36879c, this.f36887k, this.f36880d, this.f36881e, this.f36882f);
    }

    public final void M0(int i10) {
        boolean z10 = true;
        if (!(this.f36890n == 0)) {
            m0.y("Cannot move a group while inserting");
        }
        if (!(i10 >= 0)) {
            m0.y("Parameter offset is out of bounds");
        }
        if (i10 == 0) {
            return;
        }
        int i11 = this.f36896t;
        int i12 = this.f36898v;
        int i13 = this.f36897u;
        int iM = i11;
        for (int i14 = i10; i14 > 0; i14--) {
            iM += y5.M(this.f36878b, q0(iM));
            if (!(iM <= i13)) {
                m0.y("Parameter offset is out of bounds");
            }
        }
        int iM2 = y5.M(this.f36878b, q0(iM));
        int iR = R(this.f36878b, q0(this.f36896t));
        int iR2 = R(this.f36878b, q0(iM));
        int i15 = iM + iM2;
        int iR3 = R(this.f36878b, q0(i15));
        int i16 = iR3 - iR2;
        C0(i16, Math.max(this.f36896t - 1, 0));
        B0(iM2);
        int[] iArr = this.f36878b;
        int iQ0 = q0(i15) * 5;
        ArraysKt.copyInto(iArr, iArr, q0(i11) * 5, iQ0, (iM2 * 5) + iQ0);
        if (i16 > 0) {
            Object[] objArr = this.f36879c;
            int iS = S(iR2 + i16);
            System.arraycopy(objArr, iS, objArr, iR, S(iR3 + i16) - iS);
        }
        int i17 = iR2 + i16;
        int i18 = i17 - iR;
        int i19 = this.f36887k;
        int i20 = this.f36888l;
        int length = this.f36879c.length;
        int i21 = this.f36889m;
        int i22 = i11 + iM2;
        int i23 = i11;
        while (i23 < i22) {
            boolean z11 = z10;
            int iQ1 = q0(i23);
            int i24 = i23;
            int i25 = i18;
            S1(iArr, iQ1, T(R(iArr, iQ1) - i18, i21 < iQ1 ? 0 : i19, i20, length));
            i23 = i24 + 1;
            z10 = z11;
            i18 = i25;
        }
        J0(i15, i11, iM2);
        if (h1(i15, iM2)) {
            m0.y("Unexpectedly removed anchors");
        }
        Z(i12, this.f36897u, i11);
        if (i16 > 0) {
            i1(i17, i16, i15 - 1);
        }
    }

    @Nullable
    public final g M1(int i10) {
        if (i10 < 0 || i10 >= l0()) {
            return null;
        }
        return y5.I(this.f36880d, i10, l0());
    }

    @Nullable
    public final Object N1(@Nullable Object obj) {
        if (this.f36890n <= 0 || this.f36885i == this.f36887k) {
            return a1(obj);
        }
        androidx.collection.t1<androidx.collection.g2<Object>> t1Var = this.f36895s;
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i10 = 1;
        int i11 = 0;
        if (t1Var == null) {
            t1Var = new androidx.collection.t1<>(i11, i10, defaultConstructorMarker);
        }
        this.f36895s = t1Var;
        int i12 = this.f36898v;
        androidx.collection.g2<Object> g2VarN = t1Var.n(i12);
        if (g2VarN == null) {
            g2VarN = new androidx.collection.g2<>(i11, i10, defaultConstructorMarker);
            t1Var.j0(i12, g2VarN);
        }
        g2VarN.a0(obj);
        return c0.f35327a.a();
    }

    @NotNull
    public final List<g> O0(int i10, @NotNull w5 w5Var, int i11) {
        if (!(this.f36890n <= 0 && t0(this.f36896t + i10) == 1)) {
            m0.y("Check failed");
        }
        int i12 = this.f36896t;
        int i13 = this.f36885i;
        int i14 = this.f36886j;
        B(i10);
        D1();
        I();
        z5 z5VarA0 = w5Var.a0();
        try {
            List<g> listC = a.c(f36875y, z5VarA0, i11, this, false, true, false, 32, null);
            z5VarA0.M(true);
            W();
            V();
            this.f36896t = i12;
            this.f36885i = i13;
            this.f36886j = i14;
            return listC;
        } catch (Throwable th2) {
            z5VarA0.M(false);
            throw th2;
        }
    }

    public final void P1(@Nullable Object obj) {
        int iQ0 = q0(this.f36896t);
        boolean z10 = true;
        if ((this.f36878b[(iQ0 * 5) + 1] & 268435456) == 0) {
            z10 = false;
        }
        if (!z10) {
            m0.y("Updating the data of a group that was not created with a data slot");
        }
        this.f36879c[S(G(this.f36878b, iQ0))] = obj;
    }

    @NotNull
    public final List<g> Q0(@NotNull g gVar, int i10, @NotNull z5 z5Var) {
        if (!(z5Var.f36890n > 0)) {
            m0.y("Check failed");
        }
        if (!(this.f36890n == 0)) {
            m0.y("Check failed");
        }
        if (!gVar.b()) {
            m0.y("Check failed");
        }
        int iE = E(gVar) + i10;
        int i11 = this.f36896t;
        if (!(i11 <= iE && iE < this.f36897u)) {
            m0.y("Check failed");
        }
        int iV0 = V0(iE);
        int iT0 = t0(iE);
        int iT1 = F0(iE) ? 1 : T0(iE);
        List<g> listC = a.c(f36875y, this, iE, z5Var, false, false, false, 32, null);
        Q1(iV0);
        boolean z10 = iT1 > 0;
        while (iV0 >= i11) {
            int iQ0 = q0(iV0);
            int[] iArr = this.f36878b;
            y5.p0(iArr, iQ0, y5.M(iArr, iQ0) - iT0);
            if (z10) {
                int[] iArr2 = this.f36878b;
                int i12 = iArr2[(iQ0 * 5) + 1];
                if ((1073741824 & i12) != 0) {
                    z10 = false;
                } else {
                    y5.r0(iArr2, iQ0, (i12 & androidx.compose.ui.spatial.e.f41245c) - iT1);
                }
            }
            iV0 = V0(iV0);
        }
        if (z10) {
            if (!(this.f36891o >= iT1)) {
                m0.y("Check failed");
            }
            this.f36891o -= iT1;
        }
        return listC;
    }

    @Nullable
    public final Object R0(int i10) {
        int iQ0 = q0(i10);
        int[] iArr = this.f36878b;
        if ((iArr[(iQ0 * 5) + 1] & 1073741824) != 0) {
            return this.f36879c[S(U0(iArr, iQ0))];
        }
        return null;
    }

    @Nullable
    public final Object S0(@NotNull g gVar) {
        return R0(gVar.e(this));
    }

    public final int T0(int i10) {
        return this.f36878b[(q0(i10) * 5) + 1] & androidx.compose.ui.spatial.e.f41245c;
    }

    public final void T1(@NotNull g gVar, @Nullable Object obj) {
        V1(gVar.e(this), obj);
    }

    public final void U1(@Nullable Object obj) {
        V1(this.f36896t, obj);
    }

    public final int V() {
        androidx.collection.g2<Object> g2VarN;
        boolean z10 = this.f36890n > 0;
        int i10 = this.f36896t;
        int i11 = this.f36897u;
        int i12 = this.f36898v;
        int iQ0 = q0(i12);
        int i13 = this.f36891o;
        int i14 = i10 - i12;
        int i15 = (iQ0 * 5) + 1;
        boolean z11 = (this.f36878b[i15] & 1073741824) != 0;
        if (z10) {
            androidx.collection.t1<androidx.collection.g2<Object>> t1Var = this.f36895s;
            if (t1Var != null && (g2VarN = t1Var.n(i12)) != null) {
                Object[] objArr = g2VarN.f12449a;
                int i16 = g2VarN.f12450b;
                for (int i17 = 0; i17 < i16; i17++) {
                    a1(objArr[i17]);
                }
                t1Var.e0(i12);
            }
            y5.p0(this.f36878b, iQ0, i14);
            y5.r0(this.f36878b, iQ0, i13);
            this.f36891o = this.f36894r.j() + (z11 ? 1 : i13);
            int iX0 = X0(this.f36878b, i12);
            this.f36898v = iX0;
            int iL0 = iX0 < 0 ? l0() : q0(iX0 + 1);
            int iR = iL0 >= 0 ? R(this.f36878b, iL0) : 0;
            this.f36885i = iR;
            this.f36886j = iR;
            return i13;
        }
        if (!(i10 == i11)) {
            m0.y("Expected to be at the end of a group");
        }
        int iM = y5.M(this.f36878b, iQ0);
        int[] iArr = this.f36878b;
        int i18 = iArr[i15] & androidx.compose.ui.spatial.e.f41245c;
        y5.p0(iArr, iQ0, i14);
        y5.r0(this.f36878b, iQ0, i13);
        int iJ = this.f36892p.j();
        k1();
        this.f36898v = iJ;
        int iX1 = X0(this.f36878b, i12);
        int iJ2 = this.f36894r.j();
        this.f36891o = iJ2;
        if (iX1 == iJ) {
            this.f36891o = iJ2 + (z11 ? 0 : i13 - i18);
            return i13;
        }
        int i19 = i14 - iM;
        int i20 = z11 ? 0 : i13 - i18;
        if (i19 != 0 || i20 != 0) {
            while (iX1 != 0 && iX1 != iJ && (i20 != 0 || i19 != 0)) {
                int iQ1 = q0(iX1);
                if (i19 != 0) {
                    y5.p0(this.f36878b, iQ1, y5.M(this.f36878b, iQ1) + i19);
                }
                if (i20 != 0) {
                    int[] iArr2 = this.f36878b;
                    y5.r0(iArr2, iQ1, (iArr2[(iQ1 * 5) + 1] & androidx.compose.ui.spatial.e.f41245c) + i20);
                }
                int[] iArr3 = this.f36878b;
                if ((iArr3[(iQ1 * 5) + 1] & 1073741824) != 0) {
                    i20 = 0;
                }
                iX1 = X0(iArr3, iX1);
            }
        }
        this.f36891o += i20;
        return i13;
    }

    public final int V0(int i10) {
        return X0(this.f36878b, i10);
    }

    public final void W() {
        if (!(this.f36890n > 0)) {
            f4.e("Unbalanced begin/end insert");
        }
        int i10 = this.f36890n - 1;
        this.f36890n = i10;
        if (i10 == 0) {
            if (!(this.f36894r.f36312b == this.f36892p.f36312b)) {
                m0.y("startGroup/endGroup mismatch while inserting");
            }
            k1();
        }
    }

    public final int W0(@NotNull g gVar) {
        if (gVar.b()) {
            return X0(this.f36878b, E(gVar));
        }
        return -1;
    }

    public final void W1(@Nullable Object obj) {
        V1(this.f36898v, obj);
    }

    public final void X(int i10) {
        boolean z10 = false;
        int i11 = 6 & 1;
        if (!(this.f36890n <= 0)) {
            m0.y("Cannot call ensureStarted() while inserting");
        }
        int i12 = this.f36898v;
        if (i12 != i10) {
            if (i10 >= i12 && i10 < this.f36897u) {
                z10 = true;
            }
            if (!z10) {
                m0.y("Started group at " + i10 + " must be a subgroup of the group at " + i12);
            }
            int i13 = this.f36896t;
            int i14 = this.f36885i;
            int i15 = this.f36886j;
            this.f36896t = i10;
            D1();
            this.f36896t = i13;
            this.f36885i = i14;
            this.f36886j = i15;
        }
    }

    public final void X1() {
        this.f36881e = this.f36877a.J();
        this.f36882f = this.f36877a.C();
    }

    public final void Y(@NotNull g gVar) {
        X(gVar.e(this));
    }

    public final void Y1() {
        int i10 = this.f36889m;
        int length = this.f36879c.length - this.f36888l;
        int iL0 = l0();
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        while (i11 < iL0) {
            int iQ0 = q0(i11);
            int[] iArr = this.f36878b;
            int i13 = iArr[(iQ0 * 5) + 4];
            int iR = R(iArr, iQ0);
            if (!(iR >= i12)) {
                f4.e("Data index out of order at " + i11 + ", previous = " + i12 + ", current = " + iR);
            }
            if (!(iR <= length)) {
                f4.e("Data index, " + iR + ", out of bound at " + i11);
            }
            if (i13 < 0 && !z10) {
                if (!(i10 == i11)) {
                    f4.e("Expected the slot gap owner to be " + i10 + " found gap at " + i11);
                }
                z10 = true;
            }
            i11++;
            i12 = iR;
        }
    }

    public final void Z1() {
        int i10 = this.f36883g;
        int i11 = this.f36884h;
        int iD0 = d0();
        int i12 = 0;
        while (true) {
            if (i12 >= i10) {
                break;
            }
            if (!(this.f36878b[(i12 * 5) + 2] > -2)) {
                f4.e("Expected a start relative anchor at " + i12);
            }
            i12++;
        }
        for (int i13 = i11 + i10; i13 < iD0; i13++) {
            int i14 = this.f36878b[(i13 * 5) + 2];
            if (Y0(i14) < i10) {
                if (!(i14 > -2)) {
                    f4.e("Expected a start relative anchor at " + i13);
                }
            } else if (!(i14 <= -2)) {
                f4.e("Expected an end relative anchor at " + i13);
            }
        }
    }

    public final void a0(int i10, @NotNull Function2<? super Integer, Object, Unit> function2) {
        int iR = R(this.f36878b, q0(h0() + t0(h0())));
        for (int iR2 = R(this.f36878b, q0(i10)); iR2 < iR; iR2++) {
            function2.invoke(Integer.valueOf(iR2), this.f36879c[S(iR2)]);
        }
    }

    public final void b0(int i10, @NotNull Function2<? super Integer, Object, Unit> function2) {
        int i11;
        int i12;
        g gVarA;
        int iV0 = V0(i10);
        int iL0 = l0();
        int iT0 = t0(i10) + i10;
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i13 = i10;
        androidx.collection.u1 u1VarK = null;
        androidx.collection.r1 r1Var = null;
        while (i13 < iT0) {
            int iQ = Q(i13);
            int i14 = i13 + 1;
            int iQ2 = Q(i14);
            while (true) {
                i11 = 0;
                if (iQ >= iQ2) {
                    break;
                }
                Object obj = this.f36879c[S(iQ)];
                if ((obj instanceof n5) && (gVarA = ((n5) obj).a()) != null && gVarA.b()) {
                    int iE = E(gVarA);
                    if (u1VarK == null) {
                        u1VarK = androidx.collection.m0.k();
                    }
                    if (r1Var == null) {
                        r1Var = new androidx.collection.r1(i11, 1, defaultConstructorMarker);
                    }
                    u1VarK.G(iE);
                    r1Var.b0(iE);
                    r1Var.b0(iQ);
                } else {
                    function2.invoke(Integer.valueOf(iQ), obj);
                }
                iQ++;
            }
            int iV1 = i14 < iL0 ? V0(i14) : -1;
            if (iV1 != i13) {
                while (true) {
                    if (r1Var == null || u1VarK == null || !u1VarK.X(i13)) {
                        i12 = iL0;
                    } else {
                        int i15 = r1Var.f12216b;
                        int i16 = i15 / 2;
                        int i17 = i11;
                        int i18 = i17;
                        while (i18 < i16) {
                            int i19 = i18 * 2;
                            int i20 = iL0;
                            int iW = r1Var.w(i19);
                            if (iW == i13) {
                                int iW2 = r1Var.w(i19 + 1);
                                function2.invoke(Integer.valueOf(iW2), this.f36879c[S(iW2)]);
                            } else if (i19 != i17) {
                                int i21 = i17 + 1;
                                r1Var.w0(i17, iW);
                                i17 += 2;
                                r1Var.w0(i21, r1Var.w(i19 + 1));
                            } else {
                                i17 += 2;
                            }
                            i18++;
                            function2 = function2;
                            iL0 = i20;
                        }
                        i12 = iL0;
                        if (i17 != i15) {
                            r1Var.t0(i17, i15);
                        }
                    }
                    if (i13 == i10 || iV0 == iV1) {
                        break;
                    }
                    i13 = iV0;
                    iL0 = i12;
                    i11 = 0;
                    iV0 = V0(iV0);
                    function2 = function2;
                }
            } else {
                i12 = iL0;
            }
            iV0 = iV1;
            i13 = i14;
            iL0 = i12;
            defaultConstructorMarker = null;
        }
    }

    public final void c0(int i10, int i11, @NotNull Function2<? super Integer, Object, Unit> function2) {
        int iZ1 = z1(i10);
        int iY1 = y1(i10);
        for (int iMax = Math.max(iZ1, iY1 - i11); iMax < iY1; iMax++) {
            function2.invoke(Integer.valueOf(iMax), this.f36879c[S(iMax)]);
        }
    }

    public final void c1(@NotNull String str) {
        if (this.f36890n > 0) {
            w0(this.f36898v, str);
        }
    }

    public final void d1() {
        l2 l2VarW0;
        if (this.f36890n <= 0 || (l2VarW0 = w0(this.f36898v, null)) == null) {
            return;
        }
        l2VarW0.d(j0());
    }

    public final boolean e0() {
        return this.f36899w;
    }

    public final void e1(int i10, @NotNull String str) {
        if (this.f36890n > 0) {
            androidx.collection.t1<androidx.collection.u1> t1Var = this.f36882f;
            if (t1Var != null) {
                y5.w(t1Var, i10, r0(this.f36898v));
            }
            l2 l2VarW0 = w0(this.f36898v, null);
            if (l2VarW0 != null) {
                l2VarW0.t(i10, str, j0());
            }
        }
    }

    public final boolean f0() {
        return this.f36882f != null;
    }

    public final boolean g0() {
        return this.f36881e != null;
    }

    public final boolean g1() {
        g gVarM1;
        if (!(this.f36890n == 0)) {
            m0.y("Cannot remove group while inserting");
        }
        int i10 = this.f36896t;
        int i11 = this.f36885i;
        int iR = R(this.f36878b, q0(i10));
        int iR1 = r1();
        l2 l2VarA1 = A1(this.f36898v);
        if (l2VarA1 != null && (gVarM1 = M1(i10)) != null) {
            l2VarA1.m(gVarM1);
        }
        androidx.collection.r1 r1Var = this.f36900x;
        if (r1Var != null) {
            while (i4.i(r1Var) && i4.j(r1Var) >= i10) {
                i4.k(r1Var);
            }
        }
        boolean zH1 = h1(i10, this.f36896t - i10);
        i1(iR, this.f36885i - iR, i10 - 1);
        this.f36896t = i10;
        this.f36885i = i11;
        this.f36891o -= iR1;
        return zH1;
    }

    public final int h0() {
        return this.f36896t;
    }

    public final int i0() {
        return this.f36897u;
    }

    public final void j1() {
        if (!(this.f36890n == 0)) {
            m0.y("Cannot reset when inserting");
        }
        b1();
        this.f36896t = 0;
        this.f36897u = d0() - this.f36884h;
        this.f36885i = 0;
        this.f36886j = 0;
        this.f36891o = 0;
    }

    public final int k0() {
        return this.f36898v;
    }

    public final int l0() {
        return d0() - this.f36884h;
    }

    public final int m0() {
        return this.f36879c.length - this.f36888l;
    }

    public final void m1(@NotNull g gVar) {
        B(gVar.e(this) - this.f36896t);
    }

    @NotNull
    public final w5 n0() {
        return this.f36877a;
    }

    @Nullable
    public final Object n1(int i10, int i11, @Nullable Object obj) {
        int iS = S(w1(i10, i11));
        Object[] objArr = this.f36879c;
        Object obj2 = objArr[iS];
        objArr[iS] = obj;
        return obj2;
    }

    @Nullable
    public final Object o1(int i10, @Nullable Object obj) {
        return n1(h0(), i10, obj);
    }

    @Nullable
    public final Object p0(int i10) {
        int iQ0 = q0(i10);
        int[] iArr = this.f36878b;
        return (iArr[(iQ0 * 5) + 1] & 268435456) != 0 ? this.f36879c[G(iArr, iQ0)] : c0.f35327a.a();
    }

    public final void p1(@Nullable Object obj) {
        if (!(this.f36885i <= this.f36886j)) {
            m0.y("Writing to an invalid slot");
        }
        this.f36879c[S(this.f36885i - 1)] = obj;
    }

    @Nullable
    public final Object q1() {
        if (this.f36890n > 0) {
            C0(1, this.f36898v);
        }
        Object[] objArr = this.f36879c;
        int i10 = this.f36885i;
        this.f36885i = i10 + 1;
        return objArr[S(i10)];
    }

    public final int r0(int i10) {
        return this.f36878b[q0(i10) * 5];
    }

    public final int r1() {
        int iQ0 = q0(this.f36896t);
        int iM = this.f36896t + y5.M(this.f36878b, iQ0);
        this.f36896t = iM;
        this.f36885i = R(this.f36878b, q0(iM));
        int i10 = 6 & 1;
        int i11 = this.f36878b[(iQ0 * 5) + 1];
        if ((1073741824 & i11) != 0) {
            return 1;
        }
        return i11 & androidx.compose.ui.spatial.e.f41245c;
    }

    @Nullable
    public final Object s0(int i10) {
        int iQ0 = q0(i10);
        int[] iArr = this.f36878b;
        if ((iArr[(iQ0 * 5) + 1] & 536870912) != 0) {
            return this.f36879c[y5.c0(iArr, iQ0)];
        }
        return null;
    }

    public final void s1() {
        int i10 = this.f36897u;
        this.f36896t = i10;
        this.f36885i = R(this.f36878b, q0(i10));
    }

    public final int t0(int i10) {
        return y5.M(this.f36878b, q0(i10));
    }

    @Nullable
    public final Object t1(int i10, int i11) {
        int iV1 = v1(this.f36878b, q0(i10));
        int iR = R(this.f36878b, q0(i10 + 1));
        int i12 = i11 + iV1;
        if (iV1 > i12 || i12 >= iR) {
            return c0.f35327a.a();
        }
        return this.f36879c[S(i12)];
    }

    @NotNull
    public String toString() {
        return "SlotWriter(current = " + this.f36896t + " end=" + this.f36897u + " size = " + l0() + " gap=" + this.f36883g + org.apache.commons.codec.language.l.f335457d + (this.f36883g + this.f36884h) + ')';
    }

    public final int u0(int i10) {
        androidx.collection.g2<Object> g2VarN;
        int iZ1 = this.f36885i - z1(i10);
        androidx.collection.t1<androidx.collection.g2<Object>> t1Var = this.f36895s;
        return iZ1 + ((t1Var == null || (g2VarN = t1Var.n(i10)) == null) ? 0 : g2VarN.C());
    }

    @Nullable
    public final Object u1(@NotNull g gVar, int i10) {
        return t1(E(gVar), i10);
    }

    @NotNull
    public final Iterator<Object> v0() {
        int iR = R(this.f36878b, q0(this.f36896t));
        int[] iArr = this.f36878b;
        int i10 = this.f36896t;
        return new b(iR, R(iArr, q0(i10 + t0(i10))), this);
    }

    public final int w1(int i10, int i11) {
        int iV1 = v1(this.f36878b, q0(i10));
        int i12 = iV1 + i11;
        if (!(i12 >= iV1 && i12 < R(this.f36878b, q0(i10 + 1)))) {
            m0.y("Write to an invalid slot index " + i11 + " for group " + i10);
        }
        return i12;
    }

    public final boolean x0(int i10) {
        return y0(i10, this.f36896t);
    }

    public final int x1(int i10) {
        return R(this.f36878b, q0(i10 + t0(i10)));
    }

    public final boolean y0(int i10, int i11) {
        int iC;
        int iD0;
        if (i11 == this.f36898v) {
            iD0 = this.f36897u;
        } else if (i11 <= this.f36892p.i(0) && (iC = this.f36892p.c(i11)) >= 0) {
            iD0 = (d0() - this.f36884h) - this.f36893q.g(iC);
        } else {
            int iT0 = t0(i11);
            iD0 = iT0 + i11;
        }
        return i10 > i11 && i10 < iD0;
    }

    public final int y1(int i10) {
        return R(this.f36878b, q0(i10 + 1));
    }

    public final boolean z0(int i10) {
        int i11 = this.f36898v;
        return (i10 > i11 && i10 < this.f36897u) || (i11 == 0 && i10 == 0);
    }

    public final int z1(int i10) {
        return v1(this.f36878b, q0(i10));
    }
}
