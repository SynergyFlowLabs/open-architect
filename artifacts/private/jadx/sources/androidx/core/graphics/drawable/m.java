package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes2.dex */
final class m extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f47793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Drawable.ConstantState f47794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ColorStateList f47795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    PorterDuff.Mode f47796d;

    m(@p0 m mVar) {
        this.f47795c = null;
        this.f47796d = k.f47784g;
        if (mVar != null) {
            this.f47793a = mVar.f47793a;
            this.f47794b = mVar.f47794b;
            this.f47795c = mVar.f47795c;
            this.f47796d = mVar.f47796d;
        }
    }

    boolean a() {
        return this.f47794b != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i10 = this.f47793a;
        Drawable.ConstantState constantState = this.f47794b;
        return (constantState != null ? constantState.getChangingConfigurations() : 0) | i10;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    @NonNull
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    @NonNull
    public Drawable newDrawable(@p0 Resources resources) {
        return new l(this, resources);
    }
}
