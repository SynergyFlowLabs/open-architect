package androidx.window.layout;

import android.graphics.Rect;
import androidx.annotation.b1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.window.core.b f76456a;

    public y(@NotNull androidx.window.core.b _bounds) {
        Intrinsics.checkNotNullParameter(_bounds, "_bounds");
        this.f76456a = _bounds;
    }

    @NotNull
    public final Rect a() {
        return this.f76456a.i();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(y.class, obj.getClass())) {
            return false;
        }
        return Intrinsics.areEqual(this.f76456a, ((y) obj).f76456a);
    }

    public int hashCode() {
        return this.f76456a.hashCode();
    }

    @NotNull
    public String toString() {
        return "WindowMetrics { bounds: " + a() + " }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @b1({b1.a.TESTS})
    public y(@NotNull Rect bounds) {
        this(new androidx.window.core.b(bounds));
        Intrinsics.checkNotNullParameter(bounds, "bounds");
    }
}
