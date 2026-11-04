package com.planner5d.library.model.manager.statistics.events;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class l1 extends w0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final l1 f217092b = new l1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f217093c = 0;

    private l1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y1(s3.a aVar, String str, String str2, Map track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.put(com.facebook.internal.w0.f100156c1, aVar.name());
        track.put("message_name", str);
        track.put(com.google.firebase.messaging.e.d.f123515f, str2);
        return Unit.f312394a;
    }

    public final void x1(@NotNull final s3.a action, @Nullable final String str, @Nullable final String str2) {
        Intrinsics.checkNotNullParameter(action, "action");
        q1(u3.J4, new Function1() { // from class: com.planner5d.library.model.manager.statistics.events.k1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l1.y1(action, str, str2, (Map) obj);
            }
        });
    }
}
