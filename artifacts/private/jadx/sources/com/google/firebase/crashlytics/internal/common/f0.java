package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
@u7.d
public abstract class f0 {
    @NonNull
    public static f0 a(com.google.firebase.crashlytics.internal.model.f0 f0Var, String str, File file) {
        return new b(f0Var, str, file);
    }

    public abstract com.google.firebase.crashlytics.internal.model.f0 b();

    public abstract File c();

    public abstract String d();
}
