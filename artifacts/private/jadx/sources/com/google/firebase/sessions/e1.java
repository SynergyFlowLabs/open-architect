package com.google.firebase.sessions;

import android.os.SystemClock;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class e1 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e1 f125017a = new e1();

    private e1() {
    }

    @Override // com.google.firebase.sessions.d1
    public long a() {
        kotlin.time.c.a aVar = kotlin.time.c.f313406b;
        return kotlin.time.e.n0(SystemClock.elapsedRealtime(), kotlin.time.f.MILLISECONDS);
    }

    @Override // com.google.firebase.sessions.d1
    @NotNull
    public Time b() {
        return new Time(System.currentTimeMillis());
    }
}
