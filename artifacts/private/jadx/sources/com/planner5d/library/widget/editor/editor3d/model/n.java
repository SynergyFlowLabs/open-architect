package com.planner5d.library.widget.editor.editor3d.model;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.planner5d.library.engine.util.math.Matrix4;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemEarth;
import com.planner5d.library.model.item.ItemGrid;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.item.ItemNs;
import com.planner5d.library.model.item.ItemPr;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.model.item.ItemWalls;
import com.planner5d.library.model.item.ItemWindow;
import com.planner5d.library.model.item.helper.ItemLayout3DHelper;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes12.dex */
public class n implements ac.d<cc.e> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float f255758l = 0.1f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Comparator<bc.b> f255759m = new Comparator() { // from class: com.planner5d.library.widget.editor.editor3d.model.k
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return n.d(((bc.b) obj).getName(), ((bc.b) obj2).getName());
        }
    };

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Object f255760n = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final ItemLayout f255761o = new ItemLayout();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final com.planner5d.library.math.m f255762p = new com.planner5d.library.math.m();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Matrix4 f255763q = new Matrix4();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Matrix4 f255764r = new Matrix4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f255765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Item f255766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cc.c f255767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cc.a f255768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.planner5d.library.engine.util.math.b f255769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final cc.e f255770f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final cc.e f255771g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final cc.e f255772h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f255773i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f255774j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f255775k;

    public n(com.planner5d.library.engine.a aVar, com.planner5d.library.widget.editor.editor3d.model.builder.e eVar, Item item, cc.a aVar2, float f10, ve.b bVar, boolean z10, cc.f fVar) {
        this.f255769e = new com.planner5d.library.engine.util.math.b();
        this.f255766b = item;
        this.f255775k = item instanceof ItemGrid;
        boolean z11 = item instanceof ItemNs;
        this.f255774j = z11 || (item instanceof ItemPr);
        this.f255768d = aVar2;
        if (!z10 && f10 > 0.0f && ((z11 && !(item instanceof ItemWindow)) || (item instanceof ItemPr))) {
            f10 += 0.1f;
        }
        this.f255765a = f10;
        cc.c cVarY = aVar2.Y();
        this.f255767c = cVarY;
        this.f255773i = eVar instanceof com.planner5d.library.widget.editor.editor3d.model.builder.o;
        if (z11 && (eVar instanceof com.planner5d.library.widget.editor.editor3d.model.builder.n) && bVar != null) {
            m(aVar, bVar, ((com.planner5d.library.widget.editor.editor3d.model.builder.n) eVar).d());
        }
        if (item != null) {
            l(this, f10);
        }
        this.f255770f = fVar.a(cVarY, Boolean.TRUE);
        this.f255771g = fVar.a(cVarY, Boolean.FALSE);
        this.f255772h = fVar.a(cVarY, null);
    }

    public static /* synthetic */ void a(boolean z10, ve.b bVar, boolean z11, bc.b bVar2) {
        if (bVar2.getName() != null) {
            String lowerCase = bVar2.getName().toLowerCase();
            if (lowerCase.contains("__leaf") || lowerCase.contains("__leaves") || lowerCase.contains("__flower") || lowerCase.contains("__grid")) {
                bVar2.D1(null);
                bVar2.t0(0.7f);
            }
            if (lowerCase.contains("__chrome") || (z10 && bVar2.f1())) {
                bVar2.L0(null, null, null);
                bVar2.v0(200.0f);
                bVar2.c0(-1);
                bVar2.N(bVar.g());
            }
        }
        bVar2.h0();
        bVar2.Z0(z11, false);
        if (bVar2.f1()) {
            bVar2.H1(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(String str, String str2) {
        int iIntValue = 0;
        int iIntValue2 = (str == null || !str.contains("__")) ? 0 : Integer.valueOf(str.split("__")[0]).intValue();
        if (str2 != null && str2.contains("__")) {
            iIntValue = Integer.valueOf(str2.split("__")[0]).intValue();
        }
        return iIntValue2 - iIntValue;
    }

    private static <T extends bc.b> bc.b[] e(Iterable<T> iterable) {
        final ArrayList arrayList = new ArrayList();
        iterable.forEach(new Consumer() { // from class: com.planner5d.library.widget.editor.editor3d.model.m
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                arrayList.add((bc.b) obj);
            }
        });
        arrayList.sort(f255759m);
        return (bc.b[]) arrayList.toArray(new bc.b[0]);
    }

    private static void l(n nVar, float f10) {
        synchronized (f255760n) {
            try {
                Item item = nVar.f255766b;
                ItemLayout itemLayout = f255761o;
                ItemLayout3DHelper.item(item, itemLayout);
                com.planner5d.library.math.m mVar = f255762p;
                itemLayout.getScale(mVar).y0(mVar.f180482a, mVar.f180484c, mVar.f180483b);
                if (itemLayout.isFlippedHorizontally()) {
                    mVar.f180484c *= -1.0f;
                }
                if (itemLayout.isFlippedVertically()) {
                    mVar.f180482a *= -1.0f;
                }
                if (nVar.f255773i) {
                    ItemLayout3DHelper.transformPlaceholder(nVar.f255766b, f255763q, f255764r);
                } else {
                    f255763q.s();
                }
                Matrix4 matrix4 = f255763q;
                Matrix4 matrix5 = f255764r;
                matrix4.w(matrix5.j0(mVar));
                itemLayout.getRotation(mVar);
                if (nVar.f255766b instanceof ItemRoom) {
                    mVar.y0(0.0f, 0.0f, 0.0f);
                }
                matrix4.w(matrix5.c0(1.0f, 0.0f, 0.0f, mVar.f180482a).x(0.0f, -1.0f, 0.0f, (itemLayout.isFlippedHorizontally() ^ itemLayout.isFlippedVertically() ? 180 : 0) + mVar.f180483b).x(0.0f, 0.0f, 1.0f, mVar.f180484c));
                itemLayout.getPosition(mVar).y0(mVar.f180482a, mVar.f180484c, mVar.f180483b);
                mVar.f180483b += f10;
                matrix4.w(matrix5.l0(gc.d.f(mVar)));
                Item item2 = nVar.f255766b;
                if (!(item2 instanceof ItemWalls) && (!(item2 instanceof ItemNs) || !((ItemNs) item2).getModelDoubleSided())) {
                    final boolean zIsFlippedHorizontally = itemLayout.isFlippedHorizontally() ^ itemLayout.isFlippedVertically();
                    nVar.f255767c.a().forEach(new Consumer() { // from class: com.planner5d.library.widget.editor.editor3d.model.l
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            ((bc.b) obj).Z0(false, zIsFlippedHorizontally);
                        }
                    });
                }
                nVar.f255767c.c(matrix4.r());
                nVar.f255769e.G(nVar.f255768d.getBounds()).F(matrix4);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void m(com.planner5d.library.engine.a aVar, final ve.b bVar, ItemMaterial[] itemMaterialArr) {
        bc.b bVar2;
        final boolean modelDoubleSided = ((ItemNs) this.f255766b).getModelDoubleSided();
        final boolean z10 = this.f255766b instanceof ItemWindow;
        if (itemMaterialArr != null) {
            bc.b[] bVarArrE = e(this.f255767c.a());
            for (ItemMaterial itemMaterial : itemMaterialArr) {
                int i10 = itemMaterial.position;
                if (i10 < bVarArrE.length && (bVar2 = bVarArrE[i10]) != null) {
                    bVar.z(aVar, false, bVar2, itemMaterial);
                }
            }
        }
        this.f255767c.a().forEach(new Consumer() { // from class: com.planner5d.library.widget.editor.editor3d.model.j
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                n.a(z10, bVar, modelDoubleSided, (bc.b) obj);
            }
        });
    }

    @Override // ac.d
    public boolean A0() {
        Item item = this.f255766b;
        return (item instanceof ItemWall) && ((ItemWall) item).hidden;
    }

    @Override // ac.d
    @p0
    public com.planner5d.library.engine.rendering.util.e C0(@NonNull com.planner5d.library.engine.rendering.util.e eVar) {
        if (this.f255768d.a0() == null) {
            return null;
        }
        return this.f255768d.a0().b(eVar);
    }

    @Override // ac.d
    public boolean D0() {
        return this.f255775k;
    }

    @Override // ac.d
    public boolean E0() {
        return this.f255766b instanceof ItemEarth;
    }

    public com.planner5d.library.engine.util.math.b f() {
        return g(new com.planner5d.library.engine.util.math.b());
    }

    public com.planner5d.library.engine.util.math.b g(com.planner5d.library.engine.util.math.b bVar) {
        return bVar.G(this.f255773i ? ItemLayout3DHelper.placeholderBounds(this.f255766b, this.f255768d.getBounds(), new com.planner5d.library.engine.util.math.b()) : this.f255768d.getBounds());
    }

    @Override // ac.d
    @NonNull
    public com.planner5d.library.engine.util.math.b getBounds() {
        return this.f255769e;
    }

    @Override // ac.d
    @p0
    public Object getItem() {
        return this.f255766b;
    }

    @Override // ac.d
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public cc.e u0() {
        return this.f255772h;
    }

    @Override // ac.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public cc.e x0() {
        return this.f255771g;
    }

    @Override // ac.d
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public cc.e B0() {
        return this.f255770f;
    }

    @Override // ac.d
    @NonNull
    public cc.c k() {
        return this.f255767c;
    }

    public void n(ItemLayout itemLayout) {
        this.f255766b.setLayout(itemLayout);
        l(this, this.f255765a);
    }

    @Override // ac.d
    public boolean v0() {
        return this.f255774j;
    }

    @Override // ac.d
    public boolean w0() {
        return this.f255766b instanceof ItemWall;
    }

    @Override // ac.d
    public boolean y0() {
        return this.f255766b instanceof ItemPr;
    }

    @Override // ac.d
    public boolean z0() {
        return this.f255766b instanceof ItemNs;
    }

    public n(n nVar, cc.c cVar, cc.f fVar) {
        this.f255775k = nVar.f255775k;
        this.f255774j = nVar.f255774j;
        this.f255765a = nVar.f255765a;
        this.f255773i = nVar.f255773i;
        this.f255766b = nVar.f255766b;
        this.f255767c = cVar;
        this.f255768d = nVar.f255768d;
        this.f255769e = nVar.f255769e;
        int i10 = 3 & 0;
        this.f255770f = null;
        this.f255771g = null;
        this.f255772h = fVar.a(cVar, null);
    }
}
