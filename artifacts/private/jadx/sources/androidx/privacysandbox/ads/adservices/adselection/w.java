package androidx.privacysandbox.ads.adservices.adselection;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@e.a({"NewApi", "ClassVerificationFailure"})
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
@androidx.annotation.x0(extension = 1000000, version = 4)
public final class w extends e0 {
    /* JADX WARN: Illegal instructions before constructor call */
    public w(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService((Class<Object>) u.a());
        Intrinsics.checkNotNullExpressionValue(systemService, "context.getSystemService…ctionManager::class.java)");
        super(v.a(systemService));
    }
}
