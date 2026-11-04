package com.devtodev.analytics.internal.platform.repository;

import com.devtodev.analytics.internal.platform.repository.android.AndroidConstants;
import com.devtodev.analytics.internal.platform.repository.android.AndroidContextAPI;
import com.devtodev.analytics.internal.platform.repository.android.Resolution;
import com.devtodev.analytics.internal.platform.repository.utils.DevToDevUdid;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class DeviceRepository implements IDeviceRepository {

    @NotNull
    private static final String ANDROID_OS_KEY = "Android";

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final float DEFAULT_DENSITY = 160.0f;

    @NotNull
    private final AndroidConstants androidConstants;

    @NotNull
    private final AndroidContextAPI androidContextAPI;

    @NotNull
    private final DevToDevUdid devToDevUdid;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DeviceRepository(@NotNull AndroidConstants androidConstants, @NotNull AndroidContextAPI androidContextAPI, @NotNull DevToDevUdid devToDevUdid) {
        Intrinsics.checkNotNullParameter(androidConstants, "androidConstants");
        Intrinsics.checkNotNullParameter(androidContextAPI, "androidContextAPI");
        Intrinsics.checkNotNullParameter(devToDevUdid, "devToDevUdid");
        this.androidConstants = androidConstants;
        this.androidContextAPI = androidContextAPI;
        this.devToDevUdid = devToDevUdid;
    }

    private final DeviceType deviceByScreen() {
        double screenInches = getScreenInches();
        if (screenInches == 0.0d) {
            return DeviceType.UNKNOWN;
        }
        if (screenInches > 0.0d && screenInches <= 2.0d) {
            return DeviceType.WATCH;
        }
        if (screenInches <= 2.0d || screenInches > 7.0d) {
            return (screenInches <= 7.0d || screenInches > 20.0d) ? DeviceType.TV : DeviceType.TABLET;
        }
        return DeviceType.PHONE;
    }

    private final double round(double d10) {
        double dPow = (long) Math.pow(10.0d, 2);
        return b.M0(d10 * dPow) / dPow;
    }

    @Override // com.devtodev.analytics.internal.platform.repository.IDeviceRepository
    @NotNull
    public String getAndroidId() {
        return this.androidContextAPI.getAndroidId();
    }

    @Override // com.devtodev.analytics.internal.platform.repository.IDeviceRepository
    public int getDeviceType() {
        DeviceType deviceTypeDeviceByScreen;
        if (this.androidContextAPI.isSimulator()) {
            deviceTypeDeviceByScreen = DeviceType.SIMULATOR;
        } else if (this.androidContextAPI.isWatch()) {
            deviceTypeDeviceByScreen = DeviceType.WATCH;
        } else if (this.androidContextAPI.hasSensorHingeAngle()) {
            deviceTypeDeviceByScreen = DeviceType.PHONE;
        } else {
            deviceTypeDeviceByScreen = this.androidContextAPI.isTV() ? DeviceType.TV : deviceByScreen();
        }
        return deviceTypeDeviceByScreen.getType();
    }

    @Override // com.devtodev.analytics.internal.platform.repository.IDeviceRepository
    @NotNull
    public String getDeviceVersionKey() {
        return this.androidConstants.getDeviceVersionKey();
    }

    @Override // com.devtodev.analytics.internal.platform.repository.IDeviceRepository
    @NotNull
    public String getDevtodevUDID() {
        return this.devToDevUdid.getCustomUDID();
    }

    @Override // com.devtodev.analytics.internal.platform.repository.IDeviceRepository
    @NotNull
    public String getLanguage() {
        return this.androidContextAPI.getLocale();
    }

    @Override // com.devtodev.analytics.internal.platform.repository.IDeviceRepository
    @NotNull
    public String getMacAddress() {
        return this.androidContextAPI.getMacAddress();
    }

    @Override // com.devtodev.analytics.internal.platform.repository.IDeviceRepository
    @NotNull
    public String getManufacturer() {
        return this.androidConstants.getManufacturer();
    }

    @Override // com.devtodev.analytics.internal.platform.repository.IDeviceRepository
    @NotNull
    public String getModel() {
        return this.androidConstants.getModel();
    }

    @Override // com.devtodev.analytics.internal.platform.repository.IDeviceRepository
    @NotNull
    public String getODIN() {
        return this.androidContextAPI.getODIN();
    }

    @Override // com.devtodev.analytics.internal.platform.repository.IDeviceRepository
    @NotNull
    public String getOsKey() {
        return ANDROID_OS_KEY;
    }

    @Override // com.devtodev.analytics.internal.platform.repository.IDeviceRepository
    public int getScreenDPI() {
        return (int) (this.androidContextAPI.getMetricsDensity() * DEFAULT_DENSITY);
    }

    @Override // com.devtodev.analytics.internal.platform.repository.IDeviceRepository
    public double getScreenInches() {
        Resolution windowServiceScreenResolution = this.androidContextAPI.getWindowServiceScreenResolution();
        double x10 = ((double) windowServiceScreenResolution.getX()) / this.androidContextAPI.getMetricsXDPI();
        double y10 = ((double) windowServiceScreenResolution.getY()) / this.androidContextAPI.getMetricsYDPI();
        return round(Math.sqrt(Math.pow(y10, 2.0d) + Math.pow(x10, 2.0d)));
    }

    @Override // com.devtodev.analytics.internal.platform.repository.IDeviceRepository
    @NotNull
    public String getScreenResolution() {
        Resolution windowServiceScreenResolution = this.androidContextAPI.getWindowServiceScreenResolution();
        Resolution resolution = new Resolution(Math.max(windowServiceScreenResolution.getX(), windowServiceScreenResolution.getY()), Math.min(windowServiceScreenResolution.getX(), windowServiceScreenResolution.getY()));
        return resolution.getX() + "x" + resolution.getY();
    }

    @Override // com.devtodev.analytics.internal.platform.repository.IDeviceRepository
    public int getTimezoneOffset() {
        return this.androidConstants.getTimezoneOffset();
    }

    @Override // com.devtodev.analytics.internal.platform.repository.IDeviceRepository
    @NotNull
    public String getUserAgent() {
        return this.androidContextAPI.getUserAgent();
    }

    @Override // com.devtodev.analytics.internal.platform.repository.IDeviceRepository
    public boolean isRooted() {
        return this.androidConstants.isRooted();
    }
}
