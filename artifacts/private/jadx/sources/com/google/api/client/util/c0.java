package com.google.api.client.util;

/* JADX INFO: loaded from: classes4.dex */
public interface c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f116050a = new a();

    static class a implements c0 {
        a() {
        }

        @Override // com.google.api.client.util.c0
        public long a() {
            return System.nanoTime();
        }
    }

    long a();
}
