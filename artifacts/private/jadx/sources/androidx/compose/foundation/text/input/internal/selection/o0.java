package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.ui.text.w3;
import androidx.compose.ui.text.x3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f19996a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f19997b = "TextFieldSelectionState";

    public static final class a implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f19998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d0 f19999b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a1 f20000c;

        public a(Function0<Unit> function0, d0 d0Var, a1 a1Var) {
            this.f19998a = function0;
            this.f19999b = d0Var;
            this.f20000c = a1Var;
        }

        public final void c() {
            this.f19998a.invoke();
            this.f19999b.t1(this.f20000c);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            c();
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Function0<String> function0) {
    }

    @Nullable
    public static final Function0<Unit> d(@NotNull d0 d0Var, boolean z10, @NotNull a1 a1Var, @NotNull Function0<Unit> function0) {
        if (z10) {
            return new a(function0, d0Var, a1Var);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long e(long j10) {
        return x3.b(w3.i(j10), w3.n(j10));
    }
}
