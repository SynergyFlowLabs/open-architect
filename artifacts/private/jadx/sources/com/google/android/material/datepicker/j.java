package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.g1;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.core.view.u1;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a0;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class j<S> extends s<S> {
    private static final int X = 3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f112392o = "THEME_RES_ID_KEY";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f112395s = "GRID_SELECTOR_KEY";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f112396t = "CALENDAR_CONSTRAINTS_KEY";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f112397v = "DAY_VIEW_DECORATOR_KEY";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f112398w = "CURRENT_MONTH_KEY";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @g1
    private int f112399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private DateSelector<S> f112400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private CalendarConstraints f112401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private DayViewDecorator f112402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private Month f112403f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private l f112404g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.google.android.material.datepicker.b f112405h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private RecyclerView f112406i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private RecyclerView f112407j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private View f112408k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View f112409l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f112410m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View f112411n;

    @l1
    static final Object Y = "MONTHS_VIEW_GROUP_TAG";

    @l1
    static final Object Z = "NAVIGATION_PREV_TAG";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @l1
    static final Object f112393p0 = "NAVIGATION_NEXT_TAG";

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @l1
    static final Object f112394p1 = "SELECTOR_TOGGLE_TAG";

    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ q f112412a;

        a(q qVar) {
            this.f112412a = qVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iE2 = j.this.L().E2() - 1;
            if (iE2 >= 0) {
                j.this.P(this.f112412a.i(iE2));
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f112414a;

        b(int i10) {
            this.f112414a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.f112407j.V1(this.f112414a);
        }
    }

    class c extends androidx.core.view.a {
        c() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, @NonNull androidx.core.view.accessibility.j jVar) {
            super.onInitializeAccessibilityNodeInfo(view, jVar);
            jVar.l1(null);
        }
    }

    class d extends t {
        final /* synthetic */ int P;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, int i10, boolean z10, int i11) {
            super(context, i10, z10);
            this.P = i11;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void o2(@NonNull RecyclerView.c0 c0Var, @NonNull int[] iArr) {
            if (this.P == 0) {
                iArr[0] = j.this.f112407j.getWidth();
                iArr[1] = j.this.f112407j.getWidth();
            } else {
                iArr[0] = j.this.f112407j.getHeight();
                iArr[1] = j.this.f112407j.getHeight();
            }
        }
    }

    class e implements m {
        e() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.datepicker.j.m
        public void a(long j10) {
            if (j.this.f112401d.h().d(j10)) {
                j.this.f112400c.a3(j10);
                Iterator<r<S>> it = j.this.f112508a.iterator();
                while (it.hasNext()) {
                    it.next().b(j.this.f112400c.Y2());
                }
                j.this.f112407j.getAdapter().notifyDataSetChanged();
                if (j.this.f112406i != null) {
                    j.this.f112406i.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    class f extends androidx.core.view.a {
        f() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, @NonNull androidx.core.view.accessibility.j jVar) {
            super.onInitializeAccessibilityNodeInfo(view, jVar);
            jVar.X1(false);
        }
    }

    class g extends RecyclerView.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Calendar f112419a = v.x();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Calendar f112420b = v.x();

        g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.c0 c0Var) {
            if ((recyclerView.getAdapter() instanceof w) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                w wVar = (w) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (androidx.core.util.p<Long, Long> pVar : j.this.f112400c.C3()) {
                    Long l10 = pVar.f48411a;
                    if (l10 != null && pVar.f48412b != null) {
                        this.f112419a.setTimeInMillis(l10.longValue());
                        this.f112420b.setTimeInMillis(pVar.f48412b.longValue());
                        int iJ = wVar.j(this.f112419a.get(1));
                        int iJ2 = wVar.j(this.f112420b.get(1));
                        View viewO = gridLayoutManager.O(iJ);
                        View viewO2 = gridLayoutManager.O(iJ2);
                        int iH3 = iJ / gridLayoutManager.H3();
                        int iH4 = iJ2 / gridLayoutManager.H3();
                        int i10 = iH3;
                        while (i10 <= iH4) {
                            View viewO3 = gridLayoutManager.O(gridLayoutManager.H3() * i10);
                            if (viewO3 != null) {
                                canvas.drawRect((i10 != iH3 || viewO == null) ? 0 : viewO.getLeft() + (viewO.getWidth() / 2), viewO3.getTop() + j.this.f112405h.f112368d.e(), (i10 != iH4 || viewO2 == null) ? recyclerView.getWidth() : viewO2.getLeft() + (viewO2.getWidth() / 2), viewO3.getBottom() - j.this.f112405h.f112368d.b(), j.this.f112405h.f112372h);
                            }
                            i10++;
                        }
                    }
                }
            }
        }
    }

    class h extends androidx.core.view.a {
        h() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, @NonNull androidx.core.view.accessibility.j jVar) {
            super.onInitializeAccessibilityNodeInfo(view, jVar);
            jVar.A1(j.this.f112411n.getVisibility() == 0 ? j.this.getString(r6.a.m.M1) : j.this.getString(r6.a.m.K1));
        }
    }

    class i extends RecyclerView.u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ q f112423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MaterialButton f112424b;

        i(q qVar, MaterialButton materialButton) {
            this.f112423a = qVar;
            this.f112424b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(@NonNull RecyclerView recyclerView, int i10) {
            if (i10 == 0) {
                recyclerView.announceForAccessibility(this.f112424b.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(@NonNull RecyclerView recyclerView, int i10, int i11) {
            int iB2 = i10 < 0 ? j.this.L().B2() : j.this.L().E2();
            j.this.f112403f = this.f112423a.i(iB2);
            this.f112424b.setText(this.f112423a.j(iB2));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.j$j, reason: collision with other inner class name */
    class ViewOnClickListenerC0984j implements View.OnClickListener {
        ViewOnClickListenerC0984j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j.this.S();
        }
    }

    class k implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ q f112427a;

        k(q qVar) {
            this.f112427a = qVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iB2 = j.this.L().B2() + 1;
            if (iB2 < j.this.f112407j.getAdapter().getItemCount()) {
                j.this.P(this.f112427a.i(iB2));
            }
        }
    }

    enum l {
        DAY,
        YEAR
    }

    interface m {
        void a(long j10);
    }

    private void E(@NonNull View view, @NonNull q qVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(r6.a.h.f360627b3);
        materialButton.setTag(f112394p1);
        u1.G1(materialButton, new h());
        View viewFindViewById = view.findViewById(r6.a.h.f360643d3);
        this.f112408k = viewFindViewById;
        viewFindViewById.setTag(Z);
        View viewFindViewById2 = view.findViewById(r6.a.h.f360635c3);
        this.f112409l = viewFindViewById2;
        viewFindViewById2.setTag(f112393p0);
        this.f112410m = view.findViewById(r6.a.h.f360731o3);
        this.f112411n = view.findViewById(r6.a.h.f360675h3);
        Q(l.DAY);
        materialButton.setText(this.f112403f.p());
        this.f112407j.r(new i(qVar, materialButton));
        materialButton.setOnClickListener(new ViewOnClickListenerC0984j());
        this.f112409l.setOnClickListener(new k(qVar));
        this.f112408k.setOnClickListener(new a(qVar));
    }

    @NonNull
    private RecyclerView.o F() {
        return new g();
    }

    @t0
    static int J(@NonNull Context context) {
        return context.getResources().getDimensionPixelSize(r6.a.f.f360222hb);
    }

    private static int K(@NonNull Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(r6.a.f.Cb) + resources.getDimensionPixelOffset(r6.a.f.Db) + resources.getDimensionPixelOffset(r6.a.f.Bb);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(r6.a.f.f360302mb);
        int i10 = p.f112490g;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(r6.a.f.f360222hb) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(r6.a.f.Ab)) + resources.getDimensionPixelOffset(r6.a.f.f360174eb);
    }

    @NonNull
    public static <T> j<T> M(@NonNull DateSelector<T> dateSelector, @g1 int i10, @NonNull CalendarConstraints calendarConstraints) {
        return N(dateSelector, i10, calendarConstraints, null);
    }

    @NonNull
    public static <T> j<T> N(@NonNull DateSelector<T> dateSelector, @g1 int i10, @NonNull CalendarConstraints calendarConstraints, @p0 DayViewDecorator dayViewDecorator) {
        j<T> jVar = new j<>();
        Bundle bundle = new Bundle();
        bundle.putInt(f112392o, i10);
        bundle.putParcelable(f112395s, dateSelector);
        bundle.putParcelable(f112396t, calendarConstraints);
        bundle.putParcelable(f112397v, dayViewDecorator);
        bundle.putParcelable(f112398w, calendarConstraints.m());
        jVar.setArguments(bundle);
        return jVar;
    }

    private void O(int i10) {
        this.f112407j.post(new b(i10));
    }

    private void R() {
        u1.G1(this.f112407j, new f());
    }

    @p0
    CalendarConstraints G() {
        return this.f112401d;
    }

    com.google.android.material.datepicker.b H() {
        return this.f112405h;
    }

    @p0
    Month I() {
        return this.f112403f;
    }

    @NonNull
    LinearLayoutManager L() {
        return (LinearLayoutManager) this.f112407j.getLayoutManager();
    }

    void P(Month month) {
        q qVar = (q) this.f112407j.getAdapter();
        int iK = qVar.k(month);
        int iK2 = iK - qVar.k(this.f112403f);
        boolean z10 = Math.abs(iK2) > 3;
        boolean z11 = iK2 > 0;
        this.f112403f = month;
        if (z10 && z11) {
            this.f112407j.M1(iK - 3);
            O(iK);
        } else if (!z10) {
            O(iK);
        } else {
            this.f112407j.M1(iK + 3);
            O(iK);
        }
    }

    void Q(l lVar) {
        this.f112404g = lVar;
        if (lVar == l.YEAR) {
            this.f112406i.getLayoutManager().V1(((w) this.f112406i.getAdapter()).j(this.f112403f.f112332c));
            this.f112410m.setVisibility(0);
            this.f112411n.setVisibility(8);
            this.f112408k.setVisibility(8);
            this.f112409l.setVisibility(8);
            return;
        }
        if (lVar == l.DAY) {
            this.f112410m.setVisibility(8);
            this.f112411n.setVisibility(0);
            this.f112408k.setVisibility(0);
            this.f112409l.setVisibility(0);
            P(this.f112403f);
        }
    }

    void S() {
        l lVar = this.f112404g;
        l lVar2 = l.YEAR;
        if (lVar == lVar2) {
            Q(l.DAY);
        } else if (lVar == l.DAY) {
            Q(lVar2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@p0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f112399b = bundle.getInt(f112392o);
        this.f112400c = (DateSelector) bundle.getParcelable(f112395s);
        this.f112401d = (CalendarConstraints) bundle.getParcelable(f112396t);
        this.f112402e = (DayViewDecorator) bundle.getParcelable(f112397v);
        this.f112403f = (Month) bundle.getParcelable(f112398w);
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, @p0 Bundle bundle) {
        int i10;
        int i11;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f112399b);
        this.f112405h = new com.google.android.material.datepicker.b(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month monthO = this.f112401d.o();
        if (com.google.android.material.datepicker.l.Y(contextThemeWrapper)) {
            i10 = r6.a.k.C0;
            i11 = 1;
        } else {
            i10 = r6.a.k.f360933x0;
            i11 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i10, viewGroup, false);
        viewInflate.setMinimumHeight(K(requireContext()));
        GridView gridView = (GridView) viewInflate.findViewById(r6.a.h.f360683i3);
        u1.G1(gridView, new c());
        int iK = this.f112401d.k();
        gridView.setAdapter((ListAdapter) (iK > 0 ? new com.google.android.material.datepicker.i(iK) : new com.google.android.material.datepicker.i()));
        gridView.setNumColumns(monthO.f112333d);
        gridView.setEnabled(false);
        this.f112407j = (RecyclerView) viewInflate.findViewById(r6.a.h.f360707l3);
        this.f112407j.setLayoutManager(new d(getContext(), i11, false, i11));
        this.f112407j.setTag(Y);
        q qVar = new q(contextThemeWrapper, this.f112400c, this.f112401d, this.f112402e, new e());
        this.f112407j.setAdapter(qVar);
        int integer = contextThemeWrapper.getResources().getInteger(r6.a.i.Y);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(r6.a.h.f360731o3);
        this.f112406i = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f112406i.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f112406i.setAdapter(new w(this));
            this.f112406i.n(F());
        }
        if (viewInflate.findViewById(r6.a.h.f360627b3) != null) {
            E(viewInflate, qVar);
        }
        if (!com.google.android.material.datepicker.l.Y(contextThemeWrapper)) {
            new a0().b(this.f112407j);
        }
        this.f112407j.M1(qVar.k(this.f112403f));
        R();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(f112392o, this.f112399b);
        bundle.putParcelable(f112395s, this.f112400c);
        bundle.putParcelable(f112396t, this.f112401d);
        bundle.putParcelable(f112397v, this.f112402e);
        bundle.putParcelable(f112398w, this.f112403f);
    }

    @Override // com.google.android.material.datepicker.s
    public boolean t(@NonNull r<S> rVar) {
        return super.t(rVar);
    }

    @Override // com.google.android.material.datepicker.s
    @p0
    public DateSelector<S> v() {
        return this.f112400c;
    }
}
