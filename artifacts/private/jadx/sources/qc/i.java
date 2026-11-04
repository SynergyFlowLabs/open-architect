package qc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final RelativeLayout f350346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final CheckBox f350347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f350348c;

    private i(@NonNull RelativeLayout relativeLayout, @NonNull CheckBox checkBox, @NonNull ImageView imageView) {
        this.f350346a = relativeLayout;
        this.f350347b = checkBox;
        this.f350348c = imageView;
    }

    @NonNull
    public static i a(@NonNull View view) {
        int i10 = pc.b.i.H2;
        CheckBox checkBox = (CheckBox) b4.c.a(view, i10);
        if (checkBox != null) {
            i10 = pc.b.i.f343315o5;
            ImageView imageView = (ImageView) b4.c.a(view, i10);
            if (imageView != null) {
                return new i((RelativeLayout) view, checkBox, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static i c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static i d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(pc.b.l.f343618l3, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f350346a;
    }
}
