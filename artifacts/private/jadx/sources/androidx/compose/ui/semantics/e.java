package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 1)
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f41098c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f41099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<Boolean> f41100b;

    public e(@NotNull String str, @NotNull Function0<Boolean> function0) {
        this.f41099a = str;
        this.f41100b = function0;
    }

    @NotNull
    public final Function0<Boolean> a() {
        return this.f41100b;
    }

    @NotNull
    public final String b() {
        return this.f41099a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f41099a, eVar.f41099a) && this.f41100b == eVar.f41100b;
    }

    public int hashCode() {
        return (this.f41099a.hashCode() * 31) + this.f41100b.hashCode();
    }

    @NotNull
    public String toString() {
        return "CustomAccessibilityAction(label=" + this.f41099a + ", action=" + this.f41100b + ')';
    }
}
