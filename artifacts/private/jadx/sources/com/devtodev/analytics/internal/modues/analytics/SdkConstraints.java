package com.devtodev.analytics.internal.modues.analytics;

import com.devtodev.analytics.BuildConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class SdkConstraints {
    private static double abConfigWaiting;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static String sdkVersion = BuildConfig.VERSION_NAME;
    private static double abGroupWaiting = 10.0d;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final double getAbConfigWaiting() {
            return SdkConstraints.abConfigWaiting;
        }

        public final double getAbGroupWaiting() {
            return SdkConstraints.abGroupWaiting;
        }

        @NotNull
        public final String getSdkVersion() {
            return SdkConstraints.sdkVersion;
        }

        public final void setAbConfigWaiting(double d10) {
            SdkConstraints.abConfigWaiting = d10;
        }

        public final void setAbGroupWaiting(double d10) {
            SdkConstraints.abGroupWaiting = d10;
        }

        public final void setSdkVersion(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            SdkConstraints.sdkVersion = str;
        }

        private Companion() {
        }
    }
}
