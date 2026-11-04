package androidx.fragment.app;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class a1 extends Fragment {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final int f51762l = 16711681;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final int f51763m = 16711682;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final int f51764n = 16711683;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f51765a = new Handler();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f51766b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdapterView.OnItemClickListener f51767c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ListAdapter f51768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ListView f51769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    View f51770f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    TextView f51771g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    View f51772h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    View f51773i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    CharSequence f51774j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f51775k;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ListView listView = a1.this.f51769e;
            listView.focusableViewAvailable(listView);
        }
    }

    class b implements AdapterView.OnItemClickListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            a1.this.y((ListView) adapterView, view, i10, j10);
        }
    }

    private void D(boolean z10, boolean z11) {
        t();
        View view = this.f51772h;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        if (this.f51775k == z10) {
            return;
        }
        this.f51775k = z10;
        if (z10) {
            if (z11) {
                view.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
                this.f51773i.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in));
            } else {
                view.clearAnimation();
                this.f51773i.clearAnimation();
            }
            this.f51772h.setVisibility(8);
            this.f51773i.setVisibility(0);
            return;
        }
        if (z11) {
            view.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in));
            this.f51773i.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
        } else {
            view.clearAnimation();
            this.f51773i.clearAnimation();
        }
        this.f51772h.setVisibility(0);
        this.f51773i.setVisibility(8);
    }

    private void t() {
        if (this.f51769e != null) {
            return;
        }
        View view = getView();
        if (view == null) {
            throw new IllegalStateException("Content view not yet created");
        }
        if (view instanceof ListView) {
            this.f51769e = (ListView) view;
        } else {
            TextView textView = (TextView) view.findViewById(f51762l);
            this.f51771g = textView;
            if (textView == null) {
                this.f51770f = view.findViewById(R.id.empty);
            } else {
                textView.setVisibility(8);
            }
            this.f51772h = view.findViewById(f51763m);
            this.f51773i = view.findViewById(f51764n);
            View viewFindViewById = view.findViewById(R.id.list);
            if (!(viewFindViewById instanceof ListView)) {
                if (viewFindViewById != null) {
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
            }
            ListView listView = (ListView) viewFindViewById;
            this.f51769e = listView;
            View view2 = this.f51770f;
            if (view2 != null) {
                listView.setEmptyView(view2);
            } else {
                CharSequence charSequence = this.f51774j;
                if (charSequence != null) {
                    this.f51771g.setText(charSequence);
                    this.f51769e.setEmptyView(this.f51771g);
                }
            }
        }
        this.f51775k = true;
        this.f51769e.setOnItemClickListener(this.f51767c);
        ListAdapter listAdapter = this.f51768d;
        if (listAdapter != null) {
            this.f51768d = null;
            B(listAdapter);
        } else if (this.f51772h != null) {
            D(false, false);
        }
        this.f51765a.post(this.f51766b);
    }

    public void A(@androidx.annotation.p0 CharSequence charSequence) {
        t();
        TextView textView = this.f51771g;
        if (textView == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        textView.setText(charSequence);
        if (this.f51774j == null) {
            this.f51769e.setEmptyView(this.f51771g);
        }
        this.f51774j = charSequence;
    }

    public void B(@androidx.annotation.p0 ListAdapter listAdapter) {
        boolean z10 = this.f51768d != null;
        this.f51768d = listAdapter;
        ListView listView = this.f51769e;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (!this.f51775k && !z10) {
                D(true, requireView().getWindowToken() != null);
            }
        }
    }

    public void C(boolean z10) {
        D(z10, true);
    }

    public void E(boolean z10) {
        D(z10, false);
    }

    public void F(int i10) {
        t();
        this.f51769e.setSelection(i10);
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.p0
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, @androidx.annotation.p0 Bundle bundle) {
        Context contextRequireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(contextRequireContext);
        LinearLayout linearLayout = new LinearLayout(contextRequireContext);
        linearLayout.setId(f51763m);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(contextRequireContext, null, R.attr.progressBarStyleLarge), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(contextRequireContext);
        frameLayout2.setId(f51764n);
        TextView textView = new TextView(contextRequireContext);
        textView.setId(f51762l);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(contextRequireContext);
        listView.setId(R.id.list);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f51765a.removeCallbacks(this.f51766b);
        this.f51769e = null;
        this.f51775k = false;
        this.f51773i = null;
        this.f51772h = null;
        this.f51770f = null;
        this.f51771g = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @androidx.annotation.p0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        t();
    }

    @androidx.annotation.p0
    public ListAdapter u() {
        return this.f51768d;
    }

    @NonNull
    public ListView v() {
        t();
        return this.f51769e;
    }

    public long w() {
        t();
        return this.f51769e.getSelectedItemId();
    }

    public int x() {
        t();
        return this.f51769e.getSelectedItemPosition();
    }

    public void y(@NonNull ListView listView, @NonNull View view, int i10, long j10) {
    }

    @NonNull
    public final ListAdapter z() {
        ListAdapter listAdapterU = u();
        if (listAdapterU != null) {
            return listAdapterU;
        }
        throw new IllegalStateException("ListFragment " + this + " does not have a ListAdapter.");
    }
}
