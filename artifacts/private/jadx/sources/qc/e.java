package qc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.textfield.TextInputLayout;
import com.planner5d.library.widget.TextInputEditTextCompat;
import com.planner5d.library.widget.editor.projectsettings.ProjectSettingCheckboxView;
import com.planner5d.library.widget.preloader.PreloaderSimpleV2View;
import com.planner5d.library.widget.textview.TextViewFormField;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final CoordinatorLayout f350327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ProjectSettingCheckboxView f350328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f350329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextInputEditTextCompat f350330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f350331e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final PreloaderSimpleV2View f350332f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextInputEditTextCompat f350333g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f350334h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final NestedScrollView f350335i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextViewFormField f350336j;

    private e(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ProjectSettingCheckboxView projectSettingCheckboxView, @NonNull TextView textView, @NonNull TextInputEditTextCompat textInputEditTextCompat, @NonNull TextInputLayout textInputLayout, @NonNull PreloaderSimpleV2View preloaderSimpleV2View, @NonNull TextInputEditTextCompat textInputEditTextCompat2, @NonNull TextInputLayout textInputLayout2, @NonNull NestedScrollView nestedScrollView, @NonNull TextViewFormField textViewFormField) {
        this.f350327a = coordinatorLayout;
        this.f350328b = projectSettingCheckboxView;
        this.f350329c = textView;
        this.f350330d = textInputEditTextCompat;
        this.f350331e = textInputLayout;
        this.f350332f = preloaderSimpleV2View;
        this.f350333g = textInputEditTextCompat2;
        this.f350334h = textInputLayout2;
        this.f350335i = nestedScrollView;
        this.f350336j = textViewFormField;
    }

    @NonNull
    public static e a(@NonNull View view) {
        int i10 = pc.b.i.Fb;
        ProjectSettingCheckboxView projectSettingCheckboxView = (ProjectSettingCheckboxView) b4.c.a(view, i10);
        if (projectSettingCheckboxView != null) {
            i10 = pc.b.i.Gb;
            TextView textView = (TextView) b4.c.a(view, i10);
            if (textView != null) {
                i10 = pc.b.i.Hb;
                TextInputEditTextCompat textInputEditTextCompat = (TextInputEditTextCompat) b4.c.a(view, i10);
                if (textInputEditTextCompat != null) {
                    i10 = pc.b.i.Ib;
                    TextInputLayout textInputLayout = (TextInputLayout) b4.c.a(view, i10);
                    if (textInputLayout != null) {
                        i10 = pc.b.i.Jb;
                        PreloaderSimpleV2View preloaderSimpleV2View = (PreloaderSimpleV2View) b4.c.a(view, i10);
                        if (preloaderSimpleV2View != null) {
                            i10 = pc.b.i.Kb;
                            TextInputEditTextCompat textInputEditTextCompat2 = (TextInputEditTextCompat) b4.c.a(view, i10);
                            if (textInputEditTextCompat2 != null) {
                                i10 = pc.b.i.Lb;
                                TextInputLayout textInputLayout2 = (TextInputLayout) b4.c.a(view, i10);
                                if (textInputLayout2 != null) {
                                    i10 = pc.b.i.Mb;
                                    NestedScrollView nestedScrollView = (NestedScrollView) b4.c.a(view, i10);
                                    if (nestedScrollView != null) {
                                        i10 = pc.b.i.Nb;
                                        TextViewFormField textViewFormField = (TextViewFormField) b4.c.a(view, i10);
                                        if (textViewFormField != null) {
                                            return new e((CoordinatorLayout) view, projectSettingCheckboxView, textView, textInputEditTextCompat, textInputLayout, preloaderSimpleV2View, textInputEditTextCompat2, textInputLayout2, nestedScrollView, textViewFormField);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static e c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static e d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(pc.b.l.f343630o0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f350327a;
    }
}
