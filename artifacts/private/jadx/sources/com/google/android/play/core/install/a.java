package com.google.android.play.core.install;

import com.google.android.gms.common.api.Status;
import e7.g;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class a extends com.google.android.gms.common.api.b {
    public a(@e7.c int i10) {
        super(new Status(i10, String.format(Locale.getDefault(), "Install Error(%d): %s", Integer.valueOf(i10), g.a(i10))));
        if (i10 == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }

    @e7.c
    public int d() {
        return super.b();
    }
}
