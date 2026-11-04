package androidx.compose.material3;

import java.util.Locale;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.k7
@SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/BaseDatePickerStateImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2305:1\n85#2:2306\n117#2,2:2307\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/BaseDatePickerStateImpl\n*L\n1133#1:2306\n1133#1:2307,2\n*E\n"})
public abstract class l2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f30208f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final IntRange f30209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Locale f30210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.material3.internal.k1 f30211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f30212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3<androidx.compose.material3.internal.o1> f30213e;

    public l2(@Nullable Long l10, @NotNull IntRange intRange, @NotNull ww wwVar, @NotNull Locale locale) {
        androidx.compose.material3.internal.o1 o1VarO;
        this.f30209a = intRange;
        this.f30210b = locale;
        androidx.compose.material3.internal.k1 k1VarA = androidx.compose.material3.internal.n1.a(locale);
        this.f30211c = k1VarA;
        this.f30212d = androidx.compose.runtime.d7.g(wwVar, null, 2, null);
        if (l10 != null) {
            o1VarO = k1VarA.n(l10.longValue());
            if (!intRange.t(o1VarO.n())) {
                o1VarO = k1VarA.o(k1VarA.p());
            }
        } else {
            o1VarO = k1VarA.o(k1VarA.p());
        }
        this.f30213e = androidx.compose.runtime.d7.g(o1VarO, null, 2, null);
    }

    public final void a(long j10) {
        androidx.compose.material3.internal.o1 o1VarN = this.f30211c.n(j10);
        if (this.f30209a.t(o1VarN.n())) {
            this.f30213e.setValue(o1VarN);
        }
    }

    @NotNull
    public final ww b() {
        return (ww) this.f30212d.getValue();
    }

    @NotNull
    public final IntRange c() {
        return this.f30209a;
    }

    public final long f() {
        return this.f30213e.getValue().m();
    }

    @NotNull
    public final Locale getLocale() {
        return this.f30210b;
    }

    @NotNull
    public final androidx.compose.material3.internal.k1 l() {
        return this.f30211c;
    }

    public final void m(@NotNull ww wwVar) {
        this.f30212d.setValue(wwVar);
    }
}
