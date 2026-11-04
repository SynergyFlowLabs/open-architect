package com.planner5d.library.widget.preloader.shimmer;

import android.animation.TimeAnimator;
import androidx.compose.runtime.internal.w0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f258608d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f258609e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final g f258610f = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f258611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<b> f258612b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final TimeAnimator f258613c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final g a() {
            return g.f258610f;
        }

        private a() {
        }
    }

    public interface b {
        void onNewShimmerFrameAvailable();
    }

    public g() {
        TimeAnimator timeAnimator = new TimeAnimator();
        timeAnimator.setTimeListener(new TimeAnimator.TimeListener() { // from class: com.planner5d.library.widget.preloader.shimmer.f
            @Override // android.animation.TimeAnimator.TimeListener
            public final void onTimeUpdate(TimeAnimator timeAnimator2, long j10, long j11) {
                g.h(this.f258607a, timeAnimator2, j10, j11);
            }
        });
        this.f258613c = timeAnimator;
    }

    private final void e() {
        if (this.f258612b.size() >= 100) {
            timber.log.b.f381052a.x("There are suspiciously many of running shimmer animations (" + this.f258612b.size() + ") - ensure they are not leaked", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(g gVar, TimeAnimator timeAnimator, long j10, long j11) {
        gVar.f258611a = j10;
        for (int i10 = 0; i10 < gVar.f258612b.size(); i10++) {
            gVar.f258612b.get(i10).onNewShimmerFrameAvailable();
        }
    }

    public final void c(@NotNull b target) {
        Intrinsics.checkNotNullParameter(target, "target");
        if (this.f258612b.contains(target)) {
            return;
        }
        this.f258612b.add(target);
        if (!this.f258613c.isStarted()) {
            this.f258613c.start();
        }
        e();
    }

    public final boolean d(@NotNull b target) {
        Intrinsics.checkNotNullParameter(target, "target");
        return this.f258612b.contains(target);
    }

    public final long f() {
        return this.f258611a;
    }

    public final void g(@NotNull b target) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.f258612b.remove(target);
        if (this.f258612b.isEmpty()) {
            this.f258613c.cancel();
        }
    }
}
