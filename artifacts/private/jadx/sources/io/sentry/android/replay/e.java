package io.sentry.android.replay;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    static final class a extends l0 implements Function1<androidx.compose.ui.semantics.e0, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f304900a = new a();

        a() {
            super(1);
        }

        public final void c(androidx.compose.ui.semantics.e0 semantics) {
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            semantics.c(x.f305111a.a(), "mask");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.semantics.e0 e0Var) {
            c(e0Var);
            return Unit.f312394a;
        }
    }

    static final class b extends l0 implements Function1<androidx.compose.ui.semantics.e0, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f304901a = new b();

        b() {
            super(1);
        }

        public final void c(androidx.compose.ui.semantics.e0 semantics) {
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            semantics.c(x.f305111a.a(), "unmask");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.semantics.e0 e0Var) {
            c(e0Var);
            return Unit.f312394a;
        }
    }

    @NotNull
    public static final androidx.compose.ui.a0 a(@NotNull androidx.compose.ui.a0 a0Var) {
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        return androidx.compose.ui.semantics.t.f(a0Var, false, a.f304900a, 1, null);
    }

    @NotNull
    public static final androidx.compose.ui.a0 b(@NotNull androidx.compose.ui.a0 a0Var) {
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        return androidx.compose.ui.semantics.t.f(a0Var, false, b.f304901a, 1, null);
    }
}
