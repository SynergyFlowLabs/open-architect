package com.planner5d.library.widget.editor.editor3d.scene3d;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.GLES20;
import androidx.annotation.NonNull;
import com.planner5d.library.model.LogRecord;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemGrid;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.item.ItemNs;
import com.planner5d.library.model.item.ItemPartition;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.model.item.ItemWalls;
import com.planner5d.library.model.manager.s0;
import com.planner5d.library.model.manager.t1;
import com.planner5d.library.model.y;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.h3;
import com.planner5d.library.services.utility.j3;
import com.planner5d.library.walls.Wall;
import com.planner5d.library.walls.WallsBuilder3DSide;
import com.planner5d.library.walls.WallsInfo;
import com.planner5d.library.walls.WallsInfoWall;
import com.planner5d.library.widget.editor.editor3d.model.builder.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import rx.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public class j {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final com.planner5d.library.services.rx.b<Void> f255826w = new com.planner5d.library.services.rx.b<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private l f255827a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r f255829c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ac.a f255831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ac.h f255832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ve.b f255833g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ac.j<cc.e> f255835i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Context f255837k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final s0 f255838l;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final t1 f255843q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final com.planner5d.library.engine.a f255844r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final c2 f255845s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ac.e<cc.e> f255846t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final dc.d<cc.a> f255847u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final cc.f f255848v;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f255828b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f255830d = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.planner5d.library.widget.editor.editor3d.model.s f255834h = new com.planner5d.library.widget.editor.editor3d.model.s();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.planner5d.library.widget.editor.editor3d.model.builder.m f255836j = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f255839m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f255840n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f255841o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Item f255842p = null;

    class a implements gc.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.widget.editor.facade.g f255849a;

        a(com.planner5d.library.widget.editor.facade.g gVar) {
            this.f255849a = gVar;
        }

        public static /* synthetic */ LogRecord c(String str) {
            return new LogRecord("shader_compilation", str);
        }

        @Override // gc.g
        public void a(@NonNull final String str) {
            com.planner5d.library.application.b.r().d().v(new ij.c() { // from class: com.planner5d.library.widget.editor.editor3d.scene3d.i
                @Override // ij.c
                public final Object get() {
                    return j.a.c(str);
                }
            });
        }

        @Override // gc.g
        public void b(@NonNull Exception exc) {
            this.f255849a.c((ErrorMessageException) exc);
        }
    }

    class b extends com.planner5d.library.services.rx.e<Void> {
        b() {
        }

        public static /* synthetic */ LogRecord d(Throwable th2) {
            return new LogRecord("editor3d_holes", null, th2);
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(final Throwable th2) {
            j.this.f255843q.v(new ij.c() { // from class: com.planner5d.library.widget.editor.editor3d.scene3d.k
                @Override // ij.c
                public final Object get() {
                    return j.b.d(th2);
                }
            });
        }
    }

    public j(com.planner5d.library.engine.a aVar, ve.b bVar, Context context, s0 s0Var, t1 t1Var, boolean z10, final com.planner5d.library.widget.editor.helper.selector.a aVar2, final com.planner5d.library.widget.editor.facade.f fVar, com.planner5d.library.widget.editor.facade.g gVar, c2 c2Var, ac.f fVar2, dc.d<cc.a> dVar, cc.f fVar3) {
        this.f255827a = new l(null, new com.planner5d.library.widget.editor.editor3d.model.n[0], fVar3);
        this.f255848v = fVar3;
        this.f255844r = aVar;
        this.f255843q = t1Var;
        this.f255829c = new r(new ij.c() { // from class: com.planner5d.library.widget.editor.editor3d.scene3d.b
            @Override // ij.c
            public final Object get() {
                return j.c(aVar2);
            }
        }, new ij.c() { // from class: com.planner5d.library.widget.editor.editor3d.scene3d.c
            @Override // ij.c
            public final Object get() {
                return j.e(fVar);
            }
        }, t1Var, dVar, fVar3);
        Context applicationContext = context.getApplicationContext();
        this.f255837k = applicationContext;
        this.f255833g = bVar;
        this.f255838l = s0Var;
        this.f255845s = c2Var;
        this.f255847u = dVar;
        a aVar3 = new a(gVar);
        this.f255831e = fVar2.c(applicationContext, aVar, aVar3);
        ac.h hVarA = fVar2.a(aVar, z10, aVar3);
        this.f255832f = hVarA;
        hVarA.n0(0.5f, 0.5f, 0.5f, 1.0f);
        hVarA.W();
        this.f255835i = fVar2.d();
        GLES20.glEnable(32823);
        try {
            hVarA.X0(applicationContext, s0Var.b());
        } catch (ErrorMessageException e10) {
            gVar.c(e10);
        } catch (Exception unused) {
        }
        this.f255846t = fVar2.b(aVar3, this.f255831e, 16640, this.f255832f, new ac.b() { // from class: com.planner5d.library.widget.editor.editor3d.scene3d.d
            @Override // ac.b
            public final void a(ac.n nVar, ac.d dVar2) {
                this.f255820a.E(nVar, dVar2);
            }
        }, new com.planner5d.library.engine.rendering.util.b() { // from class: com.planner5d.library.widget.editor.editor3d.scene3d.e
            @Override // com.planner5d.library.engine.rendering.util.b
            public final float a(float f10) {
                return gc.d.d(f10);
            }
        }, this.f255835i);
    }

    private boolean B(Item item, List<String> list) {
        ItemMaterial[] materials = item.getMaterials();
        if (materials == null) {
            return false;
        }
        for (ItemMaterial itemMaterial : materials) {
            y yVar = itemMaterial.texture;
            if (yVar != null && list.contains(yVar.f222851c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F() {
        l lVar;
        WallsInfo wallsInfo;
        ArrayList arrayList = new ArrayList();
        synchronized (this.f255830d) {
            lVar = this.f255827a;
        }
        for (com.planner5d.library.widget.editor.editor3d.model.n nVar : lVar.f255853a) {
            if (nVar.f255768d instanceof cc.d) {
                Item item = nVar.f255766b;
                if (item instanceof ItemWall) {
                    Item parentItem = item.getParentItem();
                    if (((parentItem instanceof ItemRoom) || (parentItem instanceof ItemPartition)) && (wallsInfo = ((ItemWalls) parentItem).getWallsInfo()) != null) {
                        WallsInfoWall wallsInfoWall = wallsInfo.get((Wall) nVar.f255766b);
                        WallsBuilder3DSide info = ((cc.d) nVar.f255768d).getInfo();
                        if (wallsInfoWall == null || info == null || !new WallsBuilder3DSide(wallsInfo, wallsInfoWall, z.f255720a.a(wallsInfoWall), j3.f225291c, com.planner5d.library.math.f.f180474a).equals(info)) {
                            arrayList.add(nVar.f255766b);
                        }
                    }
                }
            }
        }
        P(arrayList, "rebuild_holes");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G() {
        List<String> listH = this.f255833g.h();
        ArrayList arrayList = new ArrayList();
        for (Item item : this.f255827a.f255854b) {
            if (B(item, listH)) {
                arrayList.add(item);
            }
        }
        if (listH.contains(this.f255827a.f255861i.getEarth().getMaterial().texture.f222851c)) {
            arrayList.add(this.f255827a.f255861i.getEarth());
        }
        this.f255833g.a();
        com.planner5d.library.widget.editor.editor3d.model.p.i((Item[]) arrayList.toArray(new Item[0]), this.f255833g, this, false, "refresh_fallback_textures");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ com.planner5d.library.math.m H(com.planner5d.library.widget.editor.editor3d.model.n nVar, com.planner5d.library.math.m mVar) {
        Item item = nVar.f255766b;
        this.f255842p = item;
        return (item == null || mVar == null) ? mVar : item.getLayout(new ItemLayout()).getPosition(mVar);
    }

    private void J(Item item) {
        K(item, null);
    }

    private void P(List<Item> list, String str) {
        if (!list.isEmpty()) {
            com.planner5d.library.widget.editor.editor3d.model.p.i((Item[]) list.toArray(new Item[0]), this.f255833g, this, false, str);
        }
    }

    public static /* synthetic */ LogRecord a(RuntimeException runtimeException) {
        return new LogRecord("3d_model_select", null, runtimeException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public <T extends cc.e> void E(com.planner5d.library.widget.editor.projectresources.viewoptions.b bVar, ac.d<T> dVar) {
        bc.b bVar2 = (bc.b) dVar.k().a().iterator().next();
        if (bVar2 != null) {
            com.planner5d.library.engine.rendering.util.g gVarY0 = bVar2.Y0(new com.planner5d.library.engine.rendering.util.j(null, null));
            float f10 = bVar.f258080k / 10.0f;
            if (gVarY0 == null || f10 == gVarY0.j()) {
                return;
            }
            Object item = dVar.getItem();
            Objects.requireNonNull(item);
            bVar2.F1(new y(((ItemGrid) item).getMaterial().texture, Float.valueOf(f10), (Float) null).h(1.0f));
        }
    }

    public static /* synthetic */ com.planner5d.library.widget.editor.helper.selector.a c(com.planner5d.library.widget.editor.helper.selector.a aVar) {
        return aVar;
    }

    public static /* synthetic */ com.planner5d.library.widget.editor.facade.f e(com.planner5d.library.widget.editor.facade.f fVar) {
        return fVar;
    }

    @androidx.annotation.d
    private void f0(com.planner5d.library.widget.editor.editor3d.model.n[] nVarArr, ItemProject itemProject) {
        synchronized (this.f255830d) {
            try {
                if (this.f255828b) {
                    nVarArr = new com.planner5d.library.widget.editor.editor3d.model.n[0];
                }
                this.f255827a = new l(itemProject, nVarArr, this.f255848v);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static float p(Context context) {
        return h3.D(context) / 320.0f;
    }

    public void A() {
        this.f255846t.d();
    }

    public void C() {
        ac.g gVarE0 = this.f255832f.e0();
        if (gVarE0 != null) {
            gVarE0.invalidate();
        }
    }

    public boolean D() {
        boolean z10;
        synchronized (this.f255830d) {
            z10 = this.f255828b;
        }
        return z10;
    }

    public void I(Runnable runnable) {
        synchronized (this.f255830d) {
            try {
                runnable.run();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void K(Item item, ItemLayout itemLayout) {
        com.planner5d.library.widget.editor.editor3d.model.n nVarZ;
        if (item == null) {
            return;
        }
        synchronized (this.f255830d) {
            if (itemLayout == null) {
                try {
                    itemLayout = item.getLayout(new ItemLayout());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (com.planner5d.library.widget.editor.editor3d.model.n nVar : this.f255827a.f255853a) {
                if (nVar.f255766b == item) {
                    nVar.n(itemLayout);
                }
            }
            Item itemY = y();
            if (itemY != null && item == itemY && (nVarZ = z()) != null) {
                nVarZ.n(itemLayout);
            }
            this.f255827a.r(item);
        }
        C();
    }

    public void L(Item item, boolean z10) {
        synchronized (this.f255830d) {
            try {
                for (com.planner5d.library.widget.editor.editor3d.model.n nVar : this.f255827a.f255853a) {
                    if (nVar.f255766b == item) {
                        if (z10) {
                            h0(item);
                        }
                        J(item);
                        break;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C();
    }

    public boolean M(Runnable runnable) {
        return com.planner5d.library.engine.d.c(this.f255844r, runnable);
    }

    public boolean N(Runnable runnable, long j10) {
        return com.planner5d.library.engine.d.d(this.f255844r, runnable, j10);
    }

    public boolean O(long j10, Runnable runnable) {
        return com.planner5d.library.engine.d.e(this.f255844r, runnable, j10);
    }

    public void Q(boolean z10, String str) {
        synchronized (this.f255830d) {
            try {
                List<Item> arrayList = new ArrayList<>();
                for (Item item : this.f255827a.f255854b) {
                    if (item instanceof ItemWalls) {
                        if (z10 && !(item instanceof ItemRoom) && !arrayList.contains(item)) {
                            arrayList.add(item);
                        }
                        for (Item item2 : ((ItemWalls) item).getChildren()) {
                            if (!arrayList.contains(item2)) {
                                arrayList.add(item2);
                            }
                        }
                    } else if ((item instanceof ItemWall) && !arrayList.contains(item)) {
                        arrayList.add(item);
                    }
                }
                if (z10) {
                    List<Item> arrayList2 = new ArrayList<>();
                    for (Item item3 : arrayList) {
                        if (item3 instanceof ItemWall) {
                            ItemWalls itemWalls = (ItemWalls) item3.getParentItem();
                            if (!arrayList2.contains(itemWalls)) {
                                arrayList2.add(itemWalls);
                                if ((itemWalls instanceof ItemRoom) || (itemWalls instanceof ItemPartition)) {
                                    itemWalls.setWalls(itemWalls.getChildren());
                                }
                            }
                        } else if (!arrayList2.contains(item3)) {
                            arrayList2.add(item3);
                        }
                    }
                    arrayList = arrayList2;
                }
                P(arrayList, str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void R() {
        f255826w.f(com.planner5d.library.services.rx.i.i(new Runnable() { // from class: com.planner5d.library.widget.editor.editor3d.scene3d.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f255823a.F();
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224933c)).subscribe((Subscriber<? super Void>) new b());
    }

    public void S(String str) {
        synchronized (this.f255830d) {
            try {
                ArrayList arrayList = new ArrayList();
                for (Item item : this.f255827a.f255854b) {
                    if (item.getUid().equals(str) && (item instanceof ItemRoom)) {
                        arrayList.add(item);
                    }
                }
                P(arrayList, "redraw_flooring_in_room_" + str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void T() {
        M(new Runnable() { // from class: com.planner5d.library.widget.editor.editor3d.scene3d.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f255824a.G();
            }
        });
    }

    public void U(@NonNull Item[] itemArr, long j10) {
        synchronized (this.f255830d) {
            try {
                if (j10 != this.f255840n) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (Item item : itemArr) {
                    arrayList.addAll(item.getTreeList());
                }
                ArrayList arrayList2 = new ArrayList();
                for (com.planner5d.library.widget.editor.editor3d.model.n nVar : this.f255827a.f255853a) {
                    if (!arrayList.contains(nVar.f255766b)) {
                        arrayList2.add(nVar);
                    } else if (!nVar.f255773i) {
                        this.f255833g.E(nVar.f255768d);
                        Item item2 = nVar.f255766b;
                        if ((item2 instanceof ItemWall) || (item2 instanceof ItemWalls)) {
                            nVar.f255768d.dispose();
                        }
                    }
                }
                f0((com.planner5d.library.widget.editor.editor3d.model.n[]) arrayList2.toArray(new com.planner5d.library.widget.editor.editor3d.model.n[0]), this.f255827a.f255861i);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void V(com.planner5d.library.engine.g gVar, com.planner5d.library.widget.editor.projectresources.viewoptions.b bVar) {
        synchronized (this.f255830d) {
            try {
                if (this.f255828b) {
                    return;
                }
                this.f255839m = true;
                l lVar = this.f255827a;
                final com.planner5d.library.widget.editor.editor3d.model.n nVarQ = this.f255829c.q();
                if (this.f255841o) {
                    Item item = this.f255842p;
                    if (item != null && (nVarQ == null || item != nVarQ.f255766b)) {
                        this.f255835i.dispose();
                        this.f255842p = null;
                    }
                    if (nVarQ != null && this.f255842p != nVarQ.f255766b) {
                        this.f255835i.z0(this.f255844r, new ac.j.a() { // from class: com.planner5d.library.widget.editor.editor3d.scene3d.f
                            @Override // ac.j.a
                            public final com.planner5d.library.math.m a(com.planner5d.library.math.m mVar) {
                                return this.f255821a.H(nVarQ, mVar);
                            }
                        }, lVar.f255861i.getEarth().getSize(new com.planner5d.library.math.k()), this.f255847u);
                    }
                } else if (this.f255842p != null) {
                    this.f255835i.dispose();
                    this.f255842p = null;
                }
                this.f255846t.a(this.f255837k, this.f255838l.b());
                try {
                    this.f255846t.e(gVar, bVar, lVar, nVarQ);
                    synchronized (this.f255830d) {
                        try {
                            this.f255839m = false;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        synchronized (this.f255830d) {
                            try {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Rendering failed, selection is ");
                                sb2.append(nVarQ == null ? AbstractJsonLexerKt.NULL : "not empty");
                                sb2.append(", ");
                                sb2.append(this.f255828b ? "disposed" : "undisposed");
                                throw new RuntimeException(sb2.toString(), th3);
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                    } catch (Throwable th5) {
                        synchronized (this.f255830d) {
                            try {
                                this.f255839m = false;
                                throw th5;
                            } catch (Throwable th6) {
                                throw th6;
                            }
                        }
                    }
                }
            } catch (Throwable th7) {
                throw th7;
            }
        }
    }

    public void W() {
        GLES20.glEnable(2929);
        GLES20.glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
    }

    public byte[] X(com.planner5d.library.engine.g gVar, com.planner5d.library.widget.editor.projectresources.viewoptions.b bVar, int i10, int i11) throws Throwable {
        byte[] bArrB;
        synchronized (this.f255830d) {
            this.f255846t.c(this.f255844r, i10, i11);
            V(gVar, bVar);
            bArrB = this.f255846t.b(i10, i11);
        }
        return bArrB;
    }

    public void Y() {
        this.f255834h.g(this.f255837k, this, this.f255833g, this.f255845s);
    }

    public void Z() {
        this.f255834h.h(this.f255837k, this, this.f255833g, this.f255845s);
    }

    public void a0() {
        this.f255834h.j(this.f255837k);
    }

    public void c0(com.planner5d.library.engine.g gVar) {
        this.f255832f.U(gVar.Q1());
    }

    public boolean d0(PointF pointF, com.planner5d.library.engine.util.math.k kVar) {
        boolean zB;
        if (this.f255833g.j()) {
            try {
                synchronized (this.f255830d) {
                    try {
                        zB = this.f255829c.B(pointF, kVar, this.f255827a);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return zB;
            } catch (RuntimeException e10) {
                this.f255843q.v(new ij.c() { // from class: com.planner5d.library.widget.editor.editor3d.scene3d.a
                    @Override // ij.c
                    public final Object get() {
                        return j.a(e10);
                    }
                });
            }
        }
        return false;
    }

    public void e0(com.planner5d.library.widget.editor.editor3d.model.n[] nVarArr, ItemProject itemProject) {
        while (true) {
            synchronized (this.f255830d) {
                try {
                    if (!this.f255839m) {
                        f0(nVarArr, itemProject);
                        this.f255840n++;
                        this.f255829c.f(nVarArr);
                        C();
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Thread.yield();
        }
    }

    public void g0(boolean z10) {
        synchronized (this.f255830d) {
            this.f255841o = z10;
        }
    }

    public boolean h0(Item item) {
        boolean zD;
        synchronized (this.f255830d) {
            try {
                zD = this.f255829c.D(this.f255844r, item, this.f255827a.f255853a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zD;
    }

    public void i(List<com.planner5d.library.widget.editor.editor3d.model.n> list, Item item, long j10) {
        synchronized (this.f255830d) {
            try {
                if (j10 != this.f255840n) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Collections.addAll(arrayList, this.f255827a.f255853a);
                arrayList.addAll(list);
                f0((com.planner5d.library.widget.editor.editor3d.model.n[]) arrayList.toArray(new com.planner5d.library.widget.editor.editor3d.model.n[0]), this.f255827a.f255861i);
                if (item != null) {
                    h0(item);
                }
                C();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void j() {
        this.f255836j = null;
    }

    public void k() {
        synchronized (this.f255830d) {
            try {
                this.f255829c.f(this.f255827a.f255853a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void l(Context context) {
        synchronized (this.f255830d) {
            try {
                if (D()) {
                    return;
                }
                this.f255828b = true;
                k();
                this.f255829c.dispose();
                j();
                f0(new com.planner5d.library.widget.editor.editor3d.model.n[0], this.f255827a.f255861i);
                this.f255832f.dispose();
                this.f255834h.f(context);
                synchronized (this.f255830d) {
                    this.f255835i.dispose();
                    this.f255831e.dispose();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean m(Runnable runnable) {
        return com.planner5d.library.engine.d.b(this.f255844r, runnable);
    }

    public com.planner5d.library.engine.a n() {
        return this.f255844r;
    }

    public com.planner5d.library.widget.editor.editor3d.model.builder.m o() {
        if (this.f255836j == null) {
            this.f255836j = com.planner5d.library.widget.editor.editor3d.model.builder.m.d(this.f255847u);
        }
        return this.f255836j;
    }

    public boolean q(com.planner5d.library.engine.util.math.k kVar) {
        boolean zM;
        synchronized (this.f255830d) {
            try {
                zM = this.f255829c.m(kVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zM;
    }

    public ItemProject r() {
        ItemProject itemProject;
        synchronized (this.f255830d) {
            try {
                itemProject = this.f255827a.f255861i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return itemProject;
    }

    public dc.d<cc.a> s() {
        return this.f255847u;
    }

    public l.a[] t() {
        l.a[] aVarArrP;
        synchronized (this.f255830d) {
            try {
                aVarArrP = this.f255827a.p();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVarArrP;
    }

    public ItemNs[] u() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f255830d) {
            try {
                for (com.planner5d.library.widget.editor.editor3d.model.n nVar : this.f255827a.f255853a) {
                    if (nVar.f255773i) {
                        Item item = nVar.f255766b;
                        if (item instanceof ItemNs) {
                            arrayList.add((ItemNs) item);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return (ItemNs[]) arrayList.toArray(new ItemNs[0]);
    }

    public cc.f v() {
        return this.f255848v;
    }

    public long w() {
        long j10;
        synchronized (this.f255830d) {
            j10 = this.f255840n;
        }
        return j10;
    }

    public com.planner5d.library.widget.editor.editor3d.model.n[] x() {
        com.planner5d.library.widget.editor.editor3d.model.n[] nVarArrO;
        synchronized (this.f255830d) {
            nVarArrO = this.f255829c.o();
        }
        return nVarArrO;
    }

    public Item y() {
        com.planner5d.library.widget.editor.editor3d.model.n[] nVarArrX = x();
        if (nVarArrX == null) {
            return null;
        }
        return nVarArrX[0].f255766b;
    }

    public com.planner5d.library.widget.editor.editor3d.model.n z() {
        com.planner5d.library.widget.editor.editor3d.model.n nVarQ;
        synchronized (this.f255830d) {
            nVarQ = this.f255829c.q();
        }
        return nVarQ;
    }
}
