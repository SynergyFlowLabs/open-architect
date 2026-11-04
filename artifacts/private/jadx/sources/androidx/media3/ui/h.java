package androidx.media3.ui;

import android.graphics.Color;

/* JADX INFO: loaded from: classes3.dex */
final class h {
    private h() {
    }

    public static String a(String str) {
        return "." + str + ",." + str + " *";
    }

    public static String b(@androidx.annotation.l int i10) {
        return androidx.media3.common.util.k1.S("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i10)), Integer.valueOf(Color.green(i10)), Integer.valueOf(Color.blue(i10)), Double.valueOf(((double) Color.alpha(i10)) / 255.0d));
    }
}
