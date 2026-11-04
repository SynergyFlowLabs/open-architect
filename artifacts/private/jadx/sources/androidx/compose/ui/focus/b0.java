package androidx.compose.ui.focus;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    static final class a implements f0, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f37389a;

        a(Function1 function1) {
            this.f37389a = function1;
        }

        @Override // androidx.compose.ui.focus.f0
        public final /* synthetic */ void a(z zVar) {
            this.f37389a.invoke(zVar);
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f37389a;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof f0) && (obj instanceof kotlin.jvm.internal.c0)) {
                return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function1<g, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<f, g0> f37390a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super f, g0> function1) {
            super(1);
            this.f37390a = function1;
        }

        public final void c(g gVar) {
            g0 g0VarInvoke = this.f37390a.invoke(f.i(gVar.c()));
            g0.a aVar = g0.f37418b;
            if (g0VarInvoke == aVar.b()) {
                gVar.a();
            } else if (g0VarInvoke != aVar.c()) {
                int i10 = 4 >> 0;
                g0.k(g0VarInvoke, 0, 1, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(g gVar) {
            c(gVar);
            return Unit.f312394a;
        }
    }

    @NotNull
    public static final androidx.compose.ui.a0 b(@NotNull androidx.compose.ui.a0 a0Var, @NotNull Function1<? super z, Unit> function1) {
        return a0Var.B2(new FocusPropertiesElement(new a(function1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<g, Unit> c(Function1<? super f, g0> function1) {
        return new b(function1);
    }
}
