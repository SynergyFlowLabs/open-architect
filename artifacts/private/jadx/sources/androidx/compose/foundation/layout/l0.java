package androidx.compose.foundation.layout;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nColumn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnMeasurePolicy\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,382:1\n13474#2,3:383\n*S KotlinDebug\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnMeasurePolicy\n*L\n154#1:383,3\n*E\n"})
public final class l0 implements androidx.compose.ui.layout.a1, r5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16200c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final q.m f16201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.e.b f16202b;

    public l0(@NotNull q.m mVar, @NotNull androidx.compose.ui.e.b bVar) {
        this.f16201a = mVar;
        this.f16202b = bVar;
    }

    public static /* synthetic */ l0 A(l0 l0Var, q.m mVar, androidx.compose.ui.e.b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mVar = l0Var.f16201a;
        }
        if ((i10 & 2) != 0) {
            bVar = l0Var.f16202b;
        }
        return l0Var.z(mVar, bVar);
    }

    private final int B(androidx.compose.ui.layout.i2 i2Var, t5 t5Var, int i10, int i11, androidx.compose.ui.unit.w wVar) {
        k1 k1VarG = t5Var != null ? t5Var.g() : null;
        return k1VarG != null ? k1VarG.d(i10 - i2Var.h1(), wVar, i2Var, i11) : this.f16202b.a(0, i10 - i2Var.h1(), wVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(androidx.compose.ui.layout.i2[] i2VarArr, l0 l0Var, int i10, int i11, androidx.compose.ui.layout.c1 c1Var, int[] iArr, androidx.compose.ui.layout.i2.a aVar) {
        int length = i2VarArr.length;
        int i12 = 0;
        int i13 = 0;
        while (i12 < length) {
            androidx.compose.ui.layout.i2 i2Var = i2VarArr[i12];
            Intrinsics.checkNotNull(i2Var);
            androidx.compose.ui.layout.i2.a.P(aVar, i2Var, l0Var.B(i2Var, q5.d(i2Var), i10, i11, c1Var.getLayoutDirection()), iArr[i13], 0.0f, 4, null);
            i12++;
            i13++;
        }
        return Unit.f312394a;
    }

    private final q.m x() {
        return this.f16201a;
    }

    private final androidx.compose.ui.e.b y() {
        return this.f16202b;
    }

    @Override // androidx.compose.ui.layout.a1
    @NotNull
    public androidx.compose.ui.layout.b1 a(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull List<? extends androidx.compose.ui.layout.z0> list, long j10) {
        return s5.a(this, androidx.compose.ui.unit.b.q(j10), androidx.compose.ui.unit.b.r(j10), androidx.compose.ui.unit.b.o(j10), androidx.compose.ui.unit.b.p(j10), c1Var.g6(this.f16201a.a()), c1Var, list, new androidx.compose.ui.layout.i2[list.size()], 0, list.size(), (3072 & 1024) != 0 ? null : null, (3072 & 2048) != 0 ? 0 : 0);
    }

    @Override // androidx.compose.ui.layout.a1
    public int b(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
        return d4.f15970a.g(list, i10, zVar.g6(this.f16201a.a()));
    }

    @Override // androidx.compose.ui.layout.a1
    public int c(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
        return d4.f15970a.h(list, i10, zVar.g6(this.f16201a.a()));
    }

    @Override // androidx.compose.ui.layout.a1
    public int d(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
        return d4.f15970a.e(list, i10, zVar.g6(this.f16201a.a()));
    }

    @Override // androidx.compose.ui.layout.a1
    public int e(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
        return d4.f15970a.f(list, i10, zVar.g6(this.f16201a.a()));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return Intrinsics.areEqual(this.f16201a, l0Var.f16201a) && Intrinsics.areEqual(this.f16202b, l0Var.f16202b);
    }

    @Override // androidx.compose.foundation.layout.r5
    public long f(int i10, int i11, int i12, int i13, boolean z10) {
        return j0.c(z10, i10, i11, i12, i13);
    }

    @Override // androidx.compose.foundation.layout.r5
    public void g(int i10, @NotNull int[] iArr, @NotNull int[] iArr2, @NotNull androidx.compose.ui.layout.c1 c1Var) {
        this.f16201a.arrange(c1Var, i10, iArr, iArr2);
    }

    @Override // androidx.compose.foundation.layout.r5
    public int h(@NotNull androidx.compose.ui.layout.i2 i2Var) {
        return i2Var.h1();
    }

    public int hashCode() {
        return (this.f16201a.hashCode() * 31) + this.f16202b.hashCode();
    }

    @Override // androidx.compose.foundation.layout.r5
    @NotNull
    public androidx.compose.ui.layout.b1 j(@NotNull final androidx.compose.ui.layout.i2[] i2VarArr, @NotNull final androidx.compose.ui.layout.c1 c1Var, final int i10, @NotNull final int[] iArr, int i11, final int i12, @Nullable int[] iArr2, int i13, int i14, int i15) {
        return androidx.compose.ui.layout.c1.h6(c1Var, i12, i11, null, new Function1() { // from class: androidx.compose.foundation.layout.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l0.C(i2VarArr, this, i12, i10, c1Var, iArr, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.foundation.layout.r5
    public int k(@NotNull androidx.compose.ui.layout.i2 i2Var) {
        return i2Var.c1();
    }

    @NotNull
    public String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.f16201a + ", horizontalAlignment=" + this.f16202b + ')';
    }

    @NotNull
    public final l0 z(@NotNull q.m mVar, @NotNull androidx.compose.ui.e.b bVar) {
        return new l0(mVar, bVar);
    }
}
