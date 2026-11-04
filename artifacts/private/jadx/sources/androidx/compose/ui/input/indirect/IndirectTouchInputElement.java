package androidx.compose.ui.input.indirect;

import androidx.compose.ui.node.e1;
import androidx.compose.ui.p;
import androidx.compose.ui.platform.t2;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@p
final class IndirectTouchInputElement extends e1<g> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Function1<c, Boolean> f38735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Function1<c, Boolean> f38736d;

    /* JADX WARN: Multi-variable type inference failed */
    public IndirectTouchInputElement(@Nullable Function1<? super c, Boolean> function1, @Nullable Function1<? super c, Boolean> function2) {
        this.f38735c = function1;
        this.f38736d = function2;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndirectTouchInputElement)) {
            return false;
        }
        IndirectTouchInputElement indirectTouchInputElement = (IndirectTouchInputElement) obj;
        return this.f38735c == indirectTouchInputElement.f38735c && this.f38736d == indirectTouchInputElement.f38736d;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        Function1<c, Boolean> function1 = this.f38735c;
        int iHashCode = (function1 != null ? function1.hashCode() : 0) * 31;
        Function1<c, Boolean> function2 = this.f38736d;
        return iHashCode + (function2 != null ? function2.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        Function1<c, Boolean> function1 = this.f38735c;
        if (function1 != null) {
            t2Var.d("onIndirectTouchEvent");
            t2Var.b().c("onIndirectTouchEvent", function1);
        }
        Function1<c, Boolean> function2 = this.f38736d;
        if (function2 != null) {
            t2Var.d("onPreIndirectTouchEvent");
            t2Var.b().c("onPreIndirectTouchEvent", function2);
        }
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public g a() {
        return new g(this.f38735c, this.f38736d);
    }

    @Nullable
    public final Function1<c, Boolean> m() {
        return this.f38735c;
    }

    @Nullable
    public final Function1<c, Boolean> n() {
        return this.f38736d;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull g gVar) {
        gVar.x9(this.f38735c);
        gVar.y9(this.f38736d);
    }
}
