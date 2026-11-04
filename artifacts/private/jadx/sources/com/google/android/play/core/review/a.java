package com.google.android.play.core.review;

import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class a extends com.google.android.gms.common.api.b {
    public a(int i10) {
        super(new Status(i10, String.format(Locale.getDefault(), "Review Error(%d): %s", Integer.valueOf(i10), g7.b.a(i10))));
    }

    public int d() {
        return super.b();
    }
}
