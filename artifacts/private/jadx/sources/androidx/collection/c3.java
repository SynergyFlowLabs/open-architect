package androidx.collection;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1210:1\n231#1,3:1211\n200#1,7:1214\n211#1,3:1222\n214#1,9:1226\n234#1:1235\n231#1,3:1236\n200#1,7:1239\n211#1,3:1247\n214#1,9:1251\n234#1:1260\n231#1,3:1261\n200#1,7:1264\n211#1,3:1272\n214#1,9:1276\n234#1:1285\n200#1,7:1288\n211#1,3:1296\n214#1,9:1300\n231#1,3:1309\n200#1,7:1312\n211#1,3:1320\n214#1,9:1324\n234#1:1333\n231#1,3:1334\n200#1,7:1337\n211#1,3:1345\n214#1,9:1349\n234#1:1358\n231#1,3:1359\n200#1,7:1362\n211#1,3:1370\n214#1,9:1374\n234#1:1383\n390#1:1384\n391#1:1388\n393#1,2:1390\n395#1,3:1393\n398#1:1399\n399#1:1403\n400#1:1405\n401#1,4:1408\n407#1:1413\n408#1,8:1415\n231#1,3:1423\n200#1,7:1426\n211#1,3:1434\n214#1,9:1438\n234#1:1447\n231#1,3:1448\n200#1,7:1451\n211#1,3:1459\n214#1,9:1463\n234#1:1472\n231#1,3:1473\n200#1,7:1476\n211#1,3:1484\n214#1,9:1488\n234#1:1497\n1399#2:1221\n1270#2:1225\n1399#2:1246\n1270#2:1250\n1399#2:1271\n1270#2:1275\n1399#2:1286\n1270#2:1287\n1399#2:1295\n1270#2:1299\n1399#2:1319\n1270#2:1323\n1399#2:1344\n1270#2:1348\n1399#2:1369\n1270#2:1373\n1165#2,3:1385\n1179#2:1389\n1175#2:1392\n1372#2,3:1396\n1386#2,3:1400\n1312#2:1404\n1303#2:1406\n1297#2:1407\n1309#2:1412\n1393#2:1414\n1399#2:1433\n1270#2:1437\n1399#2:1458\n1270#2:1462\n1399#2:1483\n1270#2:1487\n1165#2,3:1498\n1179#2:1501\n1175#2:1502\n1372#2,3:1503\n1386#2,3:1506\n1312#2:1509\n1303#2:1510\n1297#2:1511\n1309#2:1512\n1393#2:1513\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet\n*L\n163#1:1211,3\n163#1:1214,7\n163#1:1222,3\n163#1:1226,9\n163#1:1235\n179#1:1236,3\n179#1:1239,7\n179#1:1247,3\n179#1:1251,9\n179#1:1260\n193#1:1261,3\n193#1:1264,7\n193#1:1272,3\n193#1:1276,9\n193#1:1285\n233#1:1288,7\n233#1:1296,3\n233#1:1300,9\n245#1:1309,3\n245#1:1312,7\n245#1:1320,3\n245#1:1324,9\n245#1:1333\n257#1:1334,3\n257#1:1337,7\n257#1:1345,3\n257#1:1349,9\n257#1:1358\n274#1:1359,3\n274#1:1362,7\n274#1:1370,3\n274#1:1374,9\n274#1:1383\n283#1:1384\n283#1:1388\n283#1:1390,2\n283#1:1393,3\n283#1:1399\n283#1:1403\n283#1:1405\n283#1:1408,4\n283#1:1413\n283#1:1415,8\n306#1:1423,3\n306#1:1426,7\n306#1:1434,3\n306#1:1438,9\n306#1:1447\n333#1:1448,3\n333#1:1451,7\n333#1:1459,3\n333#1:1463,9\n333#1:1472\n363#1:1473,3\n363#1:1476,7\n363#1:1484,3\n363#1:1488,9\n363#1:1497\n163#1:1221\n163#1:1225\n179#1:1246\n179#1:1250\n193#1:1271\n193#1:1275\n206#1:1286\n213#1:1287\n233#1:1295\n233#1:1299\n245#1:1319\n245#1:1323\n257#1:1344\n257#1:1348\n274#1:1369\n274#1:1373\n283#1:1385,3\n283#1:1389\n283#1:1392\n283#1:1396,3\n283#1:1400,3\n283#1:1404\n283#1:1406\n283#1:1407\n283#1:1412\n283#1:1414\n306#1:1433\n306#1:1437\n333#1:1458\n333#1:1462\n363#1:1483\n363#1:1487\n390#1:1498,3\n391#1:1501\n394#1:1502\n397#1:1503,3\n398#1:1506,3\n399#1:1509\n400#1:1510\n400#1:1511\n404#1:1512\n407#1:1513\n*E\n"})
public abstract class c3<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public long[] f12170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public Object[] f12171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    public int f12172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    public int f12173d;

    static final class a extends kotlin.jvm.internal.l0 implements Function1<E, CharSequence> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c3<E> f12174a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c3<E> c3Var) {
            super(1);
            this.f12174a = c3Var;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(E e10) {
            return e10 == this.f12174a ? "(this)" : String.valueOf(e10);
        }
    }

    public /* synthetic */ c3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String A(c3 c3Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function2 = function1;
        return c3Var.z(charSequence, charSequence2, charSequence3, i10, charSequence5, function2);
    }

    @kotlin.a1
    public static /* synthetic */ void o() {
    }

    @kotlin.a1
    public static /* synthetic */ void p() {
    }

    public final boolean B() {
        return this.f12173d == 0;
    }

    public final boolean a(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.f12171b;
        long[] jArr = this.f12170a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128 && !predicate.invoke(objArr[(i10 << 3) + i12]).booleanValue()) {
                        return false;
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
    }

    public final boolean b() {
        return this.f12173d != 0;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x005c A[LOOP:0: B:5:0x0012->B:18:0x005c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x005f A[SYNTHETIC] */
    public final boolean c(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.f12171b;
        long[] jArr = this.f12170a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128 && predicate.invoke(objArr[(i10 << 3) + i12]).booleanValue()) {
                            return true;
                        }
                        j10 >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 != length) {
                            i10++;
                        }
                    }
                } else if (i10 != length) {
                    i10++;
                }
            }
        }
        return false;
    }

    @NotNull
    public final Set<E> d() {
        return new e3(this);
    }

    public final boolean e(E e10) {
        int iNumberOfTrailingZeros;
        int iHashCode = (e10 != null ? e10.hashCode() : 0) * b3.f12150j;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f12172c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f12170a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * b3.f12151k) ^ j10;
            for (long j12 = (~j11) & (j11 - b3.f12151k) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (Intrinsics.areEqual(this.f12171b[iNumberOfTrailingZeros], e10)) {
                    break loop0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:0: B:14:0x0021->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c3)) {
            return false;
        }
        c3 c3Var = (c3) obj;
        if (c3Var.q() != q()) {
            return false;
        }
        Object[] objArr = this.f12171b;
        long[] jArr = this.f12170a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128 && !c3Var.e(objArr[(i10 << 3) + i12])) {
                            return false;
                        }
                        j10 >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 != length) {
                            i10++;
                        }
                    }
                } else if (i10 != length) {
                    i10++;
                }
            }
        }
        return true;
    }

    @androidx.annotation.g0(from = 0)
    public final int f() {
        return q();
    }

    @androidx.annotation.g0(from = 0)
    public final int g(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.f12171b;
        long[] jArr = this.f12170a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j10) < 128 && predicate.invoke(objArr[(i10 << 3) + i13]).booleanValue()) {
                        i11++;
                    }
                    j10 >>= 8;
                }
                if (i12 != 8) {
                    return i11;
                }
            }
            if (i10 == length) {
                return i11;
            }
            i10++;
        }
    }

    public final int h(E e10) {
        int i10 = 0;
        int iHashCode = (e10 != null ? e10.hashCode() : 0) * b3.f12150j;
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f12172c;
        int i14 = i11 >>> 7;
        while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f12170a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * b3.f12151k) ^ j10;
            for (long j12 = (~j11) & (j11 - b3.f12151k) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i13;
                if (Intrinsics.areEqual(this.f12171b[iNumberOfTrailingZeros], e10)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
    }

    public int hashCode() {
        int iHashCode = (this.f12172c * 31) + this.f12173d;
        Object[] objArr = this.f12171b;
        long[] jArr = this.f12170a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            Object obj = objArr[(i10 << 3) + i12];
                            if (!Intrinsics.areEqual(obj, this)) {
                                iHashCode += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        return iHashCode;
                    }
                }
                if (i10 != length) {
                    i10++;
                }
            }
        }
        return iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x004d A[LOOP:0: B:5:0x000e->B:18:0x004d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x0050 A[SYNTHETIC] */
    public final E i() {
        Object[] objArr = this.f12171b;
        long[] jArr = this.f12170a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            return (E) objArr[(i10 << 3) + i12];
                        }
                        j10 >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 != length) {
                            i10++;
                        }
                    }
                } else if (i10 != length) {
                    i10++;
                }
            }
        }
        t.f.g("The ScatterSet is empty");
        throw new kotlin.a0();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0062 A[LOOP:0: B:5:0x0015->B:18:0x0062, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v5, types: [E, java.lang.Object] */
    public final E j(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.f12171b;
        long[] jArr = this.f12170a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            ?? r10 = (Object) objArr[(i10 << 3) + i12];
                            if (predicate.invoke(r10).booleanValue()) {
                                return r10;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 != length) {
                            i10++;
                        }
                    }
                } else if (i10 != length) {
                    i10++;
                }
            }
        }
        t.f.g("Could not find a match");
        throw new kotlin.a0();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x005e A[LOOP:0: B:5:0x0014->B:19:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v5, types: [E, java.lang.Object] */
    @Nullable
    public final E k(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.f12171b;
        long[] jArr = this.f12170a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            ?? r10 = (Object) objArr[(i10 << 3) + i12];
                            if (predicate.invoke(r10).booleanValue()) {
                                return r10;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 != length) {
                            i10++;
                        }
                    }
                } else if (i10 != length) {
                    i10++;
                }
            }
        }
        return null;
    }

    public final void l(@NotNull Function1<? super E, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.f12171b;
        long[] jArr = this.f12170a;
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
                    if ((255 & j10) < 128) {
                        block.invoke(objArr[(i10 << 3) + i12]);
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

    @kotlin.a1
    public final void m(@NotNull Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long[] jArr = this.f12170a;
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
                    if ((255 & j10) < 128) {
                        block.invoke(Integer.valueOf((i10 << 3) + i12));
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

    @androidx.annotation.g0(from = 0)
    public final int n() {
        return this.f12172c;
    }

    @androidx.annotation.g0(from = 0)
    public final int q() {
        return this.f12173d;
    }

    public final boolean r() {
        return this.f12173d == 0;
    }

    public final boolean s() {
        return this.f12173d != 0;
    }

    @oj.j
    @NotNull
    public final String t() {
        return A(this, null, null, null, 0, null, null, 63, null);
    }

    @NotNull
    public String toString() {
        int i10 = 2 >> 0;
        return A(this, null, "[", "]", 0, null, new a(this), 25, null);
    }

    @oj.j
    @NotNull
    public final String u(@NotNull CharSequence separator) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        return A(this, separator, null, null, 0, null, null, 62, null);
    }

    @oj.j
    @NotNull
    public final String v(@NotNull CharSequence separator, @NotNull CharSequence prefix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return A(this, separator, prefix, null, 0, null, null, 60, null);
    }

    @oj.j
    @NotNull
    public final String w(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return A(this, separator, prefix, postfix, 0, null, null, 56, null);
    }

    @oj.j
    @NotNull
    public final String x(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return A(this, separator, prefix, postfix, i10, null, null, 48, null);
    }

    @oj.j
    @NotNull
    public final String y(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        return A(this, separator, prefix, postfix, i10, truncated, null, 32, null);
    }

    @oj.j
    @NotNull
    public final String z(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super E, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        Object[] objArr = this.f12171b;
        long[] jArr = this.f12170a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            long j10 = jArr[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8;
                int i14 = 8 - ((~(i11 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((j10 & 255) < 128) {
                        Object obj = objArr[(i11 << 3) + i15];
                        if (i12 == i10) {
                            sb2.append(truncated);
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append(separator);
                        }
                        if (function1 == null) {
                            sb2.append(obj);
                        } else {
                            sb2.append(function1.invoke(obj));
                        }
                        i12++;
                    }
                    j10 >>= i13;
                    i15++;
                    i13 = i13;
                }
                if (i14 == i13) {
                }
                sb2.append(postfix);
                break;
            }
            if (i11 == length) {
                sb2.append(postfix);
                break;
            }
            i11++;
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private c3() {
        this.f12170a = b3.f12145e;
        this.f12171b = t.a.f376160c;
    }
}
