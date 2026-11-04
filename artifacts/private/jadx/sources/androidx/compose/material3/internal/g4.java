package androidx.compose.material3.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
public final class g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g4 f28888a = new g4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f28889b = 0;

    @androidx.compose.runtime.o2
    @SourceDebugExtension({"SMAP\nMenuPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuPosition.kt\nandroidx/compose/material3/internal/WindowAlignmentMarginPosition$Horizontal\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,394:1\n54#2:395\n54#2:397\n54#2:399\n54#2:401\n85#3:396\n85#3:398\n85#3:400\n85#3:402\n*S KotlinDebug\n*F\n+ 1 MenuPosition.kt\nandroidx/compose/material3/internal/WindowAlignmentMarginPosition$Horizontal\n*L\n246#1:395\n249#1:397\n256#1:399\n259#1:401\n246#1:396\n249#1:398\n256#1:400\n259#1:402\n*E\n"})
    public static final class a implements a3.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f28890c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final androidx.compose.ui.e.b f28891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f28892b;

        public a(@NotNull androidx.compose.ui.e.b bVar, int i10) {
            this.f28891a = bVar;
            this.f28892b = i10;
        }

        private final androidx.compose.ui.e.b b() {
            return this.f28891a;
        }

        private final int c() {
            return this.f28892b;
        }

        public static /* synthetic */ a e(a aVar, androidx.compose.ui.e.b bVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bVar = aVar.f28891a;
            }
            if ((i11 & 2) != 0) {
                i10 = aVar.f28892b;
            }
            return aVar.d(bVar, i10);
        }

        @Override // androidx.compose.material3.internal.a3.a
        public int a(@NotNull androidx.compose.ui.unit.s sVar, long j10, int i10, @NotNull androidx.compose.ui.unit.w wVar) {
            int i11 = (int) (j10 >> 32);
            if (i10 >= i11 - (this.f28892b * 2)) {
                return androidx.compose.ui.e.f37317a.m().a(i10, i11, wVar);
            }
            int iA = this.f28891a.a(i10, i11, wVar);
            int i12 = this.f28892b;
            return kotlin.ranges.r.I(iA, i12, (i11 - i12) - i10);
        }

        @NotNull
        public final a d(@NotNull androidx.compose.ui.e.b bVar, int i10) {
            return new a(bVar, i10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f28891a, aVar.f28891a) && this.f28892b == aVar.f28892b;
        }

        public int hashCode() {
            return (this.f28891a.hashCode() * 31) + Integer.hashCode(this.f28892b);
        }

        @NotNull
        public String toString() {
            return "Horizontal(alignment=" + this.f28891a + ", margin=" + this.f28892b + ')';
        }
    }

    @androidx.compose.runtime.o2
    @SourceDebugExtension({"SMAP\nMenuPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuPosition.kt\nandroidx/compose/material3/internal/WindowAlignmentMarginPosition$Vertical\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,394:1\n59#2:395\n59#2:397\n59#2:399\n59#2:401\n90#3:396\n90#3:398\n90#3:400\n90#3:402\n*S KotlinDebug\n*F\n+ 1 MenuPosition.kt\nandroidx/compose/material3/internal/WindowAlignmentMarginPosition$Vertical\n*L\n275#1:395\n278#1:397\n281#1:399\n282#1:401\n275#1:396\n278#1:398\n281#1:400\n282#1:402\n*E\n"})
    public static final class b implements a3.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f28893c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final androidx.compose.ui.e.c f28894a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f28895b;

        public b(@NotNull androidx.compose.ui.e.c cVar, int i10) {
            this.f28894a = cVar;
            this.f28895b = i10;
        }

        private final androidx.compose.ui.e.c b() {
            return this.f28894a;
        }

        private final int c() {
            return this.f28895b;
        }

        public static /* synthetic */ b e(b bVar, androidx.compose.ui.e.c cVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cVar = bVar.f28894a;
            }
            if ((i11 & 2) != 0) {
                i10 = bVar.f28895b;
            }
            return bVar.d(cVar, i10);
        }

        @Override // androidx.compose.material3.internal.a3.b
        public int a(@NotNull androidx.compose.ui.unit.s sVar, long j10, int i10) {
            int i11 = (int) (j10 & com.rabbitmq.client.k0.f265952a);
            if (i10 >= i11 - (this.f28895b * 2)) {
                return androidx.compose.ui.e.f37317a.q().a(i10, i11);
            }
            int iA = this.f28894a.a(i10, i11);
            int i12 = this.f28895b;
            return kotlin.ranges.r.I(iA, i12, (i11 - i12) - i10);
        }

        @NotNull
        public final b d(@NotNull androidx.compose.ui.e.c cVar, int i10) {
            return new b(cVar, i10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f28894a, bVar.f28894a) && this.f28895b == bVar.f28895b;
        }

        public int hashCode() {
            return (this.f28894a.hashCode() * 31) + Integer.hashCode(this.f28895b);
        }

        @NotNull
        public String toString() {
            return "Vertical(alignment=" + this.f28894a + ", margin=" + this.f28895b + ')';
        }
    }

    private g4() {
    }
}
