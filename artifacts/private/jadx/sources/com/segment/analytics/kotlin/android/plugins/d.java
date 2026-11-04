package com.segment.analytics.kotlin.android.plugins;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.c0;
import androidx.lifecycle.n0;
import androidx.lifecycle.o0;
import com.segment.analytics.kotlin.core.BaseEvent;
import com.segment.analytics.kotlin.core.Settings;
import com.segment.analytics.kotlin.core.s;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObjectBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nAndroidLifecyclePlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidLifecyclePlugin.kt\ncom/segment/analytics/kotlin/android/plugins/AndroidLifecyclePlugin\n+ 2 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n*L\n1#1,359:1\n28#2,4:360\n28#2,4:364\n28#2,4:368\n*S KotlinDebug\n*F\n+ 1 AndroidLifecyclePlugin.kt\ncom/segment/analytics/kotlin/android/plugins/AndroidLifecyclePlugin\n*L\n198#1:360,4\n248#1:364,4\n255#1:368,4\n*E\n"})
public final class d implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver, com.segment.analytics.kotlin.core.platform.e {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private static final String f266576n = "version";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private static final String f266577o = "build";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.segment.analytics.kotlin.core.a f266580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PackageInfo f266581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Application f266582d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f266585g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private c0 f266590l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private s f266591m;

    @NotNull
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private static final o0 f266578s = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.segment.analytics.kotlin.core.platform.e.b f266579a = com.segment.analytics.kotlin.core.platform.e.b.Utility;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f266583e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f266584f = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f266586h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final AtomicInteger f266587i = new AtomicInteger(1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f266588j = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f266589k = new AtomicBoolean(false);

    public static final class a implements o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private c0 f266592a = new C1855a();

        /* JADX INFO: renamed from: com.segment.analytics.kotlin.android.plugins.d$a$a, reason: collision with other inner class name */
        public static final class C1855a extends c0 {
            C1855a() {
            }

            @Override // androidx.lifecycle.c0
            public void c(@NotNull n0 observer) {
                Intrinsics.checkNotNullParameter(observer, "observer");
            }

            @Override // androidx.lifecycle.c0
            @NotNull
            public c0.b d() {
                return c0.b.DESTROYED;
            }

            @Override // androidx.lifecycle.c0
            public void g(@NotNull n0 observer) {
                Intrinsics.checkNotNullParameter(observer, "observer");
            }
        }

        a() {
        }

        @NotNull
        public final c0 a() {
            return this.f266592a;
        }

        public final void b(@NotNull c0 c0Var) {
            Intrinsics.checkNotNullParameter(c0Var, "<set-?>");
            this.f266592a = c0Var;
        }

        @Override // androidx.lifecycle.o0
        @NotNull
        public c0 getLifecycle() {
            return this.f266592a;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.segment.analytics.kotlin.android.plugins.AndroidLifecyclePlugin$onActivityCreated$1", f = "AndroidLifecyclePlugin.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f266593a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f266595c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Bundle f266596d;

        static final class a extends l0 implements Function1<com.segment.analytics.kotlin.core.platform.e, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Activity f266597a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bundle f266598b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Activity activity, Bundle bundle) {
                super(1);
                this.f266597a = activity;
                this.f266598b = bundle;
            }

            public final void c(@Nullable com.segment.analytics.kotlin.core.platform.e eVar) {
                if (eVar instanceof com.segment.analytics.kotlin.android.plugins.c) {
                    ((com.segment.analytics.kotlin.android.plugins.c) eVar).onActivityCreated(this.f266597a, this.f266598b);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(com.segment.analytics.kotlin.core.platform.e eVar) {
                c(eVar);
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Activity activity, Bundle bundle, kotlin.coroutines.d<? super c> dVar) {
            super(1, dVar);
            this.f266595c = activity;
            this.f266596d = bundle;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@NotNull kotlin.coroutines.d<?> dVar) {
            return d.this.new c(this.f266595c, this.f266596d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f266593a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            d.this.j().o(new a(this.f266595c, this.f266596d));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.segment.analytics.kotlin.android.plugins.d$d, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.segment.analytics.kotlin.android.plugins.AndroidLifecyclePlugin$onActivityDestroyed$1", f = "AndroidLifecyclePlugin.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C1856d extends o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f266599a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f266601c;

        /* JADX INFO: renamed from: com.segment.analytics.kotlin.android.plugins.d$d$a */
        static final class a extends l0 implements Function1<com.segment.analytics.kotlin.core.platform.e, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Activity f266602a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Activity activity) {
                super(1);
                this.f266602a = activity;
            }

            public final void c(@Nullable com.segment.analytics.kotlin.core.platform.e eVar) {
                if (eVar instanceof com.segment.analytics.kotlin.android.plugins.c) {
                    ((com.segment.analytics.kotlin.android.plugins.c) eVar).onActivityDestroyed(this.f266602a);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(com.segment.analytics.kotlin.core.platform.e eVar) {
                c(eVar);
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1856d(Activity activity, kotlin.coroutines.d<? super C1856d> dVar) {
            super(1, dVar);
            this.f266601c = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@NotNull kotlin.coroutines.d<?> dVar) {
            return d.this.new C1856d(this.f266601c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f266599a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            d.this.j().o(new a(this.f266601c));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((C1856d) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.segment.analytics.kotlin.android.plugins.AndroidLifecyclePlugin$onActivityPaused$1", f = "AndroidLifecyclePlugin.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f266603a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f266605c;

        static final class a extends l0 implements Function1<com.segment.analytics.kotlin.core.platform.e, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Activity f266606a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Activity activity) {
                super(1);
                this.f266606a = activity;
            }

            public final void c(@Nullable com.segment.analytics.kotlin.core.platform.e eVar) {
                if (eVar instanceof com.segment.analytics.kotlin.android.plugins.c) {
                    ((com.segment.analytics.kotlin.android.plugins.c) eVar).onActivityPaused(this.f266606a);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(com.segment.analytics.kotlin.core.platform.e eVar) {
                c(eVar);
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Activity activity, kotlin.coroutines.d<? super e> dVar) {
            super(1, dVar);
            this.f266605c = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@NotNull kotlin.coroutines.d<?> dVar) {
            return d.this.new e(this.f266605c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f266603a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            d.this.j().o(new a(this.f266605c));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.segment.analytics.kotlin.android.plugins.AndroidLifecyclePlugin$onActivityResumed$1", f = "AndroidLifecyclePlugin.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f266607a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f266609c;

        static final class a extends l0 implements Function1<com.segment.analytics.kotlin.core.platform.e, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Activity f266610a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Activity activity) {
                super(1);
                this.f266610a = activity;
            }

            public final void c(@Nullable com.segment.analytics.kotlin.core.platform.e eVar) {
                if (eVar instanceof com.segment.analytics.kotlin.android.plugins.c) {
                    ((com.segment.analytics.kotlin.android.plugins.c) eVar).onActivityResumed(this.f266610a);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(com.segment.analytics.kotlin.core.platform.e eVar) {
                c(eVar);
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Activity activity, kotlin.coroutines.d<? super f> dVar) {
            super(1, dVar);
            this.f266609c = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@NotNull kotlin.coroutines.d<?> dVar) {
            return d.this.new f(this.f266609c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f266607a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            d.this.j().o(new a(this.f266609c));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.segment.analytics.kotlin.android.plugins.AndroidLifecyclePlugin$onActivitySaveInstanceState$1", f = "AndroidLifecyclePlugin.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f266611a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f266613c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Bundle f266614d;

        static final class a extends l0 implements Function1<com.segment.analytics.kotlin.core.platform.e, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Activity f266615a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bundle f266616b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Activity activity, Bundle bundle) {
                super(1);
                this.f266615a = activity;
                this.f266616b = bundle;
            }

            public final void c(@Nullable com.segment.analytics.kotlin.core.platform.e eVar) {
                if (eVar instanceof com.segment.analytics.kotlin.android.plugins.c) {
                    ((com.segment.analytics.kotlin.android.plugins.c) eVar).onActivitySaveInstanceState(this.f266615a, this.f266616b);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(com.segment.analytics.kotlin.core.platform.e eVar) {
                c(eVar);
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Activity activity, Bundle bundle, kotlin.coroutines.d<? super g> dVar) {
            super(1, dVar);
            this.f266613c = activity;
            this.f266614d = bundle;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@NotNull kotlin.coroutines.d<?> dVar) {
            return d.this.new g(this.f266613c, this.f266614d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f266611a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            d.this.j().o(new a(this.f266613c, this.f266614d));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.segment.analytics.kotlin.android.plugins.AndroidLifecyclePlugin$onActivityStarted$1", f = "AndroidLifecyclePlugin.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f266617a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f266619c;

        static final class a extends l0 implements Function1<com.segment.analytics.kotlin.core.platform.e, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Activity f266620a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Activity activity) {
                super(1);
                this.f266620a = activity;
            }

            public final void c(@Nullable com.segment.analytics.kotlin.core.platform.e eVar) {
                if (eVar instanceof com.segment.analytics.kotlin.android.plugins.c) {
                    ((com.segment.analytics.kotlin.android.plugins.c) eVar).onActivityStarted(this.f266620a);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(com.segment.analytics.kotlin.core.platform.e eVar) {
                c(eVar);
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Activity activity, kotlin.coroutines.d<? super h> dVar) {
            super(1, dVar);
            this.f266619c = activity;
            int i10 = 3 << 1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@NotNull kotlin.coroutines.d<?> dVar) {
            return d.this.new h(this.f266619c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f266617a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            d.this.j().o(new a(this.f266619c));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.segment.analytics.kotlin.android.plugins.AndroidLifecyclePlugin$onActivityStopped$1", f = "AndroidLifecyclePlugin.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class i extends o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f266621a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f266623c;

        static final class a extends l0 implements Function1<com.segment.analytics.kotlin.core.platform.e, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Activity f266624a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Activity activity) {
                super(1);
                this.f266624a = activity;
            }

            public final void c(@Nullable com.segment.analytics.kotlin.core.platform.e eVar) {
                if (eVar instanceof com.segment.analytics.kotlin.android.plugins.c) {
                    ((com.segment.analytics.kotlin.android.plugins.c) eVar).onActivityStopped(this.f266624a);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(com.segment.analytics.kotlin.core.platform.e eVar) {
                c(eVar);
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Activity activity, kotlin.coroutines.d<? super i> dVar) {
            super(1, dVar);
            this.f266623c = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@NotNull kotlin.coroutines.d<?> dVar) {
            return d.this.new i(this.f266623c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f266621a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            d.this.j().o(new a(this.f266623c));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((i) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.segment.analytics.kotlin.android.plugins.AndroidLifecyclePlugin$runOnAnalyticsThread$1$1", f = "AndroidLifecyclePlugin.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f266625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<kotlin.coroutines.d<? super Unit>, Object> f266626b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, kotlin.coroutines.d<? super j> dVar) {
            super(2, dVar);
            this.f266626b = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new j(this.f266626b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f266625a;
            if (i10 == 0) {
                ResultKt.m(obj);
                Function1<kotlin.coroutines.d<? super Unit>, Object> function1 = this.f266626b;
                this.f266625a = 1;
                if (function1.invoke(this) == objL) {
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
        @Nullable
        public final Object invoke(@NotNull s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((j) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.segment.analytics.kotlin.android.plugins.AndroidLifecyclePlugin$runOnMainThread$1", f = "AndroidLifecyclePlugin.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class k extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f266627a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f266628b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Function0<Unit> function0, kotlin.coroutines.d<? super k> dVar) {
            super(2, dVar);
            this.f266628b = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new k(this.f266628b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f266627a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            this.f266628b.invoke();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((k) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static final class l extends l0 implements Function0<Unit> {
        l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            c0 c0Var = d.this.f266590l;
            if (c0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lifecycle");
                c0Var = null;
                int i10 = 6 << 0;
            }
            c0Var.c(d.this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.segment.analytics.kotlin.android.plugins.AndroidLifecyclePlugin$trackApplicationLifecycleEvents$3", f = "AndroidLifecyclePlugin.kt", i = {}, l = {265, 266}, m = "invokeSuspend", n = {}, s = {})
    static final class m extends o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f266630a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f266632c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f266633d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, String str2, kotlin.coroutines.d<? super m> dVar) {
            super(1, dVar);
            this.f266632c = str;
            this.f266633d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@NotNull kotlin.coroutines.d<?> dVar) {
            return d.this.new m(this.f266632c, this.f266633d, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
        
            if (r2.f(r10, r1, r9) == r0) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r8 = 1
                int r1 = r9.f266630a
                r2 = 0
                java.lang.String r3 = "storage"
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L24
                r8 = 7
                if (r1 == r5) goto L20
                if (r1 != r4) goto L17
                kotlin.ResultKt.m(r10)
                goto L66
            L17:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r8 = 6
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L20:
                kotlin.ResultKt.m(r10)
                goto L4a
            L24:
                kotlin.ResultKt.m(r10)
                com.segment.analytics.kotlin.android.plugins.d r10 = com.segment.analytics.kotlin.android.plugins.d.this
                com.segment.analytics.kotlin.core.s r10 = com.segment.analytics.kotlin.android.plugins.d.n(r10)
                if (r10 != 0) goto L34
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
                r10 = r2
                r10 = r2
            L34:
                r8 = 2
                com.segment.analytics.kotlin.core.s$b r1 = com.segment.analytics.kotlin.core.s.b.AppVersion
                java.lang.String r6 = r9.f266632c
                java.lang.String r7 = "currentVersion"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
                r8 = 2
                r9.f266630a = r5
                r8 = 2
                java.lang.Object r10 = r10.f(r1, r6, r9)
                if (r10 != r0) goto L4a
                r8 = 1
                goto L65
            L4a:
                com.segment.analytics.kotlin.android.plugins.d r10 = com.segment.analytics.kotlin.android.plugins.d.this
                com.segment.analytics.kotlin.core.s r10 = com.segment.analytics.kotlin.android.plugins.d.n(r10)
                r8 = 5
                if (r10 != 0) goto L57
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
                goto L58
            L57:
                r2 = r10
            L58:
                r8 = 2
                com.segment.analytics.kotlin.core.s$b r10 = com.segment.analytics.kotlin.core.s.b.AppBuild
                java.lang.String r1 = r9.f266633d
                r9.f266630a = r4
                java.lang.Object r9 = r2.f(r10, r1, r9)
                if (r9 != r0) goto L66
            L65:
                return r0
            L66:
                kotlin.Unit r9 = kotlin.Unit.f312394a
                r8 = 1
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.segment.analytics.kotlin.android.plugins.d.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((m) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static final class n extends l0 implements Function0<Unit> {
        n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            c0 c0Var = d.this.f266590l;
            if (c0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lifecycle");
                c0Var = null;
            }
            c0Var.g(d.this);
        }
    }

    private final p2 o(Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1) {
        com.segment.analytics.kotlin.core.a aVarJ = j();
        int i10 = 5 >> 0;
        return kotlinx.coroutines.k.f(aVarJ.c(), aVarJ.d(), null, new j(function1, null), 2, null);
    }

    private final void p(Function0<Unit> function0) {
        kotlinx.coroutines.k.f(j().c(), l1.e(), null, new k(function0, null), 2, null);
    }

    private final void r(Activity activity) {
        Intent intent = activity != null ? activity.getIntent() : null;
        if (intent != null) {
            Uri uriB = com.segment.analytics.kotlin.android.plugins.e.b(activity);
            new uf.b(j()).c(uriB != null ? uriB.toString() : null, intent);
        }
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    @Nullable
    public BaseEvent a(@NotNull BaseEvent baseEvent) {
        return com.segment.analytics.kotlin.core.platform.e.a.a(this, baseEvent);
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    public void b(@NotNull com.segment.analytics.kotlin.core.a analytics) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        com.segment.analytics.kotlin.core.platform.e.a.b(this, analytics);
        com.segment.analytics.kotlin.core.f fVarU = analytics.u();
        Object objT = fVarU.t();
        Application application = null;
        Application application2 = objT instanceof Application ? (Application) objT : null;
        if (application2 == null) {
            throw new IllegalStateException("no android application context registered");
        }
        this.f266582d = application2;
        this.f266583e = fVarU.E();
        this.f266584f = fVarU.F();
        this.f266585g = fVarU.G();
        this.f266591m = analytics.w();
        Application application3 = this.f266582d;
        if (application3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("application");
            application3 = null;
        }
        PackageManager packageManager = application3.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "application.packageManager");
        try {
            Application application4 = this.f266582d;
            if (application4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("application");
                application4 = null;
            }
            PackageInfo packageInfo = packageManager.getPackageInfo(application4.getPackageName(), 0);
            Intrinsics.checkNotNullExpressionValue(packageInfo, "{\n            packageMan…packageName, 0)\n        }");
            this.f266581c = packageInfo;
            Application application5 = this.f266582d;
            if (application5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("application");
            } else {
                application = application5;
            }
            application.registerActivityLifecycleCallbacks(this);
            if (this.f266585g) {
                this.f266590l = ProcessLifecycleOwner.f52139i.a().getLifecycle();
                p(new l());
            }
        } catch (PackageManager.NameNotFoundException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Package not found: ");
            Application application6 = this.f266582d;
            if (application6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("application");
            } else {
                application = application6;
            }
            sb2.append(application.getPackageName());
            AssertionError assertionError = new AssertionError(sb2.toString());
            com.segment.analytics.kotlin.core.k.d(analytics, assertionError);
            throw assertionError;
        }
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    @NotNull
    public com.segment.analytics.kotlin.core.platform.e.b c() {
        return this.f266579a;
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    public void f(@NotNull com.segment.analytics.kotlin.core.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f266580b = aVar;
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    public void i(@NotNull Settings settings, @NotNull com.segment.analytics.kotlin.core.platform.e.c cVar) {
        com.segment.analytics.kotlin.core.platform.e.a.c(this, settings, cVar);
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    @NotNull
    public com.segment.analytics.kotlin.core.a j() {
        com.segment.analytics.kotlin.core.a aVar = this.f266580b;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        o(new c(activity, bundle, null));
        if (!this.f266585g) {
            onCreate(f266578s);
        }
        if (this.f266584f) {
            r(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        o(new C1856d(activity, null));
        if (this.f266585g) {
            return;
        }
        onDestroy(f266578s);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        o(new e(activity, null));
        if (!this.f266585g) {
            onPause(f266578s);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        o(new f(activity, null));
        if (!this.f266585g) {
            onStart(f266578s);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        o(new g(activity, bundle, null));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        o(new h(activity, null));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        o(new i(activity, null));
        if (this.f266585g) {
            return;
        }
        onStop(f266578s);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull o0 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (!this.f266586h.getAndSet(true) && this.f266583e) {
            this.f266587i.set(0);
            this.f266588j.set(true);
            q();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull o0 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(@NotNull o0 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull o0 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull o0 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (this.f266583e && this.f266587i.incrementAndGet() == 1 && !this.f266589k.get()) {
            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
            if (this.f266588j.get()) {
                PackageInfo packageInfo = this.f266581c;
                PackageInfo packageInfo2 = null;
                if (packageInfo == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("packageInfo");
                    packageInfo = null;
                }
                JsonElementBuildersKt.put(jsonObjectBuilder, "version", packageInfo.versionName);
                PackageInfo packageInfo3 = this.f266581c;
                if (packageInfo3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("packageInfo");
                } else {
                    packageInfo2 = packageInfo3;
                }
                JsonElementBuildersKt.put(jsonObjectBuilder, "build", com.segment.analytics.kotlin.android.plugins.e.d(packageInfo2).toString());
            }
            JsonElementBuildersKt.put(jsonObjectBuilder, "from_background", Boolean.valueOf(true ^ this.f266588j.getAndSet(false)));
            com.segment.analytics.kotlin.core.a.z0(j(), "Application Opened", jsonObjectBuilder.build(), null, 4, null);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull o0 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (this.f266583e && this.f266587i.decrementAndGet() == 0 && !this.f266589k.get()) {
            com.segment.analytics.kotlin.core.a.z0(j(), "Application Backgrounded", null, null, 6, null);
        }
    }

    public final void q() {
        PackageInfo packageInfo = this.f266581c;
        if (packageInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("packageInfo");
            packageInfo = null;
        }
        String str = packageInfo.versionName;
        String string = com.segment.analytics.kotlin.android.plugins.e.d(packageInfo).toString();
        s sVar = this.f266591m;
        if (sVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("storage");
            sVar = null;
        }
        String strD = sVar.d(s.b.AppVersion);
        s sVar2 = this.f266591m;
        if (sVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("storage");
            sVar2 = null;
        }
        String strD2 = sVar2.d(s.b.AppBuild);
        s sVar3 = this.f266591m;
        if (sVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("storage");
            sVar3 = null;
        }
        String strD3 = sVar3.d(s.b.LegacyAppBuild);
        if (strD2 == null && strD3 == null) {
            com.segment.analytics.kotlin.core.a aVarJ = j();
            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
            JsonElementBuildersKt.put(jsonObjectBuilder, "version", str);
            JsonElementBuildersKt.put(jsonObjectBuilder, "build", string);
            Unit unit = Unit.f312394a;
            com.segment.analytics.kotlin.core.a.z0(aVarJ, "Application Installed", jsonObjectBuilder.build(), null, 4, null);
        } else if (!Intrinsics.areEqual(string, strD2)) {
            com.segment.analytics.kotlin.core.a aVarJ2 = j();
            JsonObjectBuilder jsonObjectBuilder2 = new JsonObjectBuilder();
            JsonElementBuildersKt.put(jsonObjectBuilder2, "version", str);
            JsonElementBuildersKt.put(jsonObjectBuilder2, "build", string);
            JsonElementBuildersKt.put(jsonObjectBuilder2, "previous_version", strD);
            JsonElementBuildersKt.put(jsonObjectBuilder2, "previous_build", String.valueOf(strD2));
            Unit unit2 = Unit.f312394a;
            com.segment.analytics.kotlin.core.a.z0(aVarJ2, "Application Updated", jsonObjectBuilder2.build(), null, 4, null);
        }
        o(new m(str, string, null));
    }

    public final void s() {
        Application application = this.f266582d;
        if (application == null) {
            Intrinsics.throwUninitializedPropertyAccessException("application");
            application = null;
        }
        application.unregisterActivityLifecycleCallbacks(this);
        if (this.f266585g) {
            p(new n());
        }
    }
}
