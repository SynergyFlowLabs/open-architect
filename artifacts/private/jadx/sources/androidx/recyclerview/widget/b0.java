package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.core.view.u1;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class b0 extends androidx.core.view.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final RecyclerView f74139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f74140b;

    public static class a extends androidx.core.view.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final b0 f74141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map<View, androidx.core.view.a> f74142b = new WeakHashMap();

        public a(@NonNull b0 b0Var) {
            this.f74141a = b0Var;
        }

        androidx.core.view.a c(View view) {
            return this.f74142b.remove(view);
        }

        void d(View view) {
            androidx.core.view.a aVarE = u1.E(view);
            if (aVarE == null || aVarE == this) {
                return;
            }
            this.f74142b.put(view, aVarE);
        }

        @Override // androidx.core.view.a
        public boolean dispatchPopulateAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f74142b.get(view);
            return aVar != null ? aVar.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        @p0
        public androidx.core.view.accessibility.k getAccessibilityNodeProvider(@NonNull View view) {
            androidx.core.view.a aVar = this.f74142b.get(view);
            return aVar != null ? aVar.getAccessibilityNodeProvider(view) : super.getAccessibilityNodeProvider(view);
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f74142b.get(view);
            if (aVar != null) {
                aVar.onInitializeAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(@NonNull @e.a({"InvalidNullabilityOverride"}) View view, @NonNull @e.a({"InvalidNullabilityOverride"}) androidx.core.view.accessibility.j jVar) {
            if (this.f74141a.d() || this.f74141a.f74139a.getLayoutManager() == null) {
                super.onInitializeAccessibilityNodeInfo(view, jVar);
                return;
            }
            this.f74141a.f74139a.getLayoutManager().j1(view, jVar);
            androidx.core.view.a aVar = this.f74142b.get(view);
            if (aVar != null) {
                aVar.onInitializeAccessibilityNodeInfo(view, jVar);
            } else {
                super.onInitializeAccessibilityNodeInfo(view, jVar);
            }
        }

        @Override // androidx.core.view.a
        public void onPopulateAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f74142b.get(view);
            if (aVar != null) {
                aVar.onPopulateAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.a
        public boolean onRequestSendAccessibilityEvent(@NonNull ViewGroup viewGroup, @NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f74142b.get(viewGroup);
            return aVar != null ? aVar.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        public boolean performAccessibilityAction(@NonNull @e.a({"InvalidNullabilityOverride"}) View view, int i10, @e.a({"InvalidNullabilityOverride"}) @p0 Bundle bundle) {
            if (this.f74141a.d() || this.f74141a.f74139a.getLayoutManager() == null) {
                return super.performAccessibilityAction(view, i10, bundle);
            }
            androidx.core.view.a aVar = this.f74142b.get(view);
            if (aVar != null) {
                if (aVar.performAccessibilityAction(view, i10, bundle)) {
                    return true;
                }
            } else if (super.performAccessibilityAction(view, i10, bundle)) {
                return true;
            }
            return this.f74141a.f74139a.getLayoutManager().D1(view, i10, bundle);
        }

        @Override // androidx.core.view.a
        public void sendAccessibilityEvent(@NonNull View view, int i10) {
            androidx.core.view.a aVar = this.f74142b.get(view);
            if (aVar != null) {
                aVar.sendAccessibilityEvent(view, i10);
            } else {
                super.sendAccessibilityEvent(view, i10);
            }
        }

        @Override // androidx.core.view.a
        public void sendAccessibilityEventUnchecked(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f74142b.get(view);
            if (aVar != null) {
                aVar.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            } else {
                super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public b0(@NonNull RecyclerView recyclerView) {
        this.f74139a = recyclerView;
        androidx.core.view.a aVarC = c();
        if (aVarC == null || !(aVarC instanceof a)) {
            this.f74140b = new a(this);
        } else {
            this.f74140b = (a) aVarC;
        }
    }

    @NonNull
    public androidx.core.view.a c() {
        return this.f74140b;
    }

    boolean d() {
        return this.f74139a.H0();
    }

    @Override // androidx.core.view.a
    public void onInitializeAccessibilityEvent(@NonNull @e.a({"InvalidNullabilityOverride"}) View view, @NonNull @e.a({"InvalidNullabilityOverride"}) AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !d()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().f1(accessibilityEvent);
            }
        }
    }

    @Override // androidx.core.view.a
    public void onInitializeAccessibilityNodeInfo(@NonNull @e.a({"InvalidNullabilityOverride"}) View view, @NonNull @e.a({"InvalidNullabilityOverride"}) androidx.core.view.accessibility.j jVar) {
        super.onInitializeAccessibilityNodeInfo(view, jVar);
        if (d() || this.f74139a.getLayoutManager() == null) {
            return;
        }
        this.f74139a.getLayoutManager().h1(jVar);
    }

    @Override // androidx.core.view.a
    public boolean performAccessibilityAction(@NonNull @e.a({"InvalidNullabilityOverride"}) View view, int i10, @e.a({"InvalidNullabilityOverride"}) @p0 Bundle bundle) {
        if (super.performAccessibilityAction(view, i10, bundle)) {
            int i11 = 4 >> 1;
            return true;
        }
        if (d() || this.f74139a.getLayoutManager() == null) {
            return false;
        }
        return this.f74139a.getLayoutManager().B1(i10, bundle);
    }
}
