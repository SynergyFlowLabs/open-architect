package androidx.compose.runtime.tooling;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f36673c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final c0 f36674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Integer f36675b;

    public c(@NotNull c0 c0Var, @Nullable Integer num) {
        this.f36674a = c0Var;
        this.f36675b = num;
    }

    public static /* synthetic */ c d(c cVar, c0 c0Var, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c0Var = cVar.f36674a;
        }
        if ((i10 & 2) != 0) {
            num = cVar.f36675b;
        }
        return cVar.c(c0Var, num);
    }

    @NotNull
    public final c0 a() {
        return this.f36674a;
    }

    @Nullable
    public final Integer b() {
        return this.f36675b;
    }

    @NotNull
    public final c c(@NotNull c0 c0Var, @Nullable Integer num) {
        return new c(c0Var, num);
    }

    @Nullable
    public final Integer e() {
        return this.f36675b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f36674a, cVar.f36674a) && Intrinsics.areEqual(this.f36675b, cVar.f36675b);
    }

    @NotNull
    public final c0 f() {
        return this.f36674a;
    }

    public int hashCode() {
        int iHashCode = this.f36674a.hashCode() * 31;
        Integer num = this.f36675b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        return "ComposeStackTraceFrame(sourceInfo=" + this.f36674a + ", groupOffset=" + this.f36675b + ')';
    }
}
