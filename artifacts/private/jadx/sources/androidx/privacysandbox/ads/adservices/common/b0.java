package androidx.privacysandbox.ads.adservices.common;

import android.adservices.common.KeyedFrequencyCap;
import androidx.annotation.b1;
import androidx.annotation.x0;
import java.time.Duration;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@q.d
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f73481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f73482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Duration f73483c;

    public b0(int i10, int i11, @NotNull Duration interval) {
        Intrinsics.checkNotNullParameter(interval, "interval");
        this.f73481a = i10;
        this.f73482b = i11;
        this.f73483c = interval;
    }

    @b1({b1.a.LIBRARY})
    @x0.a({@x0(extension = 1000000, version = 8), @x0(extension = 31, version = 9)})
    @NotNull
    public final KeyedFrequencyCap a() {
        a0.a();
        KeyedFrequencyCap keyedFrequencyCapBuild = z.a(this.f73481a, this.f73482b, this.f73483c).build();
        Intrinsics.checkNotNullExpressionValue(keyedFrequencyCapBuild, "Builder(adCounterKey, ma…val)\n            .build()");
        return keyedFrequencyCapBuild;
    }

    public final int b() {
        return this.f73481a;
    }

    @NotNull
    public final Duration c() {
        return this.f73483c;
    }

    public final int d() {
        return this.f73482b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f73481a == b0Var.f73481a && this.f73482b == b0Var.f73482b && Intrinsics.areEqual(this.f73483c, b0Var.f73483c);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f73481a) * 31) + Integer.hashCode(this.f73482b)) * 31) + this.f73483c.hashCode();
    }

    @NotNull
    public String toString() {
        return "KeyedFrequencyCap: adCounterKey=" + this.f73481a + ", maxCount=" + this.f73482b + ", interval=" + this.f73483c;
    }
}
