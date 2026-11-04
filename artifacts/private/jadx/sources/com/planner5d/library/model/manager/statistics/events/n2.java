package com.planner5d.library.model.manager.statistics.events;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class n2 extends w0 implements z3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final n2 f217166b = new n2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f217167c = 0;

    private n2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x1(Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("source", z3.a.setting_button);
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.statistics.events.z3
    public void J() {
        w0.s1(this, u3.f217552n4, null, 2, null);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.z3
    public void W() {
        w0.s1(this, u3.f217540j4, null, 2, null);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.z3
    public void W0() {
        w0.s1(this, u3.f217546l4, null, 2, null);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.z3
    public void X0() {
        w0.s1(this, u3.f217534h4, null, 2, null);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.z3
    public void Z() {
        w0.s1(this, u3.f217555o4, null, 2, null);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.z3
    public void b() {
        w0.s1(this, u3.f217549m4, null, 2, null);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.z3
    public void f0() {
        w0.s1(this, u3.f217537i4, null, 2, null);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.z3
    public void l0() {
        w0.s1(this, u3.f217560p4, null, 2, null);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.z3
    public void open() {
        q1(u3.f217531g4, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.m2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n2.x1((Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.z3
    public void v0() {
        w0.s1(this, u3.f217543k4, null, 2, null);
    }
}
