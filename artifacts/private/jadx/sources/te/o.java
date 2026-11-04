package te;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Guideline;
import com.planner5d.library.widget.c1;

/* JADX INFO: loaded from: classes12.dex */
public final class o implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f380971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Guideline f380972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f380973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f380974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f380975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final SeekBar f380976f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final FrameLayout f380977g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ImageButton f380978h;

    private o(@NonNull View view, @NonNull Guideline guideline, @NonNull View view2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull SeekBar seekBar, @NonNull FrameLayout frameLayout, @NonNull ImageButton imageButton) {
        this.f380971a = view;
        this.f380972b = guideline;
        this.f380973c = view2;
        this.f380974d = imageView;
        this.f380975e = imageView2;
        this.f380976f = seekBar;
        this.f380977g = frameLayout;
        this.f380978h = imageButton;
    }

    @NonNull
    public static o a(@NonNull View view) {
        View viewA;
        int i10 = c1.i.M3;
        Guideline guideline = (Guideline) b4.c.a(view, i10);
        if (guideline != null && (viewA = b4.c.a(view, (i10 = c1.i.f251778b4))) != null) {
            i10 = c1.i.f252013v4;
            ImageView imageView = (ImageView) b4.c.a(view, i10);
            if (imageView != null) {
                i10 = c1.i.f251994t7;
                ImageView imageView2 = (ImageView) b4.c.a(view, i10);
                if (imageView2 != null) {
                    i10 = c1.i.Q7;
                    SeekBar seekBar = (SeekBar) b4.c.a(view, i10);
                    if (seekBar != null) {
                        i10 = c1.i.f251783b9;
                        FrameLayout frameLayout = (FrameLayout) b4.c.a(view, i10);
                        if (frameLayout != null) {
                            i10 = c1.i.f251963q9;
                            ImageButton imageButton = (ImageButton) b4.c.a(view, i10);
                            if (imageButton != null) {
                                return new o(view, guideline, viewA, imageView, imageView2, seekBar, frameLayout, imageButton);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static o b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(c1.l.f252150e2, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f380971a;
    }
}
