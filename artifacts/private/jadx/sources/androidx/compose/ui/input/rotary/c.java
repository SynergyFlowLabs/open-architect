package androidx.compose.ui.input.rotary;

import androidx.compose.ui.a0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class c extends a0.d implements b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private Function1<? super d, Boolean> f39183s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private Function1<? super d, Boolean> f39184t;

    public c(@Nullable Function1<? super d, Boolean> function1, @Nullable Function1<? super d, Boolean> function2) {
        this.f39183s = function1;
        this.f39184t = function2;
    }

    @Override // androidx.compose.ui.input.rotary.b
    public boolean k7(@NotNull d dVar) {
        Function1<? super d, Boolean> function1 = this.f39183s;
        if (function1 != null) {
            return function1.invoke(dVar).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.input.rotary.b
    public boolean o5(@NotNull d dVar) {
        Function1<? super d, Boolean> function1 = this.f39184t;
        if (function1 != null) {
            return function1.invoke(dVar).booleanValue();
        }
        return false;
    }

    @Nullable
    public final Function1<d, Boolean> v9() {
        return this.f39183s;
    }

    @Nullable
    public final Function1<d, Boolean> w9() {
        return this.f39184t;
    }

    public final void x9(@Nullable Function1<? super d, Boolean> function1) {
        this.f39183s = function1;
    }

    public final void y9(@Nullable Function1<? super d, Boolean> function1) {
        this.f39184t = function1;
    }
}
