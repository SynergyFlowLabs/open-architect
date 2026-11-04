package androidx.compose.foundation.gestures;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class DraggableElement extends androidx.compose.ui.node.e1<z2> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f14285l = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final a3 f14287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final q3 f14288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f14289e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final androidx.compose.foundation.interaction.j f14290f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f14291g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final pj.n<kotlinx.coroutines.s0, n0.g, kotlin.coroutines.d<? super Unit>, Object> f14292h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final pj.n<kotlinx.coroutines.s0, Float, kotlin.coroutines.d<? super Unit>, Object> f14293i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f14294j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final a f14284k = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static final Function1<androidx.compose.ui.input.pointer.c0, Boolean> f14286m = new Function1() { // from class: androidx.compose.foundation.gestures.v2
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Boolean.valueOf(DraggableElement.m((androidx.compose.ui.input.pointer.c0) obj));
        }
    };

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Function1<androidx.compose.ui.input.pointer.c0, Boolean> a() {
            return DraggableElement.f14286m;
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DraggableElement(@NotNull a3 a3Var, @NotNull q3 q3Var, boolean z10, @Nullable androidx.compose.foundation.interaction.j jVar, boolean z11, @NotNull pj.n<? super kotlinx.coroutines.s0, ? super n0.g, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, @NotNull pj.n<? super kotlinx.coroutines.s0, ? super Float, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar2, boolean z12) {
        this.f14287c = a3Var;
        this.f14288d = q3Var;
        this.f14289e = z10;
        this.f14290f = jVar;
        this.f14291g = z11;
        this.f14292h = nVar;
        this.f14293i = nVar2;
        this.f14294j = z12;
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
        if (obj == null || DraggableElement.class != obj.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) obj;
        return Intrinsics.areEqual(this.f14287c, draggableElement.f14287c) && this.f14288d == draggableElement.f14288d && this.f14289e == draggableElement.f14289e && Intrinsics.areEqual(this.f14290f, draggableElement.f14290f) && this.f14291g == draggableElement.f14291g && Intrinsics.areEqual(this.f14292h, draggableElement.f14292h) && Intrinsics.areEqual(this.f14293i, draggableElement.f14293i) && this.f14294j == draggableElement.f14294j;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        int iHashCode = ((((this.f14287c.hashCode() * 31) + this.f14288d.hashCode()) * 31) + Boolean.hashCode(this.f14289e)) * 31;
        androidx.compose.foundation.interaction.j jVar = this.f14290f;
        return ((((((((iHashCode + (jVar != null ? jVar.hashCode() : 0)) * 31) + Boolean.hashCode(this.f14291g)) * 31) + this.f14292h.hashCode()) * 31) + this.f14293i.hashCode()) * 31) + Boolean.hashCode(this.f14294j);
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("draggable");
        t2Var.b().c(io.sentry.protocol.e.c.f306223k, this.f14288d);
        t2Var.b().c("enabled", Boolean.valueOf(this.f14289e));
        t2Var.b().c("reverseDirection", Boolean.valueOf(this.f14294j));
        t2Var.b().c("interactionSource", this.f14290f);
        t2Var.b().c("startDragImmediately", Boolean.valueOf(this.f14291g));
        t2Var.b().c("onDragStarted", this.f14292h);
        t2Var.b().c("onDragStopped", this.f14293i);
        t2Var.b().c("state", this.f14287c);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public z2 a() {
        return new z2(this.f14287c, f14286m, this.f14288d, this.f14289e, this.f14290f, this.f14291g, this.f14292h, this.f14293i, this.f14294j);
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull z2 z2Var) {
        z2Var.oa(this.f14287c, f14286m, this.f14288d, this.f14289e, this.f14290f, this.f14291g, this.f14292h, this.f14293i, this.f14294j);
    }
}
