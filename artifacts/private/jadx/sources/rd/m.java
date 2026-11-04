package rd;

import android.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final RelativeLayout f366633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f366634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f366635c;

    private m(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull AppCompatTextView appCompatTextView) {
        this.f366633a = relativeLayout;
        this.f366634b = imageView;
        this.f366635c = appCompatTextView;
    }

    @NonNull
    public static m a(@NonNull View view) {
        int i10 = R.id.icon1;
        ImageView imageView = (ImageView) b4.c.a(view, R.id.icon1);
        if (imageView != null) {
            i10 = R.id.text1;
            AppCompatTextView appCompatTextView = (AppCompatTextView) b4.c.a(view, R.id.text1);
            if (appCompatTextView != null) {
                return new m((RelativeLayout) view, imageView, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static m c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static m d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(qd.b.l.f352676m1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f366633a;
    }
}
