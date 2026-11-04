package com.google.android.material.sidesheet;

import androidx.annotation.b1;
import com.google.android.material.sidesheet.d;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
interface c<C extends d> extends com.google.android.material.motion.b {

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    public static final int f113729e2 = 1;

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    public static final int f113730f2 = 2;

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    public static final int f113731g2 = 3;

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    public static final int f113732h2 = 5;

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    public static final int f113733i2 = 0;

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    public static final int f113734j2 = 1;

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP})
    public @interface a {
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP})
    public @interface b {
    }

    /* JADX INFO: renamed from: com.google.android.material.sidesheet.c$c, reason: collision with other inner class name */
    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP})
    public @interface InterfaceC0994c {
    }

    void a(C c10);

    void e(C c10);

    void g(int i10);

    int getState();
}
