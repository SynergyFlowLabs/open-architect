package com.planner5d.library.widget.editor.popup;

import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.e
@r
@s("javax.inject.Singleton")
public final class f implements h<e> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final f f257204a = new f();

        private a() {
        }
    }

    public static f a() {
        return a.f257204a;
    }

    public static e c() {
        return new e();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c();
    }
}
