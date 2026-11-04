package com.google.android.filament.utils;

/* JADX INFO: loaded from: classes4.dex */
public class Bookmark {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f104779a;

    Bookmark(long j10) {
        this.f104779a = j10;
    }

    private static native void nDestroyBookmark(long j10);

    long a() {
        return this.f104779a;
    }

    protected void finalize() throws Throwable {
        nDestroyBookmark(this.f104779a);
        super.finalize();
    }
}
