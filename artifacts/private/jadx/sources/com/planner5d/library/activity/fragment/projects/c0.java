package com.planner5d.library.activity.fragment.projects;

import com.planner5d.library.model.manager.statistics.events.b4;
import com.planner5d.library.model.manager.statistics.events.x3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@ij.f
public final class c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f134932c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private r f134933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private r f134934b;

    /* JADX WARN: Multi-variable type inference failed */
    @ij.a
    public c0() {
        int i10 = 3;
        this.f134933a = new r(null, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        this.f134934b = new r(0 == true ? 1 : 0, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
    }

    @NotNull
    public final r a() {
        r rVar = this.f134934b;
        this.f134934b = this.f134933a;
        return rVar;
    }

    public final void b(@NotNull x3.e source) {
        Intrinsics.checkNotNullParameter(source, "source");
        r rVar = new r(source, b4.c.f216744a.a(source));
        this.f134934b = rVar;
        if (source != x3.e.back_button) {
            this.f134933a = rVar;
        }
    }

    public final void c(@NotNull b4.c source) {
        Intrinsics.checkNotNullParameter(source, "source");
        r rVar = new r(x3.e.f217693a.a(source), source);
        this.f134934b = rVar;
        if (source != b4.c.back_button) {
            this.f134933a = rVar;
        }
    }
}
