package com.facebook.appevents;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f98838c = "com.facebook.appevents.AnalyticsUserIDStore.userID";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private static String f98840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile boolean f98841f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f98836a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f98837b = d.class.getSimpleName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final ReentrantReadWriteLock f98839d = new ReentrantReadWriteLock();

    private d() {
    }

    @oj.n
    @Nullable
    public static final String c() {
        if (!f98841f) {
            f98836a.d();
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f98839d;
        reentrantReadWriteLock.readLock().lock();
        try {
            String str = f98840e;
            ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
            return str;
        } finally {
            f98839d.readLock().unlock();
        }
    }

    private final void d() {
        if (f98841f) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f98839d;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (!f98841f) {
                com.facebook.g0 g0Var = com.facebook.g0.f99617a;
                f98840e = PreferenceManager.getDefaultSharedPreferences(com.facebook.g0.n()).getString(f98838c, null);
                f98841f = true;
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        } finally {
            f98839d.writeLock().unlock();
        }
    }

    @oj.n
    public static final void e() {
        if (f98841f) {
            return;
        }
        f0.f98865b.e().execute(new Runnable() { // from class: com.facebook.appevents.c
            @Override // java.lang.Runnable
            public final void run() {
                d.f();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f() {
        f98836a.d();
    }

    @oj.n
    public static final void g(@Nullable final String str) {
        com.facebook.appevents.internal.g gVar = com.facebook.appevents.internal.g.f99011a;
        com.facebook.appevents.internal.g.b();
        if (!f98841f) {
            f98836a.d();
        }
        f0.f98865b.e().execute(new Runnable() { // from class: com.facebook.appevents.b
            @Override // java.lang.Runnable
            public final void run() {
                d.h(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(String str) {
        ReentrantReadWriteLock reentrantReadWriteLock = f98839d;
        reentrantReadWriteLock.writeLock().lock();
        try {
            f98840e = str;
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(com.facebook.g0.n()).edit();
            editorEdit.putString(f98838c, f98840e);
            editorEdit.apply();
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        } finally {
            f98839d.writeLock().unlock();
        }
    }
}
