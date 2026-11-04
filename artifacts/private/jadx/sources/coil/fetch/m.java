package coil.fetch;

import coil.decode.v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final v f87388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f87389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final coil.decode.e f87390c;

    public m(@NotNull v vVar, @Nullable String str, @NotNull coil.decode.e eVar) {
        super(null);
        this.f87388a = vVar;
        this.f87389b = str;
        this.f87390c = eVar;
    }

    public static /* synthetic */ m b(m mVar, v vVar, String str, coil.decode.e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            vVar = mVar.f87388a;
        }
        if ((i10 & 2) != 0) {
            str = mVar.f87389b;
        }
        if ((i10 & 4) != 0) {
            eVar = mVar.f87390c;
        }
        return mVar.a(vVar, str, eVar);
    }

    @NotNull
    public final m a(@NotNull v vVar, @Nullable String str, @NotNull coil.decode.e eVar) {
        return new m(vVar, str, eVar);
    }

    @NotNull
    public final coil.decode.e c() {
        return this.f87390c;
    }

    @Nullable
    public final String d() {
        return this.f87389b;
    }

    @NotNull
    public final v e() {
        return this.f87388a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.areEqual(this.f87388a, mVar.f87388a) && Intrinsics.areEqual(this.f87389b, mVar.f87389b) && this.f87390c == mVar.f87390c;
    }

    public int hashCode() {
        int iHashCode = this.f87388a.hashCode() * 31;
        String str = this.f87389b;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f87390c.hashCode();
    }
}
