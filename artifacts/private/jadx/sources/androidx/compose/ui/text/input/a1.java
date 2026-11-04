package androidx.compose.ui.text.input;

import androidx.compose.animation.core.z1;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@kotlin.l(message = "Use PlatformTextInputModifierNode instead.")
public class a1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f41805c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final q0 f41806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final AtomicReference<g1> f41807b = new AtomicReference<>(null);

    public a1(@NotNull q0 q0Var) {
        this.f41806a = q0Var;
    }

    @Nullable
    public final g1 a() {
        return this.f41807b.get();
    }

    @kotlin.l(message = "Use SoftwareKeyboardController.hide or TextInputSession.hideSoftwareKeyboard instead.", replaceWith = @kotlin.b1(expression = "textInputSession.hideSoftwareKeyboard()", imports = {}))
    public final void b() {
        this.f41806a.e();
    }

    @kotlin.l(message = "Use SoftwareKeyboardController.show or TextInputSession.showSoftwareKeyboard instead.", replaceWith = @kotlin.b1(expression = "textInputSession.showSoftwareKeyboard()", imports = {}))
    public final void c() {
        if (a() != null) {
            this.f41806a.f();
        }
    }

    @NotNull
    public g1 d(@NotNull y0 y0Var, @NotNull u uVar, @NotNull Function1<? super List<? extends j>, Unit> function1, @NotNull Function1<? super t, Unit> function2) {
        this.f41806a.h(y0Var, uVar, function1, function2);
        g1 g1Var = new g1(this, this.f41806a);
        this.f41807b.set(g1Var);
        return g1Var;
    }

    @androidx.compose.ui.text.x
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public final void e() {
        this.f41806a.d();
        this.f41807b.set(new g1(this, this.f41806a));
    }

    @androidx.compose.ui.text.x
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public final void f() {
        this.f41807b.set(null);
        this.f41806a.a();
    }

    public void g(@NotNull g1 g1Var) {
        if (z1.a(this.f41807b, g1Var, null)) {
            this.f41806a.a();
        }
    }
}
