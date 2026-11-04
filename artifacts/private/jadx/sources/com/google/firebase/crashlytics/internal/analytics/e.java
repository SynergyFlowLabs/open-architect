package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes5.dex */
public class e implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f120958b = "clx";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final com.google.firebase.analytics.connector.a f120959a;

    public e(@NonNull com.google.firebase.analytics.connector.a aVar) {
        this.f120959a = aVar;
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.a
    public void a(@NonNull String str, @p0 Bundle bundle) {
        this.f120959a.a(f120958b, str, bundle);
    }
}
