package androidx.compose.material3;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class z1 implements y1, a2, c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final b2 f34889a;

    public z1(@NotNull b2 b2Var) {
        this.f34889a = b2Var;
    }

    @Override // androidx.compose.material3.c0
    @NotNull
    public List<b0> a() {
        return this.f34889a.a();
    }

    @Override // androidx.compose.material3.c0
    public int b() {
        return this.f34889a.b();
    }

    @Override // androidx.compose.material3.a2
    public void d(boolean z10, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @NotNull String str, boolean z11) {
        this.f34889a.d(z10, function1, function2, str, z11);
    }

    @Override // androidx.compose.material3.a2
    public void e(@NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @NotNull pj.n<? super p1, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
        this.f34889a.e(function2, nVar);
    }

    @Override // androidx.compose.material3.a2
    public void g(@NotNull Function0<Unit> function0, @NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @NotNull String str, boolean z10) {
        this.f34889a.g(function0, function2, str, z10);
    }

    @NotNull
    public final b2 h() {
        return this.f34889a;
    }
}
