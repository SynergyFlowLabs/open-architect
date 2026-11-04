package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 1)
public final class a<T extends kotlin.x<? extends Boolean>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f41066c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f41067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final T f41068b;

    public a(@Nullable String str, @Nullable T t10) {
        this.f41067a = str;
        this.f41068b = t10;
    }

    @Nullable
    public final T a() {
        return this.f41068b;
    }

    @Nullable
    public final String b() {
        return this.f41067a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (Intrinsics.areEqual(this.f41067a, aVar.f41067a) && Intrinsics.areEqual(this.f41068b, aVar.f41068b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f41067a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        T t10 = this.f41068b;
        return iHashCode + (t10 != null ? t10.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AccessibilityAction(label=" + this.f41067a + ", action=" + this.f41068b + ')';
    }
}
