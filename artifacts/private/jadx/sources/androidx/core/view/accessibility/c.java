package androidx.core.view.accessibility;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.annotation.v0;
import androidx.annotation.w0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    @Deprecated
    public interface a {
        @Deprecated
        void onAccessibilityStateChanged(boolean z10);
    }

    @Deprecated
    public static abstract class b implements a {
    }

    /* JADX INFO: renamed from: androidx.core.view.accessibility.c$c, reason: collision with other inner class name */
    private static class AccessibilityManagerAccessibilityStateChangeListenerC0411c implements AccessibilityManager.AccessibilityStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        a f48488a;

        AccessibilityManagerAccessibilityStateChangeListenerC0411c(@NonNull a aVar) {
            this.f48488a = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AccessibilityManagerAccessibilityStateChangeListenerC0411c) {
                return this.f48488a.equals(((AccessibilityManagerAccessibilityStateChangeListenerC0411c) obj).f48488a);
            }
            return false;
        }

        public int hashCode() {
            return this.f48488a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z10) {
            this.f48488a.onAccessibilityStateChanged(z10);
        }
    }

    @w0(34)
    static class d {
        private d() {
        }

        static boolean a(AccessibilityManager accessibilityManager) {
            return accessibilityManager.isRequestFromAccessibilityTool();
        }
    }

    public interface e {
        void onTouchExplorationStateChanged(boolean z10);
    }

    private static final class f implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final e f48489a;

        f(@NonNull e eVar) {
            this.f48489a = eVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                return this.f48489a.equals(((f) obj).f48489a);
            }
            return false;
        }

        public int hashCode() {
            return this.f48489a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z10) {
            this.f48489a.onTouchExplorationStateChanged(z10);
        }
    }

    private c() {
    }

    @Deprecated
    public static boolean a(AccessibilityManager accessibilityManager, a aVar) {
        if (aVar == null) {
            return false;
        }
        return accessibilityManager.addAccessibilityStateChangeListener(new AccessibilityManagerAccessibilityStateChangeListenerC0411c(aVar));
    }

    @v0(expression = "manager.addTouchExplorationStateChangeListener(listener)")
    @Deprecated
    public static boolean b(@NonNull AccessibilityManager accessibilityManager, @NonNull e eVar) {
        return accessibilityManager.addTouchExplorationStateChangeListener(new f(eVar));
    }

    @v0(expression = "manager.getEnabledAccessibilityServiceList(feedbackTypeFlags)")
    @Deprecated
    public static List<AccessibilityServiceInfo> c(AccessibilityManager accessibilityManager, int i10) {
        return accessibilityManager.getEnabledAccessibilityServiceList(i10);
    }

    @v0(expression = "manager.getInstalledAccessibilityServiceList()")
    @Deprecated
    public static List<AccessibilityServiceInfo> d(AccessibilityManager accessibilityManager) {
        return accessibilityManager.getInstalledAccessibilityServiceList();
    }

    public static boolean e(@NonNull AccessibilityManager accessibilityManager) {
        if (Build.VERSION.SDK_INT >= 34) {
            return d.a(accessibilityManager);
        }
        return true;
    }

    @v0(expression = "manager.isTouchExplorationEnabled()")
    @Deprecated
    public static boolean f(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isTouchExplorationEnabled();
    }

    @Deprecated
    public static boolean g(AccessibilityManager accessibilityManager, a aVar) {
        if (aVar == null) {
            return false;
        }
        return accessibilityManager.removeAccessibilityStateChangeListener(new AccessibilityManagerAccessibilityStateChangeListenerC0411c(aVar));
    }

    @v0(expression = "manager.removeTouchExplorationStateChangeListener(listener)")
    @Deprecated
    public static boolean h(@NonNull AccessibilityManager accessibilityManager, @NonNull e eVar) {
        return accessibilityManager.removeTouchExplorationStateChangeListener(new f(eVar));
    }
}
