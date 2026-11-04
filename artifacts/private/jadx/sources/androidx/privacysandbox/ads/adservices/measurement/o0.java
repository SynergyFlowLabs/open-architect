package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.WebTriggerParams;
import android.net.Uri;
import androidx.annotation.x0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f73655c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Uri f73656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f73657b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @e.a({"ClassVerificationFailure", "NewApi"})
        @x0.a({@x0(extension = 1000000, version = 4), @x0(extension = 31, version = 9)})
        @NotNull
        public final List<WebTriggerParams> a(@NotNull List<o0> request) {
            Intrinsics.checkNotNullParameter(request, "request");
            ArrayList arrayList = new ArrayList();
            for (o0 o0Var : request) {
                n0.a();
                WebTriggerParams webTriggerParamsBuild = m0.a(o0Var.b()).setDebugKeyAllowed(o0Var.a()).build();
                Intrinsics.checkNotNullExpressionValue(webTriggerParamsBuild, "Builder(param.registrati…                 .build()");
                arrayList.add(webTriggerParamsBuild);
            }
            return arrayList;
        }

        private a() {
        }
    }

    public o0(@NotNull Uri registrationUri, boolean z10) {
        Intrinsics.checkNotNullParameter(registrationUri, "registrationUri");
        this.f73656a = registrationUri;
        this.f73657b = z10;
    }

    public final boolean a() {
        return this.f73657b;
    }

    @NotNull
    public final Uri b() {
        return this.f73656a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return Intrinsics.areEqual(this.f73656a, o0Var.f73656a) && this.f73657b == o0Var.f73657b;
    }

    public int hashCode() {
        return (this.f73656a.hashCode() * 31) + Boolean.hashCode(this.f73657b);
    }

    @NotNull
    public String toString() {
        return "WebTriggerParams { RegistrationUri=" + this.f73656a + ", DebugKeyAllowed=" + this.f73657b + " }";
    }
}
