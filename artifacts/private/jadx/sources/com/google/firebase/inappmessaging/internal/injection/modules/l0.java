package com.google.firebase.inappmessaging.internal.injection.modules;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
@q8.d
public class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f122782a = "APP_FOREGROUND_ONE_PER_DAY_LIMITER_KEY";

    @q8.e
    @w8.c
    public com.google.firebase.inappmessaging.model.m a() {
        return com.google.firebase.inappmessaging.model.m.a().b(1L).c(f122782a).d(TimeUnit.DAYS.toMillis(1L)).a();
    }
}
