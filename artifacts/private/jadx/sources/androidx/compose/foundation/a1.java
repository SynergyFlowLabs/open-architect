package androidx.compose.foundation;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
public final class a1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f13907c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f13908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.graphics.i0 f13909b;

    public /* synthetic */ a1(float f10, androidx.compose.ui.graphics.i0 i0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, i0Var);
    }

    public static /* synthetic */ a1 b(a1 a1Var, float f10, androidx.compose.ui.graphics.i0 i0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = a1Var.f13908a;
        }
        if ((i10 & 2) != 0) {
            i0Var = a1Var.f13909b;
        }
        return a1Var.a(f10, i0Var);
    }

    @NotNull
    public final a1 a(float f10, @NotNull androidx.compose.ui.graphics.i0 i0Var) {
        return new a1(f10, i0Var, null);
    }

    @NotNull
    public final androidx.compose.ui.graphics.i0 c() {
        return this.f13909b;
    }

    public final float d() {
        return this.f13908a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        if (androidx.compose.ui.unit.h.x(this.f13908a, a1Var.f13908a) && Intrinsics.areEqual(this.f13909b, a1Var.f13909b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (androidx.compose.ui.unit.h.D(this.f13908a) * 31) + this.f13909b.hashCode();
    }

    @NotNull
    public String toString() {
        return "BorderStroke(width=" + ((Object) androidx.compose.ui.unit.h.M(this.f13908a)) + ", brush=" + this.f13909b + ')';
    }

    private a1(float f10, androidx.compose.ui.graphics.i0 i0Var) {
        this.f13908a = f10;
        this.f13909b = i0Var;
    }
}
