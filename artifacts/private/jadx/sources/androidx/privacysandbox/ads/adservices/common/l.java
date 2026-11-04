package androidx.privacysandbox.ads.adservices.common;

import android.adservices.common.AdFilters;
import androidx.annotation.b1;
import androidx.annotation.x0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@q.d
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final x f73492a;

    public l(@Nullable x xVar) {
        this.f73492a = xVar;
    }

    @b1({b1.a.LIBRARY})
    @x0.a({@x0(extension = 1000000, version = 8), @x0(extension = 31, version = 9)})
    @NotNull
    public final AdFilters a() {
        AdFilters.Builder builderA = k.a();
        x xVar = this.f73492a;
        AdFilters adFiltersBuild = builderA.setFrequencyCapFilters(xVar != null ? xVar.b() : null).build();
        Intrinsics.checkNotNullExpressionValue(adFiltersBuild, "Builder()\n            .s…s())\n            .build()");
        return adFiltersBuild;
    }

    @Nullable
    public final x b() {
        return this.f73492a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return Intrinsics.areEqual(this.f73492a, ((l) obj).f73492a);
        }
        return false;
    }

    public int hashCode() {
        x xVar = this.f73492a;
        if (xVar != null) {
            return xVar.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return "AdFilters: frequencyCapFilters=" + this.f73492a;
    }
}
