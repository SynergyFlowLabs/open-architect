package te;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.planner5d.library.widget.c1;

/* JADX INFO: loaded from: classes12.dex */
public final class l implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f380951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final MaterialCheckBox f380952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f380953c;

    private l(@NonNull View view, @NonNull MaterialCheckBox materialCheckBox, @NonNull TextView textView) {
        this.f380951a = view;
        this.f380952b = materialCheckBox;
        this.f380953c = textView;
    }

    @NonNull
    public static l a(@NonNull View view) {
        int i10 = c1.i.R1;
        MaterialCheckBox materialCheckBox = (MaterialCheckBox) b4.c.a(view, i10);
        if (materialCheckBox != null) {
            i10 = c1.i.S1;
            TextView textView = (TextView) b4.c.a(view, i10);
            if (textView != null) {
                return new l(view, materialCheckBox, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static l b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(c1.l.f252138b2, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f380951a;
    }
}
