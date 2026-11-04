package androidx.compose.material3;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
final class z7 implements y7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f34970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f34971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f34972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Map<String, Object> f34973d = new LinkedHashMap();

    public z7(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this.f34970a = str;
        this.f34971b = str2;
        this.f34972c = str3;
    }

    @Override // androidx.compose.material3.y7
    @Nullable
    public String a(@Nullable Long l10, @NotNull Locale locale) {
        if (l10 == null) {
            return null;
        }
        return androidx.compose.material3.internal.n1.b(l10.longValue(), this.f34970a, locale, this.f34973d);
    }

    @Override // androidx.compose.material3.y7
    @Nullable
    public String c(@Nullable Long l10, @NotNull Locale locale, boolean z10) {
        if (l10 == null) {
            return null;
        }
        return androidx.compose.material3.internal.n1.b(l10.longValue(), z10 ? this.f34972c : this.f34971b, locale, this.f34973d);
    }

    @NotNull
    public final String d() {
        return this.f34972c;
    }

    @NotNull
    public final String e() {
        return this.f34971b;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof z7)) {
            return false;
        }
        z7 z7Var = (z7) obj;
        return Intrinsics.areEqual(this.f34970a, z7Var.f34970a) && Intrinsics.areEqual(this.f34971b, z7Var.f34971b) && Intrinsics.areEqual(this.f34972c, z7Var.f34972c);
    }

    @NotNull
    public final String f() {
        return this.f34970a;
    }

    public int hashCode() {
        return (((this.f34970a.hashCode() * 31) + this.f34971b.hashCode()) * 31) + this.f34972c.hashCode();
    }
}
