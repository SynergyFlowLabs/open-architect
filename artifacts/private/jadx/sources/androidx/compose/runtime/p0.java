package androidx.compose.runtime;

import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f36298a = 0;

    public abstract void A(@NotNull l1 l1Var);

    public abstract void a(@NotNull l1 l1Var, @NotNull Function2<? super c0, ? super Integer, Unit> function2);

    @NotNull
    public abstract androidx.collection.c3<s4> b(@NotNull l1 l1Var, @NotNull t5 t5Var, @NotNull Function2<? super c0, ? super Integer, Unit> function2);

    public abstract void c(@NotNull i3 i3Var);

    public void d() {
    }

    public abstract boolean e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract long h();

    @Nullable
    public abstract o0 i();

    @NotNull
    public e4 j() {
        return q0.f36320a;
    }

    @NotNull
    public abstract CoroutineContext k();

    @Nullable
    public d1 l() {
        return null;
    }

    @NotNull
    public abstract CoroutineContext m();

    public abstract void n(@NotNull i3 i3Var);

    public abstract void o(@NotNull l1 l1Var);

    public abstract void p(@NotNull s4 s4Var);

    public abstract void q(@NotNull i3 i3Var, @NotNull h3 h3Var, @NotNull i<?> iVar);

    @Nullable
    public h3 r(@NotNull i3 i3Var) {
        return null;
    }

    @NotNull
    public abstract androidx.collection.c3<s4> s(@NotNull l1 l1Var, @NotNull t5 t5Var, @NotNull androidx.collection.c3<s4> c3Var);

    public void t(@NotNull Set<androidx.compose.runtime.tooling.f> set) {
    }

    public void u(@NotNull c0 c0Var) {
    }

    public abstract void v(@NotNull l1 l1Var);

    public abstract void w(@NotNull s4 s4Var);

    public abstract void x(@NotNull l1 l1Var);

    public void y() {
    }

    public void z(@NotNull c0 c0Var) {
    }
}
