package androidx.compose.foundation.text.modifiers;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.k2;
import androidx.compose.ui.layout.g0;
import androidx.compose.ui.text.p3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f20656c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f20657d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final q f20658e = new q(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final g0 f20659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final p3 f20660b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final q a() {
            return q.f20658e;
        }

        private a() {
        }
    }

    public q(@Nullable g0 g0Var, @Nullable p3 p3Var) {
        this.f20659a = g0Var;
        this.f20660b = p3Var;
    }

    public static /* synthetic */ q c(q qVar, g0 g0Var, p3 p3Var, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i10 & 1) != 0) {
            g0Var = qVar.f20659a;
        }
        if ((i10 & 2) != 0) {
            p3Var = qVar.f20660b;
        }
        return qVar.b(g0Var, p3Var);
    }

    @NotNull
    public final q b(@Nullable g0 g0Var, @Nullable p3 p3Var) {
        return new q(g0Var, p3Var);
    }

    @Nullable
    public final g0 d() {
        return this.f20659a;
    }

    @Nullable
    public k2 e(int i10, int i11) {
        p3 p3Var = this.f20660b;
        if (p3Var != null) {
            return p3Var.A(i10, i11);
        }
        return null;
    }

    public boolean f() {
        p3 p3Var = this.f20660b;
        return (p3Var == null || androidx.compose.ui.text.style.v.i(p3Var.l().h(), androidx.compose.ui.text.style.v.f42256b.i()) || !p3Var.i()) ? false : true;
    }

    @Nullable
    public final p3 g() {
        return this.f20660b;
    }
}
