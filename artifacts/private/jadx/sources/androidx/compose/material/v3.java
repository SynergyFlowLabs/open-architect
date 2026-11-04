package androidx.compose.material;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
final class v3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.graphics.k2 f25213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.graphics.s2 f25214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.graphics.k2 f25215c;

    public v3() {
        this(null, null, null, 7, null);
    }

    @NotNull
    public final androidx.compose.ui.graphics.k2 a() {
        return this.f25213a;
    }

    @NotNull
    public final androidx.compose.ui.graphics.s2 b() {
        return this.f25214b;
    }

    @NotNull
    public final androidx.compose.ui.graphics.k2 c() {
        return this.f25215c;
    }

    public v3(@NotNull androidx.compose.ui.graphics.k2 k2Var, @NotNull androidx.compose.ui.graphics.s2 s2Var, @NotNull androidx.compose.ui.graphics.k2 k2Var2) {
        this.f25213a = k2Var;
        this.f25214b = s2Var;
        this.f25215c = k2Var2;
    }

    public /* synthetic */ v3(androidx.compose.ui.graphics.k2 k2Var, androidx.compose.ui.graphics.s2 s2Var, androidx.compose.ui.graphics.k2 k2Var2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? androidx.compose.ui.graphics.u.a() : k2Var, (i10 & 2) != 0 ? androidx.compose.ui.graphics.t.a() : s2Var, (i10 & 4) != 0 ? androidx.compose.ui.graphics.u.a() : k2Var2);
    }
}
