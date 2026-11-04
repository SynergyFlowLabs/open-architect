package com.google.api.client.util;

/* JADX INFO: loaded from: classes4.dex */
public interface l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f116096a = new a();

    static class a implements l {
        a() {
        }

        @Override // com.google.api.client.util.l
        public long currentTimeMillis() {
            return System.currentTimeMillis();
        }
    }

    long currentTimeMillis();
}
