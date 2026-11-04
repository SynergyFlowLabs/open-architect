package com.google.firebase.installations;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public class l extends com.google.firebase.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final a f123203a;

    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public l(@NonNull a aVar) {
        this.f123203a = aVar;
    }

    @NonNull
    public a a() {
        return this.f123203a;
    }

    public l(@NonNull String str, @NonNull a aVar) {
        super(str);
        this.f123203a = aVar;
    }

    public l(@NonNull String str, @NonNull a aVar, @NonNull Throwable th2) {
        super(str, th2);
        this.f123203a = aVar;
    }
}
