package com.badlogic.gdx.utils;

/* JADX INFO: loaded from: classes3.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f95745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f95746b;

    public static synchronized void a() {
        if (f95746b) {
            return;
        }
        f95746b = true;
        if (f95745a) {
            System.out.println("Native loading is disabled.");
        } else {
            new z0().g("gdx");
        }
    }
}
