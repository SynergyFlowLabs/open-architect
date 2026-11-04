package androidx.compose.ui.input.rotary;

import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class RotaryInputElement extends e1<c> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Function1<d, Boolean> f39181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Function1<d, Boolean> f39182d;

    /* JADX WARN: Multi-variable type inference failed */
    public RotaryInputElement(@Nullable Function1<? super d, Boolean> function1, @Nullable Function1<? super d, Boolean> function2) {
        this.f39181c = function1;
        this.f39182d = function2;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        RotaryInputElement rotaryInputElement = (RotaryInputElement) obj;
        return this.f39181c == rotaryInputElement.f39181c && this.f39182d == rotaryInputElement.f39182d;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        Function1<d, Boolean> function1 = this.f39181c;
        int iHashCode = (function1 != null ? function1.hashCode() : 0) * 31;
        Function1<d, Boolean> function2 = this.f39182d;
        return iHashCode + (function2 != null ? function2.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        Function1<d, Boolean> function1 = this.f39181c;
        if (function1 != null) {
            t2Var.d("onRotaryScrollEvent");
            t2Var.b().c("onRotaryScrollEvent", function1);
        }
        Function1<d, Boolean> function2 = this.f39182d;
        if (function2 != null) {
            t2Var.d("onPreRotaryScrollEvent");
            t2Var.b().c("onPreRotaryScrollEvent", function2);
        }
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public c a() {
        return new c(this.f39181c, this.f39182d);
    }

    @Nullable
    public final Function1<d, Boolean> m() {
        return this.f39182d;
    }

    @Nullable
    public final Function1<d, Boolean> n() {
        return this.f39181c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull c cVar) {
        cVar.x9(this.f39181c);
        cVar.y9(this.f39182d);
    }
}
