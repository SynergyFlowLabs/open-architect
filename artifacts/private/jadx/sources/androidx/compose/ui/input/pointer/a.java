package androidx.compose.ui.input.pointer;

import android.view.PointerIcon;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class a implements x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f38969c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final PointerIcon f38970b;

    public a(@NotNull PointerIcon pointerIcon) {
        this.f38970b = pointerIcon;
    }

    @NotNull
    public final PointerIcon a() {
        return this.f38970b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIcon");
        return Intrinsics.areEqual(this.f38970b, ((a) obj).f38970b);
    }

    public int hashCode() {
        return this.f38970b.hashCode();
    }

    @NotNull
    public String toString() {
        return "AndroidPointerIcon(pointerIcon=" + this.f38970b + ')';
    }
}
