package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import androidx.annotation.b1;
import androidx.annotation.x0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@e.a({"NewApi", "ClassVerificationFailure"})
@b1({b1.a.LIBRARY})
@x0(extension = 31, version = 9)
public final class l extends v {
    /* JADX WARN: Illegal instructions before constructor call */
    public l(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        MeasurementManager measurementManager = MeasurementManager.get(context);
        Intrinsics.checkNotNullExpressionValue(measurementManager, "get(context)");
        super(measurementManager);
    }
}
