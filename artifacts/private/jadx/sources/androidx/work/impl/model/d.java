package androidx.work.impl.model;

import androidx.annotation.b1;
import androidx.room.u0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.room.u
@b1({b1.a.LIBRARY_GROUP})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.room.i(name = "key")
    @u0
    @NotNull
    private final String f76916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.room.i(name = "long_value")
    @Nullable
    private final Long f76917b;

    public d(@NotNull String key, @Nullable Long l10) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f76916a = key;
        this.f76917b = l10;
    }

    public static /* synthetic */ d d(d dVar, String str, Long l10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dVar.f76916a;
        }
        if ((i10 & 2) != 0) {
            l10 = dVar.f76917b;
        }
        return dVar.c(str, l10);
    }

    @NotNull
    public final String a() {
        return this.f76916a;
    }

    @Nullable
    public final Long b() {
        return this.f76917b;
    }

    @NotNull
    public final d c(@NotNull String key, @Nullable Long l10) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new d(key, l10);
    }

    @NotNull
    public final String e() {
        return this.f76916a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f76916a, dVar.f76916a) && Intrinsics.areEqual(this.f76917b, dVar.f76917b);
    }

    @Nullable
    public final Long f() {
        return this.f76917b;
    }

    public int hashCode() {
        int iHashCode = this.f76916a.hashCode() * 31;
        Long l10 = this.f76917b;
        return iHashCode + (l10 == null ? 0 : l10.hashCode());
    }

    @NotNull
    public String toString() {
        return "Preference(key=" + this.f76916a + ", value=" + this.f76917b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(@NotNull String key, boolean z10) {
        this(key, Long.valueOf(z10 ? 1L : 0L));
        Intrinsics.checkNotNullParameter(key, "key");
    }
}
