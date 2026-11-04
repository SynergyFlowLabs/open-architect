package androidx.privacysandbox.ads.adservices.appsetid;

import android.content.Context;
import androidx.annotation.b1;
import androidx.annotation.x0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@e.a({"NewApi", "ClassVerificationFailure"})
@b1({b1.a.LIBRARY})
@x0(extension = 1000000, version = 4)
public final class g extends l {
    /* JADX WARN: Illegal instructions before constructor call */
    public g(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService((Class<Object>) e.a());
        Intrinsics.checkNotNullExpressionValue(systemService, "context.getSystemService…SetIdManager::class.java)");
        super(f.a(systemService));
    }
}
