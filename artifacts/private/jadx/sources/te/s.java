package te;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.planner5d.library.widget.c1;

/* JADX INFO: loaded from: classes12.dex */
public final class s implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f380992a;

    private s(@NonNull View view) {
        this.f380992a = view;
    }

    @NonNull
    public static s a(@NonNull View view) {
        if (view != null) {
            return new s(view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static s b(@NonNull LayoutInflater layoutInflater) {
        return c(layoutInflater, null, false);
    }

    @NonNull
    public static s c(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(c1.l.f252170j2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f380992a;
    }
}
