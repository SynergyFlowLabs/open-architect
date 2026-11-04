package androidx.compose.ui.text;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f42120d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p f42121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f42122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f42123c;

    public q(@NotNull p pVar, int i10, int i11) {
        this.f42121a = pVar;
        this.f42122b = i10;
        this.f42123c = i11;
    }

    public static /* synthetic */ q e(q qVar, p pVar, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            pVar = qVar.f42121a;
        }
        if ((i12 & 2) != 0) {
            i10 = qVar.f42122b;
        }
        if ((i12 & 4) != 0) {
            i11 = qVar.f42123c;
        }
        return qVar.d(pVar, i10, i11);
    }

    @NotNull
    public final p a() {
        return this.f42121a;
    }

    public final int b() {
        return this.f42122b;
    }

    public final int c() {
        return this.f42123c;
    }

    @NotNull
    public final q d(@NotNull p pVar, int i10, int i11) {
        return new q(pVar, i10, i11);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.areEqual(this.f42121a, qVar.f42121a) && this.f42122b == qVar.f42122b && this.f42123c == qVar.f42123c;
    }

    @NotNull
    public final p f() {
        return this.f42121a;
    }

    public final int g() {
        return this.f42122b;
    }

    public final int h() {
        return this.f42123c;
    }

    public int hashCode() {
        return (((this.f42121a.hashCode() * 31) + Integer.hashCode(this.f42122b)) * 31) + Integer.hashCode(this.f42123c);
    }

    @NotNull
    public String toString() {
        return "BulletSpanWithLevel(bullet=" + this.f42121a + ", indentationLevel=" + this.f42122b + ", start=" + this.f42123c + ')';
    }
}
