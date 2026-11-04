package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.TopicsManager;
import android.content.Context;
import androidx.annotation.b1;
import androidx.annotation.x0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@e.a({"NewApi", "ClassVerificationFailure"})
@b1({b1.a.LIBRARY})
@x0(extension = 31, version = 11)
public final class w extends f0 {
    /* JADX WARN: Illegal instructions before constructor call */
    public w(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        TopicsManager topicsManager = TopicsManager.get(context);
        Intrinsics.checkNotNullExpressionValue(topicsManager, "get(context)");
        super(topicsManager);
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.f0
    @NotNull
    public GetTopicsRequest e(@NotNull b request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return g.f73692a.a(request);
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.f0
    @androidx.privacysandbox.ads.adservices.common.q.b
    @NotNull
    public h f(@NotNull GetTopicsResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return s.f73695a.b(response);
    }
}
