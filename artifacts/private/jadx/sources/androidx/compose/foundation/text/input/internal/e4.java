package androidx.compose.foundation.text.input.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class e4 implements t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char f19581b;

    public e4(char c10) {
        this.f19581b = c10;
    }

    public static /* synthetic */ e4 d(e4 e4Var, char c10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c10 = e4Var.f19581b;
        }
        return e4Var.c(c10);
    }

    @Override // androidx.compose.foundation.text.input.internal.t
    public int a(int i10, int i11) {
        return this.f19581b;
    }

    public final char b() {
        return this.f19581b;
    }

    @NotNull
    public final e4 c(char c10) {
        return new e4(c10);
    }

    public final char e() {
        return this.f19581b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e4) && this.f19581b == ((e4) obj).f19581b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Character.hashCode(this.f19581b);
    }

    @NotNull
    public String toString() {
        return "MaskCodepointTransformation(character=" + this.f19581b + ')';
    }
}
