package com.planner5d.library.widget.editor.popup.floors;

import com.planner5d.library.activity.fragment.dialog.k;
import dagger.internal.j;
import dagger.internal.r;

/* JADX INFO: loaded from: classes8.dex */
@r
@dagger.internal.e
public final class h implements fg.g<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<k> f257224a;

    public h(ij.c<k> cVar) {
        this.f257224a = cVar;
    }

    public static fg.g<f> a(ij.c<k> cVar) {
        return new h(cVar);
    }

    @j("com.planner5d.library.widget.editor.popup.floors.FloorsPopupView.dialogLauncher")
    public static void b(f fVar, k kVar) {
        fVar.f257215i = kVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(f fVar) {
        b(fVar, this.f257224a.get());
    }
}
