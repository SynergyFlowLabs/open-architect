package com.planner5d.library.services.render;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.l0;
import androidx.compose.runtime.internal.w0;
import androidx.core.app.w;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.projects.ProjectsPagesFragment;
import com.planner5d.library.activity.fragment.x;
import com.planner5d.library.model.manager.i;
import com.planner5d.library.model.manager.j2;
import com.planner5d.library.model.snapshot.Snapshot;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.f1;
import com.planner5d.library.services.utility.s;
import fg.e;
import ij.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@w0(parameters = 0)
@f
@SourceDebugExtension({"SMAP\nRenderNotification.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderNotification.kt\ncom/planner5d/library/services/render/RenderNotification\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,113:1\n1557#2:114\n1628#2,3:115\n*S KotlinDebug\n*F\n+ 1 RenderNotification.kt\ncom/planner5d/library/services/render/RenderNotification\n*L\n75#1:114\n75#1:115,3\n*E\n"})
public final class a extends com.planner5d.library.services.notification.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f224893l = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f224894g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final j2 f224895h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final x f224896i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final e<i> f224897j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final f1 f224898k;

    /* JADX INFO: renamed from: com.planner5d.library.services.render.a$a, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.render.RenderNotification", f = "RenderNotification.kt", i = {0, 0}, l = {48}, m = "setRenderingFinished", n = {"this", "finishedSnapshots"}, s = {"L$0", "L$1"})
    static final class C1678a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f224899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f224900b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f224901c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224903e;

        C1678a(kotlin.coroutines.d<? super C1678a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f224901c = obj;
            this.f224903e |= Integer.MIN_VALUE;
            return a.this.p(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.render.RenderNotification$updateNotification$1", f = "RenderNotification.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nRenderNotification.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderNotification.kt\ncom/planner5d/library/services/render/RenderNotification$updateNotification$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,113:1\n1971#2,14:114\n*S KotlinDebug\n*F\n+ 1 RenderNotification.kt\ncom/planner5d/library/services/render/RenderNotification$updateNotification$1\n*L\n58#1:114,14\n*E\n"})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f224904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Collection<Snapshot> f224905b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f224906c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f224907d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Collection<? extends Snapshot> collection, a aVar, long j10, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f224905b = collection;
            this.f224906c = aVar;
            this.f224907d = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit m(Snapshot snapshot, Intent intent) {
            intent.putExtra(r.targetSnapshotUid.f224891a, snapshot != null ? snapshot.uid : null);
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f224905b, this.f224906c, this.f224907d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f224904a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            Iterator<T> it = this.f224905b.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    Date date = ((Snapshot) next).dateUpdated;
                    do {
                        Object next2 = it.next();
                        Date date2 = ((Snapshot) next2).dateUpdated;
                        if (date.compareTo(date2) < 0) {
                            next = next2;
                            date = date2;
                        }
                    } while (it.hasNext());
                }
                obj2 = next;
            } else {
                obj2 = null;
            }
            final Snapshot snapshot = (Snapshot) obj2;
            Notification notificationH = this.f224906c.c(this.f224907d, new Function1() { // from class: com.planner5d.library.services.render.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return a.b.m(snapshot, (Intent) obj3);
                }
            }).N(this.f224906c.o(this.f224905b)).h();
            Intrinsics.checkNotNullExpressionValue(notificationH, "build(...)");
            if (androidx.core.content.d.a(this.f224906c.f224894g, "android.permission.POST_NOTIFICATIONS") == 0) {
                this.f224906c.f224895h.c(this.f224906c.f(), notificationH);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ij.a
    public a(@NotNull com.planner5d.library.application.b application, @NotNull j2 notificationManager, @NotNull x navigator, @NotNull e<i> consumableIntentRepository, @NotNull f1 coroutineScope) {
        super(application, notificationManager, consumableIntentRepository, coroutineScope);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(notificationManager, "notificationManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(consumableIntentRepository, "consumableIntentRepository");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f224894g = application;
        this.f224895h = notificationManager;
        this.f224896i = navigator;
        this.f224897j = consumableIntentRepository;
        this.f224898k = coroutineScope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CharSequence o(Collection<? extends Snapshot> collection) {
        Collection<? extends Snapshot> collection2 = collection;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Snapshot) it.next()).c());
        }
        Set setMinus = SetsKt.minus((Set<? extends gd.c>) CollectionsKt.toSet(arrayList), gd.c.UNKNOWN);
        String string = this.f224894g.getString((setMinus.contains(gd.c.ENHANCE) && setMinus.size() == 1) ? com.planner5d.library.f.s.f169055d8 : com.planner5d.library.f.s.vz);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    private final void q(long j10, Collection<? extends Snapshot> collection) {
        int i10 = 6 | 0;
        k.f(this.f224898k, s.f229729a.a(), null, new b(collection, this, j10, null), 2, null);
    }

    @Override // com.planner5d.library.services.notification.a
    @NotNull
    protected w.n c(long j10, @Nullable Function1<? super Intent, Unit> function1) {
        w.n nVarD0 = super.c(j10, function1).i0(h() != null).d0(-16711936, 1000, 2000);
        Intrinsics.checkNotNullExpressionValue(nVarD0, "setLights(...)");
        return nVarD0;
    }

    @Override // com.planner5d.library.services.notification.a
    @NotNull
    protected j2.a e() {
        return j2.a.Render;
    }

    @Override // com.planner5d.library.services.notification.a
    protected int f() {
        return 7;
    }

    @Override // com.planner5d.library.services.notification.a
    @NotNull
    protected r g() {
        return r.renderNotification;
    }

    @Override // com.planner5d.library.services.notification.a
    @l0
    protected void i(long j10, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        k(null);
        super.i(j10, intent);
        com.planner5d.library.services.utility.i iVar = new com.planner5d.library.services.utility.i();
        r rVar = r.targetSnapshotUid;
        Bundle bundleA = iVar.j(rVar, intent.getStringExtra(rVar.f224891a)).a();
        x xVar = this.f224896i;
        com.planner5d.library.services.utility.i iVar2 = new com.planner5d.library.services.utility.i();
        r rVar2 = r.tab;
        r rVar3 = r.snapshotsList;
        x.g(xVar, new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) ProjectsPagesFragment.class, iVar2.t(rVar2, rVar3).h(rVar3, bundleA).a()), false, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object p(@NotNull Collection<? extends Snapshot> collection, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        C1678a c1678a;
        if (dVar instanceof C1678a) {
            c1678a = (C1678a) dVar;
            int i10 = c1678a.f224903e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1678a.f224903e = i10 - Integer.MIN_VALUE;
            } else {
                c1678a = new C1678a(dVar);
            }
        } else {
            c1678a = new C1678a(dVar);
        }
        Object objL = c1678a.f224901c;
        Object objL2 = kotlin.coroutines.intrinsics.b.l();
        int i11 = c1678a.f224903e;
        if (i11 == 0) {
            ResultKt.m(objL);
            i iVar = this.f224897j.get();
            int iF = f();
            c1678a.f224899a = this;
            c1678a.f224900b = collection;
            c1678a.f224903e = 1;
            objL = iVar.l(iF, c1678a);
            if (objL == objL2) {
                return objL2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            collection = (Collection) c1678a.f224900b;
            this = (a) c1678a.f224899a;
            ResultKt.m(objL);
        }
        long jLongValue = ((Number) objL).longValue();
        if (this.h() == null) {
            this.k(kotlin.coroutines.jvm.internal.b.g(System.currentTimeMillis()));
            this.q(jLongValue, collection);
        }
        return Unit.f312394a;
    }
}
