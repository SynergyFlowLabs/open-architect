package te;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
import com.planner5d.library.widget.c1;

/* JADX INFO: loaded from: classes12.dex */
public final class n0 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f380967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageButton f380968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageButton f380969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageButton f380970d;

    private n0(@NonNull View view, @NonNull ImageButton imageButton, @NonNull ImageButton imageButton2, @NonNull ImageButton imageButton3) {
        this.f380967a = view;
        this.f380968b = imageButton;
        this.f380969c = imageButton2;
        this.f380970d = imageButton3;
    }

    @NonNull
    public static n0 a(@NonNull View view) {
        int i10 = c1.i.f251909m3;
        ImageButton imageButton = (ImageButton) b4.c.a(view, i10);
        if (imageButton != null) {
            i10 = c1.i.f251791c5;
            ImageButton imageButton2 = (ImageButton) b4.c.a(view, i10);
            if (imageButton2 != null) {
                i10 = c1.i.f252039x8;
                ImageButton imageButton3 = (ImageButton) b4.c.a(view, i10);
                if (imageButton3 != null) {
                    return new n0(view, imageButton, imageButton2, imageButton3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static n0 b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(c1.l.I2, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f380967a;
    }
}
