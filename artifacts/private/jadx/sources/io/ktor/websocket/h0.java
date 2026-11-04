package io.ktor.websocket;

import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f297295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<String> f297296b;

    public h0(@NotNull String name, @NotNull List<String> parameters) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f297295a = name;
        this.f297296b = parameters;
    }

    private final String d() {
        if (this.f297296b.isEmpty()) {
            return "";
        }
        return "; " + CollectionsKt.joinToString$default(this.f297296b, ";", null, null, 0, null, null, 62, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair f(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int iQ3 = StringsKt.q3(it, '=', 0, false, 6, null);
        String strSubstring = "";
        if (iQ3 < 0) {
            return TuplesKt.to(it, "");
        }
        String strK5 = StringsKt.k5(it, kotlin.ranges.r.W1(0, iQ3));
        int i10 = iQ3 + 1;
        if (i10 < it.length()) {
            strSubstring = it.substring(i10);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        }
        return TuplesKt.to(strK5, strSubstring);
    }

    @NotNull
    public final String b() {
        return this.f297295a;
    }

    @NotNull
    public final List<String> c() {
        return this.f297296b;
    }

    @NotNull
    public final Sequence<Pair<String, String>> e() {
        return kotlin.sequences.o.k1(CollectionsKt.asSequence(this.f297296b), new Function1() { // from class: io.ktor.websocket.g0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h0.f((String) obj);
            }
        });
    }

    @NotNull
    public String toString() {
        return this.f297295a + ' ' + d();
    }
}
