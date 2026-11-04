package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
final class q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.graphics.k2 f32076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.graphics.s2 f32077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.graphics.k2 f32078c;

    public q4() {
        this(null, null, null, 7, null);
    }

    @NotNull
    public final androidx.compose.ui.graphics.k2 a() {
        return this.f32076a;
    }

    @NotNull
    public final androidx.compose.ui.graphics.s2 b() {
        return this.f32077b;
    }

    @NotNull
    public final androidx.compose.ui.graphics.k2 c() {
        return this.f32078c;
    }

    public q4(@NotNull androidx.compose.ui.graphics.k2 k2Var, @NotNull androidx.compose.ui.graphics.s2 s2Var, @NotNull androidx.compose.ui.graphics.k2 k2Var2) {
        this.f32076a = k2Var;
        this.f32077b = s2Var;
        this.f32078c = k2Var2;
    }

    public /* synthetic */ q4(androidx.compose.ui.graphics.k2 k2Var, androidx.compose.ui.graphics.s2 s2Var, androidx.compose.ui.graphics.k2 k2Var2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? androidx.compose.ui.graphics.u.a() : k2Var, (i10 & 2) != 0 ? androidx.compose.ui.graphics.t.a() : s2Var, (i10 & 4) != 0 ? androidx.compose.ui.graphics.u.a() : k2Var2);
    }
}
