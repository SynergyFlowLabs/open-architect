package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 6 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 7 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,4061:1\n159#1,7:4119\n175#1,4:4126\n180#1,3:4136\n25#2,5:4062\n33#2:4114\n1#3:4067\n1#3:4135\n4788#4,4:4068\n4788#4,4:4072\n4788#4,4:4076\n4788#4,4:4090\n4788#4,4:4094\n4788#4,4:4102\n4788#4,4:4106\n4788#4,4:4110\n34#5,4:4080\n34#5,4:4098\n34#5,4:4115\n49#5,4:4141\n49#5,4:4145\n34#5,4:4152\n34#5,4:4156\n34#5,4:4161\n34#5,4:4165\n49#5,4:4181\n49#5,4:4185\n49#5,4:4189\n49#5,4:4195\n49#5,4:4199\n49#5,4:4203\n49#5,4:4210\n49#5,4:4216\n49#5,4:4221\n49#5,4:4225\n49#5,4:4231\n34#5,4:4238\n34#5,4:4242\n3923#6,6:4084\n3799#6:4139\n3847#6:4140\n3827#6:4169\n3833#6:4170\n3790#6:4171\n3799#6:4172\n3773#6:4173\n3767#6:4174\n3770#6:4175\n3782#6:4176\n3878#6:4177\n3878#6:4178\n3878#6:4179\n3847#6:4180\n3878#6:4193\n3878#6:4194\n3767#6:4207\n3773#6:4208\n3782#6:4209\n3767#6:4214\n3770#6:4215\n3833#6:4220\n3809#6:4229\n3799#6:4230\n3878#6:4247\n34#7,5:4130\n34#7,3:4149\n38#7:4160\n34#7,3:4235\n38#7:4246\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n353#1:4119,7\n389#1:4126,4\n389#1:4136,3\n124#1:4062,5\n275#1:4114\n389#1:4135\n203#1:4068,4\n204#1:4072,4\n220#1:4076,4\n227#1:4090,4\n238#1:4094,4\n261#1:4102,4\n262#1:4106,4\n272#1:4110,4\n221#1:4080,4\n239#1:4098,4\n301#1:4115,4\n500#1:4141,4\n507#1:4145,4\n516#1:4152,4\n519#1:4156,4\n540#1:4161,4\n541#1:4165,4\n441#1:4181,4\n446#1:4185,4\n449#1:4189,4\n455#1:4195,4\n458#1:4199,4\n460#1:4203,4\n465#1:4210,4\n469#1:4216,4\n478#1:4221,4\n483#1:4225,4\n488#1:4231,4\n528#1:4238,4\n529#1:4242,4\n222#1:4084,6\n406#1:4139\n425#1:4140\n595#1:4169\n600#1:4170\n603#1:4171\n606#1:4172\n612#1:4173\n619#1:4174\n620#1:4175\n622#1:4176\n667#1:4177\n668#1:4178\n674#1:4179\n440#1:4180\n453#1:4193\n454#1:4194\n462#1:4207\n463#1:4208\n464#1:4209\n468#1:4214\n469#1:4215\n476#1:4220\n487#1:4229\n488#1:4230\n596#1:4247\n391#1:4130,5\n514#1:4149,3\n514#1:4160\n525#1:4235,3\n525#1:4246\n*E\n"})
public final class w5 implements androidx.compose.runtime.tooling.f, Iterable<androidx.compose.runtime.tooling.m>, qj.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f36762l = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36764b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f36766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f36767e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f36769g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f36770h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private HashMap<g, l2> f36772j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private androidx.collection.t1<androidx.collection.u1> f36773k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private int[] f36763a = new int[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private Object[] f36765c = new Object[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Object f36768f = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private ArrayList<g> f36771i = new ArrayList<>();

    private final s4 A(int i10) {
        int i11 = i10;
        while (i11 > 0) {
            for (Object obj : new m1(this, i11)) {
                if (obj instanceof s4) {
                    s4 s4Var = (s4) obj;
                    if (s4Var.v() && i11 != i10) {
                        return s4Var;
                    }
                    s4Var.J(true);
                }
            }
            i11 = this.f36763a[(i11 * 5) + 2];
        }
        return null;
    }

    private static final int A0(kotlin.jvm.internal.i1.f fVar, w5 w5Var, int i10, int i11) {
        int i12 = fVar.f312749a;
        int i13 = i12 + 1;
        fVar.f312749a = i13;
        int i14 = i12 * 5;
        int i15 = w5Var.f36763a[i14 + 2];
        if (!(i15 == i10)) {
            f4.e("Invalid parent index detected at " + i12 + ", expected parent index to be " + i10 + " found " + i15);
        }
        int iM = y5.M(w5Var.f36763a, i12) + i12;
        if (!(iM <= w5Var.f36764b)) {
            f4.e("A group extends past the end of the table at " + i12);
        }
        if (!(iM <= i11)) {
            f4.e("A group extends past its parent group at " + i12);
        }
        int[] iArr = w5Var.f36763a;
        int i16 = i14 + 4;
        int i17 = iArr[i16];
        int i18 = i12 >= w5Var.f36764b - 1 ? w5Var.f36766d : iArr[(i13 * 5) + 4];
        if (!(i18 <= w5Var.f36765c.length)) {
            f4.e("Slots for " + i12 + " extend past the end of the slot table");
        }
        if (!(i17 <= i18)) {
            f4.e("Invalid data anchor at " + i12);
        }
        if (!(y5.i0(w5Var.f36763a, i12) <= i18)) {
            f4.e("Slots start out of range at " + i12);
        }
        int i19 = i14 + 1;
        int i20 = w5Var.f36763a[i19];
        if (!(i18 - i17 >= (((i20 & 1073741824) != 0 ? 1 : 0) + ((536870912 & i20) != 0 ? 1 : 0)) + ((i20 & 268435456) != 0 ? 1 : 0))) {
            f4.e("Not enough slots added for group " + i12);
        }
        int[] iArr2 = w5Var.f36763a;
        boolean z10 = (iArr2[i19] & 1073741824) != 0;
        if (!((z10 && w5Var.f36765c[iArr2[i16]] == null) ? false : true)) {
            f4.e("No node recorded for a node group at " + i12);
        }
        int iA0 = 0;
        while (fVar.f312749a < iM) {
            iA0 += A0(fVar, w5Var, i12, iM);
        }
        int[] iArr3 = w5Var.f36763a;
        int i21 = iArr3[i19] & androidx.compose.ui.spatial.e.f41245c;
        int iM2 = y5.M(iArr3, i12);
        if (!(i21 == iA0)) {
            f4.e("Incorrect node count detected at " + i12 + ", expected " + i21 + ", received " + iA0);
        }
        int i22 = fVar.f312749a - i12;
        if (!(iM2 == i22)) {
            f4.e("Incorrect slot count detected at " + i12 + ", expected " + iM2 + ", received " + i22);
        }
        int[] iArr4 = w5Var.f36763a;
        if ((iArr4[i19] & 201326592) != 0) {
            if (!(i12 <= 0 || (iArr4[(i10 * 5) + 1] & 67108864) != 0)) {
                f4.e("Expected group " + i10 + " to record it contains a mark because " + i12 + " does");
            }
        }
        if (z10) {
            return 1;
        }
        return iA0;
    }

    private static final void D0(w5 w5Var, l2 l2Var) {
        ArrayList<Object> arrayListH = l2Var.h();
        if (arrayListH != null) {
            int size = arrayListH.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = arrayListH.get(i10);
                if (obj instanceof g) {
                    g gVar = (g) obj;
                    if (!gVar.b()) {
                        f4.d("Source map contains invalid anchor");
                    }
                    if (!w5Var.b0(gVar)) {
                        f4.d("Source map anchor is not owned by the slot table");
                    }
                } else if (obj instanceof l2) {
                    D0(w5Var, (l2) obj);
                }
            }
        }
    }

    private final List<Integer> N() {
        return y5.N(this.f36763a, this.f36764b * 5);
    }

    private static final void P(v5 v5Var, androidx.collection.u1 u1Var, List<g> list, kotlin.jvm.internal.i1.a aVar, w5 w5Var, List<s4> list2) {
        s4 s4VarA;
        int iP = v5Var.p();
        if (!u1Var.d(iP)) {
            v5Var.f0();
            while (!v5Var.P()) {
                P(v5Var, u1Var, list, aVar, w5Var, list2);
            }
            v5Var.h();
            return;
        }
        int i10 = (6 & (-3)) | 0;
        if (iP != -3) {
            int i11 = i10 & 0;
            list.add(v5.b(v5Var, 0, 1, null));
        }
        if (aVar.f312744a) {
            s4 s4VarA2 = w5Var.A(v5Var.m());
            if (s4VarA2 != null) {
                list2.add(s4VarA2);
                g gVarH = s4VarA2.h();
                if (gVarH != null && gVarH.a() == v5Var.m() && (s4VarA = w5Var.A(v5Var.z())) != null) {
                    list2.add(s4VarA);
                }
            } else {
                aVar.f312744a = false;
                list2.clear();
            }
        }
        v5Var.c0();
    }

    private final List<Integer> R() {
        return y5.V(this.f36763a, this.f36764b * 5);
    }

    private final List<Integer> T() {
        return y5.Z(this.f36763a, this.f36764b * 5);
    }

    private final List<Integer> c0() {
        return y5.e0(this.f36763a, this.f36764b * 5);
    }

    private final List<Integer> t() {
        return y5.E(this.f36763a, this.f36764b * 5);
    }

    private final int u(StringBuilder sb2, int i10, int i11) {
        String strJ;
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append(' ');
        }
        sb2.append("Group(");
        sb2.append(i10);
        sb2.append(")");
        l2 l2VarT0 = t0(i10);
        if (l2VarT0 != null && (strJ = l2VarT0.j()) != null && (StringsKt.u2(strJ, "C(", false, 2, null) || StringsKt.u2(strJ, "CC(", false, 2, null))) {
            int iR3 = StringsKt.r3(strJ, "(", 0, false, 6, null) + 1;
            int iQ3 = StringsKt.q3(strJ, ')', 0, false, 6, null);
            sb2.append(" ");
            String strSubstring = strJ.substring(iR3, iQ3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            sb2.append(strSubstring);
            sb2.append("()");
        }
        sb2.append(" key=");
        int i13 = i10 * 5;
        sb2.append(this.f36763a[i13]);
        int iM = y5.M(this.f36763a, i10);
        sb2.append(", nodes=");
        int i14 = i13 + 1;
        sb2.append(this.f36763a[i14] & androidx.compose.ui.spatial.e.f41245c);
        sb2.append(", size=");
        sb2.append(iM);
        if ((this.f36763a[i14] & androidx.media3.common.j.W0) != 0) {
            sb2.append(", mark");
        }
        if ((this.f36763a[i14] & 67108864) != 0) {
            sb2.append(", contains mark");
        }
        int iV = v(this, i10);
        int iU = i10 + 1;
        int iV2 = v(this, iU);
        if (iV < 0 || iV > iV2 || iV2 > this.f36766d) {
            sb2.append(", *invalid data offsets " + iV + org.apache.commons.codec.language.l.f335457d + iV2 + '*');
        } else {
            if ((this.f36763a[i14] & 536870912) != 0) {
                sb2.append(" objectKey=" + y5.j0(String.valueOf(this.f36765c[y5.c0(this.f36763a, i10)]), 10));
            }
            if ((this.f36763a[i14] & 1073741824) != 0) {
                sb2.append(" node=" + y5.j0(String.valueOf(this.f36765c[this.f36763a[i13 + 4]]), 10));
            }
            if ((this.f36763a[i14] & 268435456) != 0) {
                sb2.append(" aux=" + y5.j0(String.valueOf(this.f36765c[y5.y(this.f36763a, i10)]), 10));
            }
            int iI0 = y5.i0(this.f36763a, i10);
            if (iI0 < iV2) {
                sb2.append(", slots=[");
                sb2.append(iI0);
                sb2.append(": ");
                for (int i15 = iI0; i15 < iV2; i15++) {
                    if (i15 != iI0) {
                        sb2.append(", ");
                    }
                    sb2.append(y5.j0(String.valueOf(this.f36765c[i15]), 10));
                }
                sb2.append("]");
            }
        }
        sb2.append('\n');
        int i16 = i10 + iM;
        while (iU < i16) {
            iU += u(sb2, iU, i11 + 1);
        }
        return iM;
    }

    private static final int v(w5 w5Var, int i10) {
        return i10 >= w5Var.f36764b ? w5Var.f36766d : w5Var.f36763a[(i10 * 5) + 4];
    }

    private final g v0(int i10) {
        int i11;
        if (this.f36769g) {
            m0.y("use active SlotWriter to crate an anchor for location instead");
        }
        if (i10 < 0 || i10 >= (i11 = this.f36764b)) {
            return null;
        }
        return y5.I(this.f36771i, i10, i11);
    }

    @NotNull
    public final ArrayList<g> B() {
        return this.f36771i;
    }

    @Nullable
    public final androidx.collection.t1<androidx.collection.u1> C() {
        return this.f36773k;
    }

    @NotNull
    public final int[] D() {
        return this.f36763a;
    }

    public final <T> T E0(@NotNull Function1<? super z5, ? extends T> function1) {
        z5 z5VarA0 = a0();
        try {
            T tInvoke = function1.invoke(z5VarA0);
            kotlin.jvm.internal.h0.d(1);
            z5VarA0.M(true);
            kotlin.jvm.internal.h0.c(1);
            return tInvoke;
        } catch (Throwable th2) {
            kotlin.jvm.internal.h0.d(1);
            z5VarA0.M(false);
            kotlin.jvm.internal.h0.c(1);
            throw th2;
        }
    }

    public final int F() {
        return this.f36764b;
    }

    @NotNull
    public final Object[] G() {
        return this.f36765c;
    }

    @Nullable
    public final HashMap<g, l2> J() {
        return this.f36772j;
    }

    public final int K() {
        return this.f36770h;
    }

    public final boolean L() {
        return this.f36769g;
    }

    public final boolean M(int i10, @NotNull g gVar) {
        if (this.f36769g) {
            m0.y("Writer is active");
        }
        if (!(i10 >= 0 && i10 < this.f36764b)) {
            m0.y("Invalid group index");
        }
        if (b0(gVar)) {
            int iM = y5.M(this.f36763a, i10) + i10;
            int iA = gVar.a();
            if (i10 <= iA && iA < iM) {
                return true;
            }
        }
        return false;
    }

    public final boolean O(@NotNull g gVar, @NotNull g gVar2) {
        int iA = gVar.a();
        int iM = y5.M(this.f36763a, iA) + iA;
        int iA2 = gVar2.a();
        return iA <= iA2 && iA2 < iM;
    }

    @Nullable
    public final List<s4> Q(int i10) {
        androidx.collection.u1 u1VarN;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        kotlin.jvm.internal.i1.a aVar = new kotlin.jvm.internal.i1.a();
        aVar.f312744a = true;
        androidx.collection.u1 u1Var = new androidx.collection.u1(0, 1, null);
        u1Var.G(i10);
        u1Var.G(-3);
        androidx.collection.t1<androidx.collection.u1> t1Var = this.f36773k;
        if (t1Var != null && (u1VarN = t1Var.n(i10)) != null) {
            u1Var.H(u1VarN);
        }
        v5 v5VarY = Y();
        try {
            P(v5VarY, u1Var, arrayList, aVar, this, arrayList2);
            Unit unit = Unit.f312394a;
            v5VarY.e();
            z5 z5VarA0 = a0();
            try {
                z5VarA0.D1();
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    g gVar = (g) arrayList.get(i11);
                    if (gVar.e(z5VarA0) >= z5VarA0.h0()) {
                        z5VarA0.m1(gVar);
                        z5VarA0.H();
                    }
                }
                z5VarA0.s1();
                z5VarA0.V();
                z5VarA0.M(true);
                if (aVar.f312744a) {
                    return arrayList2;
                }
                return null;
            } catch (Throwable th2) {
                z5VarA0.M(false);
                throw th2;
            }
        } catch (Throwable th3) {
            v5VarY.e();
            throw th3;
        }
    }

    @NotNull
    public final v5 Y() {
        if (this.f36769g) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f36767e++;
        return new v5(this);
    }

    @NotNull
    public final z5 a0() {
        if (this.f36769g) {
            m0.y("Cannot start a writer when another writer is pending");
        }
        if (!(this.f36767e <= 0)) {
            m0.y("Cannot start a writer when a reader is pending");
        }
        this.f36769g = true;
        this.f36770h++;
        return new z5(this);
    }

    public final boolean b0(@NotNull g gVar) {
        int iG0;
        return gVar.b() && (iG0 = y5.g0(this.f36771i, gVar.a(), this.f36764b)) >= 0 && Intrinsics.areEqual(this.f36771i.get(iG0), gVar);
    }

    @Override // androidx.compose.runtime.tooling.f
    @Nullable
    public androidx.compose.runtime.tooling.m c(@NotNull Object obj) {
        int i10 = 2 << 0;
        return new x5(this, 0, 0, 4, null).c(obj);
    }

    @NotNull
    public final g d(int i10) {
        if (this.f36769g) {
            m0.y("use active SlotWriter to create an anchor location instead");
        }
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f36764b) {
            z10 = true;
        }
        if (!z10) {
            f4.d("Parameter index is out of range");
        }
        ArrayList<g> arrayList = this.f36771i;
        int iG0 = y5.g0(arrayList, i10, this.f36764b);
        if (iG0 >= 0) {
            return arrayList.get(iG0);
        }
        g gVar = new g(i10);
        arrayList.add(-(iG0 + 1), gVar);
        return gVar;
    }

    public final <T> T e0(@NotNull Function1<? super v5, ? extends T> function1) {
        v5 v5VarY = Y();
        try {
            T tInvoke = function1.invoke(v5VarY);
            kotlin.jvm.internal.h0.d(1);
            v5VarY.e();
            kotlin.jvm.internal.h0.c(1);
            return tInvoke;
        } catch (Throwable th2) {
            kotlin.jvm.internal.h0.d(1);
            v5VarY.e();
            kotlin.jvm.internal.h0.c(1);
            throw th2;
        }
    }

    public final int e2() {
        return this.f36766d;
    }

    public final void h0(@NotNull ArrayList<g> arrayList) {
        this.f36771i = arrayList;
    }

    @Override // androidx.compose.runtime.tooling.f
    @NotNull
    public Iterable<androidx.compose.runtime.tooling.m> i() {
        return this;
    }

    public final void i0(@Nullable androidx.collection.t1<androidx.collection.u1> t1Var) {
        this.f36773k = t1Var;
    }

    @Override // androidx.compose.runtime.tooling.f
    public boolean isEmpty() {
        return this.f36764b == 0;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<androidx.compose.runtime.tooling.m> iterator() {
        return new j2(this, 0, this.f36764b);
    }

    public final int k(@NotNull g gVar) {
        if (this.f36769g) {
            m0.y("Use active SlotWriter to determine anchor location instead");
        }
        if (!gVar.b()) {
            f4.d("Anchor refers to a group that was removed");
        }
        return gVar.a();
    }

    public final void l(@NotNull v5 v5Var, @Nullable HashMap<g, l2> map) {
        if (!(v5Var.E() == this && this.f36767e > 0)) {
            m0.y("Unexpected reader close()");
        }
        this.f36767e--;
        if (map != null) {
            synchronized (this.f36768f) {
                try {
                    HashMap<g, l2> map2 = this.f36772j;
                    if (map2 != null) {
                        map2.putAll(map);
                    } else {
                        this.f36772j = map;
                    }
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void l0(@Nullable HashMap<g, l2> map) {
        this.f36772j = map;
    }

    public final void m(@NotNull z5 z5Var, @NotNull int[] iArr, int i10, @NotNull Object[] objArr, int i11, @NotNull ArrayList<g> arrayList, @Nullable HashMap<g, l2> map, @Nullable androidx.collection.t1<androidx.collection.u1> t1Var) {
        if (!(z5Var.n0() == this && this.f36769g)) {
            f4.d("Unexpected writer close()");
        }
        this.f36769g = false;
        m0(iArr, i10, objArr, i11, arrayList, map, t1Var);
    }

    public final void m0(@NotNull int[] iArr, int i10, @NotNull Object[] objArr, int i11, @NotNull ArrayList<g> arrayList, @Nullable HashMap<g, l2> map, @Nullable androidx.collection.t1<androidx.collection.u1> t1Var) {
        this.f36763a = iArr;
        this.f36764b = i10;
        this.f36765c = objArr;
        this.f36766d = i11;
        this.f36771i = arrayList;
        this.f36772j = map;
        this.f36773k = t1Var;
    }

    public final void n() {
        this.f36773k = new androidx.collection.t1<>(0, 1, null);
    }

    public final void n0(int i10) {
        this.f36770h = i10;
    }

    public final void p() {
        this.f36772j = new HashMap<>();
    }

    @Nullable
    public final Object p0(int i10, int i11) {
        int iI0 = y5.i0(this.f36763a, i10);
        int i12 = i10 + 1;
        return (i11 < 0 || i11 >= (i12 < this.f36764b ? this.f36763a[(i12 * 5) + 4] : this.f36765c.length) - iI0) ? c0.f35327a.a() : this.f36765c[iI0 + i11];
    }

    public final boolean s() {
        return this.f36764b > 0 && (this.f36763a[1] & 67108864) != 0;
    }

    @NotNull
    public final List<Object> s0(int i10) {
        int[] iArr = this.f36763a;
        int i11 = iArr[(i10 * 5) + 4];
        int i12 = i10 + 1;
        return ArraysKt.toList(this.f36765c).subList(i11, i12 < this.f36764b ? iArr[(i12 * 5) + 4] : this.f36765c.length);
    }

    @Nullable
    public final l2 t0(int i10) {
        g gVarV0;
        HashMap<g, l2> map = this.f36772j;
        if (map == null || (gVarV0 = v0(i10)) == null) {
            return null;
        }
        return map.get(gVarV0);
    }

    @NotNull
    public final String u0() {
        if (this.f36769g) {
            return super.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append('\n');
        int i10 = this.f36764b;
        if (i10 > 0) {
            int iU = 0;
            while (iU < i10) {
                iU += u(sb2, iU, 0);
            }
        } else {
            sb2.append("<EMPTY>");
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final void z0() {
        int i10;
        int i11;
        kotlin.jvm.internal.i1.f fVar = new kotlin.jvm.internal.i1.f();
        int i12 = -1;
        if (this.f36764b > 0) {
            while (true) {
                i10 = fVar.f312749a;
                i11 = this.f36764b;
                if (i10 >= i11) {
                    break;
                } else {
                    A0(fVar, this, -1, i10 + y5.M(this.f36763a, i10));
                }
            }
            if (!(i10 == i11)) {
                f4.e("Incomplete group at root " + fVar.f312749a + " expected to be " + this.f36764b);
            }
        }
        int length = this.f36765c.length;
        for (int i13 = this.f36766d; i13 < length; i13++) {
            if (!(this.f36765c[i13] == null)) {
                f4.e("Non null value in the slot gap at index " + i13);
            }
        }
        ArrayList<g> arrayList = this.f36771i;
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            int iD = arrayList.get(i14).d(this);
            if (!(iD >= 0 && iD <= this.f36764b)) {
                f4.d("Invalid anchor, location out of bound");
            }
            if (!(i12 < iD)) {
                f4.d("Anchor is out of order");
            }
            i14++;
            i12 = iD;
        }
        HashMap<g, l2> map = this.f36772j;
        if (map != null) {
            for (Map.Entry<g, l2> entry : map.entrySet()) {
                g key = entry.getKey();
                l2 value = entry.getValue();
                if (!key.b()) {
                    f4.d("Source map contains invalid anchor");
                }
                if (!b0(key)) {
                    f4.d("Source map anchor is not owned by the slot table");
                }
                D0(this, value);
            }
        }
    }
}
