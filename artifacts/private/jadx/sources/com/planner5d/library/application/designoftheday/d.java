package com.planner5d.library.application.designoftheday;

import android.os.Bundle;
import android.os.Parcelable;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.feed.FeedFragment;
import com.planner5d.library.activity.fragment.gallery.Gallery;
import com.planner5d.library.activity.fragment.x;
import com.planner5d.library.model.h;
import com.planner5d.library.model.manager.q0;
import com.planner5d.library.model.manager.statistics.events.b4;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.i;
import com.planner5d.library.services.utility.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.a3;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@ij.f
public final class d implements kc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f142507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final x f142508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final ka.b f142509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.feed.usecase.b f142510d;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.application.designoftheday.DesignOfTheDayNavigation$navigateGalleryProject$1", f = "DesignOfTheDayNavigation.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nDesignOfTheDayNavigation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DesignOfTheDayNavigation.kt\ncom/planner5d/library/application/designoftheday/DesignOfTheDayNavigation$navigateGalleryProject$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,66:1\n295#2,2:67\n1557#2:69\n1628#2,3:70\n*S KotlinDebug\n*F\n+ 1 DesignOfTheDayNavigation.kt\ncom/planner5d/library/application/designoftheday/DesignOfTheDayNavigation$navigateGalleryProject$1\n*L\n45#1:67,2\n46#1:69\n46#1:70,3\n*E\n"})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f142511a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f142513c;

        /* JADX INFO: renamed from: com.planner5d.library.application.designoftheday.d$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.application.designoftheday.DesignOfTheDayNavigation$navigateGalleryProject$1$1", f = "DesignOfTheDayNavigation.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C1515a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f142514a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f142515b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ h f142516c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ ArrayList<Parcelable> f142517d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1515a(d dVar, h hVar, ArrayList<Parcelable> arrayList, kotlin.coroutines.d<? super C1515a> dVar2) {
                super(2, dVar2);
                this.f142515b = dVar;
                this.f142516c = hVar;
                this.f142517d = arrayList;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C1515a(this.f142515b, this.f142516c, this.f142517d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f142514a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                x.g(this.f142515b.f142508b, new com.planner5d.library.activity.helper.event.content.d(this.f142516c, new q0.d(q0.c.ideas, q0.e.popular, null, null), this.f142516c, b4.c.home_page).a(new i().k(r.designsOfDay, this.f142517d).a()).k(new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) FeedFragment.class, (Bundle) null)), false, 2, null);
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C1515a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f142513c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return d.this.new a(this.f142513c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object next;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f142511a;
            if (i10 == 0) {
                ResultKt.m(obj);
                List listA = d.this.f142510d.a(d.this.f142509c.a(d.this.f142507a));
                String str = this.f142513c;
                Iterator it = listA.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(((h) next).f180740b, str));
                h hVar = (h) next;
                if (hVar == null) {
                    return Unit.f312394a;
                }
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listA, 10));
                Iterator it2 = listA.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((h) it2.next()).f());
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                a3 a3VarA = s.f229729a.a();
                C1515a c1515a = new C1515a(d.this, hVar, arrayList2, null);
                this.f142511a = 1;
                if (kotlinx.coroutines.i.h(a3VarA, c1515a, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public d(@NotNull com.planner5d.library.application.b application, @NotNull x navigator, @NotNull ka.b readGalleryRecordsUseCase, @NotNull com.planner5d.library.feed.usecase.b selectDesignOfTheDayDataWindowUseCase) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(readGalleryRecordsUseCase, "readGalleryRecordsUseCase");
        Intrinsics.checkNotNullParameter(selectDesignOfTheDayDataWindowUseCase, "selectDesignOfTheDayDataWindowUseCase");
        this.f142507a = application;
        this.f142508b = navigator;
        this.f142509c = readGalleryRecordsUseCase;
        this.f142510d = selectDesignOfTheDayDataWindowUseCase;
    }

    @Override // kc.b
    public void a(@NotNull String recordId) {
        Intrinsics.checkNotNullParameter(recordId, "recordId");
        k.f(f2.f314023a, s.f229729a.h(), null, new a(recordId, null), 2, null);
    }

    @Override // kc.b
    public void b() {
        x.g(this.f142508b, new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) Gallery.class, new i().t(r.tab, r.snapshotsList).a()).j(null), false, 2, null);
    }
}
