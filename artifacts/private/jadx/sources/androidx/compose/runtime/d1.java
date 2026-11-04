package androidx.compose.runtime;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class d1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f35577d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private androidx.compose.runtime.tooling.o f35578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f35579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final p0 f35580c;

    public d1(@Nullable androidx.compose.runtime.tooling.o oVar, boolean z10, @NotNull p0 p0Var) {
        this.f35578a = oVar;
        this.f35579b = z10;
        this.f35580c = p0Var;
    }

    @Nullable
    public final androidx.compose.runtime.tooling.o a() {
        if (this.f35579b) {
            return this.f35578a;
        }
        d1 d1VarL = this.f35580c.l();
        androidx.compose.runtime.tooling.o oVar = d1VarL != null ? d1VarL.f35578a : null;
        if (!Intrinsics.areEqual(oVar, this.f35578a)) {
            this.f35578a = oVar;
        }
        return oVar;
    }

    @Nullable
    public final androidx.compose.runtime.tooling.o b() {
        return this.f35578a;
    }

    public final boolean c() {
        return this.f35579b;
    }

    public final void d(@Nullable androidx.compose.runtime.tooling.o oVar) {
        this.f35578a = oVar;
    }

    public final void e(boolean z10) {
        this.f35579b = z10;
    }

    public /* synthetic */ d1(androidx.compose.runtime.tooling.o oVar, boolean z10, p0 p0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : oVar, (i10 & 2) != 0 ? false : z10, p0Var);
    }
}
