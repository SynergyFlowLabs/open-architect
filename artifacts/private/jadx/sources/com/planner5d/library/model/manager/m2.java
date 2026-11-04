package com.planner5d.library.model.manager;

import android.os.Build;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@ij.f
public final class m2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f191875c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.flow.k0<a> f191876a = kotlinx.coroutines.flow.b1.a(a.NOT_REQUESTED);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private WeakReference<androidx.activity.result.h<String>> f191877b;

    public enum a {
        NOT_REQUESTED,
        REQUESTED,
        PROCESSED;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f191882e = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f191882e;
        }
    }

    @ij.a
    public m2() {
    }

    private static Object c(m2 m2Var) {
        return kotlin.jvm.internal.j1.t(new kotlin.jvm.internal.c1(m2Var, m2.class, "permissionStateInternal", "getPermissionStateInternal()Lkotlinx/coroutines/flow/MutableStateFlow;", 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(m2 m2Var, boolean z10) {
        if (!z10) {
            timber.log.b.f381052a.k("Notification permission is not granted", new Object[0]);
        }
        m2Var.f191876a.setValue(a.PROCESSED);
    }

    @NotNull
    public final kotlinx.coroutines.flow.z0<a> b() {
        return this.f191876a;
    }

    public final void d(@NotNull androidx.activity.l activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (Build.VERSION.SDK_INT < 33) {
            this.f191876a.setValue(a.PROCESSED);
        } else {
            this.f191877b = new WeakReference<>(activity.registerForActivityResult(new g.b.l(), new androidx.activity.result.a() { // from class: com.planner5d.library.model.manager.l2
                @Override // androidx.activity.result.a
                public final void a(Object obj) {
                    m2.e(this.f191854a, ((Boolean) obj).booleanValue());
                }
            }));
        }
    }

    @e.a({"InlinedApi"})
    public final void f() {
        WeakReference<androidx.activity.result.h<String>> weakReference;
        androidx.activity.result.h<String> hVar;
        if (b().getValue() == a.NOT_REQUESTED && (weakReference = this.f191877b) != null && (hVar = weakReference.get()) != null) {
            hVar.b("android.permission.POST_NOTIFICATIONS");
            this.f191876a.setValue(a.REQUESTED);
        }
    }
}
