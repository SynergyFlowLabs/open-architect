package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.view.u1;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t0 {
    static final int A = 7;
    static final int B = 8;
    static final int C = 9;
    static final int D = 10;
    public static final int E = 4096;
    public static final int F = 8192;
    public static final int G = -1;
    public static final int H = 0;
    public static final int I = 4097;
    public static final int J = 8194;
    public static final int K = 4099;
    public static final int L = 4100;
    public static final int M = 8197;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final int f51980t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final int f51981u = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final int f51982v = 2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final int f51983w = 3;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final int f51984x = 4;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static final int f51985y = 5;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final int f51986z = 6;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f51987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ClassLoader f51988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ArrayList<a> f51989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f51990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f51991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f51992f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f51993g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f51994h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f51995i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f51996j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.p0
    String f51997k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f51998l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    CharSequence f51999m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f52000n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    CharSequence f52001o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ArrayList<String> f52002p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ArrayList<String> f52003q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean f52004r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    ArrayList<Runnable> f52005s;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f52006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Fragment f52007b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f52008c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f52009d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f52010e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f52011f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f52012g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        androidx.lifecycle.c0.b f52013h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        androidx.lifecycle.c0.b f52014i;

        a() {
        }

        a(int i10, Fragment fragment) {
            this.f52006a = i10;
            this.f52007b = fragment;
            this.f52008c = false;
            androidx.lifecycle.c0.b bVar = androidx.lifecycle.c0.b.RESUMED;
            this.f52013h = bVar;
            this.f52014i = bVar;
        }

        a(int i10, Fragment fragment, boolean z10) {
            this.f52006a = i10;
            this.f52007b = fragment;
            this.f52008c = z10;
            androidx.lifecycle.c0.b bVar = androidx.lifecycle.c0.b.RESUMED;
            this.f52013h = bVar;
            this.f52014i = bVar;
        }

        a(int i10, @NonNull Fragment fragment, androidx.lifecycle.c0.b bVar) {
            this.f52006a = i10;
            this.f52007b = fragment;
            this.f52008c = false;
            this.f52013h = fragment.mMaxState;
            this.f52014i = bVar;
        }

        a(a aVar) {
            this.f52006a = aVar.f52006a;
            this.f52007b = aVar.f52007b;
            this.f52008c = aVar.f52008c;
            this.f52009d = aVar.f52009d;
            this.f52010e = aVar.f52010e;
            this.f52011f = aVar.f52011f;
            this.f52012g = aVar.f52012g;
            this.f52013h = aVar.f52013h;
            this.f52014i = aVar.f52014i;
        }
    }

    @Deprecated
    public t0() {
        this.f51989c = new ArrayList<>();
        this.f51996j = true;
        this.f52004r = false;
        this.f51987a = null;
        this.f51988b = null;
    }

    @NonNull
    private Fragment q(@NonNull Class<? extends Fragment> cls, @androidx.annotation.p0 Bundle bundle) {
        w wVar = this.f51987a;
        if (wVar == null) {
            throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
        }
        ClassLoader classLoader = this.f51988b;
        if (classLoader == null) {
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        Fragment fragmentA = wVar.a(classLoader, cls.getName());
        if (bundle != null) {
            fragmentA.setArguments(bundle);
        }
        return fragmentA;
    }

    @NonNull
    public final t0 A(@androidx.annotation.d0 int i10, @NonNull Class<? extends Fragment> cls, @androidx.annotation.p0 Bundle bundle) {
        return B(i10, cls, bundle, null);
    }

    @NonNull
    public final t0 B(@androidx.annotation.d0 int i10, @NonNull Class<? extends Fragment> cls, @androidx.annotation.p0 Bundle bundle, @androidx.annotation.p0 String str) {
        return z(i10, q(cls, bundle), str);
    }

    @NonNull
    public t0 C(@NonNull Runnable runnable) {
        return D(false, runnable);
    }

    @NonNull
    t0 D(boolean z10, @NonNull Runnable runnable) {
        if (!z10) {
            s();
        }
        if (this.f52005s == null) {
            this.f52005s = new ArrayList<>();
        }
        this.f52005s.add(runnable);
        return this;
    }

    @NonNull
    @Deprecated
    public t0 E(boolean z10) {
        return N(z10);
    }

    @NonNull
    @Deprecated
    public t0 F(@androidx.annotation.f1 int i10) {
        this.f52000n = i10;
        this.f52001o = null;
        return this;
    }

    @NonNull
    @Deprecated
    public t0 G(@androidx.annotation.p0 CharSequence charSequence) {
        this.f52000n = 0;
        this.f52001o = charSequence;
        return this;
    }

    @NonNull
    @Deprecated
    public t0 H(@androidx.annotation.f1 int i10) {
        this.f51998l = i10;
        this.f51999m = null;
        return this;
    }

    @NonNull
    @Deprecated
    public t0 I(@androidx.annotation.p0 CharSequence charSequence) {
        this.f51998l = 0;
        this.f51999m = charSequence;
        return this;
    }

    @NonNull
    public t0 J(@androidx.annotation.a @androidx.annotation.b int i10, @androidx.annotation.a @androidx.annotation.b int i11) {
        return K(i10, i11, 0, 0);
    }

    @NonNull
    public t0 K(@androidx.annotation.a @androidx.annotation.b int i10, @androidx.annotation.a @androidx.annotation.b int i11, @androidx.annotation.a @androidx.annotation.b int i12, @androidx.annotation.a @androidx.annotation.b int i13) {
        this.f51990d = i10;
        this.f51991e = i11;
        this.f51992f = i12;
        this.f51993g = i13;
        return this;
    }

    @NonNull
    public t0 L(@NonNull Fragment fragment, @NonNull androidx.lifecycle.c0.b bVar) {
        i(new a(10, fragment, bVar));
        return this;
    }

    @NonNull
    public t0 M(@androidx.annotation.p0 Fragment fragment) {
        i(new a(8, fragment));
        return this;
    }

    @NonNull
    public t0 N(boolean z10) {
        this.f52004r = z10;
        return this;
    }

    @NonNull
    public t0 O(int i10) {
        this.f51994h = i10;
        return this;
    }

    @NonNull
    @Deprecated
    public t0 P(@androidx.annotation.g1 int i10) {
        return this;
    }

    @NonNull
    public t0 Q(@NonNull Fragment fragment) {
        i(new a(5, fragment));
        return this;
    }

    @NonNull
    public t0 b(@androidx.annotation.d0 int i10, @NonNull Fragment fragment) {
        t(i10, fragment, null, 1);
        return this;
    }

    @NonNull
    public t0 c(@androidx.annotation.d0 int i10, @NonNull Fragment fragment, @androidx.annotation.p0 String str) {
        t(i10, fragment, str, 1);
        return this;
    }

    @NonNull
    public final t0 d(@androidx.annotation.d0 int i10, @NonNull Class<? extends Fragment> cls, @androidx.annotation.p0 Bundle bundle) {
        return b(i10, q(cls, bundle));
    }

    @NonNull
    public final t0 e(@androidx.annotation.d0 int i10, @NonNull Class<? extends Fragment> cls, @androidx.annotation.p0 Bundle bundle, @androidx.annotation.p0 String str) {
        return c(i10, q(cls, bundle), str);
    }

    @NonNull
    public final t0 f(@NonNull ViewGroup viewGroup, @NonNull Fragment fragment, @androidx.annotation.p0 String str) {
        fragment.mContainer = viewGroup;
        fragment.mInDynamicContainer = true;
        return c(viewGroup.getId(), fragment, str);
    }

    @NonNull
    public t0 g(@NonNull Fragment fragment, @androidx.annotation.p0 String str) {
        t(0, fragment, str, 1);
        return this;
    }

    @NonNull
    public final t0 h(@NonNull Class<? extends Fragment> cls, @androidx.annotation.p0 Bundle bundle, @androidx.annotation.p0 String str) {
        return g(q(cls, bundle), str);
    }

    void i(a aVar) {
        this.f51989c.add(aVar);
        aVar.f52009d = this.f51990d;
        aVar.f52010e = this.f51991e;
        aVar.f52011f = this.f51992f;
        aVar.f52012g = this.f51993g;
    }

    @NonNull
    public t0 j(@NonNull View view, @NonNull String str) {
        if (!v0.f()) {
            return this;
        }
        String strA0 = u1.A0(view);
        if (strA0 == null) {
            throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
        }
        if (this.f52002p == null) {
            this.f52002p = new ArrayList<>();
            this.f52003q = new ArrayList<>();
        } else {
            if (this.f52003q.contains(str)) {
                throw new IllegalArgumentException("A shared element with the target name '" + str + "' has already been added to the transaction.");
            }
            if (this.f52002p.contains(strA0)) {
                throw new IllegalArgumentException("A shared element with the source name '" + strA0 + "' has already been added to the transaction.");
            }
        }
        this.f52002p.add(strA0);
        this.f52003q.add(str);
        return this;
    }

    @NonNull
    public t0 k(@androidx.annotation.p0 String str) {
        if (!this.f51996j) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f51995i = true;
        this.f51997k = str;
        return this;
    }

    @NonNull
    public t0 l(@NonNull Fragment fragment) {
        i(new a(7, fragment));
        return this;
    }

    public abstract int m();

    public abstract int n();

    @androidx.annotation.l0
    public abstract void o();

    @androidx.annotation.l0
    public abstract void p();

    @NonNull
    public t0 r(@NonNull Fragment fragment) {
        i(new a(6, fragment));
        return this;
    }

    @NonNull
    public t0 s() {
        if (this.f51995i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f51996j = false;
        return this;
    }

    void t(int i10, Fragment fragment, @androidx.annotation.p0 String str, int i11) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            d2.d.i(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
            fragment.mTag = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i12 = fragment.mFragmentId;
            if (i12 != 0 && i12 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i10);
            }
            fragment.mFragmentId = i10;
            fragment.mContainerId = i10;
        }
        i(new a(i11, fragment));
    }

    @NonNull
    public t0 u(@NonNull Fragment fragment) {
        i(new a(4, fragment));
        return this;
    }

    public boolean v() {
        return this.f51996j;
    }

    public boolean w() {
        return this.f51989c.isEmpty();
    }

    @NonNull
    public t0 x(@NonNull Fragment fragment) {
        i(new a(3, fragment));
        return this;
    }

    @NonNull
    public t0 y(@androidx.annotation.d0 int i10, @NonNull Fragment fragment) {
        return z(i10, fragment, null);
    }

    @NonNull
    public t0 z(@androidx.annotation.d0 int i10, @NonNull Fragment fragment, @androidx.annotation.p0 String str) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        t(i10, fragment, str, 2);
        return this;
    }

    t0(@NonNull w wVar, @androidx.annotation.p0 ClassLoader classLoader) {
        this.f51989c = new ArrayList<>();
        this.f51996j = true;
        this.f52004r = false;
        this.f51987a = wVar;
        this.f51988b = classLoader;
    }

    t0(@NonNull w wVar, @androidx.annotation.p0 ClassLoader classLoader, @NonNull t0 t0Var) {
        this(wVar, classLoader);
        Iterator<a> it = t0Var.f51989c.iterator();
        while (it.hasNext()) {
            this.f51989c.add(new a(it.next()));
        }
        this.f51990d = t0Var.f51990d;
        this.f51991e = t0Var.f51991e;
        this.f51992f = t0Var.f51992f;
        this.f51993g = t0Var.f51993g;
        this.f51994h = t0Var.f51994h;
        this.f51995i = t0Var.f51995i;
        this.f51996j = t0Var.f51996j;
        this.f51997k = t0Var.f51997k;
        this.f52000n = t0Var.f52000n;
        this.f52001o = t0Var.f52001o;
        this.f51998l = t0Var.f51998l;
        this.f51999m = t0Var.f51999m;
        if (t0Var.f52002p != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            this.f52002p = arrayList;
            arrayList.addAll(t0Var.f52002p);
        }
        if (t0Var.f52003q != null) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            this.f52003q = arrayList2;
            arrayList2.addAll(t0Var.f52003q);
        }
        this.f52004r = t0Var.f52004r;
    }
}
