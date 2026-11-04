package coil.util;

import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@oj.i(name = "-Logs")
public final class j {
    public static final void a(@NotNull z zVar, @NotNull String str, int i10, @NotNull Function0<String> function0) {
        if (zVar.g() <= i10) {
            zVar.h(str, i10, function0.invoke(), null);
        }
    }

    public static final void b(@NotNull z zVar, @NotNull String str, @NotNull Throwable th2) {
        if (zVar.g() <= 6) {
            zVar.h(str, 6, null, th2);
        }
    }
}
