package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.drawscope.f;
import androidx.compose.ui.graphics.i0;
import androidx.compose.ui.graphics.r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class BrushPainter extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final i0 f38110g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f38111h = 1.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private r0 f38112i;

    public BrushPainter(@NotNull i0 i0Var) {
        this.f38110g = i0Var;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    protected boolean a(float f10) {
        this.f38111h = f10;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    protected boolean b(@Nullable r0 r0Var) {
        this.f38112i = r0Var;
        return true;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BrushPainter) && Intrinsics.areEqual(this.f38110g, ((BrushPainter) obj).f38110g);
    }

    public int hashCode() {
        return this.f38110g.hashCode();
    }

    @Override // androidx.compose.ui.graphics.painter.b
    public long l() {
        return this.f38110g.b();
    }

    @Override // androidx.compose.ui.graphics.painter.b
    protected void n(@NotNull f fVar) {
        f.b3(fVar, this.f38110g, 0L, 0L, this.f38111h, null, this.f38112i, 0, 86, null);
    }

    @NotNull
    public final i0 o() {
        return this.f38110g;
    }

    @NotNull
    public String toString() {
        return "BrushPainter(brush=" + this.f38110g + ')';
    }
}
