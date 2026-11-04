package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes5.dex */
public enum j0 {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f121108a;

    j0(int i10) {
        this.f121108a = i10;
    }

    public static j0 l(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int n() {
        return this.f121108a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f121108a);
    }
}
