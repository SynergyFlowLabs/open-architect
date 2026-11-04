package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class fy {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f27767g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.a0 f27768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f27769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f27770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.layout.v6 f27771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f27772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Function2<androidx.compose.runtime.c0, Integer, Unit> f27773f;

    public /* synthetic */ fy(androidx.compose.ui.a0 a0Var, long j10, long j11, androidx.compose.foundation.layout.v6 v6Var, int i10, Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(a0Var, j10, j11, v6Var, i10, function2);
    }

    public final int a() {
        return this.f27772e;
    }

    public final long b() {
        return this.f27769b;
    }

    @NotNull
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> c() {
        return this.f27773f;
    }

    public final long d() {
        return this.f27770c;
    }

    @NotNull
    public final androidx.compose.ui.a0 e() {
        return this.f27768a;
    }

    @NotNull
    public final androidx.compose.foundation.layout.v6 f() {
        return this.f27771d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private fy(androidx.compose.ui.a0 a0Var, long j10, long j11, androidx.compose.foundation.layout.v6 v6Var, int i10, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
        this.f27768a = a0Var;
        this.f27769b = j10;
        this.f27770c = j11;
        this.f27771d = v6Var;
        this.f27772e = i10;
        this.f27773f = function2;
    }
}
