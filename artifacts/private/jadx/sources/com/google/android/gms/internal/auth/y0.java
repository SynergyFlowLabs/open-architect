package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Process;
import android.os.UserManager;

/* JADX INFO: loaded from: classes4.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.b0("DirectBootUtils.class")
    private static UserManager f107885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f107886b = !b();

    private y0() {
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005c A[Catch: all -> 0x0019, TryCatch #1 {all -> 0x0019, blocks: (B:9:0x0013, B:11:0x0017, B:18:0x0023, B:20:0x0029, B:21:0x0036, B:36:0x0061, B:37:0x0063, B:25:0x003e, B:27:0x0045, B:33:0x005c, B:31:0x0055), top: B:47:0x0013, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0061 A[Catch: all -> 0x0019, TryCatch #1 {all -> 0x0019, blocks: (B:9:0x0013, B:11:0x0017, B:18:0x0023, B:20:0x0029, B:21:0x0036, B:36:0x0061, B:37:0x0063, B:25:0x003e, B:27:0x0045, B:33:0x005c, B:31:0x0055), top: B:47:0x0013, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0067 A[RETURN] */
    public static boolean a(Context context) {
        boolean z10;
        if (b() && !f107886b) {
            synchronized (y0.class) {
                try {
                    if (!f107886b) {
                        int i10 = 1;
                        while (true) {
                            if (i10 <= 2) {
                                if (f107885a == null) {
                                    f107885a = (UserManager) context.getSystemService(UserManager.class);
                                }
                                UserManager userManager = f107885a;
                                if (userManager == null) {
                                    z10 = true;
                                } else {
                                    try {
                                        if (userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle())) {
                                            z10 = true;
                                        }
                                        if (z10) {
                                            f107885a = null;
                                        }
                                    } catch (NullPointerException unused) {
                                        f107885a = null;
                                        i10++;
                                    }
                                }
                                if (z10) {
                                    f107886b = true;
                                }
                                if (!z10) {
                                    return true;
                                }
                            }
                            z10 = false;
                            if (z10) {
                                f107885a = null;
                            }
                            if (z10) {
                                f107886b = true;
                            }
                            if (!z10) {
                                return true;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return false;
    }

    @androidx.annotation.k(api = 24)
    public static boolean b() {
        return true;
    }
}
