package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class cf extends androidx.compose.ui.a0.d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private Function0<Unit> f26753s;

    public cf(@NotNull Function0<Unit> function0) {
        this.f26753s = function0;
    }

    @Override // androidx.compose.ui.a0.d
    public void e9() {
        this.f26753s.invoke();
    }

    @NotNull
    public final Function0<Unit> v9() {
        return this.f26753s;
    }

    public final void w9(@NotNull Function0<Unit> function0) {
        this.f26753s = function0;
    }
}
