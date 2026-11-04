package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.k7;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@k7
public interface b {

    @androidx.compose.runtime.internal.w0(parameters = 1)
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridCells$Adaptive\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,653:1\n113#2:654\n97#3,4:655\n*S KotlinDebug\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridCells$Adaptive\n*L\n356#1:654\n356#1:655,4\n*E\n"})
    public static final class a implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f16766b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f16767a;

        public /* synthetic */ a(float f10, DefaultConstructorMarker defaultConstructorMarker) {
            this(f10);
        }

        @Override // androidx.compose.foundation.lazy.grid.b
        @NotNull
        public List<Integer> a(@NotNull androidx.compose.ui.unit.d dVar, int i10, int i11) {
            return p.p(i10, Math.max((i10 + i11) / (dVar.g6(this.f16767a) + i11), 1), i11);
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof a) && androidx.compose.ui.unit.h.x(this.f16767a, ((a) obj).f16767a);
        }

        public int hashCode() {
            return androidx.compose.ui.unit.h.D(this.f16767a);
        }

        private a(float f10) {
            this.f16767a = f10;
            if (androidx.compose.ui.unit.h.q(f10, androidx.compose.ui.unit.h.r((float) 0)) > 0) {
                return;
            }
            androidx.compose.foundation.internal.e.g("Provided min size should be larger than zero.");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.b$b, reason: collision with other inner class name */
    @androidx.compose.runtime.internal.w0(parameters = 1)
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridCells$Fixed\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,653:1\n97#2,4:654\n*S KotlinDebug\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridCells$Fixed\n*L\n327#1:654,4\n*E\n"})
    public static final class C0105b implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f16768b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f16769a;

        public C0105b(int i10) {
            this.f16769a = i10;
            if (i10 > 0) {
                return;
            }
            androidx.compose.foundation.internal.e.g("Provided count should be larger than zero");
        }

        @Override // androidx.compose.foundation.lazy.grid.b
        @NotNull
        public List<Integer> a(@NotNull androidx.compose.ui.unit.d dVar, int i10, int i11) {
            return p.p(i10, this.f16769a, i11);
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof C0105b) && this.f16769a == ((C0105b) obj).f16769a;
        }

        public int hashCode() {
            return -this.f16769a;
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 1)
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridCells$FixedSize\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,653:1\n113#2:654\n97#3,4:655\n1#4:659\n*S KotlinDebug\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridCells$FixedSize\n*L\n389#1:654\n389#1:655,4\n*E\n"})
    public static final class c implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f16770b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f16771a;

        public /* synthetic */ c(float f10, DefaultConstructorMarker defaultConstructorMarker) {
            this(f10);
        }

        @Override // androidx.compose.foundation.lazy.grid.b
        @NotNull
        public List<Integer> a(@NotNull androidx.compose.ui.unit.d dVar, int i10, int i11) {
            int iG6 = dVar.g6(this.f16771a);
            int i12 = iG6 + i11;
            int i13 = i11 + i10;
            if (i12 >= i13) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(Integer.valueOf(i10));
                return arrayList;
            }
            int i14 = i13 / i12;
            ArrayList arrayList2 = new ArrayList(i14);
            for (int i15 = 0; i15 < i14; i15++) {
                arrayList2.add(Integer.valueOf(iG6));
            }
            return arrayList2;
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof c) && androidx.compose.ui.unit.h.x(this.f16771a, ((c) obj).f16771a);
        }

        public int hashCode() {
            return androidx.compose.ui.unit.h.D(this.f16771a);
        }

        private c(float f10) {
            this.f16771a = f10;
            if (androidx.compose.ui.unit.h.q(f10, androidx.compose.ui.unit.h.r((float) 0)) > 0) {
                return;
            }
            androidx.compose.foundation.internal.e.g("Provided size should be larger than zero.");
        }
    }

    @NotNull
    List<Integer> a(@NotNull androidx.compose.ui.unit.d dVar, int i10, int i11);
}
