package qc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import com.planner5d.library.widget.EditTextWithValidator;
import com.planner5d.library.widget.editor.projectsettings.ProjectSettingCheckboxView;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f350304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ProjectSettingCheckboxView f350305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Button f350306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final EditTextWithValidator f350307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final Spinner f350308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final EditTextWithValidator f350309f;

    private b(@NonNull View view, @NonNull ProjectSettingCheckboxView projectSettingCheckboxView, @NonNull Button button, @NonNull EditTextWithValidator editTextWithValidator, @NonNull Spinner spinner, @NonNull EditTextWithValidator editTextWithValidator2) {
        this.f350304a = view;
        this.f350305b = projectSettingCheckboxView;
        this.f350306c = button;
        this.f350307d = editTextWithValidator;
        this.f350308e = spinner;
        this.f350309f = editTextWithValidator2;
    }

    @NonNull
    public static b a(@NonNull View view) {
        int i10 = pc.b.i.f343266l1;
        ProjectSettingCheckboxView projectSettingCheckboxView = (ProjectSettingCheckboxView) b4.c.a(view, i10);
        if (projectSettingCheckboxView != null) {
            i10 = pc.b.i.f343162e2;
            Button button = (Button) b4.c.a(view, i10);
            if (button != null) {
                i10 = pc.b.i.B3;
                EditTextWithValidator editTextWithValidator = (EditTextWithValidator) b4.c.a(view, i10);
                if (editTextWithValidator != null) {
                    i10 = pc.b.i.f343104a4;
                    Spinner spinner = (Spinner) b4.c.a(view, i10);
                    if (spinner != null) {
                        i10 = pc.b.i.f343269l4;
                        EditTextWithValidator editTextWithValidator2 = (EditTextWithValidator) b4.c.a(view, i10);
                        if (editTextWithValidator2 != null) {
                            return new b(view, projectSettingCheckboxView, button, editTextWithValidator, spinner, editTextWithValidator2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static b b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(pc.b.l.X, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f350304a;
    }
}
