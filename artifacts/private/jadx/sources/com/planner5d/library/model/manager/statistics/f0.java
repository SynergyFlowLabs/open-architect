package com.planner5d.library.model.manager.statistics;

import android.os.Bundle;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.statistics.events.f4;
import com.planner5d.library.model.manager.statistics.events.z2;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@w0(parameters = 0)
public final class f0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f217768d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f217769e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f4 f217770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f217771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f217772c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final f0 a(@Nullable Bundle bundle) {
            f4 f4VarA;
            com.planner5d.library.services.utility.j jVar = new com.planner5d.library.services.utility.j(bundle);
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.processName;
            f0 f0Var = null;
            if (jVar.a(rVar)) {
                com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.processStart;
                if (jVar.a(rVar2)) {
                    com.planner5d.library.services.r rVar3 = com.planner5d.library.services.r.processEnded;
                    if (jVar.a(rVar3) && (f4VarA = f4.f216936b.a(jVar.t(rVar, null))) != null) {
                        f0Var = new f0(f4VarA);
                        f0Var.f217772c = jVar.d(rVar2, 0L);
                        f0Var.f217771b.set(jVar.f(rVar3, false));
                    }
                }
            }
            return f0Var;
        }

        @NotNull
        public final f0 b(@NotNull f4 statisticsProcessName) {
            Intrinsics.checkNotNullParameter(statisticsProcessName, "statisticsProcessName");
            return new f0(statisticsProcessName);
        }

        private a() {
        }
    }

    public f0(@NotNull f4 processName) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        this.f217770a = processName;
        this.f217771b = new AtomicBoolean(false);
        this.f217772c = System.currentTimeMillis();
    }

    public final void c() {
        if (this.f217771b.getAndSet(true)) {
            timber.log.b.f381052a.x("Attempted to end a StatisticsProcess that was already ended", new Object[0]);
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        timber.log.b.f381052a.a("%s start=%d, end=%d, durationMs=%d", this.f217770a, Long.valueOf(this.f217772c), Long.valueOf(jCurrentTimeMillis), Long.valueOf(jCurrentTimeMillis - this.f217772c));
        z2.f217761b.f1(this.f217772c, jCurrentTimeMillis, this.f217770a);
    }

    @NotNull
    public final Bundle d() {
        return new com.planner5d.library.services.utility.i().j(com.planner5d.library.services.r.processName, this.f217770a.o()).g(com.planner5d.library.services.r.processStart, this.f217772c).m(com.planner5d.library.services.r.processEnded, this.f217771b.get()).a();
    }
}
