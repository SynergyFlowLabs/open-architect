package com.planner5d.library.activity.fragment.snapshots;

import com.planner5d.library.model.snapshot.SnapshotLocal;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f136049f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final gd.b f136050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f136051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f136052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f136053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f136054e;

    public m(@NotNull gd.b model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f136050a = model;
        this.f136051b = kotlin.g0.c(new Function0() { // from class: com.planner5d.library.activity.fragment.snapshots.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(m.c(this.f136036a));
            }
        });
        this.f136052c = kotlin.g0.c(new Function0() { // from class: com.planner5d.library.activity.fragment.snapshots.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(m.f(this.f136047a));
            }
        });
        int iT = model.t();
        this.f136053d = (iT == 2 || iT == 3 || iT == 5 || (model instanceof SnapshotLocal)) ? false : true;
        int iT2 = model.t();
        this.f136054e = (iT2 == 4 || iT2 == 5) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(m mVar) {
        return mVar.f136053d && mVar.f136054e && mVar.f136050a.c() != gd.c.ENHANCE && mVar.f136050a.j() == vd.b.DRAFT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(m mVar) {
        if (mVar.f136053d && mVar.f136050a.c() == gd.c.REGULAR && mVar.f136050a.j() != vd.b.PRO4K) {
            return mVar.f136050a.j() != vd.b.HD || mVar.f136054e;
        }
        return false;
    }

    public final boolean d() {
        return ((Boolean) this.f136051b.getValue()).booleanValue();
    }

    public final boolean e() {
        return ((Boolean) this.f136052c.getValue()).booleanValue();
    }
}
