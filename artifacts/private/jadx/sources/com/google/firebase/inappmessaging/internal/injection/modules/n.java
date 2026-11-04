package com.google.firebase.inappmessaging.internal.injection.modules;

import android.app.Application;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
@q8.d
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Application f122785a;

    public n(Application application) {
        this.f122785a = application;
    }

    @q8.e
    @ij.f
    public com.google.firebase.inappmessaging.internal.w a(@d8.a Executor executor) {
        return new com.google.firebase.inappmessaging.internal.w(executor);
    }

    @q8.e
    @ij.f
    public Application b() {
        return this.f122785a;
    }
}
