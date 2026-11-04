package androidx.compose.ui.unit;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nAndroidDensity.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDensity.android.kt\nandroidx/compose/ui/unit/DensityWithConverter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
final class g implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f42686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f42687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final f1.a f42688c;

    public g(float f10, float f11, @NotNull f1.a aVar) {
        this.f42686a = f10;
        this.f42687b = f11;
        this.f42688c = aVar;
    }

    public static /* synthetic */ g J(g gVar, float f10, float f11, f1.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = gVar.f42686a;
        }
        if ((i10 & 2) != 0) {
            f11 = gVar.f42687b;
        }
        if ((i10 & 4) != 0) {
            aVar = gVar.f42688c;
        }
        return gVar.I(f10, f11, aVar);
    }

    private final f1.a x() {
        return this.f42688c;
    }

    @NotNull
    public final g I(float f10, float f11, @NotNull f1.a aVar) {
        return new g(f10, f11, aVar);
    }

    public final float c() {
        return this.f42686a;
    }

    @Override // androidx.compose.ui.unit.n
    public long d0(float f10) {
        return a0.l(this.f42688c.a(f10));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Float.compare(this.f42686a, gVar.f42686a) == 0 && Float.compare(this.f42687b, gVar.f42687b) == 0 && Intrinsics.areEqual(this.f42688c, gVar.f42688c);
    }

    @Override // androidx.compose.ui.unit.d
    public float getDensity() {
        return this.f42686a;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f42686a) * 31) + Float.hashCode(this.f42687b)) * 31) + this.f42688c.hashCode();
    }

    @Override // androidx.compose.ui.unit.n
    public float m0() {
        return this.f42687b;
    }

    @NotNull
    public String toString() {
        return "DensityWithConverter(density=" + this.f42686a + ", fontScale=" + this.f42687b + ", converter=" + this.f42688c + ')';
    }

    public final float w() {
        return this.f42687b;
    }

    @Override // androidx.compose.ui.unit.n
    public float y(long j10) {
        if (b0.g(z.m(j10), b0.f42661b.b())) {
            return h.r(this.f42688c.b(z.n(j10)));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }
}
