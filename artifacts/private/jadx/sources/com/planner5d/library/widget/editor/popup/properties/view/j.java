package com.planner5d.library.widget.editor.popup.properties.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.l;
import androidx.annotation.q;
import androidx.appcompat.widget.SwitchCompat;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.manager.k5;
import com.planner5d.library.model.manager.t1;
import com.planner5d.library.model.p;
import com.planner5d.library.model.y;
import com.planner5d.library.model.z;
import com.planner5d.library.services.utility.n;
import com.planner5d.library.services.utility.p0;
import com.planner5d.library.services.utility.r2;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import rx.Subscriber;

/* JADX INFO: loaded from: classes8.dex */
public class j extends FrameLayout {
    private final AtomicInteger H1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f258015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextView f258016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MaterialImageView f258017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ImageView f258018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final View f258019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f258020f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p0 f258021g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.planner5d.library.services.bitmaploader.target.a[] f258022h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.planner5d.library.services.bitmaploader.target.h f258023i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f258024j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private SwitchCompat f258025k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f258026l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f258027m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f258028n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final k5 f258029o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private Drawable f258030p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private final Drawable f258031p1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final t1 f258032s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f258033t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private View.OnClickListener f258034v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private View.OnClickListener f258035w;

    class a extends com.planner5d.library.services.bitmaploader.target.a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f258036h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Object[] f258037i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f258038j;

        a(int i10, Object[] objArr, int i11) {
            this.f258036h = i10;
            this.f258037i = objArr;
            this.f258038j = i11;
        }

        @Override // com.planner5d.library.services.bitmaploader.target.a
        protected void h(Bitmap bitmap) {
            synchronized (j.this.H1) {
                try {
                    if (this.f258036h == j.this.H1.get()) {
                        this.f258037i[this.f258038j] = bitmap;
                        j.this.f258017c.a(this.f258037i, 0, j.this.f258024j);
                    } else {
                        g(null);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    class b extends com.planner5d.library.services.bitmaploader.target.e {
        b(com.planner5d.library.services.bitmaploader.target.a aVar, Bitmap bitmap, com.planner5d.library.services.bitmaploader.target.c... cVarArr) {
            super(aVar, bitmap, cVarArr);
        }

        @Override // com.planner5d.library.services.bitmaploader.target.e, com.planner5d.library.services.bitmaploader.target.a
        protected void g(Throwable th2) {
            super.g(th2);
            j.this.f258023i.d(this);
            j.this.f258018d.setImageDrawable(j.this.f258031p1);
            j.this.f258018d.setOnClickListener(j.this.f258035w);
            j.this.f258018d.setVisibility(0);
        }

        @Override // com.planner5d.library.services.bitmaploader.target.e, com.planner5d.library.services.bitmaploader.target.a
        protected void h(Bitmap bitmap) {
            super.h(bitmap);
            if (j.this.f258034v == null) {
                j.this.f258018d.setVisibility(8);
                return;
            }
            j.this.f258018d.setImageDrawable(j.this.f258030p0);
            j.this.f258018d.setOnClickListener(j.this.f258034v);
            j.this.f258018d.setVisibility(0);
        }
    }

    class c extends com.planner5d.library.services.rx.e<List<y>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object[] f258041d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ItemProject f258042e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f258043f;

        c(Object[] objArr, ItemProject itemProject, int i10) {
            this.f258041d = objArr;
            this.f258042e = itemProject;
            this.f258043f = i10;
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(List<y> list) {
            int iMin = Math.min(this.f258041d.length, list.size());
            for (int i10 = 0; i10 < iMin; i10++) {
                j.this.p(list.get(i10), this.f258042e, this.f258041d, i10, this.f258043f);
            }
        }
    }

    public j(Context context, boolean z10, @q int i10, p0 p0Var, com.planner5d.library.services.bitmaploader.target.h hVar) {
        super(context);
        this.f258022h = new com.planner5d.library.services.bitmaploader.target.a[]{null, null, null, null};
        this.f258025k = null;
        this.f258026l = null;
        boolean z11 = false;
        this.f258027m = false;
        this.f258028n = false;
        this.f258029o = com.planner5d.library.application.b.r().T0();
        this.f258032s = com.planner5d.library.application.b.r().d();
        this.H1 = new AtomicInteger(0);
        View.inflate(context, com.planner5d.library.f.m.f168833s8, this);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.f258023i = hVar;
        View viewFindViewById = findViewById(com.planner5d.library.f.j.Td);
        this.f258019e = viewFindViewById;
        MaterialImageView materialImageView = (MaterialImageView) findViewById(com.planner5d.library.f.j.Jd);
        this.f258017c = materialImageView;
        this.f258018d = (ImageView) findViewById(com.planner5d.library.f.j.Sd);
        this.f258031p1 = com.planner5d.library.widget.drawable.c.f254258a.a(context, com.planner5d.library.f.h.f167472c8, null);
        this.f258016b = (TextView) findViewById(com.planner5d.library.f.j.Av);
        TextView textView = (TextView) findViewById(com.planner5d.library.f.j.Cv);
        this.f258015a = textView;
        textView.setVisibility(z10 ? 0 : 8);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewFindViewById.getLayoutParams();
        r2 r2Var = r2.f229727a;
        layoutParams.topMargin = (int) r2Var.a(context, z10 ? 52.0f : 16.0f);
        viewFindViewById.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) materialImageView.getLayoutParams();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
        int paddingLeft = (dimensionPixelSize - viewFindViewById.getPaddingLeft()) - viewFindViewById.getPaddingRight();
        this.f258024j = paddingLeft;
        layoutParams2.width = paddingLeft;
        layoutParams2.height = paddingLeft;
        materialImageView.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams3.width = paddingLeft;
        textView.setLayoutParams(layoutParams3);
        this.f258033t = androidx.core.content.d.g(context, com.planner5d.library.f.C1549f.f166379g2);
        this.f258021g = p0Var;
        this.f258020f = z10;
        setSelected(false);
        if (z10) {
            FrameLayout frameLayout = new FrameLayout(context);
            ViewGroup.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(dimensionPixelSize, (int) r2Var.a(context, 38.0f));
            frameLayout.setPadding(0, getResources().getDimensionPixelSize(com.planner5d.library.f.g.Qh), 0, 0);
            addView(frameLayout, layoutParams4);
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.editor.popup.properties.view.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f258014a.o(view);
                }
            });
            this.f258025k = com.planner5d.library.services.d.f224235a.a(context, false);
            FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams5.gravity = 8388629;
            layoutParams5.bottomMargin = (int) (getResources().getDimension(com.planner5d.library.f.g.Mg) * 2.0f);
            int dimension = (int) getResources().getDimension(com.planner5d.library.f.g.Mg);
            this.f258025k.setPadding(dimension, 0, dimension, 0);
            frameLayout.addView(this.f258025k, layoutParams5);
            this.f258025k.setVisibility(8);
        }
    }

    private Drawable[] m(k5.c cVar) {
        com.planner5d.library.widget.drawable.h.b bVar;
        if (cVar == k5.f191818v) {
            bVar = com.planner5d.library.widget.drawable.h.b.LastUsed;
        } else if (cVar == k5.f191817u) {
            bVar = com.planner5d.library.widget.drawable.h.b.Favorite;
        } else if (cVar == k5.f191816t) {
            bVar = com.planner5d.library.widget.drawable.h.b.User;
        } else {
            bVar = cVar == k5.f191819w ? com.planner5d.library.widget.drawable.h.b.UsedInProject : com.planner5d.library.widget.drawable.h.b.Small;
        }
        boolean z10 = cVar instanceof z;
        return com.planner5d.library.widget.drawable.h.b("MaterialView", bVar, z10 ? Integer.valueOf(this.f258033t) : null).b(getContext(), z10 ? 4 : 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(y yVar, ItemProject itemProject, Object[] objArr, com.planner5d.library.services.bitmaploader.target.a aVar) {
        this.f258029o.u(yVar, itemProject, p.a.diffuse, p.b.normal, this.f258024j / (objArr.length == 4 ? 2 : 1), this.f258023i.c(aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(View view) {
        SwitchCompat switchCompat = this.f258025k;
        switchCompat.setChecked(!switchCompat.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(final y yVar, final ItemProject itemProject, final Object[] objArr, int i10, int i11) {
        synchronized (this.H1) {
            try {
                final b bVar = new b(new a(i11, objArr, i10), this.f258029o.A(), new com.planner5d.library.services.bitmaploader.target.i("Material", this.f258032s));
                this.f258023i.d(this.f258022h[i10]);
                this.f258022h[i10] = bVar;
                com.planner5d.library.services.rx.i.i(new Runnable() { // from class: com.planner5d.library.widget.editor.popup.properties.view.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f258009a.n(yVar, itemProject, objArr, bVar);
                    }
                }).subscribeOn(com.planner5d.library.services.rx.c.f224933c).subscribe((Subscriber<? super Void>) new com.planner5d.library.services.rx.e());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void q() {
        this.f258017c.setSelected(this.f258028n);
        if (this.f258028n) {
            this.f258019e.setBackgroundResource(com.planner5d.library.f.h.H2);
        } else if (this.f258027m) {
            this.f258019e.setBackgroundResource(com.planner5d.library.f.h.I2);
        } else {
            this.f258019e.setBackground(null);
        }
    }

    private void setColor(@l int i10) {
        this.f258019e.setVisibility(0);
        this.f258017c.a(new Object[0], i10, this.f258024j);
        if (this.f258021g != null) {
            this.f258016b.setTextColor(n.b(i10));
            this.f258016b.setText(this.f258021g.d(i10));
            this.f258016b.setVisibility(0);
        }
    }

    private void v(z zVar, ItemProject itemProject, Object[] objArr, int i10) {
        this.f258029o.G(zVar, itemProject).subscribe((Subscriber<? super List<y>>) new c(objArr, itemProject, i10));
    }

    private void x(String str, ItemMaterial itemMaterial, ItemRoom itemRoom) {
        if (this.f258020f) {
            y(null, false);
            this.f258015a.setText(str);
            if (str == null || itemMaterial == null) {
                return;
            }
            if ("floor".equals(itemMaterial.name)) {
                y(this.f258026l, !itemRoom.getFloorHidden());
            } else if ("ceil".equals(itemMaterial.name)) {
                y(this.f258026l, !itemRoom.getCeilingHidden());
            }
        }
    }

    private void y(CompoundButton.OnCheckedChangeListener onCheckedChangeListener, boolean z10) {
        SwitchCompat switchCompat = this.f258025k;
        if (switchCompat != null) {
            switchCompat.setOnCheckedChangeListener(null);
            this.f258025k.setChecked(z10);
            this.f258025k.setVisibility(onCheckedChangeListener == null ? 8 : 0);
            this.f258025k.setOnCheckedChangeListener(onCheckedChangeListener);
        }
    }

    private void z() {
        this.f258023i.d(this.f258022h);
        int i10 = 0;
        while (true) {
            com.planner5d.library.services.bitmaploader.target.a[] aVarArr = this.f258022h;
            if (i10 >= aVarArr.length) {
                return;
            }
            int i11 = 2 << 0;
            aVarArr[i10] = null;
            i10++;
        }
    }

    public j r(boolean z10) {
        this.f258027m = z10;
        q();
        return this;
    }

    public j s() {
        z();
        w(null, null, null);
        this.f258019e.setVisibility(4);
        return this;
    }

    public void setErrorInfoButtonListener(View.OnClickListener onClickListener) {
        this.f258035w = onClickListener;
    }

    public void setOnCheckedChangedListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f258026l = onCheckedChangeListener;
    }

    @Override // android.view.View
    public void setSelected(boolean z10) {
        this.f258028n = z10;
        q();
    }

    public void t(Drawable drawable, View.OnClickListener onClickListener) {
        this.f258030p0 = drawable;
        this.f258034v = onClickListener;
        this.f258018d.setImageDrawable(drawable);
        this.f258018d.setOnClickListener(this.f258034v);
        this.f258018d.setVisibility(0);
    }

    public j u(ItemMaterial itemMaterial, String str, ItemRoom itemRoom) {
        z();
        y yVar = itemMaterial.texture;
        if (yVar != null) {
            w(yVar, null, null);
        } else {
            setColor(itemMaterial.getColorInt());
        }
        x(str, itemMaterial, itemRoom);
        return this;
    }

    public void w(k5.c cVar, ItemProject itemProject, String str) {
        j jVar;
        this.f258019e.setVisibility(0);
        x(str, null, null);
        synchronized (this.H1) {
            try {
                int iIncrementAndGet = this.H1.incrementAndGet();
                if (cVar != null) {
                    Drawable[] drawableArrM = m(cVar);
                    int length = drawableArrM.length;
                    Object[] objArr = new Object[length];
                    System.arraycopy(drawableArrM, 0, objArr, 0, length);
                    this.f258017c.a(drawableArrM, -2039070, this.f258024j);
                    if (cVar instanceof z) {
                        v((z) cVar, itemProject, objArr, iIncrementAndGet);
                        jVar = this;
                    } else {
                        jVar = this;
                        jVar.p((y) cVar, itemProject, objArr, 0, iIncrementAndGet);
                    }
                    jVar.f258016b.setVisibility(8);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
