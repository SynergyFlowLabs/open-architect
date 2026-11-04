package androidx.collection;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f12494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f12495b;

    public w0(long j10, long j11) {
        this.f12494a = j10;
        this.f12495b = j11;
    }

    public final long a() {
        return c();
    }

    public final long b() {
        return d();
    }

    public final long c() {
        return this.f12494a;
    }

    public final long d() {
        return this.f12495b;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return w0Var.f12494a == this.f12494a && w0Var.f12495b == this.f12495b;
    }

    public int hashCode() {
        return Long.hashCode(this.f12495b) ^ Long.hashCode(this.f12494a);
    }

    @NotNull
    public String toString() {
        return '(' + this.f12494a + ", " + this.f12495b + ')';
    }
}
