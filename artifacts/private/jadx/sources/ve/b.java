package ve;

import android.util.Pair;
import androidx.annotation.m1;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.k5;
import com.planner5d.library.model.manager.s0;
import com.planner5d.library.model.manager.y0;
import com.planner5d.library.model.y;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.widget.editor.editor3d.model.g;
import com.planner5d.library.widget.editor.editor3d.model.i;
import com.planner5d.library.widget.editor.editor3d.scene3d.j;
import ec.d;
import gc.e;
import ij.f;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
@f
public class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f385740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ec.f f385741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b2 f385742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ec.c f385743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private g f385744e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f385745f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<j> f385746g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final bc.c f385747h;

    public b(com.planner5d.library.application.b bVar, b2 b2Var, k5 k5Var, y0 y0Var, s0 s0Var, ec.e eVar, final i iVar, ij.c<j> cVar, c2 c2Var, bc.c cVar2, cc.b bVar2, ec.c cVar3, ec.b bVar3) {
        this.f385746g = cVar;
        this.f385742c = b2Var;
        ec.c cVarA = eVar.a(cVar3, bVar3);
        this.f385743d = cVarA;
        this.f385747h = cVar2;
        c cVar4 = new c(k5Var, s0Var, y0Var);
        Objects.requireNonNull(iVar);
        ec.f fVarC = eVar.c(cVar4, new ij.c() { // from class: ve.a
            @Override // ij.c
            public final Object get() {
                return iVar.b();
            }
        });
        this.f385741b = fVarC;
        this.f385740a = eVar.b(bVar, cVarA, fVarC, c2Var, bVar2);
    }

    @androidx.annotation.d
    private void F() {
        g gVar;
        while (true) {
            synchronized (this.f385745f) {
                gVar = this.f385744e;
            }
            if (gVar == null) {
                return;
            }
            gVar.d();
            while (!gVar.b()) {
                Thread.yield();
            }
        }
    }

    public void A() {
        this.f385741b.c();
    }

    public void B() {
        this.f385741b.g();
    }

    public void C(ErrorMessageException errorMessageException) {
        this.f385742c.r(errorMessageException);
    }

    @androidx.annotation.d
    public g D() throws Exception {
        while (true) {
            F();
            synchronized (this.f385745f) {
                try {
                    if (this.f385744e == null) {
                        ec.f fVar = this.f385741b;
                        g gVar = new g(this.f385746g.get().n());
                        this.f385744e = gVar;
                        fVar.b(gVar);
                        return this.f385744e;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Thread.yield();
        }
    }

    public void E(cc.a aVar) {
        this.f385740a.d(aVar);
    }

    public void a() {
        this.f385741b.d();
    }

    public bc.b b(com.planner5d.library.engine.a aVar, boolean z10, ItemMaterial itemMaterial) {
        return e(aVar, z10, itemMaterial, null);
    }

    @Override // gc.e
    public void dispose() {
        this.f385740a.clear();
        this.f385741b.clear();
    }

    public bc.b e(com.planner5d.library.engine.a aVar, boolean z10, ItemMaterial itemMaterial, String str) {
        Pair<String, Integer> pair;
        if (itemMaterial.texture != null) {
            y yVar = itemMaterial.texture;
            pair = new Pair<>(yVar.f222851c, Integer.valueOf(yVar.f222849a));
        } else {
            pair = null;
        }
        return itemMaterial.createMaterial(z10, str, this.f385741b.e(aVar, pair), this.f385747h);
    }

    @androidx.annotation.d
    public void f(g gVar) {
        synchronized (this.f385745f) {
            g gVar2 = this.f385744e;
            if (gVar2 == gVar && gVar2 != null) {
                this.f385741b.i();
                synchronized (this.f385745f) {
                    try {
                        if (this.f385744e == gVar) {
                            gVar.c();
                            ec.f fVar = this.f385741b;
                            this.f385744e = null;
                            fVar.b(null);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            }
            if (gVar != null) {
                gVar.d();
            }
        }
    }

    public bc.a g() {
        return this.f385741b.f();
    }

    public List<String> h() {
        return this.f385741b.h();
    }

    @m1
    public String i(String str) {
        return this.f385743d.b(str);
    }

    public boolean j() {
        boolean z10;
        synchronized (this.f385745f) {
            try {
                g gVar = this.f385744e;
                z10 = gVar == null || gVar.b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public boolean m(g gVar) {
        boolean z10;
        synchronized (this.f385745f) {
            try {
                z10 = this.f385744e != gVar && gVar.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public cc.a o(com.planner5d.library.engine.a aVar, String str) throws Throwable {
        return this.f385740a.c(aVar, str);
    }

    @m1
    public void q(String str, int[] iArr) throws Throwable {
        this.f385740a.a(str, iArr);
    }

    public void u(ItemMaterial itemMaterial) {
        y yVar;
        if (itemMaterial == null || (yVar = itemMaterial.texture) == null) {
            return;
        }
        this.f385741b.a(yVar.f222851c);
    }

    public void x(ItemMaterial[] itemMaterialArr) {
        if (itemMaterialArr != null) {
            for (ItemMaterial itemMaterial : itemMaterialArr) {
                u(itemMaterial);
            }
        }
    }

    public cc.a y(cc.a aVar) {
        return this.f385740a.b(aVar);
    }

    public void z(com.planner5d.library.engine.a aVar, boolean z10, bc.b bVar, ItemMaterial itemMaterial) {
        Pair<String, Integer> pair;
        if (itemMaterial.texture != null) {
            y yVar = itemMaterial.texture;
            pair = new Pair<>(yVar.f222851c, Integer.valueOf(yVar.f222849a));
        } else {
            pair = null;
        }
        itemMaterial.setToMaterial(z10, bVar, this.f385741b.e(aVar, pair));
    }
}
