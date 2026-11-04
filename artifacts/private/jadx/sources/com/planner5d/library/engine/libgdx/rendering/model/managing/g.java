package com.planner5d.library.engine.libgdx.rendering.model.managing;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.util.Pair;
import androidx.annotation.p0;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.p;

/* JADX INFO: loaded from: classes5.dex */
class g implements ec.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final fc.b f160957e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<fc.a.InterfaceC1901a> f160961i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.badlogic.gdx.graphics.k f160962j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, com.planner5d.library.services.bitmaploader.target.a> f160953a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, com.badlogic.gdx.graphics.k> f160954b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f160955c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.badlogic.gdx.graphics.k> f160956d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.badlogic.gdx.graphics.c f160958f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.badlogic.gdx.graphics.i[] f160959g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private fc.a.InterfaceC1901a f160960h = null;

    class a extends com.badlogic.gdx.graphics.c {
        a(com.badlogic.gdx.graphics.i iVar, com.badlogic.gdx.graphics.i iVar2, com.badlogic.gdx.graphics.i iVar3, com.badlogic.gdx.graphics.i iVar4, com.badlogic.gdx.graphics.i iVar5, com.badlogic.gdx.graphics.i iVar6, boolean z10) {
            super(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, z10);
        }

        @Override // com.badlogic.gdx.graphics.c
        public void F(com.badlogic.gdx.graphics.d dVar) {
            com.badlogic.gdx.graphics.k.a aVar = com.badlogic.gdx.graphics.k.a.Linear;
            this.f94203c = aVar;
            this.f94204d = aVar;
            GLES20.glActiveTexture(33987);
            super.F(dVar);
        }
    }

    public g(fc.b bVar, ij.c<fc.a.InterfaceC1901a> cVar) {
        this.f160957e = bVar;
        this.f160961i = cVar;
    }

    private boolean n() {
        fc.a.InterfaceC1901a interfaceC1901a = this.f160960h;
        return (interfaceC1901a == null || !interfaceC1901a.a()) && !this.f160961i.get().a();
    }

    private static <K> List<K> r(Map<K, ?> map, Object obj) {
        LinkedList linkedList = new LinkedList();
        if (map.containsValue(obj)) {
            for (Map.Entry<K, ?> entry : map.entrySet()) {
                if (entry.getValue().equals(obj)) {
                    linkedList.add(entry.getKey());
                }
            }
        }
        return linkedList;
    }

    @p0
    private Pair<String, Integer> s(String str) {
        return this.f160957e.d(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object t(com.planner5d.library.engine.a aVar, Pair pair, String str) {
        return o(aVar, pair);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object u(com.planner5d.library.engine.a aVar, String str, String str2) {
        return p(aVar, str);
    }

    private com.badlogic.gdx.graphics.i v(String str) throws Throwable {
        Throwable th2;
        com.planner5d.library.services.bitmaploader.target.b bVar = new com.planner5d.library.services.bitmaploader.target.b(true);
        boolean z10 = false & false;
        this.f160957e.a("datafile/environmentmap/" + str + ".webp", 0, 0, bVar, 1L);
        while (true) {
            ByteArrayOutputStream byteArrayOutputStream = null;
            if (bVar.e()) {
                Bitmap bitmapC = bVar.c();
                if (bitmapC == null) {
                    bVar.dispose();
                    p.l(null);
                    return null;
                }
                try {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        bitmapC.compress(compressFormat, 100, byteArrayOutputStream2);
                        com.badlogic.gdx.graphics.i iVar = new com.badlogic.gdx.graphics.i(byteArrayOutputStream2.toByteArray(), 0, byteArrayOutputStream2.size());
                        bVar.dispose();
                        p.l(byteArrayOutputStream2);
                        return iVar;
                    } catch (Throwable th3) {
                        th2 = th3;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        bVar.dispose();
                        p.l(byteArrayOutputStream);
                        throw th2;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                }
            } else {
                if (!n()) {
                    bVar.dispose();
                    return null;
                }
                Thread.yield();
            }
        }
    }

    private void w(Pair<String, Integer> pair) {
        if (pair != null) {
            a((String) pair.first);
        }
    }

    @Override // ec.f
    public void a(@p0 String str) {
        synchronized (this.f160955c) {
            if (str != null) {
                try {
                    if (n() && !this.f160953a.containsKey(str) && !this.f160954b.containsKey(str)) {
                        com.planner5d.library.services.bitmaploader.target.b bVar = new com.planner5d.library.services.bitmaploader.target.b(true);
                        this.f160957e.b(str, bVar);
                        while (!bVar.e() && n()) {
                            Thread.yield();
                        }
                        synchronized (this.f160955c) {
                            try {
                                if (n()) {
                                    this.f160953a.put(str, bVar);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // fc.a
    public void b(@p0 fc.a.InterfaceC1901a interfaceC1901a) {
        synchronized (this.f160955c) {
            try {
                this.f160960h = interfaceC1901a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0050  */
    @Override // ec.f
    public void c() {
        g gVar;
        com.badlogic.gdx.graphics.c cVar;
        if (this.f160959g != null) {
            int i10 = 0;
            while (true) {
                if (i10 < 6) {
                    com.badlogic.gdx.graphics.i[] iVarArr = this.f160959g;
                    if (iVarArr[i10] == null) {
                        for (com.badlogic.gdx.graphics.i iVar : iVarArr) {
                            if (iVar != null) {
                                iVar.a();
                            }
                        }
                        break;
                    }
                    i10++;
                } else {
                    com.badlogic.gdx.graphics.i[] iVarArr2 = this.f160959g;
                    gVar = this;
                    gVar.f160958f = gVar.new a(iVarArr2[0], iVarArr2[1], iVarArr2[2], iVarArr2[3], iVarArr2[4], iVarArr2[5], false);
                }
            }
            gVar = this;
            cVar = gVar.f160958f;
            if (cVar != null) {
                cVar.dispose();
                gVar.f160958f = null;
            }
        } else {
            gVar = this;
            cVar = gVar.f160958f;
            if (cVar != null) {
                cVar.dispose();
                gVar.f160958f = null;
            }
        }
        gVar.f160959g = null;
    }

    @Override // ec.f
    public void clear() {
        int i10;
        com.badlogic.gdx.graphics.k[] kVarArr;
        synchronized (this.f160955c) {
            kVarArr = (com.badlogic.gdx.graphics.k[]) this.f160956d.toArray(new com.badlogic.gdx.graphics.k[0]);
        }
        for (com.badlogic.gdx.graphics.k kVar : kVarArr) {
            kVar.dispose();
        }
        com.badlogic.gdx.graphics.c cVar = this.f160958f;
        if (cVar != null) {
            cVar.dispose();
            this.f160958f = null;
        }
        synchronized (this.f160955c) {
            this.f160956d.clear();
            this.f160954b.clear();
        }
        i();
    }

    @Override // ec.f
    public void d() {
        this.f160954b.values().removeAll(Collections.singleton(this.f160962j));
        i();
    }

    @Override // ec.f
    public com.planner5d.library.engine.rendering.util.h e(final com.planner5d.library.engine.a aVar, final Pair<String, Integer> pair) {
        return new com.planner5d.library.engine.rendering.util.h() { // from class: com.planner5d.library.engine.libgdx.rendering.model.managing.e
            @Override // com.planner5d.library.engine.rendering.util.h
            public final Object a(String str) {
                return this.f160947a.t(aVar, pair, str);
            }
        };
    }

    @Override // ec.f
    public bc.a f() {
        return this.f160958f;
    }

    @Override // ec.f
    @androidx.annotation.d
    public void g() {
        this.f160959g = new com.badlogic.gdx.graphics.i[]{v("px"), v("nx"), v("py"), v("ny"), v("pz"), v("nz")};
    }

    @Override // ec.f
    public List<String> h() {
        return r(this.f160954b, this.f160962j);
    }

    @Override // ec.f
    @androidx.annotation.d
    public void i() {
        synchronized (this.f160955c) {
            try {
                Iterator<com.planner5d.library.services.bitmaploader.target.a> it = this.f160953a.values().iterator();
                while (it.hasNext()) {
                    it.next().dispose();
                }
                this.f160953a.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ec.f
    public com.planner5d.library.engine.rendering.util.h j(final com.planner5d.library.engine.a aVar, final String str) {
        return new com.planner5d.library.engine.rendering.util.h() { // from class: com.planner5d.library.engine.libgdx.rendering.model.managing.f
            @Override // com.planner5d.library.engine.rendering.util.h
            public final Object a(String str2) {
                return this.f160950a.u(aVar, str, str2);
            }
        };
    }

    @Override // ec.f
    public void k(@p0 String str) {
        w(s(str));
    }

    com.badlogic.gdx.graphics.k o(com.planner5d.library.engine.a aVar, Pair<String, Integer> pair) {
        if (pair == null) {
            return null;
        }
        return q(aVar, (String) pair.first, ((Integer) pair.second).intValue());
    }

    com.badlogic.gdx.graphics.k p(com.planner5d.library.engine.a aVar, String str) {
        return o(aVar, s(str));
    }

    com.badlogic.gdx.graphics.k q(com.planner5d.library.engine.a aVar, String str, @androidx.annotation.l int i10) {
        boolean zContainsKey;
        com.planner5d.library.services.bitmaploader.target.a aVarRemove;
        Bitmap bitmapC = null;
        if (str == null) {
            return null;
        }
        if (!this.f160954b.containsKey(str)) {
            synchronized (this.f160955c) {
                try {
                    zContainsKey = this.f160953a.containsKey(str);
                    aVarRemove = zContainsKey ? this.f160953a.remove(str) : null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!zContainsKey) {
                if (n()) {
                    return null;
                }
                return h.b(aVar, i10);
            }
            if (aVarRemove != null && aVarRemove.c() == this.f160957e.c()) {
                if (this.f160962j == null) {
                    this.f160962j = h.a(aVar, this.f160957e.c());
                }
                this.f160954b.put(str, this.f160962j);
                return this.f160962j;
            }
            if (aVarRemove != null) {
                bitmapC = aVarRemove.c();
            }
            com.badlogic.gdx.graphics.k kVarB = bitmapC == null ? h.b(aVar, i10) : h.a(aVar, bitmapC);
            this.f160954b.put(str, kVarB);
            synchronized (this.f160955c) {
                this.f160956d.add(kVarB);
            }
            if (aVarRemove != null) {
                aVarRemove.dispose();
            }
        }
        return this.f160954b.get(str);
    }
}
