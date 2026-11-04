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
@SourceDebugExtension({"SMAP\nDraggableAnchors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DraggableAnchors.kt\nandroidx/compose/material3/internal/DraggableAnchorsElementV2\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,159:1\n110#2:160\n*S KotlinDebug\n*F\n+ 1 DraggableAnchors.kt\nandroidx/compose/material3/internal/DraggableAnchorsElementV2\n*L\n94#1:160\n*E\n"})
final class DraggableAnchorsElementV2<T> extends androidx.compose.ui.node.e1<j2<T>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.gestures.b0<T> f28630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function2<androidx.compose.ui.unit.u, androidx.compose.ui.unit.b, Pair<androidx.compose.foundation.gestures.t2<T>, T>> f28631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.gestures.q3 f28632e;

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 DraggableAnchors.kt\nandroidx/compose/material3/internal/DraggableAnchorsElementV2\n*L\n1#1,110:1\n95#2,4:111\n*E\n"})
    public static final class a extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {
        public a() {
            super(1);
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.b().c("state", DraggableAnchorsElementV2.this.f28630c);
            t2Var.b().c("anchors", DraggableAnchorsElementV2.this.f28631d);
            t2Var.b().c(io.sentry.protocol.e.c.f306223k, DraggableAnchorsElementV2.this.f28632e);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DraggableAnchorsElementV2(@NotNull androidx.compose.foundation.gestures.b0<T> b0Var, @NotNull Function2<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.b, ? extends Pair<? extends androidx.compose.foundation.gestures.t2<T>, ? extends T>> function2, @NotNull androidx.compose.foundation.gestures.q3 q3Var) {
        this.f28630c = b0Var;
        this.f28631d = function2;
        this.f28632e = q3Var;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraggableAnchorsElementV2)) {
            return false;
        }
        DraggableAnchorsElementV2 draggableAnchorsElementV2 = (DraggableAnchorsElementV2) obj;
        return Intrinsics.areEqual(this.f28630c, draggableAnchorsElementV2.f28630c) && this.f28631d == draggableAnchorsElementV2.f28631d && this.f28632e == draggableAnchorsElementV2.f28632e;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (((this.f28630c.hashCode() * 31) + this.f28631d.hashCode()) * 31) + this.f28632e.hashCode();
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
    public j2<T> a() {
        return new j2<>(this.f28630c, this.f28631d, this.f28632e);
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull j2<T> j2Var) {
        j2Var.F9(this.f28630c);
        j2Var.D9(this.f28631d);
        j2Var.E9(this.f28632e);
    }
}
