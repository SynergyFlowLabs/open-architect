package androidx.compose.ui.text.input;

import androidx.compose.runtime.o2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@o2
public final class p0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f41926b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f41927a;

    /* JADX WARN: Multi-variable type inference failed */
    public p0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Nullable
    public final String a() {
        return this.f41927a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0) && Intrinsics.areEqual(this.f41927a, ((p0) obj).f41927a);
    }

    public int hashCode() {
        String str = this.f41927a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return "PlatformImeOptions(privateImeOptions=" + this.f41927a + ')';
    }

    public p0(@Nullable String str) {
        this.f41927a = str;
    }

    public /* synthetic */ p0(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str);
    }
}
