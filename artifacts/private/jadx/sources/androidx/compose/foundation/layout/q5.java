package androidx.compose.foundation.layout;

import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nRowColumnImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/RowColumnImplKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,699:1\n35#2,3:700\n39#2:704\n35#2,5:706\n35#2,3:712\n39#2:716\n26#3:703\n26#3:705\n26#3:711\n26#3:715\n*S KotlinDebug\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/RowColumnImplKt\n*L\n425#1:700,3\n425#1:704\n451#1:706,5\n478#1:712,3\n478#1:716\n432#1:703\n435#1:705\n475#1:711\n487#1:715\n*E\n"})
public final class q5 {
    @Nullable
    public static final k1 a(@Nullable t5 t5Var) {
        if (t5Var != null) {
            return t5Var.g();
        }
        return null;
    }

    public static final boolean b(@Nullable t5 t5Var) {
        if (t5Var != null) {
            return t5Var.h();
        }
        return true;
    }

    @Nullable
    public static final t5 c(@NotNull androidx.compose.ui.layout.y yVar) {
        Object objC = yVar.c();
        if (objC instanceof t5) {
            return (t5) objC;
        }
        return null;
    }

    @Nullable
    public static final t5 d(@NotNull androidx.compose.ui.layout.i2 i2Var) {
        Object objC = i2Var.c();
        if (objC instanceof t5) {
            return (t5) objC;
        }
        return null;
    }

    public static final float e(@Nullable t5 t5Var) {
        if (t5Var != null) {
            return t5Var.j();
        }
        return 0.0f;
    }

    private static final int f(List<? extends androidx.compose.ui.layout.y> list, Function2<? super androidx.compose.ui.layout.y, ? super Integer, Integer> function2, Function2<? super androidx.compose.ui.layout.y, ? super Integer, Integer> function3, int i10, int i11) {
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
            float fE = e(c(yVar));
            if (fE == 0.0f) {
                int iMin2 = Math.min(function2.invoke(yVar, Integer.MAX_VALUE).intValue(), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, function3.invoke(yVar, Integer.valueOf(iMin2)).intValue());
            } else if (fE > 0.0f) {
                f10 += fE;
            }
        }
        int iRound = f10 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i10 - iMin, 0) / f10);
        int size2 = list2.size();
        for (int i13 = 0; i13 < size2; i13++) {
            androidx.compose.ui.layout.y yVar2 = list.get(i13);
            float fE2 = e(c(yVar2));
            if (fE2 > 0.0f) {
                iMax = Math.max(iMax, function3.invoke(yVar2, Integer.valueOf(iRound != Integer.MAX_VALUE ? Math.round(iRound * fE2) : Integer.MAX_VALUE)).intValue());
            }
        }
        return iMax;
    }

    private static final int g(List<? extends androidx.compose.ui.layout.y> list, Function2<? super androidx.compose.ui.layout.y, ? super Integer, Integer> function2, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i12 = 0;
        float f10 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            androidx.compose.ui.layout.y yVar = list.get(i13);
            float fE = e(c(yVar));
            int iIntValue = function2.invoke(yVar, Integer.valueOf(i10)).intValue();
            if (fE == 0.0f) {
                i12 += iIntValue;
            } else if (fE > 0.0f) {
                f10 += fE;
                iMax = Math.max(iMax, Math.round(iIntValue / fE));
            }
        }
        return Math.round(iMax * f10) + i12 + ((list.size() - 1) * i11);
    }

    public static final boolean h(@Nullable t5 t5Var) {
        k1 k1VarA = a(t5Var);
        if (k1VarA != null) {
            return k1VarA.f();
        }
        return false;
    }
}
