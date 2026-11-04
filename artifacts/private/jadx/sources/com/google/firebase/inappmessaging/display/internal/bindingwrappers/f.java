package com.google.firebase.inappmessaging.display.internal.bindingwrappers;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import com.google.firebase.inappmessaging.display.internal.k;
import com.google.firebase.inappmessaging.display.internal.layout.FiamFrameLayout;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@u8.b
public class f extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FiamFrameLayout f122280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ViewGroup f122281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ImageView f122282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Button f122283g;

    @ij.a
    @b1({b1.a.LIBRARY_GROUP})
    public f(k kVar, LayoutInflater layoutInflater, com.google.firebase.inappmessaging.model.i iVar) {
        super(kVar, layoutInflater, iVar);
    }

    @Override // com.google.firebase.inappmessaging.display.internal.bindingwrappers.c
    @NonNull
    public View c() {
        return this.f122281e;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.bindingwrappers.c
    @NonNull
    public ImageView e() {
        return this.f122282f;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.bindingwrappers.c
    @NonNull
    public ViewGroup f() {
        return this.f122280d;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.bindingwrappers.c
    @p0
    public ViewTreeObserver.OnGlobalLayoutListener g(Map<com.google.firebase.inappmessaging.model.a, View.OnClickListener> map, View.OnClickListener onClickListener) {
        View viewInflate = this.f122264c.inflate(com.google.firebase.inappmessaging.display.g.e.f122224e, (ViewGroup) null);
        this.f122280d = (FiamFrameLayout) viewInflate.findViewById(com.google.firebase.inappmessaging.display.g.d.f122212m);
        this.f122281e = (ViewGroup) viewInflate.findViewById(com.google.firebase.inappmessaging.display.g.d.f122211l);
        this.f122282f = (ImageView) viewInflate.findViewById(com.google.firebase.inappmessaging.display.g.d.f122213n);
        this.f122283g = (Button) viewInflate.findViewById(com.google.firebase.inappmessaging.display.g.d.f122210k);
        this.f122282f.setMaxHeight(this.f122263b.t());
        this.f122282f.setMaxWidth(this.f122263b.u());
        if (this.f122262a.l().equals(MessageType.IMAGE_ONLY)) {
            com.google.firebase.inappmessaging.model.h hVar = (com.google.firebase.inappmessaging.model.h) this.f122262a;
            this.f122282f.setVisibility((hVar.i() == null || TextUtils.isEmpty(hVar.i().c())) ? 8 : 0);
            this.f122282f.setOnClickListener(map.get(hVar.a()));
        }
        this.f122280d.setDismissListener(onClickListener);
        this.f122283g.setOnClickListener(onClickListener);
        return null;
    }

    @NonNull
    public View l() {
        return this.f122283g;
    }
}
