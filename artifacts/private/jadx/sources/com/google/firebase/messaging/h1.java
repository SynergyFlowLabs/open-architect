package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
final class h1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.l1
    static final String f123590d = "com.google.android.gms.appid";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.l1
    static final String f123591e = "topic_operation_queue";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f123592f = ",";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.b0("TopicsStore.class")
    private static WeakReference<h1> f123593g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f123594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d1 f123595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f123596c;

    private h1(SharedPreferences sharedPreferences, Executor executor) {
        this.f123596c = executor;
        this.f123594a = sharedPreferences;
    }

    @androidx.annotation.l1
    static synchronized void b() {
        WeakReference<h1> weakReference = f123593g;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    @androidx.annotation.m1
    public static synchronized h1 d(Context context, Executor executor) {
        h1 h1Var;
        try {
            WeakReference<h1> weakReference = f123593g;
            h1Var = weakReference != null ? weakReference.get() : null;
            if (h1Var == null) {
                h1Var = new h1(context.getSharedPreferences(f123590d, 0), executor);
                h1Var.g();
                f123593g = new WeakReference<>(h1Var);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return h1Var;
    }

    @androidx.annotation.m1
    private synchronized void g() {
        try {
            this.f123595b = d1.j(this.f123594a, f123591e, f123592f, this.f123596c);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    synchronized boolean a(g1 g1Var) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f123595b.b(g1Var.e());
    }

    synchronized void c() {
        try {
            this.f123595b.g();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @androidx.annotation.p0
    synchronized g1 e() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return g1.a(this.f123595b.l());
    }

    @NonNull
    synchronized List<g1> f() {
        ArrayList arrayList;
        try {
            List<String> listT = this.f123595b.t();
            arrayList = new ArrayList(listT.size());
            Iterator<String> it = listT.iterator();
            while (it.hasNext()) {
                arrayList.add(g1.a(it.next()));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    @androidx.annotation.p0
    synchronized g1 h() {
        try {
        } catch (NoSuchElementException unused) {
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
        return g1.a(this.f123595b.m());
    }

    synchronized boolean i(g1 g1Var) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f123595b.n(g1Var.e());
    }
}
