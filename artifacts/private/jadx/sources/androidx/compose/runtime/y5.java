package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,4061:1\n3824#1:4063\n3911#1:4064\n3911#1:4065\n3824#1:4066\n3824#1:4067\n3911#1:4086\n3911#1:4087\n3911#1:4088\n1#2:4062\n4807#3:4068\n4802#3,4:4069\n4807#3:4081\n4802#3,4:4082\n82#4,2:4073\n34#4,5:4075\n84#4:4080\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n*L\n3778#1:4063\n3795#1:4064\n3805#1:4065\n3816#1:4066\n3821#1:4067\n3903#1:4086\n3904#1:4087\n3905#1:4088\n3837#1:4068\n3837#1:4069,4\n3860#1:4081\n3860#1:4082,4\n3843#1:4073,2\n3843#1:4075,5\n3843#1:4080\n*E\n"})
public final class y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final long[] f36813a = new long[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f36814b = -2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f36815c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f36816d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f36817e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f36818f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f36819g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f36820h = 5;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f36821i = 1073741824;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f36822j = 30;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f36823k = 536870912;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f36824l = 29;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f36825m = 268435456;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f36826n = 28;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f36827o = 134217728;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f36828p = 27;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f36829q = 67108864;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f36830r = 26;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f36831s = 28;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f36832t = 67108863;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f36833u = 32;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f36834v = 32;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f36835w = -3;

    private static final boolean A(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 201326592) != 0;
    }

    private static final boolean B(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 67108864) != 0;
    }

    private static final int C(int i10) {
        return Integer.bitCount(i10);
    }

    private static final int D(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> E(int[] iArr, int i10) {
        return h0(iArr, kotlin.ranges.r.B1(kotlin.ranges.r.W1(4, i10), 5));
    }

    static /* synthetic */ List F(int[] iArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = iArr.length;
        }
        return E(iArr, i10);
    }

    private static final <T> int G(ArrayList<T> arrayList, Function1<? super T, Boolean> function1) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (function1.invoke(arrayList.get(i10)).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    private static final <T> T H(ArrayList<T> arrayList, Function1<? super T, Boolean> function1) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            T t10 = arrayList.get(size);
            if (function1.invoke(t10).booleanValue()) {
                return t10;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g I(ArrayList<g> arrayList, int i10, int i11) {
        int iG0 = g0(arrayList, i10, i11);
        if (iG0 >= 0) {
            return arrayList.get(iG0);
        }
        return null;
    }

    private static final int J(long j10) {
        return Long.numberOfTrailingZeros(j10);
    }

    private static final g K(ArrayList<g> arrayList, int i10, int i11, Function0<g> function0) {
        int iG0 = g0(arrayList, i10, i11);
        if (iG0 >= 0) {
            return arrayList.get(iG0);
        }
        g gVarInvoke = function0.invoke();
        arrayList.add(-(iG0 + 1), gVarInvoke);
        return gVarInvoke;
    }

    private static final int L(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int M(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 3];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> N(int[] iArr, int i10) {
        return h0(iArr, kotlin.ranges.r.B1(kotlin.ranges.r.W1(3, i10), 5));
    }

    static /* synthetic */ List O(int[] iArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = iArr.length;
        }
        return N(iArr, i10);
    }

    private static final boolean P(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 268435456) != 0;
    }

    private static final boolean Q(int[] iArr, int i10) {
        int i11 = 3 << 1;
        return (iArr[(i10 * 5) + 1] & 134217728) != 0;
    }

    private static final boolean R(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 536870912) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(int[] iArr, int i10, int i11, boolean z10, boolean z11, boolean z12, int i12, int i13) {
        int i14 = i10 * 5;
        iArr[i14] = i11;
        iArr[i14 + 1] = ((z10 ? 1 : 0) << 30) | ((z11 ? 1 : 0) << 29) | ((z12 ? 1 : 0) << 28);
        iArr[i14 + 2] = i12;
        iArr[i14 + 3] = 0;
        iArr[i14 + 4] = i13;
    }

    private static final boolean T(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 1073741824) != 0;
    }

    private static final int U(int[] iArr, int i10) {
        return iArr[i10 * 5];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> V(int[] iArr, int i10) {
        return h0(iArr, kotlin.ranges.r.B1(kotlin.ranges.r.W1(0, i10), 5));
    }

    static /* synthetic */ List W(int[] iArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = iArr.length;
        }
        return V(iArr, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int X(ArrayList<g> arrayList, int i10, int i11) {
        int iG0 = g0(arrayList, i10, i11);
        return iG0 >= 0 ? iG0 : -(iG0 + 1);
    }

    private static final int Y(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 1] & 67108863;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> Z(int[] iArr, int i10) {
        List<Integer> listH0 = h0(iArr, kotlin.ranges.r.B1(kotlin.ranges.r.W1(1, i10), 5));
        ArrayList arrayList = new ArrayList(listH0.size());
        int size = listH0.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(Integer.valueOf(listH0.get(i11).intValue() & 67108863));
        }
        return arrayList;
    }

    static /* synthetic */ List a0(int[] iArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = iArr.length;
        }
        return Z(iArr, i10);
    }

    private static final int b0(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c0(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return iArr[i11 + 4] + Integer.bitCount(iArr[i11 + 1] >> 30);
    }

    private static final int d0(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 2];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> e0(int[] iArr, int i10) {
        return h0(iArr, kotlin.ranges.r.B1(kotlin.ranges.r.W1(2, i10), 5));
    }

    static /* synthetic */ List f0(int[] iArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = iArr.length;
        }
        return e0(iArr, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g0(ArrayList<g> arrayList, int i10, int i11) {
        int size = arrayList.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            int iA = arrayList.get(i13).a();
            if (iA < 0) {
                iA += i11;
            }
            int iCompare = Intrinsics.compare(iA, i10);
            if (iCompare < 0) {
                i12 = i13 + 1;
            } else {
                if (iCompare <= 0) {
                    return i13;
                }
                size = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    private static final List<Integer> h0(int[] iArr, Iterable<Integer> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(iArr[it.next().intValue()]));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i0(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return iArr[i11 + 4] + Integer.bitCount(iArr[i11 + 1] >> 28);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j0(String str, int i10) {
        String strK2 = StringsKt.k2(StringsKt.k2(StringsKt.k2(StringsKt.k2(StringsKt.k2(StringsKt.k2(StringsKt.k2(StringsKt.k2(StringsKt.k2(StringsKt.k2(str, "androidx.", "a.", false, 4, null), "compose.", "c.", false, 4, null), "runtime.", "r.", false, 4, null), "internal.", "ι.", false, 4, null), "ui.", "u.", false, 4, null), "Modifier", "μ", false, 4, null), "material.", "m.", false, 4, null), "Function", "λ", false, 4, null), "OpaqueKey", "κ", false, 4, null), "MutableState", "σ", false, 4, null);
        String strSubstring = strK2.substring(0, Math.min(i10, strK2.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final void k0() {
        throw new ConcurrentModificationException();
    }

    private static final int l0(boolean z10) {
        return z10 ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m0(int[] iArr, int i10, boolean z10) {
        int i11 = (i10 * 5) + 1;
        iArr[i11] = ((z10 ? 1 : 0) << 26) | (iArr[i11] & (-67108865));
    }

    private static final void n0(int[] iArr, int i10, int i11) {
        iArr[(i10 * 5) + 4] = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o0(int[] iArr, int i10, int i11) {
        iArr[i10 * 5] = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p0(int[] iArr, int i10, int i11) {
        iArr[(i10 * 5) + 3] = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q0(int[] iArr, int i10, boolean z10) {
        int i11 = (i10 * 5) + 1;
        iArr[i11] = ((z10 ? 1 : 0) << 27) | (iArr[i11] & (-134217729));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r0(int[] iArr, int i10, int i11) {
        if (i11 >= 0) {
        }
        int i12 = (i10 * 5) + 1;
        iArr[i12] = i11 | (iArr[i12] & (-67108864));
    }

    private static final void s0(int[] iArr, int i10, int i11) {
        iArr[(i10 * 5) + 2] = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(androidx.collection.t1<androidx.collection.u1> t1Var, int i10, int i11) {
        androidx.collection.u1 u1VarN = t1Var.n(i10);
        if (u1VarN == null) {
            u1VarN = new androidx.collection.u1(0, 1, null);
            t1Var.j0(i10, u1VarN);
        }
        u1VarN.G(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(int[] iArr, int i10) {
        int i11 = (i10 * 5) + 1;
        iArr[i11] = iArr[i11] | 268435456;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int y(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return i11 >= iArr.length ? iArr.length : iArr[i11 + 4] + Integer.bitCount(iArr[i11 + 1] >> 29);
    }

    @NotNull
    public static final androidx.compose.runtime.tooling.m z(@NotNull w5 w5Var, int i10) {
        return new x5(w5Var, i10, w5Var.K());
    }
}
