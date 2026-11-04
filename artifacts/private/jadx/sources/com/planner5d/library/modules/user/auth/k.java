package com.planner5d.library.modules.user.auth;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@w0(parameters = 1)
public final class k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f222904e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f222905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f222906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f222907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f222908d;

    public k(boolean z10, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.f222905a = z10;
        this.f222906b = str;
        this.f222907c = str2;
        this.f222908d = str3;
    }

    public static /* synthetic */ k f(k kVar, boolean z10, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = kVar.f222905a;
        }
        if ((i10 & 2) != 0) {
            str = kVar.f222906b;
        }
        if ((i10 & 4) != 0) {
            str2 = kVar.f222907c;
        }
        if ((i10 & 8) != 0) {
            str3 = kVar.f222908d;
        }
        return kVar.e(z10, str, str2, str3);
    }

    public final boolean a() {
        return this.f222905a;
    }

    @Nullable
    public final String b() {
        return this.f222906b;
    }

    @Nullable
    public final String c() {
        return this.f222907c;
    }

    @Nullable
    public final String d() {
        return this.f222908d;
    }

    @NotNull
    public final k e(boolean z10, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new k(z10, str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f222905a == kVar.f222905a && Intrinsics.areEqual(this.f222906b, kVar.f222906b) && Intrinsics.areEqual(this.f222907c, kVar.f222907c) && Intrinsics.areEqual(this.f222908d, kVar.f222908d);
    }

    @Nullable
    public final String g() {
        return this.f222908d;
    }

    public final boolean h() {
        return this.f222905a;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.f222905a) * 31;
        String str = this.f222906b;
        int iHashCode2 = 0;
        int iHashCode3 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f222907c;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f222908d;
        if (str3 != null) {
            iHashCode2 = str3.hashCode();
        }
        return iHashCode4 + iHashCode2;
    }

    @Nullable
    public final String i() {
        return this.f222907c;
    }

    @Nullable
    public final String j() {
        return this.f222906b;
    }

    @NotNull
    public String toString() {
        return "SocialAuthResult(signUp=" + this.f222905a + ", userId=" + this.f222906b + ", token=" + this.f222907c + ", name=" + this.f222908d + ")";
    }
}
