package com.planner5d.library.model.manager.statistics.events;

import com.devtodev.analytics.internal.storage.sqlite.TutorialMarkEntry;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class e3 extends w0 implements e4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final e3 f216873b = new e3();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f216874c = 0;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f216875a;

        static {
            int[] iArr = new int[e4.a.values().length];
            try {
                iArr[e4.a.saved_scale.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e4.a.back.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e4.a.close.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f216875a = iArr;
        }
    }

    private e3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A1(e4.c cVar, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("method", cVar);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B1(e4.a aVar, e4.c cVar, Boolean bool, Boolean bool2, e4.e eVar, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put(com.facebook.internal.w0.f100156c1, aVar);
        track.put("method", cVar);
        int i10 = a.f216875a[aVar.ordinal()];
        if (i10 == 1) {
            Boolean bool3 = Boolean.TRUE;
            track.put("rotate_plan", Intrinsics.areEqual(bool, bool3) ? e4.g.yes : e4.g.no);
            track.put("crop_plan", Intrinsics.areEqual(bool2, bool3) ? e4.g.yes : e4.g.no);
        } else if (i10 == 2 || i10 == 3) {
            track.put(TutorialMarkEntry.step, eVar);
        } else {
            Unit unit = Unit.f312394a;
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C1(e4.c cVar, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("method", cVar);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D1(e4.c cVar, e4.f fVar, long j10, String str, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("method", cVar);
        track.put("type", fVar);
        track.put("task_id", Long.valueOf(j10));
        track.put("error_raw", str);
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.statistics.events.e4
    public void E0(@NotNull final e4.c method, @NotNull final e4.f type, final long j10, @Nullable final String str) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(type, "type");
        q1(u3.I4, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.b3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e3.D1(method, type, j10, str, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.e4
    public void S(boolean z10) {
        b2.f216725b.c1(z10 ? x3.b.upload_plan : x3.b.room_wizard);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.e4
    public void Y(@NotNull final e4.c method) {
        Intrinsics.checkNotNullParameter(method, "method");
        q1(u3.F4, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.d3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e3.A1(method, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.e4
    public void h(@NotNull final e4.c method) {
        Intrinsics.checkNotNullParameter(method, "method");
        q1(u3.G4, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.a3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e3.C1(method, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.e4
    @NotNull
    public e4.c m(@NotNull String component) {
        Intrinsics.checkNotNullParameter(component, "component");
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = component.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return StringsKt.V2(lowerCase, "camera", false, 2, null) ? e4.c.camera : e4.c.photo_gallery;
    }

    @Override // com.planner5d.library.model.manager.statistics.events.e4
    public void n0(@NotNull final e4.a action, @Nullable final e4.c cVar, @Nullable final e4.e eVar, @Nullable final Boolean bool, @Nullable final Boolean bool2) {
        Intrinsics.checkNotNullParameter(action, "action");
        q1(u3.H4, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.c3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e3.B1(action, cVar, bool, bool2, eVar, (Map) obj);
            }
        });
    }
}
