package com.google.android.play.core.appupdate;

import android.app.Activity;
import android.content.IntentSender;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes4.dex */
public interface b {
    boolean a(@NonNull a aVar, @NonNull androidx.activity.result.h<IntentSenderRequest> hVar, @NonNull d dVar);

    @Deprecated
    boolean b(@NonNull a aVar, @e7.b int i10, @NonNull com.google.android.play.core.common.a aVar2, int i11) throws IntentSender.SendIntentException;

    @NonNull
    Task<a> c();

    boolean d(@NonNull a aVar, @NonNull com.google.android.play.core.common.a aVar2, @NonNull d dVar, int i10) throws IntentSender.SendIntentException;

    @Deprecated
    boolean e(@NonNull a aVar, @e7.b int i10, @NonNull Activity activity, int i11) throws IntentSender.SendIntentException;

    boolean f(@NonNull a aVar, @NonNull Activity activity, @NonNull d dVar, int i10) throws IntentSender.SendIntentException;

    @NonNull
    Task<Void> g();

    void h(@NonNull com.google.android.play.core.install.b bVar);

    Task<Integer> i(@NonNull a aVar, @NonNull Activity activity, @NonNull d dVar);

    void j(@NonNull com.google.android.play.core.install.b bVar);
}
