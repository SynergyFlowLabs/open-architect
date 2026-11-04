package io.ktor.client.utils;

import io.ktor.http.content.w;
import io.ktor.http.l1;
import io.ktor.http.v0;
import io.ktor.utils.io.p;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import kotlinx.coroutines.p2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    public static final class a extends w.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final v0 f295405b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w f295406c;

        a(Function1<? super v0, ? extends v0> function1, w wVar) {
            this.f295406c = wVar;
            this.f295405b = function1.invoke(wVar.c());
        }

        @Override // io.ktor.http.content.w
        public Long a() {
            return this.f295406c.a();
        }

        @Override // io.ktor.http.content.w
        public io.ktor.http.m b() {
            return this.f295406c.b();
        }

        @Override // io.ktor.http.content.w
        public v0 c() {
            return this.f295405b;
        }

        @Override // io.ktor.http.content.w
        public l1 e() {
            return this.f295406c.e();
        }
    }

    public static final class b extends w.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final v0 f295407b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w f295408c;

        b(Function1<? super v0, ? extends v0> function1, w wVar) {
            this.f295408c = wVar;
            this.f295407b = function1.invoke(wVar.c());
        }

        @Override // io.ktor.http.content.w
        public Long a() {
            return this.f295408c.a();
        }

        @Override // io.ktor.http.content.w
        public io.ktor.http.m b() {
            return this.f295408c.b();
        }

        @Override // io.ktor.http.content.w
        public v0 c() {
            return this.f295407b;
        }

        @Override // io.ktor.http.content.w
        public l1 e() {
            return this.f295408c.e();
        }

        @Override // io.ktor.http.content.w.e
        public io.ktor.utils.io.h h() {
            return ((w.e) this.f295408c).h();
        }

        @Override // io.ktor.http.content.w.e
        public io.ktor.utils.io.h i(kotlin.ranges.n range) {
            Intrinsics.checkNotNullParameter(range, "range");
            return ((w.e) this.f295408c).i(range);
        }
    }

    public static final class c extends w.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final v0 f295409b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w f295410c;

        c(Function1<? super v0, ? extends v0> function1, w wVar) {
            this.f295410c = wVar;
            this.f295409b = function1.invoke(wVar.c());
        }

        @Override // io.ktor.http.content.w
        public Long a() {
            return this.f295410c.a();
        }

        @Override // io.ktor.http.content.w
        public io.ktor.http.m b() {
            return this.f295410c.b();
        }

        @Override // io.ktor.http.content.w
        public v0 c() {
            return this.f295409b;
        }

        @Override // io.ktor.http.content.w
        public l1 e() {
            return this.f295410c.e();
        }

        @Override // io.ktor.http.content.w.f
        public Object h(p pVar, kotlin.coroutines.d<? super Unit> dVar) {
            Object objH = ((w.f) this.f295410c).h(pVar, dVar);
            return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
        }
    }

    public static final class d extends w.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final v0 f295411b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w f295412c;

        d(Function1<? super v0, ? extends v0> function1, w wVar) {
            this.f295412c = wVar;
            this.f295411b = function1.invoke(wVar.c());
        }

        @Override // io.ktor.http.content.w
        public Long a() {
            return this.f295412c.a();
        }

        @Override // io.ktor.http.content.w
        public io.ktor.http.m b() {
            return this.f295412c.b();
        }

        @Override // io.ktor.http.content.w
        public v0 c() {
            return this.f295411b;
        }

        @Override // io.ktor.http.content.w
        public l1 e() {
            return this.f295412c.e();
        }

        @Override // io.ktor.http.content.w.a
        public byte[] h() {
            return ((w.a) this.f295412c).h();
        }
    }

    public static final class e extends w.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final v0 f295413b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w f295414c;

        e(Function1<? super v0, ? extends v0> function1, w wVar) {
            this.f295414c = wVar;
            this.f295413b = function1.invoke(wVar.c());
        }

        @Override // io.ktor.http.content.w
        public Long a() {
            return this.f295414c.a();
        }

        @Override // io.ktor.http.content.w
        public io.ktor.http.m b() {
            return this.f295414c.b();
        }

        @Override // io.ktor.http.content.w
        public v0 c() {
            return this.f295413b;
        }

        @Override // io.ktor.http.content.w.d
        public Object h(io.ktor.utils.io.h hVar, p pVar, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, kotlin.coroutines.d<? super p2> dVar) {
            return ((w.d) this.f295414c).h(hVar, pVar, coroutineContext, coroutineContext2, dVar);
        }
    }

    @NotNull
    public static final w a(@NotNull w wVar, @NotNull Function1<? super v0, ? extends v0> block) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (wVar instanceof w.c) {
            return new a(block, wVar);
        }
        if (wVar instanceof w.e) {
            return new b(block, wVar);
        }
        if (wVar instanceof w.f) {
            return new c(block, wVar);
        }
        if (wVar instanceof w.a) {
            return new d(block, wVar);
        }
        if (wVar instanceof w.d) {
            return new e(block, wVar);
        }
        if (wVar instanceof w.b) {
            return a(((w.b) wVar).i(), block);
        }
        throw new k0();
    }
}
