package com.planner5d.library.widget.editor.editor3d.model.builder;

import androidx.annotation.m1;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.item.ItemNs;
import com.planner5d.library.services.exceptions.ErrorMessageException;

/* JADX INFO: loaded from: classes12.dex */
public class n extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ItemMaterial[] f255682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Throwable f255683b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f255684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f255685d;

    public n(ItemNs itemNs) {
        boolean z10 = itemNs.getClosed() && itemNs.hasClosedModel();
        this.f255685d = itemNs.getBounds(z10);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(itemNs.getModelId());
        sb2.append(z10 ? "_0" : "");
        this.f255684c = sb2.toString();
        this.f255682a = ItemMaterial.clone(itemNs.getMaterials());
    }

    @m1
    private void e(Throwable th2, ve.b bVar) {
        if (this.f255683b != null) {
            return;
        }
        if (th2 instanceof ErrorMessageException) {
            this.f255683b = th2;
            return;
        }
        this.f255683b = new ErrorMessageException(com.planner5d.library.f.s.A9, this.f255684c, th2.getMessage() + " #L" + bVar.i(this.f255684c));
    }

    @Override // com.planner5d.library.widget.editor.editor3d.model.builder.e
    @m1
    public cc.a a(com.planner5d.library.engine.a aVar, ve.b bVar) {
        try {
            return bVar.o(aVar, this.f255684c);
        } catch (Throwable th2) {
            e(th2, bVar);
            return null;
        }
    }

    @Override // com.planner5d.library.widget.editor.editor3d.model.builder.e
    @m1
    public void b(ve.b bVar) {
        try {
            bVar.x(this.f255682a);
            bVar.q(this.f255684c, this.f255685d);
        } catch (Throwable th2) {
            e(th2, bVar);
        }
    }

    public Throwable c() {
        return this.f255683b;
    }

    public ItemMaterial[] d() {
        return this.f255682a;
    }
}
