package androidx.preference;

import android.R;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.core.view.u1;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public class n extends RecyclerView.h<u> implements Preference.b, PreferenceGroup.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PreferenceGroup f73106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Preference> f73107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Preference> f73108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<d> f73109d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Runnable f73111f = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f73110e = new Handler(Looper.getMainLooper());

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n.this.o();
        }
    }

    class b extends androidx.recyclerview.widget.k.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f73113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f73114b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ s.d f73115c;

        b(List list, List list2, s.d dVar) {
            this.f73113a = list;
            this.f73114b = list2;
            this.f73115c = dVar;
        }

        @Override // androidx.recyclerview.widget.k.b
        public boolean a(int i10, int i11) {
            return this.f73115c.a((Preference) this.f73113a.get(i10), (Preference) this.f73114b.get(i11));
        }

        @Override // androidx.recyclerview.widget.k.b
        public boolean b(int i10, int i11) {
            return this.f73115c.b((Preference) this.f73113a.get(i10), (Preference) this.f73114b.get(i11));
        }

        @Override // androidx.recyclerview.widget.k.b
        public int d() {
            return this.f73114b.size();
        }

        @Override // androidx.recyclerview.widget.k.b
        public int e() {
            return this.f73113a.size();
        }
    }

    class c implements Preference.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ PreferenceGroup f73117a;

        c(PreferenceGroup preferenceGroup) {
            this.f73117a = preferenceGroup;
        }

        @Override // androidx.preference.Preference.d
        public boolean a(@NonNull Preference preference) {
            this.f73117a.T1(Integer.MAX_VALUE);
            n.this.f(preference);
            PreferenceGroup.b bVarH1 = this.f73117a.H1();
            if (bVarH1 == null) {
                return true;
            }
            bVarH1.a();
            return true;
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f73119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f73120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f73121c;

        d(@NonNull Preference preference) {
            this.f73121c = preference.getClass().getName();
            this.f73119a = preference.H();
            this.f73120b = preference.e0();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f73119a == dVar.f73119a && this.f73120b == dVar.f73120b && TextUtils.equals(this.f73121c, dVar.f73121c);
        }

        public int hashCode() {
            return ((((527 + this.f73119a) * 31) + this.f73120b) * 31) + this.f73121c.hashCode();
        }
    }

    public n(@NonNull PreferenceGroup preferenceGroup) {
        this.f73106a = preferenceGroup;
        preferenceGroup.g1(this);
        this.f73107b = new ArrayList();
        this.f73108c = new ArrayList();
        this.f73109d = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            setHasStableIds(((PreferenceScreen) preferenceGroup).Y1());
        } else {
            setHasStableIds(true);
        }
        o();
    }

    private androidx.preference.d h(PreferenceGroup preferenceGroup, List<Preference> list) {
        androidx.preference.d dVar = new androidx.preference.d(preferenceGroup.r(), list, preferenceGroup.z());
        dVar.i1(new c(preferenceGroup));
        return dVar;
    }

    private List<Preference> i(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iJ1 = preferenceGroup.J1();
        int i10 = 0;
        for (int i11 = 0; i11 < iJ1; i11++) {
            Preference preferenceI1 = preferenceGroup.I1(i11);
            if (preferenceI1.n0()) {
                if (!l(preferenceGroup) || i10 < preferenceGroup.G1()) {
                    arrayList.add(preferenceI1);
                } else {
                    arrayList2.add(preferenceI1);
                }
                if (preferenceI1 instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceI1;
                    if (preferenceGroup2.L1()) {
                        if (l(preferenceGroup) && l(preferenceGroup2)) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        for (Preference preference : i(preferenceGroup2)) {
                            if (!l(preferenceGroup) || i10 < preferenceGroup.G1()) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i10++;
                        }
                    } else {
                        continue;
                    }
                } else {
                    i10++;
                }
            }
        }
        if (l(preferenceGroup) && i10 > preferenceGroup.G1()) {
            arrayList.add(h(preferenceGroup, arrayList2));
        }
        return arrayList;
    }

    private void j(List<Preference> list, PreferenceGroup preferenceGroup) {
        preferenceGroup.W1();
        int iJ1 = preferenceGroup.J1();
        for (int i10 = 0; i10 < iJ1; i10++) {
            Preference preferenceI1 = preferenceGroup.I1(i10);
            list.add(preferenceI1);
            d dVar = new d(preferenceI1);
            if (!this.f73109d.contains(dVar)) {
                this.f73109d.add(dVar);
            }
            if (preferenceI1 instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceI1;
                if (preferenceGroup2.L1()) {
                    j(list, preferenceGroup2);
                }
            }
            preferenceI1.g1(this);
        }
    }

    private boolean l(PreferenceGroup preferenceGroup) {
        return preferenceGroup.G1() != Integer.MAX_VALUE;
    }

    @Override // androidx.preference.Preference.b
    public void b(@NonNull Preference preference) {
        f(preference);
    }

    @Override // androidx.preference.PreferenceGroup.c
    public int c(@NonNull Preference preference) {
        int size = this.f73108c.size();
        for (int i10 = 0; i10 < size; i10++) {
            Preference preference2 = this.f73108c.get(i10);
            if (preference2 != null && preference2.equals(preference)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // androidx.preference.Preference.b
    public void d(@NonNull Preference preference) {
        int iIndexOf = this.f73108c.indexOf(preference);
        if (iIndexOf != -1) {
            notifyItemChanged(iIndexOf, preference);
        }
    }

    @Override // androidx.preference.PreferenceGroup.c
    public int e(@NonNull String str) {
        int size = this.f73108c.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (TextUtils.equals(str, this.f73108c.get(i10).E())) {
                return i10;
            }
        }
        return -1;
    }

    @Override // androidx.preference.Preference.b
    public void f(@NonNull Preference preference) {
        this.f73110e.removeCallbacks(this.f73111f);
        this.f73110e.post(this.f73111f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f73108c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i10) {
        if (hasStableIds()) {
            return k(i10).z();
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        d dVar = new d(k(i10));
        int iIndexOf = this.f73109d.indexOf(dVar);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        int size = this.f73109d.size();
        this.f73109d.add(dVar);
        return size;
    }

    @p0
    public Preference k(int i10) {
        if (i10 < 0 || i10 >= getItemCount()) {
            return null;
        }
        return this.f73108c.get(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull u uVar, int i10) {
        Preference preferenceK = k(i10);
        uVar.k();
        preferenceK.u0(uVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NonNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public u onCreateViewHolder(@NonNull ViewGroup viewGroup, int i10) {
        d dVar = this.f73109d.get(i10);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        TypedArray typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, v.k.f73272a);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(v.k.f73275b);
        if (drawable == null) {
            drawable = j.a.b(viewGroup.getContext(), R.drawable.list_selector_background);
        }
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = layoutInflaterFrom.inflate(dVar.f73119a, viewGroup, false);
        if (viewInflate.getBackground() == null) {
            u1.O1(viewInflate, drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i11 = dVar.f73120b;
            if (i11 != 0) {
                layoutInflaterFrom.inflate(i11, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new u(viewInflate);
    }

    void o() {
        Iterator<Preference> it = this.f73107b.iterator();
        while (it.hasNext()) {
            it.next().g1(null);
        }
        ArrayList arrayList = new ArrayList(this.f73107b.size());
        this.f73107b = arrayList;
        j(arrayList, this.f73106a);
        List<Preference> list = this.f73108c;
        List<Preference> listI = i(this.f73106a);
        this.f73108c = listI;
        s sVarX = this.f73106a.X();
        if (sVarX == null || sVarX.l() == null) {
            notifyDataSetChanged();
        } else {
            androidx.recyclerview.widget.k.b(new b(list, listI, sVarX.l())).e(this);
        }
        Iterator<Preference> it2 = this.f73107b.iterator();
        while (it2.hasNext()) {
            it2.next().k();
        }
    }
}
