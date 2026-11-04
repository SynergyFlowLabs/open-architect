package androidx.compose.ui.text.font;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nFontMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontMatcher.kt\nandroidx/compose/ui/text/font/FontMatcher\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,172:1\n102#1,41:190\n102#1,41:239\n110#1,33:288\n110#1,33:329\n231#2,2:173\n35#2,5:175\n233#2:180\n231#2,2:181\n35#2,5:183\n233#2:188\n231#2,2:231\n35#2,5:233\n233#2:238\n231#2,2:280\n35#2,5:282\n233#2:287\n231#2,2:321\n35#2,5:323\n233#2:328\n231#2,2:362\n35#2,5:364\n233#2:369\n231#2,2:370\n35#2,5:372\n233#2:377\n231#2,2:378\n35#2,5:380\n233#2:385\n1#3:189\n*S KotlinDebug\n*F\n+ 1 FontMatcher.kt\nandroidx/compose/ui/text/font/FontMatcher\n*L\n65#1:190,41\n72#1:239,41\n82#1:288,33\n89#1:329,33\n46#1:173,2\n46#1:175,5\n46#1:180\n55#1:181,2\n55#1:183,5\n55#1:188\n65#1:231,2\n65#1:233,5\n65#1:238\n72#1:280,2\n72#1:282,5\n72#1:287\n82#1:321,2\n82#1:323,5\n82#1:328\n89#1:362,2\n89#1:364,5\n89#1:369\n142#1:370,2\n142#1:372,5\n142#1:377\n142#1:378,2\n142#1:380,5\n142#1:385\n*E\n"})
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f41683a = 0;

    public static /* synthetic */ List b(p0 p0Var, List list, v0 v0Var, boolean z10, v0 v0Var2, v0 v0Var3, int i10, Object obj) {
        v0 v0Var4 = null;
        if ((i10 & 4) != 0) {
            v0Var2 = null;
        }
        if ((i10 & 8) != 0) {
            v0Var3 = null;
        }
        int size = list.size();
        v0 v0Var5 = null;
        for (int i11 = 0; i11 < size; i11++) {
            v0 v0VarA = ((x) list.get(i11)).a();
            if ((v0Var2 == null || v0VarA.compareTo(v0Var2) >= 0) && (v0Var3 == null || v0VarA.compareTo(v0Var3) <= 0)) {
                if (v0VarA.compareTo(v0Var) >= 0) {
                    if (v0VarA.compareTo(v0Var) <= 0) {
                        v0Var4 = v0VarA;
                        v0Var5 = v0Var4;
                        break;
                    }
                    if (v0Var5 == null || v0VarA.compareTo(v0Var5) < 0) {
                        v0Var5 = v0VarA;
                    }
                } else if (v0Var4 == null || v0VarA.compareTo(v0Var4) > 0) {
                    v0Var4 = v0VarA;
                }
            }
        }
        if (!z10 ? v0Var5 != null : v0Var4 == null) {
            v0Var4 = v0Var5;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            Object obj2 = list.get(i12);
            if (Intrinsics.areEqual(((x) obj2).a(), v0Var4)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    @NotNull
    public final List<x> a(@NotNull List<? extends x> list, @NotNull v0 v0Var, boolean z10, @Nullable v0 v0Var2, @Nullable v0 v0Var3) {
        int size = list.size();
        v0 v0Var4 = null;
        v0 v0Var5 = null;
        for (int i10 = 0; i10 < size; i10++) {
            v0 v0VarA = list.get(i10).a();
            if ((v0Var2 == null || v0VarA.compareTo(v0Var2) >= 0) && (v0Var3 == null || v0VarA.compareTo(v0Var3) <= 0)) {
                if (v0VarA.compareTo(v0Var) >= 0) {
                    if (v0VarA.compareTo(v0Var) <= 0) {
                        v0Var4 = v0VarA;
                        v0Var5 = v0Var4;
                        break;
                    }
                    if (v0Var5 == null || v0VarA.compareTo(v0Var5) < 0) {
                        v0Var5 = v0VarA;
                    }
                } else if (v0Var4 == null || v0VarA.compareTo(v0Var4) > 0) {
                    v0Var4 = v0VarA;
                }
            }
        }
        if (z10) {
            if (v0Var4 == null) {
                v0Var4 = v0Var5;
            }
        } else if (v0Var5 != null) {
            v0Var4 = v0Var5;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            x xVar = list.get(i11);
            if (Intrinsics.areEqual(xVar.a(), v0Var4)) {
                arrayList.add(xVar);
            }
        }
        return arrayList;
    }

    @NotNull
    public final List<x> c(@NotNull y yVar, @NotNull v0 v0Var, int i10) {
        if (yVar instanceof k0) {
            return d((k0) yVar, v0Var, i10);
        }
        throw new IllegalArgumentException("Only FontFamily instances that presents a list of Fonts can be used");
    }

    @NotNull
    public final List<x> d(@NotNull k0 k0Var, @NotNull v0 v0Var, int i10) {
        return e(k0Var.B(), v0Var, i10);
    }

    @NotNull
    public final List<x> e(@NotNull List<? extends x> list, @NotNull v0 v0Var, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        List<? extends x> list2 = list;
        int size = list2.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            x xVar = list.get(i12);
            x xVar2 = xVar;
            if (Intrinsics.areEqual(xVar2.a(), v0Var) && q0.f(xVar2.c(), i10)) {
                arrayList.add(xVar);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list2.size();
        for (int i13 = 0; i13 < size2; i13++) {
            x xVar3 = list.get(i13);
            if (q0.f(xVar3.c(), i10)) {
                arrayList2.add(xVar3);
            }
        }
        if (!arrayList2.isEmpty()) {
            list = arrayList2;
        }
        List<? extends x> list3 = list;
        v0.a aVar = v0.f41742b;
        v0 v0Var2 = null;
        int i14 = 5 << 0;
        if (v0Var.compareTo(aVar.z()) < 0) {
            List<? extends x> list4 = list3;
            int size3 = list4.size();
            v0 v0Var3 = null;
            for (int i15 = 0; i15 < size3; i15++) {
                v0 v0VarA = list3.get(i15).a();
                if (v0VarA.compareTo(v0Var) >= 0) {
                    if (v0VarA.compareTo(v0Var) <= 0) {
                        v0Var2 = v0VarA;
                        v0Var3 = v0Var2;
                        break;
                    }
                    if (v0Var3 == null || v0VarA.compareTo(v0Var3) < 0) {
                        v0Var3 = v0VarA;
                    }
                } else if (v0Var2 == null || v0VarA.compareTo(v0Var2) > 0) {
                    v0Var2 = v0VarA;
                }
            }
            if (v0Var2 == null) {
                v0Var2 = v0Var3;
            }
            ArrayList arrayList3 = new ArrayList(list3.size());
            int size4 = list4.size();
            while (i11 < size4) {
                x xVar4 = list3.get(i11);
                if (Intrinsics.areEqual(xVar4.a(), v0Var2)) {
                    arrayList3.add(xVar4);
                }
                i11++;
            }
            return arrayList3;
        }
        if (v0Var.compareTo(aVar.B()) > 0) {
            List<? extends x> list5 = list3;
            int size5 = list5.size();
            v0 v0Var4 = null;
            for (int i16 = 0; i16 < size5; i16++) {
                v0 v0VarA2 = list3.get(i16).a();
                if (v0VarA2.compareTo(v0Var) >= 0) {
                    if (v0VarA2.compareTo(v0Var) <= 0) {
                        v0Var2 = v0VarA2;
                        v0Var4 = v0Var2;
                        break;
                    }
                    if (v0Var4 == null || v0VarA2.compareTo(v0Var4) < 0) {
                        v0Var4 = v0VarA2;
                    }
                } else if (v0Var2 == null || v0VarA2.compareTo(v0Var2) > 0) {
                    v0Var2 = v0VarA2;
                }
            }
            if (v0Var4 != null) {
                v0Var2 = v0Var4;
            }
            ArrayList arrayList4 = new ArrayList(list3.size());
            int size6 = list5.size();
            while (i11 < size6) {
                x xVar5 = list3.get(i11);
                if (Intrinsics.areEqual(xVar5.a(), v0Var2)) {
                    arrayList4.add(xVar5);
                }
                i11++;
            }
            return arrayList4;
        }
        v0 v0VarB = aVar.B();
        List<? extends x> list6 = list3;
        int size7 = list6.size();
        v0 v0Var5 = null;
        v0 v0Var6 = null;
        for (int i17 = 0; i17 < size7; i17++) {
            v0 v0VarA3 = list3.get(i17).a();
            if (v0VarB == null || v0VarA3.compareTo(v0VarB) <= 0) {
                if (v0VarA3.compareTo(v0Var) >= 0) {
                    if (v0VarA3.compareTo(v0Var) <= 0) {
                        v0Var5 = v0VarA3;
                        v0Var6 = v0Var5;
                        break;
                    }
                    if (v0Var6 == null || v0VarA3.compareTo(v0Var6) < 0) {
                        v0Var6 = v0VarA3;
                    }
                } else if (v0Var5 == null || v0VarA3.compareTo(v0Var5) > 0) {
                    v0Var5 = v0VarA3;
                }
            }
        }
        if (v0Var6 != null) {
            v0Var5 = v0Var6;
        }
        ArrayList arrayList5 = new ArrayList(list3.size());
        int size8 = list6.size();
        for (int i18 = 0; i18 < size8; i18++) {
            x xVar6 = list3.get(i18);
            if (Intrinsics.areEqual(xVar6.a(), v0Var5)) {
                arrayList5.add(xVar6);
            }
        }
        if (arrayList5.isEmpty()) {
            v0 v0VarB2 = v0.f41742b.B();
            int size9 = list6.size();
            v0 v0Var7 = null;
            for (int i19 = 0; i19 < size9; i19++) {
                v0 v0VarA4 = list3.get(i19).a();
                if (v0VarB2 == null || v0VarA4.compareTo(v0VarB2) >= 0) {
                    if (v0VarA4.compareTo(v0Var) >= 0) {
                        if (v0VarA4.compareTo(v0Var) <= 0) {
                            v0Var2 = v0VarA4;
                            v0Var7 = v0Var2;
                            break;
                        }
                        if (v0Var7 == null || v0VarA4.compareTo(v0Var7) < 0) {
                            v0Var7 = v0VarA4;
                        }
                    } else if (v0Var2 == null || v0VarA4.compareTo(v0Var2) > 0) {
                        v0Var2 = v0VarA4;
                    }
                }
            }
            if (v0Var7 != null) {
                v0Var2 = v0Var7;
            }
            arrayList5 = new ArrayList(list3.size());
            int size10 = list6.size();
            while (i11 < size10) {
                x xVar7 = list3.get(i11);
                if (Intrinsics.areEqual(xVar7.a(), v0Var2)) {
                    arrayList5.add(xVar7);
                }
                i11++;
            }
        }
        return arrayList5;
    }
}
