package com.planner5d.library.engine.libgdx.rendering.model.managing;

import android.app.Application;
import androidx.annotation.m1;
import com.badlogic.gdx.graphics.g3d.utils.n;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.utility.c2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class b implements ec.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, cc.a> f160934a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<cc.a> f160935b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, a> f160936c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final cc.b f160937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f160938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ec.f f160939f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Application f160940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c2 f160941h;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u4.b f160942a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f160943b;

        private a(u4.b bVar, int[] iArr) {
            this.f160942a = bVar;
            this.f160943b = iArr;
        }
    }

    public b(Application application, d dVar, ec.f fVar, c2 c2Var, cc.b bVar) {
        this.f160940g = application;
        this.f160938e = dVar;
        this.f160939f = fVar;
        this.f160941h = c2Var;
        this.f160937d = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ com.badlogic.gdx.graphics.k f(com.planner5d.library.engine.a aVar, String str) {
        com.planner5d.library.engine.rendering.util.h hVarJ = this.f160939f.j(aVar, str);
        if (hVarJ != null) {
            return (com.badlogic.gdx.graphics.k) hVarJ.a(str);
        }
        return null;
    }

    @Override // ec.d
    @m1
    public void a(String str, int[] iArr) throws Throwable {
        u4.b bVarA;
        com.badlogic.gdx.utils.b<u4.j> bVar;
        if (this.f160936c.containsKey(str) || this.f160934a.containsKey(str) || (bVarA = this.f160938e.a(str)) == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            com.badlogic.gdx.utils.b<u4.c> bVar2 = bVarA.f381124d;
            if (i10 >= bVar2.f95174b) {
                this.f160936c.put(str, new a(bVarA, iArr));
                return;
            }
            u4.c cVar = bVar2.get(i10);
            if (cVar != null && (bVar = cVar.f381136j) != null) {
                Iterator<u4.j> it = bVar.iterator();
                while (it.hasNext()) {
                    this.f160939f.k(it.next().f381177b);
                }
            }
            i10++;
        }
    }

    @Override // ec.d
    public cc.a b(cc.a aVar) {
        if (aVar != null && !this.f160935b.contains(aVar) && !this.f160934a.containsValue(aVar)) {
            this.f160935b.add(aVar);
        }
        return aVar;
    }

    @Override // ec.d
    public cc.a c(final com.planner5d.library.engine.a aVar, String str) throws Throwable {
        if (!this.f160934a.containsKey(str)) {
            a aVarRemove = this.f160936c.remove(str);
            if (aVarRemove == null) {
                int i10 = zb.b.q.K8;
                StringBuilder sb2 = new StringBuilder();
                Application application = this.f160940g;
                sb2.append(application.getString(this.f160941h.d(application) ? zb.b.q.f407619p8 : zb.b.q.f407595o8));
                sb2.append(" #L");
                sb2.append(this.f160938e.b(str));
                throw new ErrorMessageException(i10, str, sb2.toString());
            }
            this.f160934a.put(str, this.f160937d.a(new com.badlogic.gdx.graphics.g3d.e(aVar, aVarRemove.f160942a, new n() { // from class: com.planner5d.library.engine.libgdx.rendering.model.managing.a
                @Override // com.badlogic.gdx.graphics.g3d.utils.n
                public final com.badlogic.gdx.graphics.k c(String str2) {
                    return this.f160932a.f(aVar, str2);
                }
            }), gc.d.a(aVarRemove.f160943b, new com.planner5d.library.engine.util.math.b()), null));
        }
        cc.a aVar2 = this.f160934a.get(str);
        Objects.requireNonNull(aVar2);
        return aVar2;
    }

    @Override // ec.d
    public void clear() {
        ArrayList arrayList = new ArrayList(this.f160934a.values());
        this.f160934a.clear();
        arrayList.addAll(this.f160935b);
        this.f160935b.clear();
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((cc.a) it.next()).dispose();
            }
            this.f160936c.clear();
        } catch (Throwable th2) {
            throw new RuntimeException(th2);
        }
    }

    @Override // ec.d
    public void d(cc.a aVar) {
        if (aVar == null || !this.f160935b.contains(aVar) || this.f160934a.containsValue(aVar)) {
            return;
        }
        this.f160935b.remove(aVar);
    }
}
