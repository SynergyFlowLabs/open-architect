package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.k1;
import com.google.android.material.internal.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@k1
@b1({b1.a.LIBRARY_GROUP})
public class a<T extends o<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Integer, T> f112739a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<Integer> f112740b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f112741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f112742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f112743e;

    /* JADX INFO: renamed from: com.google.android.material.internal.a$a, reason: collision with other inner class name */
    class C0987a implements o.a<T> {
        C0987a() {
        }

        /* JADX WARN: Code duplicated, block: B:8:0x001a  */
        @Override // com.google.android.material.internal.o.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(T t10, boolean z10) {
            if (!z10) {
                a aVar = a.this;
                if (aVar.t(t10, aVar.f112743e)) {
                    a.this.n();
                }
            } else if (a.this.g(t10)) {
                a.this.n();
            }
        }
    }

    public interface b {
        void a(@NonNull Set<Integer> set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(@NonNull o<T> oVar) {
        int id2 = oVar.getId();
        if (this.f112740b.contains(Integer.valueOf(id2))) {
            return false;
        }
        T t10 = this.f112739a.get(Integer.valueOf(k()));
        if (t10 != null) {
            t(t10, false);
        }
        boolean zAdd = this.f112740b.add(Integer.valueOf(id2));
        if (!oVar.isChecked()) {
            oVar.setChecked(true);
        }
        return zAdd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        b bVar = this.f112741c;
        if (bVar != null) {
            bVar.a(i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean t(@NonNull o<T> oVar, boolean z10) {
        int id2 = oVar.getId();
        if (!this.f112740b.contains(Integer.valueOf(id2))) {
            return false;
        }
        if (z10 && this.f112740b.size() == 1 && this.f112740b.contains(Integer.valueOf(id2))) {
            oVar.setChecked(true);
            return false;
        }
        boolean zRemove = this.f112740b.remove(Integer.valueOf(id2));
        if (oVar.isChecked()) {
            oVar.setChecked(false);
        }
        return zRemove;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void e(T t10) {
        this.f112739a.put(Integer.valueOf(t10.getId()), t10);
        if (t10.isChecked()) {
            g(t10);
        }
        t10.setInternalOnCheckedChangeListener(new C0987a());
    }

    public void f(@androidx.annotation.d0 int i10) {
        T t10 = this.f112739a.get(Integer.valueOf(i10));
        if (t10 != null && g(t10)) {
            n();
        }
    }

    public void h() {
        boolean zIsEmpty = this.f112740b.isEmpty();
        Iterator<T> it = this.f112739a.values().iterator();
        while (it.hasNext()) {
            t(it.next(), false);
        }
        if (zIsEmpty) {
            return;
        }
        n();
    }

    @NonNull
    public Set<Integer> i() {
        return new HashSet(this.f112740b);
    }

    @NonNull
    public List<Integer> j(@NonNull ViewGroup viewGroup) {
        Set<Integer> setI = i();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof o) && setI.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    @androidx.annotation.d0
    public int k() {
        if (!this.f112742d || this.f112740b.isEmpty()) {
            return -1;
        }
        return this.f112740b.iterator().next().intValue();
    }

    public boolean l() {
        return this.f112743e;
    }

    public boolean m() {
        return this.f112742d;
    }

    public void o(T t10) {
        t10.setInternalOnCheckedChangeListener(null);
        this.f112739a.remove(Integer.valueOf(t10.getId()));
        this.f112740b.remove(Integer.valueOf(t10.getId()));
    }

    public void p(@androidx.annotation.p0 b bVar) {
        this.f112741c = bVar;
    }

    public void q(boolean z10) {
        this.f112743e = z10;
    }

    public void r(boolean z10) {
        if (this.f112742d != z10) {
            this.f112742d = z10;
            h();
        }
    }

    public void s(@androidx.annotation.d0 int i10) {
        T t10 = this.f112739a.get(Integer.valueOf(i10));
        if (t10 != null && t(t10, this.f112743e)) {
            n();
        }
    }
}
