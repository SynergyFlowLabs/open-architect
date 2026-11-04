package com.google.firebase.inappmessaging.display.internal.bindingwrappers;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import com.google.firebase.inappmessaging.display.internal.ResizableImageView;
import com.google.firebase.inappmessaging.display.internal.k;
import com.google.firebase.inappmessaging.display.internal.layout.FiamFrameLayout;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@u8.b
public class a extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FiamFrameLayout f122253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ViewGroup f122254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextView f122255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ResizableImageView f122256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private TextView f122257h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private View.OnClickListener f122258i;

    @ij.a
    @b1({b1.a.LIBRARY_GROUP})
    public a(k kVar, LayoutInflater layoutInflater, com.google.firebase.inappmessaging.model.i iVar) {
        super(kVar, layoutInflater, iVar);
    }

    private void l(View.OnClickListener onClickListener) {
        this.f122254e.setOnClickListener(onClickListener);
    }

    private void m(k kVar) {
        int iMin = Math.min(kVar.y().intValue(), kVar.x().intValue());
        ViewGroup.LayoutParams layoutParams = this.f122253d.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        layoutParams.width = iMin;
        this.f122253d.setLayoutParams(layoutParams);
        this.f122256g.setMaxHeight(kVar.t());
        this.f122256g.setMaxWidth(kVar.u());
    }

    private void n(@NonNull com.google.firebase.inappmessaging.model.c cVar) {
        if (!TextUtils.isEmpty(cVar.c())) {
            j(this.f122254e, cVar.c());
        }
        this.f122256g.setVisibility((cVar.i() == null || TextUtils.isEmpty(cVar.i().c())) ? 8 : 0);
        if (cVar.m() != null) {
            if (!TextUtils.isEmpty(cVar.m().c())) {
                this.f122257h.setText(cVar.m().c());
            }
            if (!TextUtils.isEmpty(cVar.m().b())) {
                this.f122257h.setTextColor(Color.parseColor(cVar.m().b()));
            }
        }
        if (cVar.d() != null) {
            if (!TextUtils.isEmpty(cVar.d().c())) {
                this.f122255f.setText(cVar.d().c());
            }
            if (TextUtils.isEmpty(cVar.d().b())) {
                return;
            }
            this.f122255f.setTextColor(Color.parseColor(cVar.d().b()));
        }
    }

    private void o(View.OnClickListener onClickListener) {
        this.f122258i = onClickListener;
        this.f122253d.setDismissListener(onClickListener);
    }

    @Override // com.google.firebase.inappmessaging.display.internal.bindingwrappers.c
    public boolean a() {
        return true;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.bindingwrappers.c
    @NonNull
    public k b() {
        return this.f122263b;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.bindingwrappers.c
    @NonNull
    public View c() {
        return this.f122254e;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.bindingwrappers.c
    @p0
    public View.OnClickListener d() {
        return this.f122258i;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.bindingwrappers.c
    @NonNull
    public ImageView e() {
        return this.f122256g;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.bindingwrappers.c
    @NonNull
    public ViewGroup f() {
        return this.f122253d;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.bindingwrappers.c
    @p0
    public ViewTreeObserver.OnGlobalLayoutListener g(Map<com.google.firebase.inappmessaging.model.a, View.OnClickListener> map, View.OnClickListener onClickListener) {
        int i10 = 1 << 0;
        View viewInflate = this.f122264c.inflate(com.google.firebase.inappmessaging.display.g.e.f122220a, (ViewGroup) null);
        this.f122253d = (FiamFrameLayout) viewInflate.findViewById(com.google.firebase.inappmessaging.display.g.d.f122204e);
        this.f122254e = (ViewGroup) viewInflate.findViewById(com.google.firebase.inappmessaging.display.g.d.f122202c);
        this.f122255f = (TextView) viewInflate.findViewById(com.google.firebase.inappmessaging.display.g.d.f122201b);
        this.f122256g = (ResizableImageView) viewInflate.findViewById(com.google.firebase.inappmessaging.display.g.d.f122203d);
        this.f122257h = (TextView) viewInflate.findViewById(com.google.firebase.inappmessaging.display.g.d.f122205f);
        if (this.f122262a.l().equals(MessageType.BANNER)) {
            com.google.firebase.inappmessaging.model.c cVar = (com.google.firebase.inappmessaging.model.c) this.f122262a;
            n(cVar);
            m(this.f122263b);
            o(onClickListener);
            l(map.get(cVar.a()));
        }
        return null;
    }
}
