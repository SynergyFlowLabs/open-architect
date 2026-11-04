package com.google.android.play.core.review;

import android.app.PendingIntent;

/* JADX INFO: loaded from: classes4.dex */
final class zza extends ReviewInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PendingIntent f114979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f114980b;

    zza(PendingIntent pendingIntent, boolean z10) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.f114979a = pendingIntent;
        this.f114980b = z10;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    final PendingIntent a() {
        return this.f114979a;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    final boolean b() {
        return this.f114980b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            ReviewInfo reviewInfo = (ReviewInfo) obj;
            if (this.f114979a.equals(reviewInfo.a()) && this.f114980b == reviewInfo.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.f114980b ? 1237 : 1231) ^ ((this.f114979a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ReviewInfo{pendingIntent=" + this.f114979a.toString() + ", isNoOp=" + this.f114980b + "}";
    }
}
