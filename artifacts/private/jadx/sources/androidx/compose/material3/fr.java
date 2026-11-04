package androidx.compose.material3;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nAppBarDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBarDsl.kt\nandroidx/compose/material3/OverflowMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,403:1\n320#2,8:404\n320#2,8:412\n150#2,3:420\n34#2,6:423\n153#2:429\n320#2,8:430\n320#2,8:438\n320#2,8:446\n320#2,8:454\n320#2,8:462\n320#2,8:470\n34#2,6:478\n34#2,6:484\n34#2,6:490\n34#2,6:496\n*S KotlinDebug\n*F\n+ 1 AppBarDsl.kt\nandroidx/compose/material3/OverflowMeasurePolicy\n*L\n304#1:404,8\n307#1:412,8\n348#1:420,3\n348#1:423,6\n348#1:429\n355#1:430,8\n357#1:438,8\n364#1:446,8\n365#1:454,8\n369#1:462,8\n370#1:470,8\n382#1:478,6\n386#1:484,6\n394#1:490,6\n398#1:496,6\n*E\n"})
public final class fr implements androidx.compose.ui.layout.h1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f27710d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final q1 f27711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f27713c;

    public fr(@NotNull q1 q1Var, int i10, boolean z10) {
        this.f27711a = q1Var;
        this.f27712b = i10;
        this.f27713c = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(List list, List list2, androidx.compose.ui.layout.i2.a aVar) {
        int size = list.size();
        int i10 = 0;
        int iC1 = 0;
        while (i10 < size) {
            androidx.compose.ui.layout.i2 i2Var = (androidx.compose.ui.layout.i2) list.get(i10);
            androidx.compose.ui.layout.i2.a aVar2 = aVar;
            androidx.compose.ui.layout.i2.a.e0(aVar2, i2Var, 0, iC1, 0.0f, 4, null);
            iC1 += i2Var.c1();
            i10++;
            aVar = aVar2;
        }
        androidx.compose.ui.layout.i2.a aVar3 = aVar;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                androidx.compose.ui.layout.i2.a.e0(aVar3, (androidx.compose.ui.layout.i2) list2.get(i11), 0, iC1, 0.0f, 4, null);
            }
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(List list, List list2, androidx.compose.ui.layout.i2.a aVar) {
        int size = list.size();
        int i10 = 0;
        int iH1 = 0;
        while (i10 < size) {
            androidx.compose.ui.layout.i2 i2Var = (androidx.compose.ui.layout.i2) list.get(i10);
            int i11 = 7 >> 4;
            androidx.compose.ui.layout.i2.a aVar2 = aVar;
            androidx.compose.ui.layout.i2.a.e0(aVar2, i2Var, iH1, 0, 0.0f, 4, null);
            iH1 += i2Var.h1();
            i10++;
            aVar = aVar2;
        }
        androidx.compose.ui.layout.i2.a aVar3 = aVar;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                androidx.compose.ui.layout.i2.a.e0(aVar3, (androidx.compose.ui.layout.i2) list2.get(i12), iH1, 0, 0.0f, 4, null);
            }
        }
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0071  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c0  */
    @Override // androidx.compose.ui.layout.h1
    @NotNull
    public androidx.compose.ui.layout.b1 a(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull List<? extends List<? extends androidx.compose.ui.layout.z0>> list, long j10) {
        Integer numValueOf;
        int iIntValue;
        int i10;
        final ArrayList arrayList;
        Integer numValueOf2;
        int iIntValue2;
        Integer numValueOf3;
        int iMax;
        Integer numValueOf4;
        Integer numValueOf5;
        Integer numValueOf6;
        Integer numValueOf7;
        Integer numValueOf8;
        int iIntValue3 = 0;
        long jD = androidx.compose.ui.unit.b.d(j10, 0, 0, 0, 0, 10, null);
        List<? extends androidx.compose.ui.layout.z0> list2 = list.get(0);
        int i11 = 1;
        List<? extends androidx.compose.ui.layout.z0> list3 = list.get(1);
        this.f27711a.c(list2.size());
        if (this.f27713c) {
            if (!list3.isEmpty()) {
                numValueOf8 = Integer.valueOf(list3.get(0).p0(androidx.compose.ui.unit.b.p(j10)));
                int lastIndex = CollectionsKt.getLastIndex(list3);
                if (1 <= lastIndex) {
                    int i12 = 1;
                    while (true) {
                        Integer numValueOf9 = Integer.valueOf(list3.get(i12).p0(androidx.compose.ui.unit.b.p(j10)));
                        if (numValueOf9.compareTo(numValueOf8) > 0) {
                            numValueOf8 = numValueOf9;
                        }
                        if (i12 == lastIndex) {
                            break;
                        }
                        i12++;
                    }
                }
            } else {
                numValueOf8 = null;
            }
            if (numValueOf8 != null) {
                iIntValue = numValueOf8.intValue();
            } else {
                iIntValue = 0;
            }
        } else {
            if (!list3.isEmpty()) {
                numValueOf = Integer.valueOf(list3.get(0).M0(androidx.compose.ui.unit.b.o(j10)));
                int lastIndex2 = CollectionsKt.getLastIndex(list3);
                if (1 <= lastIndex2) {
                    int i13 = 1;
                    while (true) {
                        Integer numValueOf10 = Integer.valueOf(list3.get(i13).M0(androidx.compose.ui.unit.b.o(j10)));
                        if (numValueOf10.compareTo(numValueOf) > 0) {
                            numValueOf = numValueOf10;
                        }
                        if (i13 == lastIndex2) {
                            break;
                        }
                        i13++;
                    }
                }
            } else {
                numValueOf = null;
            }
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = 0;
            }
        }
        int iD = androidx.compose.material3.internal.u2.d(this.f27713c ? androidx.compose.ui.unit.b.o(j10) : androidx.compose.ui.unit.b.p(j10), iIntValue);
        final ArrayList arrayList2 = new ArrayList();
        int size = list2.size();
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i14 >= size) {
                i10 = i11;
                break;
            }
            androidx.compose.ui.layout.i2 i2VarP0 = list2.get(i14).P0(jD);
            int i16 = i14 == CollectionsKt.getLastIndex(list2) ? i11 : 0;
            i10 = i11;
            if (i16 == 0 && i14 == this.f27712b - 1) {
                break;
            }
            int iC1 = this.f27713c ? i2VarP0.c1() : i2VarP0.h1();
            if (iC1 > iD && (i16 == 0 || iC1 > iD + iIntValue)) {
                break;
            }
            arrayList2.add(i2VarP0);
            i15 += iC1;
            iD = androidx.compose.material3.internal.u2.d(iD, iC1);
            i14++;
            i11 = i10;
        }
        this.f27711a.b(arrayList2.size());
        if (arrayList2.size() != list2.size()) {
            long jD2 = this.f27713c ? androidx.compose.ui.unit.b.d(jD, 0, 0, 0, iD + iIntValue, 7, null) : androidx.compose.ui.unit.b.d(jD, 0, iD + iIntValue, 0, 0, 13, null);
            arrayList = new ArrayList(list3.size());
            int size2 = list3.size();
            for (int i17 = 0; i17 < size2; i17++) {
                arrayList.add(list3.get(i17).P0(jD2));
            }
        } else {
            arrayList2 = arrayList2;
            arrayList = null;
        }
        if (this.f27713c) {
            if (arrayList == null) {
                iIntValue2 = 0;
            } else {
                if (!arrayList.isEmpty()) {
                    numValueOf7 = Integer.valueOf(((androidx.compose.ui.layout.i2) arrayList.get(0)).c1());
                    int lastIndex3 = CollectionsKt.getLastIndex(arrayList);
                    if (i10 <= lastIndex3) {
                        int i18 = 1;
                        while (true) {
                            Integer numValueOf11 = Integer.valueOf(((androidx.compose.ui.layout.i2) arrayList.get(i18)).c1());
                            if (numValueOf11.compareTo(numValueOf7) > 0) {
                                numValueOf7 = numValueOf11;
                            }
                            if (i18 == lastIndex3) {
                                break;
                            }
                            i18++;
                        }
                    }
                } else {
                    numValueOf7 = null;
                }
                if (numValueOf7 != null) {
                    iIntValue2 = numValueOf7.intValue();
                } else {
                    iIntValue2 = 0;
                }
            }
        } else if (arrayList == null) {
            iIntValue2 = 0;
        } else {
            if (!arrayList.isEmpty()) {
                numValueOf2 = Integer.valueOf(((androidx.compose.ui.layout.i2) arrayList.get(0)).h1());
                int lastIndex4 = CollectionsKt.getLastIndex(arrayList);
                if (1 <= lastIndex4) {
                    int i19 = 1;
                    while (true) {
                        Integer numValueOf12 = Integer.valueOf(((androidx.compose.ui.layout.i2) arrayList.get(i19)).h1());
                        if (numValueOf12.compareTo(numValueOf2) > 0) {
                            numValueOf2 = numValueOf12;
                        }
                        if (i19 == lastIndex4) {
                            break;
                        }
                        i19++;
                    }
                }
            } else {
                numValueOf2 = null;
            }
            if (numValueOf2 != null) {
                iIntValue2 = numValueOf2.intValue();
            } else {
                iIntValue2 = 0;
            }
        }
        int i20 = i15 + iIntValue2;
        if (this.f27713c) {
            if (!arrayList2.isEmpty()) {
                numValueOf5 = Integer.valueOf(((androidx.compose.ui.layout.i2) arrayList2.get(0)).h1());
                int lastIndex5 = CollectionsKt.getLastIndex(arrayList2);
                if (1 <= lastIndex5) {
                    int i21 = 1;
                    while (true) {
                        Integer numValueOf13 = Integer.valueOf(((androidx.compose.ui.layout.i2) arrayList2.get(i21)).h1());
                        if (numValueOf13.compareTo(numValueOf5) > 0) {
                            numValueOf5 = numValueOf13;
                        }
                        if (i21 == lastIndex5) {
                            break;
                        }
                        i21++;
                    }
                }
            } else {
                numValueOf5 = null;
            }
            int iIntValue4 = numValueOf5 != null ? numValueOf5.intValue() : 0;
            if (arrayList != null) {
                if (arrayList.isEmpty()) {
                    numValueOf6 = null;
                } else {
                    numValueOf6 = Integer.valueOf(((androidx.compose.ui.layout.i2) arrayList.get(0)).h1());
                    int lastIndex6 = CollectionsKt.getLastIndex(arrayList);
                    if (1 <= lastIndex6) {
                        Integer num = numValueOf6;
                        int i22 = 1;
                        while (true) {
                            Integer numValueOf14 = Integer.valueOf(((androidx.compose.ui.layout.i2) arrayList.get(i22)).h1());
                            if (numValueOf14.compareTo(num) > 0) {
                                num = numValueOf14;
                            }
                            if (i22 == lastIndex6) {
                                break;
                            }
                            i22++;
                        }
                        numValueOf6 = num;
                    }
                }
                if (numValueOf6 != null) {
                    iIntValue3 = numValueOf6.intValue();
                }
            }
            iMax = Math.max(iIntValue4, iIntValue3);
        } else {
            if (!arrayList2.isEmpty()) {
                numValueOf3 = Integer.valueOf(((androidx.compose.ui.layout.i2) arrayList2.get(0)).c1());
                int lastIndex7 = CollectionsKt.getLastIndex(arrayList2);
                if (1 <= lastIndex7) {
                    int i23 = 1;
                    while (true) {
                        Integer numValueOf15 = Integer.valueOf(((androidx.compose.ui.layout.i2) arrayList2.get(i23)).c1());
                        if (numValueOf15.compareTo(numValueOf3) > 0) {
                            numValueOf3 = numValueOf15;
                        }
                        if (i23 == lastIndex7) {
                            break;
                        }
                        i23++;
                    }
                }
            } else {
                numValueOf3 = null;
            }
            int iIntValue5 = numValueOf3 != null ? numValueOf3.intValue() : 0;
            if (arrayList != null) {
                if (!arrayList.isEmpty()) {
                    numValueOf4 = Integer.valueOf(((androidx.compose.ui.layout.i2) arrayList.get(0)).c1());
                    int lastIndex8 = CollectionsKt.getLastIndex(arrayList);
                    int i24 = 1;
                    if (1 <= lastIndex8) {
                        while (true) {
                            Integer numValueOf16 = Integer.valueOf(((androidx.compose.ui.layout.i2) arrayList.get(i24)).c1());
                            if (numValueOf16.compareTo(numValueOf4) > 0) {
                                numValueOf4 = numValueOf16;
                            }
                            if (i24 == lastIndex8) {
                                break;
                            }
                            i24++;
                        }
                    }
                } else {
                    numValueOf4 = null;
                }
                if (numValueOf4 != null) {
                    iIntValue3 = numValueOf4.intValue();
                }
            }
            iMax = Math.max(iIntValue5, iIntValue3);
        }
        return this.f27713c ? androidx.compose.ui.layout.c1.h6(c1Var, androidx.compose.ui.unit.c.i(j10, iMax), androidx.compose.ui.unit.c.h(j10, i20), null, new Function1() { // from class: androidx.compose.material3.dr
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fr.i(arrayList2, arrayList, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null) : androidx.compose.ui.layout.c1.h6(c1Var, androidx.compose.ui.unit.c.i(j10, i20), androidx.compose.ui.unit.c.h(j10, iMax), null, new Function1() { // from class: androidx.compose.material3.er
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fr.j(arrayList2, arrayList, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    public final int h() {
        return this.f27712b;
    }

    public /* synthetic */ fr(q1 q1Var, int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(q1Var, i10, (i11 & 4) != 0 ? false : z10);
    }
}
