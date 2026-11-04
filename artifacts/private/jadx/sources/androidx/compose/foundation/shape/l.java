package androidx.compose.foundation.shape;

import androidx.annotation.x;
import androidx.compose.ui.platform.q2;
import d0.i1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class l implements f, q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f18744a;

    public l(@x(from = 0.0d, to = i1.f268246o) float f10) {
        this.f18744a = f10;
        if (f10 >= 0.0f && f10 <= 100.0f) {
            return;
        }
        androidx.compose.foundation.internal.e.g("The percent should be in the range of [0, 100]");
    }

    private final float c() {
        return this.f18744a;
    }

    public static /* synthetic */ l j(l lVar, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = lVar.f18744a;
        }
        return lVar.i(f10);
    }

    @Override // androidx.compose.foundation.shape.f
    public float a(long j10, @NotNull androidx.compose.ui.unit.d dVar) {
        return n0.n.q(j10) * (this.f18744a / 100.0f);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Float.compare(this.f18744a, ((l) obj).f18744a) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f18744a);
    }

    @NotNull
    public final l i(@x(from = 0.0d, to = i1.f268246o) float f10) {
        return new l(f10);
    }

    @Override // androidx.compose.ui.platform.q2
    @NotNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public String b() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f18744a);
        sb2.append('%');
        return sb2.toString();
    }

    @NotNull
    public String toString() {
        return "CornerSize(size = " + this.f18744a + "%)";
    }
}
