package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class AlignmentLineOffsetTextUnitElement extends androidx.compose.ui.node.e1<e> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.layout.a f15774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f15775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f15776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Function1<androidx.compose.ui.platform.t2, Unit> f15777f;

    public /* synthetic */ AlignmentLineOffsetTextUnitElement(androidx.compose.ui.layout.a aVar, long j10, long j11, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, j10, j11, function1);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        AlignmentLineOffsetTextUnitElement alignmentLineOffsetTextUnitElement = obj instanceof AlignmentLineOffsetTextUnitElement ? (AlignmentLineOffsetTextUnitElement) obj : null;
        return alignmentLineOffsetTextUnitElement != null && Intrinsics.areEqual(this.f15774c, alignmentLineOffsetTextUnitElement.f15774c) && androidx.compose.ui.unit.z.j(this.f15775d, alignmentLineOffsetTextUnitElement.f15775d) && androidx.compose.ui.unit.z.j(this.f15776e, alignmentLineOffsetTextUnitElement.f15776e);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (((this.f15774c.hashCode() * 31) + androidx.compose.ui.unit.z.o(this.f15775d)) * 31) + androidx.compose.ui.unit.z.o(this.f15776e);
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        this.f15777f.invoke(t2Var);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public e a() {
        return new e(this.f15774c, this.f15775d, this.f15776e, null);
    }

    public final long m() {
        return this.f15776e;
    }

    @NotNull
    public final androidx.compose.ui.layout.a n() {
        return this.f15774c;
    }

    public final long o() {
        return this.f15775d;
    }

    @NotNull
    public final Function1<androidx.compose.ui.platform.t2, Unit> p() {
        return this.f15777f;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull e eVar) {
        eVar.z9(this.f15774c);
        eVar.A9(this.f15775d);
        eVar.y9(this.f15776e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AlignmentLineOffsetTextUnitElement(androidx.compose.ui.layout.a aVar, long j10, long j11, Function1<? super androidx.compose.ui.platform.t2, Unit> function1) {
        this.f15774c = aVar;
        this.f15775d = j10;
        this.f15776e = j11;
        this.f15777f = function1;
    }
}
