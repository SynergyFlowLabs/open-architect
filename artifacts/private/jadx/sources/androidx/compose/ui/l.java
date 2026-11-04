package androidx.compose.ui;

import androidx.compose.ui.platform.t2;
import androidx.compose.ui.platform.u2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
class l extends u2 implements a0.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final pj.n<a0, androidx.compose.runtime.c0, Integer, a0> f39213d;

    /* JADX WARN: Multi-variable type inference failed */
    public l(@NotNull Function1<? super t2, Unit> function1, @NotNull pj.n<? super a0, ? super androidx.compose.runtime.c0, ? super Integer, ? extends a0> nVar) {
        super(function1);
        this.f39213d = nVar;
    }

    @NotNull
    public final pj.n<a0, androidx.compose.runtime.c0, Integer, a0> i() {
        return this.f39213d;
    }
}
