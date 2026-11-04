package androidx.compose.ui.autofill;

import androidx.compose.ui.a0;
import androidx.compose.ui.semantics.b0;
import androidx.compose.ui.semantics.e0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    static final class a extends l0 implements Function1<e0, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u f36987a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(u uVar) {
            super(1);
            this.f36987a = uVar;
        }

        public final void c(e0 e0Var) {
            b0.w1(e0Var, this.f36987a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(e0 e0Var) {
            c(e0Var);
            return Unit.f312394a;
        }
    }

    @NotNull
    public static final a0 a(@NotNull a0 a0Var, @NotNull u uVar) {
        return androidx.compose.ui.semantics.t.f(a0Var, false, new a(uVar), 1, null);
    }
}
