package kotlin;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes11.dex */
public class i0 extends h0 {
    @kotlin.internal.f
    private static final <T> T d(f0<? extends T> f0Var, Object obj, kotlin.reflect.o<?> property) {
        Intrinsics.checkNotNullParameter(f0Var, "<this>");
        Intrinsics.checkNotNullParameter(property, "property");
        return f0Var.getValue();
    }

    @NotNull
    public static <T> f0<T> e(T t10) {
        return new z(t10);
    }
}
