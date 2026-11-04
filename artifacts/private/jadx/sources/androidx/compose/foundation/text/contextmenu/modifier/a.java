package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.a0;
import androidx.compose.ui.node.p2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class a extends a0.d implements p2 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f18980t = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private Function1<? super a0.a, Unit> f18981s;

    public a(@NotNull Function1<? super a0.a, Unit> function1) {
        this.f18981s = function1;
    }

    @Override // androidx.compose.ui.node.p2
    @NotNull
    public Object R4() {
        return e.f18985a;
    }

    @NotNull
    public final Function1<a0.a, Unit> v9() {
        return this.f18981s;
    }

    public final void w9(@NotNull Function1<? super a0.a, Unit> function1) {
        this.f18981s = function1;
    }
}
