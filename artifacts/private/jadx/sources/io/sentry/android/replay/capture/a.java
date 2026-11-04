package io.sentry.android.replay.capture;

import android.view.MotionEvent;
import androidx.compose.runtime.internal.w0;
import io.sentry.android.replay.w;
import io.sentry.i1;
import io.sentry.n8;
import io.sentry.o8;
import io.sentry.protocol.v;
import io.sentry.transport.p;
import io.sentry.y7;
import java.io.File;
import java.util.Date;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.v0;
import kotlin.reflect.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pj.n;

/* JADX INFO: loaded from: classes11.dex */
@e.b(26)
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nBaseCaptureStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCaptureStrategy.kt\nio/sentry/android/replay/capture/BaseCaptureStrategy\n*L\n1#1,218:1\n175#1,9:219\n206#1:228\n175#1,9:229\n206#1:238\n175#1,9:239\n206#1:248\n208#1,9:249\n183#1:258\n206#1:259\n208#1,9:260\n183#1:269\n206#1:270\n208#1,9:271\n183#1:280\n206#1:281\n183#1:282\n206#1:283\n183#1:284\n206#1:285\n*S KotlinDebug\n*F\n+ 1 BaseCaptureStrategy.kt\nio/sentry/android/replay/capture/BaseCaptureStrategy\n*L\n64#1:219,9\n64#1:228\n75#1:229,9\n75#1:238\n83#1:239,9\n83#1:248\n85#1:249,9\n85#1:258\n85#1:259\n87#1:260,9\n87#1:269\n87#1:270\n91#1:271,9\n91#1:280\n91#1:281\n216#1:282\n216#1:283\n216#1:284\n216#1:285\n*E\n"})
public abstract class a implements io.sentry.android.replay.capture.h {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private static final String f304735v = "CaptureStrategy";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n8 f304736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final i1 f304737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final p f304738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final ScheduledExecutorService f304739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final Function1<v, io.sentry.android.replay.j> f304740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final f0 f304741g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final io.sentry.android.replay.gestures.b f304742h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f304743i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private io.sentry.android.replay.j f304744j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final kotlin.properties.f f304745k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final kotlin.properties.f f304746l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final AtomicLong f304747m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final kotlin.properties.f f304748n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final kotlin.properties.f f304749o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private final kotlin.properties.f f304750p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private final kotlin.properties.f f304751q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private final Deque<io.sentry.rrweb.b> f304752r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final /* synthetic */ o<Object>[] f304733t = {j1.k(new v0(a.class, "recorderConfig", "getRecorderConfig$sentry_android_replay_release()Lio/sentry/android/replay/ScreenshotRecorderConfig;", 0)), j1.k(new v0(a.class, "segmentTimestamp", "getSegmentTimestamp()Ljava/util/Date;", 0)), j1.k(new v0(a.class, "screenAtStart", "getScreenAtStart()Ljava/lang/String;", 0)), j1.k(new v0(a.class, "currentReplayId", "getCurrentReplayId()Lio/sentry/protocol/SentryId;", 0)), j1.k(new v0(a.class, "currentSegment", "getCurrentSegment()I", 0)), j1.k(new v0(a.class, "replayType", "getReplayType()Lio/sentry/SentryReplayEvent$ReplayType;", 0))};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public static final C2207a f304732s = new C2207a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f304734u = 8;

    /* JADX INFO: renamed from: io.sentry.android.replay.capture.a$a, reason: collision with other inner class name */
    public static final class C2207a {
        public /* synthetic */ C2207a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2207a() {
        }
    }

    private static final class b implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f304753a;

        @Override // java.util.concurrent.ThreadFactory
        @NotNull
        public Thread newThread(@NotNull Runnable r10) {
            Intrinsics.checkNotNullParameter(r10, "r");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SentryReplayPersister-");
            int i10 = this.f304753a;
            this.f304753a = i10 + 1;
            sb2.append(i10);
            Thread thread = new Thread(r10, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    @SourceDebugExtension({"SMAP\nBaseCaptureStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCaptureStrategy.kt\nio/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomic$1\n*L\n1#1,218:1\n*E\n"})
    public static final class c extends l0 implements n<String, Object, Object, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f304755b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(3);
            this.f304755b = str;
        }

        public final void c(String str, Object obj, Object obj2) throws Exception {
            io.sentry.android.replay.j jVarU = a.this.u();
            if (jVarU != null) {
                jVarU.x(this.f304755b, String.valueOf(obj2));
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(String str, Object obj, Object obj2) throws Exception {
            c(str, obj, obj2);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nBaseCaptureStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCaptureStrategy.kt\nio/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$1\n*L\n1#1,218:1\n*E\n"})
    public static final class d extends l0 implements n<String, Object, Object, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f304757b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(3);
            this.f304757b = str;
        }

        public final void c(String str, Object obj, Object obj2) throws Exception {
            io.sentry.android.replay.j jVarU = a.this.u();
            if (jVarU != null) {
                jVarU.x(this.f304757b, String.valueOf(obj2));
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(String str, Object obj, Object obj2) throws Exception {
            c(str, obj, obj2);
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nBaseCaptureStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCaptureStrategy.kt\nio/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$2\n*L\n1#1,218:1\n*E\n"})
    public static final class e<T> implements kotlin.properties.f<Object, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicReference<T> f304758a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f304759b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n<String, T, T, Unit> f304760c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f304761d;

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.a$e$a, reason: collision with other inner class name */
        public static final class RunnableC2208a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f304762a;

            public RunnableC2208a(Function0<Unit> function0) {
                this.f304762a = function0;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f304762a.invoke();
            }
        }

        public static final class b extends l0 implements Function0<Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ n<String, T, T, Unit> f304763a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f304764b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f304765c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ T f304766d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(n<? super String, ? super T, ? super T, Unit> nVar, String str, T t10, T t11) {
                super(0);
                this.f304763a = nVar;
                this.f304764b = str;
                this.f304765c = t10;
                this.f304766d = t11;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f312394a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f304763a.invoke(this.f304764b, this.f304765c, this.f304766d);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public e(T t10, a aVar, n<? super String, ? super T, ? super T, Unit> nVar, String str) {
            this.f304759b = aVar;
            this.f304760c = nVar;
            this.f304761d = str;
            this.f304758a = new AtomicReference<>(t10);
        }

        private final void a(Function0<Unit> function0) {
            if (this.f304759b.f304736b.getThreadChecker().a()) {
                io.sentry.android.replay.util.h.h(this.f304759b.w(), this.f304759b.f304736b, "CaptureStrategy.runInBackground", new RunnableC2208a(function0));
                return;
            }
            try {
                function0.invoke();
            } catch (Throwable th2) {
                this.f304759b.f304736b.getLogger().a(y7.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
            }
        }

        @Override // kotlin.properties.f, kotlin.properties.e
        public T getValue(Object obj, o<?> property) {
            Intrinsics.checkNotNullParameter(property, "property");
            return this.f304758a.get();
        }

        @Override // kotlin.properties.f
        public void setValue(Object obj, o<?> property, T t10) {
            Intrinsics.checkNotNullParameter(property, "property");
            T andSet = this.f304758a.getAndSet(t10);
            if (Intrinsics.areEqual(andSet, t10)) {
                return;
            }
            a(new b(this.f304760c, this.f304761d, andSet, t10));
        }
    }

    static final class f extends l0 implements Function0<ScheduledExecutorService> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f304767a = new f();

        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final ScheduledExecutorService invoke() {
            return Executors.newSingleThreadScheduledExecutor(new b());
        }
    }

    @SourceDebugExtension({"SMAP\nBaseCaptureStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCaptureStrategy.kt\nio/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$2\n*L\n1#1,218:1\n*E\n"})
    public static final class g implements kotlin.properties.f<Object, v> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicReference<v> f304768a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f304769b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f304770c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f304771d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f304772e;

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.a$g$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nBaseCaptureStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCaptureStrategy.kt\nio/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$2$runInBackground$1\n*L\n1#1,188:1\n*E\n"})
        public static final class RunnableC2209a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function0 f304773a;

            public RunnableC2209a(Function0 function0) {
                this.f304773a = function0;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f304773a.invoke();
            }
        }

        @SourceDebugExtension({"SMAP\nBaseCaptureStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCaptureStrategy.kt\nio/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$2$setValue$1\n+ 2 BaseCaptureStrategy.kt\nio/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomic$1\n*L\n1#1,203:1\n213#2,2:204\n*E\n"})
        public static final class b extends l0 implements Function0<Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f304774a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f304775b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f304776c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f304777d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f304778e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object obj, Object obj2, a aVar, String str2) {
                super(0);
                this.f304774a = str;
                this.f304775b = obj;
                this.f304776c = obj2;
                this.f304777d = aVar;
                this.f304778e = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws Exception {
                invoke2();
                return Unit.f312394a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() throws Exception {
                Object obj = this.f304776c;
                io.sentry.android.replay.j jVarU = this.f304777d.u();
                if (jVarU != null) {
                    jVarU.x(this.f304778e, String.valueOf(obj));
                }
            }
        }

        public g(Object obj, a aVar, String str, a aVar2, String str2) {
            this.f304769b = aVar;
            this.f304770c = str;
            this.f304771d = aVar2;
            this.f304772e = str2;
            this.f304768a = new AtomicReference<>(obj);
        }

        private final void a(Function0<Unit> function0) {
            if (this.f304769b.f304736b.getThreadChecker().a()) {
                io.sentry.android.replay.util.h.h(this.f304769b.w(), this.f304769b.f304736b, "CaptureStrategy.runInBackground", new RunnableC2209a(function0));
                return;
            }
            try {
                function0.invoke();
            } catch (Throwable th2) {
                this.f304769b.f304736b.getLogger().a(y7.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
            }
        }

        @Override // kotlin.properties.f, kotlin.properties.e
        public v getValue(Object obj, o<?> property) {
            Intrinsics.checkNotNullParameter(property, "property");
            return this.f304768a.get();
        }

        @Override // kotlin.properties.f
        public void setValue(Object obj, o<?> property, v vVar) {
            Intrinsics.checkNotNullParameter(property, "property");
            v andSet = this.f304768a.getAndSet(vVar);
            if (Intrinsics.areEqual(andSet, vVar)) {
                return;
            }
            a(new b(this.f304770c, andSet, vVar, this.f304771d, this.f304772e));
        }
    }

    @SourceDebugExtension({"SMAP\nBaseCaptureStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCaptureStrategy.kt\nio/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$2\n*L\n1#1,218:1\n*E\n"})
    public static final class h implements kotlin.properties.f<Object, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicReference<Integer> f304779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f304780b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f304781c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f304782d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f304783e;

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.a$h$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nBaseCaptureStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCaptureStrategy.kt\nio/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$2$runInBackground$1\n*L\n1#1,188:1\n*E\n"})
        public static final class RunnableC2210a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function0 f304784a;

            public RunnableC2210a(Function0 function0) {
                this.f304784a = function0;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f304784a.invoke();
            }
        }

        @SourceDebugExtension({"SMAP\nBaseCaptureStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCaptureStrategy.kt\nio/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$2$setValue$1\n+ 2 BaseCaptureStrategy.kt\nio/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomic$1\n*L\n1#1,203:1\n213#2,2:204\n*E\n"})
        public static final class b extends l0 implements Function0<Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f304785a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f304786b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f304787c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f304788d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f304789e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object obj, Object obj2, a aVar, String str2) {
                super(0);
                this.f304785a = str;
                this.f304786b = obj;
                this.f304787c = obj2;
                this.f304788d = aVar;
                this.f304789e = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws Exception {
                invoke2();
                return Unit.f312394a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() throws Exception {
                Object obj = this.f304787c;
                io.sentry.android.replay.j jVarU = this.f304788d.u();
                if (jVarU != null) {
                    jVarU.x(this.f304789e, String.valueOf(obj));
                }
            }
        }

        public h(Object obj, a aVar, String str, a aVar2, String str2) {
            this.f304780b = aVar;
            this.f304781c = str;
            this.f304782d = aVar2;
            this.f304783e = str2;
            this.f304779a = new AtomicReference<>(obj);
        }

        private final void a(Function0<Unit> function0) {
            if (this.f304780b.f304736b.getThreadChecker().a()) {
                io.sentry.android.replay.util.h.h(this.f304780b.w(), this.f304780b.f304736b, "CaptureStrategy.runInBackground", new RunnableC2210a(function0));
                return;
            }
            try {
                function0.invoke();
            } catch (Throwable th2) {
                this.f304780b.f304736b.getLogger().a(y7.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
            }
        }

        @Override // kotlin.properties.f, kotlin.properties.e
        public Integer getValue(Object obj, o<?> property) {
            Intrinsics.checkNotNullParameter(property, "property");
            return this.f304779a.get();
        }

        @Override // kotlin.properties.f
        public void setValue(Object obj, o<?> property, Integer num) {
            Intrinsics.checkNotNullParameter(property, "property");
            Integer andSet = this.f304779a.getAndSet(num);
            if (Intrinsics.areEqual(andSet, num)) {
                return;
            }
            a(new b(this.f304781c, andSet, num, this.f304782d, this.f304783e));
        }
    }

    @SourceDebugExtension({"SMAP\nBaseCaptureStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCaptureStrategy.kt\nio/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$2\n*L\n1#1,218:1\n*E\n"})
    public static final class i implements kotlin.properties.f<Object, o8.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicReference<o8.c> f304790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f304791b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f304792c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f304793d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f304794e;

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.a$i$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nBaseCaptureStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCaptureStrategy.kt\nio/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$2$runInBackground$1\n*L\n1#1,188:1\n*E\n"})
        public static final class RunnableC2211a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function0 f304795a;

            public RunnableC2211a(Function0 function0) {
                this.f304795a = function0;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f304795a.invoke();
            }
        }

        @SourceDebugExtension({"SMAP\nBaseCaptureStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCaptureStrategy.kt\nio/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$2$setValue$1\n+ 2 BaseCaptureStrategy.kt\nio/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomic$1\n*L\n1#1,203:1\n213#2,2:204\n*E\n"})
        public static final class b extends l0 implements Function0<Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f304796a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f304797b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f304798c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f304799d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f304800e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object obj, Object obj2, a aVar, String str2) {
                super(0);
                this.f304796a = str;
                this.f304797b = obj;
                this.f304798c = obj2;
                this.f304799d = aVar;
                this.f304800e = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws Exception {
                invoke2();
                return Unit.f312394a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() throws Exception {
                Object obj = this.f304798c;
                io.sentry.android.replay.j jVarU = this.f304799d.u();
                if (jVarU != null) {
                    jVarU.x(this.f304800e, String.valueOf(obj));
                }
            }
        }

        public i(Object obj, a aVar, String str, a aVar2, String str2) {
            this.f304791b = aVar;
            this.f304792c = str;
            this.f304793d = aVar2;
            this.f304794e = str2;
            this.f304790a = new AtomicReference<>(obj);
        }

        private final void a(Function0<Unit> function0) {
            if (this.f304791b.f304736b.getThreadChecker().a()) {
                io.sentry.android.replay.util.h.h(this.f304791b.w(), this.f304791b.f304736b, "CaptureStrategy.runInBackground", new RunnableC2211a(function0));
                return;
            }
            try {
                function0.invoke();
            } catch (Throwable th2) {
                this.f304791b.f304736b.getLogger().a(y7.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
            }
        }

        @Override // kotlin.properties.f, kotlin.properties.e
        public o8.c getValue(Object obj, o<?> property) {
            Intrinsics.checkNotNullParameter(property, "property");
            return this.f304790a.get();
        }

        @Override // kotlin.properties.f
        public void setValue(Object obj, o<?> property, o8.c cVar) {
            Intrinsics.checkNotNullParameter(property, "property");
            o8.c andSet = this.f304790a.getAndSet(cVar);
            if (Intrinsics.areEqual(andSet, cVar)) {
                return;
            }
            a(new b(this.f304792c, andSet, cVar, this.f304793d, this.f304794e));
        }
    }

    @SourceDebugExtension({"SMAP\nBaseCaptureStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCaptureStrategy.kt\nio/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$2\n*L\n1#1,218:1\n*E\n"})
    public static final class j implements kotlin.properties.f<Object, w> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicReference<w> f304801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f304802b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f304803c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f304804d;

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.a$j$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nBaseCaptureStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCaptureStrategy.kt\nio/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$2$runInBackground$1\n*L\n1#1,188:1\n*E\n"})
        public static final class RunnableC2212a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function0 f304805a;

            public RunnableC2212a(Function0 function0) {
                this.f304805a = function0;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f304805a.invoke();
            }
        }

        @SourceDebugExtension({"SMAP\nBaseCaptureStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCaptureStrategy.kt\nio/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$2$setValue$1\n+ 2 BaseCaptureStrategy.kt\nio/sentry/android/replay/capture/BaseCaptureStrategy\n*L\n1#1,203:1\n65#2,9:204\n*E\n"})
        public static final class b extends l0 implements Function0<Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f304806a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f304807b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f304808c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f304809d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object obj, Object obj2, a aVar) {
                super(0);
                this.f304806a = str;
                this.f304807b = obj;
                this.f304808c = obj2;
                this.f304809d = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws Exception {
                invoke2();
                return Unit.f312394a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() throws Exception {
                Object obj = this.f304807b;
                w wVar = (w) this.f304808c;
                if (wVar == null) {
                    return;
                }
                io.sentry.android.replay.j jVarU = this.f304809d.u();
                if (jVarU != null) {
                    jVarU.x(io.sentry.android.replay.j.f304924o, String.valueOf(wVar.k()));
                }
                io.sentry.android.replay.j jVarU2 = this.f304809d.u();
                if (jVarU2 != null) {
                    jVarU2.x(io.sentry.android.replay.j.f304927s, String.valueOf(wVar.l()));
                }
                io.sentry.android.replay.j jVarU3 = this.f304809d.u();
                if (jVarU3 != null) {
                    jVarU3.x(io.sentry.android.replay.j.f304928t, String.valueOf(wVar.j()));
                }
                io.sentry.android.replay.j jVarU4 = this.f304809d.u();
                if (jVarU4 != null) {
                    jVarU4.x(io.sentry.android.replay.j.f304929v, String.valueOf(wVar.i()));
                }
            }
        }

        public j(Object obj, a aVar, String str, a aVar2) {
            this.f304802b = aVar;
            this.f304803c = str;
            this.f304804d = aVar2;
            this.f304801a = new AtomicReference<>(obj);
        }

        private final void a(Function0<Unit> function0) {
            if (this.f304802b.f304736b.getThreadChecker().a()) {
                io.sentry.android.replay.util.h.h(this.f304802b.w(), this.f304802b.f304736b, "CaptureStrategy.runInBackground", new RunnableC2212a(function0));
                return;
            }
            try {
                function0.invoke();
            } catch (Throwable th2) {
                this.f304802b.f304736b.getLogger().a(y7.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
            }
        }

        @Override // kotlin.properties.f, kotlin.properties.e
        public w getValue(Object obj, o<?> property) {
            Intrinsics.checkNotNullParameter(property, "property");
            return this.f304801a.get();
        }

        @Override // kotlin.properties.f
        public void setValue(Object obj, o<?> property, w wVar) {
            Intrinsics.checkNotNullParameter(property, "property");
            w andSet = this.f304801a.getAndSet(wVar);
            if (!Intrinsics.areEqual(andSet, wVar)) {
                a(new b(this.f304803c, andSet, wVar, this.f304804d));
            }
        }
    }

    @SourceDebugExtension({"SMAP\nBaseCaptureStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCaptureStrategy.kt\nio/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$2\n*L\n1#1,218:1\n*E\n"})
    public static final class k implements kotlin.properties.f<Object, Date> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicReference<Date> f304810a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f304811b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f304812c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f304813d;

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.a$k$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nBaseCaptureStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCaptureStrategy.kt\nio/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$2$runInBackground$1\n*L\n1#1,188:1\n*E\n"})
        public static final class RunnableC2213a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function0 f304814a;

            public RunnableC2213a(Function0 function0) {
                this.f304814a = function0;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f304814a.invoke();
            }
        }

        @SourceDebugExtension({"SMAP\nBaseCaptureStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCaptureStrategy.kt\nio/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$2$setValue$1\n+ 2 BaseCaptureStrategy.kt\nio/sentry/android/replay/capture/BaseCaptureStrategy\n*L\n1#1,203:1\n76#2,5:204\n*E\n"})
        public static final class b extends l0 implements Function0<Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f304815a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f304816b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f304817c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f304818d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object obj, Object obj2, a aVar) {
                super(0);
                this.f304815a = str;
                this.f304816b = obj;
                this.f304817c = obj2;
                this.f304818d = aVar;
                int i10 = 4 & 0;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws Exception {
                invoke2();
                return Unit.f312394a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() throws Exception {
                Object obj = this.f304816b;
                Date date = (Date) this.f304817c;
                io.sentry.android.replay.j jVarU = this.f304818d.u();
                if (jVarU != null) {
                    jVarU.x(io.sentry.android.replay.j.f304930w, date == null ? null : io.sentry.p.h(date));
                }
            }
        }

        public k(Object obj, a aVar, String str, a aVar2) {
            this.f304811b = aVar;
            this.f304812c = str;
            this.f304813d = aVar2;
            this.f304810a = new AtomicReference<>(obj);
        }

        private final void a(Function0<Unit> function0) {
            if (this.f304811b.f304736b.getThreadChecker().a()) {
                io.sentry.android.replay.util.h.h(this.f304811b.w(), this.f304811b.f304736b, "CaptureStrategy.runInBackground", new RunnableC2213a(function0));
                return;
            }
            try {
                function0.invoke();
            } catch (Throwable th2) {
                this.f304811b.f304736b.getLogger().a(y7.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
            }
        }

        @Override // kotlin.properties.f, kotlin.properties.e
        public Date getValue(Object obj, o<?> property) {
            Intrinsics.checkNotNullParameter(property, "property");
            return this.f304810a.get();
        }

        @Override // kotlin.properties.f
        public void setValue(Object obj, o<?> property, Date date) {
            Intrinsics.checkNotNullParameter(property, "property");
            Date andSet = this.f304810a.getAndSet(date);
            if (!Intrinsics.areEqual(andSet, date)) {
                a(new b(this.f304812c, andSet, date, this.f304813d));
            }
        }
    }

    @SourceDebugExtension({"SMAP\nBaseCaptureStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCaptureStrategy.kt\nio/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$2\n*L\n1#1,218:1\n*E\n"})
    public static final class l implements kotlin.properties.f<Object, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicReference<String> f304819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f304820b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f304821c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f304822d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f304823e;

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.a$l$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nBaseCaptureStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCaptureStrategy.kt\nio/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$2$runInBackground$1\n*L\n1#1,188:1\n*E\n"})
        public static final class RunnableC2214a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function0 f304824a;

            public RunnableC2214a(Function0 function0) {
                this.f304824a = function0;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f304824a.invoke();
            }
        }

        @SourceDebugExtension({"SMAP\nBaseCaptureStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCaptureStrategy.kt\nio/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$2$setValue$1\n+ 2 BaseCaptureStrategy.kt\nio/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$1\n*L\n1#1,203:1\n180#2,2:204\n*E\n"})
        public static final class b extends l0 implements Function0<Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f304825a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f304826b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f304827c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f304828d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f304829e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object obj, Object obj2, a aVar, String str2) {
                super(0);
                this.f304825a = str;
                this.f304826b = obj;
                this.f304827c = obj2;
                this.f304828d = aVar;
                this.f304829e = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws Exception {
                invoke2();
                return Unit.f312394a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() throws Exception {
                Object obj = this.f304827c;
                io.sentry.android.replay.j jVarU = this.f304828d.u();
                if (jVarU != null) {
                    jVarU.x(this.f304829e, String.valueOf(obj));
                }
            }
        }

        public l(Object obj, a aVar, String str, a aVar2, String str2) {
            this.f304820b = aVar;
            this.f304821c = str;
            this.f304822d = aVar2;
            this.f304823e = str2;
            this.f304819a = new AtomicReference<>(obj);
        }

        private final void a(Function0<Unit> function0) {
            if (this.f304820b.f304736b.getThreadChecker().a()) {
                io.sentry.android.replay.util.h.h(this.f304820b.w(), this.f304820b.f304736b, "CaptureStrategy.runInBackground", new RunnableC2214a(function0));
                return;
            }
            try {
                function0.invoke();
            } catch (Throwable th2) {
                this.f304820b.f304736b.getLogger().a(y7.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
            }
        }

        @Override // kotlin.properties.f, kotlin.properties.e
        public String getValue(Object obj, o<?> property) {
            Intrinsics.checkNotNullParameter(property, "property");
            return this.f304819a.get();
        }

        @Override // kotlin.properties.f
        public void setValue(Object obj, o<?> property, String str) {
            Intrinsics.checkNotNullParameter(property, "property");
            String andSet = this.f304819a.getAndSet(str);
            if (!Intrinsics.areEqual(andSet, str)) {
                a(new b(this.f304821c, andSet, str, this.f304822d, this.f304823e));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull n8 options, @Nullable i1 i1Var, @NotNull p dateProvider, @NotNull ScheduledExecutorService replayExecutor, @Nullable Function1<? super v, io.sentry.android.replay.j> function1) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(replayExecutor, "replayExecutor");
        this.f304736b = options;
        this.f304737c = i1Var;
        this.f304738d = dateProvider;
        this.f304739e = replayExecutor;
        this.f304740f = function1;
        this.f304741g = g0.c(f.f304767a);
        this.f304742h = new io.sentry.android.replay.gestures.b(dateProvider);
        this.f304743i = new AtomicBoolean(false);
        this.f304745k = new j(null, this, "", this);
        this.f304746l = new k(null, this, io.sentry.android.replay.j.f304930w, this);
        this.f304747m = new AtomicLong();
        this.f304748n = new l(null, this, io.sentry.android.replay.j.Z, this, io.sentry.android.replay.j.Z);
        this.f304749o = new g(v.f306474b, this, io.sentry.android.replay.j.X, this, io.sentry.android.replay.j.X);
        this.f304750p = new h(-1, this, io.sentry.android.replay.j.f304926p1, this, io.sentry.android.replay.j.f304926p1);
        this.f304751q = new i(null, this, io.sentry.android.replay.j.Y, this, io.sentry.android.replay.j.Y);
        this.f304752r = new ConcurrentLinkedDeque();
    }

    private final <T> kotlin.properties.f<Object, T> C(T t10, String str, n<? super String, ? super T, ? super T, Unit> nVar) {
        return new e(t10, this, nVar, str);
    }

    static /* synthetic */ kotlin.properties.f D(a aVar, Object obj, String str, n nVar, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: persistableAtomic");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if ((i10 & 4) != 0) {
            nVar = aVar.new c(str);
        }
        return new e(obj, aVar, nVar, str);
    }

    private final <T> kotlin.properties.f<Object, T> E(T t10, String str, n<? super String, ? super T, ? super T, Unit> nVar) {
        return new e(t10, this, nVar, str);
    }

    static /* synthetic */ kotlin.properties.f F(a aVar, Object obj, String str, n nVar, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: persistableAtomicNullable");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if ((i10 & 4) != 0) {
            nVar = aVar.new d(str);
        }
        return new e(obj, aVar, nVar, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ io.sentry.android.replay.capture.h.c t(a aVar, long j10, Date date, v vVar, int i10, int i11, int i12, int i13, int i14, o8.c cVar, io.sentry.android.replay.j jVar, String str, List list, Deque deque, int i15, Object obj) {
        if (obj == null) {
            return aVar.s(j10, date, vVar, i10, i11, i12, i13, i14, (i15 & 256) != 0 ? aVar.h() : cVar, (i15 & 512) != 0 ? aVar.f304744j : jVar, (i15 & 1024) != 0 ? aVar.A() : str, (i15 & 2048) != 0 ? null : list, (i15 & 4096) != 0 ? aVar.f304752r : deque);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createSegmentInternal");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ScheduledExecutorService w() {
        Object value = this.f304741g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ScheduledExecutorService) value;
    }

    @Nullable
    protected final String A() {
        return (String) this.f304748n.getValue(this, f304733t[2]);
    }

    @NotNull
    protected final AtomicBoolean B() {
        return this.f304743i;
    }

    protected final void G(@Nullable io.sentry.android.replay.j jVar) {
        this.f304744j = jVar;
    }

    public final void H(@Nullable w wVar) {
        this.f304745k.setValue(this, f304733t[0], wVar);
    }

    protected final void I(@Nullable String str) {
        this.f304748n.setValue(this, f304733t[2], str);
    }

    @Override // io.sentry.android.replay.capture.h
    public void a(@NotNull MotionEvent event) {
        List<io.sentry.rrweb.d> listA;
        Intrinsics.checkNotNullParameter(event, "event");
        w wVarX = x();
        if (wVarX != null && (listA = this.f304742h.a(event, wVarX)) != null) {
            CollectionsKt.addAll(this.f304752r, listA);
        }
    }

    @Override // io.sentry.android.replay.capture.h
    @Nullable
    public Date b() {
        return (Date) this.f304746l.getValue(this, f304733t[1]);
    }

    @Override // io.sentry.android.replay.capture.h
    public void c(int i10) {
        this.f304750p.setValue(this, f304733t[4], Integer.valueOf(i10));
    }

    @Override // io.sentry.android.replay.capture.h
    public int d() {
        return ((Number) this.f304750p.getValue(this, f304733t[4])).intValue();
    }

    @Override // io.sentry.android.replay.capture.h
    public void g(int i10, @NotNull v replayId, @Nullable o8.c cVar) {
        io.sentry.android.replay.j jVar;
        Intrinsics.checkNotNullParameter(replayId, "replayId");
        Function1<v, io.sentry.android.replay.j> function1 = this.f304740f;
        if (function1 == null || (jVar = function1.invoke(replayId)) == null) {
            jVar = new io.sentry.android.replay.j(this.f304736b, replayId);
        }
        this.f304744j = jVar;
        j(replayId);
        c(i10);
        if (cVar == null) {
            cVar = this instanceof m ? o8.c.SESSION : o8.c.BUFFER;
        }
        o(cVar);
        m(io.sentry.p.d());
        this.f304747m.set(this.f304738d.a());
    }

    @Override // io.sentry.android.replay.capture.h
    @NotNull
    public o8.c h() {
        return (o8.c) this.f304751q.getValue(this, f304733t[5]);
    }

    @Override // io.sentry.android.replay.capture.h
    @NotNull
    public v i() {
        return (v) this.f304749o.getValue(this, f304733t[3]);
    }

    @Override // io.sentry.android.replay.capture.h
    public void j(@NotNull v vVar) {
        Intrinsics.checkNotNullParameter(vVar, "<set-?>");
        this.f304749o.setValue(this, f304733t[3], vVar);
    }

    @Override // io.sentry.android.replay.capture.h
    public void l(@Nullable String str) {
        io.sentry.android.replay.capture.h.b.a(this, str);
    }

    @Override // io.sentry.android.replay.capture.h
    public void m(@Nullable Date date) {
        this.f304746l.setValue(this, f304733t[1], date);
    }

    @Override // io.sentry.android.replay.capture.h
    @Nullable
    public File n() {
        io.sentry.android.replay.j jVar = this.f304744j;
        if (jVar != null) {
            return jVar.t();
        }
        return null;
    }

    @Override // io.sentry.android.replay.capture.h
    public void o(@NotNull o8.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f304751q.setValue(this, f304733t[5], cVar);
    }

    @Override // io.sentry.android.replay.capture.h
    public void p() {
        m(io.sentry.p.d());
    }

    @Override // io.sentry.android.replay.capture.h
    public void pause() {
    }

    @NotNull
    protected final io.sentry.android.replay.capture.h.c s(long j10, @NotNull Date currentSegmentTimestamp, @NotNull v replayId, int i10, int i11, int i12, int i13, int i14, @NotNull o8.c replayType, @Nullable io.sentry.android.replay.j jVar, @Nullable String str, @Nullable List<io.sentry.f> list, @NotNull Deque<io.sentry.rrweb.b> events) {
        Intrinsics.checkNotNullParameter(currentSegmentTimestamp, "currentSegmentTimestamp");
        Intrinsics.checkNotNullParameter(replayId, "replayId");
        Intrinsics.checkNotNullParameter(replayType, "replayType");
        Intrinsics.checkNotNullParameter(events, "events");
        return io.sentry.android.replay.capture.h.f304854a.c(this.f304737c, this.f304736b, j10, currentSegmentTimestamp, replayId, i10, i11, i12, replayType, jVar, i13, i14, str, list, events);
    }

    @Override // io.sentry.android.replay.capture.h
    public void stop() throws Exception {
        io.sentry.android.replay.j jVar = this.f304744j;
        if (jVar != null) {
            jVar.close();
        }
        this.f304747m.set(0L);
        m(null);
        v EMPTY_ID = v.f306474b;
        Intrinsics.checkNotNullExpressionValue(EMPTY_ID, "EMPTY_ID");
        j(EMPTY_ID);
    }

    @Nullable
    protected final io.sentry.android.replay.j u() {
        return this.f304744j;
    }

    @NotNull
    protected final Deque<io.sentry.rrweb.b> v() {
        return this.f304752r;
    }

    @Override // io.sentry.android.replay.capture.h
    public void v0(@NotNull w recorderConfig) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        H(recorderConfig);
    }

    @Nullable
    public final w x() {
        return (w) this.f304745k.getValue(this, f304733t[0]);
    }

    @NotNull
    protected final ScheduledExecutorService y() {
        return this.f304739e;
    }

    @NotNull
    protected final AtomicLong z() {
        return this.f304747m;
    }

    public /* synthetic */ a(n8 n8Var, i1 i1Var, p pVar, ScheduledExecutorService scheduledExecutorService, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(n8Var, i1Var, pVar, scheduledExecutorService, (i10 & 16) != 0 ? null : function1);
    }
}
