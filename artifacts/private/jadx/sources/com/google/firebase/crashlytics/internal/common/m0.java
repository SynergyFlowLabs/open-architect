package com.google.firebase.crashlytics.internal.common;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f121129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f121130b;

    public m0(@Nullable String str, @Nullable String str2) {
        this.f121129a = str;
        this.f121130b = str2;
    }

    public static /* synthetic */ m0 d(m0 m0Var, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = m0Var.f121129a;
        }
        if ((i10 & 2) != 0) {
            str2 = m0Var.f121130b;
        }
        return m0Var.c(str, str2);
    }

    @Nullable
    public final String a() {
        return this.f121129a;
    }

    @Nullable
    public final String b() {
        return this.f121130b;
    }

    @NotNull
    public final m0 c(@Nullable String str, @Nullable String str2) {
        return new m0(str, str2);
    }

    @Nullable
    public final String e() {
        return this.f121130b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return Intrinsics.areEqual(this.f121129a, m0Var.f121129a) && Intrinsics.areEqual(this.f121130b, m0Var.f121130b);
    }

    @Nullable
    public final String f() {
        return this.f121129a;
    }

    public int hashCode() {
        String str = this.f121129a;
        int iHashCode = 0;
        int iHashCode2 = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f121130b;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return iHashCode2 + iHashCode;
    }

    @NotNull
    public String toString() {
        return "FirebaseInstallationId(fid=" + this.f121129a + ", authToken=" + this.f121130b + ')';
    }
}
