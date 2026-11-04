package i0;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f286697b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f286698a;

    public b() {
        this(0, 1, null);
    }

    public static /* synthetic */ b c(b bVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = bVar.f286698a;
        }
        return bVar.b(i10);
    }

    public final int a() {
        return this.f286698a;
    }

    @NotNull
    public final b b(int i10) {
        return new b(i10);
    }

    public final int d() {
        return this.f286698a;
    }

    public final void e(int i10) {
        this.f286698a += i10;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f286698a == ((b) obj).f286698a;
    }

    public final void f(int i10) {
        this.f286698a = i10;
    }

    public int hashCode() {
        return Integer.hashCode(this.f286698a);
    }

    @NotNull
    public String toString() {
        return "DeltaCounter(count=" + this.f286698a + ')';
    }

    public b(int i10) {
        this.f286698a = i10;
    }

    public /* synthetic */ b(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
