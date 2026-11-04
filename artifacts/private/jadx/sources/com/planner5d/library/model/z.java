package com.planner5d.library.model;

import android.content.Context;
import androidx.annotation.f1;
import com.planner5d.library.model.manager.k5;

/* JADX INFO: loaded from: classes7.dex */
public class z implements k5.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f222860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f222861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @f1
    private final int f222862c;

    public z(@f1 int i10) {
        this.f222860a = null;
        this.f222861b = null;
        this.f222862c = i10;
    }

    public String a(Context context) {
        int i10;
        String str = this.f222861b;
        return (str != null || (i10 = this.f222862c) == 0) ? str : context.getString(i10);
    }

    public z(String str, String str2) {
        this.f222860a = str;
        this.f222861b = str2;
        this.f222862c = 0;
    }
}
