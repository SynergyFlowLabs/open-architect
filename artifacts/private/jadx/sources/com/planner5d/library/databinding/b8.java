package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.planner5d.library.widget.NumberInputView;
import com.planner5d.library.widget.SliderViewV2;
import com.planner5d.library.widget.editor.editor3d.compatibility.GLTextureView;

/* JADX INFO: loaded from: classes4.dex */
public final class b8 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f158766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final View f158767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final GLTextureView f158768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f158769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f158770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final SliderViewV2 f158771f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final NumberInputView f158772g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ImageView f158773h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final Button f158774i;

    private b8(@NonNull View view, @NonNull View view2, @NonNull GLTextureView gLTextureView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull SliderViewV2 sliderViewV2, @NonNull NumberInputView numberInputView, @NonNull ImageView imageView3, @NonNull Button button) {
        this.f158766a = view;
        this.f158767b = view2;
        this.f158768c = gLTextureView;
        this.f158769d = imageView;
        this.f158770e = imageView2;
        this.f158771f = sliderViewV2;
        this.f158772g = numberInputView;
        this.f158773h = imageView3;
        this.f158774i = button;
    }

    @NonNull
    public static b8 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.Nu;
        View viewA = b4.c.a(view, i10);
        if (viewA != null) {
            i10 = com.planner5d.library.f.j.Ou;
            GLTextureView gLTextureView = (GLTextureView) b4.c.a(view, i10);
            if (gLTextureView != null) {
                i10 = com.planner5d.library.f.j.Tu;
                ImageView imageView = (ImageView) b4.c.a(view, i10);
                if (imageView != null) {
                    i10 = com.planner5d.library.f.j.Uu;
                    ImageView imageView2 = (ImageView) b4.c.a(view, i10);
                    if (imageView2 != null) {
                        i10 = com.planner5d.library.f.j.Vu;
                        SliderViewV2 sliderViewV2 = (SliderViewV2) b4.c.a(view, i10);
                        if (sliderViewV2 != null) {
                            i10 = com.planner5d.library.f.j.Wu;
                            NumberInputView numberInputView = (NumberInputView) b4.c.a(view, i10);
                            if (numberInputView != null) {
                                i10 = com.planner5d.library.f.j.Xu;
                                ImageView imageView3 = (ImageView) b4.c.a(view, i10);
                                if (imageView3 != null) {
                                    i10 = com.planner5d.library.f.j.Yu;
                                    Button button = (Button) b4.c.a(view, i10);
                                    if (button != null) {
                                        return new b8(view, viewA, gLTextureView, imageView, imageView2, sliderViewV2, numberInputView, imageView3, button);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static b8 b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(com.planner5d.library.f.m.f168779n9, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f158766a;
    }
}
