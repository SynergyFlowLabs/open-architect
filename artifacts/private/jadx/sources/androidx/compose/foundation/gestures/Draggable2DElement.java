package androidx.compose.foundation.gestures;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class Draggable2DElement extends androidx.compose.ui.node.e1<r2> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f14275k = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final s2 f14277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f14278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final androidx.compose.foundation.interaction.j f14279e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f14280f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Function1<n0.g, Unit> f14281g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final Function1<androidx.compose.ui.unit.c0, Unit> f14282h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f14283i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final a f14274j = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final Function1<androidx.compose.ui.input.pointer.c0, Boolean> f14276l = new Function1() { // from class: androidx.compose.foundation.gestures.l2
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Boolean.valueOf(Draggable2DElement.m((androidx.compose.ui.input.pointer.c0) obj));
        }
    };

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Function1<androidx.compose.ui.input.pointer.c0, Boolean> a() {
            return Draggable2DElement.f14276l;
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Draggable2DElement(@NotNull s2 s2Var, boolean z10, @Nullable androidx.compose.foundation.interaction.j jVar, boolean z11, @NotNull Function1<? super n0.g, Unit> function1, @NotNull Function1<? super androidx.compose.ui.unit.c0, Unit> function2, boolean z12) {
        this.f14277c = s2Var;
        this.f14278d = z10;
        this.f14279e = jVar;
        this.f14280f = z11;
        this.f14281g = function1;
        this.f14282h = function2;
        this.f14283i = z12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(androidx.compose.ui.input.pointer.c0 c0Var) {
        return true;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Draggable2DElement.class != obj.getClass()) {
            return false;
        }
        Draggable2DElement draggable2DElement = (Draggable2DElement) obj;
        return Intrinsics.areEqual(this.f14277c, draggable2DElement.f14277c) && this.f14278d == draggable2DElement.f14278d && Intrinsics.areEqual(this.f14279e, draggable2DElement.f14279e) && this.f14280f == draggable2DElement.f14280f && this.f14281g == draggable2DElement.f14281g && this.f14282h == draggable2DElement.f14282h && this.f14283i == draggable2DElement.f14283i;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        int iHashCode = ((this.f14277c.hashCode() * 31) + Boolean.hashCode(this.f14278d)) * 31;
        androidx.compose.foundation.interaction.j jVar = this.f14279e;
        return ((((((((iHashCode + (jVar != null ? jVar.hashCode() : 0)) * 31) + Boolean.hashCode(this.f14280f)) * 31) + this.f14281g.hashCode()) * 31) + this.f14282h.hashCode()) * 31) + Boolean.hashCode(this.f14283i);
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("draggable2D");
        t2Var.b().c("enabled", Boolean.valueOf(this.f14278d));
        t2Var.b().c("interactionSource", this.f14279e);
        t2Var.b().c("startDragImmediately", Boolean.valueOf(this.f14280f));
        t2Var.b().c("onDragStarted", this.f14281g);
        t2Var.b().c("onDragStopped", this.f14282h);
        t2Var.b().c("reverseDirection", Boolean.valueOf(this.f14283i));
        t2Var.b().c("state", this.f14277c);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public r2 a() {
        return new r2(this.f14277c, f14276l, this.f14278d, this.f14279e, this.f14280f, this.f14283i, this.f14281g, this.f14282h);
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull r2 r2Var) {
        r2Var.ja(this.f14277c, f14276l, this.f14278d, this.f14279e, this.f14280f, this.f14283i, this.f14281g, this.f14282h);
    }
}
