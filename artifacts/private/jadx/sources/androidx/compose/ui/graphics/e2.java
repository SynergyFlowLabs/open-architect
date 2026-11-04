package androidx.compose.ui.graphics;

import android.graphics.RenderEffect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.o2
public final class e2 extends e3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final e3 f37757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f37758c;

    public /* synthetic */ e2(e3 e3Var, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(e3Var, j10);
    }

    @Override // androidx.compose.ui.graphics.e3
    @androidx.annotation.w0(31)
    @NotNull
    protected RenderEffect b() {
        return k3.f37833a.b(this.f37757b, this.f37758c);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2)) {
            return false;
        }
        e2 e2Var = (e2) obj;
        return Intrinsics.areEqual(this.f37757b, e2Var.f37757b) && n0.g.l(this.f37758c, e2Var.f37758c);
    }

    public int hashCode() {
        e3 e3Var = this.f37757b;
        return ((e3Var != null ? e3Var.hashCode() : 0) * 31) + n0.g.t(this.f37758c);
    }

    @NotNull
    public String toString() {
        return "OffsetEffect(renderEffect=" + this.f37757b + ", offset=" + ((Object) n0.g.z(this.f37758c)) + ')';
    }

    private e2(e3 e3Var, long j10) {
        super(null);
        this.f37757b = e3Var;
        this.f37758c = j10;
    }
}
