package androidx.compose.ui.text;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class n3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f41998d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final androidx.collection.d1<r, p3> f41999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private r f42000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private p3 f42001c;

    public n3() {
        this(0, 1, null);
    }

    @Nullable
    public final p3 a(@NotNull o3 o3Var) {
        p3 p3VarF;
        r rVar = new r(o3Var);
        androidx.collection.d1<r, p3> d1Var = this.f41999a;
        if (d1Var != null) {
            p3VarF = d1Var.f(rVar);
        } else {
            if (!Intrinsics.areEqual(this.f42000b, rVar)) {
                return null;
            }
            p3VarF = this.f42001c;
        }
        if (p3VarF == null || p3VarF.x().m().a()) {
            return null;
        }
        return p3VarF;
    }

    public final void b(@NotNull o3 o3Var, @NotNull p3 p3Var) {
        androidx.collection.d1<r, p3> d1Var = this.f41999a;
        if (d1Var != null) {
            d1Var.j(new r(o3Var), p3Var);
        } else {
            this.f42000b = new r(o3Var);
            this.f42001c = p3Var;
        }
    }

    public n3(int i10) {
        this.f41999a = i10 != 1 ? new androidx.collection.d1<>(i10) : null;
    }

    public /* synthetic */ n3(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 8 : i10);
    }
}
