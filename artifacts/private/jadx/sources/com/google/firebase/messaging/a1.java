package com.google.firebase.messaging;

import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public final class a1 extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f123417b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f123418c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f123419d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f123420e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f123421f = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f123422a;

    a1(String str) {
        super(str);
        this.f123422a = b(str);
    }

    private int b(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        lowerCase.getClass();
        switch (lowerCase) {
            case "service_not_available":
                return 3;
            case "toomanymessages":
                return 4;
            case "invalid_parameters":
            case "missing_to":
                return 1;
            case "messagetoobig":
                return 2;
            default:
                return 0;
        }
    }

    public int a() {
        return this.f123422a;
    }
}
