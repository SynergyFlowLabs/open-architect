package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.WebSourceParams;
import android.net.Uri;
import androidx.annotation.x0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f73619c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Uri f73620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f73621b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @e.a({"ClassVerificationFailure", "NewApi"})
        @x0.a({@x0(extension = 1000000, version = 4), @x0(extension = 31, version = 9)})
        @NotNull
        public final List<WebSourceParams> a(@NotNull List<b0> request) {
            Intrinsics.checkNotNullParameter(request, "request");
            ArrayList arrayList = new ArrayList();
            for (b0 b0Var : request) {
                a0.a();
                WebSourceParams webSourceParamsBuild = z.a(b0Var.b()).setDebugKeyAllowed(b0Var.a()).build();
                Intrinsics.checkNotNullExpressionValue(webSourceParamsBuild, "Builder(param.registrati…                 .build()");
                arrayList.add(webSourceParamsBuild);
            }
            return arrayList;
        }

        private a() {
        }
    }

    public b0(@NotNull Uri registrationUri, boolean z10) {
        Intrinsics.checkNotNullParameter(registrationUri, "registrationUri");
        this.f73620a = registrationUri;
        this.f73621b = z10;
    }

    public final boolean a() {
        return this.f73621b;
    }

    @NotNull
    public final Uri b() {
        return this.f73620a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return Intrinsics.areEqual(this.f73620a, b0Var.f73620a) && this.f73621b == b0Var.f73621b;
    }

    public int hashCode() {
        return (this.f73620a.hashCode() * 31) + Boolean.hashCode(this.f73621b);
    }

    @NotNull
    public String toString() {
        return "WebSourceParams { RegistrationUri=" + this.f73620a + ", DebugKeyAllowed=" + this.f73621b + " }";
    }
}
