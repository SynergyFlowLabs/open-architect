package androidx.compose.ui.semantics;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class a<T> extends l0 implements Function0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f41168a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            return null;
        }
    }

    @Nullable
    public static final <T> T a(@NotNull SemanticsConfiguration semanticsConfiguration, @NotNull d0<T> d0Var) {
        return (T) semanticsConfiguration.s(d0Var, a.f41168a);
    }
}
