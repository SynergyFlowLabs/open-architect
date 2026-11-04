package androidx.compose.material3;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class b2 implements a2, c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f26177b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<b0> f26178a = new ArrayList();

    @Override // androidx.compose.material3.c0
    @NotNull
    public List<b0> a() {
        return this.f26178a;
    }

    @Override // androidx.compose.material3.c0
    public int b() {
        return a().size();
    }

    @Override // androidx.compose.material3.a2
    public void d(boolean z10, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @NotNull String str, boolean z11) {
        a().add(new p80(z10, function1, function2, z11, str));
    }

    @Override // androidx.compose.material3.a2
    public void e(@NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @NotNull pj.n<? super p1, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
        a().add(new f7(function2, nVar));
    }

    @Override // androidx.compose.material3.a2
    public void g(@NotNull Function0<Unit> function0, @NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @NotNull String str, boolean z10) {
        a().add(new d6(function0, function2, z10, str));
    }
}
