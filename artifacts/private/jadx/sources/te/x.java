package te;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.planner5d.library.widget.c1;

/* JADX INFO: loaded from: classes12.dex */
public final class x implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f381011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f381012b;

    private x(@NonNull View view, @NonNull TextView textView) {
        this.f381011a = view;
        this.f381012b = textView;
    }

    @NonNull
    public static x a(@NonNull View view) {
        int i10 = c1.i.f251985s9;
        TextView textView = (TextView) b4.c.a(view, i10);
        if (textView != null) {
            return new x(view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static x b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(c1.l.f252190o2, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f381011a;
    }
}
