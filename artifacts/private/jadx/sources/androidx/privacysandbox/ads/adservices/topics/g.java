package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import androidx.annotation.b1;
import androidx.annotation.x0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@e.a({"ClassVerificationFailure"})
@b1({b1.a.LIBRARY})
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g f73692a = new g();

    private g() {
    }

    @x0.a({@x0(extension = 1000000, version = 5), @x0(extension = 31, version = 9)})
    @NotNull
    public final GetTopicsRequest a(@NotNull b request) {
        Intrinsics.checkNotNullParameter(request, "request");
        GetTopicsRequest getTopicsRequestBuild = f.a().setAdsSdkName(request.a()).setShouldRecordObservation(request.b()).build();
        Intrinsics.checkNotNullExpressionValue(getTopicsRequestBuild, "Builder()\n            .s…ion)\n            .build()");
        return getTopicsRequestBuild;
    }

    @x0.a({@x0(extension = 1000000, version = 4), @x0(extension = 31, version = 9)})
    @NotNull
    public final GetTopicsRequest b(@NotNull b request) {
        Intrinsics.checkNotNullParameter(request, "request");
        GetTopicsRequest getTopicsRequestBuild = f.a().setAdsSdkName(request.a()).build();
        Intrinsics.checkNotNullExpressionValue(getTopicsRequestBuild, "Builder()\n            .s…ame)\n            .build()");
        return getTopicsRequestBuild;
    }
}
