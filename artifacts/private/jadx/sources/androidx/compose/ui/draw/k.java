package androidx.compose.ui.draw;

import androidx.compose.runtime.internal.w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class k extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.t {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f37302t = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> f37303s;

    public k(@NotNull Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> function1) {
        this.f37303s = function1;
    }

    @Override // androidx.compose.ui.node.t
    public void P(@NotNull androidx.compose.ui.graphics.drawscope.c cVar) {
        this.f37303s.invoke(cVar);
        cVar.E4();
    }

    @NotNull
    public final Function1<androidx.compose.ui.graphics.drawscope.f, Unit> v9() {
        return this.f37303s;
    }

    public final void w9(@NotNull Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> function1) {
        this.f37303s = function1;
    }
}
