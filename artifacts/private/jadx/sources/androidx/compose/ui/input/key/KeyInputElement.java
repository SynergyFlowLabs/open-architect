package androidx.compose.ui.input.key;

import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class KeyInputElement extends e1<h> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Function1<c, Boolean> f38750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Function1<c, Boolean> f38751d;

    /* JADX WARN: Multi-variable type inference failed */
    public KeyInputElement(@Nullable Function1<? super c, Boolean> function1, @Nullable Function1<? super c, Boolean> function2) {
        this.f38750c = function1;
        this.f38751d = function2;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return this.f38750c == keyInputElement.f38750c && this.f38751d == keyInputElement.f38751d;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        Function1<c, Boolean> function1 = this.f38750c;
        int iHashCode = (function1 != null ? function1.hashCode() : 0) * 31;
        Function1<c, Boolean> function2 = this.f38751d;
        return iHashCode + (function2 != null ? function2.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        Function1<c, Boolean> function1 = this.f38750c;
        if (function1 != null) {
            t2Var.d("onKeyEvent");
            t2Var.b().c("onKeyEvent", function1);
        }
        Function1<c, Boolean> function2 = this.f38751d;
        if (function2 != null) {
            t2Var.d("onPreviewKeyEvent");
            t2Var.b().c("onPreviewKeyEvent", function2);
        }
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public h a() {
        return new h(this.f38750c, this.f38751d);
    }

    @Nullable
    public final Function1<c, Boolean> m() {
        return this.f38750c;
    }

    @Nullable
    public final Function1<c, Boolean> n() {
        return this.f38751d;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull h hVar) {
        hVar.x9(this.f38750c);
        hVar.y9(this.f38751d);
    }
}
