package androidx.compose.foundation.lazy.layout;

import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f17630a = a.f17631a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f17631a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private static final z2 f17632b = new C0115a();

        /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.z2$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nLazyLayoutStickyItems.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutStickyItems.kt\nandroidx/compose/foundation/lazy/layout/StickyItemsPlacement$Companion$StickToTopPlacement$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 LazyLayoutStickyItems.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutStickyItemsKt\n+ 4 IntList.kt\nandroidx/collection/IntList\n*L\n1#1,218:1\n118#2:219\n35#2,5:220\n119#2:225\n155#3,4:226\n155#3,4:230\n155#3,4:235\n363#4:234\n74#4:239\n*S KotlinDebug\n*F\n+ 1 LazyLayoutStickyItems.kt\nandroidx/compose/foundation/lazy/layout/StickyItemsPlacement$Companion$StickToTopPlacement$1\n*L\n89#1:219\n89#1:220,5\n89#1:225\n92#1:226,4\n108#1:230,4\n127#1:235,4\n121#1:234\n133#1:239\n*E\n"})
        public static final class C0115a implements z2 {
            C0115a() {
            }

            @Override // androidx.compose.foundation.lazy.layout.z2
            public int a(List<? extends y0> list, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                y0 y0Var;
                int size = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size) {
                        y0Var = null;
                        break;
                    }
                    y0Var = list.get(i17);
                    if (y0Var.getIndex() != i10) {
                        break;
                    }
                    i17++;
                }
                y0 y0Var2 = y0Var;
                int iD = y0Var2 != null ? y1.d(y0Var2) : Integer.MIN_VALUE;
                int iMax = i12 == Integer.MIN_VALUE ? -i13 : Math.max(-i13, i12);
                return iD != Integer.MIN_VALUE ? Math.min(iMax, iD - i11) : iMax;
            }

            @Override // androidx.compose.foundation.lazy.layout.z2
            public androidx.collection.f0 b(int i10, int i11, androidx.collection.f0 f0Var) {
                int i12;
                if (i11 - i10 < 0 || (i12 = f0Var.f12216b) == 0) {
                    return androidx.collection.g0.c();
                }
                IntRange intRangeW1 = kotlin.ranges.r.W1(0, i12);
                int iL = intRangeW1.l();
                int iM = intRangeW1.m();
                int iW = -1;
                if (iL <= iM) {
                    while (f0Var.w(iL) <= i10) {
                        iW = f0Var.w(iL);
                        if (iL == iM) {
                            break;
                        }
                        iL++;
                    }
                }
                return iW == -1 ? androidx.collection.g0.c() : androidx.collection.g0.e(iW);
            }
        }

        private a() {
        }

        @NotNull
        public final z2 a() {
            return f17632b;
        }
    }

    int a(@NotNull List<? extends y0> list, int i10, int i11, int i12, int i13, int i14, int i15, int i16);

    @NotNull
    androidx.collection.f0 b(int i10, int i11, @NotNull androidx.collection.f0 f0Var);
}
