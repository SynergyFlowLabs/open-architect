package androidx.databinding;

import android.view.View;
import androidx.annotation.b1;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
public class MergedDataBinderMapper extends k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f49241d = "MergedDataBinderMapper";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Set<Class<? extends k>> f49242a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<k> f49243b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f49244c = new CopyOnWriteArrayList();

    private boolean h() {
        boolean z10 = false;
        for (String str : this.f49244c) {
            try {
                Class<?> cls = Class.forName(str);
                if (k.class.isAssignableFrom(cls)) {
                    f((k) cls.newInstance());
                    this.f49244c.remove(str);
                    z10 = true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
            }
        }
        return z10;
    }

    @Override // androidx.databinding.k
    public String b(int i10) {
        Iterator<k> it = this.f49243b.iterator();
        while (it.hasNext()) {
            String strB = it.next().b(i10);
            if (strB != null) {
                return strB;
            }
        }
        if (h()) {
            return b(i10);
        }
        return null;
    }

    @Override // androidx.databinding.k
    public e0 c(l lVar, View view, int i10) {
        Iterator<k> it = this.f49243b.iterator();
        while (it.hasNext()) {
            e0 e0VarC = it.next().c(lVar, view, i10);
            if (e0VarC != null) {
                return e0VarC;
            }
        }
        if (h()) {
            return c(lVar, view, i10);
        }
        return null;
    }

    @Override // androidx.databinding.k
    public e0 d(l lVar, View[] viewArr, int i10) {
        Iterator<k> it = this.f49243b.iterator();
        while (it.hasNext()) {
            e0 e0VarD = it.next().d(lVar, viewArr, i10);
            if (e0VarD != null) {
                return e0VarD;
            }
        }
        if (h()) {
            return d(lVar, viewArr, i10);
        }
        return null;
    }

    @Override // androidx.databinding.k
    public int e(String str) {
        Iterator<k> it = this.f49243b.iterator();
        while (it.hasNext()) {
            int iE = it.next().e(str);
            if (iE != 0) {
                return iE;
            }
        }
        if (h()) {
            return e(str);
        }
        return 0;
    }

    public void f(k kVar) {
        if (this.f49242a.add((Class<? extends k>) kVar.getClass())) {
            this.f49243b.add(kVar);
            Iterator<k> it = kVar.a().iterator();
            while (it.hasNext()) {
                f(it.next());
            }
        }
    }

    protected void g(String str) {
        this.f49244c.add(str + ".DataBinderMapperImpl");
    }
}
