package te;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.planner5d.library.widget.c1;
import com.planner5d.library.widget.preloader.PreloaderBarView;

/* JADX INFO: loaded from: classes12.dex */
public final class a0 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f380863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final PreloaderBarView f380864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f380865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f380866d;

    private a0(@NonNull View view, @NonNull PreloaderBarView preloaderBarView, @NonNull FrameLayout frameLayout, @NonNull TextView textView) {
        this.f380863a = view;
        this.f380864b = preloaderBarView;
        this.f380865c = frameLayout;
        this.f380866d = textView;
    }

    @NonNull
    public static a0 a(@NonNull View view) {
        int i10 = c1.i.F6;
        PreloaderBarView preloaderBarView = (PreloaderBarView) b4.c.a(view, i10);
        if (preloaderBarView != null) {
            i10 = c1.i.G6;
            FrameLayout frameLayout = (FrameLayout) b4.c.a(view, i10);
            if (frameLayout != null) {
                i10 = c1.i.H6;
                TextView textView = (TextView) b4.c.a(view, i10);
                if (textView != null) {
                    return new a0(view, preloaderBarView, frameLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static a0 b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(c1.l.f252206s2, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f380863a;
    }
}
