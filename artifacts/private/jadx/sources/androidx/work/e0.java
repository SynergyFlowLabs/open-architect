package androidx.work;

import androidx.annotation.w0;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 {
    public static final /* synthetic */ <W extends u> d0.a a(long j10, TimeUnit repeatIntervalTimeUnit) {
        Intrinsics.checkNotNullParameter(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.U4);
        return new d0.a((Class<? extends u>) u.class, j10, repeatIntervalTimeUnit);
    }

    public static final /* synthetic */ <W extends u> d0.a b(long j10, TimeUnit repeatIntervalTimeUnit, long j11, TimeUnit flexTimeIntervalUnit) {
        Intrinsics.checkNotNullParameter(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
        Intrinsics.checkNotNullParameter(flexTimeIntervalUnit, "flexTimeIntervalUnit");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.U4);
        return new d0.a(u.class, j10, repeatIntervalTimeUnit, j11, flexTimeIntervalUnit);
    }

    @w0(26)
    public static final /* synthetic */ <W extends u> d0.a c(Duration repeatInterval) {
        Intrinsics.checkNotNullParameter(repeatInterval, "repeatInterval");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.U4);
        return new d0.a(u.class, repeatInterval);
    }

    @w0(26)
    public static final /* synthetic */ <W extends u> d0.a d(Duration repeatInterval, Duration flexTimeInterval) {
        Intrinsics.checkNotNullParameter(repeatInterval, "repeatInterval");
        Intrinsics.checkNotNullParameter(flexTimeInterval, "flexTimeInterval");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.U4);
        return new d0.a((Class<? extends u>) u.class, repeatInterval, flexTimeInterval);
    }
}
