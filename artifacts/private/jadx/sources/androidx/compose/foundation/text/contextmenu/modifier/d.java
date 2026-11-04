package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.ui.a0;
import androidx.compose.ui.node.p2;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class d extends a0.d implements p2 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private Function1<? super b0.b, Boolean> f18984s;

    public d(@NotNull Function1<? super b0.b, Boolean> function1) {
        this.f18984s = function1;
    }

    @Override // androidx.compose.ui.node.p2
    @NotNull
    public Object R4() {
        return e.f18985a;
    }

    @NotNull
    public final Function1<b0.b, Boolean> v9() {
        return this.f18984s;
    }

    public final void w9(@NotNull Function1<? super b0.b, Boolean> function1) {
        this.f18984s = function1;
    }
}
