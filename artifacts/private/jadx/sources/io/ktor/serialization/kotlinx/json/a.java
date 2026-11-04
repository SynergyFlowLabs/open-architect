package io.ktor.serialization.kotlinx.json;

import io.ktor.http.content.w;
import io.ktor.http.m;
import io.ktor.utils.io.k;
import io.ktor.utils.io.p;
import java.nio.charset.Charset;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.c0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.io.IoStreamsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ui.l;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements io.ktor.serialization.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Json f296450a;

    /* JADX INFO: renamed from: io.ktor.serialization.kotlinx.json.a$a, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.serialization.kotlinx.json.ExperimentalJsonConverter", f = "ExperimentalJsonConverter.kt", i = {0}, l = {51}, m = "deserialize", n = {"serializer"}, s = {"L$0"})
    static final class C2088a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f296452b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f296454d;

        C2088a(kotlin.coroutines.d<? super C2088a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296452b = obj;
            this.f296454d |= Integer.MIN_VALUE;
            return a.this.a(null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.serialization.kotlinx.json.ExperimentalJsonConverter$serialize$2", f = "ExperimentalJsonConverter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements Function2<p, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f296455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f296456b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.io.b f296457c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlinx.io.b bVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f296457c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f296457c, dVar);
            bVar.f296456b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f296455a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            ((p) this.f296456b).i().la(this.f296457c);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p pVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(pVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public a(@NotNull Json format) {
        Intrinsics.checkNotNullParameter(format, "format");
        this.f296450a = format;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // io.ktor.serialization.d
    @Nullable
    public Object a(@NotNull Charset charset, @NotNull ri.b bVar, @NotNull io.ktor.utils.io.h hVar, @NotNull kotlin.coroutines.d<Object> dVar) throws Throwable {
        C2088a c2088a;
        KSerializer<?> kSerializer;
        if (dVar instanceof C2088a) {
            c2088a = (C2088a) dVar;
            int i10 = c2088a.f296454d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2088a.f296454d = i10 - Integer.MIN_VALUE;
            } else {
                c2088a = new C2088a(dVar);
            }
        } else {
            c2088a = new C2088a(dVar);
        }
        Object objI = c2088a.f296452b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c2088a.f296454d;
        if (i11 == 0) {
            ResultKt.m(objI);
            KSerializer<?> kSerializerD = io.ktor.serialization.kotlinx.h.d(this.f296450a.getSerializersModule(), bVar);
            c2088a.f296451a = kSerializerD;
            c2088a.f296454d = 1;
            objI = k.I(hVar, c2088a);
            if (objI == objL) {
                return objL;
            }
            kSerializer = kSerializerD;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kSerializer = (KSerializer) c2088a.f296451a;
            ResultKt.m(objI);
        }
        try {
            return IoStreamsKt.decodeFromSource(this.f296450a, kSerializer, (c0) objI);
        } catch (Throwable th2) {
            throw new io.ktor.serialization.f("Illegal input: " + th2.getMessage(), th2);
        }
    }

    @Override // io.ktor.serialization.d
    @Nullable
    public Object b(@NotNull m mVar, @NotNull Charset charset, @NotNull ri.b bVar, @Nullable Object obj, @NotNull kotlin.coroutines.d<? super w> dVar) {
        KSerializer<?> kSerializerB;
        try {
            kSerializerB = io.ktor.serialization.kotlinx.h.d(this.f296450a.getSerializersModule(), bVar);
        } catch (kotlinx.serialization.c0 unused) {
            kSerializerB = io.ktor.serialization.kotlinx.h.b(obj, this.f296450a.getSerializersModule());
        }
        kotlinx.io.b bVar2 = new kotlinx.io.b();
        Json json = this.f296450a;
        Intrinsics.checkNotNull(kSerializerB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
        IoStreamsKt.encodeToSink(json, kSerializerB, obj, bVar2);
        return new io.ktor.http.content.f(new b(bVar2, null), mVar, null, kotlin.coroutines.jvm.internal.b.g(l.j(bVar2)), 4, null);
    }
}
