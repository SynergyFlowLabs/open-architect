package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.i0;
import androidx.compose.ui.graphics.m3;
import androidx.compose.ui.graphics.q0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class c implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final m3 f42146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f42147c;

    public c(@NotNull m3 m3Var, float f10) {
        this.f42146b = m3Var;
        this.f42147c = f10;
    }

    public static /* synthetic */ c j(c cVar, m3 m3Var, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            m3Var = cVar.f42146b;
        }
        if ((i10 & 2) != 0) {
            f10 = cVar.f42147c;
        }
        return cVar.i(m3Var, f10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f42146b, cVar.f42146b) && Float.compare(this.f42147c, cVar.f42147c) == 0;
    }

    @NotNull
    public final m3 g() {
        return this.f42146b;
    }

    public final float h() {
        return this.f42147c;
    }

    public int hashCode() {
        return (this.f42146b.hashCode() * 31) + Float.hashCode(this.f42147c);
    }

    @NotNull
    public final c i(@NotNull m3 m3Var, float f10) {
        return new c(m3Var, f10);
    }

    @NotNull
    public final m3 k() {
        return this.f42146b;
    }

    @Override // androidx.compose.ui.text.style.p
    @NotNull
    public i0 o0() {
        return this.f42146b;
    }

    @Override // androidx.compose.ui.text.style.p
    public float r() {
        return this.f42147c;
    }

    @NotNull
    public String toString() {
        return "BrushStyle(value=" + this.f42146b + ", alpha=" + this.f42147c + ')';
    }

    @Override // androidx.compose.ui.text.style.p
    public long u() {
        return q0.f38131b.u();
    }
}
