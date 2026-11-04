package androidx.compose.ui.platform;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface e4 {

    public static final class a {
        @Deprecated
        public static void a(@NotNull e4 e4Var, @NotNull n0.j jVar, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1, @Nullable Function0<Unit> function2, @Nullable Function0<Unit> function3, @Nullable Function0<Unit> function4) {
            e4.super.x(jVar, function0, function1, function2, function3, function4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void v(e4 e4Var, n0.j jVar, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showMenu");
        }
        if ((i10 & 2) != 0) {
            function0 = null;
        }
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        if ((i10 & 8) != 0) {
            function2 = null;
        }
        if ((i10 & 16) != 0) {
            function3 = null;
        }
        if ((i10 & 32) != 0) {
            function4 = null;
        }
        e4Var.x(jVar, function0, function1, function2, function3, function4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void y(e4 e4Var, n0.j jVar, Function0 function0, Function0 function1, Function0 function2, Function0 function3, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showMenu");
        }
        if ((i10 & 2) != 0) {
            function0 = null;
        }
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        if ((i10 & 8) != 0) {
            function2 = null;
        }
        if ((i10 & 16) != 0) {
            function3 = null;
        }
        e4Var.u(jVar, function0, function1, function2, function3);
    }

    void b();

    @NotNull
    g4 t();

    void u(@NotNull n0.j jVar, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1, @Nullable Function0<Unit> function2, @Nullable Function0<Unit> function3);

    default void x(@NotNull n0.j jVar, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1, @Nullable Function0<Unit> function2, @Nullable Function0<Unit> function3, @Nullable Function0<Unit> function4) {
        u(jVar, function0, function1, function2, function3);
    }
}
