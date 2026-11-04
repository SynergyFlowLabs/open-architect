package androidx.preference;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b0;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
@Deprecated
public class t extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final RecyclerView f73154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final androidx.core.view.a f73155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final androidx.core.view.a f73156e;

    class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, androidx.core.view.accessibility.j jVar) {
            Preference preferenceK;
            t.this.f73155d.onInitializeAccessibilityNodeInfo(view, jVar);
            int iS0 = t.this.f73154c.s0(view);
            RecyclerView.h adapter = t.this.f73154c.getAdapter();
            if ((adapter instanceof n) && (preferenceK = ((n) adapter).k(iS0)) != null) {
                preferenceK.z0(jVar);
            }
        }

        @Override // androidx.core.view.a
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return t.this.f73155d.performAccessibilityAction(view, i10, bundle);
        }
    }

    public t(@NonNull RecyclerView recyclerView) {
        super(recyclerView);
        this.f73155d = super.c();
        this.f73156e = new a();
        this.f73154c = recyclerView;
    }

    @Override // androidx.recyclerview.widget.b0
    @NonNull
    public androidx.core.view.a c() {
        return this.f73156e;
    }
}
