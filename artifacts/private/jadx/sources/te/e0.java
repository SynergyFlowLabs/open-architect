package te;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.planner5d.library.widget.c1;
import com.planner5d.library.widget.preloader.PreloaderBarView;

/* JADX INFO: loaded from: classes12.dex */
public final class e0 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f380898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final PreloaderBarView f380899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f380900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f380901d;

    private e0(@NonNull View view, @NonNull PreloaderBarView preloaderBarView, @NonNull View view2, @NonNull TextView textView) {
        this.f380898a = view;
        this.f380899b = preloaderBarView;
        this.f380900c = view2;
        this.f380901d = textView;
    }

    @NonNull
    public static e0 a(@NonNull View view) {
        View viewA;
        int i10 = c1.i.F6;
        PreloaderBarView preloaderBarView = (PreloaderBarView) b4.c.a(view, i10);
        if (preloaderBarView != null && (viewA = b4.c.a(view, (i10 = c1.i.G6))) != null) {
            i10 = c1.i.H6;
            TextView textView = (TextView) b4.c.a(view, i10);
            if (textView != null) {
                return new e0(view, preloaderBarView, viewA, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static e0 b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(c1.l.f252222w2, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f380898a;
    }
}
