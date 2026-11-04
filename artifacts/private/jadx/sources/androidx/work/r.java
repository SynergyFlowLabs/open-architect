package androidx.work;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f77434a;

    static {
        String strI = v.i("InputMerger");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(\"InputMerger\")");
        f77434a = strI;
    }

    @Nullable
    public static final p a(@NotNull String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        try {
            Object objNewInstance = Class.forName(className).getDeclaredConstructor(null).newInstance(null);
            Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type androidx.work.InputMerger");
            return (p) objNewInstance;
        } catch (Exception e10) {
            v.e().d(f77434a, "Trouble instantiating " + className, e10);
            return null;
        }
    }
}
