package com.google.firebase.inappmessaging.internal.time;

import com.google.firebase.inappmessaging.dagger.internal.f;
import com.google.firebase.inappmessaging.dagger.internal.g;

/* JADX INFO: loaded from: classes5.dex */
@f
@g
@com.google.firebase.inappmessaging.dagger.internal.a
public final class c implements com.google.firebase.inappmessaging.dagger.internal.c<b> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final c f122946a = new c();

        private a() {
        }
    }

    public static c a() {
        return a.f122946a;
    }

    public static b c() {
        return new b();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c();
    }
}
