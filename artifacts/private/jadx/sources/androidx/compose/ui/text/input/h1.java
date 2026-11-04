package androidx.compose.ui.text.input;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class h1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f41889c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.f f41890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final m0 f41891b;

    public h1(@NotNull androidx.compose.ui.text.f fVar, @NotNull m0 m0Var) {
        this.f41890a = fVar;
        this.f41891b = m0Var;
    }

    @NotNull
    public final m0 a() {
        return this.f41891b;
    }

    @NotNull
    public final androidx.compose.ui.text.f b() {
        return this.f41890a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return Intrinsics.areEqual(this.f41890a, h1Var.f41890a) && Intrinsics.areEqual(this.f41891b, h1Var.f41891b);
    }

    public int hashCode() {
        return (this.f41890a.hashCode() * 31) + this.f41891b.hashCode();
    }

    @NotNull
    public String toString() {
        return "TransformedText(text=" + ((Object) this.f41890a) + ", offsetMapping=" + this.f41891b + ')';
    }
}
