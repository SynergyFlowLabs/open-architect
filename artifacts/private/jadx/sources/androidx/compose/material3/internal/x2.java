package androidx.compose.material3.internal;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.k7;
import androidx.compose.runtime.n7;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@k7
@SourceDebugExtension({"SMAP\nAccessibilityServiceStateProvider.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccessibilityServiceStateProvider.android.kt\nandroidx/compose/material3/internal/Listener\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,208:1\n85#2:209\n117#2,2:210\n102#3,2:212\n34#3,6:214\n104#3:220\n102#3,2:221\n34#3,6:223\n104#3:229\n1#4:230\n*S KotlinDebug\n*F\n+ 1 AccessibilityServiceStateProvider.android.kt\nandroidx/compose/material3/internal/Listener\n*L\n100#1:209\n100#1:210,2\n135#1:212,2\n135#1:214,6\n135#1:220\n142#1:221,2\n142#1:223,6\n142#1:229\n*E\n"})
final class x2 implements AccessibilityManager.AccessibilityStateChangeListener, n7<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f29228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f29229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f29230c = d7.g(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final c f29231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final b f29232e;

    @androidx.annotation.w0(33)
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f29233a = new a();

        private a() {
        }

        @oj.n
        public static final void a(@NotNull AccessibilityManager accessibilityManager, @NotNull AccessibilityManager$AccessibilityServicesStateChangeListener accessibilityManager$AccessibilityServicesStateChangeListener) {
            accessibilityManager.addAccessibilityServicesStateChangeListener(accessibilityManager$AccessibilityServicesStateChangeListener);
        }

        @oj.n
        public static final void b(@NotNull AccessibilityManager accessibilityManager, @NotNull AccessibilityManager$AccessibilityServicesStateChangeListener accessibilityManager$AccessibilityServicesStateChangeListener) {
            accessibilityManager.removeAccessibilityServicesStateChangeListener(accessibilityManager$AccessibilityServicesStateChangeListener);
        }
    }

    @SourceDebugExtension({"SMAP\nAccessibilityServiceStateProvider.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccessibilityServiceStateProvider.android.kt\nandroidx/compose/material3/internal/Listener$otherA11yServicesListener$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,208:1\n85#2:209\n117#2,2:210\n85#2:212\n117#2,2:213\n*S KotlinDebug\n*F\n+ 1 AccessibilityServiceStateProvider.android.kt\nandroidx/compose/material3/internal/Listener$otherA11yServicesListener$1\n*L\n121#1:209\n121#1:210,2\n122#1:212\n122#1:213,2\n*E\n"})
    public static final class b implements AccessibilityManager$AccessibilityServicesStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.compose.runtime.n3 f29234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.compose.runtime.n3 f29235b;

        b() {
            Boolean bool = Boolean.FALSE;
            this.f29234a = d7.g(bool, null, 2, null);
            this.f29235b = d7.g(bool, null, 2, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean a() {
            return ((Boolean) this.f29234a.getValue()).booleanValue();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean b() {
            return ((Boolean) this.f29235b.getValue()).booleanValue();
        }

        public final void c(boolean z10) {
            this.f29234a.setValue(Boolean.valueOf(z10));
        }

        public final void d(boolean z10) {
            this.f29235b.setValue(Boolean.valueOf(z10));
        }

        public void onAccessibilityServicesStateChanged(AccessibilityManager accessibilityManager) {
            c(x2.this.p(accessibilityManager));
            d(x2.this.t(accessibilityManager));
        }
    }

    @SourceDebugExtension({"SMAP\nAccessibilityServiceStateProvider.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccessibilityServiceStateProvider.android.kt\nandroidx/compose/material3/internal/Listener$touchExplorationListener$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,208:1\n85#2:209\n117#2,2:210\n*S KotlinDebug\n*F\n+ 1 AccessibilityServiceStateProvider.android.kt\nandroidx/compose/material3/internal/Listener$touchExplorationListener$1\n*L\n105#1:209\n105#1:210,2\n*E\n"})
    public static final class c implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.compose.runtime.n3 f29237a = d7.g(Boolean.FALSE, null, 2, null);

        c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean a() {
            return ((Boolean) this.f29237a.getValue()).booleanValue();
        }

        public final void b(boolean z10) {
            this.f29237a.setValue(Boolean.valueOf(z10));
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z10) {
            b(z10);
        }
    }

    public x2(boolean z10, boolean z11, boolean z12) {
        this.f29228a = z11;
        this.f29229b = z12;
        b bVar = null;
        this.f29231d = z10 ? new c() : null;
        if ((z11 || z12) && Build.VERSION.SDK_INT >= 33) {
            bVar = new b();
        }
        this.f29232e = bVar;
    }

    private final void E(boolean z10) {
        this.f29230c.setValue(Boolean.valueOf(z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean d() {
        return ((Boolean) this.f29230c.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean p(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i10).getSettingsActivityName();
            if (settingsActivityName != null && StringsKt.S2(settingsActivityName, "SwitchAccess", true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean t(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i10).getSettingsActivityName();
            if (settingsActivityName != null && StringsKt.S2(settingsActivityName, "VoiceAccess", true)) {
                return true;
            }
        }
        return false;
    }

    public final void A(@NotNull AccessibilityManager accessibilityManager) {
        b bVar;
        E(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(this);
        c cVar = this.f29231d;
        if (cVar != null) {
            cVar.b(accessibilityManager.isTouchExplorationEnabled());
            accessibilityManager.addTouchExplorationStateChangeListener(cVar);
        }
        if (Build.VERSION.SDK_INT < 33 || (bVar = this.f29232e) == null) {
            return;
        }
        bVar.c(p(accessibilityManager));
        bVar.d(t(accessibilityManager));
        a.a(accessibilityManager, w2.a(bVar));
    }

    public final void F(@NotNull AccessibilityManager accessibilityManager) {
        b bVar;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        c cVar = this.f29231d;
        if (cVar != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(cVar);
        }
        if (Build.VERSION.SDK_INT < 33 || (bVar = this.f29232e) == null) {
            return;
        }
        a.b(accessibilityManager, w2.a(bVar));
    }

    public final boolean g() {
        return this.f29228a;
    }

    public final boolean h() {
        return this.f29229b;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z10) {
        E(z10);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0038  */
    @Override // androidx.compose.runtime.n7
    @NotNull
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public Boolean getValue() {
        boolean z10;
        b bVar;
        b bVar2;
        if (d()) {
            c cVar = this.f29231d;
            z10 = true;
            if ((cVar == null || !cVar.a()) && ((!this.f29228a || (bVar2 = this.f29232e) == null || !bVar2.a()) && (!this.f29229b || (bVar = this.f29232e) == null || !bVar.b()))) {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
