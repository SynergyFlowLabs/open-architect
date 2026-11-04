package coil.compose;

import androidx.compose.runtime.k7;
import androidx.compose.ui.graphics.r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class s implements c0, androidx.compose.foundation.layout.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.layout.c0 f87072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final AsyncImagePainter f87073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f87074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.e f87075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.layout.l f87076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f87077f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final r0 f87078g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f87079h;

    public s(@NotNull androidx.compose.foundation.layout.c0 c0Var, @NotNull AsyncImagePainter asyncImagePainter, @Nullable String str, @NotNull androidx.compose.ui.e eVar, @NotNull androidx.compose.ui.layout.l lVar, float f10, @Nullable r0 r0Var, boolean z10) {
        this.f87072a = c0Var;
        this.f87073b = asyncImagePainter;
        this.f87074c = str;
        this.f87075d = eVar;
        this.f87076e = lVar;
        this.f87077f = f10;
        this.f87078g = r0Var;
        this.f87079h = z10;
    }

    private final androidx.compose.foundation.layout.c0 l() {
        return this.f87072a;
    }

    public static /* synthetic */ s v(s sVar, androidx.compose.foundation.layout.c0 c0Var, AsyncImagePainter asyncImagePainter, String str, androidx.compose.ui.e eVar, androidx.compose.ui.layout.l lVar, float f10, r0 r0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c0Var = sVar.f87072a;
        }
        if ((i10 & 2) != 0) {
            asyncImagePainter = sVar.f87073b;
        }
        if ((i10 & 4) != 0) {
            str = sVar.f87074c;
        }
        if ((i10 & 8) != 0) {
            eVar = sVar.f87075d;
        }
        if ((i10 & 16) != 0) {
            lVar = sVar.f87076e;
        }
        if ((i10 & 32) != 0) {
            f10 = sVar.f87077f;
        }
        if ((i10 & 64) != 0) {
            r0Var = sVar.f87078g;
        }
        if ((i10 & 128) != 0) {
            z10 = sVar.f87079h;
        }
        r0 r0Var2 = r0Var;
        boolean z11 = z10;
        androidx.compose.ui.layout.l lVar2 = lVar;
        float f11 = f10;
        return sVar.u(c0Var, asyncImagePainter, str, eVar, lVar2, f11, r0Var2, z11);
    }

    @Override // coil.compose.c0
    @NotNull
    public androidx.compose.ui.layout.l a() {
        return this.f87076e;
    }

    @Override // androidx.compose.foundation.layout.c0
    @k7
    @NotNull
    public androidx.compose.ui.a0 b(@NotNull androidx.compose.ui.a0 a0Var, @NotNull androidx.compose.ui.e eVar) {
        return this.f87072a.b(a0Var, eVar);
    }

    @Override // coil.compose.c0
    public boolean d() {
        return this.f87079h;
    }

    @Override // coil.compose.c0
    @Nullable
    public r0 e() {
        return this.f87078g;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.areEqual(this.f87072a, sVar.f87072a) && Intrinsics.areEqual(this.f87073b, sVar.f87073b) && Intrinsics.areEqual(this.f87074c, sVar.f87074c) && Intrinsics.areEqual(this.f87075d, sVar.f87075d) && Intrinsics.areEqual(this.f87076e, sVar.f87076e) && Float.compare(this.f87077f, sVar.f87077f) == 0 && Intrinsics.areEqual(this.f87078g, sVar.f87078g) && this.f87079h == sVar.f87079h;
    }

    @Override // coil.compose.c0
    @NotNull
    public AsyncImagePainter f() {
        return this.f87073b;
    }

    @Override // coil.compose.c0
    @NotNull
    public androidx.compose.ui.e getAlignment() {
        return this.f87075d;
    }

    @Override // coil.compose.c0
    @Nullable
    public String getContentDescription() {
        return this.f87074c;
    }

    public int hashCode() {
        int iHashCode = ((this.f87072a.hashCode() * 31) + this.f87073b.hashCode()) * 31;
        String str = this.f87074c;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f87075d.hashCode()) * 31) + this.f87076e.hashCode()) * 31) + Float.hashCode(this.f87077f)) * 31;
        r0 r0Var = this.f87078g;
        return ((iHashCode2 + (r0Var != null ? r0Var.hashCode() : 0)) * 31) + Boolean.hashCode(this.f87079h);
    }

    @Override // androidx.compose.foundation.layout.c0
    @k7
    @NotNull
    public androidx.compose.ui.a0 j(@NotNull androidx.compose.ui.a0 a0Var) {
        return this.f87072a.j(a0Var);
    }

    @NotNull
    public final AsyncImagePainter m() {
        return this.f87073b;
    }

    @Nullable
    public final String n() {
        return this.f87074c;
    }

    @NotNull
    public final androidx.compose.ui.e o() {
        return this.f87075d;
    }

    @NotNull
    public final androidx.compose.ui.layout.l p() {
        return this.f87076e;
    }

    public final float q() {
        return this.f87077f;
    }

    @Override // coil.compose.c0
    public float r() {
        return this.f87077f;
    }

    @Nullable
    public final r0 s() {
        return this.f87078g;
    }

    public final boolean t() {
        return this.f87079h;
    }

    @NotNull
    public String toString() {
        return "RealSubcomposeAsyncImageScope(parentScope=" + this.f87072a + ", painter=" + this.f87073b + ", contentDescription=" + this.f87074c + ", alignment=" + this.f87075d + ", contentScale=" + this.f87076e + ", alpha=" + this.f87077f + ", colorFilter=" + this.f87078g + ", clipToBounds=" + this.f87079h + ')';
    }

    @NotNull
    public final s u(@NotNull androidx.compose.foundation.layout.c0 c0Var, @NotNull AsyncImagePainter asyncImagePainter, @Nullable String str, @NotNull androidx.compose.ui.e eVar, @NotNull androidx.compose.ui.layout.l lVar, float f10, @Nullable r0 r0Var, boolean z10) {
        return new s(c0Var, asyncImagePainter, str, eVar, lVar, f10, r0Var, z10);
    }
}
