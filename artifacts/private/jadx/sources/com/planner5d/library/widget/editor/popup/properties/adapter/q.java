package com.planner5d.library.widget.editor.popup.properties.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.manager.k5;
import com.planner5d.library.model.y;
import com.planner5d.library.services.utility.p0;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import rx.Observable;
import rx.subjects.PublishSubject;

/* JADX INFO: loaded from: classes8.dex */
public class q extends m<y> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final y f257971s = new y("add_button");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Drawable f257972n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Drawable f257973o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final PublishSubject<y> f257974p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final PublishSubject<View> f257975q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final List<y> f257976r;

    public q(Context context, p0 p0Var, com.planner5d.library.services.bitmaploader.target.h hVar) {
        super(p0Var, hVar);
        this.f257974p = PublishSubject.create();
        this.f257975q = PublishSubject.create();
        this.f257976r = new LinkedList();
        com.planner5d.library.widget.drawable.c cVar = com.planner5d.library.widget.drawable.c.f254258a;
        this.f257972n = cVar.a(context, com.planner5d.library.f.h.f167608j8, Integer.valueOf(androidx.core.content.d.g(context, com.planner5d.library.f.C1549f.f166450j2)));
        this.f257973o = cVar.a(context, com.planner5d.library.f.h.f167608j8, Integer.valueOf(androidx.core.content.d.g(context, com.planner5d.library.f.C1549f.f166427i2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(y yVar, View view) {
        this.f257974p.onNext(yVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(com.planner5d.library.widget.editor.popup.properties.view.j jVar, View view) {
        this.f257975q.onNext(jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean O(List list, y yVar) {
        if (list.contains(yVar)) {
            return false;
        }
        w(yVar);
        int i10 = 5 & 1;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.planner5d.library.widget.editor.popup.properties.adapter.m
    /* JADX INFO: renamed from: F */
    public void x(final com.planner5d.library.widget.editor.popup.properties.view.j jVar, k5.c cVar, String str, ItemProject itemProject, ItemRoom itemRoom) {
        super.x(jVar, cVar, str, itemProject, itemRoom);
        final y yVar = (y) cVar;
        jVar.t(this.f257976r.contains(yVar) ? this.f257973o : this.f257972n, new View.OnClickListener() { // from class: com.planner5d.library.widget.editor.popup.properties.adapter.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f257965a.M(yVar, view);
            }
        });
        jVar.setErrorInfoButtonListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.editor.popup.properties.adapter.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f257967a.N(jVar, view);
            }
        });
    }

    public Observable<View> J() {
        return this.f257975q;
    }

    public Observable<y> K() {
        return this.f257974p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.planner5d.library.widget.editor.popup.properties.adapter.k
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public boolean p(y yVar, y yVar2) {
        return yVar != null && yVar.equals(yVar2);
    }

    public void P(final List<y> list) {
        this.f257976r.removeIf(new Predicate() { // from class: com.planner5d.library.widget.editor.popup.properties.adapter.p
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return this.f257969a.O(list, (y) obj);
            }
        });
        for (y yVar : list) {
            if (!this.f257976r.contains(yVar)) {
                this.f257976r.add(yVar);
                w(yVar);
            }
        }
    }

    @Override // com.planner5d.library.widget.editor.popup.properties.adapter.k, androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        if (((b) this.f257955a.get(i10)).a() != null && ((y) ((b) this.f257955a.get(i10)).a()).equals(f257971s)) {
            int i11 = 0 >> 4;
            return 4;
        }
        if (((b) this.f257955a.get(i10)).c() == null && ((b) this.f257955a.get(i10)).a() == null) {
            return 2;
        }
        return ((b) this.f257955a.get(i10)).c() == null ? 0 : 1;
    }
}
