package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.firebase.crashlytics.internal.g;

/* JADX INFO: loaded from: classes5.dex */
public class f implements a {
    @Override // com.google.firebase.crashlytics.internal.analytics.a
    public void a(@NonNull String str, @p0 Bundle bundle) {
        g.f().b("Skipping logging Crashlytics event to Firebase, no Firebase Analytics");
    }
}
