package io.ktor.http.content;

import io.ktor.http.l1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends w.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function2<io.ktor.utils.io.p, kotlin.coroutines.d<? super Unit>, Object> f295709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final io.ktor.http.m f295710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final l1 f295711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final Long f295712e;

    public /* synthetic */ f(Function2 function2, io.ktor.http.m mVar, l1 l1Var, Long l10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, mVar, (i10 & 4) != 0 ? null : l1Var, (i10 & 8) != 0 ? null : l10);
    }

    @Override // io.ktor.http.content.w
    @Nullable
    public Long a() {
        return this.f295712e;
    }

    @Override // io.ktor.http.content.w
    @Nullable
    public io.ktor.http.m b() {
        return this.f295710c;
    }

    @Override // io.ktor.http.content.w
    @Nullable
    public l1 e() {
        return this.f295711d;
    }

    @Override // io.ktor.http.content.w.f
    @Nullable
    public Object h(@NotNull io.ktor.utils.io.p pVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objInvoke = this.f295709b.invoke(pVar, dVar);
        return objInvoke == kotlin.coroutines.intrinsics.b.l() ? objInvoke : Unit.f312394a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@NotNull Function2<? super io.ktor.utils.io.p, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> body, @Nullable io.ktor.http.m mVar, @Nullable l1 l1Var, @Nullable Long l10) {
        Intrinsics.checkNotNullParameter(body, "body");
        this.f295709b = body;
        this.f295710c = mVar;
        this.f295711d = l1Var;
        this.f295712e = l10;
    }
}
