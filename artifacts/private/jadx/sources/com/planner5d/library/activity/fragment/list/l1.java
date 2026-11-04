package com.planner5d.library.activity.fragment.list;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import androidx.lifecycle.c2;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import androidx.paging.q1;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.dialog.message.ConfirmDeleteMessage;
import com.planner5d.library.activity.fragment.dialog.message.ConfirmDeleteMessageRedesign;
import com.planner5d.library.activity.fragment.dialog.message.ConfirmDeleteMultipleMessage;
import com.planner5d.library.activity.fragment.dialog.message.ConfirmDeleteMultipleMessageRedesign;
import com.planner5d.library.activity.fragment.dialog.titleedit.FolderEdit;
import com.planner5d.library.activity.fragment.projects.ProjectsPagesFragment;
import com.planner5d.library.contest.view.voting.ContestVotingFragment;
import com.planner5d.library.database.model.contest.Contest;
import com.planner5d.library.model.Folder;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.s4;
import com.planner5d.library.model.manager.statistics.events.l3;
import com.planner5d.library.model.manager.statistics.events.m3;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.exceptions.ErrorMessageParser;
import com.planner5d.library.services.utility.e2;
import com.planner5d.library.services.utility.u2;
import com.planner5d.library.widget.EnhancedRecyclerView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nMainListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainListViewModel.kt\ncom/planner5d/library/activity/fragment/list/MainListViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,630:1\n1755#2,3:631\n1557#2:635\n1628#2,3:636\n1557#2:639\n1628#2,3:640\n1557#2:643\n1628#2,3:644\n1#3:634\n*S KotlinDebug\n*F\n+ 1 MainListViewModel.kt\ncom/planner5d/library/activity/fragment/list/MainListViewModel\n*L\n218#1:631,3\n463#1:635\n463#1:636,3\n569#1:639\n569#1:640,3\n597#1:643\n597#1:644,3\n*E\n"})
public final class l1 extends f2 {

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    @NotNull
    public static final b f134252q3 = new b(null);

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    public static final int f134253r3 = 8;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private static final int f134254s3 = 36;

    @NotNull
    private final androidx.lifecycle.w0<f> H1;

    @NotNull
    private final androidx.lifecycle.w0<i> X;
    public g0 Y;

    @NotNull
    private j Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f134255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.dialog.k f134256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.synchronization.i f134257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.c0 f134258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.t f134259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final s4 f134260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.j f134261g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f134262g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.contest.g f134263h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @Nullable
    private androidx.fragment.app.s f134264h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final b2 f134265i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @NotNull
    private Function0<Bundle> f134266i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.x f134267j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @Nullable
    private Bundle f134268j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.d f134269k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private boolean f134270k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.utility.f2 f134271l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.c1<Object> f134272l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final ErrorMessageParser f134273m;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f134274m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final l3 f134275n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @NotNull
    private final List<Object> f134276n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.spaces.documents.c f134277o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.view.c f134278o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    private d<com.planner5d.library.database.model.j> f134279p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NotNull
    private e f134280p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f134281p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private boolean f134282p3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final m3 f134283s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f134284t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<List<yc.d<h0>>> f134285v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<k> f134286w;

    public interface a {
        @NotNull
        List<j> k();
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.list.MainListViewModel$selectItemForMultiselect$1", f = "MainListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a0 extends kotlin.coroutines.jvm.internal.o implements Function2<com.planner5d.library.activity.fragment.list.b0.b, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f134287a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f134289c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a0(Object obj, kotlin.coroutines.d<? super a0> dVar) {
            super(2, dVar);
            this.f134289c = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l1.this.new a0(this.f134289c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f134287a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            l1.this.O1(this.f134289c);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.planner5d.library.activity.fragment.list.b0.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a0) create(bVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static /* synthetic */ void c() {
        }

        @Nullable
        public final EnhancedRecyclerView.e a(@Nullable Bundle bundle) {
            com.planner5d.library.services.utility.j jVar = new com.planner5d.library.services.utility.j(bundle);
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.appearanceMode;
            if (jVar.a(rVar)) {
                Serializable serializableS = jVar.s(rVar, null);
                if (serializableS instanceof EnhancedRecyclerView.e) {
                    return (EnhancedRecyclerView.e) serializableS;
                }
            }
            return null;
        }

        @Nullable
        public final Bundle b(@Nullable Bundle bundle, @NotNull com.planner5d.library.services.r key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new com.planner5d.library.services.utility.j(bundle).h(key, null);
        }

        @Nullable
        public final u2 d(@Nullable Bundle bundle) {
            com.planner5d.library.services.utility.j jVar = new com.planner5d.library.services.utility.j(bundle);
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.scrollPosition;
            if (jVar.a(rVar)) {
                return new u2(jVar.h(rVar, Bundle.EMPTY));
            }
            return null;
        }

        @Nullable
        public final j e(@Nullable Bundle bundle) {
            com.planner5d.library.services.utility.j jVar = new com.planner5d.library.services.utility.j(bundle);
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.sortBy;
            if (jVar.a(rVar)) {
                Serializable serializableS = jVar.s(rVar, null);
                if (serializableS instanceof j) {
                    return (j) serializableS;
                }
            }
            return null;
        }

        private b() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.list.MainListViewModel$setError$2", f = "MainListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b0 extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f134290a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f134291b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l1 f134292c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b0(Throwable th2, l1 l1Var, kotlin.coroutines.d<? super b0> dVar) {
            super(2, dVar);
            this.f134291b = th2;
            this.f134292c = l1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b0(this.f134291b, this.f134292c, dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Unit unit;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f134290a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            timber.log.b.f381052a.e(this.f134291b);
            androidx.lifecycle.w0<k> w0VarJ1 = this.f134292c.j1();
            l1 l1Var = this.f134292c;
            Throwable th2 = this.f134291b;
            synchronized (w0VarJ1) {
                try {
                    androidx.lifecycle.w0<k> w0VarJ2 = l1Var.j1();
                    Intrinsics.checkNotNull(w0VarJ2, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.planner5d.library.activity.fragment.list.MainListViewModel.State>");
                    T tF = ((androidx.lifecycle.c1) l1Var.j1()).f();
                    Intrinsics.checkNotNull(tF);
                    ((androidx.lifecycle.c1) w0VarJ2).r(k.d((k) tF, ErrorMessageParser.parse$default(l1Var.f134273m, th2, null, 2, null), null, 2, null));
                    unit = Unit.f312394a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return unit;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b0) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static final class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f134293a = 0;

        @Override // com.planner5d.library.activity.fragment.list.l1.a
        @NotNull
        public List<j> k() {
            return CollectionsKt.listOf((Object[]) new j[]{j.BY_NAME, j.BY_DATE});
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.list.MainListViewModel", f = "MainListViewModel.kt", i = {0}, l = {androidx.constraintlayout.core.motion.utils.v.e.A, 616}, m = "synchronize", n = {"this"}, s = {"L$0"})
    static final class c0 extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f134294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f134295b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f134297d;

        c0(kotlin.coroutines.d<? super c0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f134295b = obj;
            this.f134297d |= Integer.MIN_VALUE;
            return l1.this.b2(this);
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 0)
    public static final class d<T extends com.planner5d.library.database.model.j> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f134298d = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final T f134299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final List<T> f134300b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f134301c;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@Nullable T t10, @Nullable List<? extends T> list, boolean z10) {
            this.f134299a = t10;
            this.f134300b = list;
            this.f134301c = z10;
        }

        @Nullable
        public final List<T> a() {
            return this.f134300b;
        }

        @Nullable
        public final T b() {
            return this.f134299a;
        }

        public final boolean c() {
            return this.f134301c;
        }

        public /* synthetic */ d(com.planner5d.library.database.model.j jVar, List list, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(jVar, list, (i10 & 4) != 0 ? false : z10);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.list.MainListViewModel$synchronize$2", f = "MainListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class d0 extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f134302a;

        d0(kotlin.coroutines.d<? super d0> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l1.this.new d0(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f134302a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            l1.this.f134257c.r(null).toBlocking().firstOrDefault(null);
            l1.this.W0().L();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d0) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 0)
    public static final class e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f134304c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final com.planner5d.library.database.model.j f134305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final List<com.planner5d.library.database.model.j> f134306b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(@Nullable com.planner5d.library.database.model.j jVar, @Nullable List<? extends com.planner5d.library.database.model.j> list) {
            this.f134305a = jVar;
            this.f134306b = list;
        }

        @Nullable
        public final com.planner5d.library.database.model.j a() {
            return this.f134305a;
        }

        @Nullable
        public final List<com.planner5d.library.database.model.j> b() {
            return this.f134306b;
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 0)
    public static final class f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f134307c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f134308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final e f134309b;

        public f(boolean z10, @NotNull e filter) {
            Intrinsics.checkNotNullParameter(filter, "filter");
            this.f134308a = z10;
            this.f134309b = filter;
        }

        public static /* synthetic */ f d(f fVar, boolean z10, e eVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = fVar.f134308a;
            }
            if ((i10 & 2) != 0) {
                eVar = fVar.f134309b;
            }
            return fVar.c(z10, eVar);
        }

        public final boolean a() {
            return this.f134308a;
        }

        @NotNull
        public final e b() {
            return this.f134309b;
        }

        @NotNull
        public final f c(boolean z10, @NotNull e filter) {
            Intrinsics.checkNotNullParameter(filter, "filter");
            return new f(z10, filter);
        }

        @NotNull
        public final e e() {
            return this.f134309b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f134308a == fVar.f134308a && Intrinsics.areEqual(this.f134309b, fVar.f134309b);
        }

        public final boolean f() {
            return this.f134308a;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f134308a) * 31) + this.f134309b.hashCode();
        }

        @NotNull
        public String toString() {
            return "FolderSelectionState(inSelectionMode=" + this.f134308a + ", filter=" + this.f134309b + ")";
        }

        public /* synthetic */ f(boolean z10, e eVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10, eVar);
        }
    }

    public enum g {
        NewProject,
        RecognitionFailed,
        RecognitionInProgress;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f134314e = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<g> l() {
            return f134314e;
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 1)
    @SourceDebugExtension({"SMAP\nMainListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainListViewModel.kt\ncom/planner5d/library/activity/fragment/list/MainListViewModel$ProjectsAvailableSortOrdersFactory\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,630:1\n3829#2:631\n4344#2,2:632\n*S KotlinDebug\n*F\n+ 1 MainListViewModel.kt\ncom/planner5d/library/activity/fragment/list/MainListViewModel$ProjectsAvailableSortOrdersFactory\n*L\n127#1:631\n127#1:632,2\n*E\n"})
    public static final class h implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f134315a = 0;

        @Override // com.planner5d.library.activity.fragment.list.l1.a
        @NotNull
        public List<j> k() {
            j[] jVarArrValues = j.values();
            ArrayList arrayList = new ArrayList();
            for (j jVar : jVarArrValues) {
                if (jVar != j.SNAPSHOTS_FIRST) {
                    arrayList.add(jVar);
                }
            }
            return arrayList;
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 0)
    public static final class i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f134316c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f134317a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<Object> f134318b;

        /* JADX WARN: Multi-variable type inference failed */
        public i() {
            this(false, null, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ i d(i iVar, boolean z10, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = iVar.f134317a;
            }
            if ((i10 & 2) != 0) {
                list = iVar.f134318b;
            }
            return iVar.c(z10, list);
        }

        public final boolean a() {
            return this.f134317a;
        }

        @NotNull
        public final List<Object> b() {
            return this.f134318b;
        }

        @NotNull
        public final i c(boolean z10, @NotNull List<? extends Object> selectedItems) {
            Intrinsics.checkNotNullParameter(selectedItems, "selectedItems");
            return new i(z10, selectedItems);
        }

        public final boolean e() {
            return this.f134317a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.f134317a == iVar.f134317a && Intrinsics.areEqual(this.f134318b, iVar.f134318b);
        }

        @NotNull
        public final List<Object> f() {
            return this.f134318b;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f134317a) * 31) + this.f134318b.hashCode();
        }

        @NotNull
        public String toString() {
            return "SelectionState(inSelectionMode=" + this.f134317a + ", selectedItems=" + this.f134318b + ")";
        }

        public i(boolean z10, @NotNull List<? extends Object> selectedItems) {
            Intrinsics.checkNotNullParameter(selectedItems, "selectedItems");
            this.f134317a = z10;
            this.f134318b = selectedItems;
        }

        public /* synthetic */ i(boolean z10, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? CollectionsKt.emptyList() : list);
        }
    }

    public enum j {
        FLOOR_PLANS_FIRST(com.planner5d.library.f.s.f169323oc),
        SNAPSHOTS_FIRST(com.planner5d.library.f.s.NC),
        FOLDERS_FIRST(com.planner5d.library.f.s.f169588zc),
        BY_NAME(com.planner5d.library.f.s.f169337p2),
        BY_DATE(com.planner5d.library.f.s.f169313o2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f134327a;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f134326i = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f134319b = new a(null);

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final j a(int i10) {
                if (i10 == com.planner5d.library.f.s.f169588zc) {
                    return j.FOLDERS_FIRST;
                }
                if (i10 == com.planner5d.library.f.s.f169337p2) {
                    return j.BY_NAME;
                }
                return i10 == com.planner5d.library.f.s.f169313o2 ? j.BY_DATE : j.FLOOR_PLANS_FIRST;
            }

            private a() {
            }
        }

        j(int i10) {
            this.f134327a = i10;
        }

        @NotNull
        public static kotlin.enums.a<j> o() {
            return f134326i;
        }

        @NotNull
        public final com.planner5d.library.model.manager.c0.a l() {
            return this == BY_NAME ? com.planner5d.library.model.manager.c0.a.BY_TITLE : com.planner5d.library.model.manager.c0.a.BY_DATE;
        }

        @NotNull
        public final com.planner5d.library.model.manager.project.d0.d n() {
            return this == BY_NAME ? com.planner5d.library.model.manager.project.d0.d.BY_TITLE : com.planner5d.library.model.manager.project.d0.d.BY_DATE;
        }

        public final int p() {
            return this.f134327a;
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 0)
    public static final class k {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f134328e = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final ErrorMessageException f134329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.activity.fragment.list.b0.a[] f134330b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f134331c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.f1
        @Nullable
        private final Integer f134332d;

        /* JADX WARN: Multi-variable type inference failed */
        public k() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ k d(k kVar, ErrorMessageException errorMessageException, com.planner5d.library.activity.fragment.list.b0.a[] aVarArr, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                errorMessageException = kVar.f134329a;
            }
            if ((i10 & 2) != 0) {
                aVarArr = kVar.f134330b;
            }
            return kVar.c(errorMessageException, aVarArr);
        }

        @Nullable
        public final ErrorMessageException a() {
            return this.f134329a;
        }

        @NotNull
        public final com.planner5d.library.activity.fragment.list.b0.a[] b() {
            return this.f134330b;
        }

        @NotNull
        public final k c(@Nullable ErrorMessageException errorMessageException, @NotNull com.planner5d.library.activity.fragment.list.b0.a[] actions) {
            Intrinsics.checkNotNullParameter(actions, "actions");
            return new k(errorMessageException, actions);
        }

        @NotNull
        public final com.planner5d.library.activity.fragment.list.b0.a[] e() {
            return this.f134330b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return Intrinsics.areEqual(this.f134329a, kVar.f134329a) && Intrinsics.areEqual(this.f134330b, kVar.f134330b);
        }

        @Nullable
        public final ErrorMessageException f() {
            return this.f134329a;
        }

        public final boolean g() {
            return this.f134331c;
        }

        @Nullable
        public final Integer h() {
            return this.f134332d;
        }

        public int hashCode() {
            ErrorMessageException errorMessageException = this.f134329a;
            return ((errorMessageException == null ? 0 : errorMessageException.hashCode()) * 31) + Arrays.hashCode(this.f134330b);
        }

        @NotNull
        public String toString() {
            return "State(error=" + this.f134329a + ", actions=" + Arrays.toString(this.f134330b) + ")";
        }

        public k(@Nullable ErrorMessageException errorMessageException, @NotNull com.planner5d.library.activity.fragment.list.b0.a[] actions) {
            Intrinsics.checkNotNullParameter(actions, "actions");
            this.f134329a = errorMessageException;
            this.f134330b = actions;
            this.f134331c = !(actions.length == 0);
            com.planner5d.library.activity.fragment.list.b0.a aVar = (com.planner5d.library.activity.fragment.list.b0.a) ArraysKt.lastOrNull(actions);
            this.f134332d = aVar != null ? Integer.valueOf(aVar.n()) : null;
        }

        public /* synthetic */ k(ErrorMessageException errorMessageException, com.planner5d.library.activity.fragment.list.b0.a[] aVarArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : errorMessageException, (i10 & 2) != 0 ? new com.planner5d.library.activity.fragment.list.b0.a[0] : aVarArr);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.list.MainListViewModel$clickOnItem$1", f = "MainListViewModel.kt", i = {}, l = {303}, m = "invokeSuspend", n = {}, s = {})
    static final class l extends kotlin.coroutines.jvm.internal.o implements Function2<com.planner5d.library.activity.fragment.list.b0.b, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f134333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f134334b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f134336d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(Object obj, kotlin.coroutines.d<? super l> dVar) {
            super(2, dVar);
            this.f134336d = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l1.this.new l(this.f134336d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            g0 g0Var;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f134334b;
            if (i10 == 0) {
                ResultKt.m(obj);
                g0 g0VarW0 = l1.this.W0();
                l1 l1Var = l1.this;
                this.f134333a = g0VarW0;
                this.f134334b = 1;
                Object objO0 = l1Var.O0(this);
                if (objO0 == objL) {
                    return objL;
                }
                g0Var = g0VarW0;
                obj = objO0;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g0Var = (g0) this.f134333a;
                ResultKt.m(obj);
            }
            g0Var.a((Bundle) obj, this.f134336d);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.planner5d.library.activity.fragment.list.b0.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((l) create(bVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.list.MainListViewModel$createPagedList$1$1", f = "MainListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class m extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f134337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f134338b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(Runnable runnable, kotlin.coroutines.d<? super m> dVar) {
            super(2, dVar);
            this.f134338b = runnable;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new m(this.f134338b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f134337a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            this.f134338b.run();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((m) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.list.MainListViewModel$createPagedList$2$1", f = "MainListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class n extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f134339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f134340b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Runnable runnable, kotlin.coroutines.d<? super n> dVar) {
            super(2, dVar);
            this.f134340b = runnable;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new n(this.f134340b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f134339a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            this.f134340b.run();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((n) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.list.MainListViewModel", f = "MainListViewModel.kt", i = {}, l = {381}, m = "createStateWithFolder", n = {}, s = {})
    static final class o extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f134341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f134342b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f134344d;

        o(kotlin.coroutines.d<? super o> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f134342b = obj;
            this.f134344d |= Integer.MIN_VALUE;
            return l1.this.O0(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.list.MainListViewModel$createStateWithFolder$2$1", f = "MainListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class p extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f134345a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.services.utility.i f134347c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(com.planner5d.library.services.utility.i iVar, kotlin.coroutines.d<? super p> dVar) {
            super(2, dVar);
            this.f134347c = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l1.this.new p(this.f134347c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f134345a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            l1 l1Var = l1.this;
            com.planner5d.library.database.model.j jVarZ0 = l1.Z0(l1Var, l1Var.U0(), null, 2, null);
            if (jVarZ0 != null) {
                this.f134347c.h(com.planner5d.library.services.r.folder, jVarZ0.b());
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((p) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.list.MainListViewModel$getFolder$1$1", f = "MainListViewModel.kt", i = {}, l = {547}, m = "invokeSuspend", n = {}, s = {})
    static final class q extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super com.planner5d.library.database.model.spaces.documents.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f134348a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bundle f134350c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(Bundle bundle, kotlin.coroutines.d<? super q> dVar) {
            super(2, dVar);
            this.f134350c = bundle;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l1.this.new q(this.f134350c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f134348a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            com.planner5d.library.model.manager.spaces.documents.c cVar = l1.this.f134277o;
            Bundle bundle = this.f134350c;
            this.f134348a = 1;
            Object objF0 = cVar.F0(bundle, this);
            return objF0 == objL ? objL : objF0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super com.planner5d.library.database.model.spaces.documents.c> dVar) {
            return ((q) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.list.MainListViewModel$loadFolders$1", f = "MainListViewModel.kt", i = {}, l = {533}, m = "invokeSuspend", n = {}, s = {})
    static final class r extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super List<? extends com.planner5d.library.database.model.spaces.documents.c>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f134351a;

        r(kotlin.coroutines.d<? super r> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l1.this.new r(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super List<? extends com.planner5d.library.database.model.spaces.documents.c>> dVar) {
            return invoke2(s0Var, (kotlin.coroutines.d<? super List<com.planner5d.library.database.model.spaces.documents.c>>) dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f134351a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            com.planner5d.library.model.manager.spaces.documents.c cVar = l1.this.f134277o;
            this.f134351a = 1;
            Object objD0 = cVar.D0(this);
            return objD0 == objL ? objL : objD0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super List<com.planner5d.library.database.model.spaces.documents.c>> dVar) {
            return ((r) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.list.MainListViewModel", f = "MainListViewModel.kt", i = {0, 1, 1}, l = {491, 492, 500}, m = "notifyAboutVoting", n = {"this", "this", "contest"}, s = {"L$0", "L$0", "L$1"})
    static final class s extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f134353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f134354b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f134355c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134357e;

        s(kotlin.coroutines.d<? super s> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f134355c = obj;
            this.f134357e |= Integer.MIN_VALUE;
            return l1.this.s1(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.list.MainListViewModel$onClickFolderMenu$1$1", f = "MainListViewModel.kt", i = {}, l = {238}, m = "invokeSuspend", n = {}, s = {})
    static final class t extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f134358a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.database.model.j f134360c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(com.planner5d.library.database.model.j jVar, kotlin.coroutines.d<? super t> dVar) {
            super(2, dVar);
            this.f134360c = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l1.this.new t(this.f134360c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f134358a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.model.manager.spaces.documents.c cVar = l1.this.f134277o;
                String strP = ((com.planner5d.library.database.model.spaces.documents.c) this.f134360c).p();
                this.f134358a = 1;
                if (cVar.p0(strP, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            l1.M1(l1.this, true, null, 2, null);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((t) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.list.MainListViewModel$onClickListButton$1$1", f = "MainListViewModel.kt", i = {}, l = {com.badlogic.gdx.utils.compression.lzma.a.f95331z}, m = "invokeSuspend", n = {}, s = {})
    static final class u extends kotlin.coroutines.jvm.internal.o implements Function2<com.planner5d.library.activity.fragment.list.b0.b, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f134361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f134362b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ g f134364d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(g gVar, kotlin.coroutines.d<? super u> dVar) {
            super(2, dVar);
            this.f134364d = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l1.this.new u(this.f134364d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            g0 g0Var;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f134362b;
            if (i10 == 0) {
                ResultKt.m(obj);
                g0 g0VarW0 = l1.this.W0();
                l1 l1Var = l1.this;
                this.f134361a = g0VarW0;
                this.f134362b = 1;
                Object objO0 = l1Var.O0(this);
                if (objO0 == objL) {
                    return objL;
                }
                g0Var = g0VarW0;
                obj = objO0;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g0Var = (g0) this.f134361a;
                ResultKt.m(obj);
            }
            g0Var.z((Bundle) obj, this.f134364d, l1.this.Q0(), l1.this.X0().b());
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.planner5d.library.activity.fragment.list.b0.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((u) create(bVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.list.MainListViewModel$onFolderDeleteResult$1", f = "MainListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class v extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f134365a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Folder f134367c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(Folder folder, kotlin.coroutines.d<? super v> dVar) {
            super(2, dVar);
            this.f134367c = folder;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l1.this.new v(this.f134367c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f134365a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            l1.this.f134258d.t(l1.this.f134259e.a(), this.f134367c);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((v) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.list.MainListViewModel$refresh$1", f = "MainListViewModel.kt", i = {0}, l = {441, 443}, m = "invokeSuspend", n = {"$this$queueForeground"}, s = {"L$0"})
    static final class w extends kotlin.coroutines.jvm.internal.o implements Function2<com.planner5d.library.activity.fragment.list.b0.b, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f134368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f134369b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f134370c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l1 f134371d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f134372e;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.list.MainListViewModel$refresh$1$1", f = "MainListViewModel.kt", i = {}, l = {441}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<com.planner5d.library.activity.fragment.list.b0.b, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f134373a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l1 f134374b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l1 l1Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f134374b = l1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f134374b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f134373a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    l1 l1Var = this.f134374b;
                    this.f134373a = 1;
                    if (l1Var.b2(this) == objL) {
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
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.planner5d.library.activity.fragment.list.b0.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(bVar, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.list.MainListViewModel$refresh$1$2", f = "MainListViewModel.kt", i = {}, l = {445, 446, 448, 453}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nMainListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainListViewModel.kt\ncom/planner5d/library/activity/fragment/list/MainListViewModel$refresh$1$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,630:1\n1#2:631\n*E\n"})
        static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<com.planner5d.library.activity.fragment.list.b0.b, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f134375a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f134376b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ l1 f134377c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f134378d;

            @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.list.MainListViewModel$refresh$1$2$2", f = "MainListViewModel.kt", i = {}, l = {449}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMainListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainListViewModel.kt\ncom/planner5d/library/activity/fragment/list/MainListViewModel$refresh$1$2$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,630:1\n1557#2:631\n1628#2,3:632\n*S KotlinDebug\n*F\n+ 1 MainListViewModel.kt\ncom/planner5d/library/activity/fragment/list/MainListViewModel$refresh$1$2$2\n*L\n449#1:631\n449#1:632,3\n*E\n"})
            static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super List<? extends yc.d<h0>>>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f134379a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ l1 f134380b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(l1 l1Var, kotlin.coroutines.d<? super a> dVar) {
                    super(2, dVar);
                    this.f134380b = l1Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new a(this.f134380b, dVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super List<? extends yc.d<h0>>> dVar) {
                    return invoke2(s0Var, (kotlin.coroutines.d<? super List<yc.d<h0>>>) dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f134379a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        g0 g0VarW0 = this.f134380b.W0();
                        j jVarH1 = this.f134380b.h1();
                        d<com.planner5d.library.database.model.j> dVarX0 = this.f134380b.X0();
                        this.f134379a = 1;
                        obj = g0VarW0.h(jVarH1, dVarX0, this);
                        if (obj == objL) {
                            return objL;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.m(obj);
                    }
                    Iterable iterable = (Iterable) obj;
                    l1 l1Var = this.f134380b;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new yc.d((h0) it.next(), l1Var.f134282p3));
                    }
                    return arrayList;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super List<yc.d<h0>>> dVar) {
                    return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.list.l1$w$b$b, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.list.MainListViewModel$refresh$1$2$folders$1", f = "MainListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class C1475b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super List<? extends com.planner5d.library.database.model.j>>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f134381a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ l1 f134382b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1475b(l1 l1Var, kotlin.coroutines.d<? super C1475b> dVar) {
                    super(2, dVar);
                    this.f134382b = l1Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new C1475b(this.f134382b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    kotlin.coroutines.intrinsics.b.l();
                    if (this.f134381a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return this.f134382b.p1();
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super List<? extends com.planner5d.library.database.model.j>> dVar) {
                    return ((C1475b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(l1 l1Var, Function0<Unit> function0, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f134377c = l1Var;
                this.f134378d = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new b(this.f134377c, this.f134378d, dVar);
            }

            /* JADX WARN: Code duplicated, block: B:28:0x0079 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:12:0x002c, B:38:0x00c3, B:40:0x00cb, B:15:0x0036, B:25:0x0066, B:26:0x0072, B:28:0x0079, B:35:0x0094, B:16:0x003a, B:22:0x004e, B:19:0x0042), top: B:47:0x000f }] */
            /* JADX WARN: Code duplicated, block: B:33:0x0090  */
            /* JADX WARN: Code duplicated, block: B:34:0x0092  */
            /* JADX WARN: Code duplicated, block: B:37:0x00c1  */
            /* JADX WARN: Code duplicated, block: B:40:0x00cb A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:12:0x002c, B:38:0x00c3, B:40:0x00cb, B:15:0x0036, B:25:0x0066, B:26:0x0072, B:28:0x0079, B:35:0x0094, B:16:0x003a, B:22:0x004e, B:19:0x0042), top: B:47:0x000f }] */
            /* JADX WARN: Code duplicated, block: B:49:0x008d A[SYNTHETIC] */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x00db, code lost:
            
                if (r1.W1(r10, r9) == r0) goto L44;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    Method dump skipped, instruction units count: 225
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.list.l1.w.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.planner5d.library.activity.fragment.list.b0.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
                return ((b) create(bVar, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(boolean z10, l1 l1Var, Function0<Unit> function0, kotlin.coroutines.d<? super w> dVar) {
            super(2, dVar);
            this.f134370c = z10;
            this.f134371d = l1Var;
            this.f134372e = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            w wVar = new w(this.f134370c, this.f134371d, this.f134372e, dVar);
            wVar.f134369b = obj;
            return wVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0064, code lost:
        
            if (r1.a(r9, r3, r8) == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r8.f134368a
                r7 = 2
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L23
                r7 = 6
                if (r1 != r2) goto L17
                r7 = 2
                kotlin.ResultKt.m(r9)
                r7 = 4
                goto L68
            L17:
                r7 = 1
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "fisni/ tte/l /w/ s//ecrk be/eor hoc/reioemlutaoov u"
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r7 = 4
                r8.<init>(r9)
                throw r8
            L23:
                java.lang.Object r1 = r8.f134369b
                com.planner5d.library.activity.fragment.list.b0$b r1 = (com.planner5d.library.activity.fragment.list.b0.b) r1
                kotlin.ResultKt.m(r9)
                goto L4f
            L2b:
                kotlin.ResultKt.m(r9)
                java.lang.Object r9 = r8.f134369b
                r1 = r9
                r7 = 7
                com.planner5d.library.activity.fragment.list.b0$b r1 = (com.planner5d.library.activity.fragment.list.b0.b) r1
                boolean r9 = r8.f134370c
                if (r9 == 0) goto L4f
                r7 = 4
                com.planner5d.library.activity.fragment.list.b0$a r9 = com.planner5d.library.activity.fragment.list.b0.a.Synchronizing
                com.planner5d.library.activity.fragment.list.l1$w$a r5 = new com.planner5d.library.activity.fragment.list.l1$w$a
                r7 = 3
                com.planner5d.library.activity.fragment.list.l1 r6 = r8.f134371d
                r5.<init>(r6, r4)
                r8.f134369b = r1
                r8.f134368a = r3
                java.lang.Object r9 = r1.a(r9, r5, r8)
                if (r9 != r0) goto L4f
                r7 = 2
                goto L66
            L4f:
                com.planner5d.library.activity.fragment.list.b0$a r9 = com.planner5d.library.activity.fragment.list.b0.a.Loading
                com.planner5d.library.activity.fragment.list.l1$w$b r3 = new com.planner5d.library.activity.fragment.list.l1$w$b
                r7 = 3
                com.planner5d.library.activity.fragment.list.l1 r5 = r8.f134371d
                kotlin.jvm.functions.Function0<kotlin.Unit> r6 = r8.f134372e
                r3.<init>(r5, r6, r4)
                r8.f134369b = r4
                r8.f134368a = r2
                r7 = 1
                java.lang.Object r8 = r1.a(r9, r3, r8)
                if (r8 != r0) goto L68
            L66:
                r7 = 2
                return r0
            L68:
                kotlin.Unit r8 = kotlin.Unit.f312394a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.list.l1.w.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.planner5d.library.activity.fragment.list.b0.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((w) create(bVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.list.MainListViewModel", f = "MainListViewModel.kt", i = {0}, l = {470, 474}, m = "reloadFilters", n = {"this"}, s = {"L$0"})
    static final class x extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f134383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f134384b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f134385c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134387e;

        x(kotlin.coroutines.d<? super x> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f134385c = obj;
            this.f134387e |= Integer.MIN_VALUE;
            return l1.this.N1(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.list.MainListViewModel$reloadFilters$2", f = "MainListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class y extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super d<com.planner5d.library.database.model.j>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f134388a;

        y(kotlin.coroutines.d<? super y> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l1.this.new y(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f134388a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return l1.this.n1();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super d<com.planner5d.library.database.model.j>> dVar) {
            return ((y) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.list.MainListViewModel$reloadFilters$3", f = "MainListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class z extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f134390a;

        z(kotlin.coroutines.d<? super z> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l1.this.new z(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f134390a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            l1 l1Var = l1.this;
            l1Var.f134280p1 = l1Var.o1();
            androidx.lifecycle.w0<f> w0VarC1 = l1.this.c1();
            Intrinsics.checkNotNull(w0VarC1, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.planner5d.library.activity.fragment.list.MainListViewModel.FolderSelectionState>");
            ((androidx.lifecycle.c1) w0VarC1).o(new f(true, l1.this.a1()));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((z) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ij.a
    public l1(@NotNull com.planner5d.library.application.b application, @NotNull com.planner5d.library.activity.fragment.dialog.k dialogLauncher, @NotNull com.planner5d.library.model.manager.synchronization.i synchronizationManager, @NotNull com.planner5d.library.model.manager.c0 folderManager, @NotNull com.planner5d.library.modules.user.user.t userAuthorization, @NotNull s4 supportManager, @NotNull com.planner5d.library.model.manager.config.j featureConfigManager, @NotNull com.planner5d.library.model.manager.contest.g contestManager, @NotNull b2 messageManager, @NotNull com.planner5d.library.activity.fragment.x navigator, @NotNull com.planner5d.library.application.d configuration, @NotNull com.planner5d.library.services.utility.f2 nullReporter, @NotNull ErrorMessageParser errorMessageParser, @NotNull l3 statisticsEventContests, @NotNull com.planner5d.library.model.manager.spaces.documents.c documentsManager, @NotNull m3 documentsStatistics) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(dialogLauncher, "dialogLauncher");
        Intrinsics.checkNotNullParameter(synchronizationManager, "synchronizationManager");
        Intrinsics.checkNotNullParameter(folderManager, "folderManager");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(supportManager, "supportManager");
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        Intrinsics.checkNotNullParameter(contestManager, "contestManager");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(nullReporter, "nullReporter");
        Intrinsics.checkNotNullParameter(errorMessageParser, "errorMessageParser");
        Intrinsics.checkNotNullParameter(statisticsEventContests, "statisticsEventContests");
        Intrinsics.checkNotNullParameter(documentsManager, "documentsManager");
        Intrinsics.checkNotNullParameter(documentsStatistics, "documentsStatistics");
        this.f134255a = application;
        this.f134256b = dialogLauncher;
        this.f134257c = synchronizationManager;
        this.f134258d = folderManager;
        this.f134259e = userAuthorization;
        this.f134260f = supportManager;
        this.f134261g = featureConfigManager;
        this.f134263h = contestManager;
        this.f134265i = messageManager;
        this.f134267j = navigator;
        this.f134269k = configuration;
        this.f134271l = nullReporter;
        this.f134273m = errorMessageParser;
        this.f134275n = statisticsEventContests;
        this.f134277o = documentsManager;
        this.f134283s = documentsStatistics;
        this.f134284t = kotlin.g0.c(new Function0() { // from class: com.planner5d.library.activity.fragment.list.y0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l1.B0(this.f134451a);
            }
        });
        this.f134285v = new androidx.lifecycle.c1();
        int i10 = 3;
        this.f134286w = new androidx.lifecycle.c1(new k(null, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0));
        this.X = new androidx.lifecycle.c1(new i(false, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0));
        this.Z = j.FOLDERS_FIRST;
        this.f134279p0 = new d<>(null, null, false, 4, null);
        this.f134280p1 = new e(null, null);
        this.H1 = new androidx.lifecycle.c1(new f(false, this.f134280p1));
        this.f134281p2 = kotlin.g0.c(new Function0() { // from class: com.planner5d.library.activity.fragment.list.z0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l1.D0(this.f134453a);
            }
        });
        this.f134262g3 = kotlin.g0.c(new Function0() { // from class: com.planner5d.library.activity.fragment.list.a1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(l1.a2(this.f133980a));
            }
        });
        this.f134266i3 = new Function0() { // from class: com.planner5d.library.activity.fragment.list.b1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l1.e2();
            }
        };
        this.f134272l3 = new androidx.lifecycle.c1<>();
        this.f134274m3 = new AtomicBoolean(false);
        this.f134276n3 = new ArrayList();
        this.f134278o3 = new com.planner5d.library.view.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.activity.fragment.list.b0 B0(final l1 l1Var) {
        return new com.planner5d.library.activity.fragment.list.b0(g2.a(l1Var), new Function1() { // from class: com.planner5d.library.activity.fragment.list.w0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l1.C0(this.f134448a, (b0.a[]) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit C0(l1 l1Var, com.planner5d.library.activity.fragment.list.b0.a[] it) {
        Unit unit;
        Intrinsics.checkNotNullParameter(it, "it");
        synchronized (l1Var.f134286w) {
            try {
                androidx.lifecycle.w0<k> w0Var = l1Var.f134286w;
                Intrinsics.checkNotNull(w0Var, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.planner5d.library.activity.fragment.list.MainListViewModel.State>");
                T tF = ((androidx.lifecycle.c1) l1Var.f134286w).f();
                Intrinsics.checkNotNull(tF);
                ((androidx.lifecycle.c1) w0Var).r(k.d((k) tF, null, it, 1, null));
                unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return unit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.lifecycle.c1 D0(l1 l1Var) {
        return new androidx.lifecycle.c1(l1Var.W0().x());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D1(l1 l1Var, g gVar) {
        l1Var.Q0().d(com.planner5d.library.activity.fragment.list.b0.a.Refreshing, l1Var.new u(gVar, null));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F1(Function0 function0, Boolean bool) {
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            function0.invoke();
        }
    }

    public static /* synthetic */ void G0(l1 l1Var, j jVar, boolean z10, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        l1Var.E0(jVar, z10, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G1(Function0 function0, Boolean bool) {
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            function0.invoke();
        }
    }

    private final void H1(Boolean bool, Folder folder) {
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            kotlinx.coroutines.k.f(g2.a(this), com.planner5d.library.services.utility.s.f229729a.h(), null, new v(folder, null), 2, null);
        }
    }

    private final void I0(Object obj) {
        Q0().d(com.planner5d.library.activity.fragment.list.b0.a.Refreshing, new l(obj, null));
    }

    private final q1<h0> J0(androidx.paging.u<Integer, h0> uVar) {
        return new q1.b(uVar, 36).i(new Executor() { // from class: com.planner5d.library.activity.fragment.list.v0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                l1.K0(this.f134437a, runnable);
            }
        }).f(new Executor() { // from class: com.planner5d.library.activity.fragment.list.c1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                l1.L0(this.f134031a, runnable);
            }
        }).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K0(l1 l1Var, Runnable runnable) {
        kotlinx.coroutines.k.f(g2.a(l1Var), com.planner5d.library.services.utility.s.f229729a.a(), null, new m(runnable, null), 2, null);
    }

    private final void K1(com.planner5d.library.services.utility.i iVar) {
        ArrayList<Parcelable> arrayList;
        e eVarE;
        com.planner5d.library.database.model.j jVarA;
        e eVarE2;
        List<com.planner5d.library.database.model.j> listB;
        iVar.m(com.planner5d.library.services.r.folderSelectionMode, true);
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.selectedFolders;
        f fVarF = this.H1.f();
        if (fVarF == null || (eVarE2 = fVarF.e()) == null || (listB = eVarE2.b()) == null) {
            arrayList = new ArrayList<>();
        } else {
            List<com.planner5d.library.database.model.j> list = listB;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((com.planner5d.library.database.model.j) it.next()).b());
            }
            arrayList = new ArrayList<>(arrayList2);
        }
        iVar.k(rVar, arrayList);
        com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.folderFrom;
        f fVarF2 = this.H1.f();
        iVar.h(rVar2, (fVarF2 == null || (eVarE = fVarF2.e()) == null || (jVarA = eVarE.a()) == null) ? null : jVarA.b());
        W0().E(iVar, this.f134268j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L0(l1 l1Var, Runnable runnable) {
        int i10 = 3 & 0;
        kotlinx.coroutines.k.f(g2.a(l1Var), com.planner5d.library.services.utility.s.f229729a.h(), null, new n(runnable, null), 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void M1(l1 l1Var, boolean z10, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function0 = null;
        }
        l1Var.L1(z10, function0);
    }

    public static /* synthetic */ Bundle N0(l1 l1Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return l1Var.M0(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0099, code lost:
    
        if (kotlinx.coroutines.i.h(r7, r8, r0) == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N1(kotlin.coroutines.d<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            r6 = 5
            boolean r0 = r8 instanceof com.planner5d.library.activity.fragment.list.l1.x
            if (r0 == 0) goto L19
            r0 = r8
            r0 = r8
            com.planner5d.library.activity.fragment.list.l1$x r0 = (com.planner5d.library.activity.fragment.list.l1.x) r0
            r6 = 5
            int r1 = r0.f134387e
            r6 = 0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 1
            r3 = r1 & r2
            if (r3 == 0) goto L19
            int r1 = r1 - r2
            r0.f134387e = r1
            r6 = 2
            goto L1e
        L19:
            com.planner5d.library.activity.fragment.list.l1$x r0 = new com.planner5d.library.activity.fragment.list.l1$x
            r0.<init>(r8)
        L1e:
            java.lang.Object r8 = r0.f134385c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r6 = 5
            int r2 = r0.f134387e
            r3 = 2
            r4 = 1
            r6 = 5
            r5 = 0
            if (r2 == 0) goto L4b
            r6 = 7
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            kotlin.ResultKt.m(r8)
            goto L9c
        L36:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3e:
            r6 = 7
            java.lang.Object r7 = r0.f134384b
            com.planner5d.library.activity.fragment.list.l1 r7 = (com.planner5d.library.activity.fragment.list.l1) r7
            java.lang.Object r2 = r0.f134383a
            com.planner5d.library.activity.fragment.list.l1 r2 = (com.planner5d.library.activity.fragment.list.l1) r2
            kotlin.ResultKt.m(r8)
            goto L74
        L4b:
            kotlin.ResultKt.m(r8)
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.f134274m3
            boolean r8 = r8.getAndSet(r4)
            if (r8 != 0) goto L9f
            r6 = 5
            com.planner5d.library.services.utility.s r8 = com.planner5d.library.services.utility.s.f229729a
            kotlinx.coroutines.z1 r8 = r8.h()
            r6 = 1
            com.planner5d.library.activity.fragment.list.l1$y r2 = new com.planner5d.library.activity.fragment.list.l1$y
            r6 = 0
            r2.<init>(r5)
            r0.f134383a = r7
            r0.f134384b = r7
            r0.f134387e = r4
            java.lang.Object r8 = kotlinx.coroutines.i.h(r8, r2, r0)
            if (r8 != r1) goto L72
            r6 = 6
            goto L9b
        L72:
            r2 = r7
            r2 = r7
        L74:
            r6 = 1
            com.planner5d.library.activity.fragment.list.l1$d r8 = (com.planner5d.library.activity.fragment.list.l1.d) r8
            r7.f134279p0 = r8
            com.planner5d.library.activity.fragment.list.l1$d<com.planner5d.library.database.model.j> r7 = r2.f134279p0
            r6 = 2
            boolean r7 = r7.c()
            r6 = 4
            if (r7 == 0) goto L9f
            r6 = 6
            com.planner5d.library.services.utility.s r7 = com.planner5d.library.services.utility.s.f229729a
            kotlinx.coroutines.z1 r7 = r7.h()
            com.planner5d.library.activity.fragment.list.l1$z r8 = new com.planner5d.library.activity.fragment.list.l1$z
            r8.<init>(r5)
            r0.f134383a = r5
            r0.f134384b = r5
            r0.f134387e = r3
            java.lang.Object r7 = kotlinx.coroutines.i.h(r7, r8, r0)
            if (r7 != r1) goto L9c
        L9b:
            return r1
        L9c:
            kotlin.Unit r7 = kotlin.Unit.f312394a
            return r7
        L9f:
            kotlin.Unit r7 = kotlin.Unit.f312394a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.list.l1.N1(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object O0(kotlin.coroutines.d<? super Bundle> dVar) {
        o oVar;
        com.planner5d.library.services.utility.i iVar;
        if (dVar instanceof o) {
            oVar = (o) dVar;
            int i10 = oVar.f134344d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                oVar.f134344d = i10 - Integer.MIN_VALUE;
            } else {
                oVar = new o(dVar);
            }
        } else {
            oVar = new o(dVar);
        }
        Object obj = oVar.f134342b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = oVar.f134344d;
        if (i11 == 0) {
            ResultKt.m(obj);
            com.planner5d.library.services.utility.i iVar2 = new com.planner5d.library.services.utility.i(this.f134266i3.invoke());
            Q1(iVar2);
            z1 z1VarH = com.planner5d.library.services.utility.s.f229729a.h();
            p pVar = new p(iVar2, null);
            oVar.f134341a = iVar2;
            oVar.f134344d = 1;
            if (kotlinx.coroutines.i.h(z1VarH, pVar, oVar) == objL) {
                return objL;
            }
            iVar = iVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iVar = (com.planner5d.library.services.utility.i) oVar.f134341a;
            ResultKt.m(obj);
        }
        return iVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O1(Object obj) {
        if (this.f134276n3.contains(obj)) {
            this.f134276n3.remove(obj);
        } else {
            this.f134276n3.add(obj);
        }
        d2();
    }

    private final void P1(Object obj) {
        Q0().d(com.planner5d.library.activity.fragment.list.b0.a.Selecting, new a0(obj, null));
    }

    private final void Q1(com.planner5d.library.services.utility.i iVar) {
        iVar.t(com.planner5d.library.services.r.sortBy, this.Z).t(com.planner5d.library.services.r.appearanceMode, S0().f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object W1(Throwable th2, kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.a(), new b0(th2, this, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    private final com.planner5d.library.database.model.j Y0(Bundle bundle, com.planner5d.library.services.r rVar) {
        try {
            Bundle bundleB = f134252q3.b(bundle, rVar);
            if (bundleB != null) {
                return new com.planner5d.library.services.utility.j(bundleB).c(com.planner5d.library.services.r.type, 0) == com.planner5d.library.database.model.g.TYPE_DOCUMENTS.n() ? (com.planner5d.library.database.model.j) kotlinx.coroutines.j.b(null, new q(bundleB, null), 1, null) : this.f134258d.E(this.f134259e.a(), bundleB).observeOn(com.planner5d.library.services.rx.c.f224934d).toBlocking().firstOrDefault(null);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    static /* synthetic */ com.planner5d.library.database.model.j Z0(l1 l1Var, Bundle bundle, com.planner5d.library.services.r rVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            rVar = com.planner5d.library.services.r.folder;
        }
        return l1Var.Y0(bundle, rVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a2(l1 l1Var) {
        return l1Var.W0() instanceof com.planner5d.library.activity.fragment.spaces.documents.o;
    }

    private final void d2() {
        androidx.lifecycle.w0<i> w0Var = this.X;
        Intrinsics.checkNotNull(w0Var, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.planner5d.library.activity.fragment.list.MainListViewModel.SelectionState>");
        ((androidx.lifecycle.c1) w0Var).o(new i(!this.f134276n3.isEmpty(), this.f134276n3));
    }

    private final List<com.planner5d.library.database.model.j> e1(Bundle bundle) {
        ArrayList<Parcelable> arrayListR = new com.planner5d.library.services.utility.j(bundle).r(com.planner5d.library.services.r.selectedFolders, null);
        if (arrayListR != null && !arrayListR.isEmpty()) {
            com.planner5d.library.model.manager.c0 c0Var = this.f134258d;
            id.a aVarA = this.f134259e.a();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListR, 10));
            for (Parcelable parcelable : arrayListR) {
                Intrinsics.checkNotNull(parcelable, "null cannot be cast to non-null type android.os.Bundle");
                arrayList.add(Long.valueOf(((Bundle) parcelable).getLong(com.planner5d.library.services.r.id.f224891a)));
            }
            return c0Var.z(aVarA, arrayList);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle e2() {
        return Bundle.EMPTY;
    }

    private final void f2(String str) {
        this.f134275n.L0(Long.valueOf(Long.parseLong(str)), l3.a.contests_voting_opened, l3.b.bottom_sheet);
        int i10 = 1 >> 0;
        com.planner5d.library.activity.fragment.x.g(this.f134267j, new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) ContestVotingFragment.class, new com.planner5d.library.services.utility.i().g(com.planner5d.library.services.r.contestUid, Long.parseLong(str)).a()).k(new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) ProjectsPagesFragment.class, new com.planner5d.library.services.utility.i().t(com.planner5d.library.services.r.tab, com.planner5d.library.services.r.floorPlansList).a())), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d<com.planner5d.library.database.model.j> n1() {
        com.planner5d.library.database.model.j jVarZ0 = Z0(this, this.f134268j3, null, 2, null);
        List<com.planner5d.library.database.model.j> listE1 = e1(this.f134268j3);
        Bundle bundle = this.f134268j3;
        boolean z10 = false;
        if (bundle != null && bundle.getBoolean(com.planner5d.library.services.r.folderSelectionMode.f224891a, false)) {
            z10 = true;
        }
        return new d<>(jVarZ0, listE1, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e o1() {
        return !new com.planner5d.library.services.utility.j(this.f134268j3).f(com.planner5d.library.services.r.folderSelectionMode, false) ? new e(null, null) : new e(Y0(this.f134268j3, com.planner5d.library.services.r.folderFrom), e1(this.f134268j3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<com.planner5d.library.database.model.j> p1() {
        if (W0().N() == com.planner5d.library.database.model.g.TYPE_DOCUMENTS.n()) {
            return (List) kotlinx.coroutines.j.b(null, new r(null), 1, null);
        }
        com.planner5d.library.model.manager.c0 c0Var = this.f134258d;
        id.a aVarA = this.f134259e.a();
        com.planner5d.library.model.manager.c0.a aVarL = this.Z.l();
        int iN = W0().N();
        int[] iArrQ = W0().Q();
        List<Folder> listFirst = c0Var.C(aVarA, aVarL, iN, Arrays.copyOf(iArrQ, iArrQ.length)).toBlocking().first();
        Intrinsics.checkNotNull(listFirst);
        return listFirst;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r1(i it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x0075  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00df, code lost:
    
        if (r15.g0(r14, r0) == r1) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s1(kotlin.coroutines.d<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.list.l1.s1(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t1(l1 l1Var, Contest contest) {
        String str = contest.uid;
        if (str == null) {
            return Unit.f312394a;
        }
        l1Var.f2(str);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w1(l1 l1Var, long j10) {
        l1Var.f134256b.c(FolderEdit.class).h(new com.planner5d.library.services.utility.i().g(com.planner5d.library.services.r.id, j10).a()).g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x1(l1 l1Var, com.planner5d.library.database.model.j jVar, com.planner5d.library.database.model.spaces.documents.c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        g0 g0VarW0 = l1Var.W0();
        com.planner5d.library.activity.fragment.spaces.documents.o oVar = g0VarW0 instanceof com.planner5d.library.activity.fragment.spaces.documents.o ? (com.planner5d.library.activity.fragment.spaces.documents.o) g0VarW0 : null;
        if (oVar != null) {
            oVar.t0(jVar, Intrinsics.areEqual(jVar, l1Var.f134279p0.b()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y1(l1 l1Var, com.planner5d.library.database.model.j jVar, Boolean bool) {
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            kotlinx.coroutines.k.f(g2.a(l1Var), null, null, l1Var.new t(jVar, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z1(l1 l1Var, com.planner5d.library.database.model.j jVar, Boolean bool) {
        Intrinsics.checkNotNull(jVar, "null cannot be cast to non-null type com.planner5d.library.model.Folder");
        l1Var.H1(bool, (Folder) jVar);
    }

    public final void A1(@Nullable Object obj) {
        if (obj != null) {
            i iVarF = this.X.f();
            if (iVarF == null || !iVarF.e()) {
                I0(obj);
            } else {
                P1(obj);
            }
        }
    }

    public final boolean B1(@Nullable Object obj, @NotNull MenuItem itemMenu) {
        Intrinsics.checkNotNullParameter(itemMenu, "itemMenu");
        g0 g0VarW0 = W0();
        androidx.fragment.app.s sVar = this.f134264h3;
        if (sVar != null && obj != null) {
            return g0VarW0.m(sVar, obj, itemMenu);
        }
        return false;
    }

    public final void C1(@NotNull final g button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.f134278o3.a(new Function0() { // from class: com.planner5d.library.activity.fragment.list.h1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l1.D1(this.f134080a, button);
            }
        });
    }

    public final void E0(@NotNull j newSortOrder, boolean z10, @NotNull Function0<Unit> onRefreshed) {
        Intrinsics.checkNotNullParameter(newSortOrder, "newSortOrder");
        Intrinsics.checkNotNullParameter(onRefreshed, "onRefreshed");
        if (this.Z != newSortOrder) {
            this.Z = newSortOrder;
            if (z10) {
                L1(false, onRefreshed);
            }
            if (g1()) {
                this.f134283s.F(newSortOrder == j.BY_DATE ? m3.d.last_update : m3.d.sortByName, this.f134279p0.b() == null);
            }
        }
    }

    public final void E1(@NotNull final Function0<Unit> onOkClick) {
        Intrinsics.checkNotNullParameter(onOkClick, "onOkClick");
        if (g1()) {
            ConfirmDeleteMultipleMessageRedesign.Companion.a(this.f134256b, null, new com.planner5d.library.activity.fragment.dialog.u() { // from class: com.planner5d.library.activity.fragment.list.j1
                @Override // com.planner5d.library.activity.fragment.dialog.u
                public final void a(Object obj) {
                    l1.F1(onOkClick, (Boolean) obj);
                }
            });
        } else {
            ConfirmDeleteMultipleMessage.show(this.f134256b, (com.planner5d.library.activity.fragment.dialog.u<Boolean>) new com.planner5d.library.activity.fragment.dialog.u() { // from class: com.planner5d.library.activity.fragment.list.k1
                @Override // com.planner5d.library.activity.fragment.dialog.u
                public final void a(Object obj) {
                    l1.G1(onOkClick, (Boolean) obj);
                }
            });
        }
    }

    public final boolean H0() {
        com.planner5d.library.database.model.j jVarB = this.f134279p0.b();
        return jVarB != null && (Folder.y(jVarB.c()) ^ true);
    }

    public final boolean I1(@Nullable Object obj) {
        f fVarF;
        i iVarF = this.X.f();
        if ((iVarF != null && iVarF.e()) || ((fVarF = this.H1.f()) != null && fVarF.f())) {
            return true;
        }
        if (obj != null) {
            P1(obj);
        }
        return true;
    }

    public final void J1() {
        androidx.fragment.app.s sVar = this.f134264h3;
        if (sVar != null) {
            this.f134260f.a(sVar);
        }
    }

    public final void L1(boolean z10, @Nullable Function0<Unit> function0) {
        Q0().d(com.planner5d.library.activity.fragment.list.b0.a.Refreshing, new w(z10, this, function0, null));
    }

    @NotNull
    public final Bundle M0(boolean z10) {
        com.planner5d.library.services.utility.i iVar = new com.planner5d.library.services.utility.i(this.f134266i3.invoke());
        Q1(iVar);
        if (z10) {
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.folderFrom;
            com.planner5d.library.database.model.j jVarB = this.f134279p0.b();
            iVar.h(rVar, jVarB != null ? jVarB.b() : null);
        }
        return iVar.a();
    }

    public final void P0() {
        this.f134276n3.clear();
        d2();
    }

    @NotNull
    public final com.planner5d.library.activity.fragment.list.b0 Q0() {
        return (com.planner5d.library.activity.fragment.list.b0) this.f134284t.getValue();
    }

    @Nullable
    public final androidx.fragment.app.s R0() {
        return this.f134264h3;
    }

    public final void R1(@Nullable androidx.fragment.app.s sVar) {
        this.f134264h3 = sVar;
    }

    @NotNull
    public final androidx.lifecycle.c1<EnhancedRecyclerView.e> S0() {
        return (androidx.lifecycle.c1) this.f134281p2.getValue();
    }

    public final void S1(@NotNull EnhancedRecyclerView.e appearanceMode) {
        Intrinsics.checkNotNullParameter(appearanceMode, "appearanceMode");
        if (S0().f() == appearanceMode) {
            return;
        }
        S0().r(appearanceMode);
    }

    public final void T1(@Nullable Bundle bundle) {
        this.f134268j3 = bundle;
    }

    @Nullable
    public final Bundle U0() {
        return this.f134268j3;
    }

    public final void U1(boolean z10) {
        ArrayList arrayList;
        if (this.f134282p3 != z10) {
            androidx.lifecycle.w0<List<yc.d<h0>>> w0Var = this.f134285v;
            Intrinsics.checkNotNull(w0Var, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.collections.List<com.planner5d.library.model.listitem.ListItemWithBlocker<com.planner5d.library.activity.fragment.list.MainListItem>>>");
            androidx.lifecycle.c1 c1Var = (androidx.lifecycle.c1) w0Var;
            List list = (List) ((androidx.lifecycle.c1) this.f134285v).f();
            if (list != null) {
                List list2 = list;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new yc.d(((yc.d) it.next()).c(), z10));
                }
            } else {
                arrayList = null;
            }
            c1Var.r(arrayList);
            this.f134282p3 = z10;
        }
    }

    public final boolean V0() {
        return this.f134270k3;
    }

    public final void V1(@NotNull g0 g0Var) {
        Intrinsics.checkNotNullParameter(g0Var, "<set-?>");
        this.Y = g0Var;
    }

    @NotNull
    public final g0 W0() {
        g0 g0Var = this.Y;
        if (g0Var != null) {
            return g0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("contentViewModel");
        return null;
    }

    @NotNull
    public final d<com.planner5d.library.database.model.j> X0() {
        return this.f134279p0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void X1() {
        synchronized (this.f134286w) {
            try {
                androidx.lifecycle.w0<k> w0Var = this.f134286w;
                Intrinsics.checkNotNull(w0Var, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.planner5d.library.activity.fragment.list.MainListViewModel.State>");
                androidx.lifecycle.c1 c1Var = (androidx.lifecycle.c1) w0Var;
                k kVar = (k) ((androidx.lifecycle.c1) this.f134286w).f();
                c1Var.r(kVar != null ? k.d(kVar, null, null, 2, null) : null);
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void Y1(@NotNull Function0<Bundle> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.f134266i3 = function0;
    }

    public final void Z1() {
        this.f134272l3.r(new Object());
    }

    @NotNull
    public final e a1() {
        return this.f134280p1;
    }

    @NotNull
    public final androidx.lifecycle.w0<List<yc.d<h0>>> b1() {
        return this.f134285v;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        if (r7.W1(r8, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b2(@org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            r6 = 2
            boolean r0 = r8 instanceof com.planner5d.library.activity.fragment.list.l1.c0
            r6 = 7
            if (r0 == 0) goto L1a
            r0 = r8
            r0 = r8
            r6 = 5
            com.planner5d.library.activity.fragment.list.l1$c0 r0 = (com.planner5d.library.activity.fragment.list.l1.c0) r0
            int r1 = r0.f134297d
            r6 = 0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 1
            r3 = r1 & r2
            r6 = 2
            if (r3 == 0) goto L1a
            int r1 = r1 - r2
            r0.f134297d = r1
            goto L1f
        L1a:
            com.planner5d.library.activity.fragment.list.l1$c0 r0 = new com.planner5d.library.activity.fragment.list.l1$c0
            r0.<init>(r8)
        L1f:
            java.lang.Object r8 = r0.f134295b
            r6 = 0
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r6 = 6
            int r2 = r0.f134297d
            r3 = 0
            r6 = 0
            r4 = 2
            r6 = 2
            r5 = 1
            if (r2 == 0) goto L50
            if (r2 == r5) goto L46
            r6 = 2
            if (r2 != r4) goto L3b
            r6 = 2
            kotlin.ResultKt.m(r8)
            r6 = 2
            goto L78
        L3b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "of rrrupuhlv//s cwit ekb// o///eoni cema l/eeointeo"
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            r6 = 3
            throw r7
        L46:
            java.lang.Object r7 = r0.f134294a
            com.planner5d.library.activity.fragment.list.l1 r7 = (com.planner5d.library.activity.fragment.list.l1) r7
            kotlin.ResultKt.m(r8)     // Catch: java.lang.Throwable -> L4e
            goto L78
        L4e:
            r8 = move-exception
            goto L6d
        L50:
            kotlin.ResultKt.m(r8)
            r6 = 1
            com.planner5d.library.services.utility.s r8 = com.planner5d.library.services.utility.s.f229729a     // Catch: java.lang.Throwable -> L4e
            kotlinx.coroutines.z1 r8 = r8.h()     // Catch: java.lang.Throwable -> L4e
            com.planner5d.library.activity.fragment.list.l1$d0 r2 = new com.planner5d.library.activity.fragment.list.l1$d0     // Catch: java.lang.Throwable -> L4e
            r6 = 6
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L4e
            r6 = 4
            r0.f134294a = r7     // Catch: java.lang.Throwable -> L4e
            r6 = 6
            r0.f134297d = r5     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r7 = kotlinx.coroutines.i.h(r8, r2, r0)     // Catch: java.lang.Throwable -> L4e
            if (r7 != r1) goto L78
            goto L77
        L6d:
            r0.f134294a = r3
            r0.f134297d = r4
            java.lang.Object r7 = r7.W1(r8, r0)
            if (r7 != r1) goto L78
        L77:
            return r1
        L78:
            r6 = 0
            kotlin.Unit r7 = kotlin.Unit.f312394a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.list.l1.b2(kotlin.coroutines.d):java.lang.Object");
    }

    @NotNull
    public final androidx.lifecycle.w0<f> c1() {
        return this.H1;
    }

    public final void c2() {
        EnhancedRecyclerView.e eVarF = S0().f();
        if (eVarF == null) {
            return;
        }
        EnhancedRecyclerView.e eVar = EnhancedRecyclerView.e.GRID;
        boolean z10 = eVarF == eVar;
        androidx.lifecycle.c1<EnhancedRecyclerView.e> c1VarS0 = S0();
        if (z10) {
            eVar = EnhancedRecyclerView.e.LIST;
        }
        c1VarS0.r(eVar);
        if (g1()) {
            this.f134283s.p0(z10, this.f134279p0.b() == null);
        }
    }

    @NotNull
    public final androidx.lifecycle.w0<i> d1() {
        return this.X;
    }

    @NotNull
    public final androidx.lifecycle.c1<Object> f1() {
        return this.f134272l3;
    }

    public final boolean g1() {
        return ((Boolean) this.f134262g3.getValue()).booleanValue();
    }

    @NotNull
    public final j h1() {
        return this.Z;
    }

    @NotNull
    public final androidx.lifecycle.w0<k> j1() {
        return this.f134286w;
    }

    @NotNull
    public final Function0<Bundle> k1() {
        return this.f134266i3;
    }

    public final boolean l1() {
        List<yc.d<h0>> listF = this.f134285v.f();
        if (listF != null) {
            List<yc.d<h0>> list = listF;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                yc.d dVar = (yc.d) it.next();
                if (((h0) dVar.c()).f() != h0.a.SortingAndAppearance && ((h0) dVar.c()).f() != h0.a.NewItem && ((h0) dVar.c()).f() != h0.a.AiRecognitionInProgress && ((h0) dVar.c()).f() != h0.a.AiRecognitionFailed) {
                    int i10 = 5 << 1;
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean m1() {
        return this.f134269k.r();
    }

    @NotNull
    public final androidx.lifecycle.w0<Boolean> q1() {
        return c2.h(this.X, new Function1() { // from class: com.planner5d.library.activity.fragment.list.x0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(l1.r1((l1.i) obj));
            }
        });
    }

    public final void u1(@Nullable com.planner5d.library.database.model.j jVar) {
        if (jVar != null) {
            i iVarF = this.X.f();
            if (iVarF != null && iVarF.e()) {
                P1(jVar);
                return;
            }
            g0 g0VarW0 = W0();
            com.planner5d.library.services.utility.i iVar = new com.planner5d.library.services.utility.i(this.f134266i3.invoke());
            Q1(iVar);
            f fVarF = this.H1.f();
            if (fVarF != null && fVarF.f()) {
                K1(iVar);
            }
            g0VarW0.J(iVar.a(), jVar);
        }
    }

    public final boolean v1(@NotNull final com.planner5d.library.database.model.j folder, @NotNull MenuItem itemMenu) {
        Intrinsics.checkNotNullParameter(folder, "folder");
        Intrinsics.checkNotNullParameter(itemMenu, "itemMenu");
        if (!Folder.y(folder.c())) {
            int itemId = itemMenu.getItemId();
            if (itemId != com.planner5d.library.f.j.f168173k1) {
                if (itemId == com.planner5d.library.f.j.f168221m1) {
                    com.planner5d.library.services.utility.f2 f2Var = this.f134271l;
                    Folder folder2 = folder instanceof Folder ? (Folder) folder : null;
                    f2Var.a(folder2 != null ? folder2.getId() : null, new e2() { // from class: com.planner5d.library.activity.fragment.list.f1
                        @Override // com.planner5d.library.services.utility.e2
                        public final void apply(Object obj) {
                            l1.w1(this.f134053a, ((Long) obj).longValue());
                        }
                    });
                } else if (itemId == com.planner5d.library.f.j.S0) {
                    this.f134271l.a(folder instanceof com.planner5d.library.database.model.spaces.documents.c ? (com.planner5d.library.database.model.spaces.documents.c) folder : null, new e2() { // from class: com.planner5d.library.activity.fragment.list.g1
                        @Override // com.planner5d.library.services.utility.e2
                        public final void apply(Object obj) {
                            l1.x1(this.f134055a, folder, (com.planner5d.library.database.model.spaces.documents.c) obj);
                        }
                    });
                }
            } else if (folder instanceof com.planner5d.library.database.model.spaces.documents.c) {
                ConfirmDeleteMessageRedesign.Companion.a(this.f134256b, this.f134255a.getString(com.planner5d.library.f.s.f169540xc), new com.planner5d.library.activity.fragment.dialog.u() { // from class: com.planner5d.library.activity.fragment.list.d1
                    @Override // com.planner5d.library.activity.fragment.dialog.u
                    public final void a(Object obj) {
                        l1.y1(this.f134036a, folder, (Boolean) obj);
                    }
                });
            } else {
                ConfirmDeleteMessage.show(this.f134256b, this.f134255a.getString(com.planner5d.library.f.s.f169540xc), new com.planner5d.library.activity.fragment.dialog.u() { // from class: com.planner5d.library.activity.fragment.list.e1
                    @Override // com.planner5d.library.activity.fragment.dialog.u
                    public final void a(Object obj) {
                        l1.z1(this.f134043a, folder, (Boolean) obj);
                    }
                });
            }
            return true;
        }
        return false;
    }
}
