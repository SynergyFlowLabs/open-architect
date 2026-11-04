package androidx.core.view.accessibility;

import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.v0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AccessibilityRecord f48596a;

    @Deprecated
    public l(Object obj) {
        this.f48596a = (AccessibilityRecord) obj;
    }

    @Deprecated
    public static l A(l lVar) {
        return new l(AccessibilityRecord.obtain(lVar.f48596a));
    }

    @v0(expression = "record.setMaxScrollX(maxScrollX)")
    @Deprecated
    public static void N(@NonNull AccessibilityRecord accessibilityRecord, int i10) {
        accessibilityRecord.setMaxScrollX(i10);
    }

    @v0(expression = "record.setMaxScrollY(maxScrollY)")
    @Deprecated
    public static void P(@NonNull AccessibilityRecord accessibilityRecord, int i10) {
        accessibilityRecord.setMaxScrollY(i10);
    }

    @v0(expression = "record.setSource(root, virtualDescendantId)")
    @Deprecated
    public static void Y(@NonNull AccessibilityRecord accessibilityRecord, @p0 View view, int i10) {
        accessibilityRecord.setSource(view, i10);
    }

    @v0(expression = "record.getMaxScrollX()")
    @Deprecated
    public static int j(@NonNull AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollX();
    }

    @v0(expression = "record.getMaxScrollY()")
    @Deprecated
    public static int l(@NonNull AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollY();
    }

    @Deprecated
    public static l z() {
        return new l(AccessibilityRecord.obtain());
    }

    @Deprecated
    public void B() {
        this.f48596a.recycle();
    }

    @Deprecated
    public void C(int i10) {
        this.f48596a.setAddedCount(i10);
    }

    @Deprecated
    public void D(CharSequence charSequence) {
        this.f48596a.setBeforeText(charSequence);
    }

    @Deprecated
    public void E(boolean z10) {
        this.f48596a.setChecked(z10);
    }

    @Deprecated
    public void F(CharSequence charSequence) {
        this.f48596a.setClassName(charSequence);
    }

    @Deprecated
    public void G(CharSequence charSequence) {
        this.f48596a.setContentDescription(charSequence);
    }

    @Deprecated
    public void H(int i10) {
        this.f48596a.setCurrentItemIndex(i10);
    }

    @Deprecated
    public void I(boolean z10) {
        this.f48596a.setEnabled(z10);
    }

    @Deprecated
    public void J(int i10) {
        this.f48596a.setFromIndex(i10);
    }

    @Deprecated
    public void K(boolean z10) {
        this.f48596a.setFullScreen(z10);
    }

    @Deprecated
    public void L(int i10) {
        this.f48596a.setItemCount(i10);
    }

    @Deprecated
    public void M(int i10) {
        N(this.f48596a, i10);
    }

    @Deprecated
    public void O(int i10) {
        P(this.f48596a, i10);
    }

    @Deprecated
    public void Q(Parcelable parcelable) {
        this.f48596a.setParcelableData(parcelable);
    }

    @Deprecated
    public void R(boolean z10) {
        this.f48596a.setPassword(z10);
    }

    @Deprecated
    public void S(int i10) {
        this.f48596a.setRemovedCount(i10);
    }

    @Deprecated
    public void T(int i10) {
        this.f48596a.setScrollX(i10);
    }

    @Deprecated
    public void U(int i10) {
        this.f48596a.setScrollY(i10);
    }

    @Deprecated
    public void V(boolean z10) {
        this.f48596a.setScrollable(z10);
    }

    @e.a({"KotlinPropertyAccess"})
    @Deprecated
    public void W(View view) {
        this.f48596a.setSource(view);
    }

    @Deprecated
    public void X(View view, int i10) {
        Y(this.f48596a, view, i10);
    }

    @Deprecated
    public void Z(int i10) {
        this.f48596a.setToIndex(i10);
    }

    @Deprecated
    public int a() {
        return this.f48596a.getAddedCount();
    }

    @Deprecated
    public CharSequence b() {
        return this.f48596a.getBeforeText();
    }

    @Deprecated
    public CharSequence c() {
        return this.f48596a.getClassName();
    }

    @Deprecated
    public CharSequence d() {
        return this.f48596a.getContentDescription();
    }

    @Deprecated
    public int e() {
        return this.f48596a.getCurrentItemIndex();
    }

    @Deprecated
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        AccessibilityRecord accessibilityRecord = this.f48596a;
        if (accessibilityRecord == null) {
            return lVar.f48596a == null;
        }
        return accessibilityRecord.equals(lVar.f48596a);
    }

    @Deprecated
    public int f() {
        return this.f48596a.getFromIndex();
    }

    @Deprecated
    public Object g() {
        return this.f48596a;
    }

    @Deprecated
    public int h() {
        return this.f48596a.getItemCount();
    }

    @Deprecated
    public int hashCode() {
        AccessibilityRecord accessibilityRecord = this.f48596a;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }

    @Deprecated
    public int i() {
        return j(this.f48596a);
    }

    @Deprecated
    public int k() {
        return l(this.f48596a);
    }

    @Deprecated
    public Parcelable m() {
        return this.f48596a.getParcelableData();
    }

    @Deprecated
    public int n() {
        return this.f48596a.getRemovedCount();
    }

    @Deprecated
    public int o() {
        return this.f48596a.getScrollX();
    }

    @Deprecated
    public int p() {
        return this.f48596a.getScrollY();
    }

    @e.a({"KotlinPropertyAccess"})
    @Deprecated
    public j q() {
        return j.s2(this.f48596a.getSource());
    }

    @Deprecated
    public List<CharSequence> r() {
        return this.f48596a.getText();
    }

    @Deprecated
    public int s() {
        return this.f48596a.getToIndex();
    }

    @Deprecated
    public int t() {
        return this.f48596a.getWindowId();
    }

    @Deprecated
    public boolean u() {
        return this.f48596a.isChecked();
    }

    @Deprecated
    public boolean v() {
        return this.f48596a.isEnabled();
    }

    @Deprecated
    public boolean w() {
        return this.f48596a.isFullScreen();
    }

    @Deprecated
    public boolean x() {
        return this.f48596a.isPassword();
    }

    @Deprecated
    public boolean y() {
        return this.f48596a.isScrollable();
    }
}
