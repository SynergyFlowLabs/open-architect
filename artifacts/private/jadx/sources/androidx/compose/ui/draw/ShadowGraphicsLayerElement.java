package androidx.compose.ui.draw;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.g0;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.q3;
import androidx.compose.ui.graphics.r1;
import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
public final class ShadowGraphicsLayerElement extends e1<g0> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f37235h = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f37236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final q3 f37237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f37238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f37239f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f37240g;

    static final class a extends l0 implements Function1<r1, Unit> {
        a() {
            super(1);
        }

        public final void c(r1 r1Var) {
            r1Var.Q(r1Var.S7(ShadowGraphicsLayerElement.this.w()));
            r1Var.Q3(ShadowGraphicsLayerElement.this.y());
            r1Var.O(ShadowGraphicsLayerElement.this.v());
            r1Var.h0(ShadowGraphicsLayerElement.this.u());
            r1Var.j0(ShadowGraphicsLayerElement.this.z());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1 r1Var) {
            c(r1Var);
            return Unit.f312394a;
        }
    }

    public /* synthetic */ ShadowGraphicsLayerElement(float f10, q3 q3Var, boolean z10, long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, q3Var, z10, j10, j11);
    }

    public static /* synthetic */ ShadowGraphicsLayerElement r(ShadowGraphicsLayerElement shadowGraphicsLayerElement, float f10, q3 q3Var, boolean z10, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = shadowGraphicsLayerElement.f37236c;
        }
        if ((i10 & 2) != 0) {
            q3Var = shadowGraphicsLayerElement.f37237d;
        }
        if ((i10 & 4) != 0) {
            z10 = shadowGraphicsLayerElement.f37238e;
        }
        if ((i10 & 8) != 0) {
            j10 = shadowGraphicsLayerElement.f37239f;
        }
        if ((i10 & 16) != 0) {
            j11 = shadowGraphicsLayerElement.f37240g;
        }
        long j12 = j11;
        boolean z11 = z10;
        return shadowGraphicsLayerElement.q(f10, q3Var, z11, j10, j12);
    }

    private final Function1<r1, Unit> t() {
        return new a();
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull g0 g0Var) {
        g0Var.x9(t());
        g0Var.w9();
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        return androidx.compose.ui.unit.h.x(this.f37236c, shadowGraphicsLayerElement.f37236c) && Intrinsics.areEqual(this.f37237d, shadowGraphicsLayerElement.f37237d) && this.f37238e == shadowGraphicsLayerElement.f37238e && q0.y(this.f37239f, shadowGraphicsLayerElement.f37239f) && q0.y(this.f37240g, shadowGraphicsLayerElement.f37240g);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (((((((androidx.compose.ui.unit.h.D(this.f37236c) * 31) + this.f37237d.hashCode()) * 31) + Boolean.hashCode(this.f37238e)) * 31) + q0.K(this.f37239f)) * 31) + q0.K(this.f37240g);
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("shadow");
        t2Var.b().c("elevation", androidx.compose.ui.unit.h.o(this.f37236c));
        t2Var.b().c("shape", this.f37237d);
        t2Var.b().c("clip", Boolean.valueOf(this.f37238e));
        t2Var.b().c(com.badlogic.gdx.graphics.g3d.attributes.b.f94309i, q0.n(this.f37239f));
        t2Var.b().c("spotColor", q0.n(this.f37240g));
    }

    public final float l() {
        return this.f37236c;
    }

    @NotNull
    public final q3 m() {
        return this.f37237d;
    }

    public final boolean n() {
        return this.f37238e;
    }

    public final long o() {
        return this.f37239f;
    }

    public final long p() {
        return this.f37240g;
    }

    @NotNull
    public final ShadowGraphicsLayerElement q(float f10, @NotNull q3 q3Var, boolean z10, long j10, long j11) {
        return new ShadowGraphicsLayerElement(f10, q3Var, z10, j10, j11, null);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public g0 a() {
        return new g0(t());
    }

    @NotNull
    public String toString() {
        return "ShadowGraphicsLayerElement(elevation=" + ((Object) androidx.compose.ui.unit.h.M(this.f37236c)) + ", shape=" + this.f37237d + ", clip=" + this.f37238e + ", ambientColor=" + ((Object) q0.L(this.f37239f)) + ", spotColor=" + ((Object) q0.L(this.f37240g)) + ')';
    }

    public final long u() {
        return this.f37239f;
    }

    public final boolean v() {
        return this.f37238e;
    }

    public final float w() {
        return this.f37236c;
    }

    @NotNull
    public final q3 y() {
        return this.f37237d;
    }

    public final long z() {
        return this.f37240g;
    }

    private ShadowGraphicsLayerElement(float f10, q3 q3Var, boolean z10, long j10, long j11) {
        this.f37236c = f10;
        this.f37237d = q3Var;
        this.f37238e = z10;
        this.f37239f = j10;
        this.f37240g = j11;
    }
}
