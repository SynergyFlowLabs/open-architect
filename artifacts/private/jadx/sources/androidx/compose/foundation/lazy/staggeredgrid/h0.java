package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.n2;
import androidx.compose.ui.graphics.o1;
import androidx.compose.ui.layout.i2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 6 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext\n+ 7 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 8 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 9 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 10 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1474:1\n63#1,9:1476\n84#1,4:1491\n1142#1:1508\n1143#1,3:1513\n84#1,4:1516\n84#1,4:1520\n84#1,4:1524\n1142#1:1535\n1143#1,3:1540\n84#1,4:1551\n84#1,4:1555\n1142#1:1576\n1143#1,3:1581\n84#1,4:1586\n84#1,4:1592\n84#1,4:1596\n1142#1:1617\n1143#1,3:1622\n84#1,4:1625\n84#1,4:1629\n1200#1,4:1635\n84#1,4:1639\n84#1,4:1643\n84#1,4:1647\n1106#1,3:1651\n1124#1:1654\n1109#1:1658\n1110#1,9:1661\n1125#1:1676\n1120#1:1677\n84#1,4:1678\n1053#1,25:1682\n1078#1,4:1714\n1082#1:1725\n1079#1,9:1726\n1092#1,7:1736\n1106#1,3:1743\n1124#1:1746\n1109#1:1750\n1110#1,9:1760\n1125#1:1781\n1120#1:1782\n84#1,4:1783\n84#1,4:1787\n62#1:1806\n73#1:1807\n1173#1,11:1811\n1142#1:1822\n1143#1,3:1827\n1124#1:1844\n1125#1:1855\n1142#1:1880\n1143#1,3:1885\n26#2:1475\n26#2:1633\n26#2:1634\n54#3:1485\n59#3:1487\n54#3:1791\n59#3:1793\n85#4:1486\n90#4:1488\n80#4:1490\n90#4:1499\n85#4:1501\n90#4:1505\n85#4:1507\n85#4:1510\n90#4:1512\n90#4:1532\n85#4:1534\n85#4:1537\n90#4:1539\n85#4:1544\n90#4:1548\n85#4:1550\n90#4:1567\n85#4:1569\n90#4:1573\n85#4:1575\n85#4:1578\n90#4:1580\n85#4:1585\n90#4:1608\n85#4:1610\n90#4:1614\n85#4:1616\n85#4:1619\n90#4:1621\n85#4:1792\n90#4:1794\n80#4:1805\n85#4:1824\n90#4:1826\n85#4:1877\n90#4:1879\n85#4:1882\n90#4:1884\n30#5:1489\n30#5:1804\n267#6:1495\n264#6:1496\n264#6:1502\n267#6:1528\n264#6:1529\n264#6:1545\n267#6:1563\n264#6:1564\n264#6:1570\n267#6:1604\n264#6:1605\n264#6:1611\n1138#7:1497\n1135#7:1498\n1132#7:1500\n1138#7:1503\n1135#7:1504\n1132#7:1506\n1132#7:1509\n1135#7:1511\n1138#7:1530\n1135#7:1531\n1132#7:1533\n1132#7:1536\n1135#7:1538\n1132#7:1543\n1138#7:1546\n1135#7:1547\n1132#7:1549\n1138#7:1565\n1135#7:1566\n1132#7:1568\n1138#7:1571\n1135#7:1572\n1132#7:1574\n1132#7:1577\n1135#7:1579\n1132#7:1584\n1138#7:1606\n1135#7:1607\n1132#7:1609\n1138#7:1612\n1135#7:1613\n1132#7:1615\n1132#7:1618\n1135#7:1620\n1132#7:1823\n1135#7:1825\n1132#7:1876\n1135#7:1878\n1132#7:1881\n1135#7:1883\n12604#8,2:1559\n12371#8,2:1561\n12604#8,2:1590\n12413#8,2:1600\n12604#8,2:1602\n12371#8,2:1659\n12413#8,2:1758\n12604#8,2:1800\n12413#8,2:1802\n12574#8,2:1809\n53#9,3:1655\n57#9:1670\n35#9,5:1671\n103#9:1707\n35#9,5:1708\n104#9:1713\n118#9:1718\n35#9,5:1719\n119#9:1724\n53#9,3:1747\n103#9:1751\n35#9,5:1752\n104#9:1757\n57#9:1769\n35#9,3:1770\n103#9:1773\n35#9,5:1774\n104#9:1779\n39#9:1780\n35#9,5:1795\n103#9:1830\n35#9,5:1831\n104#9:1836\n118#9:1837\n35#9,5:1838\n119#9:1843\n53#9,5:1845\n35#9,5:1850\n53#9,5:1856\n35#9,5:1861\n53#9,5:1866\n35#9,5:1871\n35#9,5:1888\n1#10:1735\n1#10:1808\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt\n*L\n277#1:1476,9\n369#1:1491,4\n412#1:1508\n412#1:1513,3\n424#1:1516,4\n465#1:1520,4\n499#1:1524,4\n524#1:1535\n524#1:1540,3\n548#1:1551,4\n549#1:1555,4\n582#1:1576\n582#1:1581,3\n603#1:1586,4\n624#1:1592,4\n625#1:1596,4\n692#1:1617\n692#1:1622,3\n730#1:1625,4\n731#1:1629,4\n758#1:1635,4\n762#1:1639,4\n785#1:1643,4\n816#1:1647,4\n820#1:1651,3\n820#1:1654\n820#1:1658\n820#1:1661,9\n820#1:1676\n820#1:1677\n848#1:1678,4\n864#1:1682,25\n864#1:1714,4\n864#1:1725\n864#1:1726,9\n864#1:1736,7\n878#1:1743,3\n878#1:1746\n878#1:1750\n878#1:1760,9\n878#1:1781\n878#1:1782\n909#1:1783,4\n921#1:1787,4\n277#1:1806\n277#1:1807\n1013#1:1811,11\n1035#1:1822\n1035#1:1827,3\n1108#1:1844\n1108#1:1855\n1155#1:1880\n1155#1:1885,3\n188#1:1475\n742#1:1633\n743#1:1634\n303#1:1485\n304#1:1487\n945#1:1791\n947#1:1793\n303#1:1486\n304#1:1488\n317#1:1490\n406#1:1499\n406#1:1501\n411#1:1505\n411#1:1507\n412#1:1510\n412#1:1512\n522#1:1532\n522#1:1534\n524#1:1537\n524#1:1539\n532#1:1544\n541#1:1548\n541#1:1550\n572#1:1567\n572#1:1569\n577#1:1573\n577#1:1575\n582#1:1578\n582#1:1580\n594#1:1585\n686#1:1608\n686#1:1610\n691#1:1614\n691#1:1616\n692#1:1619\n692#1:1621\n945#1:1792\n947#1:1794\n989#1:1805\n1035#1:1824\n1035#1:1826\n1142#1:1877\n1142#1:1879\n1155#1:1882\n1155#1:1884\n317#1:1489\n989#1:1804\n406#1:1495\n406#1:1496\n411#1:1502\n522#1:1528\n522#1:1529\n541#1:1545\n572#1:1563\n572#1:1564\n577#1:1570\n686#1:1604\n686#1:1605\n691#1:1611\n406#1:1497\n406#1:1498\n406#1:1500\n411#1:1503\n411#1:1504\n411#1:1506\n412#1:1509\n412#1:1511\n522#1:1530\n522#1:1531\n522#1:1533\n524#1:1536\n524#1:1538\n532#1:1543\n541#1:1546\n541#1:1547\n541#1:1549\n572#1:1565\n572#1:1566\n572#1:1568\n577#1:1571\n577#1:1572\n577#1:1574\n582#1:1577\n582#1:1579\n594#1:1584\n686#1:1606\n686#1:1607\n686#1:1609\n691#1:1612\n691#1:1613\n691#1:1615\n692#1:1618\n692#1:1620\n1035#1:1823\n1035#1:1825\n1142#1:1876\n1142#1:1878\n1155#1:1881\n1155#1:1883\n558#1:1559,2\n560#1:1561,2\n620#1:1590,2\n633#1:1600,2\n640#1:1602,2\n834#1:1659,2\n899#1:1758,2\n959#1:1800,2\n960#1:1802,2\n1011#1:1809,2\n820#1:1655,3\n820#1:1670\n820#1:1671,5\n864#1:1707\n864#1:1708,5\n864#1:1713\n864#1:1718\n864#1:1719,5\n864#1:1724\n878#1:1747,3\n892#1:1751\n892#1:1752,5\n892#1:1757\n878#1:1769\n878#1:1770,3\n892#1:1773\n892#1:1774,5\n892#1:1779\n878#1:1780\n950#1:1795,5\n1077#1:1830\n1077#1:1831,5\n1077#1:1836\n1081#1:1837\n1081#1:1838,5\n1081#1:1843\n1108#1:1845,5\n1108#1:1850,5\n1124#1:1856,5\n1124#1:1861,5\n1124#1:1866,5\n1124#1:1871,5\n974#1:1888,5\n864#1:1735\n*E\n"})
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f17847a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f17848b = Integer.MIN_VALUE;

    @NotNull
    public static final k0 A(@NotNull androidx.compose.foundation.lazy.layout.w0 w0Var, @NotNull a1 a1Var, @NotNull List<Integer> list, @NotNull r rVar, @NotNull v0 v0Var, long j10, boolean z10, boolean z11, long j11, int i10, int i11, int i12, int i13, @NotNull kotlinx.coroutines.s0 s0Var, boolean z12, boolean z13, @Nullable c0 c0Var, @NotNull o1 o1Var) {
        int i14;
        int iR;
        d0 d0Var = new d0(a1Var, list, rVar, v0Var, j10, z10, w0Var, i10, j11, i12, i13, z11, i11, s0Var, z12, z13, c0Var, o1Var, null);
        int[] iArrN0 = a1Var.n0(rVar, a1Var.Y().d());
        int[] iArrG = a1Var.Y().g();
        if (iArrN0.length != d0Var.i()) {
            d0Var.j().j();
            int i15 = d0Var.i();
            int[] iArr = new int[i15];
            int i16 = 0;
            while (i16 < i15) {
                if (i16 >= iArrN0.length || (iR = iArrN0[i16]) == -1) {
                    iR = i16 == 0 ? 0 : r(iArr, d1.b(0, i16)) + 1;
                }
                iArr[i16] = iR;
                d0Var.j().l(iArr[i16], i16);
                i16++;
            }
            iArrN0 = iArr;
        }
        if (iArrG.length != d0Var.i()) {
            int i17 = d0Var.i();
            int[] iArr2 = new int[i17];
            int i18 = 0;
            while (i18 < i17) {
                if (i18 < iArrG.length) {
                    i14 = iArrG[i18];
                } else {
                    i14 = i18 == 0 ? 0 : iArr2[i18 - 1];
                }
                iArr2[i18] = i14;
                i18++;
            }
            iArrG = iArr2;
        }
        return s(d0Var, Math.round(a1Var.e0(z13)), iArrN0, iArrG, true);
    }

    private static final void B(int[] iArr, int i10) {
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = iArr[i11] + i10;
        }
    }

    private static final int[] C(int[] iArr, Function1<? super Integer, Integer> function1) {
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = function1.invoke(Integer.valueOf(iArr[i10])).intValue();
        }
        return iArr;
    }

    private static final <T> T D(androidx.compose.foundation.lazy.layout.w0 w0Var, Function1<? super androidx.compose.foundation.lazy.layout.w0, ? extends T> function1) {
        return function1.invoke(w0Var);
    }

    private static final List<n0> d(d0 d0Var, Function1<? super n0, Unit> function1, Function1<? super Integer, Boolean> function2, boolean z10) {
        List<Integer> listP = d0Var.p();
        ArrayList arrayList = null;
        if (z10) {
            int size = listP.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i10 = size - 1;
                    int iIntValue = listP.get(size).intValue();
                    if (function2.invoke(Integer.valueOf(iIntValue)).booleanValue()) {
                        long jS = d0Var.s(d0Var.h(), iIntValue, 0);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        n0 n0VarF = d0Var.o().f(iIntValue, jS);
                        function1.invoke(n0VarF);
                        arrayList.add(n0VarF);
                    }
                    if (i10 < 0) {
                        break;
                    }
                    size = i10;
                }
            }
        } else {
            int size2 = listP.size();
            for (int i11 = 0; i11 < size2; i11++) {
                int iIntValue2 = listP.get(i11).intValue();
                if (function2.invoke(Integer.valueOf(iIntValue2)).booleanValue()) {
                    long jS2 = d0Var.s(d0Var.h(), iIntValue2, 0);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    n0 n0VarF2 = d0Var.o().f(iIntValue2, jS2);
                    function1.invoke(n0VarF2);
                    arrayList.add(n0VarF2);
                }
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    private static final List<n0> e(d0 d0Var, ArrayDeque<n0>[] arrayDequeArr, int[] iArr, int i10, int i11, int i12) {
        int size = 0;
        for (ArrayDeque<n0> arrayDeque : arrayDequeArr) {
            size += arrayDeque.size();
        }
        ArrayList arrayList = new ArrayList(size);
        while (true) {
            for (ArrayDeque<n0> arrayDeque2 : arrayDequeArr) {
                if (!arrayDeque2.isEmpty()) {
                    int length = arrayDequeArr.length;
                    int i13 = -1;
                    int i14 = Integer.MAX_VALUE;
                    for (int i15 = 0; i15 < length; i15++) {
                        n0 n0VarFirstOrNull = arrayDequeArr[i15].firstOrNull();
                        int index = n0VarFirstOrNull != null ? n0VarFirstOrNull.getIndex() : Integer.MAX_VALUE;
                        if (i14 > index) {
                            i13 = i15;
                            i14 = index;
                        }
                    }
                    n0 n0VarRemoveFirst = arrayDequeArr[i13].removeFirst();
                    if (n0VarRemoveFirst.c() == i13) {
                        long jB = d1.b(n0VarRemoveFirst.c(), n0VarRemoveFirst.e());
                        int iR = r(iArr, jB);
                        int i16 = d0Var.q().a()[i13];
                        if (n0VarRemoveFirst.s() + iR >= i11 && iR <= i12) {
                            n0VarRemoveFirst.w(iR, i16, i10);
                            arrayList.add(n0VarRemoveFirst);
                        }
                        int i17 = (int) (jB & com.rabbitmq.client.k0.f265952a);
                        for (int i18 = (int) (jB >> 32); i18 < i17; i18++) {
                            iArr[i18] = n0VarRemoveFirst.m() + iR;
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    private static final void f(Function0<String> function0) {
    }

    private static final String g(ArrayDeque<n0>[] arrayDequeArr) {
        return "";
    }

    private static final void h(d0 d0Var, int[] iArr, int i10) {
        int length = iArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i11 = length - 1;
            while (true) {
                if (iArr[length] < i10 && d0Var.j().a(iArr[length], length)) {
                    break;
                } else {
                    iArr[length] = k(d0Var, iArr[length], length);
                }
            }
            if (iArr[length] >= 0 && !d0Var.u(d0Var.h(), iArr[length])) {
                d0Var.j().l(iArr[length], length);
            }
            if (i11 < 0) {
                return;
            } else {
                length = i11;
            }
        }
    }

    private static final <T> void i(List<? extends T> list, boolean z10, Function1<? super T, Unit> function1) {
        if (!z10) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                function1.invoke(list.get(i10));
            }
            return;
        }
        int size2 = list.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i11 = size2 - 1;
            function1.invoke(list.get(size2));
            if (i11 < 0) {
                return;
            } else {
                size2 = i11;
            }
        }
    }

    static /* synthetic */ void j(List list, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if (!z10) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                function1.invoke(list.get(i11));
            }
            return;
        }
        int size2 = list.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i12 = size2 - 1;
            function1.invoke(list.get(size2));
            if (i12 < 0) {
                return;
            } else {
                size2 = i12;
            }
        }
    }

    private static final int k(d0 d0Var, int i10, int i11) {
        return d0Var.j().f(i10, i11);
    }

    private static final void l(long j10, Function1<? super Integer, Unit> function1) {
        int i10 = (int) (j10 & com.rabbitmq.client.k0.f265952a);
        for (int i11 = (int) (j10 >> 32); i11 < i10; i11++) {
            function1.invoke(Integer.valueOf(i11));
        }
    }

    private static final int m(int[] iArr) {
        int length = iArr.length;
        int i10 = -1;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = iArr[i12];
            if (i11 < i13) {
                i10 = i12;
                i11 = i13;
            }
        }
        return i10;
    }

    private static final <T> int n(T[] tArr, Function1<? super T, Integer> function1) {
        int length = tArr.length;
        int i10 = -1;
        int i11 = Integer.MAX_VALUE;
        for (int i12 = 0; i12 < length; i12++) {
            int iIntValue = function1.invoke(tArr[i12]).intValue();
            if (i11 > iIntValue) {
                i10 = i12;
                i11 = iIntValue;
            }
        }
        return i10;
    }

    public static final int o(@NotNull int[] iArr, int i10) {
        int length = iArr.length;
        int i11 = -1;
        int i12 = Integer.MAX_VALUE;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = i10 + 1;
            int i15 = iArr[i13];
            if (i14 <= i15 && i15 < i12) {
                i11 = i13;
                i12 = i15;
            }
        }
        return i11;
    }

    public static /* synthetic */ int p(int[] iArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = Integer.MIN_VALUE;
        }
        return o(iArr, i10);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d3 A[LOOP:3: B:36:0x00bf->B:40:0x00d3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x00db  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:48:0x0102  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00d7 A[EDGE_INSN: B:63:0x00d7->B:42:0x00d7 BREAK  A[LOOP:3: B:36:0x00bf->B:40:0x00d3], SYNTHETIC] */
    private static final List<n0> q(d0 d0Var, int i10, int i11, boolean z10, Function2<? super n0, ? super Integer, Unit> function2) {
        q qVar;
        int index;
        int iMin;
        List<q> listH;
        int size;
        int i12;
        q qVar2;
        q qVar3;
        int iC;
        if (z10 && d0Var.b() != null && !d0Var.b().h().isEmpty()) {
            List<q> listH2 = d0Var.b().h();
            int size2 = listH2.size() - 1;
            while (true) {
                if (-1 >= size2) {
                    qVar = null;
                    break;
                }
                if (listH2.get(size2).getIndex() > i10 && (size2 == 0 || listH2.get(size2 - 1).getIndex() <= i10)) {
                    qVar = listH2.get(size2);
                    break;
                }
                size2--;
            }
            q qVar4 = (q) CollectionsKt.last((List) d0Var.b().h());
            if (qVar != null && (index = qVar.getIndex()) <= (iMin = Math.min(qVar4.getIndex(), i11 - 1))) {
                ArrayList arrayList = null;
                while (true) {
                    if (arrayList != null) {
                        int size3 = arrayList.size();
                        int i13 = 0;
                        while (true) {
                            if (i13 >= size3) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                listH = d0Var.b().h();
                                size = listH.size();
                                i12 = 0;
                                while (true) {
                                    if (i12 < size) {
                                        qVar2 = null;
                                        break;
                                    }
                                    qVar2 = listH.get(i12);
                                    if (qVar2.getIndex() == index) {
                                        break;
                                    }
                                    i12++;
                                }
                                qVar3 = qVar2;
                                if (qVar3 != null) {
                                    iC = qVar3.c();
                                } else {
                                    iC = 0;
                                }
                                n0 n0VarF = d0Var.o().f(index, d0Var.s(d0Var.h(), index, iC));
                                arrayList.add(n0VarF);
                                int[] iArrA = d0Var.q().a();
                                function2.invoke(n0VarF, Integer.valueOf(iArrA.length > iC ? iArrA[iC] : 0));
                            } else if (arrayList.get(i13).getIndex() != index) {
                                i13++;
                            }
                        }
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        listH = d0Var.b().h();
                        size = listH.size();
                        i12 = 0;
                        while (true) {
                            if (i12 < size) {
                                qVar2 = null;
                                break;
                            }
                            qVar2 = listH.get(i12);
                            if (qVar2.getIndex() == index) {
                                break;
                                break;
                            }
                            i12++;
                        }
                        qVar3 = qVar2;
                        if (qVar3 != null) {
                            iC = qVar3.c();
                        } else {
                            iC = 0;
                        }
                        n0 n0VarF2 = d0Var.o().f(index, d0Var.s(d0Var.h(), index, iC));
                        arrayList.add(n0VarF2);
                        int[] iArrA2 = d0Var.q().a();
                        function2.invoke(n0VarF2, Integer.valueOf(iArrA2.length > iC ? iArrA2[iC] : 0));
                    }
                    if (index == iMin) {
                        return arrayList;
                    }
                    index++;
                }
            }
        }
        return null;
    }

    private static final int r(int[] iArr, long j10) {
        int i10 = (int) (j10 & com.rabbitmq.client.k0.f265952a);
        int iMax = Integer.MIN_VALUE;
        for (int i11 = (int) (j10 >> 32); i11 < i10; i11++) {
            iMax = Math.max(iMax, iArr[i11]);
        }
        return iMax;
    }

    /* JADX WARN: Code duplicated, block: B:329:0x06eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:330:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:331:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:334:0x070a  */
    /* JADX WARN: Code duplicated, block: B:336:0x071c  */
    /* JADX WARN: Code duplicated, block: B:337:0x071e  */
    /* JADX WARN: Code duplicated, block: B:340:0x0722 A[LOOP:23: B:333:0x0708->B:340:0x0722, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:344:0x072d  */
    /* JADX WARN: Code duplicated, block: B:345:0x0732  */
    /* JADX WARN: Code duplicated, block: B:348:0x0755  */
    /* JADX WARN: Code duplicated, block: B:349:0x0758  */
    /* JADX WARN: Code duplicated, block: B:351:0x0762  */
    /* JADX WARN: Code duplicated, block: B:353:0x076c A[LOOP:21: B:312:0x06ac->B:353:0x076c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:354:0x0776  */
    /* JADX WARN: Code duplicated, block: B:379:0x07d7  */
    /* JADX WARN: Code duplicated, block: B:389:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:391:0x07f4  */
    /* JADX WARN: Code duplicated, block: B:392:0x07f6  */
    /* JADX WARN: Code duplicated, block: B:395:0x07fa A[LOOP:26: B:388:0x07ee->B:395:0x07fa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:397:0x07ff  */
    /* JADX WARN: Code duplicated, block: B:399:0x080c  */
    /* JADX WARN: Code duplicated, block: B:401:0x082b  */
    /* JADX WARN: Code duplicated, block: B:449:0x0944  */
    /* JADX WARN: Code duplicated, block: B:540:0x0781 A[EDGE_INSN: B:540:0x0781->B:355:0x0781 BREAK  A[LOOP:21: B:312:0x06ac->B:353:0x076c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:0x0729 A[EDGE_INSN: B:543:0x0729->B:342:0x0729 BREAK  A[LOOP:23: B:333:0x0708->B:340:0x0722], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:544:0x0727 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:550:0x07e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:551:0x07a0 A[SYNTHETIC] */
    private static final k0 s(d0 d0Var, int i10, int[] iArr, int[] iArr2, boolean z10) {
        int i11;
        int iIndexOf;
        int i12;
        int i13;
        int[] iArr3;
        int[] iArr4;
        int i14;
        int i15;
        int i16;
        int[] iArr5;
        float f10;
        List listEmptyList;
        List list;
        int iM;
        ArrayList arrayList;
        boolean z11;
        boolean z12;
        boolean z13;
        List<Integer> list2;
        boolean z14;
        int iH;
        int length;
        int i17;
        boolean z15;
        boolean z16;
        boolean z17;
        q qVar;
        int index;
        int iMin;
        ArrayList arrayList2;
        boolean z18;
        List<q> listH;
        int size;
        int i18;
        q qVar2;
        q qVar3;
        int iC;
        int[] iArrA;
        int i19;
        List<q> list3;
        boolean z19;
        boolean z20;
        boolean z21;
        int i20;
        int i21;
        int[] iArrG;
        final d0 d0Var2 = d0Var;
        androidx.compose.foundation.lazy.layout.w0 w0VarN = d0Var2.n();
        int iA = d0Var2.h().a();
        if (iA <= 0 || d0Var2.i() == 0) {
            int iR = androidx.compose.ui.unit.b.r(d0Var.d());
            int iQ = androidx.compose.ui.unit.b.q(d0Var.d());
            d0Var.t().I().m(0, iR, iQ, new ArrayList(), d0Var.o().g(), d0Var.o(), d0Var.y(), w0VarN.P5(), d0Var.i(), d0Var.w(), 0, 0, d0Var.f(), d0Var.g());
            if (!w0VarN.P5()) {
                long jI = d0Var.t().I().i();
                if (!androidx.compose.ui.unit.u.h(jI, androidx.compose.ui.unit.u.f42720b.a())) {
                    iR = androidx.compose.ui.unit.c.i(d0Var.d(), (int) (jI >> 32));
                    iQ = androidx.compose.ui.unit.c.h(d0Var.d(), (int) (jI & com.rabbitmq.client.k0.f265952a));
                }
            }
            return new k0(iArr, iArr2, 0.0f, androidx.compose.ui.layout.c1.h6(w0VarN, iR, iQ, null, new Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.f0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return h0.v((i2.a) obj);
                }
            }, 4, null), 0.0f, false, d0Var.y(), false, d0Var.q(), d0Var.h().g(), w0VarN, iA, CollectionsKt.emptyList(), androidx.compose.ui.unit.u.e((((long) androidx.compose.ui.unit.b.r(d0Var.d())) << 32) | (((long) androidx.compose.ui.unit.b.q(d0Var.d())) & com.rabbitmq.client.k0.f265952a)), -d0Var.c(), d0Var.l() + d0Var.a(), d0Var.c(), d0Var.a(), d0Var.m(), d0Var.f(), null);
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        String str = "copyOf(...)";
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        int[] iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf2, "copyOf(...)");
        h(d0Var2, iArrCopyOf, iA);
        B(iArrCopyOf2, -i10);
        int i22 = d0Var2.i();
        ArrayDeque[] arrayDequeArr = new ArrayDeque[i22];
        for (int i23 = 0; i23 < i22; i23++) {
            arrayDequeArr[i23] = new ArrayDeque(16);
        }
        B(iArrCopyOf2, -d0Var2.c());
        boolean z22 = false;
        while (true) {
            if (!t(iArrCopyOf, iArrCopyOf2, d0Var2)) {
                i11 = 0;
                iIndexOf = -1;
                break;
            }
            iIndexOf = m(iArrCopyOf);
            int i24 = iArrCopyOf[iIndexOf];
            int length2 = iArrCopyOf2.length;
            for (int i25 = 0; i25 < length2; i25++) {
                if (iArrCopyOf[i25] != iArrCopyOf[iIndexOf]) {
                    int i26 = iArrCopyOf2[i25];
                    int i27 = iArrCopyOf2[iIndexOf];
                    if (i26 < i27) {
                        iArrCopyOf2[i25] = i27;
                    }
                }
            }
            i11 = 0;
            int iK = k(d0Var2, i24, iIndexOf);
            if (iK < 0) {
                break;
            }
            long jS = d0Var2.s(d0Var2.h(), iK, iIndexOf);
            b0 b0VarJ = d0Var2.j();
            int i28 = (int) (jS & com.rabbitmq.client.k0.f265952a);
            int i29 = (int) (jS >> 32);
            int i30 = i28 - i29;
            ArrayDeque[] arrayDequeArr2 = arrayDequeArr;
            b0VarJ.l(iK, i30 != 1 ? -2 : i29);
            n0 n0VarF = d0Var2.o().f(iK, jS);
            int iR2 = r(iArrCopyOf2, jS);
            int[] iArrG2 = i30 != 1 ? d0Var2.j().g(iK) : null;
            while (i29 < i28) {
                iArrCopyOf[i29] = iK;
                int iM2 = iR2 + n0VarF.m() + (iArrG2 == null ? 0 : iArrG2[i29]);
                iArrCopyOf2[i29] = iM2;
                if (d0Var2.l() + iM2 <= 0) {
                    z22 = true;
                }
                i29++;
            }
            arrayDequeArr = arrayDequeArr2;
        }
        ArrayDeque[] arrayDequeArr3 = arrayDequeArr;
        int i31 = -d0Var2.c();
        int i32 = iArrCopyOf2[i11];
        if (i32 < i31) {
            B(iArrCopyOf2, i31 - i32);
            i12 = i10 - (i31 - i32);
        } else {
            i12 = i10;
        }
        B(iArrCopyOf2, d0Var2.c());
        int i33 = -1;
        if (iIndexOf == -1) {
            iIndexOf = ArraysKt.indexOf(iArrCopyOf, i11);
        }
        if (iIndexOf != -1 && z(iArrCopyOf, d0Var2, iArrCopyOf2, iIndexOf) && z10) {
            d0Var2.j().j();
            int length3 = iArrCopyOf.length;
            int[] iArr6 = new int[length3];
            int i34 = 0;
            while (i34 < length3) {
                iArr6[i34] = i33;
                i34++;
                i33 = -1;
            }
            int length4 = iArrCopyOf2.length;
            int[] iArr7 = new int[length4];
            for (int i35 = 0; i35 < length4; i35++) {
                iArr7[i35] = iArrCopyOf2[iIndexOf];
            }
            return s(d0Var2, i12, iArr6, iArr7, false);
        }
        int[] iArrCopyOf3 = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf3, "copyOf(...)");
        int length5 = iArrCopyOf2.length;
        int[] iArr8 = new int[length5];
        for (int i36 = 0; i36 < length5; i36++) {
            iArr8[i36] = -iArrCopyOf2[i36];
        }
        int iM3 = i31 + d0Var2.m();
        int iU = kotlin.ranges.r.u(d0Var2.l() + d0Var2.a(), 0);
        boolean z23 = z22;
        int iP = p(iArrCopyOf3, 0, 1, null);
        int i37 = 0;
        boolean z24 = z23;
        for (int i38 = -1; iP != i38 && i37 < d0Var2.i(); i38 = -1) {
            int i39 = iArrCopyOf3[iP];
            iP = o(iArrCopyOf3, i39);
            i37++;
            if (i39 >= 0) {
                long jS2 = d0Var2.s(d0Var2.h(), i39, iP);
                androidx.compose.foundation.lazy.layout.w0 w0Var = w0VarN;
                n0 n0VarF2 = d0Var2.o().f(i39, jS2);
                b0 b0VarJ2 = d0Var2.j();
                int i40 = i12;
                int[] iArr9 = iArrCopyOf;
                int i41 = (int) (jS2 & com.rabbitmq.client.k0.f265952a);
                int[] iArr10 = iArrCopyOf2;
                int i42 = (int) (jS2 >> 32);
                int i43 = i41 - i42;
                b0VarJ2.l(i39, i43 != 1 ? -2 : i42);
                int iR3 = r(iArr8, jS2);
                for (int i44 = i42; i44 < i41; i44++) {
                    iArr8[i44] = n0VarF2.m() + iR3;
                    iArrCopyOf3[i44] = i39;
                    arrayDequeArr3[i44].addLast(n0VarF2);
                }
                if (iR3 < iM3 && iArr8[i42] <= iM3) {
                    n0VarF2.x(false);
                    z24 = true;
                }
                i37 = i43 != 1 ? d0Var2.i() : i37;
                w0VarN = w0Var;
                iArrCopyOf = iArr9;
                i12 = i40;
                iArrCopyOf2 = iArr10;
                str = str;
            }
        }
        String str2 = str;
        int i45 = i12;
        int[] iArr11 = iArrCopyOf;
        int[] iArr12 = iArrCopyOf2;
        final androidx.compose.foundation.lazy.layout.w0 w0Var2 = w0VarN;
        loop9: while (true) {
            int i46 = 0;
            while (true) {
                if (i46 >= length5) {
                    for (int i47 = 0; i47 < i22; i47++) {
                        if (!arrayDequeArr3[i47].isEmpty()) {
                            i13 = 1;
                            break loop9;
                        }
                    }
                    break;
                }
                int i48 = iArr8[i46];
                if (i48 < iU || i48 <= 0) {
                    break;
                }
                i46++;
            }
            i13 = 1;
            int iP2 = p(iArr8, 0, 1, null);
            int iMaxOrThrow = ArraysKt.maxOrThrow(iArrCopyOf3) + 1;
            if (iMaxOrThrow >= iA) {
                break;
            }
            int i49 = iU;
            int[] iArr13 = iArr8;
            boolean z25 = z24;
            int i50 = i45;
            int[] iArr14 = iArr12;
            int i51 = i22;
            d0 d0Var3 = d0Var2;
            ArrayDeque[] arrayDequeArr4 = arrayDequeArr3;
            long jS3 = d0Var3.s(d0Var3.h(), iMaxOrThrow, iP2);
            b0 b0VarJ3 = d0Var3.j();
            int i52 = (int) (jS3 & com.rabbitmq.client.k0.f265952a);
            int i53 = (int) (jS3 >> 32);
            int i54 = i52 - i53;
            b0VarJ3.l(iMaxOrThrow, i54 != 1 ? -2 : i53);
            n0 n0VarF3 = d0Var.o().f(iMaxOrThrow, jS3);
            int iR4 = r(iArr13, jS3);
            if (i54 != 1) {
                iArrG = d0Var.j().g(iMaxOrThrow);
                if (iArrG == null) {
                    iArrG = new int[d0Var.i()];
                }
            } else {
                iArrG = null;
            }
            for (int i55 = i53; i55 < i52; i55++) {
                if (iArrG != null) {
                    iArrG[i55] = iR4 - iArr13[i55];
                }
                iArrCopyOf3[i55] = iMaxOrThrow;
                iArr13[i55] = iR4 + n0VarF3.m();
                arrayDequeArr4[i55].addLast(n0VarF3);
            }
            d0Var.j().k(iMaxOrThrow, iArrG);
            if (iR4 < iM3 && iArr13[i53] <= iM3) {
                n0VarF3.x(false);
            }
            arrayDequeArr3 = arrayDequeArr4;
            iArr8 = iArr13;
            z24 = z25;
            iU = i49;
            i22 = i51;
            iArr12 = iArr14;
            d0Var2 = d0Var;
            i45 = i50;
        }
        int i56 = 0;
        while (i56 < i22) {
            ArrayDeque arrayDeque = arrayDequeArr3[i56];
            while (arrayDeque.size() > i13 && !((n0) arrayDeque.first()).u()) {
                n0 n0Var = (n0) arrayDeque.removeFirst();
                int[] iArrG3 = n0Var.e() != i13 ? d0Var2.j().g(n0Var.getIndex()) : null;
                iArr12[i56] = iArr12[i56] - (n0Var.m() + (iArrG3 == null ? 0 : iArrG3[i56]));
                i13 = 1;
            }
            n0 n0Var2 = (n0) arrayDeque.firstOrNull();
            iArr11[i56] = n0Var2 != null ? n0Var2.getIndex() : -1;
            i56++;
            i13 = 1;
        }
        for (int i57 : iArrCopyOf3) {
            if (i57 == iA - 1) {
                B(iArr8, -d0Var2.m());
                break;
            }
        }
        int i58 = 0;
        while (true) {
            if (i58 >= length5) {
                int iL = d0Var2.l() - iArr8[m(iArr8)];
                iArr3 = iArr12;
                B(iArr3, -iL);
                B(iArr8, iL);
                boolean z26 = false;
                loop31: while (true) {
                    int length6 = iArr3.length;
                    int i59 = 0;
                    while (true) {
                        if (i59 >= length6) {
                            iArr4 = iArr11;
                            break loop31;
                        }
                        if (iArr3[i59] < d0Var2.c()) {
                            break;
                        }
                        i59++;
                    }
                    int iP3 = p(iArr3, 0, 1, null);
                    int iM4 = m(iArr11);
                    if (iP3 != iM4) {
                        if (iArr3[iP3] == iArr3[iM4]) {
                            iP3 = iM4;
                        } else {
                            z26 = true;
                        }
                    }
                    int i60 = iArr11[iP3];
                    if (i60 == -1) {
                        i60 = iA;
                    }
                    int iK2 = k(d0Var2, i60, iP3);
                    if (iK2 < 0) {
                        iArr4 = iArr11;
                        if ((!z26 && !z(iArr4, d0Var2, iArr3, iP3)) || !z10) {
                            break;
                            break;
                        }
                        d0Var2.j().j();
                        int length7 = iArr4.length;
                        int[] iArr15 = new int[length7];
                        for (int i61 = 0; i61 < length7; i61++) {
                            iArr15[i61] = -1;
                        }
                        int length8 = iArr3.length;
                        int[] iArr16 = new int[length8];
                        for (int i62 = 0; i62 < length8; i62++) {
                            iArr16[i62] = iArr3[iP3];
                        }
                        return s(d0Var2, i45, iArr15, iArr16, false);
                    }
                    int[] iArr17 = iArr11;
                    int i63 = i45;
                    int[] iArr18 = iArr8;
                    long jS4 = d0Var2.s(d0Var2.h(), iK2, iP3);
                    b0 b0VarJ4 = d0Var2.j();
                    boolean z27 = z26;
                    int i64 = iL;
                    int i65 = (int) (jS4 & com.rabbitmq.client.k0.f265952a);
                    int i66 = iU;
                    int i67 = (int) (jS4 >> 32);
                    int i68 = i65 - i67;
                    b0VarJ4.l(iK2, i68 != 1 ? -2 : i67);
                    n0 n0VarF4 = d0Var2.o().f(iK2, jS4);
                    int iR5 = r(iArr3, jS4);
                    int[] iArrG4 = i68 != 1 ? d0Var2.j().g(iK2) : null;
                    for (int i69 = i67; i69 < i65; i69++) {
                        if (iArr3[i69] != iR5) {
                            z27 = true;
                        }
                        arrayDequeArr3[i69].addFirst(n0VarF4);
                        iArr17[i69] = iK2;
                        iArr3[i69] = iR5 + n0VarF4.m() + (iArrG4 == null ? 0 : iArrG4[i69]);
                    }
                    iL = i64;
                    iArr11 = iArr17;
                    i45 = i63;
                    z26 = z27;
                    iArr8 = iArr18;
                    iU = i66;
                }
                i14 = i45;
                int i70 = iL;
                i15 = iU;
                int[] iArr19 = iArr8;
                if (!z26 || !z10) {
                    i16 = i14 + i70;
                    int i71 = iArr3[p(iArr3, 0, 1, null)];
                    if (i71 >= 0) {
                        iArr5 = iArr19;
                        break;
                    }
                    i16 += i71;
                    iArr5 = iArr19;
                    B(iArr5, i71);
                    B(iArr3, -i71);
                    break;
                }
                d0Var2.j().j();
                return s(d0Var2, i14, iArr4, iArr3, false);
            }
            if (iArr8[i58] >= d0Var2.l()) {
                i15 = iU;
                iArr5 = iArr8;
                iArr4 = iArr11;
                i16 = i45;
                i14 = i16;
                iArr3 = iArr12;
                break;
            }
            i58++;
        }
        float fE0 = d0Var2.t().e0(w0Var2.P5());
        float f11 = (kotlin.math.b.U(Math.round(fE0)) != kotlin.math.b.U(i16) || Math.abs(Math.round(fE0)) < Math.abs(i16)) ? fE0 : i16;
        float f12 = fE0 - f11;
        float f13 = 0.0f;
        if (w0Var2.P5() && i16 > i14 && f12 <= 0.0f) {
            f13 = (i16 - i14) + f12;
        }
        float f14 = f13;
        int[] iArrCopyOf4 = Arrays.copyOf(iArr3, iArr3.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf4, str2);
        int length9 = iArrCopyOf4.length;
        for (int i72 = 0; i72 < length9; i72++) {
            iArrCopyOf4[i72] = -iArrCopyOf4[i72];
        }
        if (d0Var2.c() > d0Var2.m()) {
            int i73 = 0;
            while (i73 < i22) {
                ArrayDeque arrayDeque2 = arrayDequeArr3[i73];
                int size2 = arrayDeque2.size();
                int i74 = 0;
                while (true) {
                    if (i74 >= size2) {
                        i20 = i73;
                        break;
                    }
                    n0 n0Var3 = (n0) arrayDeque2.get(i74);
                    i20 = i73;
                    int[] iArrG5 = d0Var2.j().g(n0Var3.getIndex());
                    int iM5 = n0Var3.m() + (iArrG5 == null ? 0 : iArrG5[i20]);
                    if (i74 == CollectionsKt.getLastIndex(arrayDeque2) || (i21 = iArr3[i20]) == 0 || i21 < iM5) {
                        break;
                    }
                    iArr3[i20] = i21 - iM5;
                    i74++;
                    iArr4[i20] = ((n0) arrayDeque2.get(i74)).getIndex();
                    i73 = i20;
                }
                i73 = i20 + 1;
            }
        }
        int iC2 = d0Var2.c() + d0Var2.a();
        int iP4 = d0Var2.y() ? androidx.compose.ui.unit.b.p(d0Var2.d()) : androidx.compose.ui.unit.c.i(d0Var2.d(), ArraysKt.maxOrThrow(iArr5) + iC2);
        int iH2 = d0Var2.y() ? androidx.compose.ui.unit.c.h(d0Var2.d(), ArraysKt.maxOrThrow(iArr5) + iC2) : androidx.compose.ui.unit.b.o(d0Var2.d());
        int iMin2 = (Math.min(d0Var2.y() ? iH2 : iP4, d0Var2.l()) - d0Var2.c()) + d0Var2.a();
        int i75 = iArrCopyOf4[0];
        List<Integer> listP = d0Var2.p();
        int size3 = listP.size() - 1;
        if (size3 >= 0) {
            int i76 = size3;
            int iM6 = i75;
            listEmptyList = null;
            while (true) {
                int i77 = i76 - 1;
                int iIntValue = listP.get(i76).intValue();
                f10 = f11;
                int iH3 = d0Var2.j().h(iIntValue);
                List list4 = listEmptyList;
                if (iH3 == -2 || iH3 == -1) {
                    int i78 = 0;
                    while (true) {
                        if (i78 < i22) {
                            n0 n0Var4 = (n0) arrayDequeArr3[i78].firstOrNull();
                            if ((n0Var4 != null ? n0Var4.getIndex() : -1) > iIntValue) {
                                i78++;
                            }
                        }
                    }
                } else {
                    n0 n0Var5 = (n0) arrayDequeArr3[iH3].firstOrNull();
                    z21 = (n0Var5 != null ? n0Var5.getIndex() : -1) > iIntValue;
                }
                if (z21) {
                    long jS5 = d0Var2.s(d0Var2.h(), iIntValue, 0);
                    List arrayList3 = list4 == null ? new ArrayList() : list4;
                    n0 n0VarF5 = d0Var2.o().f(iIntValue, jS5);
                    iM6 -= n0VarF5.m();
                    n0VarF5.w(iM6, 0, iMin2);
                    arrayList3.add(n0VarF5);
                    listEmptyList = arrayList3;
                } else {
                    listEmptyList = list4;
                }
                if (i77 < 0) {
                    break;
                }
                f11 = f10;
                i76 = i77;
                i22 = i22;
                iC2 = iC2;
            }
        } else {
            f10 = f11;
            iC2 = iC2;
            listEmptyList = null;
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        float f15 = f10;
        List list5 = listEmptyList;
        int i79 = i15;
        List<n0> listE = e(d0Var2, arrayDequeArr3, iArrCopyOf4, iMin2, i31, i79);
        int i80 = iArrCopyOf4[0];
        n0 n0Var6 = (n0) CollectionsKt.lastOrNull((List) listE);
        int index2 = n0Var6 != null ? n0Var6.getIndex() : -1;
        if (!w0Var2.P5() || d0Var2.b() == null || d0Var2.b().h().isEmpty()) {
            list = list5;
            iArr3 = iArr3;
            iArr4 = iArr4;
            iM = i80;
            arrayList = null;
        } else {
            List<q> listH2 = d0Var2.b().h();
            int size4 = listH2.size() - 1;
            while (true) {
                if (-1 >= size4) {
                    qVar = null;
                    break;
                }
                if (listH2.get(size4).getIndex() > index2 && (size4 == 0 || listH2.get(size4 - 1).getIndex() <= index2)) {
                    qVar = listH2.get(size4);
                    break;
                }
                size4--;
            }
            q qVar4 = (q) CollectionsKt.last((List) d0Var2.b().h());
            if (qVar != null && (index = qVar.getIndex()) <= (iMin = Math.min(qVar4.getIndex(), iA - 1))) {
                int i81 = index;
                iM = i80;
                arrayList = null;
                while (true) {
                    if (arrayList != null) {
                        int size5 = arrayList.size();
                        list = list5;
                        int i82 = 0;
                        while (true) {
                            if (i82 >= size5) {
                                arrayList2 = arrayList;
                                z20 = false;
                                break;
                            }
                            arrayList2 = arrayList;
                            if (((n0) arrayList.get(i82)).getIndex() == i81) {
                                z20 = true;
                                break;
                            }
                            i82++;
                            arrayList = arrayList2;
                        }
                        z18 = z20;
                        if (z18) {
                            arrayList = arrayList2;
                        } else {
                            if (arrayList2 == null) {
                                arrayList = new ArrayList();
                            } else {
                                arrayList = arrayList2;
                            }
                            listH = d0Var2.b().h();
                            size = listH.size();
                            i18 = 0;
                            while (true) {
                                if (i18 < size) {
                                    qVar2 = null;
                                    break;
                                }
                                qVar2 = listH.get(i18);
                                list3 = listH;
                                if (qVar2.getIndex() == i81) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                if (z19) {
                                    break;
                                }
                                i18++;
                                listH = list3;
                            }
                            qVar3 = qVar2;
                            if (qVar3 != null) {
                                iC = qVar3.c();
                            } else {
                                iC = 0;
                            }
                            n0 n0VarF6 = d0Var2.o().f(i81, d0Var2.s(d0Var2.h(), i81, iC));
                            arrayList.add(n0VarF6);
                            iArrA = d0Var2.q().a();
                            if (iArrA.length > iC) {
                                i19 = iArrA[iC];
                            } else {
                                i19 = 0;
                            }
                            n0VarF6.w(iM, i19, iMin2);
                            iM += n0VarF6.m();
                        }
                        if (i81 != iMin) {
                            break;
                        }
                        i81++;
                        list5 = list;
                        iArr3 = iArr3;
                        iArr4 = iArr4;
                    } else {
                        arrayList2 = arrayList;
                        list = list5;
                    }
                    if (z18) {
                        if (arrayList2 == null) {
                            arrayList = new ArrayList();
                        } else {
                            arrayList = arrayList2;
                        }
                        listH = d0Var2.b().h();
                        size = listH.size();
                        i18 = 0;
                        while (true) {
                            if (i18 < size) {
                                qVar2 = null;
                                break;
                            }
                            qVar2 = listH.get(i18);
                            list3 = listH;
                            if (qVar2.getIndex() == i81) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            if (z19) {
                                break;
                                break;
                            }
                            i18++;
                            listH = list3;
                        }
                        qVar3 = qVar2;
                        if (qVar3 != null) {
                            iC = qVar3.c();
                        } else {
                            iC = 0;
                        }
                        n0 n0VarF7 = d0Var2.o().f(i81, d0Var2.s(d0Var2.h(), i81, iC));
                        arrayList.add(n0VarF7);
                        iArrA = d0Var2.q().a();
                        if (iArrA.length > iC) {
                            i19 = iArrA[iC];
                        } else {
                            i19 = 0;
                        }
                        n0VarF7.w(iM, i19, iMin2);
                        iM += n0VarF7.m();
                    } else {
                        arrayList = arrayList2;
                    }
                    if (i81 != iMin) {
                        break;
                        break;
                    }
                    i81++;
                    list5 = list;
                    iArr3 = iArr3;
                    iArr4 = iArr4;
                }
            } else {
                list = list5;
                iArr3 = iArr3;
                iArr4 = iArr4;
                iM = i80;
                arrayList = null;
            }
        }
        List<Integer> listP2 = d0Var2.p();
        int i83 = 0;
        List listEmptyList2 = null;
        for (int size6 = listP2.size(); i83 < size6; size6 = size6) {
            int iIntValue2 = listP2.get(i83).intValue();
            if (iIntValue2 >= iA) {
                list2 = listP2;
            } else {
                if (arrayList != null) {
                    int size7 = arrayList.size();
                    int i84 = 0;
                    while (true) {
                        if (i84 >= size7) {
                            list2 = listP2;
                            z16 = false;
                            break;
                        }
                        list2 = listP2;
                        if (((n0) arrayList.get(i84)).getIndex() == iIntValue2) {
                            z16 = true;
                            break;
                        }
                        i84++;
                        listP2 = list2;
                    }
                    z14 = z16;
                    if (!z14) {
                        iH = d0Var2.j().h(iIntValue2);
                        if (iH != -2 || iH == -1) {
                            length = iArrCopyOf3.length;
                            i17 = 0;
                            while (true) {
                                if (i17 < length) {
                                    if (iArrCopyOf3[i17] < iIntValue2) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    if (!z15) {
                                        i17++;
                                    }
                                }
                            }
                        } else {
                            z17 = iArrCopyOf3[iH] < iIntValue2;
                        }
                    }
                    if (z17) {
                        long jS6 = d0Var2.s(d0Var2.h(), iIntValue2, 0);
                        if (listEmptyList2 == null) {
                            listEmptyList2 = new ArrayList();
                        }
                        List list6 = listEmptyList2;
                        n0 n0VarF8 = d0Var2.o().f(iIntValue2, jS6);
                        n0VarF8.w(iM, 0, iMin2);
                        iM += n0VarF8.m();
                        list6.add(n0VarF8);
                        listEmptyList2 = list6;
                    }
                    i83++;
                    listP2 = list2;
                } else {
                    list2 = listP2;
                }
                if (!z14) {
                    iH = d0Var2.j().h(iIntValue2);
                    if (iH != -2) {
                    }
                    length = iArrCopyOf3.length;
                    i17 = 0;
                    while (true) {
                        if (i17 < length) {
                            if (iArrCopyOf3[i17] < iIntValue2) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (!z15) {
                                i17++;
                            }
                        }
                    }
                }
                if (z17) {
                    long jS7 = d0Var2.s(d0Var2.h(), iIntValue2, 0);
                    if (listEmptyList2 == null) {
                        listEmptyList2 = new ArrayList();
                    }
                    List list7 = listEmptyList2;
                    n0 n0VarF9 = d0Var2.o().f(iIntValue2, jS7);
                    n0VarF9.w(iM, 0, iMin2);
                    iM += n0VarF9.m();
                    list7.add(n0VarF9);
                    listEmptyList2 = list7;
                }
                i83++;
                listP2 = list2;
            }
            if (z17) {
                long jS8 = d0Var2.s(d0Var2.h(), iIntValue2, 0);
                if (listEmptyList2 == null) {
                    listEmptyList2 = new ArrayList();
                }
                List list8 = listEmptyList2;
                n0 n0VarF10 = d0Var2.o().f(iIntValue2, jS8);
                n0VarF10.w(iM, 0, iMin2);
                iM += n0VarF10.m();
                list8.add(n0VarF10);
                listEmptyList2 = list8;
            }
            i83++;
            listP2 = list2;
        }
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        final ArrayList arrayList4 = new ArrayList();
        arrayList4.addAll(list);
        arrayList4.addAll(listE);
        if (arrayList != null) {
            arrayList4.addAll(arrayList);
        }
        arrayList4.addAll(listEmptyList2);
        d0Var2.t().I().m((int) f15, iP4, iH2, arrayList4, d0Var2.o().g(), d0Var2.o(), d0Var2.y(), w0Var2.P5(), d0Var2.i(), d0Var2.w(), ArraysKt.minOrThrow(iArr3), ArraysKt.maxOrThrow(iArr5) + iC2, d0Var2.f(), d0Var2.g());
        int i85 = iP4;
        int i86 = iH2;
        if (!w0Var2.P5()) {
            long jI2 = d0Var2.t().I().i();
            if (!androidx.compose.ui.unit.u.h(jI2, androidx.compose.ui.unit.u.f42720b.a())) {
                int i87 = d0Var2.y() ? i86 : i85;
                int i88 = androidx.compose.ui.unit.c.i(d0Var2.d(), Math.max(i85, (int) (jI2 >> 32)));
                int iH4 = androidx.compose.ui.unit.c.h(d0Var2.d(), Math.max(i86, (int) (jI2 & com.rabbitmq.client.k0.f265952a)));
                int i89 = d0Var2.y() ? iH4 : i88;
                if (i89 != i87) {
                    int size8 = arrayList4.size();
                    for (int i90 = 0; i90 < size8; i90++) {
                        ((n0) arrayList4.get(i90)).y(i89);
                    }
                }
                i85 = i88;
                i86 = iH4;
            }
        }
        int i91 = 0;
        while (true) {
            if (i91 >= length5) {
                z11 = false;
                break;
            }
            if (iArr5[i91] > d0Var2.l()) {
                z11 = true;
                break;
            }
            i91++;
        }
        if (z11) {
            z12 = true;
        } else {
            int length10 = iArrCopyOf3.length;
            int i92 = 0;
            while (true) {
                if (i92 >= length10) {
                    z13 = true;
                    break;
                }
                if (!(iArrCopyOf3[i92] < iA + (-1))) {
                    z13 = false;
                    break;
                }
                i92++;
            }
            if (z13) {
                z12 = true;
            } else {
                z12 = false;
            }
        }
        return new k0(iArr4, iArr3, f15, androidx.compose.ui.layout.c1.h6(w0Var2, i85, i86, null, new Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.g0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h0.x(d0Var2, arrayList4, w0Var2, (i2.a) obj);
            }
        }, 4, null), f14, z12, d0Var.y(), z24, d0Var.q(), d0Var.h().g(), w0Var2, iA, listE, androidx.compose.ui.unit.u.e((((long) i85) << 32) | (((long) i86) & com.rabbitmq.client.k0.f265952a)), i31, i79, d0Var.c(), d0Var.a(), d0Var.m(), d0Var.f(), null);
    }

    private static final boolean t(int[] iArr, int[] iArr2, d0 d0Var) {
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = iArr[i10];
            if (iArr2[i10] < Math.max(-d0Var.m(), 0) && i11 > 0) {
                return true;
            }
        }
        return false;
    }

    private static final CharSequence u(n0 n0Var) {
        return String.valueOf(n0Var.getIndex());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(i2.a aVar) {
        return Unit.f312394a;
    }

    private static final CharSequence w(n0 n0Var) {
        return String.valueOf(n0Var.getIndex());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(final d0 d0Var, final List list, final androidx.compose.foundation.lazy.layout.w0 w0Var, i2.a aVar) {
        aVar.K0(new Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.e0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h0.y(list, d0Var, w0Var, (i2.a) obj);
            }
        });
        n2.a(d0Var.t().S());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(List list, d0 d0Var, androidx.compose.foundation.lazy.layout.w0 w0Var, i2.a aVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((n0) list.get(i10)).v(aVar, d0Var, w0Var.P5());
        }
        return Unit.f312394a;
    }

    private static final boolean z(int[] iArr, d0 d0Var, int[] iArr2, int i10) {
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (k(d0Var, iArr[i11], i11) == -1 && iArr2[i11] != iArr2[i10]) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i12 = 0; i12 < length2; i12++) {
            if (k(d0Var, iArr[i12], i12) != -1 && iArr2[i12] >= iArr2[i10]) {
                return true;
            }
        }
        int iH = d0Var.j().h(0);
        return (iH == 0 || iH == -1 || iH == -2) ? false : true;
    }
}
