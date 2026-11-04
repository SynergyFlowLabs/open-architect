package androidx.compose.animation;

import androidx.compose.animation.core.l3;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.n3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class m implements l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f13670c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private l3<z> f13671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n3<androidx.compose.ui.unit.u> f13672b = d7.g(androidx.compose.ui.unit.u.b(androidx.compose.ui.unit.u.f42720b.a()), null, 2, null);

    public m(@NotNull l3<z> l3Var) {
        this.f13671a = l3Var;
    }

    @NotNull
    public final n3<androidx.compose.ui.unit.u> a() {
        return this.f13672b;
    }

    @Override // androidx.compose.animation.l
    @NotNull
    public l3<z> b() {
        return this.f13671a;
    }

    public void f(@NotNull l3<z> l3Var) {
        this.f13671a = l3Var;
    }
}
