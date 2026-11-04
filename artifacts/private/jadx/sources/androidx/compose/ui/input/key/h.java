package androidx.compose.ui.input.key;

import android.view.KeyEvent;
import androidx.compose.ui.a0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class h extends a0.d implements g {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private Function1<? super c, Boolean> f38918s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private Function1<? super c, Boolean> f38919t;

    public h(@Nullable Function1<? super c, Boolean> function1, @Nullable Function1<? super c, Boolean> function2) {
        this.f38918s = function1;
        this.f38919t = function2;
    }

    @Override // androidx.compose.ui.input.key.g
    public boolean h7(@NotNull KeyEvent keyEvent) {
        Function1<? super c, Boolean> function1 = this.f38918s;
        if (function1 != null) {
            return function1.invoke(c.a(keyEvent)).booleanValue();
        }
        return false;
    }

    @Nullable
    public final Function1<c, Boolean> v9() {
        return this.f38918s;
    }

    @Override // androidx.compose.ui.input.key.g
    public boolean w2(@NotNull KeyEvent keyEvent) {
        Function1<? super c, Boolean> function1 = this.f38919t;
        if (function1 != null) {
            return function1.invoke(c.a(keyEvent)).booleanValue();
        }
        return false;
    }

    @Nullable
    public final Function1<c, Boolean> w9() {
        return this.f38919t;
    }

    public final void x9(@Nullable Function1<? super c, Boolean> function1) {
        this.f38918s = function1;
    }

    public final void y9(@Nullable Function1<? super c, Boolean> function1) {
        this.f38919t = function1;
    }
}
