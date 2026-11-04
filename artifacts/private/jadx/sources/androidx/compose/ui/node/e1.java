package androidx.compose.ui.node;

import androidx.compose.ui.a0.d;
import androidx.compose.ui.platform.i4;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 2)
@SourceDebugExtension({"SMAP\nModifierNodeElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierNodeElement.kt\nandroidx/compose/ui/node/ModifierNodeElement\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n1#2:107\n*E\n"})
public abstract class e1<N extends androidx.compose.ui.a0.d> implements androidx.compose.ui.a0.c, androidx.compose.ui.platform.q2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f39734b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.platform.t2 f39735a;

    private final androidx.compose.ui.platform.t2 i() {
        androidx.compose.ui.platform.t2 t2Var = this.f39735a;
        if (t2Var != null) {
            return t2Var;
        }
        androidx.compose.ui.platform.t2 t2Var2 = new androidx.compose.ui.platform.t2();
        t2Var2.d(kotlin.jvm.internal.j1.d(getClass()).Q());
        j(t2Var2);
        this.f39735a = t2Var2;
        return t2Var2;
    }

    @NotNull
    public abstract N a();

    @Override // androidx.compose.ui.platform.q2
    @Nullable
    public final Object b() {
        return i().c();
    }

    public abstract boolean equals(@Nullable Object obj);

    @Override // androidx.compose.ui.platform.q2
    @NotNull
    public final Sequence<i4> f() {
        return i().b();
    }

    @Override // androidx.compose.ui.platform.q2
    @Nullable
    public final String h() {
        return i().a();
    }

    public abstract int hashCode();

    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        androidx.compose.ui.d.c(t2Var, this);
    }

    public abstract void k(@NotNull N n10);
}
