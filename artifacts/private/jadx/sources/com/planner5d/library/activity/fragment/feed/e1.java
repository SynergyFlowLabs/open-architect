package com.planner5d.library.activity.fragment.feed;

import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.g2;
import androidx.paging.q1;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.list.l1;
import com.planner5d.library.activity.fragment.projects.ProjectsPagesFragment;
import com.planner5d.library.database.model.contest.Contest;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.LogRecord;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.statistics.events.j3;
import com.planner5d.library.model.manager.statistics.events.l3;
import com.planner5d.library.model.manager.statistics.events.q3;
import com.planner5d.library.model.manager.statistics.events.x3;
import com.planner5d.library.model.manager.t1;
import com.planner5d.library.model.manager.y1;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.exceptions.ErrorMessageParser;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.u2;
import com.planner5d.library.services.utility.v1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@e.a({"NullSafeMutableLiveData"})
@SourceDebugExtension({"SMAP\nFeedViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedViewModel.kt\ncom/planner5d/library/activity/fragment/feed/FeedViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Uri.kt\nandroidx/core/net/UriKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,554:1\n1863#2:555\n774#2:556\n865#2,2:557\n1557#2:559\n1628#2,3:560\n774#2:563\n865#2,2:564\n1557#2:566\n1628#2,3:567\n1864#2:570\n1053#2:573\n774#2:576\n865#2,2:577\n1863#2,2:579\n1557#2:581\n1628#2,3:582\n1#3:571\n29#4:572\n216#5,2:574\n*S KotlinDebug\n*F\n+ 1 FeedViewModel.kt\ncom/planner5d/library/activity/fragment/feed/FeedViewModel\n*L\n172#1:555\n173#1:556\n173#1:557,2\n173#1:559\n173#1:560,3\n174#1:563\n174#1:564,2\n174#1:566\n174#1:567,3\n172#1:570\n260#1:573\n532#1:576\n532#1:577,2\n532#1:579,2\n404#1:581\n404#1:582,3\n218#1:572\n527#1:574,2\n*E\n"})
public final class e1 extends com.planner5d.library.activity.fragment.projects.e0 implements ja.c, ja.b, ja.a {
    public static final int D3 = 8;

    @NotNull
    private final v1.a<com.planner5d.library.activity.fragment.feed.a> A3;

    @NotNull
    private final kotlin.f0 B3;

    @NotNull
    private final n0 C3;

    @NotNull
    private final com.planner5d.library.model.manager.config.j H1;

    @NotNull
    private final com.planner5d.library.model.manager.contest.g X;

    @NotNull
    private final b2 Y;

    @NotNull
    private final com.planner5d.library.model.manager.b Z;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.synchronization.i f133214g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.projects.c0 f133215h3;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.feed.b f133216i3;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.p f133217j3;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @NotNull
    private final ka.d f133218k3;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @NotNull
    private final j3 f133219l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @Nullable
    private final com.planner5d.library.activity.fragment.projects.g f133220m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @Nullable
    private final com.planner5d.library.activity.fragment.projects.z0 f133221n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @NotNull
    private final ErrorMessageParser f133222o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    private final c2 f133223p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NotNull
    private final t1 f133224p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.contest.data.f f133225p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @NotNull
    private final List<ja.c.a> f133226p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    @NotNull
    private final List<Pair<ja.a.InterfaceC2239a, hc.a.EnumC1914a>> f133227q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.statistics.b<q3.d> f133228r3;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private final int f133229s3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f133230t;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.c1<List<Integer>> f133231t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.c1<Map<Integer, List<jc.a>>> f133232u3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.x f133233v;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private final boolean f133234v3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final y1 f133235w;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    @NotNull
    private final v1.a<Pair<Uri, String>> f133236w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.c1<q1<hc.a>> f133237x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<l1.k> f133238y3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.c1<Boolean> f133239z3;

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 FeedViewModel.kt\ncom/planner5d/library/activity/fragment/feed/FeedViewModel\n*L\n1#1,102:1\n260#2:103\n*E\n"})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            Integer num = (Integer) t10;
            Integer num2 = (Integer) t11;
            return kotlin.comparisons.a.l(Integer.valueOf(num != null ? num.intValue() : -1), Integer.valueOf(num2 != null ? num2.intValue() : -1));
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.feed.FeedViewModel", f = "FeedViewModel.kt", i = {0}, l = {170}, m = "updateUploadPlanTasks", n = {"this"}, s = {"L$0"})
    static final class a0 extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f133240a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f133241b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f133243d;

        a0(kotlin.coroutines.d<? super a0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f133241b = obj;
            this.f133243d |= Integer.MIN_VALUE;
            return e1.this.L1(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.feed.FeedViewModel$createPagedList$1$1", f = "FeedViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f133244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f133245b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Runnable runnable, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f133245b = runnable;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f133245b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f133244a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            this.f133245b.run();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.feed.FeedViewModel$createPagedList$2$1", f = "FeedViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f133246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f133247b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Runnable runnable, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f133247b = runnable;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f133247b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f133246a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            this.f133247b.run();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.feed.FeedViewModel$disableChatTooltip$1", f = "FeedViewModel.kt", i = {}, l = {539}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f133248a;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e1.this.new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f133248a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.model.manager.config.p pVar = e1.this.f133217j3;
                com.planner5d.library.services.r rVar = com.planner5d.library.services.r.chatTooltipEnabled;
                this.f133248a = 1;
                if (pVar.L(rVar, false, this) == objL) {
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
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.feed.FeedViewModel$editContest$1", f = "FeedViewModel.kt", i = {}, l = {androidx.constraintlayout.core.motion.utils.v.a.f43974q}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f133250a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Contest f133252c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f133253d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Contest contest, int i10, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f133252c = contest;
            this.f133253d = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e1.this.new e(this.f133252c, this.f133253d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f133250a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.contest.data.f fVar = e1.this.f133225p2;
                Contest contest = this.f133252c;
                com.planner5d.library.activity.helper.event.content.c cVarL1 = e1.this.l1(this.f133253d);
                this.f133250a = 1;
                if (fVar.k(contest, cVarL1, this) == objL) {
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
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.feed.FeedViewModel$executeCatchingErrors$2", f = "FeedViewModel.kt", i = {}, l = {390, 392}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<com.planner5d.library.activity.fragment.list.b0.b, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f133254a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<kotlin.coroutines.d<? super Unit>, Object> f133255b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e1 f133256c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, e1 e1Var, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f133255b = function1;
            this.f133256c = e1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new f(this.f133255b, this.f133256c, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
        
            if (r5 == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
        
            if (r1.F1(r6, r5) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
        
            return r0;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v8 */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r5.f133254a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L12
                kotlin.ResultKt.m(r6)
                goto L41
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r4 = 4
                r5.<init>(r6)
                r4 = 3
                throw r5
            L1c:
                kotlin.ResultKt.m(r6)     // Catch: java.lang.Throwable -> L21
                r4 = 3
                goto L41
            L21:
                r6 = move-exception
                r4 = 3
                goto L34
            L24:
                kotlin.ResultKt.m(r6)
                kotlin.jvm.functions.Function1<kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object> r6 = r5.f133255b     // Catch: java.lang.Throwable -> L21
                r4 = 5
                r5.f133254a = r3     // Catch: java.lang.Throwable -> L21
                java.lang.Object r5 = r6.invoke(r5)     // Catch: java.lang.Throwable -> L21
                r4 = 3
                if (r5 != r0) goto L41
                goto L40
            L34:
                com.planner5d.library.activity.fragment.feed.e1 r1 = r5.f133256c
                r4 = 4
                r5.f133254a = r2
                r4 = 0
                java.lang.Object r5 = com.planner5d.library.activity.fragment.feed.e1.R0(r1, r6, r5)
                if (r5 != r0) goto L41
            L40:
                return r0
            L41:
                kotlin.Unit r5 = kotlin.Unit.f312394a
                r4 = 5
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.feed.e1.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.planner5d.library.activity.fragment.list.b0.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(bVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.feed.FeedViewModel", f = "FeedViewModel.kt", i = {0, 1, 2, 3, 3}, l = {263, 264, 277, 278}, m = "fetchBlogPosts", n = {"this", "this", "this", "this", "categories"}, s = {"L$0", "L$0", "L$0", "L$0", "L$1"})
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f133257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f133258b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f133259c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f133261e;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f133259c = obj;
            this.f133261e |= Integer.MIN_VALUE;
            return e1.this.e1(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.feed.FeedViewModel$fetchBlogPosts$mapDb$1", f = "FeedViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nFeedViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedViewModel.kt\ncom/planner5d/library/activity/fragment/feed/FeedViewModel$fetchBlogPosts$mapDb$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,554:1\n1485#2:555\n1510#2,3:556\n1513#2,3:566\n381#3,7:559\n*S KotlinDebug\n*F\n+ 1 FeedViewModel.kt\ncom/planner5d/library/activity/fragment/feed/FeedViewModel$fetchBlogPosts$mapDb$1\n*L\n265#1:555\n265#1:556,3\n265#1:566,3\n265#1:559,7\n*E\n"})
    static final class h extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Map<Integer, ? extends List<? extends jc.a>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f133262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<jc.a> f133263b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(List<jc.a> list, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f133263b = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new h(this.f133263b, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Map<Integer, ? extends List<? extends jc.a>>> dVar) {
            return invoke2(s0Var, (kotlin.coroutines.d<? super Map<Integer, ? extends List<jc.a>>>) dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f133262a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            List<jc.a> list = this.f133263b;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : list) {
                Integer numB = ((jc.a) obj2).b();
                Object arrayList = linkedHashMap.get(numB);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(numB, arrayList);
                }
                ((List) arrayList).add(obj2);
            }
            return linkedHashMap;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Map<Integer, ? extends List<jc.a>>> dVar) {
            return ((h) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.feed.FeedViewModel", f = "FeedViewModel.kt", i = {}, l = {502}, m = "getDesignGeneratorStartButtonLabel", n = {}, s = {})
    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f133264a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f133266c;

        i(kotlin.coroutines.d<? super i> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f133264a = obj;
            this.f133266c |= Integer.MIN_VALUE;
            return e1.this.n(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.feed.FeedViewModel$joinContest$1", f = "FeedViewModel.kt", i = {}, l = {306}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f133267a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Contest f133269c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f133270d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Contest contest, int i10, kotlin.coroutines.d<? super j> dVar) {
            super(2, dVar);
            this.f133269c = contest;
            this.f133270d = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e1.this.new j(this.f133269c, this.f133270d, dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v11 */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f133267a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    com.planner5d.library.contest.data.f fVar = e1.this.f133225p2;
                    Contest contest = this.f133269c;
                    com.planner5d.library.activity.fragment.list.b0 b0VarG1 = e1.this.g1();
                    com.planner5d.library.activity.helper.event.content.c cVarL1 = e1.this.l1(this.f133270d);
                    this.f133267a = 1;
                    Object objP = fVar.p(contest, b0VarG1, cVarL1, this);
                    this = objP;
                    if (objP == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    this = this;
                }
            } catch (Exception e10) {
                b2 b2Var = e1.this.Y;
                int i11 = com.planner5d.library.f.s.f169460u4;
                String message = e10.getMessage();
                if (message == null) {
                    message = e1.this.f133230t.getString(com.planner5d.library.f.s.qG);
                    Intrinsics.checkNotNullExpressionValue(message, "getString(...)");
                }
                b2Var.r(new ErrorMessageException(i11, message));
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((j) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.feed.FeedViewModel", f = "FeedViewModel.kt", i = {0, 0, 0}, l = {163, 166}, m = "loadItems", n = {"this", "refreshSynchronized", "refreshDesignOfTheDay"}, s = {"L$0", "Z$0", "Z$1"})
    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f133271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f133272b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f133273c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f133274d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f133276f;

        k(kotlin.coroutines.d<? super k> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f133274d = obj;
            this.f133276f |= Integer.MIN_VALUE;
            return e1.this.q1(false, false, false, false, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.feed.FeedViewModel$loadItems$2", f = "FeedViewModel.kt", i = {}, l = {androidx.media2.widget.f.i.f59793p0}, m = "invokeSuspend", n = {}, s = {})
    static final class l extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f133277a;

        l(kotlin.coroutines.d<? super l> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e1.this.new l(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f133277a;
            if (i10 == 0) {
                ResultKt.m(obj);
                e1 e1Var = e1.this;
                this.f133277a = 1;
                if (e1Var.e1(this) == objL) {
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
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((l) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.feed.FeedViewModel$loadItems$3", f = "FeedViewModel.kt", i = {}, l = {160}, m = "invokeSuspend", n = {}, s = {})
    static final class m extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f133279a;

        m(kotlin.coroutines.d<? super m> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e1.this.new m(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f133279a;
            if (i10 == 0) {
                ResultKt.m(obj);
                e1 e1Var = e1.this;
                this.f133279a = 1;
                if (e1Var.L1(this) == objL) {
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
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((m) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.feed.FeedViewModel", f = "FeedViewModel.kt", i = {0, 1, 1}, l = {432, 433, 450}, m = "notifyAboutVoting", n = {"this", "this", "contest"}, s = {"L$0", "L$0", "L$1"})
    static final class n extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f133281a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f133282b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f133283c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f133285e;

        n(kotlin.coroutines.d<? super n> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f133283c = obj;
            this.f133285e |= Integer.MIN_VALUE;
            return e1.this.r1(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.feed.FeedViewModel$onActivityCreated$1", f = "FeedViewModel.kt", i = {}, l = {476}, m = "invokeSuspend", n = {}, s = {})
    static final class o extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f133286a;

        o(kotlin.coroutines.d<? super o> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e1.this.new o(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f133286a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.model.manager.config.p pVar = e1.this.f133217j3;
                com.planner5d.library.services.r rVar = com.planner5d.library.services.r.chatTooltipEnabled;
                this.f133286a = 1;
                obj = pVar.G(rVar, true, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                e1.this.k1().r(kotlin.coroutines.jvm.internal.b.a(true));
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((o) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.feed.FeedViewModel$onClickItem$1", f = "FeedViewModel.kt", i = {}, l = {195}, m = "invokeSuspend", n = {}, s = {})
    static final class p extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f133288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f133289b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f133290c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f133291d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f133293f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Bundle f133294g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(Object obj, Bundle bundle, kotlin.coroutines.d<? super p> dVar) {
            super(2, dVar);
            this.f133293f = obj;
            this.f133294g = bundle;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e1.this.new p(this.f133293f, this.f133294g, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Project project;
            com.planner5d.library.activity.fragment.projects.e0 e0Var;
            Bundle bundle;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f133291d;
            if (i10 == 0) {
                ResultKt.m(obj);
                e1 e1Var = e1.this;
                project = (Project) this.f133293f;
                Bundle bundle2 = this.f133294g;
                this.f133288a = e1Var;
                this.f133289b = project;
                this.f133290c = bundle2;
                this.f133291d = 1;
                Object objO0 = e1Var.o0(this);
                if (objO0 == objL) {
                    return objL;
                }
                e0Var = e1Var;
                bundle = bundle2;
                obj = objO0;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Bundle bundle3 = (Bundle) this.f133290c;
                project = (Project) this.f133289b;
                com.planner5d.library.activity.fragment.projects.e0 e0Var2 = (com.planner5d.library.activity.fragment.projects.e0) this.f133288a;
                ResultKt.m(obj);
                e0Var = e0Var2;
                bundle = bundle3;
            }
            com.planner5d.library.activity.fragment.projects.e0.q0(e0Var, project, bundle, ((Boolean) obj).booleanValue(), true, false, null, 48, null);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((p) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.feed.FeedViewModel$refresh$1", f = "FeedViewModel.kt", i = {0, 1, 2, 3}, l = {com.facebook.internal.p.f100031o, 342, 347, 349, 351}, m = "invokeSuspend", n = {"$this$queueForeground", "$this$queueForeground", "$this$queueForeground", "$this$queueForeground"}, s = {"L$0", "L$0", "L$0", "L$0"})
    static final class q extends kotlin.coroutines.jvm.internal.o implements Function2<com.planner5d.library.activity.fragment.list.b0.b, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f133295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f133296b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f133297c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ e1 f133298d;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.feed.FeedViewModel$refresh$1$1", f = "FeedViewModel.kt", i = {}, l = {com.facebook.internal.p.f100031o}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f133299a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e1 f133300b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e1 e1Var, kotlin.coroutines.d<? super a> dVar) {
                super(1, dVar);
                this.f133300b = e1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
                return new a(this.f133300b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f133299a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    e1 e1Var = this.f133300b;
                    this.f133299a = 1;
                    if (e1Var.B1(this) == objL) {
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

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.feed.FeedViewModel$refresh$1$2", f = "FeedViewModel.kt", i = {}, l = {344}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f133301a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e1 f133302b;

            @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.feed.FeedViewModel$refresh$1$2$1", f = "FeedViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f133303a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ e1 f133304b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(e1 e1Var, kotlin.coroutines.d<? super a> dVar) {
                    super(2, dVar);
                    this.f133304b = e1Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new a(this.f133304b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    kotlin.coroutines.intrinsics.b.l();
                    if (this.f133303a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    this.f133304b.f133214g3.v();
                    return Unit.f312394a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(e1 e1Var, kotlin.coroutines.d<? super b> dVar) {
                super(1, dVar);
                this.f133302b = e1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
                return new b(this.f133302b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f133301a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    this.f133302b.H1(true);
                    z1 z1VarH = com.planner5d.library.services.utility.s.f229729a.h();
                    a aVar = new a(this.f133302b, null);
                    this.f133301a = 1;
                    if (kotlinx.coroutines.i.h(z1VarH, aVar, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                this.f133302b.H1(false);
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
                return ((b) create(dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.feed.FeedViewModel$refresh$1$3", f = "FeedViewModel.kt", i = {}, l = {347}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f133305a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e1 f133306b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(e1 e1Var, kotlin.coroutines.d<? super c> dVar) {
                super(1, dVar);
                this.f133306b = e1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
                return new c(this.f133306b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f133305a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    e1 e1Var = this.f133306b;
                    this.f133305a = 1;
                    if (e1Var.C1(this) == objL) {
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

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
                return ((c) create(dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.feed.FeedViewModel$refresh$1$4", f = "FeedViewModel.kt", i = {}, l = {349}, m = "invokeSuspend", n = {}, s = {})
        static final class d extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f133307a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e1 f133308b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(e1 e1Var, kotlin.coroutines.d<? super d> dVar) {
                super(1, dVar);
                this.f133308b = e1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
                return new d(this.f133308b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f133307a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    e1 e1Var = this.f133308b;
                    this.f133307a = 1;
                    if (e1Var.A1(this) == objL) {
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

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
                return ((d) create(dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.feed.FeedViewModel$refresh$1$5", f = "FeedViewModel.kt", i = {}, l = {351}, m = "invokeSuspend", n = {}, s = {})
        static final class e extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f133309a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e1 f133310b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(e1 e1Var, kotlin.coroutines.d<? super e> dVar) {
                super(1, dVar);
                this.f133310b = e1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
                return new e(this.f133310b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f133309a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    e1 e1Var = this.f133310b;
                    this.f133309a = 1;
                    if (e1Var.r1(this) == objL) {
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

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
                return ((e) create(dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(boolean z10, e1 e1Var, kotlin.coroutines.d<? super q> dVar) {
            super(2, dVar);
            this.f133297c = z10;
            this.f133298d = e1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            q qVar = new q(this.f133297c, this.f133298d, dVar);
            qVar.f133296b = obj;
            return qVar;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0084 A[PHI: r1
          0x0084: PHI (r1v5 com.planner5d.library.activity.fragment.list.b0$b) = (r1v4 com.planner5d.library.activity.fragment.list.b0$b), (r1v10 com.planner5d.library.activity.fragment.list.b0$b) binds: [B:22:0x0081, B:14:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:30:0x00ae A[PHI: r1
          0x00ae: PHI (r1v6 com.planner5d.library.activity.fragment.list.b0$b) = 
          (r1v3 com.planner5d.library.activity.fragment.list.b0$b)
          (r1v5 com.planner5d.library.activity.fragment.list.b0$b)
          (r1v12 com.planner5d.library.activity.fragment.list.b0$b)
         binds: [B:28:0x00ab, B:25:0x0097, B:13:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00c1, code lost:
        
            if (r11.d1(r1, r3, r4, r10) == r0) goto L32;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r9 = 7
                int r1 = r10.f133295a
                r2 = 5
                int r9 = r9 >> r2
                r3 = 4
                r9 = r3
                r4 = 3
                r5 = 2
                r6 = 1
                r9 = r9 ^ r6
                r7 = 5
                r7 = 0
                if (r1 == 0) goto L4a
                r9 = 6
                if (r1 == r6) goto L41
                if (r1 == r5) goto L39
                if (r1 == r4) goto L2f
                if (r1 == r3) goto L2f
                if (r1 != r2) goto L25
                r9 = 1
                kotlin.ResultKt.m(r11)
                r9 = 4
                goto Lc4
            L25:
                r9 = 0
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r9 = 3
                r10.<init>(r11)
                throw r10
            L2f:
                java.lang.Object r1 = r10.f133296b
                com.planner5d.library.activity.fragment.list.b0$b r1 = (com.planner5d.library.activity.fragment.list.b0.b) r1
                r9 = 4
                kotlin.ResultKt.m(r11)
                goto Lae
            L39:
                java.lang.Object r1 = r10.f133296b
                com.planner5d.library.activity.fragment.list.b0$b r1 = (com.planner5d.library.activity.fragment.list.b0.b) r1
                kotlin.ResultKt.m(r11)
                goto L84
            L41:
                java.lang.Object r1 = r10.f133296b
                com.planner5d.library.activity.fragment.list.b0$b r1 = (com.planner5d.library.activity.fragment.list.b0.b) r1
                r9 = 2
                kotlin.ResultKt.m(r11)
                goto L6e
            L4a:
                kotlin.ResultKt.m(r11)
                java.lang.Object r11 = r10.f133296b
                r1 = r11
                r1 = r11
                r9 = 4
                com.planner5d.library.activity.fragment.list.b0$b r1 = (com.planner5d.library.activity.fragment.list.b0.b) r1
                boolean r11 = r10.f133297c
                if (r11 == 0) goto L9a
                com.planner5d.library.activity.fragment.feed.e1 r11 = r10.f133298d
                com.planner5d.library.activity.fragment.list.b0$a r3 = com.planner5d.library.activity.fragment.list.b0.a.Loading
                com.planner5d.library.activity.fragment.feed.e1$q$a r8 = new com.planner5d.library.activity.fragment.feed.e1$q$a
                r8.<init>(r11, r7)
                r10.f133296b = r1
                r9 = 0
                r10.f133295a = r6
                java.lang.Object r11 = com.planner5d.library.activity.fragment.feed.e1.z0(r11, r1, r3, r8, r10)
                r9 = 6
                if (r11 != r0) goto L6e
                goto Lc3
            L6e:
                com.planner5d.library.activity.fragment.feed.e1 r11 = r10.f133298d
                com.planner5d.library.activity.fragment.list.b0$a r3 = com.planner5d.library.activity.fragment.list.b0.a.Synchronizing
                r9 = 3
                com.planner5d.library.activity.fragment.feed.e1$q$b r6 = new com.planner5d.library.activity.fragment.feed.e1$q$b
                r6.<init>(r11, r7)
                r10.f133296b = r1
                r9 = 3
                r10.f133295a = r5
                java.lang.Object r11 = com.planner5d.library.activity.fragment.feed.e1.z0(r11, r1, r3, r6, r10)
                if (r11 != r0) goto L84
                goto Lc3
            L84:
                com.planner5d.library.activity.fragment.feed.e1 r11 = r10.f133298d
                com.planner5d.library.activity.fragment.list.b0$a r3 = com.planner5d.library.activity.fragment.list.b0.a.Loading
                com.planner5d.library.activity.fragment.feed.e1$q$c r5 = new com.planner5d.library.activity.fragment.feed.e1$q$c
                r5.<init>(r11, r7)
                r10.f133296b = r1
                r9 = 5
                r10.f133295a = r4
                java.lang.Object r11 = com.planner5d.library.activity.fragment.feed.e1.z0(r11, r1, r3, r5, r10)
                r9 = 2
                if (r11 != r0) goto Lae
                goto Lc3
            L9a:
                com.planner5d.library.activity.fragment.feed.e1 r11 = r10.f133298d
                com.planner5d.library.activity.fragment.list.b0$a r4 = com.planner5d.library.activity.fragment.list.b0.a.Loading
                com.planner5d.library.activity.fragment.feed.e1$q$d r5 = new com.planner5d.library.activity.fragment.feed.e1$q$d
                r5.<init>(r11, r7)
                r10.f133296b = r1
                r10.f133295a = r3
                java.lang.Object r11 = com.planner5d.library.activity.fragment.feed.e1.z0(r11, r1, r4, r5, r10)
                if (r11 != r0) goto Lae
                goto Lc3
            Lae:
                com.planner5d.library.activity.fragment.feed.e1 r11 = r10.f133298d
                com.planner5d.library.activity.fragment.list.b0$a r3 = com.planner5d.library.activity.fragment.list.b0.a.Loading
                com.planner5d.library.activity.fragment.feed.e1$q$e r4 = new com.planner5d.library.activity.fragment.feed.e1$q$e
                r9 = 1
                r4.<init>(r11, r7)
                r10.f133296b = r7
                r9 = 3
                r10.f133295a = r2
                java.lang.Object r10 = com.planner5d.library.activity.fragment.feed.e1.z0(r11, r1, r3, r4, r10)
                if (r10 != r0) goto Lc4
            Lc3:
                return r0
            Lc4:
                kotlin.Unit r10 = kotlin.Unit.f312394a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.feed.e1.q.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.planner5d.library.activity.fragment.list.b0.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((q) create(bVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.feed.FeedViewModel", f = "FeedViewModel.kt", i = {}, l = {380}, m = "refresh", n = {}, s = {})
    static final class r extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f133311a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f133312b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f133314d;

        r(kotlin.coroutines.d<? super r> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f133312b = obj;
            this.f133314d |= Integer.MIN_VALUE;
            return e1.this.y1(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.feed.FeedViewModel$refresh$3", f = "FeedViewModel.kt", i = {}, l = {381}, m = "invokeSuspend", n = {}, s = {})
    static final class s extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super q1<hc.a>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f133315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f133316b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<kotlin.coroutines.d<? super androidx.paging.u<Integer, hc.a>>, Object> f133318d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        s(Function1<? super kotlin.coroutines.d<? super androidx.paging.u<Integer, hc.a>>, ? extends Object> function1, kotlin.coroutines.d<? super s> dVar) {
            super(2, dVar);
            this.f133318d = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e1.this.new s(this.f133318d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            e1 e1Var;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f133316b;
            if (i10 == 0) {
                ResultKt.m(obj);
                e1 e1Var2 = e1.this;
                Function1<kotlin.coroutines.d<? super androidx.paging.u<Integer, hc.a>>, Object> function1 = this.f133318d;
                this.f133315a = e1Var2;
                this.f133316b = 1;
                Object objInvoke = function1.invoke(this);
                if (objInvoke == objL) {
                    return objL;
                }
                obj = objInvoke;
                e1Var = e1Var2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e1Var = (e1) this.f133315a;
                ResultKt.m(obj);
            }
            return e1Var.Y0((androidx.paging.u) obj);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super q1<hc.a>> dVar) {
            return ((s) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.feed.FeedViewModel$refreshAll$2", f = "FeedViewModel.kt", i = {}, l = {357}, m = "invokeSuspend", n = {}, s = {})
    static final class t extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super androidx.paging.u<Integer, hc.a>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f133319a;

        t(kotlin.coroutines.d<? super t> dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return e1.this.new t(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f133319a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            e1 e1Var = e1.this;
            this.f133319a = 1;
            Object objQ1 = e1Var.q1(true, true, true, true, this);
            return objQ1 == objL ? objL : objQ1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super androidx.paging.u<Integer, hc.a>> dVar) {
            return ((t) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.feed.FeedViewModel$refreshAllExceptingSynchronized$2", f = "FeedViewModel.kt", i = {}, l = {365}, m = "invokeSuspend", n = {}, s = {})
    static final class u extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super androidx.paging.u<Integer, hc.a>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f133321a;

        u(kotlin.coroutines.d<? super u> dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return e1.this.new u(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f133321a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            e1 e1Var = e1.this;
            this.f133321a = 1;
            Object objQ1 = e1Var.q1(true, true, false, true, this);
            return objQ1 == objL ? objL : objQ1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super androidx.paging.u<Integer, hc.a>> dVar) {
            return ((u) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.feed.FeedViewModel$refreshOnlySynchronized$2", f = "FeedViewModel.kt", i = {}, l = {373}, m = "invokeSuspend", n = {}, s = {})
    static final class v extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super androidx.paging.u<Integer, hc.a>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f133323a;

        v(kotlin.coroutines.d<? super v> dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return e1.this.new v(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f133323a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            e1 e1Var = e1.this;
            this.f133323a = 1;
            Object objQ1 = e1Var.q1(false, false, true, false, this);
            return objQ1 == objL ? objL : objQ1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super androidx.paging.u<Integer, hc.a>> dVar) {
            return ((v) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.feed.FeedViewModel$reload$1", f = "FeedViewModel.kt", i = {}, l = {294}, m = "invokeSuspend", n = {}, s = {})
    static final class w extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f133325a;

        w(kotlin.coroutines.d<? super w> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e1.this.new w(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f133325a;
            if (i10 == 0) {
                ResultKt.m(obj);
                e1 e1Var = e1.this;
                this.f133325a = 1;
                if (e1Var.e1(this) == objL) {
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
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((w) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.feed.FeedViewModel$sendEvents$1", f = "FeedViewModel.kt", i = {}, l = {180}, m = "invokeSuspend", n = {}, s = {})
    static final class x extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f133327a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<com.planner5d.library.activity.fragment.projects.g.a> f133329c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        x(List<? extends com.planner5d.library.activity.fragment.projects.g.a> list, kotlin.coroutines.d<? super x> dVar) {
            super(2, dVar);
            this.f133329c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e1.this.new x(this.f133329c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f133327a;
            if (i10 == 0) {
                ResultKt.m(obj);
                ka.d dVar = e1.this.f133218k3;
                List<com.planner5d.library.activity.fragment.projects.g.a> list = this.f133329c;
                this.f133327a = 1;
                if (dVar.a(list, this) == objL) {
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
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((x) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.feed.FeedViewModel$setError$2", f = "FeedViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class y extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f133330a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f133331b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e1 f133332c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(Throwable th2, e1 e1Var, kotlin.coroutines.d<? super y> dVar) {
            super(2, dVar);
            this.f133331b = th2;
            this.f133332c = e1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new y(this.f133331b, this.f133332c, dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f133330a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            timber.log.b.f381052a.e(this.f133331b);
            androidx.lifecycle.w0<l1.k> w0VarO1 = this.f133332c.o1();
            Intrinsics.checkNotNull(w0VarO1, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.planner5d.library.activity.fragment.list.MainListViewModel.State>");
            T tF = ((androidx.lifecycle.c1) this.f133332c.o1()).f();
            Intrinsics.checkNotNull(tF);
            ((androidx.lifecycle.c1) w0VarO1).r(l1.k.d((l1.k) tF, this.f133332c.f133222o3.parse(this.f133331b, kotlin.coroutines.jvm.internal.b.f(com.planner5d.library.f.s.qG)), null, 2, null));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((y) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.feed.FeedViewModel$startDesignGenerator$1", f = "FeedViewModel.kt", i = {}, l = {492}, m = "invokeSuspend", n = {}, s = {})
    static final class z extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f133333a;

        z(kotlin.coroutines.d<? super z> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e1.this.new z(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f133333a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.model.manager.config.p pVar = e1.this.f133217j3;
                com.planner5d.library.services.r rVar = com.planner5d.library.services.r.designGeneratorVisited;
                this.f133333a = 1;
                if (pVar.L(rVar, true, this) == objL) {
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
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((z) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ij.a
    public e1(@NotNull com.planner5d.library.application.b application, @NotNull com.planner5d.library.activity.fragment.x navigator, @NotNull y1 menuManager, @NotNull com.planner5d.library.model.manager.contest.g contestManager, @NotNull b2 messageManager, @NotNull com.planner5d.library.model.manager.b blogRepository, @NotNull c2 networkStateUtility, @NotNull t1 logRecordManager, @NotNull com.planner5d.library.model.manager.config.j featureConfigManager, @NotNull com.planner5d.library.contest.data.f contestActionsHelper, @NotNull com.planner5d.library.model.manager.synchronization.i synchronizationManager, @NotNull com.planner5d.library.activity.fragment.projects.c0 sourceManager, @NotNull com.planner5d.library.activity.fragment.feed.b autoStyleListProvider, @NotNull com.planner5d.library.model.manager.config.p sharedPreferencesManager, @NotNull ka.d sendAiEventsUseCase, @NotNull j3 designGeneratorEvents, @Nullable com.planner5d.library.activity.fragment.projects.g gVar, @Nullable com.planner5d.library.activity.fragment.projects.z0 z0Var, @NotNull ErrorMessageParser errorMessageParser, @NotNull com.planner5d.library.activity.fragment.projects.h importProjectUseCase, @NotNull le.e handleNewIntentUseCase, @NotNull com.planner5d.library.model.manager.c0 folderManager, @NotNull com.planner5d.library.modules.user.user.t0 userPurchases, @NotNull com.planner5d.library.model.manager.project.d0 projectManager, @NotNull com.planner5d.library.modules.user.user.t userAuthorization, @NotNull com.planner5d.library.feed.usecase.a getDesignOfTheDayDataUseCase, @NotNull com.planner5d.library.model.manager.p favoriteManager, @NotNull com.planner5d.library.application.d configuration, @NotNull com.planner5d.library.activity.fragment.n defaultFragmentProvider) {
        super(application, projectManager, userAuthorization, userPurchases, messageManager, configuration, navigator, folderManager, menuManager, z0Var, handleNewIntentUseCase, importProjectUseCase, defaultFragmentProvider, featureConfigManager, sharedPreferencesManager);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(menuManager, "menuManager");
        Intrinsics.checkNotNullParameter(contestManager, "contestManager");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(blogRepository, "blogRepository");
        Intrinsics.checkNotNullParameter(networkStateUtility, "networkStateUtility");
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        Intrinsics.checkNotNullParameter(contestActionsHelper, "contestActionsHelper");
        Intrinsics.checkNotNullParameter(synchronizationManager, "synchronizationManager");
        Intrinsics.checkNotNullParameter(sourceManager, "sourceManager");
        Intrinsics.checkNotNullParameter(autoStyleListProvider, "autoStyleListProvider");
        Intrinsics.checkNotNullParameter(sharedPreferencesManager, "sharedPreferencesManager");
        Intrinsics.checkNotNullParameter(sendAiEventsUseCase, "sendAiEventsUseCase");
        Intrinsics.checkNotNullParameter(designGeneratorEvents, "designGeneratorEvents");
        Intrinsics.checkNotNullParameter(errorMessageParser, "errorMessageParser");
        Intrinsics.checkNotNullParameter(importProjectUseCase, "importProjectUseCase");
        Intrinsics.checkNotNullParameter(handleNewIntentUseCase, "handleNewIntentUseCase");
        Intrinsics.checkNotNullParameter(folderManager, "folderManager");
        Intrinsics.checkNotNullParameter(userPurchases, "userPurchases");
        Intrinsics.checkNotNullParameter(projectManager, "projectManager");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(getDesignOfTheDayDataUseCase, "getDesignOfTheDayDataUseCase");
        Intrinsics.checkNotNullParameter(favoriteManager, "favoriteManager");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(defaultFragmentProvider, "defaultFragmentProvider");
        this.f133230t = application;
        this.f133233v = navigator;
        this.f133235w = menuManager;
        this.X = contestManager;
        this.Y = messageManager;
        this.Z = blogRepository;
        this.f133223p0 = networkStateUtility;
        this.f133224p1 = logRecordManager;
        this.H1 = featureConfigManager;
        this.f133225p2 = contestActionsHelper;
        this.f133214g3 = synchronizationManager;
        this.f133215h3 = sourceManager;
        this.f133216i3 = autoStyleListProvider;
        this.f133217j3 = sharedPreferencesManager;
        this.f133218k3 = sendAiEventsUseCase;
        this.f133219l3 = designGeneratorEvents;
        this.f133220m3 = gVar;
        this.f133221n3 = z0Var;
        this.f133222o3 = errorMessageParser;
        this.f133226p3 = new ArrayList();
        this.f133227q3 = new ArrayList();
        this.f133228r3 = new com.planner5d.library.model.manager.statistics.b<>(q3.d.home_page);
        this.f133229s3 = 36;
        this.f133231t3 = new androidx.lifecycle.c1<>();
        this.f133232u3 = new androidx.lifecycle.c1<>();
        this.f133234v3 = true;
        v1 v1Var = v1.f229769a;
        this.f133236w3 = v1.l(v1Var, null, 1, null);
        this.f133237x3 = new androidx.lifecycle.c1<>();
        this.f133238y3 = new androidx.lifecycle.c1(new l1.k(null, null, 3, null));
        this.f133239z3 = new androidx.lifecycle.c1<>(Boolean.FALSE);
        this.A3 = v1.l(v1Var, null, 1, null);
        this.B3 = kotlin.g0.c(new Function0() { // from class: com.planner5d.library.activity.fragment.feed.c1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e1.V0(this.f133193a);
            }
        });
        this.C3 = new n0(userAuthorization, projectManager, contestManager, favoriteManager, getDesignOfTheDayDataUseCase, featureConfigManager, com.planner5d.library.services.utility.s.f229729a, g2.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object A1(kotlin.coroutines.d<? super Unit> dVar) {
        Object objY1 = y1(new t(null), dVar);
        return objY1 == kotlin.coroutines.intrinsics.b.l() ? objY1 : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object B1(kotlin.coroutines.d<? super Unit> dVar) {
        Object objY1 = y1(new u(null), dVar);
        return objY1 == kotlin.coroutines.intrinsics.b.l() ? objY1 : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object C1(kotlin.coroutines.d<? super Unit> dVar) {
        Object objY1 = y1(new v(null), dVar);
        return objY1 == kotlin.coroutines.intrinsics.b.l() ? objY1 : Unit.f312394a;
    }

    private final void E1(List<? extends com.planner5d.library.activity.fragment.projects.g.a> list) {
        kotlinx.coroutines.k.f(f2.f314023a, null, null, new x(list, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object F1(Throwable th2, kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.a(), new y(th2, this, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void H1(final boolean z10) {
        q1 q1Var;
        androidx.paging.u uVarD;
        androidx.lifecycle.w0<q1<hc.a>> w0VarM1 = m1();
        androidx.lifecycle.c1 c1Var = w0VarM1 instanceof androidx.lifecycle.c1 ? (androidx.lifecycle.c1) w0VarM1 : null;
        androidx.paging.u uVarL = (c1Var == null || (q1Var = (q1) c1Var.f()) == null || (uVarD = q1Var.D()) == null) ? null : uVarD.l(new Function1() { // from class: com.planner5d.library.activity.fragment.feed.a1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e1.I1(z10, (hc.a) obj);
            }
        });
        androidx.lifecycle.w0<q1<hc.a>> w0VarM2 = m1();
        Intrinsics.checkNotNull(w0VarM2, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<androidx.paging.PagedList<com.planner5d.library.feed.activity.fragment.FeedListItem>>");
        ((androidx.lifecycle.c1) w0VarM2).r(uVarL != null ? Y0(uVarL) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hc.a I1(boolean z10, hc.a feedItem) {
        Intrinsics.checkNotNullParameter(feedItem, "feedItem");
        if (feedItem.c() == hc.a.EnumC1914a.ProjectList) {
            hc.a.EnumC1914a enumC1914aC = feedItem.c();
            Object objB = feedItem.b();
            List list = objB instanceof List ? (List) objB : null;
            if (list != null) {
                List list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                for (Object dVar : list2) {
                    if (dVar instanceof yc.d) {
                        dVar = new yc.d(((yc.d) dVar).c(), z10);
                    }
                    arrayList.add(dVar);
                }
                return new hc.a(enumC1914aC, arrayList);
            }
        }
        return feedItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object L1(kotlin.coroutines.d<? super Unit> dVar) {
        a0 a0Var;
        if (dVar instanceof a0) {
            a0Var = (a0) dVar;
            int i10 = a0Var.f133243d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                a0Var.f133243d = i10 - Integer.MIN_VALUE;
            } else {
                a0Var = new a0(dVar);
            }
        } else {
            a0Var = new a0(dVar);
        }
        Object objA = a0Var.f133241b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = a0Var.f133243d;
        if (i11 == 0) {
            ResultKt.m(objA);
            com.planner5d.library.activity.fragment.projects.g gVar = this.f133220m3;
            if (gVar != null) {
                a0Var.f133240a = this;
                a0Var.f133243d = 1;
                objA = gVar.a(a0Var);
                if (objA == objL) {
                    return objL;
                }
            }
            return Unit.f312394a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this = (e1) a0Var.f133240a;
        ResultKt.m(objA);
        List<? extends com.planner5d.library.activity.fragment.projects.g.a> list = (List) objA;
        if (list == null) {
            return Unit.f312394a;
        }
        this.E1(list);
        for (ja.c.a aVar : this.f133226p3) {
            List<? extends com.planner5d.library.activity.fragment.projects.g.a> list2 = list;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (((com.planner5d.library.activity.fragment.projects.g.a) obj).d()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new com.planner5d.library.activity.fragment.feed.a((com.planner5d.library.activity.fragment.projects.g.a) it.next()));
            }
            aVar.d(arrayList2);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list2) {
                if (!((com.planner5d.library.activity.fragment.projects.g.a) obj2).d()) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(new com.planner5d.library.activity.fragment.feed.a((com.planner5d.library.activity.fragment.projects.g.a) it2.next()));
            }
            aVar.e(arrayList4);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.activity.fragment.list.b0 V0(final e1 e1Var) {
        return new com.planner5d.library.activity.fragment.list.b0(g2.a(e1Var), new Function1() { // from class: com.planner5d.library.activity.fragment.feed.d1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e1.W0(this.f133197a, (com.planner5d.library.activity.fragment.list.b0.a[]) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit W0(e1 e1Var, com.planner5d.library.activity.fragment.list.b0.a[] it) {
        Intrinsics.checkNotNullParameter(it, "it");
        androidx.lifecycle.w0<l1.k> w0Var = e1Var.f133238y3;
        Intrinsics.checkNotNull(w0Var, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.planner5d.library.activity.fragment.list.MainListViewModel.State>");
        T tF = ((androidx.lifecycle.c1) e1Var.f133238y3).f();
        Intrinsics.checkNotNull(tF);
        ((androidx.lifecycle.c1) w0Var).r(l1.k.d((l1.k) tF, null, it, 1, null));
        return Unit.f312394a;
    }

    private final List<Integer> X0(Map<Integer, ? extends List<jc.a>> map) {
        return CollectionsKt.sortedWith(CollectionsKt.toList(map.keySet()), new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q1<hc.a> Y0(androidx.paging.u<? extends Object, hc.a> uVar) {
        return new q1.b(uVar, this.f133229s3).i(new Executor() { // from class: com.planner5d.library.activity.fragment.feed.x0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                e1.Z0(this.f133662a, runnable);
            }
        }).f(new Executor() { // from class: com.planner5d.library.activity.fragment.feed.y0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                e1.a1(this.f133674a, runnable);
            }
        }).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z0(e1 e1Var, Runnable runnable) {
        kotlinx.coroutines.k.f(g2.a(e1Var), com.planner5d.library.services.utility.s.f229729a.a(), null, new b(runnable, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a1(e1 e1Var, Runnable runnable) {
        kotlinx.coroutines.k.f(g2.a(e1Var), com.planner5d.library.services.utility.s.f229729a.h(), null, new c(runnable, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object d1(com.planner5d.library.activity.fragment.list.b0.b bVar, com.planner5d.library.activity.fragment.list.b0.a aVar, Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        Object objA = bVar.a(aVar, new f(function1, this, null), dVar);
        return objA == kotlin.coroutines.intrinsics.b.l() ? objA : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:37:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d1 A[Catch: e | JSONException -> 0x0061, e | JSONException -> 0x0061, TRY_ENTER, TryCatch #1 {e | JSONException -> 0x0061, blocks: (B:23:0x005c, B:43:0x00e2, B:43:0x00e2, B:40:0x00d1, B:40:0x00d1), top: B:55:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e2 A[Catch: e | JSONException -> 0x0061, e | JSONException -> 0x0061, PHI: r10 r11
      0x00e2: PHI (r10v6 'this' com.planner5d.library.activity.fragment.feed.e1) = 
      (r10v5 'this' com.planner5d.library.activity.fragment.feed.e1)
      (r10v15 'this' com.planner5d.library.activity.fragment.feed.e1)
     binds: [B:41:0x00df, B:23:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x00e2: PHI (r11v16 java.lang.Object) = (r11v14 java.lang.Object), (r11v1 java.lang.Object) binds: [B:41:0x00df, B:23:0x005c] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {e | JSONException -> 0x0061, blocks: (B:23:0x005c, B:43:0x00e2, B:43:0x00e2, B:40:0x00d1, B:40:0x00d1), top: B:55:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:50:0x010d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object e1(kotlin.coroutines.d<? super Unit> dVar) {
        g gVar;
        e1 e1Var;
        Map<Integer, List<jc.a>> map;
        List<Integer> list;
        Object objT;
        List<Integer> list2;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i10 = gVar.f133261e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f133261e = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(dVar);
            }
        } else {
            gVar = new g(dVar);
        }
        Object objO = gVar.f133259c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = gVar.f133261e;
        boolean z10 = false & true;
        final Exception exc = null;
        try {
            if (i11 == 0) {
                ResultKt.m(objO);
                com.planner5d.library.model.manager.b bVar = this.Z;
                gVar.f133257a = this;
                gVar.f133261e = 1;
                objO = bVar.o(gVar);
                if (objO != objL) {
                }
                return objL;
            }
            if (i11 != 1) {
                if (i11 == 2) {
                    this = (e1) gVar.f133257a;
                    ResultKt.m(objO);
                    map = (Map) objO;
                    if (!map.isEmpty()) {
                        this.u1(map);
                        this.f133232u3.o(map);
                        this.f133231t3.o(this.X0(map));
                    }
                    if (this.f133223p0.d(this.f133230t)) {
                        com.planner5d.library.model.manager.b bVar2 = this.Z;
                        gVar.f133257a = this;
                        gVar.f133261e = 3;
                        objO = bVar2.n(gVar);
                        if (objO == objL) {
                            list = (List) objO;
                            com.planner5d.library.model.manager.b bVar3 = this.Z;
                            gVar.f133257a = this;
                            gVar.f133258b = list;
                            gVar.f133261e = 4;
                            objT = bVar3.t(list, gVar);
                            if (objT != objL) {
                                e1Var = this;
                                list2 = list;
                                objO = objT;
                                Map<Integer, List<jc.a>> map2 = (Map) objO;
                                e1Var.f133232u3.o(map2);
                                e1Var.f133231t3.o(list2);
                                e1Var.u1(map2);
                                if (exc != null) {
                                    e1Var.f133224p1.v(new ij.c() { // from class: com.planner5d.library.activity.fragment.feed.z0
                                        @Override // ij.c
                                        public final Object get() {
                                            return e1.f1(exc);
                                        }
                                    });
                                }
                            }
                        }
                        return objL;
                    }
                    return Unit.f312394a;
                }
                if (i11 != 3) {
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list2 = (List) gVar.f133258b;
                    e1Var = (e1) gVar.f133257a;
                    try {
                        ResultKt.m(objO);
                        Map<Integer, List<jc.a>> map3 = (Map) objO;
                        e1Var.f133232u3.o(map3);
                        e1Var.f133231t3.o(list2);
                        e1Var.u1(map3);
                    } catch (com.planner5d.library.api.e | JSONException e10) {
                        exc = e10;
                    }
                    if (exc != null) {
                        e1Var.f133224p1.v(new ij.c() { // from class: com.planner5d.library.activity.fragment.feed.z0
                            @Override // ij.c
                            public final Object get() {
                                return e1.f1(exc);
                            }
                        });
                    }
                    return Unit.f312394a;
                }
                this = (e1) gVar.f133257a;
                ResultKt.m(objO);
                list = (List) objO;
                com.planner5d.library.model.manager.b bVar4 = this.Z;
                gVar.f133257a = this;
                gVar.f133258b = list;
                gVar.f133261e = 4;
                objT = bVar4.t(list, gVar);
                if (objT != objL) {
                    e1Var = this;
                    list2 = list;
                    objO = objT;
                    Map<Integer, List<jc.a>> map4 = (Map) objO;
                    e1Var.f133232u3.o(map4);
                    e1Var.f133231t3.o(list2);
                    e1Var.u1(map4);
                    if (exc != null) {
                        e1Var.f133224p1.v(new ij.c() { // from class: com.planner5d.library.activity.fragment.feed.z0
                            @Override // ij.c
                            public final Object get() {
                                return e1.f1(exc);
                            }
                        });
                    }
                    return Unit.f312394a;
                }
                return objL;
            }
            this = (e1) gVar.f133257a;
            ResultKt.m(objO);
            z1 z1VarH = com.planner5d.library.services.utility.s.f229729a.h();
            h hVar = new h((List) objO, null);
            gVar.f133257a = this;
            gVar.f133261e = 2;
            objO = kotlinx.coroutines.i.h(z1VarH, hVar, gVar);
            if (objO != objL) {
                map = (Map) objO;
                if (!map.isEmpty()) {
                    this.u1(map);
                    this.f133232u3.o(map);
                    this.f133231t3.o(this.X0(map));
                }
                if (this.f133223p0.d(this.f133230t)) {
                    com.planner5d.library.model.manager.b bVar5 = this.Z;
                    gVar.f133257a = this;
                    gVar.f133261e = 3;
                    objO = bVar5.n(gVar);
                    if (objO == objL) {
                        list = (List) objO;
                        com.planner5d.library.model.manager.b bVar6 = this.Z;
                        gVar.f133257a = this;
                        gVar.f133258b = list;
                        gVar.f133261e = 4;
                        objT = bVar6.t(list, gVar);
                        if (objT != objL) {
                            e1Var = this;
                            list2 = list;
                            objO = objT;
                            Map<Integer, List<jc.a>> map5 = (Map) objO;
                            e1Var.f133232u3.o(map5);
                            e1Var.f133231t3.o(list2);
                            e1Var.u1(map5);
                            if (exc != null) {
                                e1Var.f133224p1.v(new ij.c() { // from class: com.planner5d.library.activity.fragment.feed.z0
                                    @Override // ij.c
                                    public final Object get() {
                                        return e1.f1(exc);
                                    }
                                });
                            }
                        }
                    }
                }
                return Unit.f312394a;
            }
            return objL;
        } catch (com.planner5d.library.api.e | JSONException e11) {
            e1Var = this;
            exc = e11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LogRecord f1(Exception exc) {
        return new LogRecord("fetch_blog", null, exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.planner5d.library.activity.helper.event.content.c l1(int i10) {
        return com.planner5d.library.activity.fragment.projects.e0.k0(this, b1(i10), null, 2, null);
    }

    private static Object n1(e1 e1Var) {
        return j1.t(new kotlin.jvm.internal.c1(e1Var, e1.class, "listInternal", "getListInternal()Landroidx/lifecycle/MutableLiveData;", 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0097, code lost:
    
        if (r0 == r2) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q1(boolean r14, boolean r15, boolean r16, boolean r17, kotlin.coroutines.d<? super androidx.paging.u<java.lang.Integer, hc.a>> r18) {
        /*
            r13 = this;
            r0 = r18
            boolean r1 = r0 instanceof com.planner5d.library.activity.fragment.feed.e1.k
            if (r1 == 0) goto L16
            r1 = r0
            r1 = r0
            com.planner5d.library.activity.fragment.feed.e1$k r1 = (com.planner5d.library.activity.fragment.feed.e1.k) r1
            int r2 = r1.f133276f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f133276f = r2
            goto L1b
        L16:
            com.planner5d.library.activity.fragment.feed.e1$k r1 = new com.planner5d.library.activity.fragment.feed.e1$k
            r1.<init>(r0)
        L1b:
            java.lang.Object r0 = r1.f133274d
            java.lang.Object r2 = kotlin.coroutines.intrinsics.b.l()
            int r3 = r1.f133276f
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L46
            if (r3 == r5) goto L38
            if (r3 != r4) goto L30
            kotlin.ResultKt.m(r0)
            goto L9a
        L30:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L38:
            boolean r13 = r1.f133273c
            boolean r14 = r1.f133272b
            java.lang.Object r3 = r1.f133271a
            com.planner5d.library.activity.fragment.feed.e1 r3 = (com.planner5d.library.activity.fragment.feed.e1) r3
            kotlin.ResultKt.m(r0)
            r0 = r13
            r13 = r3
            goto L8d
        L46:
            kotlin.ResultKt.m(r0)
            if (r14 == 0) goto L5b
            kotlinx.coroutines.s0 r7 = androidx.lifecycle.g2.a(r13)
            com.planner5d.library.activity.fragment.feed.e1$l r10 = new com.planner5d.library.activity.fragment.feed.e1$l
            r10.<init>(r6)
            r11 = 3
            r12 = 0
            r8 = 0
            r9 = 0
            kotlinx.coroutines.i.e(r7, r8, r9, r10, r11, r12)
        L5b:
            if (r15 == 0) goto L71
            boolean r14 = r13.f133234v3
            if (r14 == 0) goto L78
            kotlinx.coroutines.s0 r7 = androidx.lifecycle.g2.a(r13)
            com.planner5d.library.activity.fragment.feed.e1$m r10 = new com.planner5d.library.activity.fragment.feed.e1$m
            r10.<init>(r6)
            r11 = 3
            r12 = 0
            r8 = 0
            r9 = 0
            kotlinx.coroutines.i.e(r7, r8, r9, r10, r11, r12)
        L71:
            r14 = r16
            r0 = r17
            r0 = r17
            goto L8d
        L78:
            r1.f133271a = r13
            r14 = r16
            r14 = r16
            r1.f133272b = r14
            r0 = r17
            r1.f133273c = r0
            r1.f133276f = r5
            java.lang.Object r3 = r13.L1(r1)
            if (r3 != r2) goto L8d
            goto L99
        L8d:
            com.planner5d.library.activity.fragment.feed.n0 r13 = r13.C3
            r1.f133271a = r6
            r1.f133276f = r4
            java.lang.Object r0 = r13.o(r14, r0, r1)
            if (r0 != r2) goto L9a
        L99:
            return r2
        L9a:
            java.util.List r0 = (java.util.List) r0
            com.planner5d.library.services.x r13 = new com.planner5d.library.services.x
            r13.<init>(r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.feed.e1.q1(boolean, boolean, boolean, boolean, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x0075  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:33:0x0090  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00dd, code lost:
    
        if (r15.g0(r14, r0) == r1) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r1(kotlin.coroutines.d<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.feed.e1.r1(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s1(e1 e1Var, Contest contest) {
        e1Var.f133225p2.w(contest, new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) ProjectsPagesFragment.class, new com.planner5d.library.services.utility.i().t(com.planner5d.library.services.r.tab, com.planner5d.library.services.r.floorPlansList).a()), l3.b.bottom_sheet);
        return Unit.f312394a;
    }

    private final void t1(List<jc.a> list, hc.a.EnumC1914a enumC1914a) {
        List<Pair<ja.a.InterfaceC2239a, hc.a.EnumC1914a>> list2 = this.f133227q3;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (((Pair) obj).getSecond() == enumC1914a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ja.a.InterfaceC2239a) ((Pair) it.next()).getFirst()).b(list);
        }
    }

    private final void u1(Map<Integer, ? extends List<jc.a>> map) {
        for (Map.Entry<Integer, ? extends List<jc.a>> entry : map.entrySet()) {
            Integer key = entry.getKey();
            List<jc.a> value = entry.getValue();
            hc.a.EnumC1914a enumC1914aB = com.planner5d.library.activity.fragment.feed.c.b(key);
            if (enumC1914aB != null) {
                t1(value, enumC1914aB);
            }
        }
    }

    private final void x1(jc.a aVar, Bundle bundle) {
        q3.d dVar;
        if (!this.f133223p0.d(this.f133230t)) {
            this.Y.h();
            return;
        }
        com.planner5d.library.services.utility.j jVar = new com.planner5d.library.services.utility.j(bundle);
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.type;
        Serializable serializableS = jVar.s(rVar, null);
        com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.source;
        if (jVar.a(rVar2)) {
            Serializable serializableS2 = jVar.s(rVar2, null);
            if (!(serializableS2 instanceof q3.d)) {
                serializableS2 = this.f133228r3.a();
            }
            dVar = (q3.d) serializableS2;
        } else {
            dVar = (q3.d) this.f133228r3.a();
        }
        q3.d dVar2 = dVar;
        Integer numB = aVar.b();
        int iN = jc.d.Videos.n();
        if (numB == null || numB.intValue() != iN) {
            com.planner5d.library.model.manager.statistics.events.a1 a1Var = com.planner5d.library.model.manager.statistics.events.a1.f216679b;
            q3.c.a(a1Var, q3.a.open, a1Var.A0(aVar.b()), Integer.valueOf(aVar.f()), dVar2, null, 16, null);
            com.planner5d.library.activity.fragment.x.g(this.f133233v, new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) FeedArticleFragment.class, new com.planner5d.library.services.utility.i(new jc.b(aVar).m()).t(rVar2, dVar2).a()).k(dVar2 == q3.d.all_article ? new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) FeedAllArticlesFragment.class, new com.planner5d.library.services.utility.i(bundle).t(rVar, serializableS).a()).k(new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) FeedFragment.class, bundle)) : new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) FeedFragment.class, bundle)), false, 2, null);
        } else {
            q3.c.a(com.planner5d.library.model.manager.statistics.events.a1.f216679b, q3.a.play, q3.b.videos, Integer.valueOf(aVar.f()), dVar2, null, 16, null);
            String strK = aVar.k();
            if (strK != null) {
                this.f133236w3.o(new Pair<>(Uri.parse(strK), aVar.j()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object y1(Function1<? super kotlin.coroutines.d<? super androidx.paging.u<Integer, hc.a>>, ? extends Object> function1, kotlin.coroutines.d<? super Unit> dVar) {
        r rVar;
        androidx.lifecycle.c1 c1Var;
        if (dVar instanceof r) {
            rVar = (r) dVar;
            int i10 = rVar.f133314d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                rVar.f133314d = i10 - Integer.MIN_VALUE;
            } else {
                rVar = new r(dVar);
            }
        } else {
            rVar = new r(dVar);
        }
        Object obj = rVar.f133312b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = rVar.f133314d;
        if (i11 == 0) {
            ResultKt.m(obj);
            androidx.lifecycle.c1<q1<hc.a>> c1Var2 = this.f133237x3;
            z1 z1VarH = com.planner5d.library.services.utility.s.f229729a.h();
            int i12 = 5 >> 0;
            s sVar = new s(function1, null);
            rVar.f133311a = c1Var2;
            rVar.f133314d = 1;
            Object objH = kotlinx.coroutines.i.h(z1VarH, sVar, rVar);
            if (objH == objL) {
                return objL;
            }
            obj = objH;
            c1Var = c1Var2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1Var = (androidx.lifecycle.c1) rVar.f133311a;
            ResultKt.m(obj);
        }
        c1Var.r(obj);
        return Unit.f312394a;
    }

    @Override // ja.c
    public void A(@NotNull Contest contest, int i10) {
        Intrinsics.checkNotNullParameter(contest, "contest");
        int i11 = 3 & 0;
        kotlinx.coroutines.k.f(g2.a(this), null, null, new e(contest, i10, null), 3, null);
    }

    @Override // ja.b
    public void C(@NotNull Bundle scrollState) {
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        if ((this.H1.a(com.planner5d.library.model.manager.config.f.UploadPlan) || this.H1.a(com.planner5d.library.model.manager.config.f.SmartWizard)) && this.f133221n3 != null) {
            l0(g1(), scrollState, new com.planner5d.library.services.utility.i().j(com.planner5d.library.services.r.source, "home_page").a());
        } else {
            com.planner5d.library.activity.fragment.projects.e0.h0(this, g1(), null, scrollState, null, 8, null);
        }
    }

    @NotNull
    public final p2 D1() {
        return kotlinx.coroutines.k.f(g2.a(this), null, null, new w(null), 3, null);
    }

    @Override // ja.c
    public void G() {
        kotlinx.coroutines.k.f(g2.a(this), com.planner5d.library.services.utility.s.f229729a.d(), null, new z(null), 2, null);
        com.planner5d.library.activity.fragment.x xVar = this.f133233v;
        Class<? extends FragmentController> clsA = this.f133216i3.a();
        com.planner5d.library.activity.helper.event.content.e eVar = com.planner5d.library.activity.helper.event.content.e.SlideLeft;
        com.planner5d.library.activity.fragment.x.g(xVar, new com.planner5d.library.activity.helper.event.content.c(clsA, null, eVar).k(new com.planner5d.library.activity.helper.event.content.c(FeedFragment.class, null, eVar)), false, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G1() {
        androidx.lifecycle.w0<l1.k> w0Var = this.f133238y3;
        Intrinsics.checkNotNull(w0Var, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.planner5d.library.activity.fragment.list.MainListViewModel.State>");
        androidx.lifecycle.c1 c1Var = (androidx.lifecycle.c1) w0Var;
        l1.k kVar = (l1.k) ((androidx.lifecycle.c1) this.f133238y3).f();
        c1Var.r(kVar != null ? l1.k.d(kVar, null, null, 2, null) : null);
    }

    public final void J1(@NotNull jc.e targetItem) {
        Intrinsics.checkNotNullParameter(targetItem, "targetItem");
        this.C3.p(targetItem);
    }

    public final void K1() {
        if (this.H1.a(com.planner5d.library.model.manager.config.f.DesignGenerator)) {
            j3.d.a(this.f133219l3, j3.a.screen_view, j3.g.landing, null, null, null, null, 60, null);
        }
    }

    @Override // ja.a
    public void O(@NotNull Bundle scrollState, @NotNull hc.a.EnumC1914a blogType) {
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        Intrinsics.checkNotNullParameter(blogType, "blogType");
        com.planner5d.library.activity.fragment.x.g(this.f133233v, new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) FeedAllArticlesFragment.class, new com.planner5d.library.services.utility.i().t(com.planner5d.library.services.r.type, blogType).a()).n(com.planner5d.library.f.s.jF).k(new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) FeedFragment.class, scrollState)), false, 2, null);
    }

    @Override // ja.a
    public void P(@NotNull ja.a.InterfaceC2239a callback, @NotNull hc.a.EnumC1914a blogType) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(blogType, "blogType");
        this.f133227q3.add(new Pair<>(callback, blogType));
    }

    @Override // ja.a
    @Nullable
    public List<jc.a> R(@NotNull hc.a.EnumC1914a blogType) {
        Intrinsics.checkNotNullParameter(blogType, "blogType");
        Integer numA = com.planner5d.library.activity.fragment.feed.c.a(blogType);
        if (numA != null) {
            int iIntValue = numA.intValue();
            Map<Integer, List<jc.a>> mapF = this.f133232u3.f();
            if (mapF != null) {
                return mapF.get(Integer.valueOf(iIntValue));
            }
        }
        return null;
    }

    @Override // ja.b
    public void a(@NotNull Bundle bundle, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (obj instanceof Project) {
            kotlinx.coroutines.k.f(g2.a(this), null, null, new p(obj, bundle, null), 3, null);
        } else if (obj instanceof jc.a) {
            x1((jc.a) obj, bundle);
        }
    }

    @Override // ja.c
    public void b(int i10) {
        com.planner5d.library.model.manager.statistics.events.r.f217359b.g(l3.b.home_page);
        this.f133225p2.j(l1(i10));
    }

    @NotNull
    public final Bundle b1(int i10) {
        return new com.planner5d.library.services.utility.i().h(com.planner5d.library.services.r.scrollPosition, new u2(i10, 0, 0).d()).a();
    }

    @Override // ja.c
    public void c(@NotNull ja.c.a callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f133226p3.add(callback);
    }

    public final void c1() {
        this.f133239z3.r(Boolean.FALSE);
        kotlinx.coroutines.k.f(g2.a(this), null, null, new d(null), 3, null);
    }

    @Override // ja.c
    public void f(@Nullable com.planner5d.library.activity.fragment.feed.a aVar) {
        if (aVar != null) {
            this.A3.r(aVar);
        }
    }

    @NotNull
    public final com.planner5d.library.activity.fragment.list.b0 g1() {
        return (com.planner5d.library.activity.fragment.list.b0) this.B3.getValue();
    }

    @NotNull
    public final v1.a<com.planner5d.library.activity.fragment.feed.a> h1() {
        return this.A3;
    }

    @Override // ja.c
    @NotNull
    public p2 j(@NotNull Contest contest, int i10) {
        Intrinsics.checkNotNullParameter(contest, "contest");
        return kotlinx.coroutines.k.f(g2.a(this), null, null, new j(contest, i10, null), 3, null);
    }

    @Override // com.planner5d.library.activity.fragment.projects.e0
    @NotNull
    public com.planner5d.library.activity.helper.event.content.c j0(@NotNull Bundle state, @NotNull com.planner5d.library.activity.helper.event.content.e animation) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(animation, "animation");
        return new com.planner5d.library.activity.helper.event.content.c(FeedFragment.class, state, animation).o(this.f133235w.c()).j(this.f133235w.f());
    }

    @NotNull
    public final androidx.lifecycle.c1<Map<Integer, List<jc.a>>> j1() {
        return this.f133232u3;
    }

    @NotNull
    public final androidx.lifecycle.c1<Boolean> k1() {
        return this.f133239z3;
    }

    @NotNull
    public final androidx.lifecycle.w0<q1<hc.a>> m1() {
        return this.f133237x3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // ja.c
    @Nullable
    public Object n(@NotNull kotlin.coroutines.d<? super Integer> dVar) {
        i iVar;
        if (dVar instanceof i) {
            iVar = (i) dVar;
            int i10 = iVar.f133266c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.f133266c = i10 - Integer.MIN_VALUE;
            } else {
                iVar = new i(dVar);
            }
        } else {
            iVar = new i(dVar);
        }
        Object objG = iVar.f133264a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = iVar.f133266c;
        if (i11 == 0) {
            ResultKt.m(objG);
            com.planner5d.library.model.manager.config.p pVar = this.f133217j3;
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.designGeneratorVisited;
            iVar.f133266c = 1;
            objG = pVar.G(rVar, false, iVar);
            if (objG == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objG);
        }
        return kotlin.coroutines.jvm.internal.b.f(((Boolean) objG).booleanValue() ? com.planner5d.library.f.s.f169173i6 : com.planner5d.library.f.s.f169197j6);
    }

    @Override // ja.a
    public void o(@NotNull Bundle scrollState, @NotNull jc.a blogPost, @NotNull q3.d source, @NotNull hc.a.EnumC1914a blogType) {
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        Intrinsics.checkNotNullParameter(blogPost, "blogPost");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(blogType, "blogType");
        a(new com.planner5d.library.services.utility.i(scrollState).t(com.planner5d.library.services.r.source, source).t(com.planner5d.library.services.r.type, blogType).a(), blogPost);
    }

    @NotNull
    public final androidx.lifecycle.w0<l1.k> o1() {
        return this.f133238y3;
    }

    @Override // androidx.lifecycle.f2
    public void onCleared() {
        super.onCleared();
        this.f133226p3.clear();
        this.f133227q3.clear();
    }

    @NotNull
    public final v1.a<Pair<Uri, String>> p1() {
        return this.f133236w3;
    }

    @Override // ja.b
    public void s(@NotNull Bundle scrollState) {
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        this.f133215h3.b(x3.e.home_page);
        com.planner5d.library.activity.fragment.x.g(this.f133233v, new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) ProjectsPagesFragment.class, new com.planner5d.library.services.utility.i().t(com.planner5d.library.services.r.tab, com.planner5d.library.services.r.floorPlansList).a()), false, 2, null);
    }

    @Override // ja.c
    public void t(@NotNull Contest contest, int i10) {
        Intrinsics.checkNotNullParameter(contest, "contest");
        com.planner5d.library.contest.data.f.x(this.f133225p2, contest, l1(i10), null, 4, null);
    }

    public final void v1(@Nullable Bundle bundle, @Nullable Bundle bundle2) {
        e1 e1Var;
        if (new com.planner5d.library.services.utility.j(bundle2).f(com.planner5d.library.services.r.createProject, false)) {
            e1Var = this;
            com.planner5d.library.activity.fragment.projects.e0.h0(e1Var, g1(), null, new Bundle(), null, 8, null);
        } else {
            e1Var = this;
        }
        e1Var.f133228r3.b(bundle, bundle2);
        kotlinx.coroutines.k.f(g2.a(e1Var), null, null, e1Var.new o(null), 3, null);
    }

    public final void w1(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        this.f133228r3.c(outState);
    }

    public final void z1(boolean z10) {
        g1().d(com.planner5d.library.activity.fragment.list.b0.a.Refreshing, new q(z10, this, null));
    }
}
