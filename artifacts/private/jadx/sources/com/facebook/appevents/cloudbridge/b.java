package com.facebook.appevents.cloudbridge;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public enum b {
    ANON_ID("anon_id"),
    APP_USER_ID("app_user_id"),
    ADVERTISER_ID("advertiser_id"),
    PAGE_ID("page_id"),
    PAGE_SCOPED_USER_ID("page_scoped_user_id"),
    USER_DATA("ud"),
    ADV_TE("advertiser_tracking_enabled"),
    APP_TE("application_tracking_enabled"),
    CONSIDER_VIEWS("consider_views"),
    DEVICE_TOKEN("device_token"),
    EXT_INFO("extInfo"),
    INCLUDE_DWELL_DATA("include_dwell_data"),
    INCLUDE_VIDEO_DATA("include_video_data"),
    INSTALL_REFERRER("install_referrer"),
    INSTALLER_PACKAGE("installer_package"),
    RECEIPT_DATA("receipt_data"),
    URL_SCHEMES("url_schemes");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f98610b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f98628a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final b a(@NotNull String rawValue) {
            Intrinsics.checkNotNullParameter(rawValue, "rawValue");
            for (b bVar : b.valuesCustom()) {
                if (Intrinsics.areEqual(bVar.l(), rawValue)) {
                    return bVar;
                }
            }
            return null;
        }

        private a() {
        }
    }

    b(String str) {
        this.f98628a = str;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static b[] valuesCustom() {
        b[] bVarArrValuesCustom = values();
        return (b[]) Arrays.copyOf(bVarArrValuesCustom, bVarArrValuesCustom.length);
    }

    @NotNull
    public final String l() {
        return this.f98628a;
    }
}
