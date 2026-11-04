package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes5.dex */
public class w extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f124796b;

    public w(int i10, @NonNull String str) {
        super(str);
        this.f124796b = i10;
    }

    public int b() {
        return this.f124796b;
    }

    public w(int i10, @NonNull String str, @p0 Throwable th2) {
        super(str, th2);
        this.f124796b = i10;
    }

    public w(@NonNull String str, @NonNull t.a aVar) {
        super(str, aVar);
        this.f124796b = -1;
    }

    public w(int i10, @NonNull String str, @NonNull t.a aVar) {
        super(str, aVar);
        this.f124796b = i10;
    }

    public w(@NonNull String str, @p0 Throwable th2, @NonNull t.a aVar) {
        super(str, th2, aVar);
        this.f124796b = -1;
    }

    public w(int i10, @NonNull String str, @p0 Throwable th2, @NonNull t.a aVar) {
        super(str, th2, aVar);
        this.f124796b = i10;
    }
}
