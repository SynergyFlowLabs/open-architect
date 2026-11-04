package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
public final class am {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f26101c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.window.u f26102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f26103b;

    /* JADX WARN: Multi-variable type inference failed */
    public am() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    @NotNull
    public final androidx.compose.ui.window.u a() {
        return this.f26102a;
    }

    public final boolean b() {
        return this.f26103b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof am) && this.f26102a == ((am) obj).f26102a;
    }

    public int hashCode() {
        return (this.f26102a.hashCode() * 31) + Boolean.hashCode(this.f26103b);
    }

    public am(@NotNull androidx.compose.ui.window.u uVar, boolean z10) {
        this.f26102a = uVar;
        this.f26103b = z10;
    }

    public /* synthetic */ am(androidx.compose.ui.window.u uVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? androidx.compose.ui.window.u.Inherit : uVar, (i10 & 2) != 0 ? true : z10);
    }

    public /* synthetic */ am(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10);
    }

    public am(boolean z10) {
        this(androidx.compose.ui.window.u.Inherit, z10);
    }
}
