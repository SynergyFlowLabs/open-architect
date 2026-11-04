package com.planner5d.library.widget.editor.popup.properties.adapter;

import android.content.Context;
import android.view.View;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.services.utility.p0;
import rx.Observable;
import rx.subjects.PublishSubject;

/* JADX INFO: loaded from: classes8.dex */
public class g extends k<ItemMaterial> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final a f257945n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final PublishSubject<Void> f257946o;

    public interface a {
        void a(ItemMaterial itemMaterial);
    }

    public g(p0 p0Var, com.planner5d.library.services.bitmaploader.target.h hVar, a aVar) {
        super(p0Var, hVar);
        this.f257946o = PublishSubject.create();
        this.f257945n = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(View view) {
        this.f257946o.onNext(null);
    }

    @Override // com.planner5d.library.widget.editor.popup.properties.adapter.k
    public void A(View view) {
        super.A(view);
        a aVar = this.f257945n;
        if (aVar != null) {
            aVar.a(o(((Integer) view.getTag()).intValue()));
        }
    }

    public Observable<Void> G() {
        return this.f257946o;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.planner5d.library.widget.editor.popup.properties.adapter.k
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public boolean p(ItemMaterial itemMaterial, ItemMaterial itemMaterial2) {
        return itemMaterial == itemMaterial2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.planner5d.library.widget.editor.popup.properties.adapter.k
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void x(com.planner5d.library.widget.editor.popup.properties.view.j jVar, ItemMaterial itemMaterial, String str, ItemProject itemProject, ItemRoom itemRoom) {
        jVar.u(itemMaterial, str, itemRoom);
        jVar.setErrorInfoButtonListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.editor.popup.properties.adapter.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f257944a.I(view);
            }
        });
    }

    @Override // com.planner5d.library.widget.editor.popup.properties.adapter.k
    protected com.planner5d.library.widget.editor.popup.properties.view.j n(Context context, boolean z10) {
        return super.n(context, z10).r(true);
    }
}
