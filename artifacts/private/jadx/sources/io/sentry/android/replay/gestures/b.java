package io.sentry.android.replay.gestures;

import android.view.MotionEvent;
import androidx.compose.runtime.internal.w0;
import io.sentry.android.replay.w;
import io.sentry.rrweb.d;
import io.sentry.rrweb.e;
import io.sentry.rrweb.f;
import io.sentry.transport.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nReplayGestureConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplayGestureConverter.kt\nio/sentry/android/replay/gestures/ReplayGestureConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,150:1\n1855#2,2:151\n1549#2:153\n1620#2,3:154\n*S KotlinDebug\n*F\n+ 1 ReplayGestureConverter.kt\nio/sentry/android/replay/gestures/ReplayGestureConverter\n*L\n38#1:151,2\n69#1:153\n69#1:154,3\n*E\n"})
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f304912e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f304913f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f304914g = 50;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f304915h = 500;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p f304916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap<Integer, ArrayList<f.c>> f304917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f304918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f304919d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(@NotNull p dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f304916a = dateProvider;
        this.f304917b = new LinkedHashMap<>(10);
    }

    @Nullable
    public final List<d> a(@NotNull MotionEvent event, @NotNull w recorderConfig) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        int actionMasked = event.getActionMasked();
        int i10 = 10;
        int i11 = 0;
        List<d> list = null;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    long jA = this.f304916a.a();
                    long j10 = this.f304919d;
                    if (j10 != 0 && j10 + ((long) 50) > jA) {
                        return null;
                    }
                    this.f304919d = jA;
                    Set<Integer> setKeySet = this.f304917b.keySet();
                    Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
                    for (Integer num : setKeySet) {
                        Intrinsics.checkNotNull(num);
                        int iFindPointerIndex = event.findPointerIndex(num.intValue());
                        if (iFindPointerIndex != -1) {
                            if (this.f304918c == 0) {
                                this.f304918c = jA;
                            }
                            ArrayList<f.c> arrayList = this.f304917b.get(num);
                            Intrinsics.checkNotNull(arrayList);
                            f.c cVar = new f.c();
                            cVar.k(event.getX(iFindPointerIndex) * recorderConfig.m());
                            cVar.l(event.getY(iFindPointerIndex) * recorderConfig.n());
                            cVar.i(i11);
                            cVar.j(jA - this.f304918c);
                            arrayList.add(cVar);
                        }
                        list = list;
                        i11 = 0;
                    }
                    List<d> list2 = list;
                    long j11 = jA - this.f304918c;
                    if (j11 <= 500) {
                        return list2;
                    }
                    ArrayList arrayList2 = new ArrayList(this.f304917b.size());
                    Iterator<Map.Entry<Integer, ArrayList<f.c>>> it = this.f304917b.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<Integer, ArrayList<f.c>> next = it.next();
                        int iIntValue = next.getKey().intValue();
                        ArrayList<f.c> value = next.getValue();
                        if (!value.isEmpty()) {
                            f fVar = new f();
                            fVar.g(jA);
                            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(value, i10));
                            for (f.c cVar2 : value) {
                                cVar2.j(cVar2.f() - j11);
                                arrayList3.add(cVar2);
                                it = it;
                            }
                            fVar.u(arrayList3);
                            fVar.t(iIntValue);
                            arrayList2.add(fVar);
                            ArrayList<f.c> arrayList4 = this.f304917b.get(Integer.valueOf(iIntValue));
                            Intrinsics.checkNotNull(arrayList4);
                            arrayList4.clear();
                            it = it;
                            i10 = 10;
                        }
                    }
                    this.f304918c = 0L;
                    return arrayList2;
                }
                if (actionMasked == 3) {
                    this.f304917b.clear();
                    e eVar = new e();
                    eVar.g(this.f304916a.a());
                    eVar.F(event.getX() * recorderConfig.m());
                    eVar.G(event.getY() * recorderConfig.n());
                    eVar.B(0);
                    eVar.D(0);
                    eVar.C(e.b.TouchCancel);
                    return CollectionsKt.listOf(eVar);
                }
                if (actionMasked != 5) {
                    if (actionMasked != 6) {
                        return null;
                    }
                }
            }
            int pointerId = event.getPointerId(event.getActionIndex());
            int iFindPointerIndex2 = event.findPointerIndex(pointerId);
            if (iFindPointerIndex2 == -1) {
                return null;
            }
            this.f304917b.remove(Integer.valueOf(pointerId));
            e eVar2 = new e();
            eVar2.g(this.f304916a.a());
            eVar2.F(event.getX(iFindPointerIndex2) * recorderConfig.m());
            eVar2.G(event.getY(iFindPointerIndex2) * recorderConfig.n());
            eVar2.B(0);
            eVar2.D(pointerId);
            eVar2.C(e.b.TouchEnd);
            return CollectionsKt.listOf(eVar2);
        }
        int pointerId2 = event.getPointerId(event.getActionIndex());
        int iFindPointerIndex3 = event.findPointerIndex(pointerId2);
        if (iFindPointerIndex3 == -1) {
            return null;
        }
        this.f304917b.put(Integer.valueOf(pointerId2), new ArrayList<>(10));
        e eVar3 = new e();
        eVar3.g(this.f304916a.a());
        eVar3.F(event.getX(iFindPointerIndex3) * recorderConfig.m());
        eVar3.G(event.getY(iFindPointerIndex3) * recorderConfig.n());
        eVar3.B(0);
        eVar3.D(pointerId2);
        eVar3.C(e.b.TouchStart);
        return CollectionsKt.listOf(eVar3);
    }
}
