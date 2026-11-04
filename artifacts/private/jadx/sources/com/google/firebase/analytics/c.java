package com.google.firebase.analytics;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.p0;
import com.google.android.gms.internal.measurement.f4;

/* JADX INFO: loaded from: classes5.dex */
public class c extends Activity {
    @Override // android.app.Activity
    public void onCreate(@p0 Bundle bundle) {
        super.onCreate(bundle);
        f4.v(this, null).z(getIntent());
        finish();
    }
}
