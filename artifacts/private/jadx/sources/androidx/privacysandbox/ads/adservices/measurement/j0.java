package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.WebSourceRegistrationRequest;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.x0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<b0> f73643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Uri f73644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final InputEvent f73645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Uri f73646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final Uri f73647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final Uri f73648f;

    @SourceDebugExtension({"SMAP\nWebSourceRegistrationRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSourceRegistrationRequest.kt\nandroidx/privacysandbox/ads/adservices/measurement/WebSourceRegistrationRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,181:1\n1#2:182\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<b0> f73649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Uri f73650b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private InputEvent f73651c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private Uri f73652d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private Uri f73653e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private Uri f73654f;

        public a(@NotNull List<b0> webSourceParams, @NotNull Uri topOriginUri) {
            Intrinsics.checkNotNullParameter(webSourceParams, "webSourceParams");
            Intrinsics.checkNotNullParameter(topOriginUri, "topOriginUri");
            this.f73649a = webSourceParams;
            this.f73650b = topOriginUri;
        }

        @NotNull
        public final j0 a() {
            return new j0(this.f73649a, this.f73650b, this.f73651c, this.f73652d, this.f73653e, this.f73654f);
        }

        @NotNull
        public final a b(@Nullable Uri uri) {
            this.f73652d = uri;
            return this;
        }

        @NotNull
        public final a c(@NotNull InputEvent inputEvent) {
            Intrinsics.checkNotNullParameter(inputEvent, "inputEvent");
            this.f73651c = inputEvent;
            return this;
        }

        @NotNull
        public final a d(@Nullable Uri uri) {
            this.f73654f = uri;
            return this;
        }

        @NotNull
        public final a e(@Nullable Uri uri) {
            this.f73653e = uri;
            return this;
        }
    }

    public j0(@NotNull List<b0> webSourceParams, @NotNull Uri topOriginUri, @Nullable InputEvent inputEvent, @Nullable Uri uri, @Nullable Uri uri2, @Nullable Uri uri3) {
        Intrinsics.checkNotNullParameter(webSourceParams, "webSourceParams");
        Intrinsics.checkNotNullParameter(topOriginUri, "topOriginUri");
        this.f73643a = webSourceParams;
        this.f73644b = topOriginUri;
        this.f73645c = inputEvent;
        this.f73646d = uri;
        this.f73647e = uri2;
        this.f73648f = uri3;
    }

    @e.a({"ClassVerificationFailure", "NewApi"})
    @x0.a({@x0(extension = 1000000, version = 4), @x0(extension = 31, version = 9)})
    @NotNull
    public final WebSourceRegistrationRequest a() {
        i0.a();
        WebSourceRegistrationRequest webSourceRegistrationRequestBuild = h0.a(b0.f73619c.a(this.f73643a), this.f73644b).setWebDestination(this.f73647e).setAppDestination(this.f73646d).setInputEvent(this.f73645c).setVerifiedDestination(this.f73648f).build();
        Intrinsics.checkNotNullExpressionValue(webSourceRegistrationRequestBuild, "Builder(\n               …ion)\n            .build()");
        return webSourceRegistrationRequestBuild;
    }

    @Nullable
    public final Uri b() {
        return this.f73646d;
    }

    @Nullable
    public final InputEvent c() {
        return this.f73645c;
    }

    @NotNull
    public final Uri d() {
        return this.f73644b;
    }

    @Nullable
    public final Uri e() {
        return this.f73648f;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return Intrinsics.areEqual(this.f73643a, j0Var.f73643a) && Intrinsics.areEqual(this.f73647e, j0Var.f73647e) && Intrinsics.areEqual(this.f73646d, j0Var.f73646d) && Intrinsics.areEqual(this.f73644b, j0Var.f73644b) && Intrinsics.areEqual(this.f73645c, j0Var.f73645c) && Intrinsics.areEqual(this.f73648f, j0Var.f73648f);
    }

    @Nullable
    public final Uri f() {
        return this.f73647e;
    }

    @NotNull
    public final List<b0> g() {
        return this.f73643a;
    }

    public int hashCode() {
        int iHashCode = (this.f73643a.hashCode() * 31) + this.f73644b.hashCode();
        InputEvent inputEvent = this.f73645c;
        if (inputEvent != null) {
            iHashCode = (iHashCode * 31) + inputEvent.hashCode();
        }
        Uri uri = this.f73646d;
        if (uri != null) {
            iHashCode = (iHashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.f73647e;
        if (uri2 != null) {
            iHashCode = (iHashCode * 31) + uri2.hashCode();
        }
        int iHashCode2 = (iHashCode * 31) + this.f73644b.hashCode();
        InputEvent inputEvent2 = this.f73645c;
        if (inputEvent2 != null) {
            iHashCode2 = (iHashCode2 * 31) + inputEvent2.hashCode();
        }
        Uri uri3 = this.f73648f;
        return uri3 != null ? (iHashCode2 * 31) + uri3.hashCode() : iHashCode2;
    }

    @NotNull
    public String toString() {
        return "WebSourceRegistrationRequest { " + ("WebSourceParams=[" + this.f73643a + "], TopOriginUri=" + this.f73644b + ", InputEvent=" + this.f73645c + ", AppDestination=" + this.f73646d + ", WebDestination=" + this.f73647e + ", VerifiedDestination=" + this.f73648f) + " }";
    }

    public /* synthetic */ j0(List list, Uri uri, InputEvent inputEvent, Uri uri2, Uri uri3, Uri uri4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, uri, (i10 & 4) != 0 ? null : inputEvent, (i10 & 8) != 0 ? null : uri2, (i10 & 16) != 0 ? null : uri3, (i10 & 32) != 0 ? null : uri4);
    }
}
