package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(@NonNull Context context, @p0 AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    @Override // androidx.preference.Preference
    public boolean h0() {
        return false;
    }

    @Override // androidx.preference.Preference
    public void u0(@NonNull u uVar) {
        super.u0(uVar);
        uVar.itemView.setAccessibilityHeading(true);
    }

    @Override // androidx.preference.Preference
    public boolean x1() {
        return !super.h0();
    }

    public PreferenceCategory(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public PreferenceCategory(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.res.n.a(context, v.a.I, R.attr.preferenceCategoryStyle));
    }

    public PreferenceCategory(@NonNull Context context) {
        this(context, null);
    }
}
