package te;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.planner5d.library.widget.c1;

/* JADX INFO: loaded from: classes12.dex */
public final class p implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f380983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f380984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f380985c;

    private p(@NonNull View view, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.f380983a = view;
        this.f380984b = imageView;
        this.f380985c = textView;
    }

    @NonNull
    public static p a(@NonNull View view) {
        int i10 = c1.i.f251978s2;
        ImageView imageView = (ImageView) b4.c.a(view, i10);
        if (imageView != null) {
            i10 = c1.i.f252015v6;
            TextView textView = (TextView) b4.c.a(view, i10);
            if (textView != null) {
                return new p(view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static p b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(c1.l.f252154f2, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f380983a;
    }
}
