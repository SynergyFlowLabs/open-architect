package androidx.compose.ui.text.font;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class a1 extends y {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f41553j = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final n1 f41554i;

    public a1(@NotNull n1 n1Var) {
        super(true, null);
        this.f41554i = n1Var;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a1) && Intrinsics.areEqual(this.f41554i, ((a1) obj).f41554i);
    }

    public int hashCode() {
        return this.f41554i.hashCode();
    }

    @NotNull
    public final n1 s() {
        return this.f41554i;
    }

    @NotNull
    public String toString() {
        return "LoadedFontFamily(typeface=" + this.f41554i + ')';
    }
}
