package com.planner5d.library.model.manager.statistics.events;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class u2 extends w0 implements b4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final u2 f217517b = new u2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f217518c = 0;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f217519a;

        static {
            int[] iArr = new int[vd.b.values().length];
            try {
                iArr[vd.b.PRO4K.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vd.b.HD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[vd.b.DRAFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f217519a = iArr;
        }
    }

    private u2() {
    }

    private final b4.e A1(gd.b bVar) {
        if (bVar.c() == gd.c.ENHANCE) {
            return b4.e.ai_enhancer;
        }
        vd.b bVarJ = bVar.j();
        int i10 = bVarJ == null ? -1 : a.f217519a[bVarJ.ordinal()];
        if (i10 == 1) {
            return b4.e.pro4k;
        }
        if (i10 == 2) {
            return b4.e.hd;
        }
        if (i10 != 3) {
            return null;
        }
        return b4.e.draft;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B1(String str, b4.c cVar, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("folder", str);
        track.put("source", cVar != null ? cVar.name() : null);
        track.put("archive", Boolean.FALSE);
        return Unit.f312394a;
    }

    @oj.j
    @oj.n
    public static final void C1(@NotNull b4.a action, @Nullable p3.b bVar, @Nullable Long l10, @Nullable b4.c cVar) {
        Intrinsics.checkNotNullParameter(action, "action");
        E1(action, bVar, l10, cVar, null, 16, null);
    }

    @oj.j
    @oj.n
    public static final void D1(@NotNull final b4.a action, @Nullable final p3.b bVar, @Nullable final Long l10, @Nullable final b4.c cVar, @Nullable final gd.b bVar2) {
        Intrinsics.checkNotNullParameter(action, "action");
        f217517b.q1(u3.f217564r4, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.q2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u2.F1(action, bVar2, bVar, l10, cVar, (Map) obj);
            }
        });
    }

    public static /* synthetic */ void E1(b4.a aVar, p3.b bVar, Long l10, b4.c cVar, gd.b bVar2, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            bVar2 = null;
        }
        D1(aVar, bVar, l10, cVar, bVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F1(b4.a aVar, gd.b bVar, p3.b bVar2, Long l10, b4.c cVar, Map track) {
        String str;
        b4.e eVarA1;
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put(com.facebook.internal.w0.f100156c1, aVar.name());
        if (bVar == null || (eVarA1 = f217517b.A1(bVar)) == null || (str = eVarA1.f216766a) == null) {
            str = b4.e.snapshot.f216766a;
        }
        track.put("type", str);
        track.put("state", bVar2 != null ? bVar2.name() : null);
        track.put("project_id", l10);
        track.put("source", cVar != null ? cVar.name() : null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G1(b4.a aVar, b4.e eVar, p3.b bVar, Long l10, b4.c cVar, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put(com.facebook.internal.w0.f100156c1, aVar.name());
        track.put("type", eVar.f216766a);
        track.put("state", bVar != null ? bVar.name() : null);
        track.put("project_id", l10);
        track.put("source", cVar != null ? cVar.name() : null);
        return Unit.f312394a;
    }

    @oj.n
    public static final void H1(@NotNull final b4.e type, @NotNull final b4.d target, @NotNull final p3.b state, @Nullable final Long l10) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(state, "state");
        f217517b.q1(u3.f217567s4, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.t2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u2.I1(type, target, l10, state, (Map) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I1(b4.e eVar, b4.d dVar, Long l10, p3.b bVar, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("type", eVar.f216766a);
        track.put(androidx.constraintlayout.core.motion.utils.v.a.M, dVar.name());
        track.put("project_id", l10);
        f217517b.m1(track, bVar, null, false);
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.statistics.events.b4
    public void J0(@NotNull final b4.a action, @Nullable final p3.b bVar, @Nullable final Long l10, @Nullable final b4.c cVar, @NotNull final b4.e type) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(type, "type");
        q1(u3.f217564r4, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.r2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u2.G1(action, type, bVar, l10, cVar, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.b4
    public void k0(@Nullable final String str, @Nullable final b4.c cVar) {
        q1(u3.f217562q4, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.s2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u2.B1(str, cVar, (Map) obj);
            }
        });
    }
}
