package androidx.compose.ui.input.key;

import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class SoftKeyboardInterceptionElement extends e1<a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Function1<c, Boolean> f38752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Function1<c, Boolean> f38753d;

    /* JADX WARN: Multi-variable type inference failed */
    public SoftKeyboardInterceptionElement(@Nullable Function1<? super c, Boolean> function1, @Nullable Function1<? super c, Boolean> function2) {
        this.f38752c = function1;
        this.f38753d = function2;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SoftKeyboardInterceptionElement)) {
            return false;
        }
        SoftKeyboardInterceptionElement softKeyboardInterceptionElement = (SoftKeyboardInterceptionElement) obj;
        return this.f38752c == softKeyboardInterceptionElement.f38752c && this.f38753d == softKeyboardInterceptionElement.f38753d;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        Function1<c, Boolean> function1 = this.f38752c;
        int iHashCode = (function1 != null ? function1.hashCode() : 0) * 31;
        Function1<c, Boolean> function2 = this.f38753d;
        return iHashCode + (function2 != null ? function2.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        Function1<c, Boolean> function1 = this.f38752c;
        if (function1 != null) {
            t2Var.d("onKeyToSoftKeyboardInterceptedEvent");
            t2Var.b().c("onKeyToSoftKeyboardInterceptedEvent", function1);
        }
        Function1<c, Boolean> function2 = this.f38753d;
        if (function2 != null) {
            t2Var.d("onPreKeyToSoftKeyboardInterceptedEvent");
            t2Var.b().c("onPreKeyToSoftKeyboardInterceptedEvent", function2);
        }
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public a a() {
        return new a(this.f38752c, this.f38753d);
    }

    @Nullable
    public final Function1<c, Boolean> m() {
        return this.f38752c;
    }

    @Nullable
    public final Function1<c, Boolean> n() {
        return this.f38753d;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull a aVar) {
        aVar.x9(this.f38752c);
        aVar.y9(this.f38753d);
    }
}
