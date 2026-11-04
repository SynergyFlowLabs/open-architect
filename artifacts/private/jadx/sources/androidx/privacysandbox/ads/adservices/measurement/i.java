package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.DeletionRequest;
import android.net.Uri;
import androidx.annotation.b1;
import androidx.annotation.w0;
import androidx.annotation.x0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.time.Instant;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@w0(26)
public final class i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final b f73622g = new b(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f73623h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f73624i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f73625j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f73626k = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f73627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f73628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Instant f73629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Instant f73630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final List<Uri> f73631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final List<Uri> f73632f;

    @w0(26)
    @SourceDebugExtension({"SMAP\nDeletionRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeletionRequest.kt\nandroidx/privacysandbox/ads/adservices/measurement/DeletionRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n1#2:207\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f73633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f73634b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private Instant f73635c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private Instant f73636d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private List<? extends Uri> f73637e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private List<? extends Uri> f73638f;

        public a(int i10, int i11) {
            this.f73633a = i10;
            this.f73634b = i11;
            Instant MIN = Instant.MIN;
            Intrinsics.checkNotNullExpressionValue(MIN, "MIN");
            this.f73635c = MIN;
            Instant MAX = Instant.MAX;
            Intrinsics.checkNotNullExpressionValue(MAX, "MAX");
            this.f73636d = MAX;
            this.f73637e = CollectionsKt.emptyList();
            this.f73638f = CollectionsKt.emptyList();
        }

        @NotNull
        public final i a() {
            return new i(this.f73633a, this.f73634b, this.f73635c, this.f73636d, this.f73637e, this.f73638f);
        }

        @NotNull
        public final a b(@NotNull List<? extends Uri> domainUris) {
            Intrinsics.checkNotNullParameter(domainUris, "domainUris");
            this.f73637e = domainUris;
            return this;
        }

        @NotNull
        public final a c(@NotNull Instant end) {
            Intrinsics.checkNotNullParameter(end, "end");
            this.f73636d = end;
            return this;
        }

        @NotNull
        public final a d(@NotNull List<? extends Uri> originUris) {
            Intrinsics.checkNotNullParameter(originUris, "originUris");
            this.f73638f = originUris;
            return this;
        }

        @NotNull
        public final a e(@NotNull Instant start) {
            Intrinsics.checkNotNullParameter(start, "start");
            this.f73635c = start;
            return this;
        }
    }

    public static final class b {

        @Retention(RetentionPolicy.SOURCE)
        @b1({b1.a.LIBRARY})
        @jj.e(jj.a.SOURCE)
        public @interface a {
        }

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.measurement.i$b$b, reason: collision with other inner class name */
        @Retention(RetentionPolicy.SOURCE)
        @b1({b1.a.LIBRARY})
        @jj.e(jj.a.SOURCE)
        public @interface InterfaceC0722b {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(int i10, int i11, @NotNull Instant start, @NotNull Instant end, @NotNull List<? extends Uri> domainUris, @NotNull List<? extends Uri> originUris) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        Intrinsics.checkNotNullParameter(domainUris, "domainUris");
        Intrinsics.checkNotNullParameter(originUris, "originUris");
        this.f73627a = i10;
        this.f73628b = i11;
        this.f73629c = start;
        this.f73630d = end;
        this.f73631e = domainUris;
        this.f73632f = originUris;
    }

    @e.a({"ClassVerificationFailure", "NewApi"})
    @x0.a({@x0(extension = 1000000, version = 4), @x0(extension = 31, version = 9)})
    @NotNull
    public final DeletionRequest a() {
        DeletionRequest deletionRequestBuild = h.a().setDeletionMode(this.f73627a).setMatchBehavior(this.f73628b).setStart(this.f73629c).setEnd(this.f73630d).setDomainUris(this.f73631e).setOriginUris(this.f73632f).build();
        Intrinsics.checkNotNullExpressionValue(deletionRequestBuild, "Builder()\n            .s…ris)\n            .build()");
        return deletionRequestBuild;
    }

    public final int b() {
        return this.f73627a;
    }

    @NotNull
    public final List<Uri> c() {
        return this.f73631e;
    }

    @NotNull
    public final Instant d() {
        return this.f73630d;
    }

    public final int e() {
        return this.f73628b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f73627a == iVar.f73627a && Intrinsics.areEqual(new HashSet(this.f73631e), new HashSet(iVar.f73631e)) && Intrinsics.areEqual(new HashSet(this.f73632f), new HashSet(iVar.f73632f)) && Intrinsics.areEqual(this.f73629c, iVar.f73629c) && Intrinsics.areEqual(this.f73630d, iVar.f73630d) && this.f73628b == iVar.f73628b;
    }

    @NotNull
    public final List<Uri> f() {
        return this.f73632f;
    }

    @NotNull
    public final Instant g() {
        return this.f73629c;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f73627a) * 31) + this.f73631e.hashCode()) * 31) + this.f73632f.hashCode()) * 31) + this.f73629c.hashCode()) * 31) + this.f73630d.hashCode()) * 31) + Integer.hashCode(this.f73628b);
    }

    @NotNull
    public String toString() {
        return "DeletionRequest { DeletionMode=" + (this.f73627a == 0 ? "DELETION_MODE_ALL" : "DELETION_MODE_EXCLUDE_INTERNAL_DATA") + ", MatchBehavior=" + (this.f73628b == 0 ? "MATCH_BEHAVIOR_DELETE" : "MATCH_BEHAVIOR_PRESERVE") + ", Start=" + this.f73629c + ", End=" + this.f73630d + ", DomainUris=" + this.f73631e + ", OriginUris=" + this.f73632f + " }";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ i(int i10, int i11, Instant MIN, Instant MAX, List list, List list2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i12 & 4) != 0) {
            MIN = Instant.MIN;
            Intrinsics.checkNotNullExpressionValue(MIN, "MIN");
        }
        Instant instant = MIN;
        if ((i12 & 8) != 0) {
            MAX = Instant.MAX;
            Intrinsics.checkNotNullExpressionValue(MAX, "MAX");
        }
        this(i10, i11, instant, MAX, (i12 & 16) != 0 ? CollectionsKt.emptyList() : list, (i12 & 32) != 0 ? CollectionsKt.emptyList() : list2);
    }
}
