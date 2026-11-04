package androidx.compose.material3;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nShortNavigationBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShortNavigationBar.kt\nandroidx/compose/material3/CenteredContentMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,541:1\n150#2,3:542\n34#2,6:545\n153#2:551\n34#2,6:552\n150#2,3:558\n34#2,6:561\n153#2:567\n34#2,6:568\n*S KotlinDebug\n*F\n+ 1 ShortNavigationBar.kt\nandroidx/compose/material3/CenteredContentMeasurePolicy\n*L\n455#1:542,3\n455#1:545,6\n455#1:551\n464#1:552,6\n471#1:558,3\n471#1:561,6\n471#1:567\n493#1:568,6\n*E\n"})
final class p4 implements androidx.compose.ui.layout.a1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(androidx.compose.ui.layout.i2.a aVar) {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(kotlin.jvm.internal.i1.f fVar, List list, androidx.compose.ui.layout.i2.a aVar) {
        int i10 = fVar.f312749a;
        int size = list.size();
        int iH1 = i10;
        for (int i11 = 0; i11 < size; i11++) {
            androidx.compose.ui.layout.i2 i2Var = (androidx.compose.ui.layout.i2) list.get(i11);
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var, iH1, 0, 0.0f, 4, null);
            iH1 += i2Var.h1();
        }
        return Unit.f312394a;
    }

    @Override // androidx.compose.ui.layout.a1
    @NotNull
    public androidx.compose.ui.layout.b1 a(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull List<? extends androidx.compose.ui.layout.z0> list, long j10) {
        final ArrayList arrayList;
        int iB;
        int iP = androidx.compose.ui.unit.b.p(j10);
        int iQ = androidx.compose.ui.unit.b.q(j10);
        int size = list.size();
        if (size < 1) {
            return androidx.compose.ui.layout.c1.h6(c1Var, iP, iQ, null, new Function1() { // from class: androidx.compose.material3.n4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return p4.h((androidx.compose.ui.layout.i2.a) obj);
                }
            }, 4, null);
        }
        final kotlin.jvm.internal.i1.f fVar = new kotlin.jvm.internal.i1.f();
        int i10 = 0;
        if (androidx.compose.ui.unit.b.j(j10)) {
            int i11 = iP / size;
            int iJ = dy.j(size, iP);
            fVar.f312749a = iJ;
            int i12 = (iP - (iJ * 2)) / size;
            List<? extends androidx.compose.ui.layout.z0> list2 = list;
            int size2 = list2.size();
            for (int i13 = 0; i13 < size2; i13++) {
                int iP0 = list.get(i13).p0(i12);
                if (iQ < iP0) {
                    iQ = kotlin.ranges.r.B(iP0, androidx.compose.ui.unit.b.o(j10));
                }
            }
            ArrayList arrayList2 = new ArrayList(list.size());
            int size3 = list2.size();
            while (i10 < size3) {
                androidx.compose.ui.layout.z0 z0Var = list.get(i10);
                int iM0 = z0Var.M0(androidx.compose.ui.unit.b.q(j10));
                if (i12 < iM0) {
                    iB = kotlin.ranges.r.B(iM0, i11);
                    fVar.f312749a -= (iB - i12) / 2;
                } else {
                    iB = i12;
                }
                arrayList2.add(z0Var.P0(androidx.compose.ui.unit.c.g(j10, androidx.compose.ui.unit.b.f42658b.c(iB, iQ))));
                i10++;
            }
            arrayList = arrayList2;
        } else {
            arrayList = new ArrayList(list.size());
            int size4 = list.size();
            while (i10 < size4) {
                arrayList.add(list.get(i10).P0(androidx.compose.ui.unit.c.g(j10, androidx.compose.ui.unit.b.f42658b.d(iQ))));
                i10++;
            }
        }
        return androidx.compose.ui.layout.c1.h6(c1Var, iP, iQ, null, new Function1() { // from class: androidx.compose.material3.o4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p4.i(fVar, arrayList, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }
}
