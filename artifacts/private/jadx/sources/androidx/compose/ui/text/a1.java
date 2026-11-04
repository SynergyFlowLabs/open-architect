package androidx.compose.ui.text;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class a1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f41299c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final y0 f41300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final x0 f41301b;

    public /* synthetic */ a1(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    @Nullable
    public final x0 a() {
        return this.f41301b;
    }

    @Nullable
    public final y0 b() {
        return this.f41300a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        if (Intrinsics.areEqual(this.f41301b, a1Var.f41301b) && Intrinsics.areEqual(this.f41300a, a1Var.f41300a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        y0 y0Var = this.f41300a;
        int iHashCode = (y0Var != null ? y0Var.hashCode() : 0) * 31;
        x0 x0Var = this.f41301b;
        return iHashCode + (x0Var != null ? x0Var.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f41300a + ", paragraphSyle=" + this.f41301b + ')';
    }

    public a1(@Nullable y0 y0Var, @Nullable x0 x0Var) {
        this.f41300a = y0Var;
        this.f41301b = x0Var;
    }

    public /* synthetic */ a1(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10);
    }

    public a1(boolean z10) {
        this((y0) null, new x0(z10));
    }

    private a1(int i10) {
        this((y0) null, new x0(i10, (DefaultConstructorMarker) null));
    }
}
