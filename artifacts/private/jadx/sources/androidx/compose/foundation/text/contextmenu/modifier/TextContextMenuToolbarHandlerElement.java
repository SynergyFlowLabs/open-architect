package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.ui.layout.g0;
import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class TextContextMenuToolbarHandlerElement extends e1<n> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final o f18976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Function1<kotlin.coroutines.d<? super Unit>, Object> f18977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final Function1<kotlin.coroutines.d<? super Unit>, Object> f18978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Function1<g0, n0.j> f18979f;

    /* JADX WARN: Multi-variable type inference failed */
    public TextContextMenuToolbarHandlerElement(@NotNull o oVar, @Nullable Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, @Nullable Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull Function1<? super g0, n0.j> function3) {
        this.f18976c = oVar;
        this.f18977d = function1;
        this.f18978e = function2;
        this.f18979f = function3;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextContextMenuToolbarHandlerElement)) {
            return false;
        }
        TextContextMenuToolbarHandlerElement textContextMenuToolbarHandlerElement = (TextContextMenuToolbarHandlerElement) obj;
        return this.f18976c == textContextMenuToolbarHandlerElement.f18976c && this.f18977d == textContextMenuToolbarHandlerElement.f18977d && this.f18978e == textContextMenuToolbarHandlerElement.f18978e && this.f18979f == textContextMenuToolbarHandlerElement.f18979f;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        int iHashCode = this.f18976c.hashCode() * 31;
        Function1<kotlin.coroutines.d<? super Unit>, Object> function1 = this.f18977d;
        int iHashCode2 = (iHashCode + (function1 != null ? function1.hashCode() : 0)) * 31;
        Function1<kotlin.coroutines.d<? super Unit>, Object> function2 = this.f18978e;
        return ((iHashCode2 + (function2 != null ? function2.hashCode() : 0)) * 31) + this.f18979f.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public n a() {
        return new n(this.f18976c, this.f18977d, this.f18978e, this.f18979f);
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull n nVar) {
        nVar.M9().d(null);
        nVar.R9(this.f18976c);
        nVar.M9().d(nVar);
        nVar.Q9(this.f18977d);
        nVar.P9(this.f18978e);
        nVar.O9(this.f18979f);
    }
}
