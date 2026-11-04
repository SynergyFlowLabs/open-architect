package com.devtodev.analytics.internal.platform.repository.android;

import android.os.Build;
import com.devtodev.analytics.internal.platform.repository.utils.Root;
import java.util.Date;
import java.util.TimeZone;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class AndroidConstants {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int MILLISECONDS = 1000;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @NotNull
    public final String getDeviceVersionKey() {
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        return RELEASE;
    }

    @NotNull
    public final String getManufacturer() {
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        return MANUFACTURER;
    }

    @NotNull
    public final String getModel() {
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        return MODEL;
    }

    public final int getTimezoneOffset() {
        return TimeZone.getDefault().getOffset(new Date().getTime()) / 1000;
    }

    public final boolean isRooted() {
        return Root.Companion.isDeviceRooted();
    }
}
