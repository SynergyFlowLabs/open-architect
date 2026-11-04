package androidx.window.layout;

import android.graphics.Point;
import android.view.Display;
import androidx.annotation.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@w0(17)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f76379a = new f();

    private f() {
    }

    public final void a(@NotNull Display display, @NotNull Point point) {
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(point, "point");
        display.getRealSize(point);
    }
}
