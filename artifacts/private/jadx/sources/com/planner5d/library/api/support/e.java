package com.planner5d.library.api.support;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f142357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f142358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f142359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f142360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f142361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f142362f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final String f142363g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final String f142364h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final String f142365i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final String f142366j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final String f142367k;

    public e(@NotNull String packageName, int i10, @NotNull String versionName, @NotNull String architecture, @NotNull String deviceType, @NotNull String deviceId, @NotNull String systemName, @NotNull String systemInfo, @NotNull String installationHash, @NotNull String language, @NotNull String region) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(architecture, "architecture");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(systemName, "systemName");
        Intrinsics.checkNotNullParameter(systemInfo, "systemInfo");
        Intrinsics.checkNotNullParameter(installationHash, "installationHash");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(region, "region");
        this.f142357a = packageName;
        this.f142358b = i10;
        this.f142359c = versionName;
        this.f142360d = architecture;
        this.f142361e = deviceType;
        this.f142362f = deviceId;
        this.f142363g = systemName;
        this.f142364h = systemInfo;
        this.f142365i = installationHash;
        this.f142366j = language;
        this.f142367k = region;
    }

    public static /* synthetic */ e m(e eVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = eVar.f142357a;
        }
        if ((i11 & 2) != 0) {
            i10 = eVar.f142358b;
        }
        if ((i11 & 4) != 0) {
            str2 = eVar.f142359c;
        }
        if ((i11 & 8) != 0) {
            str3 = eVar.f142360d;
        }
        if ((i11 & 16) != 0) {
            str4 = eVar.f142361e;
        }
        if ((i11 & 32) != 0) {
            str5 = eVar.f142362f;
        }
        if ((i11 & 64) != 0) {
            str6 = eVar.f142363g;
        }
        if ((i11 & 128) != 0) {
            str7 = eVar.f142364h;
        }
        if ((i11 & 256) != 0) {
            str8 = eVar.f142365i;
        }
        if ((i11 & 512) != 0) {
            str9 = eVar.f142366j;
        }
        if ((i11 & 1024) != 0) {
            str10 = eVar.f142367k;
        }
        String str11 = str9;
        String str12 = str10;
        String str13 = str7;
        String str14 = str8;
        String str15 = str5;
        String str16 = str6;
        String str17 = str4;
        String str18 = str2;
        return eVar.l(str, i10, str18, str3, str17, str15, str16, str13, str14, str11, str12);
    }

    @NotNull
    public final String a() {
        return this.f142357a;
    }

    @NotNull
    public final String b() {
        return this.f142366j;
    }

    @NotNull
    public final String c() {
        return this.f142367k;
    }

    public final int d() {
        return this.f142358b;
    }

    @NotNull
    public final String e() {
        return this.f142359c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f142357a, eVar.f142357a) && this.f142358b == eVar.f142358b && Intrinsics.areEqual(this.f142359c, eVar.f142359c) && Intrinsics.areEqual(this.f142360d, eVar.f142360d) && Intrinsics.areEqual(this.f142361e, eVar.f142361e) && Intrinsics.areEqual(this.f142362f, eVar.f142362f) && Intrinsics.areEqual(this.f142363g, eVar.f142363g) && Intrinsics.areEqual(this.f142364h, eVar.f142364h) && Intrinsics.areEqual(this.f142365i, eVar.f142365i) && Intrinsics.areEqual(this.f142366j, eVar.f142366j) && Intrinsics.areEqual(this.f142367k, eVar.f142367k);
    }

    @NotNull
    public final String f() {
        return this.f142360d;
    }

    @NotNull
    public final String g() {
        return this.f142361e;
    }

    @NotNull
    public final String h() {
        return this.f142362f;
    }

    public int hashCode() {
        return (((((((((((((((((((this.f142357a.hashCode() * 31) + Integer.hashCode(this.f142358b)) * 31) + this.f142359c.hashCode()) * 31) + this.f142360d.hashCode()) * 31) + this.f142361e.hashCode()) * 31) + this.f142362f.hashCode()) * 31) + this.f142363g.hashCode()) * 31) + this.f142364h.hashCode()) * 31) + this.f142365i.hashCode()) * 31) + this.f142366j.hashCode()) * 31) + this.f142367k.hashCode();
    }

    @NotNull
    public final String i() {
        return this.f142363g;
    }

    @NotNull
    public final String j() {
        return this.f142364h;
    }

    @NotNull
    public final String k() {
        return this.f142365i;
    }

    @NotNull
    public final e l(@NotNull String packageName, int i10, @NotNull String versionName, @NotNull String architecture, @NotNull String deviceType, @NotNull String deviceId, @NotNull String systemName, @NotNull String systemInfo, @NotNull String installationHash, @NotNull String language, @NotNull String region) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(architecture, "architecture");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(systemName, "systemName");
        Intrinsics.checkNotNullParameter(systemInfo, "systemInfo");
        Intrinsics.checkNotNullParameter(installationHash, "installationHash");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(region, "region");
        return new e(packageName, i10, versionName, architecture, deviceType, deviceId, systemName, systemInfo, installationHash, language, region);
    }

    @NotNull
    public final String n() {
        return this.f142360d;
    }

    @NotNull
    public final String o() {
        return this.f142362f;
    }

    @NotNull
    public final String p() {
        return this.f142361e;
    }

    @NotNull
    public final String q() {
        return this.f142365i;
    }

    @NotNull
    public final String r() {
        return this.f142366j;
    }

    @NotNull
    public final String s() {
        return this.f142357a;
    }

    @NotNull
    public final String t() {
        return this.f142367k;
    }

    @NotNull
    public String toString() {
        return "ClientInfo(packageName=" + this.f142357a + ", version=" + this.f142358b + ", versionName=" + this.f142359c + ", architecture=" + this.f142360d + ", deviceType=" + this.f142361e + ", deviceId=" + this.f142362f + ", systemName=" + this.f142363g + ", systemInfo=" + this.f142364h + ", installationHash=" + this.f142365i + ", language=" + this.f142366j + ", region=" + this.f142367k + ")";
    }

    @NotNull
    public final String u() {
        return this.f142364h;
    }

    @NotNull
    public final String v() {
        return this.f142363g;
    }

    public final int w() {
        return this.f142358b;
    }

    @NotNull
    public final String x() {
        return this.f142359c;
    }
}
