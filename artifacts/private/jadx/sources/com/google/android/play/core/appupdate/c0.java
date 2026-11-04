package com.google.android.play.core.appupdate;

/* JADX INFO: loaded from: classes4.dex */
final class c0 extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f114806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f114807b;

    /* synthetic */ c0(int i10, boolean z10, b0 b0Var) {
        this.f114806a = i10;
        this.f114807b = z10;
    }

    @Override // com.google.android.play.core.appupdate.d
    public final boolean a() {
        return this.f114807b;
    }

    @Override // com.google.android.play.core.appupdate.d
    @e7.b
    public final int b() {
        return this.f114806a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f114806a == dVar.b() && this.f114807b == dVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.f114807b ? 1237 : 1231) ^ ((this.f114806a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "AppUpdateOptions{appUpdateType=" + this.f114806a + ", allowAssetPackDeletion=" + this.f114807b + "}";
    }
}
