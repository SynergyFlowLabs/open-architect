package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
@af
public final class st {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f32974d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f32975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f32976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final j40 f32977c;

    public /* synthetic */ st(long j10, long j11, j40 j40Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j40Var);
    }

    public final long a() {
        return this.f32975a;
    }

    public final long b() {
        return this.f32976b;
    }

    @NotNull
    public final j40 c() {
        return this.f32977c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st)) {
            return false;
        }
        st stVar = (st) obj;
        return androidx.compose.ui.graphics.q0.y(this.f32975a, stVar.f32975a) && androidx.compose.ui.graphics.q0.y(this.f32976b, stVar.f32976b) && Intrinsics.areEqual(this.f32977c, stVar.f32977c);
    }

    public int hashCode() {
        return (((androidx.compose.ui.graphics.q0.K(this.f32975a) * 31) + androidx.compose.ui.graphics.q0.K(this.f32976b)) * 31) + this.f32977c.hashCode();
    }

    @kotlin.l(message = "Use overload that takes `inputFieldColors", replaceWith = @kotlin.b1(expression = "SearchBarColors(containerColor, dividerColor, inputFieldColors)", imports = {}))
    public /* synthetic */ st(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11);
    }

    private st(long j10, long j11, j40 j40Var) {
        this.f32975a = j10;
        this.f32976b = j11;
        this.f32977c = j40Var;
    }

    private st(long j10, long j11) {
        this(j10, j11, mv.f30681a, null);
    }
}
