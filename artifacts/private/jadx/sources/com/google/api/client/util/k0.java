package com.google.api.client.util;

/* JADX INFO: loaded from: classes4.dex */
public interface k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k0 f116095a = new a();

    static class a implements k0 {
        a() {
        }

        @Override // com.google.api.client.util.k0
        public void e(long j10) throws InterruptedException {
            Thread.sleep(j10);
        }
    }

    void e(long j10) throws InterruptedException;
}
