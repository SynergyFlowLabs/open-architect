package com.google.firebase.inappmessaging.display.internal.layout.util;

import android.view.View;
import com.google.firebase.inappmessaging.display.internal.l;

/* JADX INFO: loaded from: classes5.dex */
public class b {
    private static void a(View view, int i10, int i11, int i12, int i13) {
        l.d("\tdesired (w,h)", view.getMeasuredWidth(), view.getMeasuredHeight());
        if (view.getVisibility() == 8) {
            i10 = 0;
            i11 = 0;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, i12), View.MeasureSpec.makeMeasureSpec(i11, i13));
        l.d("\tactual (w,h)", view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public static void b(View view, int i10, int i11) {
        a(view, i10, i11, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public static void c(View view, int i10, int i11) {
        a(view, i10, i11, 1073741824, 1073741824);
    }

    public static void d(View view, int i10, int i11) {
        a(view, i10, i11, Integer.MIN_VALUE, 1073741824);
    }

    public static void e(View view, int i10, int i11) {
        a(view, i10, i11, 1073741824, Integer.MIN_VALUE);
    }
}
