package te;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.SwitchCompat;
import com.planner5d.library.widget.c1;

/* JADX INFO: loaded from: classes12.dex */
public final class m0 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f380961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final SwitchCompat f380962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f380963c;

    private m0(@NonNull View view, @NonNull SwitchCompat switchCompat, @NonNull TextView textView) {
        this.f380961a = view;
        this.f380962b = switchCompat;
        this.f380963c = textView;
    }

    @NonNull
    public static m0 a(@NonNull View view) {
        int i10 = c1.i.Z9;
        SwitchCompat switchCompat = (SwitchCompat) b4.c.a(view, i10);
        if (switchCompat != null) {
            i10 = c1.i.f251772aa;
            TextView textView = (TextView) b4.c.a(view, i10);
            if (textView != null) {
                return new m0(view, switchCompat, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static m0 b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(c1.l.H2, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f380961a;
    }
}
