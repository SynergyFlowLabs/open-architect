package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAlignmentLine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineOffsetDpElement\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/layout/internal/InlineClassHelperKt\n*L\n1#1,364:1\n102#2:365\n102#2:366\n93#3,4:367\n*S KotlinDebug\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineOffsetDpElement\n*L\n196#1:365\n197#1:366\n195#1:367,4\n*E\n"})
final class AlignmentLineOffsetDpElement extends androidx.compose.ui.node.e1<d> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.layout.a f15770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f15771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f15772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Function1<androidx.compose.ui.platform.t2, Unit> f15773f;

    public /* synthetic */ AlignmentLineOffsetDpElement(androidx.compose.ui.layout.a aVar, float f10, float f11, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, f10, f11, function1);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        AlignmentLineOffsetDpElement alignmentLineOffsetDpElement = obj instanceof AlignmentLineOffsetDpElement ? (AlignmentLineOffsetDpElement) obj : null;
        return alignmentLineOffsetDpElement != null && Intrinsics.areEqual(this.f15770c, alignmentLineOffsetDpElement.f15770c) && androidx.compose.ui.unit.h.x(this.f15771d, alignmentLineOffsetDpElement.f15771d) && androidx.compose.ui.unit.h.x(this.f15772e, alignmentLineOffsetDpElement.f15772e);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (((this.f15770c.hashCode() * 31) + androidx.compose.ui.unit.h.D(this.f15771d)) * 31) + androidx.compose.ui.unit.h.D(this.f15772e);
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        this.f15773f.invoke(t2Var);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public d a() {
        return new d(this.f15770c, this.f15771d, this.f15772e, null);
    }

    public final float m() {
        return this.f15772e;
    }

    @NotNull
    public final androidx.compose.ui.layout.a n() {
        return this.f15770c;
    }

    public final float o() {
        return this.f15771d;
    }

    @NotNull
    public final Function1<androidx.compose.ui.platform.t2, Unit> p() {
        return this.f15773f;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull d dVar) {
        dVar.z9(this.f15770c);
        dVar.A9(this.f15771d);
        dVar.y9(this.f15772e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AlignmentLineOffsetDpElement(androidx.compose.ui.layout.a aVar, float f10, float f11, Function1<? super androidx.compose.ui.platform.t2, Unit> function1) {
        this.f15770c = aVar;
        this.f15771d = f10;
        this.f15772e = f11;
        this.f15773f = function1;
        boolean z10 = true;
        boolean z11 = f10 >= 0.0f || Float.isNaN(f10);
        if (f11 < 0.0f && !Float.isNaN(f11)) {
            z10 = false;
        }
        if (!(z11 & z10)) {
            x.a.f("Padding from alignment line must be a non-negative number");
        }
    }
}
