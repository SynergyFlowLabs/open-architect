package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.drawscope.f;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class ColorPainter extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f38113g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f38114h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private r0 f38115i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f38116j;

    public /* synthetic */ ColorPainter(long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10);
    }

    @Override // androidx.compose.ui.graphics.painter.b
    protected boolean a(float f10) {
        this.f38114h = f10;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    protected boolean b(@Nullable r0 r0Var) {
        this.f38115i = r0Var;
        return true;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ColorPainter) && q0.y(this.f38113g, ((ColorPainter) obj).f38113g);
    }

    public int hashCode() {
        return q0.K(this.f38113g);
    }

    @Override // androidx.compose.ui.graphics.painter.b
    public long l() {
        return this.f38116j;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    protected void n(@NotNull f fVar) {
        f.V3(fVar, this.f38113g, 0L, 0L, this.f38114h, null, this.f38115i, 0, 86, null);
    }

    public final long o() {
        return this.f38113g;
    }

    @NotNull
    public String toString() {
        return "ColorPainter(color=" + ((Object) q0.L(this.f38113g)) + ')';
    }

    private ColorPainter(long j10) {
        this.f38113g = j10;
        this.f38114h = 1.0f;
        this.f38116j = n.f332724b.a();
    }
}
