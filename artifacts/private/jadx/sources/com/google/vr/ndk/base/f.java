package com.google.vr.ndk.base;

/* JADX INFO: loaded from: classes5.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f127063b = "f";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f127064a;

    f(long j10) {
        this.f127064a = j10;
    }

    public void a(int i10, e eVar) {
        GvrApi.nativeBufferViewportListGetItem(this.f127064a, i10, eVar.f127040a);
    }

    public void b(int i10, e eVar) {
        GvrApi.nativeBufferViewportListSetItem(this.f127064a, i10, eVar.f127040a);
    }

    public void c() {
        long j10 = this.f127064a;
        if (j10 != 0) {
            GvrApi.nativeBufferViewportListDestroy(j10);
            this.f127064a = 0L;
        }
    }

    public int d() {
        return GvrApi.nativeBufferViewportListGetSize(this.f127064a);
    }

    protected void finalize() throws Throwable {
        try {
            if (this.f127064a != 0) {
                c();
            }
        } finally {
            super.finalize();
        }
    }
}
