package te;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.planner5d.library.widget.c1;

/* JADX INFO: loaded from: classes12.dex */
public final class b0 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f380869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f380870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f380871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f380872d;

    private b0(@NonNull View view, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3) {
        this.f380869a = view;
        this.f380870b = imageView;
        this.f380871c = imageView2;
        this.f380872d = imageView3;
    }

    @NonNull
    public static b0 a(@NonNull View view) {
        int i10 = c1.i.f252026w6;
        ImageView imageView = (ImageView) b4.c.a(view, i10);
        if (imageView != null) {
            i10 = c1.i.f252037x6;
            ImageView imageView2 = (ImageView) b4.c.a(view, i10);
            if (imageView2 != null) {
                i10 = c1.i.f252048y6;
                ImageView imageView3 = (ImageView) b4.c.a(view, i10);
                if (imageView3 != null) {
                    return new b0(view, imageView, imageView2, imageView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static b0 b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(c1.l.f252210t2, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f380869a;
    }
}
