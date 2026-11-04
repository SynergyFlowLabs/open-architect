package com.planner5d.library.activity;

import android.app.Activity;
import android.os.Bundle;
import androidx.compose.runtime.internal.w0;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@w0(parameters = 1)
public final class GooglePlusAppAuthResponse extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f131442a = 0;

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        com.planner5d.library.application.b.f142455c.a().J().l(7, -1, getIntent());
        finish();
    }
}
