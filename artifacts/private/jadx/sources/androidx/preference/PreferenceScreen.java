package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
public final class PreferenceScreen extends PreferenceGroup {
    private boolean J3;

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public PreferenceScreen(@NonNull Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet, androidx.core.content.res.n.a(context, v.a.P, R.attr.preferenceScreenStyle));
        this.J3 = true;
    }

    @Override // androidx.preference.PreferenceGroup
    protected boolean L1() {
        return false;
    }

    public void X1(boolean z10) {
        if (K1()) {
            throw new IllegalStateException("Cannot change the usage of generated IDs while attached to the preference hierarchy");
        }
        this.J3 = z10;
    }

    public boolean Y1() {
        return this.J3;
    }

    @Override // androidx.preference.Preference
    protected void v0() {
        s.b bVarJ;
        if (D() != null || w() != null || J1() == 0 || (bVarJ = X().j()) == null) {
            return;
        }
        bVarJ.k(this);
    }
}
