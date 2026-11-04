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
@SourceDebugExtension({"SMAP\nRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Row.kt\nandroidx/compose/foundation/layout/RowMeasurePolicy\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,405:1\n13474#2,3:406\n*S KotlinDebug\n*F\n+ 1 Row.kt\nandroidx/compose/foundation/layout/RowMeasurePolicy\n*L\n186#1:406,3\n*E\n"})
public final class w5 implements androidx.compose.ui.layout.a1, r5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16521c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final q.e f16522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.e.c f16523b;

    public w5(@NotNull q.e eVar, @NotNull androidx.compose.ui.e.c cVar) {
        this.f16522a = eVar;
        this.f16523b = cVar;
    }

    public static /* synthetic */ w5 A(w5 w5Var, q.e eVar, androidx.compose.ui.e.c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eVar = w5Var.f16522a;
        }
        if ((i10 & 2) != 0) {
            cVar = w5Var.f16523b;
        }
        return w5Var.z(eVar, cVar);
    }

    private final int B(androidx.compose.ui.layout.i2 i2Var, t5 t5Var, int i10, int i11) {
        k1 k1VarG = t5Var != null ? t5Var.g() : null;
        return k1VarG != null ? k1VarG.d(i10 - i2Var.c1(), androidx.compose.ui.unit.w.Ltr, i2Var, i11) : this.f16523b.a(0, i10 - i2Var.c1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(androidx.compose.ui.layout.i2[] i2VarArr, w5 w5Var, int i10, int i11, int[] iArr, androidx.compose.ui.layout.i2.a aVar) {
        int length = i2VarArr.length;
        int i12 = 0;
        int i13 = 0;
        while (i12 < length) {
            androidx.compose.ui.layout.i2 i2Var = i2VarArr[i12];
            Intrinsics.checkNotNull(i2Var);
            androidx.compose.ui.layout.i2.a.P(aVar, i2Var, iArr[i13], w5Var.B(i2Var, q5.d(i2Var), i10, i11), 0.0f, 4, null);
            i12++;
            i13++;
        }
        return Unit.f312394a;
    }

    private final q.e x() {
        return this.f16522a;
    }

    private final androidx.compose.ui.e.c y() {
        return this.f16523b;
    }

    @Override // androidx.compose.ui.layout.a1
    @NotNull
    public androidx.compose.ui.layout.b1 a(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull List<? extends androidx.compose.ui.layout.z0> list, long j10) {
        return s5.a(this, androidx.compose.ui.unit.b.r(j10), androidx.compose.ui.unit.b.q(j10), androidx.compose.ui.unit.b.p(j10), androidx.compose.ui.unit.b.o(j10), c1Var.g6(this.f16522a.a()), c1Var, list, new androidx.compose.ui.layout.i2[list.size()], 0, list.size(), (3072 & 1024) != 0 ? null : null, (3072 & 2048) != 0 ? 0 : 0);
    }

    @Override // androidx.compose.ui.layout.a1
    public int b(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
        return d4.f15970a.c(list, i10, zVar.g6(this.f16522a.a()));
    }

    @Override // androidx.compose.ui.layout.a1
    public int c(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
        return d4.f15970a.d(list, i10, zVar.g6(this.f16522a.a()));
    }

    @Override // androidx.compose.ui.layout.a1
    public int d(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
        return d4.f15970a.a(list, i10, zVar.g6(this.f16522a.a()));
    }

    @Override // androidx.compose.ui.layout.a1
    public int e(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
        return d4.f15970a.b(list, i10, zVar.g6(this.f16522a.a()));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w5)) {
            return false;
        }
        w5 w5Var = (w5) obj;
        return Intrinsics.areEqual(this.f16522a, w5Var.f16522a) && Intrinsics.areEqual(this.f16523b, w5Var.f16523b);
    }

    @Override // androidx.compose.foundation.layout.r5
    public long f(int i10, int i11, int i12, int i13, boolean z10) {
        return u5.b(z10, i10, i11, i12, i13);
    }

    @Override // androidx.compose.foundation.layout.r5
    public void g(int i10, @NotNull int[] iArr, @NotNull int[] iArr2, @NotNull androidx.compose.ui.layout.c1 c1Var) {
        this.f16522a.c(c1Var, i10, iArr, c1Var.getLayoutDirection(), iArr2);
    }

    @Override // androidx.compose.foundation.layout.r5
    public int h(@NotNull androidx.compose.ui.layout.i2 i2Var) {
        return i2Var.c1();
    }

    public int hashCode() {
        return (this.f16522a.hashCode() * 31) + this.f16523b.hashCode();
    }

    @Override // androidx.compose.foundation.layout.r5
    @NotNull
    public androidx.compose.ui.layout.b1 j(@NotNull final androidx.compose.ui.layout.i2[] i2VarArr, @NotNull androidx.compose.ui.layout.c1 c1Var, final int i10, @NotNull final int[] iArr, int i11, final int i12, @Nullable int[] iArr2, int i13, int i14, int i15) {
        return androidx.compose.ui.layout.c1.h6(c1Var, i11, i12, null, new Function1() { // from class: androidx.compose.foundation.layout.v5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w5.C(i2VarArr, this, i12, i10, iArr, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.foundation.layout.r5
    public int k(@NotNull androidx.compose.ui.layout.i2 i2Var) {
        return i2Var.h1();
    }

    @NotNull
    public String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f16522a + ", verticalAlignment=" + this.f16523b + ')';
    }

    @NotNull
    public final w5 z(@NotNull q.e eVar, @NotNull androidx.compose.ui.e.c cVar) {
        return new w5(eVar, cVar);
    }
}
