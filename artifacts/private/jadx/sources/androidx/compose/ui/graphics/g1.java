package androidx.compose.ui.graphics;

import android.graphics.Shader;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.o2
public final class g1 extends m3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final m3 f37783f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final m3 f37784g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f37785h;

    public /* synthetic */ g1(m3 m3Var, m3 m3Var2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(m3Var, m3Var2, i10);
    }

    @Override // androidx.compose.ui.graphics.m3
    @NotNull
    public Shader c(long j10) {
        return n3.a(this.f37783f.c(j10), this.f37784g.c(j10), this.f37785h);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return Intrinsics.areEqual(this.f37783f, g1Var.f37783f) && Intrinsics.areEqual(this.f37784g, g1Var.f37784g) && d0.G(this.f37785h, g1Var.f37785h);
    }

    public final int g() {
        return this.f37785h;
    }

    @NotNull
    public final m3 h() {
        return this.f37783f;
    }

    public int hashCode() {
        return (((this.f37783f.hashCode() * 31) + this.f37784g.hashCode()) * 31) + d0.H(this.f37785h);
    }

    @NotNull
    public final m3 i() {
        return this.f37784g;
    }

    @NotNull
    public String toString() {
        return "CompositeShaderBrush(dstBrush=" + this.f37783f + ", srcBrush=" + this.f37784g + ", blendMode=" + ((Object) d0.I(this.f37785h)) + ')';
    }

    private g1(m3 m3Var, m3 m3Var2, int i10) {
        this.f37783f = m3Var;
        this.f37784g = m3Var2;
        this.f37785h = i10;
    }
}
