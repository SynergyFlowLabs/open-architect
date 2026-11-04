package coil.request;

import android.graphics.drawable.Drawable;
import coil.memory.MemoryCache;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Drawable f87743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final i f87744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final coil.decode.e f87745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final MemoryCache.Key f87746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f87747e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f87748f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f87749g;

    public /* synthetic */ r(Drawable drawable, i iVar, coil.decode.e eVar, MemoryCache.Key key, String str, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawable, iVar, eVar, (i10 & 8) != 0 ? null : key, (i10 & 16) != 0 ? null : str, (i10 & 32) != 0 ? false : z10, (i10 & 64) != 0 ? false : z11);
    }

    public static /* synthetic */ r d(r rVar, Drawable drawable, i iVar, coil.decode.e eVar, MemoryCache.Key key, String str, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            drawable = rVar.a();
        }
        if ((i10 & 2) != 0) {
            iVar = rVar.b();
        }
        if ((i10 & 4) != 0) {
            eVar = rVar.f87745c;
        }
        if ((i10 & 8) != 0) {
            key = rVar.f87746d;
        }
        if ((i10 & 16) != 0) {
            str = rVar.f87747e;
        }
        if ((i10 & 32) != 0) {
            z10 = rVar.f87748f;
        }
        if ((i10 & 64) != 0) {
            z11 = rVar.f87749g;
        }
        boolean z12 = z10;
        boolean z13 = z11;
        String str2 = str;
        coil.decode.e eVar2 = eVar;
        return rVar.c(drawable, iVar, eVar2, key, str2, z12, z13);
    }

    @Override // coil.request.j
    @NotNull
    public Drawable a() {
        return this.f87743a;
    }

    @Override // coil.request.j
    @NotNull
    public i b() {
        return this.f87744b;
    }

    @NotNull
    public final r c(@NotNull Drawable drawable, @NotNull i iVar, @NotNull coil.decode.e eVar, @Nullable MemoryCache.Key key, @Nullable String str, boolean z10, boolean z11) {
        return new r(drawable, iVar, eVar, key, str, z10, z11);
    }

    @NotNull
    public final coil.decode.e e() {
        return this.f87745c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (Intrinsics.areEqual(a(), rVar.a()) && Intrinsics.areEqual(b(), rVar.b()) && this.f87745c == rVar.f87745c && Intrinsics.areEqual(this.f87746d, rVar.f87746d) && Intrinsics.areEqual(this.f87747e, rVar.f87747e) && this.f87748f == rVar.f87748f && this.f87749g == rVar.f87749g) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final String f() {
        return this.f87747e;
    }

    @Nullable
    public final MemoryCache.Key g() {
        return this.f87746d;
    }

    public final boolean h() {
        return this.f87749g;
    }

    public int hashCode() {
        int iHashCode = ((((a().hashCode() * 31) + b().hashCode()) * 31) + this.f87745c.hashCode()) * 31;
        MemoryCache.Key key = this.f87746d;
        int iHashCode2 = (iHashCode + (key != null ? key.hashCode() : 0)) * 31;
        String str = this.f87747e;
        return ((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.f87748f)) * 31) + Boolean.hashCode(this.f87749g);
    }

    public final boolean i() {
        return this.f87748f;
    }

    public r(@NotNull Drawable drawable, @NotNull i iVar, @NotNull coil.decode.e eVar, @Nullable MemoryCache.Key key, @Nullable String str, boolean z10, boolean z11) {
        super(null);
        this.f87743a = drawable;
        this.f87744b = iVar;
        this.f87745c = eVar;
        this.f87746d = key;
        this.f87747e = str;
        this.f87748f = z10;
        this.f87749g = z11;
    }
}
