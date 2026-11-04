package com.planner5d.library.feed.data;

import java.util.Calendar;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
public final class d {
    @ij.a
    public d() {
    }

    public final int a() {
        int i10 = Calendar.getInstance().get(7);
        if (i10 == 1) {
            return 6;
        }
        return i10 - 2;
    }
}
