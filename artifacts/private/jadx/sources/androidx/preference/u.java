package androidx.preference;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.d0;
import androidx.annotation.p0;
import androidx.core.view.u1;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public class u extends RecyclerView.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private final Drawable f73158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f73159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray<View> f73160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f73161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f73162e;

    u(@NonNull View view) {
        super(view);
        SparseArray<View> sparseArray = new SparseArray<>(4);
        this.f73160c = sparseArray;
        TextView textView = (TextView) view.findViewById(R.id.title);
        sparseArray.put(R.id.title, textView);
        sparseArray.put(R.id.summary, view.findViewById(R.id.summary));
        sparseArray.put(R.id.icon, view.findViewById(R.id.icon));
        int i10 = v.f.f73210a;
        sparseArray.put(i10, view.findViewById(i10));
        sparseArray.put(16908350, view.findViewById(16908350));
        this.f73158a = view.getBackground();
        if (textView != null) {
            this.f73159b = textView.getTextColors();
        }
    }

    @NonNull
    @b1({b1.a.TESTS})
    public static u g(@NonNull View view) {
        return new u(view);
    }

    public View h(@d0 int i10) {
        View view = this.f73160c.get(i10);
        if (view != null) {
            return view;
        }
        View viewFindViewById = this.itemView.findViewById(i10);
        if (viewFindViewById != null) {
            this.f73160c.put(i10, viewFindViewById);
        }
        return viewFindViewById;
    }

    public boolean i() {
        return this.f73161d;
    }

    public boolean j() {
        return this.f73162e;
    }

    void k() {
        Drawable background = this.itemView.getBackground();
        Drawable drawable = this.f73158a;
        if (background != drawable) {
            u1.O1(this.itemView, drawable);
        }
        TextView textView = (TextView) h(R.id.title);
        if (textView == null || this.f73159b == null || textView.getTextColors().equals(this.f73159b)) {
            return;
        }
        textView.setTextColor(this.f73159b);
    }

    public void l(boolean z10) {
        this.f73161d = z10;
    }

    public void m(boolean z10) {
        this.f73162e = z10;
    }
}
