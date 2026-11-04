package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import android.content.Context;
import androidx.annotation.b1;
import androidx.annotation.x0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@e.a({"NewApi", "ClassVerificationFailure"})
@b1({b1.a.LIBRARY})
@x0(extension = 1000000, version = 5)
public final class c0 extends f0 {
    /* JADX WARN: Illegal instructions before constructor call */
    public c0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService((Class<Object>) y.a());
        Intrinsics.checkNotNullExpressionValue(systemService, "context.getSystemService…opicsManager::class.java)");
        super(z.a(systemService));
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.f0
    @NotNull
    public GetTopicsRequest e(@NotNull b request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return g.f73692a.a(request);
    }
}
