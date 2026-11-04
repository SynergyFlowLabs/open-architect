package androidx.compose.ui.text.input;

import androidx.compose.ui.graphics.c2;
import androidx.compose.ui.text.p3;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.l(message = "Use PlatformTextInputModifierNode instead.")
public interface q0 {
    void a();

    void b(@Nullable y0 y0Var, @NotNull y0 y0Var2);

    default void c(@NotNull y0 y0Var, @NotNull m0 m0Var, @NotNull p3 p3Var, @NotNull Function1<? super c2, Unit> function1, @NotNull n0.j jVar, @NotNull n0.j jVar2) {
    }

    default void d() {
    }

    void e();

    void f();

    default void g(@NotNull n0.j jVar) {
    }

    void h(@NotNull y0 y0Var, @NotNull u uVar, @NotNull Function1<? super List<? extends j>, Unit> function1, @NotNull Function1<? super t, Unit> function2);
}
