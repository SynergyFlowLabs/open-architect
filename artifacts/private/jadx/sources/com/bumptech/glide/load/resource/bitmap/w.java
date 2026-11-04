package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import androidx.annotation.l1;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @l1
    static final int f97087f = 128;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f97088g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final File f97089h = new File("/proc/self/fd");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f97090i = 50;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f97091j = 700;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f97092k = 20000;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static volatile w f97093l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private int f97097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private boolean f97098e = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f97094a = d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f97095b = 20000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f97096c = 0;

    @l1
    w() {
    }

    public static w a() {
        if (f97093l == null) {
            synchronized (w.class) {
                try {
                    if (f97093l == null) {
                        f97093l = new w();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f97093l;
    }

    private synchronized boolean b() {
        try {
            boolean z10 = true;
            int i10 = this.f97097d + 1;
            this.f97097d = i10;
            if (i10 >= 50) {
                this.f97097d = 0;
                if (f97089h.list().length >= this.f97095b) {
                    z10 = false;
                }
                this.f97098e = z10;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f97098e;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:38:0x007f. Please report as an issue. */
    private static boolean d() {
        String str = Build.MODEL;
        if (str != null && str.length() >= 7) {
            byte b10 = 0;
            String strSubstring = str.substring(0, 7);
            strSubstring.getClass();
            switch (strSubstring.hashCode()) {
                case -1398613787:
                    if (!strSubstring.equals("SM-A520")) {
                        b10 = -1;
                    }
                    break;
                case -1398431166:
                    b10 = !strSubstring.equals("SM-G930") ? (byte) -1 : (byte) 1;
                    break;
                case -1398431161:
                    b10 = !strSubstring.equals("SM-G935") ? (byte) -1 : (byte) 2;
                    break;
                case -1398431073:
                    b10 = !strSubstring.equals("SM-G960") ? (byte) -1 : (byte) 3;
                    break;
                case -1398431068:
                    b10 = !strSubstring.equals("SM-G965") ? (byte) -1 : (byte) 4;
                    break;
                case -1398343746:
                    b10 = !strSubstring.equals("SM-J720") ? (byte) -1 : (byte) 5;
                    break;
                case -1398222624:
                    b10 = !strSubstring.equals("SM-N935") ? (byte) -1 : (byte) 6;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
            }
        }
        return true;
    }

    public boolean c(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        return z10 && this.f97094a && !z11 && i10 >= (i12 = this.f97096c) && i11 >= i12 && b();
    }

    @e.b(26)
    boolean e(int i10, int i11, BitmapFactory.Options options, boolean z10, boolean z11) {
        boolean zC = c(i10, i11, z10, z11);
        if (zC) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return zC;
    }
}
