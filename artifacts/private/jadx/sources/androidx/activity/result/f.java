package androidx.activity.result;

import android.content.Context;
import android.content.Intent;
import kotlin.Unit;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class f<I, O> extends h<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final h<I> f10011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final g.a<I, O> f10012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final I f10013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final f0 f10014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final g.a<Unit, O> f10015e;

    static final class a extends l0 implements Function0<C0028a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f<I, O> f10016a;

        /* JADX INFO: renamed from: androidx.activity.result.f$a$a, reason: collision with other inner class name */
        public static final class C0028a extends g.a<Unit, O> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ f<I, O> f10017a;

            C0028a(f<I, O> fVar) {
                this.f10017a = fVar;
            }

            @Override // g.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Intent createIntent(Context context, Unit input) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input, "input");
                return this.f10017a.e().createIntent(context, this.f10017a.f());
            }

            @Override // g.a
            public O parseResult(int i10, Intent intent) {
                return this.f10017a.e().parseResult(i10, intent);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f<I, O> fVar) {
            super(0);
            this.f10016a = fVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C0028a invoke() {
            return new C0028a(this.f10016a);
        }
    }

    public f(@NotNull h<I> launcher, @NotNull g.a<I, O> callerContract, I i10) {
        Intrinsics.checkNotNullParameter(launcher, "launcher");
        Intrinsics.checkNotNullParameter(callerContract, "callerContract");
        this.f10011a = launcher;
        this.f10012b = callerContract;
        this.f10013c = i10;
        this.f10014d = g0.c(new a(this));
        this.f10015e = g();
    }

    private final g.a<Unit, O> g() {
        return (g.a) this.f10014d.getValue();
    }

    @Override // androidx.activity.result.h
    @NotNull
    public g.a<Unit, ?> a() {
        return this.f10015e;
    }

    @Override // androidx.activity.result.h
    public void d() {
        this.f10011a.d();
    }

    @NotNull
    public final g.a<I, O> e() {
        return this.f10012b;
    }

    public final I f() {
        return this.f10013c;
    }

    @Override // androidx.activity.result.h
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void c(@NotNull Unit input, @Nullable androidx.core.app.e eVar) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.f10011a.c(this.f10013c, eVar);
    }
}
