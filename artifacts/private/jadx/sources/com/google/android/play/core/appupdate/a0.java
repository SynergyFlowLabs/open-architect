package com.google.android.play.core.appupdate;

/* JADX INFO: loaded from: classes4.dex */
final class a0 extends d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f114803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f114804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte f114805c;

    a0() {
    }

    @Override // com.google.android.play.core.appupdate.d.a
    public final d a() {
        if (this.f114805c == 3) {
            return new c0(this.f114803a, this.f114804b, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f114805c & 1) == 0) {
            sb2.append(" appUpdateType");
        }
        if ((this.f114805c & 2) == 0) {
            sb2.append(" allowAssetPackDeletion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.play.core.appupdate.d.a
    public final d.a b(boolean z10) {
        this.f114804b = z10;
        this.f114805c = (byte) (this.f114805c | 2);
        return this;
    }

    @Override // com.google.android.play.core.appupdate.d.a
    public final d.a c(int i10) {
        this.f114803a = i10;
        this.f114805c = (byte) (this.f114805c | 1);
        return this;
    }
}
