package coil.request;

import android.graphics.Bitmap;
import androidx.lifecycle.c0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.n0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final c0 f87631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final coil.size.j f87632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final coil.size.h f87633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final n0 f87634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final n0 f87635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final n0 f87636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final n0 f87637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final coil.transition.c.a f87638h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private final coil.size.e f87639i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private final Bitmap.Config f87640j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private final Boolean f87641k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private final Boolean f87642l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private final b f87643m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private final b f87644n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private final b f87645o;

    public d(@Nullable c0 c0Var, @Nullable coil.size.j jVar, @Nullable coil.size.h hVar, @Nullable n0 n0Var, @Nullable n0 n0Var2, @Nullable n0 n0Var3, @Nullable n0 n0Var4, @Nullable coil.transition.c.a aVar, @Nullable coil.size.e eVar, @Nullable Bitmap.Config config, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable b bVar, @Nullable b bVar2, @Nullable b bVar3) {
        this.f87631a = c0Var;
        this.f87632b = jVar;
        this.f87633c = hVar;
        this.f87634d = n0Var;
        this.f87635e = n0Var2;
        this.f87636f = n0Var3;
        this.f87637g = n0Var4;
        this.f87638h = aVar;
        this.f87639i = eVar;
        this.f87640j = config;
        this.f87641k = bool;
        this.f87642l = bool2;
        this.f87643m = bVar;
        this.f87644n = bVar2;
        this.f87645o = bVar3;
    }

    @NotNull
    public final d a(@Nullable c0 c0Var, @Nullable coil.size.j jVar, @Nullable coil.size.h hVar, @Nullable n0 n0Var, @Nullable n0 n0Var2, @Nullable n0 n0Var3, @Nullable n0 n0Var4, @Nullable coil.transition.c.a aVar, @Nullable coil.size.e eVar, @Nullable Bitmap.Config config, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable b bVar, @Nullable b bVar2, @Nullable b bVar3) {
        return new d(c0Var, jVar, hVar, n0Var, n0Var2, n0Var3, n0Var4, aVar, eVar, config, bool, bool2, bVar, bVar2, bVar3);
    }

    @Nullable
    public final Boolean c() {
        return this.f87641k;
    }

    @Nullable
    public final Boolean d() {
        return this.f87642l;
    }

    @Nullable
    public final Bitmap.Config e() {
        return this.f87640j;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f87631a, dVar.f87631a) && Intrinsics.areEqual(this.f87632b, dVar.f87632b) && this.f87633c == dVar.f87633c && Intrinsics.areEqual(this.f87634d, dVar.f87634d) && Intrinsics.areEqual(this.f87635e, dVar.f87635e) && Intrinsics.areEqual(this.f87636f, dVar.f87636f) && Intrinsics.areEqual(this.f87637g, dVar.f87637g) && Intrinsics.areEqual(this.f87638h, dVar.f87638h) && this.f87639i == dVar.f87639i && this.f87640j == dVar.f87640j && Intrinsics.areEqual(this.f87641k, dVar.f87641k) && Intrinsics.areEqual(this.f87642l, dVar.f87642l) && this.f87643m == dVar.f87643m && this.f87644n == dVar.f87644n && this.f87645o == dVar.f87645o;
    }

    @Nullable
    public final n0 f() {
        return this.f87636f;
    }

    @Nullable
    public final b g() {
        return this.f87644n;
    }

    @Nullable
    public final n0 h() {
        return this.f87635e;
    }

    public int hashCode() {
        c0 c0Var = this.f87631a;
        int iHashCode = (c0Var != null ? c0Var.hashCode() : 0) * 31;
        coil.size.j jVar = this.f87632b;
        int iHashCode2 = (iHashCode + (jVar != null ? jVar.hashCode() : 0)) * 31;
        coil.size.h hVar = this.f87633c;
        int iHashCode3 = (iHashCode2 + (hVar != null ? hVar.hashCode() : 0)) * 31;
        n0 n0Var = this.f87634d;
        int iHashCode4 = (iHashCode3 + (n0Var != null ? n0Var.hashCode() : 0)) * 31;
        n0 n0Var2 = this.f87635e;
        int iHashCode5 = (iHashCode4 + (n0Var2 != null ? n0Var2.hashCode() : 0)) * 31;
        n0 n0Var3 = this.f87636f;
        int iHashCode6 = (iHashCode5 + (n0Var3 != null ? n0Var3.hashCode() : 0)) * 31;
        n0 n0Var4 = this.f87637g;
        int iHashCode7 = (iHashCode6 + (n0Var4 != null ? n0Var4.hashCode() : 0)) * 31;
        coil.transition.c.a aVar = this.f87638h;
        int iHashCode8 = (iHashCode7 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        coil.size.e eVar = this.f87639i;
        int iHashCode9 = (iHashCode8 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        Bitmap.Config config = this.f87640j;
        int iHashCode10 = (iHashCode9 + (config != null ? config.hashCode() : 0)) * 31;
        Boolean bool = this.f87641k;
        int iHashCode11 = (iHashCode10 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f87642l;
        int iHashCode12 = (iHashCode11 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        b bVar = this.f87643m;
        int iHashCode13 = (iHashCode12 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        b bVar2 = this.f87644n;
        int iHashCode14 = (iHashCode13 + (bVar2 != null ? bVar2.hashCode() : 0)) * 31;
        b bVar3 = this.f87645o;
        return iHashCode14 + (bVar3 != null ? bVar3.hashCode() : 0);
    }

    @Nullable
    public final n0 i() {
        return this.f87634d;
    }

    @Nullable
    public final c0 j() {
        return this.f87631a;
    }

    @Nullable
    public final b k() {
        return this.f87643m;
    }

    @Nullable
    public final b l() {
        return this.f87645o;
    }

    @Nullable
    public final coil.size.e m() {
        return this.f87639i;
    }

    @Nullable
    public final coil.size.h n() {
        return this.f87633c;
    }

    @Nullable
    public final coil.size.j o() {
        return this.f87632b;
    }

    @Nullable
    public final n0 p() {
        return this.f87637g;
    }

    @Nullable
    public final coil.transition.c.a q() {
        return this.f87638h;
    }
}
