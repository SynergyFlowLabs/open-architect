package androidx.compose.runtime;

import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface l1 extends o0 {
    void L();

    @r2
    void M(@NotNull h3 h3Var);

    boolean N(@NotNull Set<? extends Object> set);

    void O();

    void P(@NotNull Function2<? super c0, ? super Integer, Unit> function2);

    void Q();

    @r2
    void R(@NotNull List<Pair<i3, i3>> list);

    @Nullable
    t5 S(@Nullable t5 t5Var);

    <R> R T(@Nullable l1 l1Var, int i10, @NotNull Function0<? extends R> function0);

    boolean U();

    boolean V();

    @r2
    void W();

    void X(@NotNull Function0<Unit> function0);

    void Y(@NotNull Set<? extends Object> set);

    void Z();

    void a(@NotNull Object obj);

    boolean a0();

    void b0(@NotNull Object obj);

    void c0();
}
