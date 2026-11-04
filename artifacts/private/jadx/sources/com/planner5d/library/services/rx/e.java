package com.planner5d.library.services.rx;

import com.planner5d.library.model.manager.u1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes10.dex */
public class e<T> extends Subscriber<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f224940b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static u1 f224941c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Subscriber<? super T> f224942a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final u1 a() {
            u1 u1Var = e.f224941c;
            if (u1Var != null) {
                return u1Var;
            }
            Intrinsics.throwUninitializedPropertyAccessException("loggingService");
            return null;
        }

        public final void b(@NotNull u1 u1Var) {
            Intrinsics.checkNotNullParameter(u1Var, "<set-?>");
            e.f224941c = u1Var;
        }

        private a() {
        }
    }

    public e(@Nullable Subscriber<? super T> subscriber) {
        this.f224942a = subscriber;
    }

    public void c(@Nullable Throwable th2) throws Throwable {
        Subscriber<? super T> subscriber = this.f224942a;
        if (subscriber != null) {
            subscriber.onError(th2);
        }
    }

    @Override // rx.Observer
    public void onCompleted() {
        Subscriber<? super T> subscriber = this.f224942a;
        if (subscriber != null) {
            subscriber.onCompleted();
        }
    }

    @Override // rx.Observer
    public final void onError(@Nullable Throwable th2) {
        try {
            c(th2);
        } catch (Throwable th3) {
            f224940b.a().b("rxsubscriber", "onError failed", th3);
        }
    }

    @Override // rx.Observer
    public void onNext(T t10) {
        Subscriber<? super T> subscriber = this.f224942a;
        if (subscriber != null) {
            subscriber.onNext(t10);
        }
    }

    public e() {
        this(null);
    }
}
