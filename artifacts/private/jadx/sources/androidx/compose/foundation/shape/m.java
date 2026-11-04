package androidx.compose.foundation.shape;

import androidx.compose.ui.platform.q2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class m implements f, q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f18745a;

    public m(float f10) {
        this.f18745a = f10;
    }

    private final float c() {
        return this.f18745a;
    }

    public static /* synthetic */ m j(m mVar, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = mVar.f18745a;
        }
        return mVar.i(f10);
    }

    @Override // androidx.compose.foundation.shape.f
    public float a(long j10, @NotNull androidx.compose.ui.unit.d dVar) {
        return this.f18745a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Float.compare(this.f18745a, ((m) obj).f18745a) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f18745a);
    }

    @NotNull
    public final m i(float f10) {
        return new m(f10);
    }

    @Override // androidx.compose.ui.platform.q2
    @NotNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public String b() {
        return this.f18745a + "px";
    }

    @NotNull
    public String toString() {
        return "CornerSize(size = " + this.f18745a + ".px)";
    }
}
