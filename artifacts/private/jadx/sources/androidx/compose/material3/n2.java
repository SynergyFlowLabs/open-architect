package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class n2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f30899e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f30900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.a0 f30901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.window.k f30902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function2<androidx.compose.runtime.c0, Integer, Unit> f30903d;

    /* JADX WARN: Multi-variable type inference failed */
    public n2(@NotNull Function0<Unit> function0, @NotNull androidx.compose.ui.a0 a0Var, @NotNull androidx.compose.ui.window.k kVar, @NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
        this.f30900a = function0;
        this.f30901b = a0Var;
        this.f30902c = kVar;
        this.f30903d = function2;
    }

    @NotNull
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> a() {
        return this.f30903d;
    }

    @NotNull
    public final androidx.compose.ui.a0 b() {
        return this.f30901b;
    }

    @NotNull
    public final Function0<Unit> c() {
        return this.f30900a;
    }

    @NotNull
    public final androidx.compose.ui.window.k d() {
        return this.f30902c;
    }

    public /* synthetic */ n2(Function0 function0, androidx.compose.ui.a0 a0Var, androidx.compose.ui.window.k kVar, Function2 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, (i10 & 2) != 0 ? androidx.compose.ui.a0.E : a0Var, (i10 & 4) != 0 ? new androidx.compose.ui.window.k(false, false, false, 7, (DefaultConstructorMarker) null) : kVar, function2);
    }
}
