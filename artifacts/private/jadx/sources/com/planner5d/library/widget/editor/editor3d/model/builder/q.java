package com.planner5d.library.widget.editor.editor3d.model.builder;

import androidx.annotation.NonNull;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.item.ItemPr;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public class q extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f255688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ItemMaterial[] f255689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ve.b f255690c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.planner5d.library.engine.a f255691d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final dc.g<cc.a> f255692e;

    public q(ItemPr itemPr, @NonNull ItemMaterial[] itemMaterialArr, com.planner5d.library.math.m mVar, dc.d<cc.a> dVar) {
        this.f255689b = itemMaterialArr;
        dc.g<T> gVarF = dVar.f();
        this.f255692e = gVarF;
        this.f255688a = new b(itemPr, mVar, gVarF.d(new Function1() { // from class: com.planner5d.library.widget.editor.editor3d.model.builder.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f255687a.d((Integer) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ bc.b d(Integer num) {
        return this.f255690c.b(this.f255691d, false, this.f255689b[num.intValue()]);
    }

    @Override // com.planner5d.library.widget.editor.editor3d.model.builder.e
    public cc.a a(com.planner5d.library.engine.a aVar, ve.b bVar) {
        this.f255692e.f(aVar);
        this.f255690c = bVar;
        this.f255691d = aVar;
        this.f255688a.a();
        this.f255690c = null;
        this.f255691d = null;
        return this.f255692e.g(null);
    }

    @Override // com.planner5d.library.widget.editor.editor3d.model.builder.e
    public void b(ve.b bVar) {
        bVar.x(this.f255689b);
    }
}
