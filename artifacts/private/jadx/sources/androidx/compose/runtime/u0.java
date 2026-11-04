package androidx.compose.runtime;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@k7
public abstract class u0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f36711b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final z7<T> f36712a;

    public /* synthetic */ u0(Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0);
    }

    public static /* synthetic */ void b() {
    }

    @o
    @p4
    @oj.i(name = "getCurrent")
    public final T a(@Nullable c0 c0Var, int i10) {
        return (T) c0Var.W(this);
    }

    @NotNull
    public z7<T> c() {
        return this.f36712a;
    }

    @NotNull
    public abstract z7<T> d(@NotNull n4<T> n4Var, @Nullable z7<T> z7Var);

    private u0(Function0<? extends T> function0) {
        this.f36712a = new z2(function0);
    }
}
