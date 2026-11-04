package androidx.privacysandbox.ads.adservices.customaudience;

import android.adservices.customaudience.CustomAudienceManager;
import android.content.Context;
import androidx.annotation.b1;
import androidx.annotation.x0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@e.a({"NewApi", "ClassVerificationFailure"})
@b1({b1.a.LIBRARY})
@x0(extension = 31, version = 9)
public final class d extends g0 {
    /* JADX WARN: Illegal instructions before constructor call */
    public d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        CustomAudienceManager customAudienceManager = CustomAudienceManager.get(context);
        Intrinsics.checkNotNullExpressionValue(customAudienceManager, "get(context)");
        super(customAudienceManager);
    }
}
