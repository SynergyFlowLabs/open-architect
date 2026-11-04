package com.google.android.play.core.install;

import e7.d;

/* JADX INFO: loaded from: classes4.dex */
final class c extends InstallState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f114899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f114900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f114901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f114902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f114903e;

    c(int i10, long j10, long j11, int i11, String str) {
        this.f114899a = i10;
        this.f114900b = j10;
        this.f114901c = j11;
        this.f114902d = i11;
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.f114903e = str;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long a() {
        return this.f114900b;
    }

    @Override // com.google.android.play.core.install.InstallState
    @e7.c
    public final int b() {
        return this.f114902d;
    }

    @Override // com.google.android.play.core.install.InstallState
    @d
    public final int c() {
        return this.f114899a;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final String d() {
        return this.f114903e;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long e() {
        return this.f114901c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallState) {
            InstallState installState = (InstallState) obj;
            if (this.f114899a == installState.c() && this.f114900b == installState.a() && this.f114901c == installState.e() && this.f114902d == installState.b() && this.f114903e.equals(installState.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f114899a ^ 1000003;
        long j10 = this.f114900b;
        long j11 = this.f114901c;
        return this.f114903e.hashCode() ^ (((((((i10 * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f114902d) * 1000003);
    }

    public final String toString() {
        return "InstallState{installStatus=" + this.f114899a + ", bytesDownloaded=" + this.f114900b + ", totalBytesToDownload=" + this.f114901c + ", installErrorCode=" + this.f114902d + ", packageName=" + this.f114903e + "}";
    }
}
