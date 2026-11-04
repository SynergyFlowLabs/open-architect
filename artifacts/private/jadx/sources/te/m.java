package te;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.planner5d.library.widget.EditTextWithValidator;
import com.planner5d.library.widget.c1;
import com.planner5d.library.widget.colorpicker.ColorPickerInternalView;
import com.planner5d.library.widget.colorpicker.ColorPickerStandardColors;

/* JADX INFO: loaded from: classes12.dex */
public final class m implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f380957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ColorPickerInternalView f380958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ColorPickerStandardColors f380959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final EditTextWithValidator f380960d;

    private m(@NonNull View view, @NonNull ColorPickerInternalView colorPickerInternalView, @NonNull ColorPickerStandardColors colorPickerStandardColors, @NonNull EditTextWithValidator editTextWithValidator) {
        this.f380957a = view;
        this.f380958b = colorPickerInternalView;
        this.f380959c = colorPickerStandardColors;
        this.f380960d = editTextWithValidator;
    }

    @NonNull
    public static m a(@NonNull View view) {
        int i10 = c1.i.f251800d2;
        ColorPickerInternalView colorPickerInternalView = (ColorPickerInternalView) b4.c.a(view, i10);
        if (colorPickerInternalView != null) {
            i10 = c1.i.f251812e2;
            ColorPickerStandardColors colorPickerStandardColors = (ColorPickerStandardColors) b4.c.a(view, i10);
            if (colorPickerStandardColors != null) {
                i10 = c1.i.f251862i4;
                EditTextWithValidator editTextWithValidator = (EditTextWithValidator) b4.c.a(view, i10);
                if (editTextWithValidator != null) {
                    return new m(view, colorPickerInternalView, colorPickerStandardColors, editTextWithValidator);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static m b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(c1.l.f252142c2, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f380957a;
    }
}
