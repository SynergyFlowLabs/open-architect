package androidx.privacysandbox.ads.adservices.measurement;

import android.content.Context;
import androidx.annotation.b1;
import androidx.annotation.x0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@e.a({"NewApi", "ClassVerificationFailure"})
@b1({b1.a.LIBRARY})
@x0(extension = 1000000, version = 5)
public final class o extends v {
    /* JADX WARN: Illegal instructions before constructor call */
    public o(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService((Class<Object>) m.a());
        Intrinsics.checkNotNullExpressionValue(systemService, "context.getSystemService…ementManager::class.java)");
        super(n.a(systemService));
    }
}
