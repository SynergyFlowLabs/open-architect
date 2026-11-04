package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.net.Uri;
import androidx.annotation.x0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<o0> f73658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Uri f73659b;

    public s0(@NotNull List<o0> webTriggerParams, @NotNull Uri destination) {
        Intrinsics.checkNotNullParameter(webTriggerParams, "webTriggerParams");
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f73658a = webTriggerParams;
        this.f73659b = destination;
    }

    @e.a({"ClassVerificationFailure", "NewApi"})
    @x0.a({@x0(extension = 1000000, version = 4), @x0(extension = 31, version = 9)})
    @NotNull
    public final WebTriggerRegistrationRequest a() {
        r0.a();
        WebTriggerRegistrationRequest webTriggerRegistrationRequestBuild = q0.a(o0.f73655c.a(this.f73658a), this.f73659b).build();
        Intrinsics.checkNotNullExpressionValue(webTriggerRegistrationRequestBuild, "Builder(\n               …   )\n            .build()");
        return webTriggerRegistrationRequestBuild;
    }

    @NotNull
    public final Uri b() {
        return this.f73659b;
    }

    @NotNull
    public final List<o0> c() {
        return this.f73658a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return Intrinsics.areEqual(this.f73658a, s0Var.f73658a) && Intrinsics.areEqual(this.f73659b, s0Var.f73659b);
    }

    public int hashCode() {
        return (this.f73658a.hashCode() * 31) + this.f73659b.hashCode();
    }

    @NotNull
    public String toString() {
        return "WebTriggerRegistrationRequest { WebTriggerParams=" + this.f73658a + ", Destination=" + this.f73659b;
    }
}
