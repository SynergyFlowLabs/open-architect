package com.planner5d.library.activity.fragment.dialog.snapshots;

import android.app.Activity;
import android.view.View;
import androidx.annotation.l0;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import com.planner5d.library.activity.fragment.profile.edit.q;
import com.planner5d.library.activity.helper.f1;
import com.planner5d.library.model.manager.b4;
import com.planner5d.library.model.manager.c2;
import com.planner5d.library.model.manager.statistics.events.p3;
import com.planner5d.library.model.manager.statistics.events.u2;
import com.planner5d.library.model.snapshot.Snapshot;
import com.planner5d.library.modules.user.user.t0;
import com.planner5d.library.modules.user.user.w;
import com.planner5d.library.services.utility.v1;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class n extends f2 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f132971n = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final b4 f132972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final w f132973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.w f132974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final f1 f132975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final t0 f132976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final c2 f132977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final ArrayList<vd.b> f132978g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final c1<vd.b> f132979h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final c1<q> f132980i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final c1<Boolean> f132981j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final c1<Boolean> f132982k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final v1.a<a> f132983l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f132984m;

    @w0(parameters = 1)
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f132985a = 0;

        /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.dialog.snapshots.n$a$a, reason: collision with other inner class name */
        @w0(parameters = 0)
        public static final class C1464a extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f132986c = 8;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            private final Snapshot f132987b;

            public C1464a(@Nullable Snapshot snapshot) {
                super(null);
                this.f132987b = snapshot;
            }

            @Nullable
            public final Snapshot a() {
                return this.f132987b;
            }
        }

        @w0(parameters = 0)
        public static final class b extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f132988c = 8;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            private final gd.a f132989b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@NotNull gd.a renderSettings) {
                super(null);
                Intrinsics.checkNotNullParameter(renderSettings, "renderSettings");
                this.f132989b = renderSettings;
            }

            @NotNull
            public final gd.a a() {
                return this.f132989b;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends com.planner5d.library.services.rx.e<Void> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ gd.a f132991e;

        b(gd.a aVar) {
            this.f132991e = aVar;
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            onCompleted();
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(Void r10) {
            n.this.X().r(new a.b(this.f132991e));
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            n.this.a0().r(q.Completed);
        }
    }

    public static final class c extends com.planner5d.library.services.rx.e<Snapshot> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f132993e;

        c(long j10) {
            this.f132993e = j10;
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            n.this.i0(p3.b.error, this.f132993e);
            if (th2 != null) {
                n.this.f132977f.i(th2);
            }
            n.this.a0().r(q.Error);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(Snapshot snapshot) {
            n.this.X().r(new a.C1464a(snapshot));
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            n.this.i0(p3.b.success, this.f132993e);
            n.this.a0().r(q.Completed);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ij.a
    public n(@NotNull b4 snapshotManager, @NotNull w userAuthorization, @NotNull com.planner5d.library.model.manager.w featureConfigManager, @NotNull f1 helperSnapshotCreate, @NotNull t0 userPurchases, @NotNull c2 messageManager) {
        Intrinsics.checkNotNullParameter(snapshotManager, "snapshotManager");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        Intrinsics.checkNotNullParameter(helperSnapshotCreate, "helperSnapshotCreate");
        Intrinsics.checkNotNullParameter(userPurchases, "userPurchases");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        this.f132972a = snapshotManager;
        this.f132973b = userAuthorization;
        this.f132974c = featureConfigManager;
        this.f132975d = helperSnapshotCreate;
        this.f132976e = userPurchases;
        this.f132977f = messageManager;
        ArrayList<vd.b> arrayList = new ArrayList<>();
        this.f132978g = arrayList;
        c1<vd.b> c1Var = new c1<>();
        this.f132979h = c1Var;
        c1<q> c1Var2 = new c1<>(q.Initial);
        this.f132980i = c1Var2;
        Boolean bool = Boolean.FALSE;
        this.f132981j = new c1<>(bool);
        this.f132982k = new c1<>(bool);
        this.f132983l = v1.l(v1.f229769a, null, 1, null);
        c1Var2.r(q.Loading);
        boolean zJ = snapshotManager.J();
        if (featureConfigManager.a(com.planner5d.library.model.manager.config.f.ProAndroid)) {
            arrayList.add(vd.b.PRO4K);
        }
        if (zJ && userAuthorization.b()) {
            arrayList.add(vd.b.HD);
        }
        if (zJ && userAuthorization.b()) {
            arrayList.add(vd.b.DRAFT);
        }
        c1Var.r(CollectionsKt.first((List) arrayList));
        c1Var2.r(q.Completed);
    }

    private final void c0() {
        this.f132980i.r(q.Loading);
        gd.a aVarD0 = d0();
        this.f132972a.n0(this.f132976e, this.f132973b.a(), aVarD0.f275442a).subscribe((Subscriber<? super Void>) new b(aVarD0));
    }

    private final gd.a d0() {
        vd.b bVarF = this.f132979h.f();
        Intrinsics.checkNotNull(bVarF);
        Boolean boolF = this.f132982k.f();
        Intrinsics.checkNotNull(boolF);
        boolean zBooleanValue = boolF.booleanValue();
        Boolean boolF2 = this.f132981j.f();
        Intrinsics.checkNotNull(boolF2);
        return new gd.a(bVarF, zBooleanValue, boolF2.booleanValue());
    }

    private final void h0(Activity activity, View view, long j10, long j11, String str, vd.a aVar) {
        this.f132980i.r(q.Loading);
        i0(p3.b.submit, j11);
        this.f132975d.d(view, activity.getString(com.planner5d.library.f.s.f169364q5), null, j10, td.a.f380845a.n(activity, str), aVar, d0()).subscribe((Subscriber<? super Snapshot>) new c(j11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0(p3.b bVar, long j10) {
        vd.b bVarF = this.f132979h.f();
        if (bVarF != null) {
            com.planner5d.library.model.manager.statistics.events.b4.e statisticsType = bVarF.f385735f;
            Intrinsics.checkNotNullExpressionValue(statisticsType, "statisticsType");
            u2.H1(statisticsType, com.planner5d.library.model.manager.statistics.events.b4.d.cloud, bVar, Long.valueOf(j10));
        }
    }

    @NotNull
    public final c1<Boolean> W() {
        return this.f132981j;
    }

    @NotNull
    public final v1.a<a> X() {
        return this.f132983l;
    }

    @NotNull
    public final c1<Boolean> Y() {
        return this.f132982k;
    }

    @NotNull
    public final c1<vd.b> Z() {
        return this.f132979h;
    }

    @NotNull
    public final c1<q> a0() {
        return this.f132980i;
    }

    @NotNull
    public final ArrayList<vd.b> b0() {
        return this.f132978g;
    }

    public final void f0(@NotNull gd.a renderSettings) {
        Intrinsics.checkNotNullParameter(renderSettings, "renderSettings");
        if (this.f132984m) {
            return;
        }
        this.f132979h.r(renderSettings.f275442a);
        this.f132981j.r(Boolean.valueOf(renderSettings.f275444c));
        this.f132982k.r(Boolean.valueOf(renderSettings.f275443b));
        this.f132984m = true;
    }

    @e.a({"WrongThread"})
    @l0
    public final void g0(@NotNull Activity activity, @NotNull View viewForPreloader, long j10, long j11, @Nullable String str, @NotNull vd.a renderCamera) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(viewForPreloader, "viewForPreloader");
        Intrinsics.checkNotNullParameter(renderCamera, "renderCamera");
        if (this.f132974c.a(com.planner5d.library.model.manager.config.f.RenderFlowUpdate)) {
            c0();
        } else {
            h0(activity, viewForPreloader, j10, j11, str, renderCamera);
        }
    }
}
