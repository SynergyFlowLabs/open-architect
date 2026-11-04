package sh;

import kotlin.enums.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public enum a {
    IdentifyProfile,
    TrackEvent,
    RegisterDeviceToken,
    DeletePushToken,
    TrackPushMetric,
    TrackDeliveryEvent;


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f376030h = c.c(k());

    static {
        int i10 = 5 | 4;
    }

    @NotNull
    public static kotlin.enums.a<a> l() {
        return f376030h;
    }
}
