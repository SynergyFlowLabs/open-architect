package com.planner5d.library.services.utility;

import android.content.Context;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class m3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final m3 f225331a = new m3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f225332b = 0;

    private m3() {
    }

    @oj.n
    @NotNull
    public static final String b(@NotNull final Context context, @NotNull k3[] input, @NotNull CharSequence separator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(separator, "separator");
        return ArraysKt.joinToString$default(input, separator, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: com.planner5d.library.services.utility.l3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m3.c(context, (k3) obj);
            }
        }, 30, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence c(Context context, k3 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.i(context);
    }
}
