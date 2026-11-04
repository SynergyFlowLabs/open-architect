package androidx.savedstate;

import android.os.Bundle;
import androidx.annotation.l0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f75159c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.savedstate.internal.d f75160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final j f75161b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(m mVar) {
            mVar.getLifecycle().c(new b(mVar));
            return Unit.f312394a;
        }

        @oj.n
        @NotNull
        public final l b(@NotNull final m owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            return new l(new androidx.savedstate.internal.d(owner, new Function0() { // from class: androidx.savedstate.k
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return l.a.c(owner);
                }
            }), null);
        }

        private a() {
        }
    }

    public /* synthetic */ l(androidx.savedstate.internal.d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar);
    }

    @oj.n
    @NotNull
    public static final l a(@NotNull m mVar) {
        return f75159c.b(mVar);
    }

    @NotNull
    public final j b() {
        return this.f75161b;
    }

    @l0
    public final void c() {
        this.f75160a.j();
    }

    @l0
    public final void d(@Nullable Bundle bundle) {
        this.f75160a.l(bundle);
    }

    @l0
    public final void e(@NotNull Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        this.f75160a.m(outBundle);
    }

    private l(androidx.savedstate.internal.d dVar) {
        this.f75160a = dVar;
        this.f75161b = new j(dVar);
    }
}
