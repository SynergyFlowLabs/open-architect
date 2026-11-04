package com.ionspin.kotlin.bignum.integer.base32;

import androidx.collection.g3;
import ca.f;
import com.ionspin.kotlin.bignum.integer.h;
import com.ionspin.kotlin.bignum.integer.l;
import com.rabbitmq.client.k0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.UCollectionsKt;
import kotlin.collections.unsigned.UArraysKt;
import kotlin.comparisons.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.n1;
import kotlin.q1;
import kotlin.r1;
import kotlin.ranges.r;
import kotlin.text.StringsKt;
import kotlin.text.d0;
import kotlin.u1;
import kotlin.v1;
import kotlin.y1;
import okhttp3.internal.ws.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nBigInteger32Arithmetic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BigInteger32Arithmetic.kt\ncom/ionspin/kotlin/bignum/integer/base32/BigInteger32Arithmetic\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 4 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1607:1\n1#2:1608\n1174#3,2:1609\n26#4:1611\n959#5,7:1612\n1360#5:1621\n1446#5,2:1622\n1804#5,4:1624\n1448#5,3:1628\n1360#5:1631\n1446#5,2:1632\n1804#5,4:1634\n1448#5,3:1638\n1360#5:1641\n1446#5,2:1642\n1804#5,4:1644\n1448#5,3:1648\n1360#5:1651\n1446#5,2:1652\n1804#5,4:1654\n1448#5,3:1658\n1360#5:1661\n1446#5,2:1662\n1804#5,4:1664\n1448#5,3:1668\n1360#5:1671\n1446#5,2:1672\n1804#5,4:1674\n1448#5,3:1678\n1360#5:1681\n1446#5,5:1682\n1360#5:1687\n1446#5,5:1688\n1360#5:1695\n1446#5,5:1696\n1360#5:1701\n1446#5,5:1702\n748#5,10:1707\n37#6,2:1619\n37#6,2:1693\n37#6,2:1727\n37#6,2:1739\n3630#7,10:1717\n3630#7,10:1729\n*S KotlinDebug\n*F\n+ 1 BigInteger32Arithmetic.kt\ncom/ionspin/kotlin/bignum/integer/base32/BigInteger32Arithmetic\n*L\n1054#1:1609,2\n1280#1:1611\n1320#1:1612,7\n1343#1:1621\n1343#1:1622,2\n1344#1:1624,4\n1343#1:1628,3\n1358#1:1631\n1358#1:1632,2\n1359#1:1634,4\n1358#1:1638,3\n1387#1:1641\n1387#1:1642,2\n1388#1:1644,4\n1387#1:1648,3\n1402#1:1651\n1402#1:1652,2\n1403#1:1654,4\n1402#1:1658,3\n1432#1:1661\n1432#1:1662,2\n1433#1:1664,4\n1432#1:1668,3\n1460#1:1671\n1460#1:1672,2\n1461#1:1674,4\n1460#1:1678,3\n1480#1:1681\n1480#1:1682,5\n1499#1:1687\n1499#1:1688,5\n1524#1:1695\n1524#1:1696,5\n1544#1:1701\n1544#1:1702,5\n1592#1:1707,10\n1328#1:1619,2\n1516#1:1693,2\n1596#1:1727,2\n1600#1:1739,2\n1596#1:1717,10\n1600#1:1729,10\n*E\n"})
public final class a implements com.ionspin.kotlin.bignum.integer.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f131082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final int[] f131083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f131084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f131085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f131086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f131087f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f131088g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f131089h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f131090i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final int[] f131091j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final int[] f131092k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final int[] f131093l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static final int[] f131094m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f131095n = 60;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f131096o = 15000;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private static final C1439a f131097p;

    /* JADX INFO: renamed from: com.ionspin.kotlin.bignum.integer.base32.a$a, reason: collision with other inner class name */
    public static final class C1439a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final int[] f131098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f131099b;

        public /* synthetic */ C1439a(int[] iArr, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
            this(iArr, z10);
        }

        public static /* synthetic */ C1439a d(C1439a c1439a, int[] iArr, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                iArr = c1439a.f131098a;
            }
            if ((i10 & 2) != 0) {
                z10 = c1439a.f131099b;
            }
            return c1439a.c(iArr, z10);
        }

        @NotNull
        public final int[] a() {
            return this.f131098a;
        }

        public final boolean b() {
            return this.f131099b;
        }

        @NotNull
        public final C1439a c(@NotNull int[] unsignedValue, boolean z10) {
            Intrinsics.checkNotNullParameter(unsignedValue, "unsignedValue");
            return new C1439a(unsignedValue, z10, null);
        }

        public final boolean e() {
            return this.f131099b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1439a)) {
                return false;
            }
            C1439a c1439a = (C1439a) obj;
            return v1.s(this.f131098a, c1439a.f131098a) && this.f131099b == c1439a.f131099b;
        }

        @NotNull
        public final int[] f() {
            return this.f131098a;
        }

        public int hashCode() {
            return (v1.A(this.f131098a) * 31) + Boolean.hashCode(this.f131099b);
        }

        @NotNull
        public String toString() {
            return "SignedUIntArray(unsignedValue=" + ((Object) v1.F(this.f131098a)) + ", sign=" + this.f131099b + ')';
        }

        private C1439a(int[] unsignedValue, boolean z10) {
            Intrinsics.checkNotNullParameter(unsignedValue, "unsignedValue");
            this.f131098a = unsignedValue;
            this.f131099b = z10;
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f131100a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f131101b;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.ZERO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.POSITIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.NEGATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f131100a = iArr;
            int[] iArr2 = new int[f.values().length];
            try {
                iArr2[f.BIG.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[f.LITTLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f131101b = iArr2;
        }
    }

    static final class c extends l0 implements Function1<u1, CharSequence> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f131102a = new c();

        c() {
            super(1);
        }

        @NotNull
        public final CharSequence c(int i10) {
            return Integer.toUnsignedString(i10) + 'U';
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ CharSequence invoke(u1 u1Var) {
            return c(u1Var.z0());
        }
    }

    static {
        a aVar = new a();
        f131082a = aVar;
        f131083b = new int[0];
        f131084c = k0.f265952a;
        int i10 = 0 & (-1);
        f131085d = -1;
        f131086e = 4294967296L;
        f131087f = g.f334653t;
        f131088g = -1;
        f131089h = 32;
        f131090i = 32;
        f131091j = v1.i(0);
        f131092k = v1.k(new int[]{1});
        f131093l = v1.k(new int[]{2});
        f131094m = v1.k(new int[]{10});
        f131097p = new C1439a(aVar.H(), true, null);
    }

    private a() {
    }

    @kotlin.l(message = "Old byte conversion API")
    private final Pair<v1, l> E0(byte[] bArr) {
        l lVar;
        List<u1> listEmptyList;
        int i10 = (bArr[0] >>> 7) & 1;
        List<List> listChunked = CollectionsKt.chunked(CollectionsKt.reversed(ArraysKt.toList(bArr)), 4);
        if (i10 == 0) {
            lVar = l.POSITIVE;
        } else {
            if (i10 != 1) {
                throw new RuntimeException("Invalid sign value when converting from byte array");
            }
            lVar = l.NEGATIVE;
        }
        int i11 = b.f131100a[lVar.ordinal()];
        if (i11 == 1) {
            throw new RuntimeException("Bug in fromByteArray, sign shouldn't ever be zero at this point.");
        }
        if (i11 != 2) {
            if (i11 != 3) {
                throw new kotlin.k0();
            }
            ArrayList arrayList = new ArrayList();
            for (List list : listChunked) {
                int iN = 0;
                int i12 = 0;
                for (Object obj : CollectionsKt.reversed(list)) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    iN = u1.n(iN + u1.n(u1.n(((Number) obj).byteValue()) << (((list.size() - 1) * 8) - (i12 * 8))));
                    i12 = i13;
                }
                CollectionsKt.addAll(arrayList, v1.d(new int[]{iN}));
            }
            int[] uIntArray = UCollectionsKt.toUIntArray(arrayList);
            int[] iArrX0 = x0(uIntArray, 1);
            ArrayList arrayList2 = new ArrayList(v1.v(iArrX0));
            int iV = v1.v(iArrX0);
            for (int i14 = 0; i14 < iV; i14++) {
                arrayList2.add(u1.c(u1.n(~v1.t(iArrX0, i14))));
            }
            return UArraysKt.m1001contentEqualsKJPZfPQ(uIntArray, Z()) ? new Pair<>(v1.d(Z()), l.ZERO) : new Pair<>(v1.d(S0(UCollectionsKt.toUIntArray(arrayList2))), lVar);
        }
        ArrayList arrayList3 = new ArrayList();
        for (List list2 : listChunked) {
            int iN2 = 0;
            int i15 = 0;
            for (Object obj2 : CollectionsKt.reversed(list2)) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                iN2 = u1.n(iN2 + u1.n(u1.n(u1.n(((Number) obj2).byteValue()) & 255) << (((list2.size() - 1) * 8) - (i15 * 8))));
                i15 = i16;
            }
            int size = (4 - list2.size()) * 8;
            CollectionsKt.addAll(arrayList3, v1.d(new int[]{u1.n(u1.n(iN2 << size) >>> size)}));
        }
        int[] uIntArray2 = UCollectionsKt.toUIntArray(arrayList3);
        if (UArraysKt.m1001contentEqualsKJPZfPQ(uIntArray2, Z())) {
            return new Pair<>(v1.d(Z()), l.ZERO);
        }
        for (int lastIndex = ArraysKt.getLastIndex(uIntArray2); -1 < lastIndex; lastIndex--) {
            if (v1.t(uIntArray2, lastIndex) != 0) {
                listEmptyList = UArraysKt.m1562takeqFRl0hI(uIntArray2, lastIndex + 1);
                return new Pair<>(v1.d(S0(UCollectionsKt.toUIntArray(listEmptyList))), lVar);
            }
        }
        listEmptyList = CollectionsKt.emptyList();
        return new Pair<>(v1.d(S0(UCollectionsKt.toUIntArray(listEmptyList))), lVar);
    }

    @kotlin.l(message = "Old byte conversion API")
    private final Pair<v1, l> F0(Byte[] bArr) {
        l lVar;
        List<u1> listEmptyList;
        int iByteValue = (bArr[0].byteValue() >>> 7) & 1;
        int i10 = 5 << 4;
        List<List> listChunked = CollectionsKt.chunked(CollectionsKt.reversed(ArraysKt.toList(bArr)), 4);
        if (iByteValue == 0) {
            lVar = l.POSITIVE;
        } else {
            if (iByteValue != 1) {
                throw new RuntimeException("Invalid sign value when converting from byte array");
            }
            lVar = l.NEGATIVE;
        }
        int i11 = b.f131100a[lVar.ordinal()];
        if (i11 == 1) {
            throw new RuntimeException("Bug in fromByteArray, sign shouldn't ever be zero at this point.");
        }
        if (i11 != 2) {
            if (i11 != 3) {
                throw new kotlin.k0();
            }
            ArrayList arrayList = new ArrayList();
            for (List list : listChunked) {
                int iN = 0;
                int i12 = 0;
                for (Object obj : CollectionsKt.reversed(list)) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    iN = u1.n(iN + u1.n(u1.n(((Number) obj).byteValue()) << (((list.size() - 1) * 8) - (i12 * 8))));
                    i12 = i13;
                }
                CollectionsKt.addAll(arrayList, v1.d(new int[]{iN}));
            }
            int[] uIntArray = UCollectionsKt.toUIntArray(arrayList);
            int[] iArrX0 = x0(uIntArray, 1);
            ArrayList arrayList2 = new ArrayList(v1.v(iArrX0));
            int iV = v1.v(iArrX0);
            for (int i14 = 0; i14 < iV; i14++) {
                arrayList2.add(u1.c(u1.n(~v1.t(iArrX0, i14))));
            }
            return UArraysKt.m1001contentEqualsKJPZfPQ(uIntArray, Z()) ? new Pair<>(v1.d(Z()), l.ZERO) : new Pair<>(v1.d(S0(UCollectionsKt.toUIntArray(arrayList2))), lVar);
        }
        ArrayList arrayList3 = new ArrayList();
        for (List list2 : listChunked) {
            int iN2 = 0;
            int i15 = 0;
            for (Object obj2 : CollectionsKt.reversed(list2)) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                iN2 = u1.n(iN2 + u1.n(u1.n(u1.n(((Number) obj2).byteValue()) & 255) << (((list2.size() - 1) * 8) - (i15 * 8))));
                i15 = i16;
            }
            int size = (4 - list2.size()) * 8;
            CollectionsKt.addAll(arrayList3, v1.d(new int[]{u1.n(u1.n(iN2 << size) >>> size)}));
        }
        int[] uIntArray2 = UCollectionsKt.toUIntArray(arrayList3);
        if (UArraysKt.m1001contentEqualsKJPZfPQ(uIntArray2, Z())) {
            return new Pair<>(v1.d(Z()), l.ZERO);
        }
        for (int lastIndex = ArraysKt.getLastIndex(uIntArray2); -1 < lastIndex; lastIndex--) {
            if (v1.t(uIntArray2, lastIndex) != 0) {
                listEmptyList = UArraysKt.m1562takeqFRl0hI(uIntArray2, lastIndex + 1);
                return new Pair<>(v1.d(S0(UCollectionsKt.toUIntArray(listEmptyList))), lVar);
            }
        }
        listEmptyList = CollectionsKt.emptyList();
        return new Pair<>(v1.d(S0(UCollectionsKt.toUIntArray(listEmptyList))), lVar);
    }

    @kotlin.l(message = "Old byte conversion API")
    private final Pair<v1, l> G0(q1[] q1VarArr, f fVar) {
        List<List> listChunked;
        List<u1> listEmptyList;
        int i10 = b.f131101b[fVar.ordinal()];
        if (i10 == 1) {
            listChunked = CollectionsKt.chunked(CollectionsKt.reversed(ArraysKt.toList(q1VarArr)), 4);
        } else {
            if (i10 != 2) {
                throw new kotlin.k0();
            }
            listChunked = CollectionsKt.chunked(ArraysKt.toList(q1VarArr), 4);
        }
        l lVar = l.POSITIVE;
        ArrayList arrayList = new ArrayList();
        for (List list : listChunked) {
            int iN = 0;
            int i11 = 0;
            for (Object obj : CollectionsKt.reversed(list)) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                iN = u1.n(iN + u1.n(u1.n(u1.n(((q1) obj).x0() & 255) & 255) << (((list.size() - 1) * 8) - (i11 * 8))));
                i11 = i12;
            }
            int size = (4 - list.size()) * 8;
            CollectionsKt.addAll(arrayList, v1.d(new int[]{u1.n(u1.n(iN << size) >>> size)}));
        }
        int[] uIntArray = UCollectionsKt.toUIntArray(arrayList);
        if (UArraysKt.m1001contentEqualsKJPZfPQ(uIntArray, Z())) {
            return new Pair<>(v1.d(Z()), l.ZERO);
        }
        for (int lastIndex = ArraysKt.getLastIndex(uIntArray); -1 < lastIndex; lastIndex--) {
            if (v1.t(uIntArray, lastIndex) != 0) {
                listEmptyList = UArraysKt.m1562takeqFRl0hI(uIntArray, lastIndex + 1);
                return new Pair<>(v1.d(S0(UCollectionsKt.toUIntArray(listEmptyList))), lVar);
            }
        }
        listEmptyList = CollectionsKt.emptyList();
        return new Pair<>(v1.d(S0(UCollectionsKt.toUIntArray(listEmptyList))), lVar);
    }

    @kotlin.l(message = "Old byte conversion API")
    private final Pair<v1, l> H0(byte[] bArr, f fVar) {
        List<List> listChunked;
        List<u1> listEmptyList;
        int i10 = b.f131101b[fVar.ordinal()];
        if (i10 == 1) {
            listChunked = CollectionsKt.chunked(CollectionsKt.reversed(CollectionsKt.toList(r1.d(bArr))), 4);
        } else {
            if (i10 != 2) {
                throw new kotlin.k0();
            }
            listChunked = CollectionsKt.chunked(CollectionsKt.toList(r1.d(bArr)), 4);
        }
        l lVar = l.POSITIVE;
        ArrayList arrayList = new ArrayList();
        for (List list : listChunked) {
            int iN = 0;
            int i11 = 0;
            for (Object obj : CollectionsKt.reversed(list)) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                iN = u1.n(iN + u1.n(u1.n(u1.n(((q1) obj).x0() & 255) & 255) << (((list.size() - 1) * 8) - (i11 * 8))));
                i11 = i12;
            }
            int size = (4 - list.size()) * 8;
            CollectionsKt.addAll(arrayList, v1.d(new int[]{u1.n(u1.n(iN << size) >>> size)}));
        }
        int[] uIntArray = UCollectionsKt.toUIntArray(arrayList);
        if (UArraysKt.m1001contentEqualsKJPZfPQ(uIntArray, Z())) {
            return new Pair<>(v1.d(Z()), l.ZERO);
        }
        for (int lastIndex = ArraysKt.getLastIndex(uIntArray); -1 < lastIndex; lastIndex--) {
            if (v1.t(uIntArray, lastIndex) != 0) {
                listEmptyList = UArraysKt.m1562takeqFRl0hI(uIntArray, lastIndex + 1);
                return new Pair<>(v1.d(S0(UCollectionsKt.toUIntArray(listEmptyList))), lVar);
            }
        }
        listEmptyList = CollectionsKt.emptyList();
        return new Pair<>(v1.d(S0(UCollectionsKt.toUIntArray(listEmptyList))), lVar);
    }

    @kotlin.l(message = "Old byte conversion API")
    private final Byte[] I0(int[] iArr, l lVar) {
        List listEmptyList;
        if (v1.B(iArr)) {
            return new Byte[0];
        }
        byte[] bArrCopyOf = Arrays.copyOf(new byte[]{1}, 1);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        r1.k(bArrCopyOf);
        int iN = N(iArr);
        int i10 = b.f131100a[lVar.ordinal()];
        if (i10 == 1) {
            listEmptyList = CollectionsKt.emptyList();
        } else if (i10 == 2) {
            ArrayList arrayList = new ArrayList();
            int iV = v1.v(iArr);
            for (int i11 = 0; i11 < iV; i11++) {
                int iT = v1.t(iArr, i11);
                CollectionsKt.addAll(arrayList, CollectionsKt.listOf((Object[]) new Byte[]{Byte.valueOf((byte) u1.n(u1.n(iT >>> 24) & 255)), Byte.valueOf((byte) u1.n(u1.n(iT >>> 16) & 255)), Byte.valueOf((byte) u1.n(u1.n(iT >>> 8) & 255)), Byte.valueOf((byte) u1.n(iT & 255))}));
            }
            listEmptyList = CollectionsKt.flatten(CollectionsKt.reversed(CollectionsKt.chunked(CollectionsKt.takeLast(arrayList, (v1.v(iArr) * 4) + 1), 4)));
            if (iN % 8 == 0) {
                listEmptyList = CollectionsKt.plus((Collection) CollectionsKt.listOf((byte) 0), (Iterable) listEmptyList);
            }
        } else {
            if (i10 != 3) {
                throw new kotlin.k0();
            }
            ArrayList arrayList2 = new ArrayList(v1.v(iArr));
            int iV2 = v1.v(iArr);
            for (int i12 = 0; i12 < iV2; i12++) {
                arrayList2.add(u1.c(u1.n(~v1.t(iArr, i12))));
            }
            int[] iArrL0 = L0(UCollectionsKt.toUIntArray(arrayList2), 1);
            ArrayList arrayList3 = new ArrayList();
            int iV3 = v1.v(iArrL0);
            for (int i13 = 0; i13 < iV3; i13++) {
                int iT2 = v1.t(iArrL0, i13);
                CollectionsKt.addAll(arrayList3, CollectionsKt.listOf((Object[]) new Byte[]{Byte.valueOf((byte) u1.n(u1.n(iT2 >>> 24) & 255)), Byte.valueOf((byte) u1.n(u1.n(iT2 >>> 16) & 255)), Byte.valueOf((byte) u1.n(u1.n(iT2 >>> 8) & 255)), Byte.valueOf((byte) u1.n(iT2 & 255))}));
            }
            listEmptyList = CollectionsKt.flatten(CollectionsKt.reversed(CollectionsKt.chunked(CollectionsKt.takeLast(arrayList3, (v1.v(iArr) * 4) + 1), 4)));
            if (iN % 8 == 0) {
                listEmptyList = CollectionsKt.plus((Collection) CollectionsKt.listOf((byte) -1), (Iterable) listEmptyList);
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : listEmptyList) {
                if (((Number) obj).byteValue() != -1) {
                    break;
                }
                arrayList4.add(obj);
            }
            int size = arrayList4.size();
            if (size > 1) {
                listEmptyList = listEmptyList.subList(size - 1, listEmptyList.size());
            }
        }
        return (Byte[]) listEmptyList.toArray(new Byte[0]);
    }

    private final Pair<v1, v1> T0(int[] iArr) {
        int iV = v1.v(iArr);
        int iFloor = (int) Math.floor(((double) (iV - 1)) / ((double) 4));
        if (iFloor == 0) {
            return c(iArr);
        }
        int i10 = iV / 4;
        int i11 = iV % 4;
        int i12 = iFloor * 32;
        int i13 = iV - ((i10 * 3) + i11);
        int i14 = iV - ((i10 * 2) + i11);
        int[] iArrK = v1.k(ArraysKt.copyOfRange(iArr, i13, i14));
        int[] iArrK2 = v1.k(ArraysKt.copyOfRange(iArr, 0, i13));
        Pair<v1, v1> pairT0 = T0(v1.k(ArraysKt.copyOfRange(iArr, i14, iV)));
        int[] iArrG = pairT0.component1().G();
        Pair<v1, v1> pairE = e(K0(V0(pairT0.component2().G(), i12), iArrK), V0(iArrG, 1));
        int[] iArrG2 = pairE.component1().G();
        return new Pair<>(v1.d(K0(V0(iArrG, i12), iArrG2)), v1.d(w0(K0(V0(pairE.component2().G(), i12), iArrK2), f1(iArrG2, iArrG2))));
    }

    private final C1439a Y0(C1439a c1439a, C1439a c1439a2) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (c1439a.e() ^ c1439a2.e()) {
            return k(c1439a.f(), c1439a2.f()) > 0 ? new C1439a(w0(c1439a.f(), c1439a2.f()), c1439a.e(), defaultConstructorMarker) : new C1439a(w0(c1439a2.f(), c1439a.f()), c1439a2.e(), defaultConstructorMarker);
        }
        return new C1439a(K0(c1439a.f(), c1439a2.f()), c1439a.e(), defaultConstructorMarker);
    }

    private final C1439a Z0(C1439a c1439a, C1439a c1439a2) {
        return new C1439a(e0(c1439a.f(), c1439a2.f()), !(c1439a.e() ^ c1439a2.e()), null);
    }

    private final C1439a a1(C1439a c1439a, C1439a c1439a2) {
        return new C1439a(f1(c1439a.f(), c1439a2.f()), !(c1439a.e() ^ c1439a2.e()), null);
    }

    private final C1439a b1(C1439a c1439a, C1439a c1439a2) {
        return new C1439a(Q0(c1439a.f(), c1439a2.f()), !(c1439a.e() ^ c1439a2.e()), null);
    }

    private final C1439a c1(C1439a c1439a, C1439a c1439a2) {
        return Y0(c1439a, C1439a.d(c1439a2, null, !c1439a2.e(), 1, null));
    }

    private final int[] f(int[] iArr, int[] iArr2) {
        while (!UArraysKt.m1001contentEqualsKJPZfPQ(iArr, iArr2)) {
            if (UArraysKt.m1001contentEqualsKJPZfPQ(iArr, Z())) {
                return iArr2;
            }
            if (UArraysKt.m1001contentEqualsKJPZfPQ(iArr2, Z())) {
                break;
            }
            if (UArraysKt.m1001contentEqualsKJPZfPQ(r(iArr, E()), Z())) {
                if (UArraysKt.m1001contentEqualsKJPZfPQ(r(iArr2, E()), Z())) {
                    return V0(f(X0(iArr, 1), X0(iArr2, 1)), 1);
                }
                iArr = X0(iArr, 1);
            } else if (UArraysKt.m1001contentEqualsKJPZfPQ(r(iArr2, E()), Z())) {
                iArr2 = X0(iArr2, 1);
            } else if (B(iArr, iArr2) == 1) {
                iArr = X0(O(iArr, iArr2), 1);
            } else {
                int[] iArrX0 = X0(O(iArr2, iArr), 1);
                iArr2 = iArr;
                iArr = iArrX0;
            }
        }
        return iArr;
    }

    private final List<Byte> h0(List<Byte> list) {
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (Object obj : list) {
            if (z10) {
                arrayList.add(obj);
            } else if (((Number) obj).byteValue() != 0) {
                arrayList.add(obj);
                z10 = true;
            }
        }
        return arrayList;
    }

    private final Pair<v1, Integer> i(int[] iArr, Pair<v1, Integer> pair) {
        return !v1.s(X0(f1(iArr, pair.getFirst().G()), pair.getSecond().intValue()), E()) ? new Pair<>(pair.getFirst(), Integer.valueOf(pair.getSecond().intValue() - 1)) : new Pair<>(pair.getFirst(), pair.getSecond());
    }

    private final Byte[] i0(Byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (Byte b10 : bArr) {
            if (z10) {
                arrayList.add(b10);
            } else if (b10.byteValue() != 0) {
                arrayList.add(b10);
                z10 = true;
            }
        }
        return (Byte[]) arrayList.toArray(new Byte[0]);
    }

    private final q1[] j0(q1[] q1VarArr) {
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (q1 q1Var : q1VarArr) {
            if (z10) {
                arrayList.add(q1Var);
            } else if (q1Var.x0() != q1.n((byte) 0)) {
                arrayList.add(q1Var);
                z10 = true;
            }
        }
        return (q1[]) arrayList.toArray(new q1[0]);
    }

    private final byte[] k0(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        int iV = r1.v(bArr);
        boolean z10 = false;
        for (int i10 = 0; i10 < iV; i10++) {
            byte bT = r1.t(bArr, i10);
            if (z10) {
                arrayList.add(q1.c(bT));
            } else if (bT != q1.n((byte) 0)) {
                arrayList.add(q1.c(bT));
                z10 = true;
                int i11 = 7 ^ 1;
            }
        }
        return UCollectionsKt.toUByteArray(arrayList);
    }

    private final int[] l0(int[] iArr, int[] iArr2) {
        while (true) {
            int[] iArr3 = iArr2;
            int[] iArr4 = iArr;
            iArr = iArr3;
            if (v1.s(iArr, Z())) {
                return iArr4;
            }
            iArr2 = Q0(iArr4, iArr);
        }
    }

    @Override // com.ionspin.kotlin.bignum.integer.b
    @NotNull
    public int[] A(long j10) {
        return new int[]{u1.n((int) y1.n(y1.n((-4294967296L) & j10) >>> 32)), u1.n((int) j10)};
    }

    @NotNull
    public final int[] A0(@NotNull int[] first, @NotNull int[] second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        if (v1.s(first, Z()) || v1.s(second, Z())) {
            return Z();
        }
        if (v1.v(first) >= 60 || v1.v(second) == 60) {
            return u0(first, second);
        }
        int[] iArrZ = Z();
        int iV = v1.v(second);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            int iT = v1.t(second, i10);
            a aVar = f131082a;
            iArrZ = aVar.K0(iArrZ, aVar.V0(aVar.y0(first, iT), i11 * aVar.a()));
            i10++;
            i11++;
        }
        return S0(iArrZ);
    }

    @Override // com.ionspin.kotlin.bignum.integer.b
    public int B(@NotNull int[] first, @NotNull int[] second) {
        boolean z10;
        boolean z11;
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        int iV = v1.v(first) - a0(first);
        int iV2 = v1.v(second) - a0(second);
        if (iV > iV2) {
            return 1;
        }
        if (iV2 > iV) {
            return -1;
        }
        int i10 = iV - 1;
        while (true) {
            if (i10 < 0) {
                z10 = true;
                z11 = false;
                break;
            }
            if (Integer.compareUnsigned(v1.t(first, i10), v1.t(second, i10)) > 0) {
                z11 = true;
                z10 = false;
                break;
            }
            if (Integer.compareUnsigned(v1.t(first, i10), v1.t(second, i10)) < 0) {
                z10 = false;
                z11 = false;
                break;
            }
            i10--;
        }
        if (z10) {
            return 0;
        }
        return z11 ? 1 : -1;
    }

    @NotNull
    public final Pair<v1, Integer> B0(@NotNull int[] operand) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        int iX = x(v1.t(operand, v1.v(operand) - 1));
        return new Pair<>(v1.d(V0(operand, iX)), Integer.valueOf(iX));
    }

    @Override // com.ionspin.kotlin.bignum.integer.b
    @NotNull
    public Pair<v1, v1> C(@NotNull int[] first, @NotNull int[] second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        return d(first, second);
    }

    @NotNull
    public final n1<v1, v1, Integer> C0(@NotNull int[] dividend, @NotNull int[] divisor) {
        Intrinsics.checkNotNullParameter(dividend, "dividend");
        Intrinsics.checkNotNullParameter(divisor, "divisor");
        int iX = x(v1.t(divisor, v1.v(divisor) - 1));
        return new n1<>(v1.d(V0(dividend, iX)), v1.d(V0(divisor, iX)), Integer.valueOf(iX));
    }

    @Override // com.ionspin.kotlin.bignum.integer.b
    public long D(@NotNull int[] operand) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        double dCeil = Math.ceil(((double) (N(operand) - 1)) * com.ionspin.kotlin.bignum.integer.a.f131059e.I());
        int[] iArrE0 = e0(operand, v(W(), (long) dCeil));
        long j10 = 0;
        while (B(iArrE0, Z()) != 0) {
            iArrE0 = e0(iArrE0, W());
            j10++;
        }
        return j10 + ((long) ((int) dCeil));
    }

    public final int D0(int i10) {
        int i11;
        int iN = u1.n(i10 << 16);
        int i12 = f131085d;
        int iN2 = u1.n(iN & i12);
        if (iN2 != 0) {
            i10 = iN2;
            i11 = 16;
        } else {
            i11 = 32;
        }
        int iN3 = u1.n(u1.n(i10 << 8) & i12);
        if (iN3 != 0) {
            i11 -= 8;
            i10 = iN3;
        }
        int iN4 = u1.n(u1.n(i10 << 4) & i12);
        if (iN4 != 0) {
            i11 -= 4;
            i10 = iN4;
        }
        int iN5 = u1.n(u1.n(i10 << 2) & i12);
        if (iN5 != 0) {
            i11 -= 2;
            i10 = iN5;
        }
        return u1.n(i12 & u1.n(i10 << 1)) != 0 ? i11 - 2 : i11 - i10;
    }

    @Override // com.ionspin.kotlin.bignum.integer.b
    @NotNull
    public int[] E() {
        return f131092k;
    }

    @Override // com.ionspin.kotlin.bignum.integer.b
    @NotNull
    public int[] F(@NotNull int[] operand, int i10) {
        int iN;
        Intrinsics.checkNotNullParameter(operand, "operand");
        if (!v1.B(operand) && i10 != 0) {
            int iA = i10 % a();
            int iA2 = i10 / a();
            if (iA2 >= v1.v(operand)) {
                return Z();
            }
            if (iA == 0) {
                return v1.k(ArraysKt.copyOfRange(operand, iA2, v1.v(operand)));
            }
            if (v1.v(operand) > 1 && v1.v(operand) - iA2 == 1) {
                return new int[]{u1.n(v1.t(operand, v1.v(operand) - 1) >>> iA)};
            }
            int iV = v1.v(operand) - iA2;
            int[] iArr = new int[iV];
            for (int i11 = 0; i11 < iV; i11++) {
                if (i11 >= 0 && i11 < (v1.v(operand) - 1) - iA2) {
                    int i12 = i11 + iA2;
                    iN = u1.n(u1.n(v1.t(operand, i12 + 1) << (f131082a.a() - iA)) | u1.n(v1.t(operand, i12) >>> iA));
                } else {
                    if (i11 != (v1.v(operand) - 1) - iA2) {
                        throw new RuntimeException("Invalid case " + i11);
                    }
                    iN = u1.n(v1.t(operand, i11 + iA2) >>> iA);
                }
                iArr[i11] = iN;
            }
            return S0(v1.k(iArr));
        }
        return operand;
    }

    @Override // com.ionspin.kotlin.bignum.integer.b
    @NotNull
    public Pair<v1, v1> G(@NotNull int[] operand) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        return T0(operand);
    }

    @Override // com.ionspin.kotlin.bignum.integer.b
    @NotNull
    public int[] H() {
        return f131093l;
    }

    @Override // com.ionspin.kotlin.bignum.integer.b
    @NotNull
    public int[] I(@NotNull int[] operand) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        int iV = v1.v(operand);
        int[] iArr = new int[iV];
        for (int i10 = 0; i10 < iV; i10++) {
            iArr[i10] = u1.n(~v1.t(operand, i10));
        }
        return S0(v1.k(iArr));
    }

    @Override // com.ionspin.kotlin.bignum.integer.b
    @NotNull
    public int[] J(@NotNull int[] first, @NotNull int[] second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        if (v1.v(first) == 1 && v1.t(first, 0) == 0) {
            return second;
        }
        if (v1.v(second) == 1 && v1.t(second, 0) == 0) {
            return first;
        }
        h hVar = v1.v(first) > v1.v(second) ? new h(Integer.valueOf(v1.v(first)), Integer.valueOf(v1.v(second)), v1.d(first), v1.d(second)) : new h(Integer.valueOf(v1.v(second)), Integer.valueOf(v1.v(first)), v1.d(second), v1.d(first));
        int iIntValue = ((Number) hVar.a()).intValue();
        int iIntValue2 = ((Number) hVar.b()).intValue();
        int[] iArrG = ((v1) hVar.c()).G();
        int[] iArrG2 = ((v1) hVar.d()).G();
        int i10 = iIntValue + 1;
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = 0;
        }
        int[] iArrK = v1.k(iArr);
        int i12 = 0;
        long jN = 0;
        while (i12 < iIntValue2) {
            long jN2 = y1.n(y1.n(jN + y1.n(((long) v1.t(iArrG, i12)) & k0.f265952a)) + y1.n(k0.f265952a & ((long) v1.t(iArrG2, i12))));
            v1.D(iArrK, i12, u1.n((int) y1.n(f131084c & jN2)));
            jN = y1.n(jN2 >>> a());
            i12++;
        }
        while (jN != 0) {
            if (i12 == iIntValue) {
                v1.D(iArrK, iIntValue, u1.n((int) jN));
                return iArrK;
            }
            long jN3 = y1.n(jN + y1.n(((long) v1.t(iArrG, i12)) & k0.f265952a));
            v1.D(iArrK, i12, u1.n((int) y1.n(f131084c & jN3)));
            jN = y1.n(jN3 >>> a());
            i12++;
        }
        while (i12 < iIntValue) {
            v1.D(iArrK, i12, v1.t(iArrG, i12));
            i12++;
        }
        return v1.t(iArrK, v1.v(iArrK) - 1) == 0 ? v1.k(ArraysKt.copyOfRange(iArrK, 0, v1.v(iArrK) - 1)) : iArrK;
    }

    @NotNull
    public final C1439a J0(@NotNull C1439a c1439a, @NotNull C1439a other) {
        Intrinsics.checkNotNullParameter(c1439a, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Y0(c1439a, other);
    }

    @Override // com.ionspin.kotlin.bignum.integer.b
    @NotNull
    public int[] K(int i10) {
        return new int[]{u1.n(Math.abs(i10))};
    }

    @NotNull
    public final int[] K0(@NotNull int[] plus, @NotNull int[] other) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(other, "other");
        return J(plus, other);
    }

    @Override // com.ionspin.kotlin.bignum.integer.b
    @NotNull
    public int[] L(@NotNull int[] operand, @NotNull int[] mask) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        Intrinsics.checkNotNullParameter(mask, "mask");
        int iV = v1.v(operand);
        int[] iArr = new int[iV];
        int i10 = 0;
        while (i10 < iV) {
            iArr[i10] = i10 < v1.v(mask) ? u1.n(v1.t(operand, i10) | v1.t(mask, i10)) : v1.t(operand, i10);
            i10++;
        }
        return S0(v1.k(iArr));
    }

    @NotNull
    public final int[] L0(@NotNull int[] plus, int i10) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        return J(plus, new int[]{i10});
    }

    @Override // com.ionspin.kotlin.bignum.integer.b
    @NotNull
    public int[] M(int i10) {
        return new int[]{i10};
    }

    @NotNull
    public final int[] M0(@NotNull int[] original, int i10, int i11) {
        Intrinsics.checkNotNullParameter(original, "original");
        int iV = v1.v(original) + i10;
        int[] iArr = new int[iV];
        int i12 = 0;
        while (i12 < iV) {
            iArr[i12] = i12 < i10 ? i11 : v1.t(original, i12 - i10);
            i12++;
        }
        return v1.k(iArr);
    }

    @Override // com.ionspin.kotlin.bignum.integer.b
    public int N(@NotNull int[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (v1.B(value)) {
            return 0;
        }
        return h(v1.t(value, v1.v(value) - 1)) + ((v1.v(value) - 1) * a());
    }

    @NotNull
    public final Pair<v1, v1> N0(@NotNull int[] first, @NotNull int[] second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        int iV = (v1.v(first) - v1.v(second)) * 2;
        int[] iArrG = b0(V0(second, f131090i * iV)).getFirst().G();
        int[] iArrF1 = f1(first, iArrG);
        int i10 = 1 >> 0;
        if (j(iArrF1, 0) == 0) {
            return new Pair<>(v1.d(Z()), v1.d(first));
        }
        if (v1.v(iArrF1) != 1) {
            if (Long.compareUnsigned(y1.n(((long) v1.t(iArrF1, v1.v(iArrF1) - v1.v(second))) & k0.f265952a), f131084c) >= 0) {
                int iV2 = v1.v(iArrF1);
                int[] iArr = new int[iV2];
                int i11 = 0;
                while (i11 < iV2) {
                    iArr[i11] = i11 == v1.v(iArrF1) - 1 ? u1.n(v1.t(iArrF1, v1.v(iArrF1) - 1) + 1) : 0;
                    i11++;
                }
                iArrF1 = v1.k(iArr);
            }
        } else if (j(iArrF1, u1.n(f131085d - 1)) >= 0) {
            iArrF1 = K0(iArrF1, E());
        }
        int iV3 = (v1.v(iArrF1) - (v1.v(iArrG) * 2)) + iV;
        int[] iArrK = v1.k(ArraysKt.copyOfRange(iArrF1, v1.v(iArrF1) - (iV3 != 0 ? iV3 : 1), v1.v(iArrF1)));
        return new Pair<>(v1.d(iArrK), v1.d(w0(first, f1(iArrK, second))));
    }

    @Override // com.ionspin.kotlin.bignum.integer.b
    @NotNull
    public int[] O(@NotNull int[] first, @NotNull int[] second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        int[] iArrS0 = S0(first);
        int[] iArrS1 = S0(second);
        boolean z10 = true;
        h hVar = B(iArrS0, iArrS1) == 1 ? new h(Integer.valueOf(v1.v(iArrS0)), Integer.valueOf(v1.v(iArrS1)), v1.d(iArrS0), v1.d(iArrS1)) : new h(Integer.valueOf(v1.v(iArrS1)), Integer.valueOf(v1.v(iArrS0)), v1.d(iArrS1), v1.d(iArrS0));
        int iIntValue = ((Number) hVar.a()).intValue();
        int iIntValue2 = ((Number) hVar.b()).intValue();
        int[] iArrG = ((v1) hVar.c()).G();
        int[] iArrG2 = ((v1) hVar.d()).G();
        int i10 = iIntValue + 1;
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = 0;
        }
        int[] iArrK = v1.k(iArr);
        int i12 = 0;
        long jN = 0;
        while (i12 < iIntValue2) {
            boolean z11 = z10;
            if (i12 >= v1.v(iArrG)) {
                System.out.println((Object) "Breakpoint");
            }
            if (i12 >= v1.v(iArrG2)) {
                System.out.println((Object) "Breakpoint");
            }
            long jN2 = y1.n(y1.n(y1.n(((long) v1.t(iArrG, i12)) & k0.f265952a) - y1.n(((long) v1.t(iArrG2, i12)) & k0.f265952a)) - jN);
            v1.D(iArrK, i12, u1.n((int) jN2));
            jN = y1.n(y1.n(jN2 & f131086e) >>> f131090i);
            i12++;
            z10 = z11;
        }
        while (jN != 0) {
            long jN3 = y1.n(y1.n(((long) v1.t(iArrG, i12)) & k0.f265952a) - jN);
            v1.D(iArrK, i12, u1.n(u1.n((int) jN3) & f131085d));
            jN = y1.n(y1.n(jN3 & f131086e) >>> f131090i);
            i12++;
        }
        while (i12 < iIntValue) {
            v1.D(iArrK, i12, v1.t(iArrG, i12));
            i12++;
        }
        ArrayList arrayList = new ArrayList();
        int iV = v1.v(iArrK);
        for (int i13 = 0; i13 < iV; i13++) {
            int iT = v1.t(iArrK, i13);
            if (iT == 0) {
                arrayList.add(u1.c(iT));
            }
        }
        if (arrayList.isEmpty()) {
            return Z();
        }
        int i14 = -1;
        int length = iArrK.length - 1;
        if (length >= 0) {
            while (true) {
                int i15 = length - 1;
                if (u1.n(iArrK[length]) != 0) {
                    i14 = length;
                    break;
                }
                if (i15 < 0) {
                    break;
                }
                length = i15;
            }
        }
        return v1.k(ArraysKt.copyOfRange(iArrK, 0, i14 + 1));
    }

    @NotNull
    public final Pair<v1, Integer> O0(int i10) {
        int iH = h(i10);
        int i11 = iH * 4;
        if (iH * 2 <= 63) {
            return i(new int[]{i10}, new Pair<>(v1.d(new int[]{u1.n((int) Long.divideUnsigned(y1.n(1 << i11), y1.n(((long) i10) & k0.f265952a)))}), Integer.valueOf(i11)));
        }
        return i(new int[]{i10}, new Pair<>(v1.d(f0(V0(E(), i11), i10)), Integer.valueOf(i11)));
    }

    @Override // com.ionspin.kotlin.bignum.integer.b
    @NotNull
    public int[] P(@NotNull int[] first, @NotNull int[] second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        return (v1.v(first) > 150 || v1.v(second) > 150) ? l0(first, second) : f(first, second);
    }

    @NotNull
    public final C1439a P0(@NotNull C1439a c1439a, @NotNull C1439a other) {
        Intrinsics.checkNotNullParameter(c1439a, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return b1(c1439a, other);
    }

    @Override // com.ionspin.kotlin.bignum.integer.b
    @NotNull
    public int[] Q(@NotNull int[] first, @NotNull int[] second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        if (v1.s(first, Z()) || v1.s(second, Z())) {
            return Z();
        }
        if (v1.v(first) >= 60 || v1.v(second) == 60) {
            return u0(first, second);
        }
        int[] iArrZ = Z();
        int iV = v1.v(second);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iV) {
            int iT = v1.t(second, i10);
            a aVar = f131082a;
            iArrZ = aVar.K0(iArrZ, aVar.V0(aVar.y0(first, iT), i11 * aVar.a()));
            i10++;
            i11++;
        }
        return S0(iArrZ);
    }

    @NotNull
    public final int[] Q0(@NotNull int[] rem, @NotNull int[] other) {
        Intrinsics.checkNotNullParameter(rem, "$this$rem");
        Intrinsics.checkNotNullParameter(other, "other");
        return C(rem, other).getSecond().G();
    }

    @Override // com.ionspin.kotlin.bignum.integer.b
    @NotNull
    public int[] R(@NotNull int[] operand, @NotNull int[] mask) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        Intrinsics.checkNotNullParameter(mask, "mask");
        int iV = v1.v(operand);
        int[] iArr = new int[iV];
        int i10 = 0;
        while (i10 < iV) {
            iArr[i10] = i10 < v1.v(mask) ? u1.n(v1.t(operand, i10) ^ v1.t(mask, i10)) : u1.n(v1.t(operand, i10));
            i10++;
        }
        return S0(v1.k(iArr));
    }

    @NotNull
    public final int[] R0(@NotNull int[] rem, int i10) {
        Intrinsics.checkNotNullParameter(rem, "$this$rem");
        return C(rem, new int[]{i10}).getSecond().G();
    }

    @Override // com.ionspin.kotlin.bignum.integer.b
    @NotNull
    public int[] S(@NotNull String number, int i10) {
        Intrinsics.checkNotNullParameter(number, "number");
        int[] iArrZ = Z();
        for (int i11 = 0; i11 < number.length(); i11++) {
            char cCharAt = number.charAt(i11);
            a aVar = f131082a;
            iArrZ = aVar.L0(aVar.g1(iArrZ, u1.n(i10)), u1.n(com.ionspin.kotlin.bignum.integer.util.b.a(cCharAt, i10)));
        }
        return iArrZ;
    }

    @NotNull
    public final int[] S0(@NotNull int[] bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "bigInteger");
        int length = bigInteger.length - 1;
        if (length < 0) {
            length = -1;
            break;
        }
        while (true) {
            int i10 = length - 1;
            if (u1.n(bigInteger[length]) != 0) {
                break;
            }
            if (i10 < 0) {
                length = -1;
                break;
            }
            length = i10;
        }
        int i11 = length + 1;
        return (i11 == -1 || i11 == 0) ? Z() : v1.k(ArraysKt.copyOfRange(bigInteger, 0, i11));
    }

    @Override // com.ionspin.kotlin.bignum.integer.b
    @NotNull
    public int[] T(@NotNull int[] operand, long j10, boolean z10) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        long j11 = 63;
        long j12 = j10 / j11;
        if (j12 > g3.f12256c) {
            throw new RuntimeException("Invalid bit index, too large, cannot access word (Word position > Int.MAX_VALUE");
        }
        if (j12 >= v1.v(operand)) {
            throw new IndexOutOfBoundsException("Invalid position, addressed word " + j12 + " larger than number of words " + v1.v(operand));
        }
        int iN = u1.n(1 << ((int) (j10 % j11)));
        int iV = v1.v(operand);
        int[] iArr = new int[iV];
        int i10 = 2 << 0;
        for (int i11 = 0; i11 < iV; i11++) {
            iArr[i11] = i11 == ((int) j12) ? z10 ? u1.n(v1.t(operand, i11) | iN) : u1.n(v1.t(operand, i11) ^ iN) : v1.t(operand, i11);
        }
        return v1.k(iArr);
    }

    @Override // com.ionspin.kotlin.bignum.integer.b
    @NotNull
    public Pair<v1, v1> U(@NotNull int[] operand) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        return b0(operand);
    }

    @NotNull
    public final C1439a U0(@NotNull C1439a c1439a, int i10) {
        Intrinsics.checkNotNullParameter(c1439a, "<this>");
        return new C1439a(V0(c1439a.f(), i10), c1439a.e(), null);
    }

    @Override // com.ionspin.kotlin.bignum.integer.b
    public int V(@NotNull int[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (UArraysKt.m1001contentEqualsKJPZfPQ(value, Z())) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        int iV = v1.v(value);
        for (int i10 = 0; i10 < iV; i10++) {
            int iT = v1.t(value, i10);
            if (iT != 0) {
                break;
            }
            arrayList.add(u1.c(iT));
        }
        int size = arrayList.size();
        if (size == v1.v(value)) {
            return 0;
        }
        return k1(v1.t(value, size)) + (size * 63);
    }

    @NotNull
    public final int[] V0(@NotNull int[] shl, int i10) {
        Intrinsics.checkNotNullParameter(shl, "$this$shl");
        return q(shl, i10);
    }

    @Override // com.ionspin.kotlin.bignum.integer.b
    @NotNull
    public int[] W() {
        return f131094m;
    }

    @NotNull
    public final C1439a W0(@NotNull C1439a c1439a, int i10) {
        Intrinsics.checkNotNullParameter(c1439a, "<this>");
        return new C1439a(X0(c1439a.f(), i10), c1439a.e(), null);
    }

    @Override // com.ionspin.kotlin.bignum.integer.b
    @NotNull
    public byte[] X(@NotNull int[] operand) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        throw new kotlin.l0("An operation is not implemented: not implemented yet");
    }

    @NotNull
    public final int[] X0(@NotNull int[] shr, int i10) {
        Intrinsics.checkNotNullParameter(shr, "$this$shr");
        return F(shr, i10);
    }

    @Override // com.ionspin.kotlin.bignum.integer.b
    @NotNull
    public byte[] Y(@NotNull int[] operand, @NotNull f endianness) {
        Collection collectionD;
        Intrinsics.checkNotNullParameter(operand, "operand");
        Intrinsics.checkNotNullParameter(endianness, "endianness");
        int i10 = b.f131101b[endianness.ordinal()];
        if (i10 == 1) {
            List<u1> list = UArraysKt.m1440reversedajY9A(operand);
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                int iZ0 = ((u1) it.next()).z0();
                int iX = i11 == v1.v(operand) - 1 ? f131082a.x(iZ0) / 8 : 0;
                i11++;
                CollectionsKt.addAll(arrayList, CollectionsKt.drop(CollectionsKt.listOf((Object[]) new q1[]{q1.c(q1.n((byte) u1.n(u1.n(iZ0 >>> 24) & 255))), q1.c(q1.n((byte) u1.n(u1.n(iZ0 >>> 16) & 255))), q1.c(q1.n((byte) u1.n(u1.n(iZ0 >>> 8) & 255))), q1.c(q1.n((byte) u1.n(iZ0 & 255)))}), iX));
            }
            collectionD = arrayList;
        } else {
            if (i10 != 2) {
                throw new kotlin.k0();
            }
            ArrayList arrayList2 = new ArrayList();
            int iV = v1.v(operand);
            for (int i12 = 0; i12 < iV; i12++) {
                v1.t(operand, i12);
                List<u1> list2 = UArraysKt.m1440reversedajY9A(operand);
                ArrayList arrayList3 = new ArrayList();
                Iterator<T> it2 = list2.iterator();
                int i13 = 0;
                while (it2.hasNext()) {
                    int iZ1 = ((u1) it2.next()).z0();
                    int iX2 = i13 == v1.v(operand) - 1 ? f131082a.x(iZ1) / 8 : 0;
                    i13++;
                    CollectionsKt.addAll(arrayList3, CollectionsKt.dropLast(CollectionsKt.listOf((Object[]) new q1[]{q1.c(q1.n((byte) u1.n(iZ1 & 255))), q1.c(q1.n((byte) u1.n(u1.n(iZ1 >>> 8) & 255))), q1.c(q1.n((byte) u1.n(u1.n(iZ1 >>> 16) & 255))), q1.c(q1.n((byte) u1.n(u1.n(iZ1 >>> 24) & 255)))}), iX2));
                }
                CollectionsKt.addAll(arrayList2, arrayList3);
            }
            collectionD = r1.d(UCollectionsKt.toUByteArray(arrayList2));
        }
        return UCollectionsKt.toUByteArray(collectionD);
    }

    @Override // com.ionspin.kotlin.bignum.integer.b
    @NotNull
    public int[] Z() {
        return f131091j;
    }

    @Override // com.ionspin.kotlin.bignum.integer.b
    public int a() {
        return f131089h;
    }

    public final int a0(@NotNull int[] bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "bigInteger");
        int iV = v1.v(bigInteger) - 1;
        if (iV <= 0) {
            return 0;
        }
        int iT = v1.t(bigInteger, iV);
        while (iT == 0 && iV > 0) {
            iV--;
            iT = v1.t(bigInteger, iV);
        }
        if (v1.t(bigInteger, iV) == 0) {
            iV--;
        }
        return (v1.v(bigInteger) - iV) - 1;
    }

    @NotNull
    public final C1439a b(@NotNull C1439a and, @NotNull int[] operand) {
        Intrinsics.checkNotNullParameter(and, "$this$and");
        Intrinsics.checkNotNullParameter(operand, "operand");
        return new C1439a(r(and.f(), operand), and.e(), null);
    }

    @NotNull
    public final Pair<v1, v1> b0(@NotNull int[] a10) {
        int[] iArrW0;
        Intrinsics.checkNotNullParameter(a10, "a");
        int iV = v1.v(a10);
        int i10 = iV - 1;
        if (i10 <= 2) {
            if (i10 == 0) {
                i10 = 1;
            }
            int[] iArrV0 = V0(E(), i10 * 2 * f131090i);
            int[] iArrE0 = e0(iArrV0, a10);
            return new Pair<>(v1.d(iArrE0), v1.d(w0(iArrV0, f1(iArrE0, a10))));
        }
        int iFloor = (int) Math.floor(((double) (iV - 2)) / ((double) 2));
        int i11 = i10 - iFloor;
        int[] iArrK = v1.k(ArraysKt.copyOfRange(a10, (v1.v(a10) - i11) - 1, v1.v(a10)));
        int i12 = 5 ^ 0;
        int[] iArrK2 = v1.k(ArraysKt.copyOfRange(a10, 0, iFloor));
        Pair<v1, v1> pairB0 = b0(iArrK);
        int[] iArrG = pairB0.component1().G();
        int[] iArrG2 = pairB0.component2().G();
        int[] iArrF1 = f1(iArrK2, iArrG);
        int i13 = f131090i;
        int[] iArrV1 = V0(iArrG2, iFloor * i13);
        if (k(iArrV1, iArrF1) >= 0) {
            iArrW0 = w0(iArrV1, iArrF1);
        } else {
            iArrG = w0(iArrG, E());
            iArrW0 = w0(K0(iArrV1, a10), iArrF1);
        }
        int[] iArrX0 = X0(f1(iArrG, X0(iArrW0, i11 * i13)), i11 * i13);
        int[] iArrK0 = K0(V0(iArrG, iFloor * i13), iArrX0);
        int[] iArrW1 = w0(V0(iArrW0, iFloor * i13), f1(a10, iArrX0));
        if (k(iArrW1, a10) >= 0) {
            iArrK0 = K0(iArrK0, E());
            iArrW1 = w0(iArrW1, a10);
            if (k(iArrW1, a10) >= 0) {
                iArrK0 = K0(iArrK0, E());
                iArrW1 = w0(iArrW1, a10);
            }
        }
        return new Pair<>(v1.d(iArrK0), v1.d(iArrW1));
    }

    @NotNull
    public final Pair<v1, v1> c(@NotNull int[] operand) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        int[] iArrD1 = d1(operand);
        return new Pair<>(v1.d(iArrD1), v1.d(w0(operand, f1(iArrD1, iArrD1))));
    }

    @NotNull
    public final int[] c0(@NotNull int[] remainderNormalized, int i10) {
        Intrinsics.checkNotNullParameter(remainderNormalized, "remainderNormalized");
        return X0(remainderNormalized, i10);
    }

    @NotNull
    public final Pair<v1, v1> d(@NotNull int[] unnormalizedDividend, @NotNull int[] unnormalizedDivisor) {
        Intrinsics.checkNotNullParameter(unnormalizedDividend, "unnormalizedDividend");
        Intrinsics.checkNotNullParameter(unnormalizedDivisor, "unnormalizedDivisor");
        if (k(unnormalizedDivisor, unnormalizedDividend) > 0) {
            return new Pair<>(v1.d(Z()), v1.d(unnormalizedDividend));
        }
        if (v1.v(unnormalizedDivisor) == 1 && v1.v(unnormalizedDividend) == 1) {
            return new Pair<>(v1.d(S0(new int[]{Integer.divideUnsigned(v1.t(unnormalizedDividend, 0), v1.t(unnormalizedDivisor, 0))})), v1.d(S0(new int[]{Integer.remainderUnsigned(v1.t(unnormalizedDividend, 0), v1.t(unnormalizedDivisor, 0))})));
        }
        if (N(unnormalizedDividend) - N(unnormalizedDivisor) == 0) {
            return new Pair<>(v1.d(new int[]{1}), v1.d(w0(unnormalizedDividend, unnormalizedDivisor)));
        }
        n1<v1, v1, Integer> n1VarC0 = C0(unnormalizedDividend, unnormalizedDivisor);
        int[] iArrG = n1VarC0.a().G();
        int[] iArrG2 = n1VarC0.b().G();
        int iIntValue = n1VarC0.c().intValue();
        int iV = v1.v(iArrG);
        int iV2 = v1.v(iArrG2);
        int i10 = iV - iV2;
        int[] iArrI = v1.i(i10);
        int[] iArrV0 = V0(iArrG2, a() * i10);
        if (k(iArrG, iArrV0) >= 0) {
            iArrI = v1.i(i10 + 1);
            v1.D(iArrI, i10, 1);
            iArrG = w0(iArrG, iArrV0);
        }
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            int i12 = iV2 + i11;
            long jDivideUnsigned = i12 < v1.v(iArrG) ? Long.divideUnsigned(y1.n(y1.n(y1.n(((long) v1.t(iArrG, i12)) & k0.f265952a) << a()) + y1.n(((long) v1.t(iArrG, i12 - 1)) & k0.f265952a)), y1.n(((long) v1.t(iArrG2, iV2 - 1)) & k0.f265952a)) : i12 == v1.v(iArrG) ? y1.n(((long) Integer.divideUnsigned(v1.t(iArrG, i12 - 1), v1.t(iArrG2, iV2 - 1))) & k0.f265952a) : 0L;
            int i13 = f131088g;
            v1.D(iArrI, i11, Long.compareUnsigned(jDivideUnsigned, y1.n(y1.n(k0.f265952a & ((long) i13)) - 1)) < 0 ? u1.n((int) jDivideUnsigned) : u1.n(i13 - 1));
            int[] iArrV1 = V0(g1(iArrG2, v1.t(iArrI, i11)), a() * i11);
            while (k(iArrV1, iArrG) > 0) {
                v1.D(iArrI, i11, u1.n(v1.t(iArrI, i11) - 1));
                iArrV1 = V0(g1(iArrG2, v1.t(iArrI, i11)), a() * i11);
            }
            iArrG = w0(iArrG, iArrV1);
        }
        while (k(iArrG, iArrG2) >= 0) {
            iArrI = L0(iArrI, 1);
            iArrG = w0(iArrG, iArrG2);
        }
        return new Pair<>(v1.d(S0(iArrI)), v1.d(c0(iArrG, iIntValue)));
    }

    @NotNull
    public final C1439a d0(@NotNull C1439a c1439a, @NotNull C1439a other) {
        Intrinsics.checkNotNullParameter(c1439a, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Z0(c1439a, other);
    }

    @NotNull
    public final int[] d1(@NotNull int[] operand) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        int[] iArr = operand;
        while (true) {
            int[] iArrX0 = X0(K0(iArr, e(operand, iArr).getFirst().G()), 1);
            if (k(iArrX0, iArr) >= 0) {
                return iArr;
            }
            iArr = iArrX0;
        }
    }

    @NotNull
    public final Pair<v1, v1> e(@NotNull int[] unnormalizedDividend, @NotNull int[] unnormalizedDivisor) {
        Intrinsics.checkNotNullParameter(unnormalizedDividend, "unnormalizedDividend");
        Intrinsics.checkNotNullParameter(unnormalizedDivisor, "unnormalizedDivisor");
        n1<v1, v1, Integer> n1VarC0 = C0(unnormalizedDividend, unnormalizedDivisor);
        int[] iArrG = n1VarC0.a().G();
        int[] iArrG2 = n1VarC0.b().G();
        int iIntValue = n1VarC0.c().intValue();
        int iV = v1.v(iArrG) - v1.v(iArrG2);
        int[] iArrV0 = V0(iArrG2, f131090i * iV);
        int i10 = iV + 1;
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = 0;
        }
        int[] iArrK = v1.k(iArr);
        if (k(iArrG, iArrV0) > 0) {
            v1.D(iArrK, iV, 1);
            iArrG = w0(iArrG, iArrV0);
        }
        Z();
        Z();
        Z();
        for (int i12 = iV - 1; -1 < i12; i12--) {
            v1.D(iArrK, i12, u1.n((int) m.v(Long.divideUnsigned(h1(v1.k(ArraysKt.copyOfRange(iArrG, v1.v(iArrG2) - 1, v1.v(iArrG2) + 1))), y1.n(((long) v1.t(iArrG2, v1.v(iArrG2) - 1)) & k0.f265952a)), f131084c)));
            int i13 = f131090i;
            int[] iArrV1 = V0(iArrG2, i12 * i13);
            int[] iArrV2 = V0(g1(iArrG2, v1.t(iArrK, i12)), i13 * i12);
            if (k(iArrV2, iArrG) > 0) {
                int[] iArrW0 = w0(iArrV2, iArrG);
                while (k(iArrW0, iArrV2) > 0) {
                    v1.D(iArrK, i12, u1.n(v1.t(iArrK, i12) - 1));
                    iArrW0 = w0(iArrW0, iArrV1);
                }
                iArrG = V0(w0(iArrG, g1(iArrG2, v1.t(iArrK, i12))), f131090i * i12);
            } else {
                iArrG = w0(iArrG, iArrV2);
            }
        }
        return new Pair<>(v1.d(S0(iArrK)), v1.d(c0(iArrG, iIntValue)));
    }

    @NotNull
    public final int[] e0(@NotNull int[] div, @NotNull int[] other) {
        Intrinsics.checkNotNullParameter(div, "$this$div");
        Intrinsics.checkNotNullParameter(other, "other");
        return C(div, other).getFirst().G();
    }

    @NotNull
    public final C1439a e1(@NotNull C1439a c1439a, @NotNull C1439a other) {
        Intrinsics.checkNotNullParameter(c1439a, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return a1(c1439a, other);
    }

    @NotNull
    public final int[] f0(@NotNull int[] div, int i10) {
        Intrinsics.checkNotNullParameter(div, "$this$div");
        return C(div, new int[]{i10}).getFirst().G();
    }

    @NotNull
    public final int[] f1(@NotNull int[] times, @NotNull int[] other) {
        Intrinsics.checkNotNullParameter(times, "$this$times");
        Intrinsics.checkNotNullParameter(other, "other");
        return Q(times, other);
    }

    @Override // com.ionspin.kotlin.bignum.integer.b
    @NotNull
    public Pair<v1, l> g(@NotNull byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        throw new kotlin.l0("An operation is not implemented: not implemented yet");
    }

    @NotNull
    public final Pair<v1, v1> g0(@NotNull int[] divrem, @NotNull int[] other) {
        Intrinsics.checkNotNullParameter(divrem, "$this$divrem");
        Intrinsics.checkNotNullParameter(other, "other");
        return C(divrem, other);
    }

    @NotNull
    public final int[] g1(@NotNull int[] times, int i10) {
        Intrinsics.checkNotNullParameter(times, "$this$times");
        return y0(times, i10);
    }

    public final int h(int i10) {
        return a() - x(i10);
    }

    public final long h1(@NotNull int[] operand) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        if (v1.v(operand) > 2) {
            throw new ArithmeticException("Exact conversion not possible, operand size " + v1.v(operand));
        }
        long jN = 0;
        for (int iV = v1.v(operand) - 1; -1 < iV; iV--) {
            jN = y1.n(jN + y1.n(y1.n(((long) v1.t(operand, iV)) & k0.f265952a) << (f131090i * iV)));
        }
        return jN;
    }

    @NotNull
    public final String i1(@NotNull int[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return CollectionsKt.joinToString$default(v1.d(array), ", ", "uintArrayOf(", ")", 0, null, c.f131102a, 24, null);
    }

    public final int j(@NotNull int[] compareTo, int i10) {
        Intrinsics.checkNotNullParameter(compareTo, "$this$compareTo");
        return B(compareTo, new int[]{i10});
    }

    @NotNull
    public final int[] j1(@NotNull int[] firstUnchecked, @NotNull int[] secondUnchecked) {
        List listD;
        List listD2;
        Intrinsics.checkNotNullParameter(firstUnchecked, "firstUnchecked");
        Intrinsics.checkNotNullParameter(secondUnchecked, "secondUnchecked");
        if (v1.v(firstUnchecked) % 3 != 0) {
            v1 v1VarD = v1.d(firstUnchecked);
            int iV = (((v1.v(firstUnchecked) + 2) / 3) * 3) - v1.v(firstUnchecked);
            int[] iArr = new int[iV];
            for (int i10 = 0; i10 < iV; i10++) {
                iArr[i10] = 0;
            }
            listD = CollectionsKt.plus((Collection) v1VarD, (Iterable) v1.d(v1.k(iArr)));
        } else {
            listD = v1.d(firstUnchecked);
        }
        int[] uIntArray = UCollectionsKt.toUIntArray(listD);
        if (v1.v(secondUnchecked) % 3 != 0) {
            v1 v1VarD2 = v1.d(secondUnchecked);
            int iV2 = (((v1.v(secondUnchecked) + 2) / 3) * 3) - v1.v(secondUnchecked);
            int[] iArr2 = new int[iV2];
            for (int i11 = 0; i11 < iV2; i11++) {
                iArr2[i11] = 0;
            }
            listD2 = CollectionsKt.plus((Collection) v1VarD2, (Iterable) v1.d(v1.k(iArr2)));
        } else {
            listD2 = v1.d(secondUnchecked);
        }
        int[] uIntArray2 = UCollectionsKt.toUIntArray(listD2);
        int iV3 = v1.v(uIntArray);
        int iV4 = v1.v(uIntArray2);
        Pair pair = iV3 > iV4 ? new Pair(v1.d(uIntArray), v1.d(m0(uIntArray2, iV3 - iV4, 0))) : iV3 < iV4 ? new Pair(v1.d(m0(uIntArray, iV4 - iV3, 0)), v1.d(uIntArray2)) : new Pair(v1.d(uIntArray), v1.d(uIntArray2));
        int[] iArrG = ((v1) pair.component1()).G();
        int[] iArrG2 = ((v1) pair.component2()).G();
        int iMax = (Math.max(v1.v(uIntArray), v1.v(uIntArray2)) + 2) / 3;
        boolean z10 = true;
        DefaultConstructorMarker defaultConstructorMarker = null;
        C1439a c1439a = new C1439a(UCollectionsKt.toUIntArray(UArraysKt.m1503slicetAntMlw(iArrG, r.W1(0, iMax))), z10, defaultConstructorMarker);
        int i12 = iMax * 2;
        C1439a c1439a2 = new C1439a(UCollectionsKt.toUIntArray(UArraysKt.m1503slicetAntMlw(iArrG, r.W1(iMax, i12))), z10, defaultConstructorMarker);
        int i13 = iMax * 3;
        C1439a c1439a3 = new C1439a(UCollectionsKt.toUIntArray(UArraysKt.m1503slicetAntMlw(iArrG, r.W1(i12, i13))), z10, defaultConstructorMarker);
        C1439a c1439a4 = new C1439a(UCollectionsKt.toUIntArray(UArraysKt.m1503slicetAntMlw(iArrG2, r.W1(0, iMax))), z10, defaultConstructorMarker);
        C1439a c1439a5 = new C1439a(UCollectionsKt.toUIntArray(UArraysKt.m1503slicetAntMlw(iArrG2, r.W1(iMax, i12))), z10, defaultConstructorMarker);
        C1439a c1439a6 = new C1439a(UCollectionsKt.toUIntArray(UArraysKt.m1503slicetAntMlw(iArrG2, r.W1(i12, i13))), z10, defaultConstructorMarker);
        C1439a c1439aJ0 = J0(c1439a, c1439a3);
        C1439a c1439aJ1 = J0(c1439aJ0, c1439a2);
        C1439a c1439aV0 = v0(c1439aJ0, c1439a2);
        C1439a c1439aJ2 = J0(c1439aV0, c1439a3);
        C1439a c1439a7 = f131097p;
        C1439a c1439aV1 = v0(e1(c1439aJ2, c1439a7), c1439a);
        C1439a c1439aJ3 = J0(c1439a4, c1439a6);
        C1439a c1439aJ4 = J0(c1439aJ3, c1439a5);
        C1439a c1439aV2 = v0(c1439aJ3, c1439a5);
        C1439a c1439aV3 = v0(e1(J0(c1439aV2, c1439a6), c1439a7), c1439a4);
        C1439a c1439aE1 = e1(c1439a, c1439a4);
        C1439a c1439aE2 = e1(c1439aJ1, c1439aJ4);
        C1439a c1439aE3 = e1(c1439aV0, c1439aV2);
        C1439a c1439aE4 = e1(c1439aV1, c1439aV3);
        C1439a c1439aE5 = e1(c1439a3, c1439a6);
        C1439a c1439aD0 = d0(v0(c1439aE4, c1439aE2), new C1439a(new int[]{3}, z10, defaultConstructorMarker));
        C1439a c1439aW0 = W0(v0(c1439aE2, c1439aE3), 1);
        C1439a c1439aV4 = v0(c1439aE3, c1439aE1);
        C1439a c1439aJ5 = J0(W0(v0(c1439aV4, c1439aD0), 1), e1(c1439a7, c1439aE5));
        C1439a c1439aV5 = v0(J0(c1439aV4, c1439aW0), c1439aE5);
        C1439a c1439aV6 = v0(c1439aW0, c1439aJ5);
        int i14 = iMax * f131090i;
        return J0(J0(J0(J0(c1439aE1, U0(c1439aV6, i14)), U0(c1439aV5, i14 * 2)), U0(c1439aJ5, i14 * 3)), U0(c1439aE5, i14 * 4)).f();
    }

    public final int k(@NotNull int[] compareTo, @NotNull int[] other) {
        Intrinsics.checkNotNullParameter(compareTo, "$this$compareTo");
        Intrinsics.checkNotNullParameter(other, "other");
        return B(compareTo, other);
    }

    public final int k1(int i10) {
        return D0(i10);
    }

    @Override // com.ionspin.kotlin.bignum.integer.b
    @NotNull
    public Pair<v1, l> l(@NotNull byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        throw new kotlin.l0("An operation is not implemented: not implemented yet");
    }

    @Override // com.ionspin.kotlin.bignum.integer.b
    @NotNull
    public int[] m(byte b10) {
        return new int[]{u1.n(Math.abs((int) b10))};
    }

    @NotNull
    public final int[] m0(@NotNull int[] original, int i10, int i11) {
        Intrinsics.checkNotNullParameter(original, "original");
        int iV = v1.v(original) + i10;
        int[] iArr = new int[iV];
        int i12 = 0;
        while (i12 < iV) {
            iArr[i12] = i12 < v1.v(original) ? v1.t(original, i12) : i11;
            i12++;
        }
        return v1.k(iArr);
    }

    @Override // com.ionspin.kotlin.bignum.integer.b
    @NotNull
    public q1[] n(@NotNull int[] operand, @NotNull f endianness) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(operand, "operand");
        Intrinsics.checkNotNullParameter(endianness, "endianness");
        int i10 = b.f131101b[endianness.ordinal()];
        if (i10 == 1) {
            List<u1> list = UArraysKt.m1440reversedajY9A(operand);
            arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                int iZ0 = ((u1) it.next()).z0();
                int iX = i11 == v1.v(operand) - 1 ? f131082a.x(iZ0) / 8 : 0;
                i11++;
                CollectionsKt.addAll(arrayList, CollectionsKt.drop(CollectionsKt.listOf((Object[]) new q1[]{q1.c(q1.n((byte) u1.n(u1.n(iZ0 >>> 24) & 255))), q1.c(q1.n((byte) u1.n(u1.n(iZ0 >>> 16) & 255))), q1.c(q1.n((byte) u1.n(u1.n(iZ0 >>> 8) & 255))), q1.c(q1.n((byte) u1.n(iZ0 & 255)))}), iX));
            }
        } else {
            if (i10 != 2) {
                throw new kotlin.k0();
            }
            List<u1> list2 = UArraysKt.m1440reversedajY9A(operand);
            arrayList = new ArrayList();
            Iterator<T> it2 = list2.iterator();
            int i12 = 0;
            while (it2.hasNext()) {
                int iZ1 = ((u1) it2.next()).z0();
                int iX2 = i12 == v1.v(operand) - 1 ? f131082a.x(iZ1) / 8 : 0;
                i12++;
                CollectionsKt.addAll(arrayList, CollectionsKt.dropLast(CollectionsKt.listOf((Object[]) new q1[]{q1.c(q1.n((byte) u1.n(iZ1 & 255))), q1.c(q1.n((byte) u1.n(u1.n(iZ1 >>> 8) & 255))), q1.c(q1.n((byte) u1.n(u1.n(iZ1 >>> 16) & 255))), q1.c(q1.n((byte) u1.n(u1.n(iZ1 >>> 24) & 255)))}), iX2));
            }
        }
        return j0((q1[]) arrayList.toArray(new q1[0]));
    }

    public final int n0() {
        return f131088g;
    }

    @Override // com.ionspin.kotlin.bignum.integer.b
    @NotNull
    public String o(@NotNull int[] operand, int i10) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        int[] iArrCopyOf = Arrays.copyOf(operand, operand.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        int[] iArrK = v1.k(iArrCopyOf);
        int[] iArr = {u1.n(i10)};
        StringBuilder sb2 = new StringBuilder();
        while (!v1.s(iArrK, Z())) {
            Pair<v1, v1> pairG0 = g0(iArrK, iArr);
            if (v1.B(pairG0.getSecond().G())) {
                sb2.append(0);
            } else {
                sb2.append(d0.c(v1.t(pairG0.getSecond().G(), 0), i10));
            }
            iArrK = pairG0.getFirst().G();
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return StringsKt.z8(string).toString();
    }

    public final long o0() {
        return f131084c;
    }

    @Override // com.ionspin.kotlin.bignum.integer.b
    @NotNull
    public int[] p() {
        return f131083b;
    }

    public final int p0() {
        return f131085d;
    }

    @Override // com.ionspin.kotlin.bignum.integer.b
    @NotNull
    public int[] q(@NotNull int[] operand, int i10) {
        int iN;
        Intrinsics.checkNotNullParameter(operand, "operand");
        if (v1.B(operand) || i10 == 0) {
            return operand;
        }
        int iV = v1.v(operand);
        int iX = x(v1.t(operand, v1.v(operand) - 1));
        int iA = i10 / a();
        int iA2 = i10 % a();
        int i11 = iA2 > iX ? iA + 1 : iA;
        if (iA2 == 0) {
            int iV2 = v1.v(operand) + i11;
            int[] iArr = new int[iV2];
            int i12 = 0;
            while (i12 < iV2) {
                iArr[i12] = (i12 < 0 || i12 >= iA) ? v1.t(operand, i12 - iA) : 0;
                i12++;
            }
            return v1.k(iArr);
        }
        int iV3 = v1.v(operand) + i11;
        int[] iArr2 = new int[iV3];
        for (int i13 = 0; i13 < iV3; i13++) {
            if (i13 >= 0 && i13 < iA) {
                iN = 0;
            } else if (i13 == iA) {
                iN = u1.n(v1.t(operand, i13 - iA) << iA2);
            } else {
                int i14 = iA + 1;
                if (i13 < iV + iA && i14 <= i13) {
                    int i15 = i13 - iA;
                    iN = u1.n(u1.n(v1.t(operand, i15 - 1) >>> (f131082a.a() - iA2)) | u1.n(v1.t(operand, i15) << iA2));
                } else {
                    if (i13 != (iV + i11) - 1) {
                        throw new RuntimeException("Invalid case " + i13);
                    }
                    iN = u1.n(v1.t(operand, i13 - i11) >>> (f131082a.a() - iA2));
                }
            }
            iArr2[i13] = iN;
        }
        return v1.k(iArr2);
    }

    public final long q0() {
        return f131087f;
    }

    @Override // com.ionspin.kotlin.bignum.integer.b
    @NotNull
    public int[] r(@NotNull int[] operand, @NotNull int[] mask) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        Intrinsics.checkNotNullParameter(mask, "mask");
        int iV = v1.v(operand);
        int[] iArr = new int[iV];
        int i10 = 0;
        while (i10 < iV) {
            iArr[i10] = i10 < v1.v(mask) ? u1.n(v1.t(operand, i10) & v1.t(mask, i10)) : 0;
            i10++;
        }
        return S0(v1.k(iArr));
    }

    public final long r0() {
        return f131086e;
    }

    @Override // com.ionspin.kotlin.bignum.integer.b
    @NotNull
    public byte[] s(@NotNull int[] operand) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        throw new kotlin.l0("An operation is not implemented: not implemented yet");
    }

    @NotNull
    public final C1439a s0() {
        return f131097p;
    }

    @Override // com.ionspin.kotlin.bignum.integer.b
    public boolean t(@NotNull int[] operand, long j10) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        long j11 = 63;
        long j12 = j10 / j11;
        if (j12 <= g3.f12256c) {
            return j12 < ((long) v1.v(operand)) && u1.n(v1.t(operand, (int) j12) & u1.n(1 << ((int) (j10 % j11)))) == 1;
        }
        throw new RuntimeException("Invalid bit index, too large, cannot access word (Word position > Int.MAX_VALUE");
    }

    public final int t0() {
        return f131090i;
    }

    @Override // com.ionspin.kotlin.bignum.integer.b
    @NotNull
    public int[] u(short s10) {
        return new int[]{u1.n(Math.abs((int) s10))};
    }

    @NotNull
    public final int[] u0(@NotNull int[] firstUnsigned, @NotNull int[] secondUnsigned) {
        Intrinsics.checkNotNullParameter(firstUnsigned, "firstUnsigned");
        Intrinsics.checkNotNullParameter(secondUnsigned, "secondUnsigned");
        boolean z10 = true;
        DefaultConstructorMarker defaultConstructorMarker = null;
        C1439a c1439a = new C1439a(firstUnsigned, z10, defaultConstructorMarker);
        C1439a c1439a2 = new C1439a(secondUnsigned, z10, defaultConstructorMarker);
        int iMax = (Math.max(v1.v(c1439a.f()), v1.v(c1439a2.f())) + 1) / 2;
        int[] iArrE = E();
        int i10 = f131090i;
        int[] iArrO = O(V0(iArrE, iMax * i10), E());
        C1439a c1439aB = b(c1439a, iArrO);
        C1439a c1439aW0 = W0(c1439a, iMax * i10);
        C1439a c1439aB2 = b(c1439a2, iArrO);
        C1439a c1439aW1 = W0(c1439a2, iMax * i10);
        C1439a c1439aE1 = e1(c1439aW0, c1439aW1);
        C1439a c1439aE2 = e1(c1439aB, c1439aB2);
        return J0(J0(U0(c1439aE1, i10 * 2 * iMax), U0(v0(v0(e1(J0(c1439aW0, c1439aB), J0(c1439aW1, c1439aB2)), c1439aE1), c1439aE2), i10 * iMax)), c1439aE2).f();
    }

    @Override // com.ionspin.kotlin.bignum.integer.b
    @NotNull
    public int[] v(@NotNull int[] base, long j10) {
        Intrinsics.checkNotNullParameter(base, "base");
        if (j10 == 0) {
            return E();
        }
        if (j10 == 1) {
            return base;
        }
        int[] iArrE = E();
        while (j10 > 1) {
            long j11 = 2;
            if (j10 % j11 == 0) {
                base = f1(base, base);
                j10 /= j11;
            } else {
                iArrE = f1(base, iArrE);
                base = f1(base, base);
                j10 = (j10 - 1) / j11;
            }
        }
        return f1(iArrE, base);
    }

    @NotNull
    public final C1439a v0(@NotNull C1439a c1439a, @NotNull C1439a other) {
        Intrinsics.checkNotNullParameter(c1439a, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return c1(c1439a, other);
    }

    @Override // com.ionspin.kotlin.bignum.integer.b
    @NotNull
    public int[] w(byte b10) {
        return new int[]{u1.n(b10 & 255)};
    }

    @NotNull
    public final int[] w0(@NotNull int[] minus, @NotNull int[] other) {
        Intrinsics.checkNotNullParameter(minus, "$this$minus");
        Intrinsics.checkNotNullParameter(other, "other");
        return O(minus, other);
    }

    @Override // com.ionspin.kotlin.bignum.integer.b
    public int x(int i10) {
        int iA = a();
        int iN = u1.n(i10 >>> 16);
        if (iN != 0) {
            iA -= 16;
            i10 = iN;
        }
        int iN2 = u1.n(i10 >>> 8);
        if (iN2 != 0) {
            iA -= 8;
            i10 = iN2;
        }
        int iN3 = u1.n(i10 >>> 4);
        if (iN3 != 0) {
            iA -= 4;
            i10 = iN3;
        }
        int iN4 = u1.n(i10 >>> 2);
        if (iN4 != 0) {
            iA -= 2;
            i10 = iN4;
        }
        return u1.n(i10 >>> 1) != 0 ? iA - 2 : iA - i10;
    }

    @NotNull
    public final int[] x0(@NotNull int[] minus, int i10) {
        Intrinsics.checkNotNullParameter(minus, "$this$minus");
        return O(minus, new int[]{i10});
    }

    @Override // com.ionspin.kotlin.bignum.integer.b
    @NotNull
    public int[] y(short s10) {
        return new int[]{u1.n(65535 & s10)};
    }

    @NotNull
    public final int[] y0(@NotNull int[] first, int i10) {
        Intrinsics.checkNotNullParameter(first, "first");
        int[] iArrI = v1.i(v1.v(first) + 1);
        int iV = v1.v(first);
        int i11 = 0;
        while (i11 < iV) {
            long jN = y1.n(y1.n(((long) v1.t(first, i11)) & k0.f265952a) * y1.n(((long) i10) & k0.f265952a));
            long jN2 = y1.n(((long) v1.t(iArrI, i11)) & k0.f265952a);
            long j10 = f131084c;
            long jN3 = y1.n(jN2 + y1.n(k0.f265952a & ((long) u1.n((int) y1.n(jN & j10)))));
            v1.D(iArrI, i11, u1.n((int) y1.n(jN3 & j10)));
            i11++;
            v1.D(iArrI, i11, u1.n(u1.n((int) y1.n(jN >>> a())) + u1.n((int) y1.n(jN3 >>> a()))));
        }
        return S0(iArrI);
    }

    @Override // com.ionspin.kotlin.bignum.integer.b
    @NotNull
    public int[] z(long j10) {
        return new int[]{u1.n((int) y1.n(y1.n(y1.n(j10) & (-4294967296L)) >>> 32)), u1.n((int) Math.abs(j10))};
    }

    @NotNull
    public final int[] z0(int i10, int i11) {
        int iN = u1.n(i10 * i11);
        return S0(new int[]{iN, u1.n(iN >>> a())});
    }
}
