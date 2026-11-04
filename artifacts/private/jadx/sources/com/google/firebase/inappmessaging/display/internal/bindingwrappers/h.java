package com.google.firebase.inappmessaging.display.internal.bindingwrappers;

import android.graphics.Color;
import android.text.TextUtils;
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
import com.google.firebase.inappmessaging.display.internal.layout.FiamRelativeLayout;
import com.google.firebase.inappmessaging.model.MessageType;
import com.google.firebase.inappmessaging.model.j;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@u8.b
public class h extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FiamRelativeLayout f122287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ViewGroup f122288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ScrollView f122289f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Button f122290g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f122291h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ImageView f122292i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private TextView f122293j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private TextView f122294k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private j f122295l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f122296m;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            h.this.f122292i.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
    }

    @ij.a
    @b1({b1.a.LIBRARY_GROUP})
    public h(k kVar, LayoutInflater layoutInflater, com.google.firebase.inappmessaging.model.i iVar) {
        super(kVar, layoutInflater, iVar);
        this.f122296m = new a();
    }

    private void q(Map<com.google.firebase.inappmessaging.model.a, View.OnClickListener> map) {
        com.google.firebase.inappmessaging.model.a aVarA = this.f122295l.a();
        if (aVarA == null || aVarA.c() == null || TextUtils.isEmpty(aVarA.c().c().c())) {
            this.f122290g.setVisibility(8);
            return;
        }
        c.k(this.f122290g, aVarA.c());
        h(this.f122290g, map.get(this.f122295l.a()));
        this.f122290g.setVisibility(0);
    }

    private void r(View.OnClickListener onClickListener) {
        this.f122291h.setOnClickListener(onClickListener);
        this.f122287d.setDismissListener(onClickListener);
    }

    private void s(k kVar) {
        this.f122292i.setMaxHeight(kVar.t());
        this.f122292i.setMaxWidth(kVar.u());
    }

    private void u(j jVar) {
        if (jVar.i() == null || TextUtils.isEmpty(jVar.i().c())) {
            this.f122292i.setVisibility(8);
        } else {
            this.f122292i.setVisibility(0);
        }
        if (jVar.m() != null) {
            if (TextUtils.isEmpty(jVar.m().c())) {
                this.f122294k.setVisibility(8);
            } else {
                this.f122294k.setVisibility(0);
                this.f122294k.setText(jVar.m().c());
            }
            if (!TextUtils.isEmpty(jVar.m().b())) {
                this.f122294k.setTextColor(Color.parseColor(jVar.m().b()));
            }
        }
        if (jVar.d() == null || TextUtils.isEmpty(jVar.d().c())) {
            this.f122289f.setVisibility(8);
            this.f122293j.setVisibility(8);
        } else {
            this.f122289f.setVisibility(0);
            this.f122293j.setVisibility(0);
            this.f122293j.setTextColor(Color.parseColor(jVar.d().b()));
            this.f122293j.setText(jVar.d().c());
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
        return this.f122288e;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.bindingwrappers.c
    @NonNull
    public ImageView e() {
        return this.f122292i;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.bindingwrappers.c
    @NonNull
    public ViewGroup f() {
        return this.f122287d;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.bindingwrappers.c
    @NonNull
    public ViewTreeObserver.OnGlobalLayoutListener g(Map<com.google.firebase.inappmessaging.model.a, View.OnClickListener> map, View.OnClickListener onClickListener) {
        View viewInflate = this.f122264c.inflate(com.google.firebase.inappmessaging.display.g.e.f122225f, (ViewGroup) null);
        this.f122289f = (ScrollView) viewInflate.findViewById(com.google.firebase.inappmessaging.display.g.d.f122206g);
        this.f122290g = (Button) viewInflate.findViewById(com.google.firebase.inappmessaging.display.g.d.f122207h);
        this.f122291h = viewInflate.findViewById(com.google.firebase.inappmessaging.display.g.d.f122210k);
        this.f122292i = (ImageView) viewInflate.findViewById(com.google.firebase.inappmessaging.display.g.d.f122213n);
        this.f122293j = (TextView) viewInflate.findViewById(com.google.firebase.inappmessaging.display.g.d.f122214o);
        this.f122294k = (TextView) viewInflate.findViewById(com.google.firebase.inappmessaging.display.g.d.f122215p);
        this.f122287d = (FiamRelativeLayout) viewInflate.findViewById(com.google.firebase.inappmessaging.display.g.d.f122217r);
        this.f122288e = (ViewGroup) viewInflate.findViewById(com.google.firebase.inappmessaging.display.g.d.f122216q);
        if (this.f122262a.l().equals(MessageType.MODAL)) {
            j jVar = (j) this.f122262a;
            this.f122295l = jVar;
            u(jVar);
            q(map);
            s(this.f122263b);
            r(onClickListener);
            j(this.f122288e, this.f122295l.c());
        }
        return this.f122296m;
    }

    @NonNull
    public Button m() {
        return this.f122290g;
    }

    @NonNull
    public View n() {
        return this.f122291h;
    }

    @NonNull
    public View o() {
        return this.f122289f;
    }

    @NonNull
    public View p() {
        return this.f122294k;
    }

    @l1
    public void t(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f122296m = onGlobalLayoutListener;
    }
}
