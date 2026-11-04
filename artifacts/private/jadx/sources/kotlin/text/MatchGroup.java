package kotlin.text;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class MatchGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f313193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final IntRange f313194b;

    public MatchGroup(@NotNull String value, @NotNull IntRange range) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(range, "range");
        this.f313193a = value;
        this.f313194b = range;
    }

    public static /* synthetic */ MatchGroup d(MatchGroup matchGroup, String str, IntRange intRange, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = matchGroup.f313193a;
        }
        if ((i10 & 2) != 0) {
            intRange = matchGroup.f313194b;
        }
        return matchGroup.c(str, intRange);
    }

    @NotNull
    public final String a() {
        return this.f313193a;
    }

    @NotNull
    public final IntRange b() {
        return this.f313194b;
    }

    @NotNull
    public final MatchGroup c(@NotNull String value, @NotNull IntRange range) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(range, "range");
        return new MatchGroup(value, range);
    }

    @NotNull
    public final IntRange e() {
        return this.f313194b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchGroup)) {
            return false;
        }
        MatchGroup matchGroup = (MatchGroup) obj;
        return Intrinsics.areEqual(this.f313193a, matchGroup.f313193a) && Intrinsics.areEqual(this.f313194b, matchGroup.f313194b);
    }

    @NotNull
    public final String f() {
        return this.f313193a;
    }

    public int hashCode() {
        return (this.f313193a.hashCode() * 31) + this.f313194b.hashCode();
    }

    @NotNull
    public String toString() {
        return "MatchGroup(value=" + this.f313193a + ", range=" + this.f313194b + ')';
    }
}
