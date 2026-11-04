package wa;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f385946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ShapeableImageView f385947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f385948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final EditText f385949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final RecyclerView f385950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ScrollView f385951f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final LinearLayout f385952g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f385953h;

    private a(@NonNull ConstraintLayout constraintLayout, @NonNull ShapeableImageView shapeableImageView, @NonNull ImageView imageView, @NonNull EditText editText, @NonNull RecyclerView recyclerView, @NonNull ScrollView scrollView, @NonNull LinearLayout linearLayout, @NonNull TextView textView) {
        this.f385946a = constraintLayout;
        this.f385947b = shapeableImageView;
        this.f385948c = imageView;
        this.f385949d = editText;
        this.f385950e = recyclerView;
        this.f385951f = scrollView;
        this.f385952g = linearLayout;
        this.f385953h = textView;
    }

    @NonNull
    public static a a(@NonNull View view) {
        int i10 = sa.b.i.N1;
        ShapeableImageView shapeableImageView = (ShapeableImageView) b4.c.a(view, i10);
        if (shapeableImageView != null) {
            i10 = sa.b.i.f369447x2;
            ImageView imageView = (ImageView) b4.c.a(view, i10);
            if (imageView != null) {
                i10 = sa.b.i.f369438w6;
                EditText editText = (EditText) b4.c.a(view, i10);
                if (editText != null) {
                    i10 = sa.b.i.f369451x6;
                    RecyclerView recyclerView = (RecyclerView) b4.c.a(view, i10);
                    if (recyclerView != null) {
                        i10 = sa.b.i.f369429va;
                        ScrollView scrollView = (ScrollView) b4.c.a(view, i10);
                        if (scrollView != null) {
                            i10 = sa.b.i.f369442wa;
                            LinearLayout linearLayout = (LinearLayout) b4.c.a(view, i10);
                            if (linearLayout != null) {
                                i10 = sa.b.i.f369189db;
                                TextView textView = (TextView) b4.c.a(view, i10);
                                if (textView != null) {
                                    return new a((ConstraintLayout) view, shapeableImageView, imageView, editText, recyclerView, scrollView, linearLayout, textView);
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
    public static a c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static a d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(sa.b.l.f369596l0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f385946a;
    }
}
