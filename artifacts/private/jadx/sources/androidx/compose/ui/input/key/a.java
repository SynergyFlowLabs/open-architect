package androidx.compose.ui.input.key;

import android.view.KeyEvent;
import androidx.compose.ui.a0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class a extends a0.d implements j {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private Function1<? super c, Boolean> f38754s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private Function1<? super c, Boolean> f38755t;

    public a(@Nullable Function1<? super c, Boolean> function1, @Nullable Function1<? super c, Boolean> function2) {
        this.f38754s = function1;
        this.f38755t = function2;
    }

    @Override // androidx.compose.ui.input.key.j
    public boolean A0(@NotNull KeyEvent keyEvent) {
        Function1<? super c, Boolean> function1 = this.f38755t;
        if (function1 != null) {
            return function1.invoke(c.a(keyEvent)).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.input.key.j
    public boolean E1(@NotNull KeyEvent keyEvent) {
        Function1<? super c, Boolean> function1 = this.f38754s;
        if (function1 != null) {
            return function1.invoke(c.a(keyEvent)).booleanValue();
        }
        return false;
    }

    @Nullable
    public final Function1<c, Boolean> v9() {
        return this.f38754s;
    }

    @Nullable
    public final Function1<c, Boolean> w9() {
        return this.f38755t;
    }

    public final void x9(@Nullable Function1<? super c, Boolean> function1) {
        this.f38754s = function1;
    }

    public final void y9(@Nullable Function1<? super c, Boolean> function1) {
        this.f38755t = function1;
    }
}
