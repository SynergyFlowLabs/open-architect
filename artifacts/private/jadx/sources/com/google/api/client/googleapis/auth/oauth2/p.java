package com.google.api.client.googleapis.auth.oauth2;

/* JADX INFO: loaded from: classes4.dex */
class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final p f115370a = new p();

    p() {
    }

    String a(String str) {
        return System.getenv(str);
    }

    boolean b(String str, String str2) {
        if (!System.getenv().containsKey(str) || !System.getenv(str).equals(str2)) {
            return false;
        }
        int i10 = 4 << 1;
        return true;
    }
}
