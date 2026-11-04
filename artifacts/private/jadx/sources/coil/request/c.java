package coil.request;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.n0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n0 f87616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n0 f87617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final n0 f87618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final n0 f87619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final coil.transition.c.a f87620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final coil.size.e f87621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Bitmap.Config f87622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f87623h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f87624i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private final Drawable f87625j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private final Drawable f87626k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private final Drawable f87627l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final b f87628m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final b f87629n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final b f87630o;

    public c() {
        this(null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, 32767, null);
    }

    @NotNull
    public final c a(@NotNull n0 n0Var, @NotNull n0 n0Var2, @NotNull n0 n0Var3, @NotNull n0 n0Var4, @NotNull coil.transition.c.a aVar, @NotNull coil.size.e eVar, @NotNull Bitmap.Config config, boolean z10, boolean z11, @Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @NotNull b bVar, @NotNull b bVar2, @NotNull b bVar3) {
        return new c(n0Var, n0Var2, n0Var3, n0Var4, aVar, eVar, config, z10, z11, drawable, drawable2, drawable3, bVar, bVar2, bVar3);
    }

    public final boolean c() {
        return this.f87623h;
    }

    public final boolean d() {
        return this.f87624i;
    }

    @NotNull
    public final Bitmap.Config e() {
        return this.f87622g;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (Intrinsics.areEqual(this.f87616a, cVar.f87616a) && Intrinsics.areEqual(this.f87617b, cVar.f87617b) && Intrinsics.areEqual(this.f87618c, cVar.f87618c) && Intrinsics.areEqual(this.f87619d, cVar.f87619d) && Intrinsics.areEqual(this.f87620e, cVar.f87620e) && this.f87621f == cVar.f87621f && this.f87622g == cVar.f87622g && this.f87623h == cVar.f87623h && this.f87624i == cVar.f87624i && Intrinsics.areEqual(this.f87625j, cVar.f87625j) && Intrinsics.areEqual(this.f87626k, cVar.f87626k) && Intrinsics.areEqual(this.f87627l, cVar.f87627l) && this.f87628m == cVar.f87628m && this.f87629n == cVar.f87629n && this.f87630o == cVar.f87630o) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final n0 f() {
        return this.f87618c;
    }

    @NotNull
    public final b g() {
        return this.f87629n;
    }

    @Nullable
    public final Drawable h() {
        return this.f87626k;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.f87616a.hashCode() * 31) + this.f87617b.hashCode()) * 31) + this.f87618c.hashCode()) * 31) + this.f87619d.hashCode()) * 31) + this.f87620e.hashCode()) * 31) + this.f87621f.hashCode()) * 31) + this.f87622g.hashCode()) * 31) + Boolean.hashCode(this.f87623h)) * 31) + Boolean.hashCode(this.f87624i)) * 31;
        Drawable drawable = this.f87625j;
        int iHashCode2 = (iHashCode + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Drawable drawable2 = this.f87626k;
        int iHashCode3 = (iHashCode2 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Drawable drawable3 = this.f87627l;
        return ((((((iHashCode3 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31) + this.f87628m.hashCode()) * 31) + this.f87629n.hashCode()) * 31) + this.f87630o.hashCode();
    }

    @Nullable
    public final Drawable i() {
        return this.f87627l;
    }

    @NotNull
    public final n0 j() {
        return this.f87617b;
    }

    @NotNull
    public final n0 k() {
        return this.f87616a;
    }

    @NotNull
    public final b l() {
        return this.f87628m;
    }

    @NotNull
    public final b m() {
        return this.f87630o;
    }

    @Nullable
    public final Drawable n() {
        return this.f87625j;
    }

    @NotNull
    public final coil.size.e o() {
        return this.f87621f;
    }

    @NotNull
    public final n0 p() {
        return this.f87619d;
    }

    @NotNull
    public final coil.transition.c.a q() {
        return this.f87620e;
    }

    public c(@NotNull n0 n0Var, @NotNull n0 n0Var2, @NotNull n0 n0Var3, @NotNull n0 n0Var4, @NotNull coil.transition.c.a aVar, @NotNull coil.size.e eVar, @NotNull Bitmap.Config config, boolean z10, boolean z11, @Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @NotNull b bVar, @NotNull b bVar2, @NotNull b bVar3) {
        this.f87616a = n0Var;
        this.f87617b = n0Var2;
        this.f87618c = n0Var3;
        this.f87619d = n0Var4;
        this.f87620e = aVar;
        this.f87621f = eVar;
        this.f87622g = config;
        this.f87623h = z10;
        this.f87624i = z11;
        this.f87625j = drawable;
        this.f87626k = drawable2;
        this.f87627l = drawable3;
        this.f87628m = bVar;
        this.f87629n = bVar2;
        this.f87630o = bVar3;
    }

    public /* synthetic */ c(n0 n0Var, n0 n0Var2, n0 n0Var3, n0 n0Var4, coil.transition.c.a aVar, coil.size.e eVar, Bitmap.Config config, boolean z10, boolean z11, Drawable drawable, Drawable drawable2, Drawable drawable3, b bVar, b bVar2, b bVar3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? l1.e().R0() : n0Var, (i10 & 2) != 0 ? l1.c() : n0Var2, (i10 & 4) != 0 ? l1.c() : n0Var3, (i10 & 8) != 0 ? l1.c() : n0Var4, (i10 & 16) != 0 ? coil.transition.c.a.f87804b : aVar, (i10 & 32) != 0 ? coil.size.e.AUTOMATIC : eVar, (i10 & 64) != 0 ? coil.util.l.j() : config, (i10 & 128) != 0 ? true : z10, (i10 & 256) != 0 ? false : z11, (i10 & 512) != 0 ? null : drawable, (i10 & 1024) != 0 ? null : drawable2, (i10 & 2048) == 0 ? drawable3 : null, (i10 & 4096) != 0 ? b.ENABLED : bVar, (i10 & 8192) != 0 ? b.ENABLED : bVar2, (i10 & 16384) != 0 ? b.ENABLED : bVar3);
    }
}
