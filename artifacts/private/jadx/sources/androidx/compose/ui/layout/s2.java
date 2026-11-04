package androidx.compose.ui.layout;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public abstract class s2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f39541b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Function2<i2.a, Float, Float> f39542a;

    public /* synthetic */ s2(Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2);
    }

    public abstract float a(float f10, @NotNull g0 g0Var, @NotNull g0 g0Var2);

    @Nullable
    public final Function2<i2.a, Float, Float> b() {
        return this.f39542a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private s2(Function2<? super i2.a, ? super Float, Float> function2) {
        this.f39542a = function2;
    }
}
