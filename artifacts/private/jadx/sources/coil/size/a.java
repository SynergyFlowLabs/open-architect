package coil.size;

import androidx.annotation.t0;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@oj.i(name = "-Dimensions")
public final class a {
    @NotNull
    public static final c.a a(@t0 int i10) {
        return new c.a(i10);
    }

    public static final int b(@NotNull c cVar, @NotNull Function0<Integer> function0) {
        return cVar instanceof c.a ? ((c.a) cVar).f87767a : function0.invoke().intValue();
    }
}
