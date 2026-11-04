package androidx.compose.ui.platform;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public abstract class u2 implements q2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f40901c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<t2, Unit> f40902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private t2 f40903b;

    /* JADX WARN: Multi-variable type inference failed */
    public u2(@NotNull Function1<? super t2, Unit> function1) {
        this.f40902a = function1;
    }

    private final t2 a() {
        t2 t2Var = this.f40903b;
        if (t2Var == null) {
            t2Var = new t2();
            this.f40902a.invoke(t2Var);
        }
        this.f40903b = t2Var;
        return t2Var;
    }

    @Override // androidx.compose.ui.platform.q2
    @Nullable
    public Object b() {
        return a().c();
    }

    @Override // androidx.compose.ui.platform.q2
    @NotNull
    public Sequence<i4> f() {
        return a().b();
    }

    @Override // androidx.compose.ui.platform.q2
    @Nullable
    public String h() {
        return a().a();
    }
}
