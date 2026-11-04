package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
public class x1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f38684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f38685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final T f38686c;

    public x1(float f10, float f11, @Nullable T t10) {
        this.f38684a = f10;
        this.f38685b = f11;
        this.f38686c = t10;
    }

    public final boolean a(float f10) {
        return f10 <= this.f38685b && this.f38684a <= f10;
    }

    @Nullable
    public final T b() {
        return this.f38686c;
    }

    public final float c() {
        return this.f38685b;
    }

    public final float d() {
        return this.f38684a;
    }

    public final boolean e(float f10, float f11) {
        return this.f38684a <= f11 && this.f38685b >= f10;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            x1 x1Var = (x1) obj;
            if (this.f38684a == x1Var.f38684a && this.f38685b == x1Var.f38685b && Intrinsics.areEqual(this.f38686c, x1Var.f38686c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean f(@NotNull x1<T> x1Var) {
        return this.f38684a <= x1Var.f38685b && this.f38685b >= x1Var.f38684a;
    }

    public int hashCode() {
        int iHashCode = ((Float.hashCode(this.f38684a) * 31) + Float.hashCode(this.f38685b)) * 31;
        T t10 = this.f38686c;
        return iHashCode + (t10 != null ? t10.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Interval(start=" + this.f38684a + ", end=" + this.f38685b + ", data=" + this.f38686c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ x1(float f10, float f11, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 4) != 0) {
            obj = null;
            int i11 = 7 << 0;
        }
        this(f10, f11, obj);
    }
}
