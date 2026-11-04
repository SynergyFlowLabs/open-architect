package androidx.fragment.app;

import androidx.annotation.NonNull;
import androidx.lifecycle.f2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class l0 extends f2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f51900h = "FragmentManager";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final j2.c f51901i = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f51905d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<String, Fragment> f51902a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<String, l0> f51903b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, l2> f51904c = new HashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f51906e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f51907f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f51908g = false;

    class a implements j2.c {
        a() {
        }

        @Override // androidx.lifecycle.j2.c
        @NonNull
        public <T extends f2> T create(@NonNull Class<T> cls) {
            return new l0(true);
        }
    }

    l0(boolean z10) {
        this.f51905d = z10;
    }

    private void X(@NonNull String str, boolean z10) {
        l0 l0Var = this.f51903b.get(str);
        if (l0Var != null) {
            if (z10) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(l0Var.f51903b.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    boolean z11 = true | true;
                    l0Var.W((String) it.next(), true);
                }
            }
            l0Var.onCleared();
            this.f51903b.remove(str);
        }
        l2 l2Var = this.f51904c.get(str);
        if (l2Var != null) {
            l2Var.a();
            this.f51904c.remove(str);
        }
    }

    @NonNull
    static l0 a0(l2 l2Var) {
        return (l0) new j2(l2Var, f51901i).c(l0.class);
    }

    void U(@NonNull Fragment fragment) {
        if (this.f51908g) {
            FragmentManager.b1(2);
        } else {
            if (this.f51902a.containsKey(fragment.mWho)) {
                return;
            }
            this.f51902a.put(fragment.mWho, fragment);
            if (FragmentManager.b1(2)) {
                fragment.toString();
            }
        }
    }

    void V(@NonNull Fragment fragment, boolean z10) {
        if (FragmentManager.b1(3)) {
            Objects.toString(fragment);
        }
        X(fragment.mWho, z10);
    }

    void W(@NonNull String str, boolean z10) {
        FragmentManager.b1(3);
        X(str, z10);
    }

    @androidx.annotation.p0
    Fragment Y(String str) {
        return this.f51902a.get(str);
    }

    @NonNull
    l0 Z(@NonNull Fragment fragment) {
        l0 l0Var = this.f51903b.get(fragment.mWho);
        if (l0Var != null) {
            return l0Var;
        }
        l0 l0Var2 = new l0(this.f51905d);
        this.f51903b.put(fragment.mWho, l0Var2);
        return l0Var2;
    }

    @NonNull
    Collection<Fragment> b0() {
        return new ArrayList(this.f51902a.values());
    }

    @androidx.annotation.p0
    @Deprecated
    k0 c0() {
        if (this.f51902a.isEmpty() && this.f51903b.isEmpty() && this.f51904c.isEmpty()) {
            return null;
        }
        HashMap map = new HashMap();
        for (Map.Entry<String, l0> entry : this.f51903b.entrySet()) {
            k0 k0VarC0 = entry.getValue().c0();
            if (k0VarC0 != null) {
                map.put(entry.getKey(), k0VarC0);
            }
        }
        this.f51907f = true;
        if (this.f51902a.isEmpty() && map.isEmpty() && this.f51904c.isEmpty()) {
            return null;
        }
        return new k0(new ArrayList(this.f51902a.values()), map, new HashMap(this.f51904c));
    }

    @NonNull
    l2 d0(@NonNull Fragment fragment) {
        l2 l2Var = this.f51904c.get(fragment.mWho);
        if (l2Var != null) {
            return l2Var;
        }
        l2 l2Var2 = new l2();
        this.f51904c.put(fragment.mWho, l2Var2);
        return l2Var2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l0.class == obj.getClass()) {
            l0 l0Var = (l0) obj;
            if (this.f51902a.equals(l0Var.f51902a) && this.f51903b.equals(l0Var.f51903b) && this.f51904c.equals(l0Var.f51904c)) {
                return true;
            }
        }
        return false;
    }

    boolean f0() {
        return this.f51906e;
    }

    void g0(@NonNull Fragment fragment) {
        if (this.f51908g) {
            FragmentManager.b1(2);
        } else {
            if (this.f51902a.remove(fragment.mWho) == null || !FragmentManager.b1(2)) {
                return;
            }
            fragment.toString();
        }
    }

    @Deprecated
    void h0(@androidx.annotation.p0 k0 k0Var) {
        this.f51902a.clear();
        this.f51903b.clear();
        this.f51904c.clear();
        if (k0Var != null) {
            Collection<Fragment> collectionB = k0Var.b();
            if (collectionB != null) {
                for (Fragment fragment : collectionB) {
                    if (fragment != null) {
                        this.f51902a.put(fragment.mWho, fragment);
                    }
                }
            }
            Map<String, k0> mapA = k0Var.a();
            if (mapA != null) {
                for (Map.Entry<String, k0> entry : mapA.entrySet()) {
                    l0 l0Var = new l0(this.f51905d);
                    l0Var.h0(entry.getValue());
                    this.f51903b.put(entry.getKey(), l0Var);
                }
            }
            Map<String, l2> mapC = k0Var.c();
            if (mapC != null) {
                this.f51904c.putAll(mapC);
            }
        }
        this.f51907f = false;
    }

    public int hashCode() {
        return (((this.f51902a.hashCode() * 31) + this.f51903b.hashCode()) * 31) + this.f51904c.hashCode();
    }

    void i0(boolean z10) {
        this.f51908g = z10;
    }

    boolean j0(@NonNull Fragment fragment) {
        if (this.f51902a.containsKey(fragment.mWho)) {
            return this.f51905d ? this.f51906e : !this.f51907f;
        }
        return true;
    }

    @Override // androidx.lifecycle.f2
    protected void onCleared() {
        if (FragmentManager.b1(3)) {
            toString();
        }
        this.f51906e = true;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<Fragment> it = this.f51902a.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it2 = this.f51903b.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it3 = this.f51904c.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
