package androidx.compose.ui.input.pointer;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class b implements x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f38975c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f38976b;

    public b(int i10) {
        this.f38976b = i10;
    }

    public final int a() {
        return this.f38976b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.f38976b == ((b) obj).f38976b;
    }

    public int hashCode() {
        return this.f38976b;
    }

    @NotNull
    public String toString() {
        return "AndroidPointerIcon(type=" + this.f38976b + ')';
    }
}
