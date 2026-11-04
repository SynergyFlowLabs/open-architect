package androidx.compose.ui.platform;

import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class w2 {
    @NotNull
    public static final Object a(@NotNull Object obj) {
        return obj.getClass();
    }

    @NotNull
    public static final String b(@NotNull Object obj, @Nullable String str) {
        if (str == null) {
            str = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append('@');
        kotlin.jvm.internal.q1 q1Var = kotlin.jvm.internal.q1.f312784a;
        String str2 = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        sb2.append(str2);
        return sb2.toString();
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "not expected to be referenced directly as the old version had to be inlined")
    @kotlin.a1
    @oj.i(name = "synchronized")
    public static final /* synthetic */ <R> R c(Object obj, Function0<? extends R> function0) {
        R rInvoke;
        synchronized (obj) {
            try {
                rInvoke = function0.invoke();
                kotlin.jvm.internal.h0.d(1);
            } finally {
                kotlin.jvm.internal.h0.d(1);
                kotlin.jvm.internal.h0.c(1);
            }
        }
        return rInvoke;
    }
}
