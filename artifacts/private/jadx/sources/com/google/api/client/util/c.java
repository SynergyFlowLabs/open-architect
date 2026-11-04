package com.google.api.client.util;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public interface c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f116047a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f116048b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f116049c = new b();

    static class a implements c {
        a() {
        }

        @Override // com.google.api.client.util.c
        public long a() throws IOException {
            return 0L;
        }

        @Override // com.google.api.client.util.c
        public void reset() throws IOException {
        }
    }

    static class b implements c {
        b() {
        }

        @Override // com.google.api.client.util.c
        public long a() throws IOException {
            return -1L;
        }

        @Override // com.google.api.client.util.c
        public void reset() throws IOException {
        }
    }

    long a() throws IOException;

    void reset() throws IOException;
}
