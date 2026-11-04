package androidx.fragment.app;

import androidx.annotation.NonNull;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class a extends t0 implements FragmentManager.k, FragmentManager.q {
    private static final String R = "FragmentManager";
    final FragmentManager N;
    boolean O;
    int P;
    boolean Q;

    a(@NonNull FragmentManager fragmentManager) {
        super(fragmentManager.L0(), fragmentManager.O0() != null ? fragmentManager.O0().f().getClassLoader() : null);
        this.P = -1;
        this.Q = false;
        this.N = fragmentManager;
    }

    @Override // androidx.fragment.app.t0
    @NonNull
    public t0 L(@NonNull Fragment fragment, @NonNull androidx.lifecycle.c0.b bVar) {
        if (fragment.mFragmentManager != this.N) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.N);
        }
        if (bVar == androidx.lifecycle.c0.b.INITIALIZED && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + " after the Fragment has been created");
        }
        if (bVar != androidx.lifecycle.c0.b.DESTROYED) {
            return super.L(fragment, bVar);
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    @Override // androidx.fragment.app.t0
    @NonNull
    public t0 M(@androidx.annotation.p0 Fragment fragment) {
        FragmentManager fragmentManager;
        if (fragment != null && (fragmentManager = fragment.mFragmentManager) != null && fragmentManager != this.N) {
            throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.M(fragment);
    }

    @Override // androidx.fragment.app.t0
    @NonNull
    public t0 Q(@NonNull Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.N) {
            return super.Q(fragment);
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    void R(int i10) {
        if (this.f51995i) {
            if (FragmentManager.b1(2)) {
                toString();
            }
            int size = this.f51989c.size();
            for (int i11 = 0; i11 < size; i11++) {
                t0.a aVar = this.f51989c.get(i11);
                Fragment fragment = aVar.f52007b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i10;
                    if (FragmentManager.b1(2)) {
                        Objects.toString(aVar.f52007b);
                        int i12 = aVar.f52007b.mBackStackNesting;
                    }
                }
            }
        }
    }

    void S() {
        int size = this.f51989c.size() - 1;
        while (size >= 0) {
            t0.a aVar = this.f51989c.get(size);
            if (aVar.f52008c) {
                if (aVar.f52006a == 8) {
                    aVar.f52008c = false;
                    this.f51989c.remove(size - 1);
                    size--;
                } else {
                    int i10 = aVar.f52007b.mContainerId;
                    aVar.f52006a = 2;
                    aVar.f52008c = false;
                    for (int i11 = size - 1; i11 >= 0; i11--) {
                        t0.a aVar2 = this.f51989c.get(i11);
                        if (aVar2.f52008c && aVar2.f52007b.mContainerId == i10) {
                            this.f51989c.remove(i11);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    int T(boolean z10, boolean z11) {
        if (this.O) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.b1(2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new b1("FragmentManager"));
            U("  ", printWriter);
            printWriter.close();
        }
        this.O = true;
        if (this.f51995i) {
            this.P = this.N.t();
        } else {
            this.P = -1;
        }
        if (z11) {
            this.N.l0(this, z10);
        }
        return this.P;
    }

    public void U(String str, PrintWriter printWriter) {
        V(str, printWriter, true);
    }

    public void V(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f51997k);
            printWriter.print(" mIndex=");
            printWriter.print(this.P);
            printWriter.print(" mCommitted=");
            printWriter.println(this.O);
            if (this.f51994h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f51994h));
            }
            if (this.f51990d != 0 || this.f51991e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f51990d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f51991e));
            }
            if (this.f51992f != 0 || this.f51993g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f51992f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f51993g));
            }
            if (this.f51998l != 0 || this.f51999m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f51998l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f51999m);
            }
            if (this.f52000n != 0 || this.f52001o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f52000n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f52001o);
            }
        }
        if (!this.f51989c.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f51989c.size();
            for (int i10 = 0; i10 < size; i10++) {
                t0.a aVar = this.f51989c.get(i10);
                switch (aVar.f52006a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f52006a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f52007b);
                if (z10) {
                    if (aVar.f52009d != 0 || aVar.f52010e != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f52009d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f52010e));
                    }
                    if (aVar.f52011f != 0 || aVar.f52012g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f52011f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f52012g));
                    }
                }
            }
        }
    }

    void W() {
        int size = this.f51989c.size();
        for (int i10 = 0; i10 < size; i10++) {
            t0.a aVar = this.f51989c.get(i10);
            Fragment fragment = aVar.f52007b;
            if (fragment != null) {
                fragment.mBeingSaved = this.Q;
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f51994h);
                fragment.setSharedElementNames(this.f52002p, this.f52003q);
            }
            switch (aVar.f52006a) {
                case 1:
                    fragment.setAnimations(aVar.f52009d, aVar.f52010e, aVar.f52011f, aVar.f52012g);
                    this.N.X1(fragment, false);
                    this.N.p(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f52006a);
                case 3:
                    fragment.setAnimations(aVar.f52009d, aVar.f52010e, aVar.f52011f, aVar.f52012g);
                    this.N.E1(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f52009d, aVar.f52010e, aVar.f52011f, aVar.f52012g);
                    this.N.Y0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f52009d, aVar.f52010e, aVar.f52011f, aVar.f52012g);
                    this.N.X1(fragment, false);
                    this.N.e2(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f52009d, aVar.f52010e, aVar.f52011f, aVar.f52012g);
                    this.N.H(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f52009d, aVar.f52010e, aVar.f52011f, aVar.f52012g);
                    this.N.X1(fragment, false);
                    this.N.v(fragment);
                    break;
                case 8:
                    this.N.a2(fragment);
                    break;
                case 9:
                    this.N.a2(null);
                    break;
                case 10:
                    this.N.Z1(fragment, aVar.f52014i);
                    break;
            }
        }
    }

    void X() {
        for (int size = this.f51989c.size() - 1; size >= 0; size--) {
            t0.a aVar = this.f51989c.get(size);
            Fragment fragment = aVar.f52007b;
            if (fragment != null) {
                fragment.mBeingSaved = this.Q;
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.Q1(this.f51994h));
                fragment.setSharedElementNames(this.f52003q, this.f52002p);
            }
            switch (aVar.f52006a) {
                case 1:
                    fragment.setAnimations(aVar.f52009d, aVar.f52010e, aVar.f52011f, aVar.f52012g);
                    this.N.X1(fragment, true);
                    this.N.E1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f52006a);
                case 3:
                    fragment.setAnimations(aVar.f52009d, aVar.f52010e, aVar.f52011f, aVar.f52012g);
                    this.N.p(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f52009d, aVar.f52010e, aVar.f52011f, aVar.f52012g);
                    this.N.e2(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f52009d, aVar.f52010e, aVar.f52011f, aVar.f52012g);
                    this.N.X1(fragment, true);
                    this.N.Y0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f52009d, aVar.f52010e, aVar.f52011f, aVar.f52012g);
                    this.N.v(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f52009d, aVar.f52010e, aVar.f52011f, aVar.f52012g);
                    this.N.X1(fragment, true);
                    this.N.H(fragment);
                    break;
                case 8:
                    this.N.a2(null);
                    break;
                case 9:
                    this.N.a2(fragment);
                    break;
                case 10:
                    this.N.Z1(fragment, aVar.f52013h);
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b7  */
    Fragment Y(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i10 = 0;
        while (i10 < this.f51989c.size()) {
            t0.a aVar = this.f51989c.get(i10);
            int i11 = aVar.f52006a;
            if (i11 == 1) {
                arrayList.add(aVar.f52007b);
            } else if (i11 == 2) {
                Fragment fragment3 = aVar.f52007b;
                int i12 = fragment3.mContainerId;
                boolean z10 = false;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    Fragment fragment4 = arrayList.get(size);
                    if (fragment4.mContainerId == i12) {
                        if (fragment4 == fragment3) {
                            z10 = true;
                        } else {
                            if (fragment4 == fragment2) {
                                this.f51989c.add(i10, new t0.a(9, fragment4, true));
                                i10++;
                                fragment2 = null;
                            }
                            t0.a aVar2 = new t0.a(3, fragment4, true);
                            aVar2.f52009d = aVar.f52009d;
                            aVar2.f52011f = aVar.f52011f;
                            aVar2.f52010e = aVar.f52010e;
                            aVar2.f52012g = aVar.f52012g;
                            this.f51989c.add(i10, aVar2);
                            arrayList.remove(fragment4);
                            i10++;
                        }
                    }
                }
                if (z10) {
                    this.f51989c.remove(i10);
                    i10--;
                } else {
                    aVar.f52006a = 1;
                    aVar.f52008c = true;
                    arrayList.add(fragment3);
                }
            } else if (i11 == 3 || i11 == 6) {
                arrayList.remove(aVar.f52007b);
                Fragment fragment5 = aVar.f52007b;
                if (fragment5 == fragment2) {
                    this.f51989c.add(i10, new t0.a(9, fragment5));
                    i10++;
                    fragment2 = null;
                }
            } else if (i11 == 7) {
                arrayList.add(aVar.f52007b);
            } else if (i11 == 8) {
                this.f51989c.add(i10, new t0.a(9, fragment2, true));
                aVar.f52008c = true;
                i10++;
                fragment2 = aVar.f52007b;
            }
            i10++;
        }
        return fragment2;
    }

    public void Z() {
        if (this.f52005s != null) {
            for (int i10 = 0; i10 < this.f52005s.size(); i10++) {
                this.f52005s.get(i10).run();
            }
            this.f52005s = null;
        }
    }

    @Override // androidx.fragment.app.FragmentManager.q
    public boolean a(@NonNull ArrayList<a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        if (FragmentManager.b1(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f51995i) {
            return true;
        }
        this.N.o(this);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0034  */
    Fragment a0(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f51989c.size() - 1; size >= 0; size--) {
            t0.a aVar = this.f51989c.get(size);
            int i10 = aVar.f52006a;
            if (i10 == 1) {
                arrayList.remove(aVar.f52007b);
            } else if (i10 != 3) {
                switch (i10) {
                    case 6:
                        arrayList.add(aVar.f52007b);
                        break;
                    case 7:
                        arrayList.remove(aVar.f52007b);
                        break;
                    case 8:
                        fragment = null;
                        break;
                    case 9:
                        fragment = aVar.f52007b;
                        break;
                    case 10:
                        aVar.f52014i = aVar.f52013h;
                        break;
                }
            } else {
                arrayList.add(aVar.f52007b);
            }
        }
        return fragment;
    }

    @Override // androidx.fragment.app.FragmentManager.k
    @androidx.annotation.p0
    public CharSequence getBreadCrumbShortTitle() {
        return this.f52000n != 0 ? this.N.O0().f().getText(this.f52000n) : this.f52001o;
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public int getBreadCrumbShortTitleRes() {
        return this.f52000n;
    }

    @Override // androidx.fragment.app.FragmentManager.k
    @androidx.annotation.p0
    public CharSequence getBreadCrumbTitle() {
        return this.f51998l != 0 ? this.N.O0().f().getText(this.f51998l) : this.f51999m;
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public int getBreadCrumbTitleRes() {
        return this.f51998l;
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public int getId() {
        return this.P;
    }

    @Override // androidx.fragment.app.FragmentManager.k
    @androidx.annotation.p0
    public String getName() {
        return this.f51997k;
    }

    @Override // androidx.fragment.app.t0
    public int m() {
        return T(false, true);
    }

    @Override // androidx.fragment.app.t0
    public int n() {
        return T(true, true);
    }

    @Override // androidx.fragment.app.t0
    public void o() {
        s();
        this.N.o0(this, false);
    }

    @Override // androidx.fragment.app.t0
    public void p() {
        s();
        this.N.o0(this, true);
    }

    @Override // androidx.fragment.app.t0
    @NonNull
    public t0 r(@NonNull Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.N) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.r(fragment);
    }

    @Override // androidx.fragment.app.t0
    void t(int i10, Fragment fragment, @androidx.annotation.p0 String str, int i11) {
        super.t(i10, fragment, str, i11);
        fragment.mFragmentManager = this.N;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.P >= 0) {
            sb2.append(" #");
            sb2.append(this.P);
        }
        if (this.f51997k != null) {
            sb2.append(" ");
            sb2.append(this.f51997k);
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Override // androidx.fragment.app.t0
    @NonNull
    public t0 u(@NonNull Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.N) {
            throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.u(fragment);
    }

    @Override // androidx.fragment.app.t0
    public boolean w() {
        return this.f51989c.isEmpty();
    }

    @Override // androidx.fragment.app.t0
    @NonNull
    public t0 x(@NonNull Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.N) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.x(fragment);
    }

    a(@NonNull a aVar) {
        super(aVar.N.L0(), aVar.N.O0() != null ? aVar.N.O0().f().getClassLoader() : null, aVar);
        this.P = -1;
        this.Q = false;
        this.N = aVar.N;
        this.O = aVar.O;
        this.P = aVar.P;
        this.Q = aVar.Q;
    }
}
