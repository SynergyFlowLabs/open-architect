package com.google.firebase.sessions;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f124839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f124840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f124841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f124842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final k0 f124843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final List<k0> f124844f;

    public a(@NotNull String packageName, @NotNull String versionName, @NotNull String appBuildVersion, @NotNull String deviceManufacturer, @NotNull k0 currentProcessDetails, @NotNull List<k0> appProcessDetails) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(appBuildVersion, "appBuildVersion");
        Intrinsics.checkNotNullParameter(deviceManufacturer, "deviceManufacturer");
        Intrinsics.checkNotNullParameter(currentProcessDetails, "currentProcessDetails");
        Intrinsics.checkNotNullParameter(appProcessDetails, "appProcessDetails");
        this.f124839a = packageName;
        this.f124840b = versionName;
        this.f124841c = appBuildVersion;
        this.f124842d = deviceManufacturer;
        this.f124843e = currentProcessDetails;
        this.f124844f = appProcessDetails;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a h(a aVar, String str, String str2, String str3, String str4, k0 k0Var, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = aVar.f124839a;
        }
        if ((i10 & 2) != 0) {
            str2 = aVar.f124840b;
        }
        if ((i10 & 4) != 0) {
            str3 = aVar.f124841c;
        }
        if ((i10 & 8) != 0) {
            str4 = aVar.f124842d;
        }
        if ((i10 & 16) != 0) {
            k0Var = aVar.f124843e;
        }
        if ((i10 & 32) != 0) {
            list = aVar.f124844f;
        }
        k0 k0Var2 = k0Var;
        List list2 = list;
        return aVar.g(str, str2, str3, str4, k0Var2, list2);
    }

    @NotNull
    public final String a() {
        return this.f124839a;
    }

    @NotNull
    public final String b() {
        return this.f124840b;
    }

    @NotNull
    public final String c() {
        return this.f124841c;
    }

    @NotNull
    public final String d() {
        return this.f124842d;
    }

    @NotNull
    public final k0 e() {
        return this.f124843e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f124839a, aVar.f124839a) && Intrinsics.areEqual(this.f124840b, aVar.f124840b) && Intrinsics.areEqual(this.f124841c, aVar.f124841c) && Intrinsics.areEqual(this.f124842d, aVar.f124842d) && Intrinsics.areEqual(this.f124843e, aVar.f124843e) && Intrinsics.areEqual(this.f124844f, aVar.f124844f);
    }

    @NotNull
    public final List<k0> f() {
        return this.f124844f;
    }

    @NotNull
    public final a g(@NotNull String packageName, @NotNull String versionName, @NotNull String appBuildVersion, @NotNull String deviceManufacturer, @NotNull k0 currentProcessDetails, @NotNull List<k0> appProcessDetails) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(appBuildVersion, "appBuildVersion");
        Intrinsics.checkNotNullParameter(deviceManufacturer, "deviceManufacturer");
        Intrinsics.checkNotNullParameter(currentProcessDetails, "currentProcessDetails");
        Intrinsics.checkNotNullParameter(appProcessDetails, "appProcessDetails");
        return new a(packageName, versionName, appBuildVersion, deviceManufacturer, currentProcessDetails, appProcessDetails);
    }

    public int hashCode() {
        return (((((((((this.f124839a.hashCode() * 31) + this.f124840b.hashCode()) * 31) + this.f124841c.hashCode()) * 31) + this.f124842d.hashCode()) * 31) + this.f124843e.hashCode()) * 31) + this.f124844f.hashCode();
    }

    @NotNull
    public final String i() {
        return this.f124841c;
    }

    @NotNull
    public final List<k0> j() {
        return this.f124844f;
    }

    @NotNull
    public final k0 k() {
        return this.f124843e;
    }

    @NotNull
    public final String l() {
        return this.f124842d;
    }

    @NotNull
    public final String m() {
        return this.f124839a;
    }

    @NotNull
    public final String n() {
        return this.f124840b;
    }

    @NotNull
    public String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f124839a + ", versionName=" + this.f124840b + ", appBuildVersion=" + this.f124841c + ", deviceManufacturer=" + this.f124842d + ", currentProcessDetails=" + this.f124843e + ", appProcessDetails=" + this.f124844f + ')';
    }
}
