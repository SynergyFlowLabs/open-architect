package com.google.accompanist.placeholder;

import androidx.compose.animation.core.g1;
import androidx.compose.ui.graphics.i0;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.s3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
final class a implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f103134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final g1<Float> f103135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final s3 f103136d;

    public /* synthetic */ a(long j10, g1 g1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, g1Var);
    }

    private final long d() {
        return this.f103134b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a g(a aVar, long j10, g1 g1Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = aVar.f103134b;
        }
        if ((i10 & 2) != 0) {
            g1Var = aVar.f103135c;
        }
        return aVar.f(j10, g1Var);
    }

    @Override // com.google.accompanist.placeholder.c
    @NotNull
    public i0 a(float f10, long j10) {
        return this.f103136d;
    }

    @Override // com.google.accompanist.placeholder.c
    @NotNull
    public g1<Float> b() {
        return this.f103135c;
    }

    @Override // com.google.accompanist.placeholder.c
    public float c(float f10) {
        return f10;
    }

    @NotNull
    public final g1<Float> e() {
        return this.f103135c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (q0.y(this.f103134b, aVar.f103134b) && Intrinsics.areEqual(this.f103135c, aVar.f103135c)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final a f(long j10, @NotNull g1<Float> animationSpec) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return new a(j10, animationSpec, null);
    }

    public int hashCode() {
        return (q0.K(this.f103134b) * 31) + this.f103135c.hashCode();
    }

    @NotNull
    public String toString() {
        return "Fade(highlightColor=" + ((Object) q0.L(this.f103134b)) + ", animationSpec=" + this.f103135c + ')';
    }

    private a(long j10, g1<Float> animationSpec) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        this.f103134b = j10;
        this.f103135c = animationSpec;
        this.f103136d = new s3(j10, null);
    }
}
