package androidx.compose.ui.input.indirect;

import androidx.compose.ui.a0;
import androidx.compose.ui.p;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@p
final class g extends a0.d implements f {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private Function1<? super c, Boolean> f38748s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private Function1<? super c, Boolean> f38749t;

    public g(@Nullable Function1<? super c, Boolean> function1, @Nullable Function1<? super c, Boolean> function2) {
        this.f38748s = function1;
        this.f38749t = function2;
    }

    @Override // androidx.compose.ui.input.indirect.f
    public boolean L5(@NotNull c cVar) {
        Function1<? super c, Boolean> function1 = this.f38748s;
        return function1 != null && function1.invoke(cVar).booleanValue();
    }

    @Override // androidx.compose.ui.input.indirect.f
    public boolean q8(@NotNull c cVar) {
        Function1<? super c, Boolean> function1 = this.f38749t;
        return function1 != null && function1.invoke(cVar).booleanValue();
    }

    @Nullable
    public final Function1<c, Boolean> v9() {
        return this.f38748s;
    }

    @Nullable
    public final Function1<c, Boolean> w9() {
        return this.f38749t;
    }

    public final void x9(@Nullable Function1<? super c, Boolean> function1) {
        this.f38748s = function1;
    }

    public final void y9(@Nullable Function1<? super c, Boolean> function1) {
        this.f38749t = function1;
    }
}
