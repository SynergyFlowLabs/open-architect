package io.sentry.android.replay.capture;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.facebook.internal.w0;
import io.sentry.android.replay.w;
import io.sentry.g1;
import io.sentry.n0;
import io.sentry.n8;
import io.sentry.o8;
import io.sentry.p;
import io.sentry.p4;
import io.sentry.protocol.v;
import io.sentry.v4;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public interface h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f304854a = a.f304855a;

    @SourceDebugExtension({"SMAP\nCaptureStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CaptureStrategy.kt\nio/sentry/android/replay/capture/CaptureStrategy$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,272:1\n1#2:273\n1855#3,2:274\n1045#3:276\n*S KotlinDebug\n*F\n+ 1 CaptureStrategy.kt\nio/sentry/android/replay/capture/CaptureStrategy$Companion\n*L\n181#1:274,2\n228#1:276\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f304855a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f304856b = 5000;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f304857c = 300000;

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.h$a$a, reason: collision with other inner class name */
        static final class C2215a extends l0 implements Function1<io.sentry.rrweb.b, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Date f304858a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ List<io.sentry.rrweb.b> f304859b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2215a(Date date, List<io.sentry.rrweb.b> list) {
                super(1);
                this.f304858a = date;
                this.f304859b = list;
            }

            public final void c(io.sentry.rrweb.b event) {
                Intrinsics.checkNotNullParameter(event, "event");
                if (event.e() >= this.f304858a.getTime()) {
                    this.f304859b.add(event);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(io.sentry.rrweb.b bVar) {
                c(bVar);
                return Unit.f312394a;
            }
        }

        @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 CaptureStrategy.kt\nio/sentry/android/replay/capture/CaptureStrategy$Companion\n*L\n1#1,328:1\n228#2:329\n*E\n"})
        public static final class b<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return kotlin.comparisons.a.l(Long.valueOf(((io.sentry.rrweb.b) t10).e()), Long.valueOf(((io.sentry.rrweb.b) t11).e()));
            }
        }

        private a() {
        }

        /* JADX WARN: Code duplicated, block: B:14:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:35:0x0134  */
        private final c b(n8 n8Var, File file, v vVar, Date date, int i10, int i11, int i12, int i13, int i14, long j10, o8.c cVar, String str, List<io.sentry.f> list, Deque<io.sentry.rrweb.b> deque) {
            boolean z10;
            io.sentry.rrweb.b bVarA;
            Object obj;
            Date dateE = p.e(date.getTime() + j10);
            Intrinsics.checkNotNullExpressionValue(dateE, "getDateTime(...)");
            o8 o8Var = new o8();
            o8Var.b0(vVar);
            o8Var.y0(vVar);
            o8Var.B0(i10);
            o8Var.C0(dateE);
            o8Var.z0(date);
            o8Var.A0(cVar);
            o8Var.G0(file);
            ArrayList arrayList = new ArrayList();
            io.sentry.rrweb.g gVar = new io.sentry.rrweb.g();
            gVar.g(date.getTime());
            gVar.r(i11);
            gVar.t(i12);
            arrayList.add(gVar);
            io.sentry.rrweb.j jVar = new io.sentry.rrweb.j();
            jVar.g(date.getTime());
            jVar.W(i10);
            jVar.O(j10);
            jVar.Q(i13);
            jVar.X(file.length());
            jVar.R(i14);
            jVar.T(i11);
            jVar.a0(i12);
            jVar.U(0);
            jVar.Z(0);
            arrayList.add(jVar);
            LinkedList linkedList = new LinkedList();
            io.sentry.f fVar = null;
            for (io.sentry.f fVar2 : list) {
                if (fVar != null) {
                    a aVar = f304855a;
                    z10 = aVar.e(fVar) && aVar.f(fVar2) && fVar2.x().getTime() + 5000 >= date.getTime();
                }
                if ((fVar2.x().getTime() >= date.getTime() || z10) && fVar2.x().getTime() < dateE.getTime() && (bVarA = n8Var.getReplayController().r().a(fVar2)) != null) {
                    arrayList.add(bVarA);
                    io.sentry.rrweb.a aVar2 = bVarA instanceof io.sentry.rrweb.a ? (io.sentry.rrweb.a) bVarA : null;
                    if (Intrinsics.areEqual(aVar2 != null ? aVar2.r() : null, "navigation")) {
                        io.sentry.rrweb.a aVar3 = (io.sentry.rrweb.a) bVarA;
                        Map<String, Object> mapS = aVar3.s();
                        if (mapS != null) {
                            Intrinsics.checkNotNull(mapS);
                            obj = mapS.get("to");
                            if (obj == null) {
                                obj = null;
                            }
                        } else {
                            obj = null;
                        }
                        if (obj instanceof String) {
                            Map<String, Object> mapS2 = aVar3.s();
                            Intrinsics.checkNotNull(mapS2);
                            Object obj2 = mapS2.get("to");
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                            linkedList.add((String) obj2);
                        }
                    }
                }
                fVar = fVar2;
            }
            if (str != null && !Intrinsics.areEqual(CollectionsKt.firstOrNull((List) linkedList), str)) {
                linkedList.addFirst(str);
            }
            g(deque, dateE.getTime(), new C2215a(date, arrayList));
            if (i10 == 0) {
                arrayList.add(new io.sentry.rrweb.h(n8Var));
            }
            p4 p4Var = new p4();
            p4Var.d(Integer.valueOf(i10));
            p4Var.c(CollectionsKt.sortedWith(arrayList, new b()));
            o8Var.F0(linkedList);
            return new c.a(o8Var, p4Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Type inference failed for: r0v2, types: [T, java.util.ArrayList] */
        public static final void d(i1.h hVar, g1 scope) {
            Intrinsics.checkNotNullParameter(scope, "scope");
            hVar.f312751a = new ArrayList(scope.C());
        }

        private final boolean e(io.sentry.f fVar) {
            if (fVar == null || !Intrinsics.areEqual(fVar.q(), "network.event")) {
                return false;
            }
            Map<String, Object> mapS = fVar.s();
            Intrinsics.checkNotNullExpressionValue(mapS, "getData(...)");
            Object obj = mapS.get(w0.f100156c1);
            if (obj == null) {
                obj = null;
            }
            return Intrinsics.areEqual(obj, "NETWORK_AVAILABLE");
        }

        private final boolean f(io.sentry.f fVar) {
            return Intrinsics.areEqual(fVar.q(), "network.event") && fVar.s().containsKey("network_type");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void h(a aVar, Deque deque, long j10, Function1 function1, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                function1 = null;
            }
            aVar.g(deque, j10, function1);
        }

        /* JADX WARN: Type inference failed for: r7v2, types: [T, java.util.List] */
        @NotNull
        public final c c(@Nullable io.sentry.i1 i1Var, @NotNull n8 options, long j10, @NotNull Date currentSegmentTimestamp, @NotNull v replayId, int i10, int i11, int i12, @NotNull o8.c replayType, @Nullable io.sentry.android.replay.j jVar, int i13, int i14, @Nullable String str, @Nullable List<io.sentry.f> list, @NotNull Deque<io.sentry.rrweb.b> events) {
            io.sentry.android.replay.c cVarJ;
            List<io.sentry.f> list2;
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(currentSegmentTimestamp, "currentSegmentTimestamp");
            Intrinsics.checkNotNullParameter(replayId, "replayId");
            Intrinsics.checkNotNullParameter(replayType, "replayType");
            Intrinsics.checkNotNullParameter(events, "events");
            if (jVar == null || (cVarJ = io.sentry.android.replay.j.j(jVar, Math.min(j10, 300000L), currentSegmentTimestamp.getTime(), i10, i11, i12, i13, i14, null, 128, null)) == null) {
                return c.b.f304864b;
            }
            File fileA = cVarJ.a();
            int iB = cVarJ.b();
            long jC = cVarJ.c();
            if (list == null) {
                final i1.h hVar = new i1.h();
                hVar.f312751a = CollectionsKt.emptyList();
                if (i1Var != null) {
                    i1Var.v0(new v4() { // from class: io.sentry.android.replay.capture.g
                        @Override // io.sentry.v4
                        public final void a(g1 g1Var) {
                            h.a.d(hVar, g1Var);
                        }
                    });
                }
                list2 = (List) hVar.f312751a;
            } else {
                list2 = list;
            }
            return b(options, fileA, replayId, currentSegmentTimestamp, i10, i11, i12, iB, i13, jC, replayType, str, list2, events);
        }

        public final void g(@NotNull Deque<io.sentry.rrweb.b> events, long j10, @Nullable Function1<? super io.sentry.rrweb.b, Unit> function1) {
            Intrinsics.checkNotNullParameter(events, "events");
            Iterator<io.sentry.rrweb.b> it = events.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                io.sentry.rrweb.b next = it.next();
                if (next.e() < j10) {
                    if (function1 != null) {
                        Intrinsics.checkNotNull(next);
                        function1.invoke(next);
                    }
                    it.remove();
                }
            }
        }
    }

    public static final class b {
        public static void a(@NotNull h hVar, @Nullable String str) {
        }

        public static /* synthetic */ void b(h hVar, Bitmap bitmap, Function2 function2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onScreenshotRecorded");
            }
            if ((i10 & 1) != 0) {
                bitmap = null;
            }
            hVar.e(bitmap, function2);
        }

        public static /* synthetic */ void c(h hVar, int i10, v vVar, o8.c cVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
            }
            if ((i11 & 1) != 0) {
                i10 = 0;
            }
            if ((i11 & 2) != 0) {
                vVar = new v();
            }
            if ((i11 & 4) != 0) {
                cVar = null;
            }
            hVar.g(i10, vVar, cVar);
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f304860a = 0;

        @androidx.compose.runtime.internal.w0(parameters = 0)
        @SourceDebugExtension({"SMAP\nCaptureStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CaptureStrategy.kt\nio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment$Created\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,272:1\n1#2:273\n1855#3,2:274\n*S KotlinDebug\n*F\n+ 1 CaptureStrategy.kt\nio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment$Created\n*L\n263#1:274,2\n*E\n"})
        public static final class a extends c {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f304861d = 8;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            private final o8 f304862b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            private final p4 f304863c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull o8 replay, @NotNull p4 recording) {
                super(null);
                Intrinsics.checkNotNullParameter(replay, "replay");
                Intrinsics.checkNotNullParameter(recording, "recording");
                this.f304862b = replay;
                this.f304863c = recording;
            }

            public static /* synthetic */ void b(a aVar, io.sentry.i1 i1Var, n0 n0Var, int i10, Object obj) {
                if ((i10 & 2) != 0) {
                    n0Var = new n0();
                }
                aVar.a(i1Var, n0Var);
            }

            public static /* synthetic */ a f(a aVar, o8 o8Var, p4 p4Var, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    o8Var = aVar.f304862b;
                }
                if ((i10 & 2) != 0) {
                    p4Var = aVar.f304863c;
                }
                return aVar.e(o8Var, p4Var);
            }

            public final void a(@Nullable io.sentry.i1 i1Var, @NotNull n0 hint) {
                Intrinsics.checkNotNullParameter(hint, "hint");
                if (i1Var != null) {
                    o8 o8Var = this.f304862b;
                    hint.p(this.f304863c);
                    Unit unit = Unit.f312394a;
                    i1Var.w0(o8Var, hint);
                }
            }

            @NotNull
            public final o8 c() {
                return this.f304862b;
            }

            @NotNull
            public final p4 d() {
                return this.f304863c;
            }

            @NotNull
            public final a e(@NotNull o8 replay, @NotNull p4 recording) {
                Intrinsics.checkNotNullParameter(replay, "replay");
                Intrinsics.checkNotNullParameter(recording, "recording");
                return new a(replay, recording);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.areEqual(this.f304862b, aVar.f304862b) && Intrinsics.areEqual(this.f304863c, aVar.f304863c);
            }

            @NotNull
            public final p4 g() {
                return this.f304863c;
            }

            @NotNull
            public final o8 h() {
                return this.f304862b;
            }

            public int hashCode() {
                return (this.f304862b.hashCode() * 31) + this.f304863c.hashCode();
            }

            public final void i(int i10) {
                this.f304862b.B0(i10);
                List<? extends io.sentry.rrweb.b> listA = this.f304863c.a();
                if (listA != null) {
                    for (io.sentry.rrweb.b bVar : listA) {
                        if (bVar instanceof io.sentry.rrweb.j) {
                            ((io.sentry.rrweb.j) bVar).W(i10);
                        }
                    }
                }
            }

            @NotNull
            public String toString() {
                return "Created(replay=" + this.f304862b + ", recording=" + this.f304863c + ')';
            }
        }

        @androidx.compose.runtime.internal.w0(parameters = 1)
        public static final class b extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final b f304864b = new b();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f304865c = 0;

            private b() {
                super(null);
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    void a(@NotNull MotionEvent motionEvent);

    @Nullable
    Date b();

    void c(int i10);

    int d();

    void e(@Nullable Bitmap bitmap, @NotNull Function2<? super io.sentry.android.replay.j, ? super Long, Unit> function2);

    @NotNull
    h f();

    void g(int i10, @NotNull v vVar, @Nullable o8.c cVar);

    @NotNull
    o8.c h();

    @NotNull
    v i();

    void j(@NotNull v vVar);

    void k(boolean z10, @NotNull Function1<? super Date, Unit> function1);

    void l(@Nullable String str);

    void m(@Nullable Date date);

    @Nullable
    File n();

    void o(@NotNull o8.c cVar);

    void p();

    void pause();

    void stop();

    void v0(@NotNull w wVar);
}
