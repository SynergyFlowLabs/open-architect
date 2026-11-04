package androidx.compose.material3;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
public final class vd {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f33929d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.graphics.q3 f33930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.graphics.q3 f33931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.graphics.q3 f33932c;

    public vd(@NotNull androidx.compose.ui.graphics.q3 q3Var, @NotNull androidx.compose.ui.graphics.q3 q3Var2, @NotNull androidx.compose.ui.graphics.q3 q3Var3) {
        this.f33930a = q3Var;
        this.f33931b = q3Var2;
        this.f33932c = q3Var3;
    }

    @NotNull
    public final androidx.compose.ui.graphics.q3 a() {
        return this.f33932c;
    }

    @NotNull
    public final androidx.compose.ui.graphics.q3 b() {
        return this.f33931b;
    }

    @NotNull
    public final androidx.compose.ui.graphics.q3 c() {
        return this.f33930a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof vd)) {
            return false;
        }
        vd vdVar = (vd) obj;
        return Intrinsics.areEqual(this.f33930a, vdVar.f33930a) && Intrinsics.areEqual(this.f33931b, vdVar.f33931b) && Intrinsics.areEqual(this.f33932c, vdVar.f33932c);
    }

    public int hashCode() {
        return (((this.f33930a.hashCode() * 31) + this.f33931b.hashCode()) * 31) + this.f33932c.hashCode();
    }
}
