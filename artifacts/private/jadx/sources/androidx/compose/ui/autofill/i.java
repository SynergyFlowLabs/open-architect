package androidx.compose.ui.autofill;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.compose.runtime.internal.w0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
@androidx.annotation.w0(26)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i f36978a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f36979b = 0;

    private i() {
    }

    @androidx.annotation.w0(26)
    public final void A(@NotNull ViewStructure viewStructure, int i10) {
        viewStructure.setInputType(i10);
    }

    @androidx.annotation.w0(26)
    public final void B(@NotNull ViewStructure viewStructure, boolean z10) {
        viewStructure.setLongClickable(z10);
    }

    @androidx.annotation.w0(26)
    public final void C(@NotNull ViewStructure viewStructure, boolean z10) {
        viewStructure.setOpaque(z10);
    }

    @androidx.annotation.w0(26)
    public final void D(@NotNull ViewStructure viewStructure, boolean z10) {
        viewStructure.setSelected(z10);
    }

    @androidx.annotation.w0(26)
    public final void E(@NotNull ViewStructure viewStructure, @NotNull CharSequence charSequence) {
        viewStructure.setText(charSequence);
    }

    @androidx.annotation.w0(26)
    public final void F(@NotNull ViewStructure viewStructure, int i10) {
        viewStructure.setVisibility(i10);
    }

    @androidx.annotation.w0(26)
    @NotNull
    public final CharSequence G(@NotNull AutofillValue autofillValue) {
        return autofillValue.getTextValue();
    }

    @androidx.annotation.w0(26)
    public final int a(@NotNull ViewStructure viewStructure, int i10) {
        return viewStructure.addChildCount(i10);
    }

    @androidx.annotation.w0(26)
    public final boolean b(@NotNull AutofillValue autofillValue) {
        return autofillValue.getToggleValue();
    }

    @androidx.annotation.w0(26)
    @Nullable
    public final AutofillId c(@NotNull ViewStructure viewStructure) {
        return viewStructure.getAutofillId();
    }

    @androidx.annotation.w0(26)
    @NotNull
    public final AutofillValue d(@NotNull String str) {
        return AutofillValue.forText(str);
    }

    @androidx.annotation.w0(26)
    public final boolean e(@NotNull AutofillValue autofillValue) {
        return autofillValue.isDate();
    }

    @androidx.annotation.w0(26)
    public final boolean f(@NotNull AutofillValue autofillValue) {
        return autofillValue.isList();
    }

    @androidx.annotation.w0(26)
    public final boolean g(@NotNull AutofillValue autofillValue) {
        return autofillValue.isText();
    }

    @androidx.annotation.w0(26)
    public final boolean h(@NotNull AutofillValue autofillValue) {
        return autofillValue.isToggle();
    }

    @androidx.annotation.w0(26)
    public final int i(@NotNull AutofillValue autofillValue) {
        return autofillValue.getListValue();
    }

    @androidx.annotation.w0(26)
    @NotNull
    public final ViewStructure j(@NotNull ViewStructure viewStructure, int i10) {
        return viewStructure.newChild(i10);
    }

    @androidx.annotation.w0(26)
    public final void k(@NotNull ViewStructure viewStructure, @NotNull String[] strArr) {
        viewStructure.setAutofillHints(strArr);
    }

    @androidx.annotation.w0(26)
    public final void l(@NotNull ViewStructure viewStructure, @NotNull AutofillId autofillId, int i10) {
        viewStructure.setAutofillId(autofillId, i10);
    }

    @androidx.annotation.w0(26)
    public final void m(@NotNull ViewStructure viewStructure, int i10) {
        viewStructure.setAutofillType(i10);
    }

    @androidx.annotation.w0(26)
    public final void n(@NotNull ViewStructure viewStructure, @NotNull AutofillValue autofillValue) {
        viewStructure.setAutofillValue(autofillValue);
    }

    @androidx.annotation.w0(26)
    public final void o(@NotNull ViewStructure viewStructure, boolean z10) {
        viewStructure.setCheckable(z10);
    }

    @androidx.annotation.w0(26)
    public final void p(@NotNull ViewStructure viewStructure, boolean z10) {
        viewStructure.setChecked(z10);
    }

    @androidx.annotation.w0(26)
    public final void q(@NotNull ViewStructure viewStructure, int i10) {
        viewStructure.setChildCount(i10);
    }

    @androidx.annotation.w0(26)
    public final void r(@NotNull ViewStructure viewStructure, @NotNull String str) {
        viewStructure.setClassName(str);
    }

    @androidx.annotation.w0(26)
    public final void s(@NotNull ViewStructure viewStructure, boolean z10) {
        viewStructure.setClickable(z10);
    }

    @androidx.annotation.w0(26)
    public final void t(@NotNull ViewStructure viewStructure, @NotNull CharSequence charSequence) {
        viewStructure.setContentDescription(charSequence);
    }

    @androidx.annotation.w0(26)
    public final void u(@NotNull ViewStructure viewStructure, boolean z10) {
        viewStructure.setDataIsSensitive(z10);
    }

    @androidx.annotation.w0(26)
    public final void v(@NotNull ViewStructure viewStructure, int i10, int i11, int i12, int i13, int i14, int i15) {
        viewStructure.setDimens(i10, i11, i12, i13, i14, i15);
    }

    @androidx.annotation.w0(26)
    public final void w(@NotNull ViewStructure viewStructure, boolean z10) {
        viewStructure.setEnabled(z10);
    }

    @androidx.annotation.w0(26)
    public final void x(@NotNull ViewStructure viewStructure, boolean z10) {
        viewStructure.setFocusable(z10);
    }

    @androidx.annotation.w0(26)
    public final void y(@NotNull ViewStructure viewStructure, boolean z10) {
        viewStructure.setFocused(z10);
    }

    @androidx.annotation.w0(26)
    public final void z(@NotNull ViewStructure viewStructure, int i10, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        viewStructure.setId(i10, str, str2, str3);
    }
}
