package com.google.android.play.core.review;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.l;
import com.google.android.gms.tasks.n;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;

/* JADX INFO: loaded from: classes4.dex */
@e.a({"RestrictedApi"})
public final class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f114937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f114938b = new Handler(Looper.getMainLooper());

    e(j jVar) {
        this.f114937a = jVar;
    }

    @Override // com.google.android.play.core.review.b
    @NonNull
    public final Task<ReviewInfo> a() {
        return this.f114937a.a();
    }

    @Override // com.google.android.play.core.review.b
    @NonNull
    public final Task<Void> b(@NonNull Activity activity, @NonNull ReviewInfo reviewInfo) {
        if (reviewInfo.b()) {
            return n.g(null);
        }
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", reviewInfo.a());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        l lVar = new l();
        intent.putExtra("result_receiver", new zzc(this, this.f114938b, lVar));
        activity.startActivity(intent);
        return lVar.a();
    }
}
