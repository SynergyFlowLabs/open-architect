package androidx.privacysandbox.ads.adservices.topics;

import android.content.Context;
import androidx.annotation.b1;
import androidx.annotation.x0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@e.a({"NewApi", "ClassVerificationFailure"})
@b1({b1.a.LIBRARY})
@x0(extension = 1000000, version = 4)
public final class b0 extends f0 {
    /* JADX WARN: Illegal instructions before constructor call */
    public b0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService((Class<Object>) y.a());
        Intrinsics.checkNotNullExpressionValue(systemService, "context.getSystemService…opicsManager::class.java)");
        super(z.a(systemService));
    }
}
