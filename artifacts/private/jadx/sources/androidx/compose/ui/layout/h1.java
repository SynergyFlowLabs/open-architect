package androidx.compose.ui.layout;

import androidx.compose.runtime.k7;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@k7
@SourceDebugExtension({"SMAP\nMultiContentMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiContentMeasurePolicy.kt\nandroidx/compose/ui/layout/MultiContentMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,240:1\n151#2,2:241\n35#2,3:243\n151#2,2:246\n35#2,5:248\n153#2:253\n39#2:254\n153#2:255\n151#2,2:256\n35#2,3:258\n151#2,2:261\n35#2,5:263\n153#2:268\n39#2:269\n153#2:270\n151#2,2:271\n35#2,3:273\n151#2,2:276\n35#2,5:278\n153#2:283\n39#2:284\n153#2:285\n151#2,2:286\n35#2,3:288\n151#2,2:291\n35#2,5:293\n153#2:298\n39#2:299\n153#2:300\n*S KotlinDebug\n*F\n+ 1 MultiContentMeasurePolicy.kt\nandroidx/compose/ui/layout/MultiContentMeasurePolicy\n*L\n111#1:241,2\n111#1:243,3\n112#1:246,2\n112#1:248,5\n112#1:253\n111#1:254\n111#1:255\n137#1:256,2\n137#1:258,3\n138#1:261,2\n138#1:263,5\n138#1:268\n137#1:269\n137#1:270\n162#1:271,2\n162#1:273,3\n163#1:276,2\n163#1:278,5\n163#1:283\n162#1:284\n162#1:285\n187#1:286,2\n187#1:288,3\n188#1:291,2\n188#1:293,5\n188#1:298\n187#1:299\n187#1:300\n*E\n"})
public interface h1 {
    @NotNull
    b1 a(@NotNull c1 c1Var, @NotNull List<? extends List<? extends z0>> list, long j10);

    default int b(@NotNull z zVar, @NotNull List<? extends List<? extends y>> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            List<? extends y> list2 = list.get(i11);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList2.add(new n(list2.get(i12), a0.Min, b0.Height));
            }
            arrayList.add(arrayList2);
        }
        return a(new c0(zVar, zVar.getLayoutDirection()), arrayList, androidx.compose.ui.unit.c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    default int c(@NotNull z zVar, @NotNull List<? extends List<? extends y>> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            List<? extends y> list2 = list.get(i11);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList2.add(new n(list2.get(i12), a0.Min, b0.Width));
            }
            arrayList.add(arrayList2);
        }
        return a(new c0(zVar, zVar.getLayoutDirection()), arrayList, androidx.compose.ui.unit.c.b(0, 0, 0, i10, 7, null)).getWidth();
    }

    default int d(@NotNull z zVar, @NotNull List<? extends List<? extends y>> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            List<? extends y> list2 = list.get(i11);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList2.add(new n(list2.get(i12), a0.Max, b0.Height));
            }
            arrayList.add(arrayList2);
        }
        return a(new c0(zVar, zVar.getLayoutDirection()), arrayList, androidx.compose.ui.unit.c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    default int e(@NotNull z zVar, @NotNull List<? extends List<? extends y>> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            List<? extends y> list2 = list.get(i11);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList2.add(new n(list2.get(i12), a0.Max, b0.Width));
            }
            arrayList.add(arrayList2);
        }
        return a(new c0(zVar, zVar.getLayoutDirection()), arrayList, androidx.compose.ui.unit.c.b(0, 0, 0, i10, 7, null)).getWidth();
    }
}
