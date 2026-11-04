package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import androidx.media3.common.b4;
import androidx.media3.common.c4;
import androidx.media3.common.i4;
import com.google.common.collect.l6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public class TrackSelectionView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f69743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LayoutInflater f69744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CheckedTextView f69745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CheckedTextView f69746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f69747e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<i4.a> f69748f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<b4, c4> f69749g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f69750h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f69751i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private e1 f69752j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CheckedTextView[][] f69753k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f69754l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.p0
    private Comparator<c> f69755m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.p0
    private d f69756n;

    private class b implements View.OnClickListener {
        private b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView.this.e(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i4.a f69758a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f69759b;

        public c(i4.a aVar, int i10) {
            this.f69758a = aVar;
            this.f69759b = i10;
        }

        public androidx.media3.common.w a() {
            return this.f69758a.d(this.f69759b);
        }
    }

    public interface d {
        void a(boolean z10, Map<b4, c4> map);
    }

    public TrackSelectionView(Context context) {
        this(context, null);
    }

    public static Map<b4, c4> c(Map<b4, c4> map, List<i4.a> list, boolean z10) {
        HashMap map2 = new HashMap();
        for (int i10 = 0; i10 < list.size(); i10++) {
            c4 c4Var = map.get(list.get(i10).c());
            if (c4Var != null && (z10 || map2.isEmpty())) {
                map2.put(c4Var.f60470a, c4Var);
            }
        }
        return map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(View view) {
        if (view == this.f69745c) {
            g();
        } else if (view == this.f69746d) {
            f();
        } else {
            h(view);
        }
        k();
        d dVar = this.f69756n;
        if (dVar != null) {
            dVar.a(getIsDisabled(), getOverrides());
        }
    }

    private void f() {
        this.f69754l = false;
        this.f69749g.clear();
    }

    private void g() {
        this.f69754l = true;
        this.f69749g.clear();
    }

    private void h(View view) {
        this.f69754l = false;
        c cVar = (c) androidx.media3.common.util.a.g(view.getTag());
        b4 b4VarC = cVar.f69758a.c();
        int i10 = cVar.f69759b;
        c4 c4Var = this.f69749g.get(b4VarC);
        if (c4Var == null) {
            if (!this.f69751i && this.f69749g.size() > 0) {
                this.f69749g.clear();
            }
            this.f69749g.put(b4VarC, new c4(b4VarC, l6.G(Integer.valueOf(i10))));
            return;
        }
        ArrayList arrayList = new ArrayList(c4Var.f60471b);
        boolean zIsChecked = ((CheckedTextView) view).isChecked();
        boolean zI = i(cVar.f69758a);
        boolean z10 = zI || j();
        if (zIsChecked && z10) {
            arrayList.remove(Integer.valueOf(i10));
            if (arrayList.isEmpty()) {
                this.f69749g.remove(b4VarC);
                return;
            } else {
                this.f69749g.put(b4VarC, new c4(b4VarC, arrayList));
                return;
            }
        }
        if (zIsChecked) {
            return;
        }
        if (!zI) {
            this.f69749g.put(b4VarC, new c4(b4VarC, l6.G(Integer.valueOf(i10))));
        } else {
            arrayList.add(Integer.valueOf(i10));
            this.f69749g.put(b4VarC, new c4(b4VarC, arrayList));
        }
    }

    private boolean i(i4.a aVar) {
        return this.f69750h && aVar.g();
    }

    private boolean j() {
        return this.f69751i && this.f69748f.size() > 1;
    }

    private void k() {
        this.f69745c.setChecked(this.f69754l);
        this.f69746d.setChecked(!this.f69754l && this.f69749g.size() == 0);
        for (int i10 = 0; i10 < this.f69753k.length; i10++) {
            c4 c4Var = this.f69749g.get(this.f69748f.get(i10).c());
            int i11 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f69753k[i10];
                if (i11 < checkedTextViewArr.length) {
                    if (c4Var != null) {
                        this.f69753k[i10][i11].setChecked(c4Var.f60471b.contains(Integer.valueOf(((c) androidx.media3.common.util.a.g(checkedTextViewArr[i11].getTag())).f69759b)));
                    } else {
                        checkedTextViewArr[i11].setChecked(false);
                    }
                    i11++;
                }
            }
        }
    }

    private void l() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.f69748f.isEmpty()) {
            this.f69745c.setEnabled(false);
            this.f69746d.setEnabled(false);
            return;
        }
        this.f69745c.setEnabled(true);
        this.f69746d.setEnabled(true);
        this.f69753k = new CheckedTextView[this.f69748f.size()][];
        boolean zJ = j();
        for (int i10 = 0; i10 < this.f69748f.size(); i10++) {
            i4.a aVar = this.f69748f.get(i10);
            boolean zI = i(aVar);
            CheckedTextView[][] checkedTextViewArr = this.f69753k;
            int i11 = aVar.f60646a;
            checkedTextViewArr[i10] = new CheckedTextView[i11];
            c[] cVarArr = new c[i11];
            for (int i12 = 0; i12 < aVar.f60646a; i12++) {
                cVarArr[i12] = new c(aVar, i12);
            }
            Comparator<c> comparator = this.f69755m;
            if (comparator != null) {
                Arrays.sort(cVarArr, comparator);
            }
            for (int i13 = 0; i13 < i11; i13++) {
                if (i13 == 0) {
                    addView(this.f69744b.inflate(v0.i.f70347c, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView = (CheckedTextView) this.f69744b.inflate((zI || zJ) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView.setBackgroundResource(this.f69743a);
                checkedTextView.setText(this.f69752j.a(cVarArr[i13].a()));
                checkedTextView.setTag(cVarArr[i13]);
                if (aVar.l(i13)) {
                    checkedTextView.setFocusable(true);
                    checkedTextView.setOnClickListener(this.f69747e);
                } else {
                    checkedTextView.setFocusable(false);
                    checkedTextView.setEnabled(false);
                }
                this.f69753k[i10][i13] = checkedTextView;
                addView(checkedTextView);
            }
        }
        k();
    }

    public void d(List<i4.a> list, boolean z10, Map<b4, c4> map, @androidx.annotation.p0 final Comparator<androidx.media3.common.w> comparator, @androidx.annotation.p0 d dVar) {
        this.f69754l = z10;
        this.f69755m = comparator == null ? null : new Comparator() { // from class: androidx.media3.ui.i1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return comparator.compare(((TrackSelectionView.c) obj).a(), ((TrackSelectionView.c) obj2).a());
            }
        };
        this.f69756n = dVar;
        this.f69748f.clear();
        this.f69748f.addAll(list);
        this.f69749g.clear();
        this.f69749g.putAll(c(map, list, this.f69751i));
        l();
    }

    public boolean getIsDisabled() {
        return this.f69754l;
    }

    public Map<b4, c4> getOverrides() {
        return this.f69749g;
    }

    public void setAllowAdaptiveSelections(boolean z10) {
        if (this.f69750h != z10) {
            this.f69750h = z10;
            l();
        }
    }

    public void setAllowMultipleOverrides(boolean z10) {
        if (this.f69751i != z10) {
            this.f69751i = z10;
            if (!z10 && this.f69749g.size() > 1) {
                Map<b4, c4> mapC = c(this.f69749g, this.f69748f, false);
                this.f69749g.clear();
                this.f69749g.putAll(mapC);
            }
            l();
        }
    }

    public void setShowDisableOption(boolean z10) {
        this.f69745c.setVisibility(z10 ? 0 : 8);
    }

    public void setTrackNameProvider(e1 e1Var) {
        this.f69752j = (e1) androidx.media3.common.util.a.g(e1Var);
        l();
    }

    public TrackSelectionView(Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context, @androidx.annotation.p0 AttributeSet attributeSet, @androidx.annotation.f int i10) {
        super(context, attributeSet, i10);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f69743a = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f69744b = layoutInflaterFrom;
        int i11 = 7 ^ 0;
        b bVar = new b();
        this.f69747e = bVar;
        this.f69752j = new g(getResources());
        this.f69748f = new ArrayList();
        this.f69749g = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f69745c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(v0.k.J);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(bVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(v0.i.f70347c, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f69746d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(v0.k.I);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(bVar);
        addView(checkedTextView2);
    }
}
