package androidx.compose.ui.draw;

import androidx.compose.runtime.internal.w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f37304b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private Function1<? super androidx.compose.ui.graphics.drawscope.c, Unit> f37305a;

    public o(@NotNull Function1<? super androidx.compose.ui.graphics.drawscope.c, Unit> function1) {
        this.f37305a = function1;
    }

    @NotNull
    public final Function1<androidx.compose.ui.graphics.drawscope.c, Unit> a() {
        return this.f37305a;
    }

    public final void b(@NotNull Function1<? super androidx.compose.ui.graphics.drawscope.c, Unit> function1) {
        this.f37305a = function1;
    }
}
