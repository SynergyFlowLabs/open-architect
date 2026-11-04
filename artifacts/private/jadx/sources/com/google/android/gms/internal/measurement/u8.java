package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Process;
import android.os.UserManager;

/* JADX INFO: loaded from: classes4.dex */
public final class u8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.b0("DirectBootUtils.class")
    @androidx.annotation.p0
    private static UserManager f108900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f108901b = !a();

    private u8() {
    }

    @androidx.annotation.k(api = 24)
    public static boolean a() {
        return true;
    }

    public static boolean b(Context context) {
        return a() && !d(context);
    }

    public static boolean c(Context context) {
        return !a() || d(context);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0054 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:7:0x000c, B:10:0x0012, B:17:0x001f, B:19:0x0023, B:20:0x002e, B:33:0x0054, B:34:0x0056, B:24:0x0036, B:26:0x003d, B:29:0x0049, B:31:0x0050), top: B:39:0x000c, inners: #1 }] */
    @androidx.annotation.w0(24)
    @e.b(24)
    private static boolean d(Context context) {
        if (f108901b) {
            return true;
        }
        synchronized (u8.class) {
            try {
                if (f108901b) {
                    return true;
                }
                int i10 = 1;
                while (true) {
                    boolean z10 = false;
                    if (i10 <= 2) {
                        if (f108900a == null) {
                            f108900a = (UserManager) context.getSystemService(UserManager.class);
                        }
                        UserManager userManager = f108900a;
                        if (userManager == null) {
                            z10 = true;
                        } else {
                            try {
                                if (userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle())) {
                                    z10 = true;
                                }
                            } catch (NullPointerException unused) {
                                f108900a = null;
                                i10++;
                            }
                        }
                        if (z10) {
                            f108901b = true;
                        }
                        return z10;
                    }
                    if (z10) {
                        f108900a = null;
                    }
                    if (z10) {
                        f108901b = true;
                    }
                    return z10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
