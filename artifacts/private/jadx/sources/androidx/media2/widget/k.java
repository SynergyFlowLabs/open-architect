package androidx.media2.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes.dex */
abstract class k extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f59995a;

    k(@NonNull Context context) {
        super(context);
        this.f59995a = false;
    }

    boolean a() {
        return this.f59995a;
    }

    @androidx.annotation.i
    void b(boolean z10) {
        this.f59995a = z10;
    }

    @Override // android.view.View
    @w0(24)
    public void onVisibilityAggregated(boolean z10) {
        super.onVisibilityAggregated(z10);
        b(z10);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@NonNull View view, int i10) {
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
    }

    k(@NonNull Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f59995a = false;
    }

    k(@NonNull Context context, @p0 AttributeSet attributeSet, @androidx.annotation.f int i10) {
        super(context, attributeSet, i10);
        this.f59995a = false;
    }
}
