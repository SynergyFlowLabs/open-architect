package androidx.privacysandbox.ads.adservices.topics;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f73696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f73697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f73698c;

    public t(long j10, long j11, int i10) {
        this.f73696a = j10;
        this.f73697b = j11;
        this.f73698c = i10;
    }

    public final long a() {
        return this.f73697b;
    }

    public final long b() {
        return this.f73696a;
    }

    public final int c() {
        return this.f73698c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f73696a == tVar.f73696a && this.f73697b == tVar.f73697b && this.f73698c == tVar.f73698c;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f73696a) * 31) + Long.hashCode(this.f73697b)) * 31) + Integer.hashCode(this.f73698c);
    }

    @NotNull
    public String toString() {
        return "Topic { " + ("TaxonomyVersion=" + this.f73696a + ", ModelVersion=" + this.f73697b + ", TopicCode=" + this.f73698c + " }");
    }
}
