package androidx.compose.foundation;

import androidx.compose.runtime.k7;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@k7
public interface x3 {

    public static final class a extends androidx.compose.ui.a0.d {
        a() {
        }
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "This has been replaced with `node`. If you are calling this property to render overscroll, use Modifier.overscroll() instead. If you are implementing OverscrollEffect, override `node` instead to render your overscroll.", replaceWith = @kotlin.b1(expression = "Modifier.overscroll(this)", imports = {"androidx.compose.foundation.overscroll"}))
    static /* synthetic */ void B() {
    }

    @Nullable
    Object A(long j10, @NotNull Function2<? super androidx.compose.ui.unit.c0, ? super kotlin.coroutines.d<? super androidx.compose.ui.unit.c0>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @NotNull
    default androidx.compose.ui.node.j w() {
        return new a();
    }

    boolean x();

    @NotNull
    default androidx.compose.ui.a0 y() {
        return androidx.compose.ui.a0.E;
    }

    long z(long j10, int i10, @NotNull Function1<? super n0.g, n0.g> function1);
}
