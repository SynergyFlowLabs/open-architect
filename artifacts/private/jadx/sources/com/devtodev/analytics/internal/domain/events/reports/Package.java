package com.devtodev.analytics.internal.domain.events.reports;

import com.devtodev.analytics.internal.logger.Logger;
import com.devtodev.analytics.internal.storage.sqlite.EventEntry;
import com.google.firebase.remoteconfig.e0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class Package {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private String appBuildVersion;

    @Nullable
    private String appVersion;

    @Nullable
    private String bundle;

    @Nullable
    private String engine;

    @Nullable
    private List<String> events;

    @NotNull
    private String installationSource;

    @NotNull
    private String language;
    private long sdkCodeVersion;

    @NotNull
    private String sdkVersion;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Package decode(@NotNull JSONObject json) {
            String str;
            String str2;
            String str3;
            String str4;
            long j10;
            String str5;
            String str6;
            String str7;
            ArrayList arrayList;
            String str8;
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                Object obj = json.get("language");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                str = (String) obj;
            } catch (Exception e10) {
                Logger.INSTANCE.error("", e10);
                str = "";
            }
            try {
                str2 = (String) json.get(e0.b.f124458s2);
            } catch (Exception e11) {
                Logger.INSTANCE.error("", e11);
                str2 = null;
            }
            try {
                str3 = (String) json.get("appBuildVersion");
            } catch (Exception e12) {
                Logger.INSTANCE.error("", e12);
                str3 = null;
            }
            try {
                Object obj2 = json.get(e0.b.f124461v2);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                str4 = (String) obj2;
            } catch (Exception e13) {
                Logger.INSTANCE.error("", e13);
                str4 = "";
            }
            try {
                j10 = json.getLong("sdkCodeVersion");
            } catch (Exception e14) {
                Logger.INSTANCE.error("", e14);
                j10 = 0;
            }
            try {
                Object obj3 = json.get("engine");
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
                str5 = (String) obj3;
            } catch (Exception e15) {
                Logger.INSTANCE.error("", e15);
                str5 = "";
            }
            try {
                if (json.isNull("installationSource")) {
                    str8 = "";
                } else {
                    Object obj4 = json.get("installationSource");
                    Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
                    str8 = (String) obj4;
                }
                str6 = str8;
            } catch (Exception e16) {
                Logger.INSTANCE.error("", e16);
                str6 = "";
            }
            try {
                str7 = (String) json.get("bundle");
            } catch (Exception e17) {
                Logger.INSTANCE.error("", e17);
                str7 = null;
            }
            try {
                JSONArray jSONArray = json.getJSONArray(EventEntry.tableName);
                ArrayList arrayList2 = new ArrayList();
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    arrayList2.add(jSONArray.get(i10).toString());
                }
                arrayList = arrayList2;
            } catch (Exception e18) {
                Logger.INSTANCE.error("", e18);
                arrayList = null;
            }
            return new Package(str, str2, str3, str4, j10, str7, str5, str6, arrayList);
        }

        private Companion() {
        }
    }

    public Package(@NotNull String language, @Nullable String str, @Nullable String str2, @NotNull String sdkVersion, long j10, @Nullable String str3, @Nullable String str4, @NotNull String installationSource, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(installationSource, "installationSource");
        this.language = language;
        this.appVersion = str;
        this.appBuildVersion = str2;
        this.sdkVersion = sdkVersion;
        this.sdkCodeVersion = j10;
        this.bundle = str3;
        this.engine = str4;
        this.installationSource = installationSource;
        this.events = list;
    }

    @Nullable
    public final String getAppBuildVersion() {
        return this.appBuildVersion;
    }

    @Nullable
    public final String getAppVersion() {
        return this.appVersion;
    }

    @Nullable
    public final String getBundle() {
        return this.bundle;
    }

    @Nullable
    public final String getEngine() {
        return this.engine;
    }

    @Nullable
    public final List<String> getEvents() {
        return this.events;
    }

    @NotNull
    public final String getInstallationSource() {
        return this.installationSource;
    }

    @NotNull
    public final String getLanguage() {
        return this.language;
    }

    public final long getSdkCodeVersion() {
        return this.sdkCodeVersion;
    }

    @NotNull
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final void setAppBuildVersion(@Nullable String str) {
        this.appBuildVersion = str;
    }

    public final void setAppVersion(@Nullable String str) {
        this.appVersion = str;
    }

    public final void setBundle(@Nullable String str) {
        this.bundle = str;
    }

    public final void setEngine(@Nullable String str) {
        this.engine = str;
    }

    public final void setEvents(@Nullable List<String> list) {
        this.events = list;
    }

    public final void setInstallationSource(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.installationSource = str;
    }

    public final void setLanguage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.language = str;
    }

    public final void setSdkCodeVersion(long j10) {
        this.sdkCodeVersion = j10;
    }

    public final void setSdkVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sdkVersion = str;
    }

    public /* synthetic */ Package(String str, String str2, String str3, String str4, long j10, String str5, String str6, String str7, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, j10, str5, str6, (i10 & 128) != 0 ? "" : str7, list);
    }
}
