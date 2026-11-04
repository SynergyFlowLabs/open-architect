package te;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.planner5d.library.widget.c1;

/* JADX INFO: loaded from: classes12.dex */
public final class d0 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f380889a;

    private d0(@NonNull View view) {
        this.f380889a = view;
    }

    @NonNull
    public static d0 a(@NonNull View view) {
        if (view != null) {
            return new d0(view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static d0 b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(c1.l.f252218v2, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f380889a;
    }
}
