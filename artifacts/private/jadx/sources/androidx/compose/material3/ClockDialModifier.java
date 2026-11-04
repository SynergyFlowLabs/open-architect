package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class ClockDialModifier extends androidx.compose.ui.node.e1<g6> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f25897g = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final j f25898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f25899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f25900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.o<Float> f25901f;

    public /* synthetic */ ClockDialModifier(j jVar, boolean z10, int i10, androidx.compose.animation.core.o oVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, z10, i10, oVar);
    }

    private final j l() {
        return this.f25898c;
    }

    private final boolean m() {
        return this.f25899d;
    }

    private final int n() {
        return this.f25900e;
    }

    private final androidx.compose.animation.core.o<Float> o() {
        return this.f25901f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ClockDialModifier q(ClockDialModifier clockDialModifier, j jVar, boolean z10, int i10, androidx.compose.animation.core.o oVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            jVar = clockDialModifier.f25898c;
        }
        if ((i11 & 2) != 0) {
            z10 = clockDialModifier.f25899d;
        }
        if ((i11 & 4) != 0) {
            i10 = clockDialModifier.f25900e;
        }
        if ((i11 & 8) != 0) {
            oVar = clockDialModifier.f25901f;
        }
        return clockDialModifier.p(jVar, z10, i10, oVar);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClockDialModifier)) {
            return false;
        }
        ClockDialModifier clockDialModifier = (ClockDialModifier) obj;
        return Intrinsics.areEqual(this.f25898c, clockDialModifier.f25898c) && this.f25899d == clockDialModifier.f25899d && g80.f(this.f25900e, clockDialModifier.f25900e) && Intrinsics.areEqual(this.f25901f, clockDialModifier.f25901f);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (((((this.f25898c.hashCode() * 31) + Boolean.hashCode(this.f25899d)) * 31) + g80.h(this.f25900e)) * 31) + this.f25901f.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
    }

    @NotNull
    public final ClockDialModifier p(@NotNull j jVar, boolean z10, int i10, @NotNull androidx.compose.animation.core.o<Float> oVar) {
        return new ClockDialModifier(jVar, z10, i10, oVar, null);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public g6 a() {
        return new g6(this.f25898c, this.f25899d, this.f25900e, this.f25901f, null);
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull g6 g6Var) {
        g6Var.S9(this.f25898c, this.f25899d, this.f25900e, this.f25901f);
    }

    @NotNull
    public String toString() {
        return "ClockDialModifier(state=" + this.f25898c + ", autoSwitchToMinute=" + this.f25899d + ", selection=" + ((Object) g80.i(this.f25900e)) + ", animationSpec=" + this.f25901f + ')';
    }

    private ClockDialModifier(j jVar, boolean z10, int i10, androidx.compose.animation.core.o<Float> oVar) {
        this.f25898c = jVar;
        this.f25899d = z10;
        this.f25900e = i10;
        this.f25901f = oVar;
    }
}
