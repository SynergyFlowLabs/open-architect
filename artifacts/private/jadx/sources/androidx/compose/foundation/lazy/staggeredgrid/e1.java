package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.k7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@k7
public interface e1 {

    @androidx.compose.runtime.internal.w0(parameters = 1)
    @SourceDebugExtension({"SMAP\nLazyStaggeredGridCells.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridCells.kt\nandroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells$Adaptive\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,155:1\n113#2:156\n97#3,4:157\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridCells.kt\nandroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells$Adaptive\n*L\n88#1:156\n88#1:157,4\n*E\n"})
    public static final class a implements e1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f17815b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f17816a;

        public /* synthetic */ a(float f10, DefaultConstructorMarker defaultConstructorMarker) {
            this(f10);
        }

        @Override // androidx.compose.foundation.lazy.staggeredgrid.e1
        @NotNull
        public int[] a(@NotNull androidx.compose.ui.unit.d dVar, int i10, int i11) {
            return d.b(i10, Math.max((i10 + i11) / (dVar.g6(this.f17816a) + i11), 1), i11);
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof a) && androidx.compose.ui.unit.h.x(this.f17816a, ((a) obj).f17816a);
        }

        public int hashCode() {
            return androidx.compose.ui.unit.h.D(this.f17816a);
        }

        private a(float f10) {
            this.f17816a = f10;
            if (androidx.compose.ui.unit.h.q(f10, androidx.compose.ui.unit.h.r((float) 0)) > 0) {
                return;
            }
            androidx.compose.foundation.internal.e.g("invalid minSize");
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 1)
    @SourceDebugExtension({"SMAP\nLazyStaggeredGridCells.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridCells.kt\nandroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells$Fixed\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,155:1\n97#2,4:156\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridCells.kt\nandroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells$Fixed\n*L\n58#1:156,4\n*E\n"})
    public static final class b implements e1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f17817b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f17818a;

        public b(int i10) {
            this.f17818a = i10;
            if (!(i10 > 0)) {
                androidx.compose.foundation.internal.e.g("grid with no rows/columns");
            }
        }

        @Override // androidx.compose.foundation.lazy.staggeredgrid.e1
        @NotNull
        public int[] a(@NotNull androidx.compose.ui.unit.d dVar, int i10, int i11) {
            return d.b(i10, this.f17818a, i11);
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof b) && this.f17818a == ((b) obj).f17818a;
        }

        public int hashCode() {
            return -this.f17818a;
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static final class c implements e1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f17819b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f17820a;

        public /* synthetic */ c(float f10, DefaultConstructorMarker defaultConstructorMarker) {
            this(f10);
        }

        @Override // androidx.compose.foundation.lazy.staggeredgrid.e1
        @NotNull
        public int[] a(@NotNull androidx.compose.ui.unit.d dVar, int i10, int i11) {
            int iG6 = dVar.g6(this.f17820a);
            int i12 = iG6 + i11;
            int i13 = i11 + i10;
            if (i12 >= i13) {
                return new int[]{i10};
            }
            int i14 = i13 / i12;
            int[] iArr = new int[i14];
            for (int i15 = 0; i15 < i14; i15++) {
                iArr[i15] = iG6;
            }
            return iArr;
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof c) && androidx.compose.ui.unit.h.x(this.f17820a, ((c) obj).f17820a);
        }

        public int hashCode() {
            return androidx.compose.ui.unit.h.D(this.f17820a);
        }

        private c(float f10) {
            this.f17820a = f10;
        }
    }

    @NotNull
    int[] a(@NotNull androidx.compose.ui.unit.d dVar, int i10, int i11);
}
