package com.google.android.gms.auth.api.phone;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.m;
import com.google.android.gms.tasks.Task;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes4.dex */
public interface b extends m<com.google.android.gms.common.api.a.d.C0969d> {

    @Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {

        /* JADX INFO: renamed from: a1, reason: collision with root package name */
        public static final int f105549a1 = 0;

        /* JADX INFO: renamed from: b1, reason: collision with root package name */
        public static final int f105550b1 = 1;

        /* JADX INFO: renamed from: c1, reason: collision with root package name */
        public static final int f105551c1 = 2;
    }

    @NonNull
    Task<Void> b();

    @NonNull
    Task<Boolean> j(@NonNull String str);

    @NonNull
    Task<Integer> z();
}
