package androidx.window.layout;

import androidx.annotation.b1;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<h> f76455a;

    /* JADX WARN: Multi-variable type inference failed */
    @b1({b1.a.TESTS})
    public x(@NotNull List<? extends h> displayFeatures) {
        Intrinsics.checkNotNullParameter(displayFeatures, "displayFeatures");
        this.f76455a = displayFeatures;
    }

    @NotNull
    public final List<h> a() {
        return this.f76455a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(x.class, obj.getClass())) {
            return false;
        }
        return Intrinsics.areEqual(this.f76455a, ((x) obj).f76455a);
    }

    public int hashCode() {
        return this.f76455a.hashCode();
    }

    @NotNull
    public String toString() {
        return CollectionsKt.joinToString$default(this.f76455a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, null, 56, null);
    }
}
