package com.google.android.gms.auth.api.signin;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.p;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public static final String f105647a = "signInAccount";

    @NonNull
    o<e> a(@NonNull com.google.android.gms.common.api.l lVar);

    @NonNull
    Intent b(@NonNull com.google.android.gms.common.api.l lVar);

    @p0
    e c(@NonNull Intent intent);

    @NonNull
    p<Status> d(@NonNull com.google.android.gms.common.api.l lVar);

    @NonNull
    p<Status> e(@NonNull com.google.android.gms.common.api.l lVar);
}
