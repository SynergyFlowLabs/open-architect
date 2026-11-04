package androidx.compose.ui.graphics;

import android.graphics.Canvas;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final b f37839a = new b();

    @kotlin.a1
    public static /* synthetic */ void c() {
    }

    public final void a(@NotNull Canvas canvas, @NotNull Function1<? super k0, Unit> function1) {
        Canvas canvasS = b().S();
        b().U(canvas);
        function1.invoke(b());
        b().U(canvasS);
    }

    @NotNull
    public final b b() {
        return this.f37839a;
    }
}
