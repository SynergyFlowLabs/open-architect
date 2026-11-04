package androidx.compose.ui.layout;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class g1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f39338d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.a0 f39339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final g0 f39340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Object f39341c;

    public g1(@NotNull androidx.compose.ui.a0 a0Var, @NotNull g0 g0Var, @Nullable Object obj) {
        this.f39339a = a0Var;
        this.f39340b = g0Var;
        this.f39341c = obj;
    }

    @NotNull
    public final g0 a() {
        return this.f39340b;
    }

    @Nullable
    public final Object b() {
        return this.f39341c;
    }

    @NotNull
    public final androidx.compose.ui.a0 c() {
        return this.f39339a;
    }

    @NotNull
    public String toString() {
        return "ModifierInfo(" + this.f39339a + ", " + this.f39340b + ", " + this.f39341c + ')';
    }

    public /* synthetic */ g1(androidx.compose.ui.a0 a0Var, g0 g0Var, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(a0Var, g0Var, (i10 & 4) != 0 ? null : obj);
    }
}
