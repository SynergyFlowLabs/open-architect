package androidx.compose.ui.layout;

import androidx.compose.runtime.k7;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@k7
@SourceDebugExtension({"SMAP\nMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasurePolicy.kt\nandroidx/compose/ui/layout/MeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,168:1\n151#2,2:169\n35#2,5:171\n153#2:176\n151#2,2:177\n35#2,5:179\n153#2:184\n151#2,2:185\n35#2,5:187\n153#2:192\n151#2,2:193\n35#2,5:195\n153#2:200\n*S KotlinDebug\n*F\n+ 1 MeasurePolicy.kt\nandroidx/compose/ui/layout/MeasurePolicy\n*L\n101#1:169,2\n101#1:171,5\n101#1:176\n121#1:177,2\n121#1:179,5\n121#1:184\n140#1:185,2\n140#1:187,5\n140#1:192\n159#1:193,2\n159#1:195,5\n159#1:200\n*E\n"})
public interface a1 {

    public static final class a {
        @Deprecated
        public static int a(@NotNull a1 a1Var, @NotNull z zVar, @NotNull List<? extends y> list, int i10) {
            return a1.super.d(zVar, list, i10);
        }

        @Deprecated
        public static int b(@NotNull a1 a1Var, @NotNull z zVar, @NotNull List<? extends y> list, int i10) {
            return a1.super.e(zVar, list, i10);
        }

        @Deprecated
        public static int c(@NotNull a1 a1Var, @NotNull z zVar, @NotNull List<? extends y> list, int i10) {
            return a1.super.b(zVar, list, i10);
        }

        @Deprecated
        public static int d(@NotNull a1 a1Var, @NotNull z zVar, @NotNull List<? extends y> list, int i10) {
            return a1.super.c(zVar, list, i10);
        }
    }

    @NotNull
    b1 a(@NotNull c1 c1Var, @NotNull List<? extends z0> list, long j10);

    default int b(@NotNull z zVar, @NotNull List<? extends y> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new n(list.get(i11), a0.Min, b0.Height));
        }
        return a(new c0(zVar, zVar.getLayoutDirection()), arrayList, androidx.compose.ui.unit.c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    default int c(@NotNull z zVar, @NotNull List<? extends y> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i11 = 6 << 0;
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.add(new n(list.get(i12), a0.Min, b0.Width));
        }
        return a(new c0(zVar, zVar.getLayoutDirection()), arrayList, androidx.compose.ui.unit.c.b(0, 0, 0, i10, 7, null)).getWidth();
    }

    default int d(@NotNull z zVar, @NotNull List<? extends y> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new n(list.get(i11), a0.Max, b0.Height));
        }
        return a(new c0(zVar, zVar.getLayoutDirection()), arrayList, androidx.compose.ui.unit.c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    default int e(@NotNull z zVar, @NotNull List<? extends y> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new n(list.get(i11), a0.Max, b0.Width));
        }
        return a(new c0(zVar, zVar.getLayoutDirection()), arrayList, androidx.compose.ui.unit.c.b(0, 0, 0, i10, 7, null)).getWidth();
    }
}
