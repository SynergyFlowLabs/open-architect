package androidx.compose.ui.text;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class c4 extends a4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f41498c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f41499b;

    public c4(@NotNull String str) {
        super(null);
        this.f41499b = str;
    }

    @NotNull
    public final String a() {
        return this.f41499b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c4) && Intrinsics.areEqual(this.f41499b, ((c4) obj).f41499b);
    }

    public int hashCode() {
        return this.f41499b.hashCode();
    }

    @NotNull
    public String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.f41499b + ')';
    }
}
