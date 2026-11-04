package androidx.privacysandbox.ads.adservices.topics;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<t> f73693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<a> f73694b;

    @androidx.privacysandbox.ads.adservices.common.q.b
    public h(@NotNull List<t> topics, @NotNull List<a> encryptedTopics) {
        Intrinsics.checkNotNullParameter(topics, "topics");
        Intrinsics.checkNotNullParameter(encryptedTopics, "encryptedTopics");
        this.f73693a = topics;
        this.f73694b = encryptedTopics;
    }

    @NotNull
    public final List<a> a() {
        return this.f73694b;
    }

    @NotNull
    public final List<t> b() {
        return this.f73693a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f73693a.size() == hVar.f73693a.size() && this.f73694b.size() == hVar.f73694b.size() && Intrinsics.areEqual(new HashSet(this.f73693a), new HashSet(hVar.f73693a)) && Intrinsics.areEqual(new HashSet(this.f73694b), new HashSet(hVar.f73694b));
    }

    public int hashCode() {
        return Objects.hash(this.f73693a, this.f73694b);
    }

    @NotNull
    public String toString() {
        return "GetTopicsResponse: Topics=" + this.f73693a + ", EncryptedTopics=" + this.f73694b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(@NotNull List<t> topics) {
        this(topics, CollectionsKt.emptyList());
        Intrinsics.checkNotNullParameter(topics, "topics");
    }
}
