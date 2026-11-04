package com.planner5d.library.model.manager.statistics.events;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class n1 extends w0 implements t3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final n1 f217163b = new n1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f217164c = 0;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f217165a;

        static {
            int[] iArr = new int[com.planner5d.library.widget.rate.c.values().length];
            try {
                iArr[com.planner5d.library.widget.rate.c.AfterTwoSessions.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.planner5d.library.widget.rate.c.OnThreeItemsAddedInEditor.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.planner5d.library.widget.rate.c.OnContestProjectSubmitted.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.planner5d.library.widget.rate.c.OnContestPrizeClaimed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.planner5d.library.widget.rate.c.OnEditorExitAfterTrialUnlock.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f217165a = iArr;
        }
    }

    private n1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A1(String str, String str2, String str3, String str4, String str5, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put("form_name", str);
        track.put("source", str2);
        track.put(com.facebook.internal.w0.f100156c1, str3);
        track.put("user_choise", str4);
        track.put("trigger_rule", str5);
        return Unit.f312394a;
    }

    private final t3.e x1(Boolean bool) {
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            return t3.e.ok;
        }
        if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            return t3.e.cancel;
        }
        return null;
    }

    private final t3.d y1(com.planner5d.library.widget.rate.c cVar) {
        int i10 = cVar == null ? -1 : a.f217165a[cVar.ordinal()];
        if (i10 == 1) {
            return t3.d.third_login;
        }
        if (i10 == 2) {
            return t3.d.add_3_item;
        }
        int i11 = 1 ^ 3;
        if (i10 == 3) {
            return t3.d.submit_to_design_battle;
        }
        if (i10 == 4) {
            return t3.d.receive_battle_prize;
        }
        if (i10 != 5) {
            return null;
        }
        return t3.d.get_present;
    }

    private final void z1(final String str, final String str2, final String str3, final String str4, final String str5) {
        q1(u3.O3, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.m1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.A1(str, str2, str3, str4, str5, (Map) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.events.t3
    public void C0(@NotNull t3.a action, @NotNull t3.c source, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(source, "source");
        String strName = source.name();
        String strName2 = action.name();
        t3.e eVarX1 = x1(bool);
        z1("unlock_full_catalog_fo_24h", strName, strName2, eVarX1 != null ? eVarX1.name() : null, null);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.t3
    public void O0(@NotNull t3.a action, @NotNull t3.c source, @Nullable Boolean bool, @Nullable t3.d dVar) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(source, "source");
        String strName = source.name();
        String strName2 = action.name();
        t3.e eVarX1 = x1(bool);
        z1("premium_feature_unlock", strName, strName2, eVarX1 != null ? eVarX1.name() : null, dVar != null ? dVar.name() : null);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.t3
    public void R(@NotNull t3.a action, @NotNull t3.c source, @Nullable Boolean bool, @NotNull com.planner5d.library.widget.rate.c condition) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(condition, "condition");
        String strName = source.name();
        String strName2 = action.name();
        t3.e eVarX1 = x1(bool);
        String strName3 = eVarX1 != null ? eVarX1.name() : null;
        t3.d dVarY1 = y1(condition);
        z1("rate_us_popup", strName, strName2, strName3, dVarY1 != null ? dVarY1.name() : null);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.t3
    public void r0(@NotNull t3.a action) {
        Intrinsics.checkNotNullParameter(action, "action");
        z1("ai_improve_renders", null, action.name(), null, "ai_improve_renders");
    }
}
