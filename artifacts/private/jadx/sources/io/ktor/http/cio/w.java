package io.ktor.http.cio;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.a1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public abstract class w {

    public static final class a extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final kotlinx.io.c0 f295646a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull kotlinx.io.c0 body) {
            super(null);
            Intrinsics.checkNotNullParameter(body, "body");
            this.f295646a = body;
        }

        @Override // io.ktor.http.cio.w
        public void a() {
            this.f295646a.close();
        }

        @NotNull
        public final kotlinx.io.c0 b() {
            return this.f295646a;
        }
    }

    public static final class b extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final a1<q> f295647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final io.ktor.utils.io.h f295648b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull a1<q> headers, @NotNull io.ktor.utils.io.h body) {
            super(null);
            Intrinsics.checkNotNullParameter(headers, "headers");
            Intrinsics.checkNotNullParameter(body, "body");
            this.f295647a = headers;
            this.f295648b = body;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(b bVar, Throwable th2) {
            if (th2 != null) {
                bVar.f295647a.m().p();
            }
            return Unit.f312394a;
        }

        @Override // io.ktor.http.cio.w
        public void a() throws InterruptedException {
            this.f295647a.E(new Function1() { // from class: io.ktor.http.cio.x
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return w.b.e(this.f295650a, (Throwable) obj);
                }
            });
            y.a(this.f295648b);
        }

        @NotNull
        public final io.ktor.utils.io.h c() {
            return this.f295648b;
        }

        @NotNull
        public final a1<q> d() {
            return this.f295647a;
        }
    }

    public static final class c extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final kotlinx.io.c0 f295649a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull kotlinx.io.c0 body) {
            super(null);
            Intrinsics.checkNotNullParameter(body, "body");
            this.f295649a = body;
        }

        @Override // io.ktor.http.cio.w
        public void a() {
            this.f295649a.close();
        }

        @NotNull
        public final kotlinx.io.c0 b() {
            return this.f295649a;
        }
    }

    public /* synthetic */ w(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract void a();

    private w() {
    }
}
