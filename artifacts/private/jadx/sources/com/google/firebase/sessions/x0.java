package com.google.firebase.sessions;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f125196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f125197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f125198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f125199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final g f125200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f125201f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final String f125202g;

    public x0(@NotNull String sessionId, @NotNull String firstSessionId, int i10, long j10, @NotNull g dataCollectionStatus, @NotNull String firebaseInstallationId, @NotNull String firebaseAuthenticationToken) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(firstSessionId, "firstSessionId");
        Intrinsics.checkNotNullParameter(dataCollectionStatus, "dataCollectionStatus");
        Intrinsics.checkNotNullParameter(firebaseInstallationId, "firebaseInstallationId");
        Intrinsics.checkNotNullParameter(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.f125196a = sessionId;
        this.f125197b = firstSessionId;
        this.f125198c = i10;
        this.f125199d = j10;
        this.f125200e = dataCollectionStatus;
        this.f125201f = firebaseInstallationId;
        this.f125202g = firebaseAuthenticationToken;
    }

    public static /* synthetic */ x0 i(x0 x0Var, String str, String str2, int i10, long j10, g gVar, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = x0Var.f125196a;
        }
        if ((i11 & 2) != 0) {
            str2 = x0Var.f125197b;
        }
        if ((i11 & 4) != 0) {
            i10 = x0Var.f125198c;
        }
        if ((i11 & 8) != 0) {
            j10 = x0Var.f125199d;
        }
        if ((i11 & 16) != 0) {
            gVar = x0Var.f125200e;
        }
        if ((i11 & 32) != 0) {
            str3 = x0Var.f125201f;
        }
        if ((i11 & 64) != 0) {
            str4 = x0Var.f125202g;
        }
        String str5 = str4;
        g gVar2 = gVar;
        long j11 = j10;
        int i12 = i10;
        return x0Var.h(str, str2, i12, j11, gVar2, str3, str5);
    }

    @NotNull
    public final String a() {
        return this.f125196a;
    }

    @NotNull
    public final String b() {
        return this.f125197b;
    }

    public final int c() {
        return this.f125198c;
    }

    public final long d() {
        return this.f125199d;
    }

    @NotNull
    public final g e() {
        return this.f125200e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return Intrinsics.areEqual(this.f125196a, x0Var.f125196a) && Intrinsics.areEqual(this.f125197b, x0Var.f125197b) && this.f125198c == x0Var.f125198c && this.f125199d == x0Var.f125199d && Intrinsics.areEqual(this.f125200e, x0Var.f125200e) && Intrinsics.areEqual(this.f125201f, x0Var.f125201f) && Intrinsics.areEqual(this.f125202g, x0Var.f125202g);
    }

    @NotNull
    public final String f() {
        return this.f125201f;
    }

    @NotNull
    public final String g() {
        return this.f125202g;
    }

    @NotNull
    public final x0 h(@NotNull String sessionId, @NotNull String firstSessionId, int i10, long j10, @NotNull g dataCollectionStatus, @NotNull String firebaseInstallationId, @NotNull String firebaseAuthenticationToken) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(firstSessionId, "firstSessionId");
        Intrinsics.checkNotNullParameter(dataCollectionStatus, "dataCollectionStatus");
        Intrinsics.checkNotNullParameter(firebaseInstallationId, "firebaseInstallationId");
        Intrinsics.checkNotNullParameter(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        return new x0(sessionId, firstSessionId, i10, j10, dataCollectionStatus, firebaseInstallationId, firebaseAuthenticationToken);
    }

    public int hashCode() {
        return (((((((((((this.f125196a.hashCode() * 31) + this.f125197b.hashCode()) * 31) + Integer.hashCode(this.f125198c)) * 31) + Long.hashCode(this.f125199d)) * 31) + this.f125200e.hashCode()) * 31) + this.f125201f.hashCode()) * 31) + this.f125202g.hashCode();
    }

    @NotNull
    public final g j() {
        return this.f125200e;
    }

    public final long k() {
        return this.f125199d;
    }

    @NotNull
    public final String l() {
        return this.f125202g;
    }

    @NotNull
    public final String m() {
        return this.f125201f;
    }

    @NotNull
    public final String n() {
        return this.f125197b;
    }

    @NotNull
    public final String o() {
        return this.f125196a;
    }

    public final int p() {
        return this.f125198c;
    }

    @NotNull
    public String toString() {
        return "SessionInfo(sessionId=" + this.f125196a + ", firstSessionId=" + this.f125197b + ", sessionIndex=" + this.f125198c + ", eventTimestampUs=" + this.f125199d + ", dataCollectionStatus=" + this.f125200e + ", firebaseInstallationId=" + this.f125201f + ", firebaseAuthenticationToken=" + this.f125202g + ')';
    }
}
