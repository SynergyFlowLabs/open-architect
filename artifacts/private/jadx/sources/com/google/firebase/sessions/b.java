package com.google.firebase.sessions;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f124872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f124873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f124874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f124875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final d0 f124876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final a f124877f;

    public b(@NotNull String appId, @NotNull String deviceModel, @NotNull String sessionSdkVersion, @NotNull String osVersion, @NotNull d0 logEnvironment, @NotNull a androidAppInfo) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(sessionSdkVersion, "sessionSdkVersion");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(logEnvironment, "logEnvironment");
        Intrinsics.checkNotNullParameter(androidAppInfo, "androidAppInfo");
        this.f124872a = appId;
        this.f124873b = deviceModel;
        this.f124874c = sessionSdkVersion;
        this.f124875d = osVersion;
        this.f124876e = logEnvironment;
        this.f124877f = androidAppInfo;
    }

    public static /* synthetic */ b h(b bVar, String str, String str2, String str3, String str4, d0 d0Var, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bVar.f124872a;
        }
        if ((i10 & 2) != 0) {
            str2 = bVar.f124873b;
        }
        if ((i10 & 4) != 0) {
            str3 = bVar.f124874c;
        }
        if ((i10 & 8) != 0) {
            str4 = bVar.f124875d;
        }
        if ((i10 & 16) != 0) {
            d0Var = bVar.f124876e;
        }
        if ((i10 & 32) != 0) {
            aVar = bVar.f124877f;
        }
        d0 d0Var2 = d0Var;
        a aVar2 = aVar;
        return bVar.g(str, str2, str3, str4, d0Var2, aVar2);
    }

    @NotNull
    public final String a() {
        return this.f124872a;
    }

    @NotNull
    public final String b() {
        return this.f124873b;
    }

    @NotNull
    public final String c() {
        return this.f124874c;
    }

    @NotNull
    public final String d() {
        return this.f124875d;
    }

    @NotNull
    public final d0 e() {
        return this.f124876e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f124872a, bVar.f124872a) && Intrinsics.areEqual(this.f124873b, bVar.f124873b) && Intrinsics.areEqual(this.f124874c, bVar.f124874c) && Intrinsics.areEqual(this.f124875d, bVar.f124875d) && this.f124876e == bVar.f124876e && Intrinsics.areEqual(this.f124877f, bVar.f124877f);
    }

    @NotNull
    public final a f() {
        return this.f124877f;
    }

    @NotNull
    public final b g(@NotNull String appId, @NotNull String deviceModel, @NotNull String sessionSdkVersion, @NotNull String osVersion, @NotNull d0 logEnvironment, @NotNull a androidAppInfo) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(sessionSdkVersion, "sessionSdkVersion");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(logEnvironment, "logEnvironment");
        Intrinsics.checkNotNullParameter(androidAppInfo, "androidAppInfo");
        return new b(appId, deviceModel, sessionSdkVersion, osVersion, logEnvironment, androidAppInfo);
    }

    public int hashCode() {
        return (((((((((this.f124872a.hashCode() * 31) + this.f124873b.hashCode()) * 31) + this.f124874c.hashCode()) * 31) + this.f124875d.hashCode()) * 31) + this.f124876e.hashCode()) * 31) + this.f124877f.hashCode();
    }

    @NotNull
    public final a i() {
        return this.f124877f;
    }

    @NotNull
    public final String j() {
        return this.f124872a;
    }

    @NotNull
    public final String k() {
        return this.f124873b;
    }

    @NotNull
    public final d0 l() {
        return this.f124876e;
    }

    @NotNull
    public final String m() {
        return this.f124875d;
    }

    @NotNull
    public final String n() {
        return this.f124874c;
    }

    @NotNull
    public String toString() {
        return "ApplicationInfo(appId=" + this.f124872a + ", deviceModel=" + this.f124873b + ", sessionSdkVersion=" + this.f124874c + ", osVersion=" + this.f124875d + ", logEnvironment=" + this.f124876e + ", androidAppInfo=" + this.f124877f + ')';
    }
}
