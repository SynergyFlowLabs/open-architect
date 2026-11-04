package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public interface n {
    @g6.a
    boolean a();

    @androidx.annotation.p0
    @g6.a
    <T extends m> T b(@NonNull String str, @NonNull Class<T> cls);

    @g6.a
    boolean d();

    @androidx.annotation.p0
    @g6.a
    Activity f();

    @g6.a
    void j(@NonNull String str, @NonNull m mVar);

    @g6.a
    void startActivityForResult(@NonNull Intent intent, int i10);
}
