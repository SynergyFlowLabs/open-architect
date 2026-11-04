package com.planner5d.library.widget.editor.popup.itemproperties.interactor;

import com.planner5d.library.activity.helper.imagechooser.j;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;
import ij.c;

/* JADX INFO: loaded from: classes8.dex */
@r
@e
@s
public final class b implements h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c<j> f257308a;

    public b(c<j> cVar) {
        this.f257308a = cVar;
    }

    public static b a(c<j> cVar) {
        return new b(cVar);
    }

    public static a c(j jVar) {
        return new a(jVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f257308a.get());
    }
}
