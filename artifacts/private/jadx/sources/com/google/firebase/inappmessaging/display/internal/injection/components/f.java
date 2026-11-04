package com.google.firebase.inappmessaging.display.internal.injection.components;

import android.app.Application;
import android.util.DisplayMetrics;
import com.google.firebase.inappmessaging.display.internal.injection.modules.g;
import com.google.firebase.inappmessaging.display.internal.k;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@ij.f
@r8.a(modules = {com.google.firebase.inappmessaging.display.internal.injection.modules.a.class, g.class})
public interface f {
    Application a();

    Map<String, ij.c<k>> b();

    DisplayMetrics c();

    com.google.firebase.inappmessaging.display.internal.g d();

    com.google.firebase.inappmessaging.display.internal.a e();
}
