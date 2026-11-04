package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
class s0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f51968e = "FragmentManager";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<Fragment> f51969a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<String, q0> f51970b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, Bundle> f51971c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private l0 f51972d;

    s0() {
    }

    @androidx.annotation.p0
    ArrayList<String> A() {
        synchronized (this.f51969a) {
            try {
                if (this.f51969a.isEmpty()) {
                    return null;
                }
                ArrayList<String> arrayList = new ArrayList<>(this.f51969a.size());
                for (Fragment fragment : this.f51969a) {
                    arrayList.add(fragment.mWho);
                    if (FragmentManager.b1(2)) {
                        fragment.toString();
                    }
                }
                return arrayList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void B(@NonNull l0 l0Var) {
        this.f51972d = l0Var;
    }

    @androidx.annotation.p0
    Bundle C(@NonNull String str, @androidx.annotation.p0 Bundle bundle) {
        return bundle != null ? this.f51971c.put(str, bundle) : this.f51971c.remove(str);
    }

    void a(@NonNull Fragment fragment) {
        if (this.f51969a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f51969a) {
            this.f51969a.add(fragment);
        }
        fragment.mAdded = true;
    }

    void b() {
        this.f51970b.values().removeAll(Collections.singleton(null));
    }

    boolean c(@NonNull String str) {
        return this.f51970b.get(str) != null;
    }

    void d(int i10) {
        for (q0 q0Var : this.f51970b.values()) {
            if (q0Var != null) {
                q0Var.t(i10);
            }
        }
    }

    void e(@NonNull String str, @androidx.annotation.p0 FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @androidx.annotation.p0 String[] strArr) {
        String str2 = str + "    ";
        if (!this.f51970b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (q0 q0Var : this.f51970b.values()) {
                printWriter.print(str);
                if (q0Var != null) {
                    Fragment fragmentK = q0Var.k();
                    printWriter.println(fragmentK);
                    fragmentK.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println(AbstractJsonLexerKt.NULL);
                }
            }
        }
        int size = this.f51969a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size; i10++) {
                Fragment fragment = this.f51969a.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    @androidx.annotation.p0
    Fragment f(@NonNull String str) {
        q0 q0Var = this.f51970b.get(str);
        if (q0Var != null) {
            return q0Var.k();
        }
        return null;
    }

    @androidx.annotation.p0
    Fragment g(@androidx.annotation.d0 int i10) {
        for (int size = this.f51969a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f51969a.get(size);
            if (fragment != null && fragment.mFragmentId == i10) {
                return fragment;
            }
        }
        for (q0 q0Var : this.f51970b.values()) {
            if (q0Var != null) {
                Fragment fragmentK = q0Var.k();
                if (fragmentK.mFragmentId == i10) {
                    return fragmentK;
                }
            }
        }
        return null;
    }

    @androidx.annotation.p0
    Fragment h(@androidx.annotation.p0 String str) {
        if (str != null) {
            for (int size = this.f51969a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f51969a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (q0 q0Var : this.f51970b.values()) {
            if (q0Var != null) {
                Fragment fragmentK = q0Var.k();
                if (str.equals(fragmentK.mTag)) {
                    return fragmentK;
                }
            }
        }
        return null;
    }

    @androidx.annotation.p0
    Fragment i(@NonNull String str) {
        Fragment fragmentFindFragmentByWho;
        for (q0 q0Var : this.f51970b.values()) {
            if (q0Var != null && (fragmentFindFragmentByWho = q0Var.k().findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    int j(@NonNull Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.f51969a.indexOf(fragment);
        for (int i10 = iIndexOf - 1; i10 >= 0; i10--) {
            Fragment fragment2 = this.f51969a.get(i10);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f51969a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f51969a.get(iIndexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    int k() {
        return this.f51970b.size();
    }

    @NonNull
    List<q0> l() {
        ArrayList arrayList = new ArrayList();
        for (q0 q0Var : this.f51970b.values()) {
            if (q0Var != null) {
                arrayList.add(q0Var);
            }
        }
        return arrayList;
    }

    @NonNull
    List<Fragment> m() {
        ArrayList arrayList = new ArrayList();
        for (q0 q0Var : this.f51970b.values()) {
            if (q0Var != null) {
                arrayList.add(q0Var.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    @NonNull
    HashMap<String, Bundle> n() {
        return this.f51971c;
    }

    @androidx.annotation.p0
    q0 o(@NonNull String str) {
        return this.f51970b.get(str);
    }

    @NonNull
    List<Fragment> p() {
        ArrayList arrayList;
        if (this.f51969a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f51969a) {
            try {
                arrayList = new ArrayList(this.f51969a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    l0 q() {
        return this.f51972d;
    }

    @androidx.annotation.p0
    Bundle r(@NonNull String str) {
        return this.f51971c.get(str);
    }

    void s(@NonNull q0 q0Var) {
        Fragment fragmentK = q0Var.k();
        if (!c(fragmentK.mWho)) {
            this.f51970b.put(fragmentK.mWho, q0Var);
            if (fragmentK.mRetainInstanceChangedWhileDetached) {
                if (fragmentK.mRetainInstance) {
                    this.f51972d.U(fragmentK);
                } else {
                    this.f51972d.g0(fragmentK);
                }
                fragmentK.mRetainInstanceChangedWhileDetached = false;
            }
            if (FragmentManager.b1(2)) {
                fragmentK.toString();
            }
        }
    }

    void t(@NonNull q0 q0Var) {
        Fragment fragmentK = q0Var.k();
        if (fragmentK.mRetainInstance) {
            this.f51972d.g0(fragmentK);
        }
        if (this.f51970b.get(fragmentK.mWho) == q0Var && this.f51970b.put(fragmentK.mWho, null) != null && FragmentManager.b1(2)) {
            fragmentK.toString();
        }
    }

    void u() {
        Iterator<Fragment> it = this.f51969a.iterator();
        while (it.hasNext()) {
            q0 q0Var = this.f51970b.get(it.next().mWho);
            if (q0Var != null) {
                q0Var.m();
            }
        }
        for (q0 q0Var2 : this.f51970b.values()) {
            if (q0Var2 != null) {
                q0Var2.m();
                Fragment fragmentK = q0Var2.k();
                if (fragmentK.mRemoving && !fragmentK.isInBackStack()) {
                    if (fragmentK.mBeingSaved && !this.f51971c.containsKey(fragmentK.mWho)) {
                        C(fragmentK.mWho, q0Var2.r());
                    }
                    t(q0Var2);
                }
            }
        }
    }

    void v(@NonNull Fragment fragment) {
        synchronized (this.f51969a) {
            this.f51969a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    void w() {
        this.f51970b.clear();
    }

    void x(@androidx.annotation.p0 List<String> list) {
        this.f51969a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment fragmentF = f(str);
                if (fragmentF == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (FragmentManager.b1(2)) {
                    fragmentF.toString();
                }
                a(fragmentF);
            }
        }
    }

    void y(@NonNull HashMap<String, Bundle> map) {
        this.f51971c.clear();
        this.f51971c.putAll(map);
    }

    @NonNull
    ArrayList<String> z() {
        ArrayList<String> arrayList = new ArrayList<>(this.f51970b.size());
        for (q0 q0Var : this.f51970b.values()) {
            if (q0Var != null) {
                Fragment fragmentK = q0Var.k();
                C(fragmentK.mWho, q0Var.r());
                arrayList.add(fragmentK.mWho);
                if (FragmentManager.b1(2)) {
                    fragmentK.toString();
                    Objects.toString(fragmentK.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }
}
