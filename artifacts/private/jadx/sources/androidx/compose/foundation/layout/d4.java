package androidx.compose.foundation.layout;

import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nRowColumnImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/IntrinsicMeasureBlocks\n+ 2 RowColumnImpl.kt\nandroidx/compose/foundation/layout/RowColumnImplKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,699:1\n421#2,5:700\n426#2,7:708\n434#2:716\n435#2,3:718\n447#2,5:721\n452#2,15:729\n470#2,6:745\n469#2,27:752\n447#2,5:779\n452#2,15:787\n470#2,6:803\n469#2,27:810\n421#2,5:837\n426#2,7:845\n434#2:853\n435#2,3:855\n421#2,5:858\n426#2,7:866\n434#2:874\n435#2,3:876\n447#2,5:879\n452#2,15:887\n470#2,6:903\n469#2,27:910\n447#2,5:937\n452#2,15:945\n470#2,6:961\n469#2,27:968\n421#2,5:995\n426#2,7:1003\n434#2:1011\n435#2,3:1013\n35#3,3:705\n39#3:717\n35#3,3:726\n39#3:744\n35#3,3:784\n39#3:802\n35#3,3:842\n39#3:854\n35#3,3:863\n39#3:875\n35#3,3:884\n39#3:902\n35#3,3:942\n39#3:960\n35#3,3:1000\n39#3:1012\n26#4:715\n26#4:751\n26#4:809\n26#4:852\n26#4:873\n26#4:909\n26#4:967\n26#4:1010\n*S KotlinDebug\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/IntrinsicMeasureBlocks\n*L\n311#1:700,5\n311#1:708,7\n311#1:716\n311#1:718,3\n324#1:721,5\n324#1:729,15\n324#1:745,6\n324#1:752,27\n338#1:779,5\n338#1:787,15\n338#1:803,6\n338#1:810,27\n352#1:837,5\n352#1:845,7\n352#1:853\n352#1:855,3\n365#1:858,5\n365#1:866,7\n365#1:874\n365#1:876,3\n378#1:879,5\n378#1:887,15\n378#1:903,6\n378#1:910,27\n392#1:937,5\n392#1:945,15\n392#1:961,6\n392#1:968,27\n406#1:995,5\n406#1:1003,7\n406#1:1011\n406#1:1013,3\n311#1:705,3\n311#1:717\n324#1:726,3\n324#1:744\n338#1:784,3\n338#1:802\n352#1:842,3\n352#1:854\n365#1:863,3\n365#1:875\n378#1:884,3\n378#1:902\n392#1:942,3\n392#1:960\n406#1:1000,3\n406#1:1012\n311#1:715\n324#1:751\n338#1:809\n352#1:852\n365#1:873\n378#1:909\n392#1:967\n406#1:1010\n*E\n"})
public final class d4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d4 f15970a = new d4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f15971b = 0;

    private d4() {
    }

    public final int a(@NotNull List<? extends androidx.compose.ui.layout.y> list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i11, i10);
        List<? extends androidx.compose.ui.layout.y> list2 = list;
        int size = list2.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            androidx.compose.ui.layout.y yVar = list.get(i12);
            float fE = q5.e(q5.c(yVar));
            if (fE == 0.0f) {
                int iMin2 = Math.min(yVar.M0(Integer.MAX_VALUE), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, yVar.p0(iMin2));
            } else if (fE > 0.0f) {
                f10 += fE;
            }
        }
        int iRound = f10 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i10 - iMin, 0) / f10);
        int size2 = list2.size();
        for (int i13 = 0; i13 < size2; i13++) {
            androidx.compose.ui.layout.y yVar2 = list.get(i13);
            float fE2 = q5.e(q5.c(yVar2));
            if (fE2 > 0.0f) {
                iMax = Math.max(iMax, yVar2.p0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fE2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int b(@NotNull List<? extends androidx.compose.ui.layout.y> list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i12 = 0;
        float f10 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            androidx.compose.ui.layout.y yVar = list.get(i13);
            float fE = q5.e(q5.c(yVar));
            int iM0 = yVar.M0(i10);
            if (fE == 0.0f) {
                i12 += iM0;
            } else if (fE > 0.0f) {
                f10 += fE;
                iMax = Math.max(iMax, Math.round(iM0 / fE));
            }
        }
        return Math.round(iMax * f10) + i12 + ((list.size() - 1) * i11);
    }

    public final int c(@NotNull List<? extends androidx.compose.ui.layout.y> list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i11, i10);
        List<? extends androidx.compose.ui.layout.y> list2 = list;
        int size = list2.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            androidx.compose.ui.layout.y yVar = list.get(i12);
            float fE = q5.e(q5.c(yVar));
            if (fE == 0.0f) {
                int iMin2 = Math.min(yVar.M0(Integer.MAX_VALUE), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, yVar.D0(iMin2));
            } else if (fE > 0.0f) {
                f10 += fE;
            }
        }
        int iRound = f10 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i10 - iMin, 0) / f10);
        int size2 = list2.size();
        for (int i13 = 0; i13 < size2; i13++) {
            androidx.compose.ui.layout.y yVar2 = list.get(i13);
            float fE2 = q5.e(q5.c(yVar2));
            if (fE2 > 0.0f) {
                iMax = Math.max(iMax, yVar2.D0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fE2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int d(@NotNull List<? extends androidx.compose.ui.layout.y> list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i12 = 0;
        float f10 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            androidx.compose.ui.layout.y yVar = list.get(i13);
            float fE = q5.e(q5.c(yVar));
            int iL0 = yVar.L0(i10);
            if (fE == 0.0f) {
                i12 += iL0;
            } else if (fE > 0.0f) {
                f10 += fE;
                iMax = Math.max(iMax, Math.round(iL0 / fE));
            }
        }
        return Math.round(iMax * f10) + i12 + ((list.size() - 1) * i11);
    }

    public final int e(@NotNull List<? extends androidx.compose.ui.layout.y> list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i12 = 0;
        float f10 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            androidx.compose.ui.layout.y yVar = list.get(i13);
            float fE = q5.e(q5.c(yVar));
            int iP0 = yVar.p0(i10);
            if (fE == 0.0f) {
                i12 += iP0;
            } else if (fE > 0.0f) {
                f10 += fE;
                iMax = Math.max(iMax, Math.round(iP0 / fE));
            }
        }
        return Math.round(iMax * f10) + i12 + ((list.size() - 1) * i11);
    }

    public final int f(@NotNull List<? extends androidx.compose.ui.layout.y> list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i11, i10);
        List<? extends androidx.compose.ui.layout.y> list2 = list;
        int size = list2.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            androidx.compose.ui.layout.y yVar = list.get(i12);
            float fE = q5.e(q5.c(yVar));
            if (fE == 0.0f) {
                int iMin2 = Math.min(yVar.p0(Integer.MAX_VALUE), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, yVar.M0(iMin2));
            } else if (fE > 0.0f) {
                f10 += fE;
            }
        }
        int iRound = f10 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i10 - iMin, 0) / f10);
        int size2 = list2.size();
        for (int i13 = 0; i13 < size2; i13++) {
            androidx.compose.ui.layout.y yVar2 = list.get(i13);
            float fE2 = q5.e(q5.c(yVar2));
            if (fE2 > 0.0f) {
                iMax = Math.max(iMax, yVar2.M0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fE2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int g(@NotNull List<? extends androidx.compose.ui.layout.y> list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i12 = 1 << 0;
        int iMax = 0;
        int i13 = 0;
        float f10 = 0.0f;
        for (int i14 = 0; i14 < size; i14++) {
            androidx.compose.ui.layout.y yVar = list.get(i14);
            float fE = q5.e(q5.c(yVar));
            int iD0 = yVar.D0(i10);
            if (fE == 0.0f) {
                i13 += iD0;
            } else if (fE > 0.0f) {
                f10 += fE;
                iMax = Math.max(iMax, Math.round(iD0 / fE));
            }
        }
        return Math.round(iMax * f10) + i13 + ((list.size() - 1) * i11);
    }

    public final int h(@NotNull List<? extends androidx.compose.ui.layout.y> list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i11, i10);
        List<? extends androidx.compose.ui.layout.y> list2 = list;
        int size = list2.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            androidx.compose.ui.layout.y yVar = list.get(i12);
            float fE = q5.e(q5.c(yVar));
            if (fE == 0.0f) {
                int iMin2 = Math.min(yVar.p0(Integer.MAX_VALUE), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, yVar.L0(iMin2));
            } else if (fE > 0.0f) {
                f10 += fE;
            }
        }
        int iRound = f10 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i10 - iMin, 0) / f10);
        int size2 = list2.size();
        for (int i13 = 0; i13 < size2; i13++) {
            androidx.compose.ui.layout.y yVar2 = list.get(i13);
            float fE2 = q5.e(q5.c(yVar2));
            if (fE2 > 0.0f) {
                iMax = Math.max(iMax, yVar2.L0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fE2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }
}
