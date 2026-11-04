package com.google.firebase.inappmessaging.display.internal.bindingwrappers;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.l1;
import com.google.firebase.inappmessaging.display.internal.k;
import com.google.firebase.inappmessaging.display.internal.layout.FiamCardView;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@u8.b
public class d extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FiamCardView f122265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.firebase.inappmessaging.display.internal.layout.b f122266e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ScrollView f122267f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Button f122268g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Button f122269h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ImageView f122270i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private TextView f122271j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private TextView f122272k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.google.firebase.inappmessaging.model.f f122273l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View.OnClickListener f122274m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f122275n;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            d.this.f122270i.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
    }

    @ij.a
    @b1({b1.a.LIBRARY_GROUP})
    public d(k kVar, LayoutInflater layoutInflater, com.google.firebase.inappmessaging.model.i iVar) {
        super(kVar, layoutInflater, iVar);
        this.f122275n = new a();
    }

    private void q(Map<com.google.firebase.inappmessaging.model.a, View.OnClickListener> map) {
        com.google.firebase.inappmessaging.model.a aVarQ = this.f122273l.q();
        com.google.firebase.inappmessaging.model.a aVarR = this.f122273l.r();
        c.k(this.f122268g, aVarQ.c());
        h(this.f122268g, map.get(aVarQ));
        this.f122268g.setVisibility(0);
        if (aVarR == null || aVarR.c() == null) {
            this.f122269h.setVisibility(8);
            return;
        }
        c.k(this.f122269h, aVarR.c());
        h(this.f122269h, map.get(aVarR));
        this.f122269h.setVisibility(0);
    }

    private void r(View.OnClickListener onClickListener) {
        this.f122274m = onClickListener;
        this.f122265d.setDismissListener(onClickListener);
    }

    private void s(com.google.firebase.inappmessaging.model.f fVar) {
        if (fVar.p() == null && fVar.o() == null) {
            this.f122270i.setVisibility(8);
        } else {
            this.f122270i.setVisibility(0);
        }
    }

    private void t(k kVar) {
        this.f122270i.setMaxHeight(kVar.t());
        this.f122270i.setMaxWidth(kVar.u());
    }

    private void v(com.google.firebase.inappmessaging.model.f fVar) {
        this.f122272k.setText(fVar.m().c());
        this.f122272k.setTextColor(Color.parseColor(fVar.m().b()));
        if (fVar.d() == null || fVar.d().c() == null) {
            this.f122267f.setVisibility(8);
            this.f122271j.setVisibility(8);
        } else {
            this.f122267f.setVisibility(0);
            this.f122271j.setVisibility(0);
            this.f122271j.setText(fVar.d().c());
            this.f122271j.setTextColor(Color.parseColor(fVar.d().b()));
        }
    }

    @Override // com.google.firebase.inappmessaging.display.internal.bindingwrappers.c
    @NonNull
    public k b() {
        return this.f122263b;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.bindingwrappers.c
    @NonNull
    public View c() {
        return this.f122266e;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.bindingwrappers.c
    @NonNull
    public View.OnClickListener d() {
        return this.f122274m;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.bindingwrappers.c
    @NonNull
    public ImageView e() {
        return this.f122270i;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.bindingwrappers.c
    @NonNull
    public ViewGroup f() {
        return this.f122265d;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.bindingwrappers.c
    @NonNull
    public ViewTreeObserver.OnGlobalLayoutListener g(Map<com.google.firebase.inappmessaging.model.a, View.OnClickListener> map, View.OnClickListener onClickListener) {
        View viewInflate = this.f122264c.inflate(com.google.firebase.inappmessaging.display.g.e.f122221b, (ViewGroup) null);
        this.f122267f = (ScrollView) viewInflate.findViewById(com.google.firebase.inappmessaging.display.g.d.f122206g);
        this.f122268g = (Button) viewInflate.findViewById(com.google.firebase.inappmessaging.display.g.d.f122218s);
        this.f122269h = (Button) viewInflate.findViewById(com.google.firebase.inappmessaging.display.g.d.f122219t);
        this.f122270i = (ImageView) viewInflate.findViewById(com.google.firebase.inappmessaging.display.g.d.f122213n);
        this.f122271j = (TextView) viewInflate.findViewById(com.google.firebase.inappmessaging.display.g.d.f122214o);
        this.f122272k = (TextView) viewInflate.findViewById(com.google.firebase.inappmessaging.display.g.d.f122215p);
        this.f122265d = (FiamCardView) viewInflate.findViewById(com.google.firebase.inappmessaging.display.g.d.f122209j);
        this.f122266e = (com.google.firebase.inappmessaging.display.internal.layout.b) viewInflate.findViewById(com.google.firebase.inappmessaging.display.g.d.f122208i);
        if (this.f122262a.l().equals(MessageType.CARD)) {
            com.google.firebase.inappmessaging.model.f fVar = (com.google.firebase.inappmessaging.model.f) this.f122262a;
            this.f122273l = fVar;
            v(fVar);
            s(this.f122273l);
            q(map);
            t(this.f122263b);
            r(onClickListener);
            j(this.f122266e, this.f122273l.c());
        }
        return this.f122275n;
    }

    @NonNull
    public Button m() {
        return this.f122268g;
    }

    @NonNull
    public View n() {
        return this.f122267f;
    }

    @NonNull
    public Button o() {
        return this.f122269h;
    }

    @NonNull
    public View p() {
        return this.f122272k;
    }

    @l1
    public void u(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f122275n = onGlobalLayoutListener;
    }
}
