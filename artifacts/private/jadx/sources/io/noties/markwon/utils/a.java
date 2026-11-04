package io.noties.markwon.utils;

import android.graphics.Color;
import androidx.annotation.g0;
import androidx.annotation.l;
import androidx.annotation.x;
import androidx.collection.b3;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a {
    private a() {
    }

    @l
    public static int a(@l int i10, @g0(from = 0, to = b3.f12144d) int i11) {
        return (i10 & 16777215) | (i11 << 24);
    }

    @l
    public static int b(@l int i10, @l int i11, @x(from = 0.0d, to = 1.0d) float f10) {
        float f11 = 1.0f - f10;
        return Color.rgb((int) ((Color.red(i10) * f11) + (Color.red(i11) * f10)), (int) ((Color.green(i10) * f11) + (Color.green(i11) * f10)), (int) ((f11 * Color.blue(i10)) + (f10 * Color.blue(i11))));
    }
}
