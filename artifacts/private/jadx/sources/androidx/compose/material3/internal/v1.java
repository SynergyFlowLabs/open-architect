package androidx.compose.material3.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
public final class v1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f29186d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f29187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char f29188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f29189c;

    public v1(@NotNull String str, char c10) {
        this.f29187a = str;
        this.f29188b = c10;
        this.f29189c = StringsKt.k2(str, String.valueOf(c10), "", false, 4, null);
    }

    public static /* synthetic */ v1 d(v1 v1Var, String str, char c10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = v1Var.f29187a;
        }
        if ((i10 & 2) != 0) {
            c10 = v1Var.f29188b;
        }
        return v1Var.c(str, c10);
    }

    @NotNull
    public final String a() {
        return this.f29187a;
    }

    public final char b() {
        return this.f29188b;
    }

    @NotNull
    public final v1 c(@NotNull String str, char c10) {
        return new v1(str, c10);
    }

    public final char e() {
        return this.f29188b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return Intrinsics.areEqual(this.f29187a, v1Var.f29187a) && this.f29188b == v1Var.f29188b;
    }

    @NotNull
    public final String f() {
        return this.f29187a;
    }

    @NotNull
    public final String g() {
        return this.f29189c;
    }

    public int hashCode() {
        return (this.f29187a.hashCode() * 31) + Character.hashCode(this.f29188b);
    }

    @NotNull
    public String toString() {
        return "DateInputFormat(patternWithDelimiters=" + this.f29187a + ", delimiter=" + this.f29188b + ')';
    }
}
