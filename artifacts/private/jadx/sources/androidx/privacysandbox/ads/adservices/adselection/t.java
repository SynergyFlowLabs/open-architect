package androidx.privacysandbox.ads.adservices.adselection;

import android.adservices.adselection.AdSelectionManager;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@e.a({"NewApi", "ClassVerificationFailure"})
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
@androidx.annotation.x0(extension = 31, version = 9)
public final class t extends e0 {
    /* JADX WARN: Illegal instructions before constructor call */
    public t(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        AdSelectionManager adSelectionManager = AdSelectionManager.get(context);
        Intrinsics.checkNotNullExpressionValue(adSelectionManager, "get(context)");
        super(adSelectionManager);
    }
}
