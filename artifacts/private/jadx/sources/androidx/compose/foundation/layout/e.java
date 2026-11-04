package androidx.compose.foundation.layout;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAlignmentLine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineOffsetTextUnitNode\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n1#1,364:1\n252#2:365\n252#2:366\n*S KotlinDebug\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineOffsetTextUnitNode\n*L\n296#1:365\n297#1:366\n*E\n"})
final class e extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.g0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.layout.a f15974s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f15975t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f15976v;

    public /* synthetic */ e(androidx.compose.ui.layout.a aVar, long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, j10, j11);
    }

    public final void A9(long j10) {
        this.f15975t = j10;
    }

    @Override // androidx.compose.ui.node.g0
    @NotNull
    public androidx.compose.ui.layout.b1 c(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10) {
        return c.c(c1Var, this.f15974s, androidx.compose.ui.unit.z.l(this.f15975t) == 0 ? androidx.compose.ui.unit.h.f42689b.e() : c1Var.y(this.f15975t), androidx.compose.ui.unit.z.l(this.f15976v) == 0 ? androidx.compose.ui.unit.h.f42689b.e() : c1Var.y(this.f15976v), z0Var, j10);
    }

    public final long v9() {
        return this.f15976v;
    }

    @NotNull
    public final androidx.compose.ui.layout.a w9() {
        return this.f15974s;
    }

    public final long x9() {
        return this.f15975t;
    }

    public final void y9(long j10) {
        this.f15976v = j10;
    }

    public final void z9(@NotNull androidx.compose.ui.layout.a aVar) {
        this.f15974s = aVar;
    }

    private e(androidx.compose.ui.layout.a aVar, long j10, long j11) {
        this.f15974s = aVar;
        this.f15975t = j10;
        this.f15976v = j11;
    }
}
