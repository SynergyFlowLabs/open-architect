package com.google.firebase.perf.logging;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f123961a = "https://console.firebase.google.com";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f123962b = "android-ide";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f123963c = "perf-android-sdk";

    public static String a(String str, String str2, String str3) {
        return String.format("%s/troubleshooting/trace/DURATION_TRACE/%s?utm_source=%s&utm_medium=%s", d(str, str2), str3, f123963c, f123962b);
    }

    public static String b(String str, String str2) {
        return String.format("%s/trends?utm_source=%s&utm_medium=%s", d(str, str2), f123963c, f123962b);
    }

    public static String c(String str, String str2, String str3) {
        return String.format("%s/troubleshooting/trace/SCREEN_TRACE/%s?utm_source=%s&utm_medium=%s", d(str, str2), str3, f123963c, f123962b);
    }

    private static String d(String str, String str2) {
        return String.format("%s/project/%s/performance/app/android:%s", f123961a, str, str2);
    }
}
