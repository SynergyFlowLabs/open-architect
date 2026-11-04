package androidx.compose.material3.internal;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material3/internal/DraggableAnchorsElement\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,868:1\n110#2:869\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material3/internal/DraggableAnchorsElement\n*L\n814#1:869\n*E\n"})
final class DraggableAnchorsElement<T> extends androidx.compose.ui.node.e1<g2<T>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final d0<T> f28626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function2<androidx.compose.ui.unit.u, androidx.compose.ui.unit.b, Pair<b2<T>, T>> f28627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.gestures.q3 f28628e;

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 AnchoredDraggable.kt\nandroidx/compose/material3/internal/DraggableAnchorsElement\n*L\n1#1,110:1\n815#2,4:111\n*E\n"})
    public static final class a extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {
        public a() {
            super(1);
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.b().c("state", DraggableAnchorsElement.this.f28626c);
            t2Var.b().c("anchors", DraggableAnchorsElement.this.f28627d);
            t2Var.b().c(io.sentry.protocol.e.c.f306223k, DraggableAnchorsElement.this.f28628e);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DraggableAnchorsElement(@NotNull d0<T> d0Var, @NotNull Function2<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.b, ? extends Pair<? extends b2<T>, ? extends T>> function2, @NotNull androidx.compose.foundation.gestures.q3 q3Var) {
        this.f28626c = d0Var;
        this.f28627d = function2;
        this.f28628e = q3Var;
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
        return Intrinsics.areEqual(this.f28626c, draggableAnchorsElement.f28626c) && this.f28627d == draggableAnchorsElement.f28627d && this.f28628e == draggableAnchorsElement.f28628e;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (((this.f28626c.hashCode() * 31) + this.f28627d.hashCode()) * 31) + this.f28628e.hashCode();
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
    public g2<T> a() {
        return new g2<>(this.f28626c, this.f28627d, this.f28628e);
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull g2<T> g2Var) {
        g2Var.E9(this.f28626c);
        g2Var.C9(this.f28627d);
        g2Var.D9(this.f28628e);
    }
}
