package androidx.compose.material;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material/DraggableAnchorsElement\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,875:1\n110#2:876\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material/DraggableAnchorsElement\n*L\n827#1:876\n*E\n"})
final class DraggableAnchorsElement<T> extends androidx.compose.ui.node.e1<z5<T>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final u<T> f21929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function2<androidx.compose.ui.unit.u, androidx.compose.ui.unit.b, Pair<w5<T>, T>> f21930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.gestures.q3 f21931e;

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 AnchoredDraggable.kt\nandroidx/compose/material/DraggableAnchorsElement\n*L\n1#1,110:1\n828#2,4:111\n*E\n"})
    public static final class a extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {
        public a() {
            super(1);
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.b().c("state", DraggableAnchorsElement.this.f21929c);
            t2Var.b().c("anchors", DraggableAnchorsElement.this.f21930d);
            t2Var.b().c(io.sentry.protocol.e.c.f306223k, DraggableAnchorsElement.this.f21931e);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DraggableAnchorsElement(@NotNull u<T> uVar, @NotNull Function2<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.b, ? extends Pair<? extends w5<T>, ? extends T>> function2, @NotNull androidx.compose.foundation.gestures.q3 q3Var) {
        this.f21929c = uVar;
        this.f21930d = function2;
        this.f21931e = q3Var;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraggableAnchorsElement)) {
            return false;
        }
        DraggableAnchorsElement draggableAnchorsElement = (DraggableAnchorsElement) obj;
        return Intrinsics.areEqual(this.f21929c, draggableAnchorsElement.f21929c) && this.f21930d == draggableAnchorsElement.f21930d && this.f21931e == draggableAnchorsElement.f21931e;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (((this.f21929c.hashCode() * 31) + this.f21930d.hashCode()) * 31) + this.f21931e.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        if (androidx.compose.ui.platform.r2.e()) {
            new a();
        } else {
            androidx.compose.ui.platform.r2.b();
        }
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public z5<T> a() {
        return new z5<>(this.f21929c, this.f21930d, this.f21931e);
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull z5<T> z5Var) {
        z5Var.C9(this.f21929c);
        z5Var.A9(this.f21930d);
        z5Var.B9(this.f21931e);
    }
}
